package compiler;

import grammar.JjQueryLexer;
import grammar.JjQueryParser;
import grammar.JjQueryParser.FieldModifierContext;
import grammar.JjQueryParser.MethodModifierContext;
import grammar.JjQueryParser.VariableDeclaratorContext;
import grammar.JjQueryParser.VariableDeclaratorListContext;
import grammar.JjQueryParserBaseListener;
import ir.IntermediateRepresentation;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;

import utils.Log;

public class Translator extends JjQueryParserBaseListener {

	BufferedTokenStream tokens;
	TokenStreamRewriter rewriter;
	IntermediateRepresentation ir;

	public String currentClass;

	public int currentLine;

	public Translator(BufferedTokenStream tokens) {
		this.tokens = tokens;
		rewriter = new TokenStreamRewriter(tokens);
		ir = new IntermediateRepresentation(this);

		currentClass = "";
	}

	@Override
	public void enterEveryRule(org.antlr.v4.runtime.ParserRuleContext ctx) {
		currentLine = ctx.getStart().getLine();
	};

	@Override
	public void enterNormalClassDeclaration(
			@NotNull JjQueryParser.NormalClassDeclarationContext ctx) {
		for (int i = 0; i < ctx.getChildCount(); i++) {
			if (ctx.getChild(i).getText().equals("class")) {
				currentClass = ctx.getChild(i + 1).getText();
				break;
			}
		}

		if (currentClass.isEmpty())
			Log.error("Unexpected error while parsing class name");

		Log.info("Traversing class " + currentClass);
	}

	@Override
	public void exitNormalClassDeclaration(
			@NotNull JjQueryParser.NormalClassDeclarationContext ctx) {
		currentClass = "";
	}

	// save fields to IR

	@Override
	public void enterFieldDeclaration(
			@NotNull JjQueryParser.FieldDeclarationContext ctx) {
		// save modifiers as Strings to an array
		ArrayList<String> modifiers = new ArrayList<String>();
		for (FieldModifierContext fmc : ctx.fieldModifier())
			modifiers.add(fmc.getText());

		// save field type as a String as well
		String type = ctx.unannType().getText();

		// add each field to the intermediate representation
		VariableDeclaratorListContext vdlc = ctx.variableDeclaratorList();
		for (VariableDeclaratorContext vdc : vdlc.variableDeclarator())
			ir.addField(currentClass, modifiers, type, vdc.getText());
	}

	// save methods to IR

	@Override
	public void enterMethodDeclaration(
			@NotNull JjQueryParser.MethodDeclarationContext ctx) {
		// save modifiers as Strings to an array
		ArrayList<String> modifiers = new ArrayList<String>();
		for (MethodModifierContext mmc : ctx.methodModifier())
			modifiers.add(mmc.getText());

		String result = ctx.methodHeader().result().getText();

		ir.addMethod(currentClass, modifiers, result, ctx.methodHeader()
				.methodDeclarator().getText());
	}

	@Override
	public void enterLocalVariableDeclaration(
			@NotNull JjQueryParser.LocalVariableDeclarationContext ctx) {
		String type = ctx.unannType().getText();

		VariableDeclaratorListContext vdlc = ctx.variableDeclaratorList();
		for (VariableDeclaratorContext vdc : vdlc.variableDeclarator())
			ir.addLocalVariable(type, vdc.variableDeclaratorId().getText());
	}

	@Override
	public void exitMethodDeclaration(
			@NotNull JjQueryParser.MethodDeclarationContext ctx) {
		Log.info("Clearing local variables intermediate representation");
		ir.locals.clear();
	}

	//
	// --- JQUERY ---
	//

	@Override
	public void enterJQuery(@NotNull JjQueryParser.JQueryContext ctx) {
		rewriter.replace(ctx.getStart(), "// --- BEGIN --- jQuery block");
	}

	@Override
	public void exitJQuery(@NotNull JjQueryParser.JQueryContext ctx) {
		rewriter.replace(ctx.getStop(), "// --- END --- jQuery block");
	}

	private String indentation, translation, out, in, fieldOrMethod, value;

	@Override
	public void enterAssign(@NotNull JjQueryParser.AssignContext ctx) {
		initIndentationAndTranslation(ctx);

		// semantic analysis
		if (!ctx.OP().getText().equals("="))
			Log.error("Expecting '=' on assignment, line " + currentLine);

		// translation
		translation += "// " + ctx.getText() + "\n";

		// initialize variables content
		out = ctx.ID().getText();
		ir.assertField(out);
		ir.assertVisibleField(out);
	}

	private void initIndentationAndTranslation(JjQueryParser.AssignContext ctx) {
		indentation = "";
		translation = "";

		// get correct indentation
		List<Token> list = tokens.getHiddenTokensToLeft(ctx.getStart()
				.getTokenIndex(), JjQueryLexer.WHITESPACE_CHANNEL);

		String rawIndentation = list.get(list.size() - 1).getText();

		for (int i = 0; i < rawIndentation.length(); i++) {
			char c = rawIndentation.charAt(i);

			if (c == '\n')
				indentation = "";
			else
				indentation += c;
		}
	}

	@Override
	public void enterCollectionFieldSelector(
			@NotNull JjQueryParser.CollectionFieldSelectorContext ctx) {
		validateAndRewriteSelector(ctx.ID(), false, ctx.OP().getText());
	}

	@Override
	public void enterCollectionMethodSelector(
			@NotNull JjQueryParser.CollectionMethodSelectorContext ctx) {
		validateAndRewriteSelector(ctx.ID(), true, ctx.OP().getText());
	}

	private void validateAndRewriteSelector(List<TerminalNode> id,
			boolean isMethod, String operator) {
		in = id.get(0).getText();
		ir.assertField(in);
		ir.assertVisibleField(in);

		fieldOrMethod = id.get(1).getText() + (isMethod ? "()" : "");
		if (isMethod) {
			ir.assertMethod(fieldOrMethod);
			ir.assertVisibleMethod(fieldOrMethod);
		} else {
			ir.assertField(fieldOrMethod);
			ir.assertVisibleField(fieldOrMethod);
		}

		value = id.get(2).getText();

		rewriteSelector(operator);
	}

	private void rewriteSelector(String operator) {
		// for (int i = 0; i < library.size(); i++) {
		translation += indentation;
		translation += "for (int i = 0; i < " + in + ".size(); i++)" + "\n";

		// if (library.get(i). ...
		translation += indentation + "\t";
		translation += "if (" + in + ".get(i).";

		switch (operator) {
		// Selects elements that have the specified attribute with a value
		// containing a given substring.
		case "*=":
			// ... title.toLowerCase().contains("compiler") ...
			translation += fieldOrMethod + ".toLowerCase().contains(\""
					+ value.toLowerCase() + "\")";
			break;

		// Selects elements that have the specified attribute with a value
		// ending exactly with a given string. The comparison is case sensitive.
		case "$=":
			// ... title.endsWith("compiler") ...
			translation += fieldOrMethod + ".endsWith(\"" + value + "\")";
			break;

		// Selects elements that have the specified attribute with a value
		// exactly equal to a certain value.
		case "=":
			// ... title.toLowerCase().equals("compiler") ...
			translation += fieldOrMethod + ".toLowerCase().equals(\""
					+ value.toLowerCase() + "\")";
			break;

		// Select elements that either don’t have the specified attribute, or do
		// have the specified attribute but not with a certain value.
		case "!=":
			break;

		// Selects elements that have the specified attribute with a value
		// beginning exactly with a given string.
		case "^=":
			// ... title.toLowerCase().startsWith("compiler") ...
			translation += fieldOrMethod + ".toLowerCase().startsWith(\""
					+ value.toLowerCase() + "\")";
			break;

		default:
			break;
		}

		// ... )
		translation += ")" + "\n";

		// selected.add(library.get(i));
		translation += indentation + "\t\t";
		translation += out + ".add(" + in + ".get(i));";
	}

	@Override
	public void exitAssign(@NotNull JjQueryParser.AssignContext ctx) {
		rewriter.replace(ctx.getStart(), ctx.getStop(), translation);
	}

}
