package compiler;

import grammar.JjQueryLexer;
import grammar.JjQueryParser;
import grammar.JjQueryParser.FieldModifierContext;
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

import utils.Log;

public class Translator extends JjQueryParserBaseListener {

	BufferedTokenStream tokens;
	TokenStreamRewriter rewriter;
	IntermediateRepresentation ir;

	public Translator(BufferedTokenStream tokens) {
		this.tokens = tokens;
		rewriter = new TokenStreamRewriter(tokens);
		ir = new IntermediateRepresentation();
	}

	@Override
	public void enterFieldDeclaration(
			@NotNull JjQueryParser.FieldDeclarationContext ctx) {
		ArrayList<String> modifiers = new ArrayList<String>();
		for (FieldModifierContext fmc : ctx.fieldModifier())
			modifiers.add(fmc.getText());

		String type = ctx.unannType().getText();

		VariableDeclaratorListContext vdlc = ctx.variableDeclaratorList();
		for (VariableDeclaratorContext vdc : vdlc.variableDeclarator())
			ir.addField(modifiers, type, vdc.getText());
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

	private String indentation, translation, in, out, attribute;

	@Override
	public void enterAssign(@NotNull JjQueryParser.AssignContext ctx) {
		int currentLine = ctx.getStart().getLine();

		initIndentationAndTranslation(ctx);

		// semantic analysis
		if (!ctx.OP().getText().equals("="))
			Log.error("Expecting '=' on assignment, line " + currentLine);

		// translation
		translation += "// " + ctx.getText() + "\n";

		// initialize variables content
		out = ctx.ID(0).getText();
		in = ctx.ID(1).getText();
		attribute = ctx.ID(2).getText();

		ir.assertExisting(attribute, currentLine);
		ir.assertVisible(attribute, currentLine);

		// for (int i = 0; i < library.size(); i++) {
		translation += indentation;
		translation += "for (int i = 0; i < " + in + ".size(); i++)" + "\n";

		// if (library.get(i). ...
		translation += indentation + "\t";
		translation += "if (" + in + ".get(i).";
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
	public void enterAttributeSelector(
			@NotNull JjQueryParser.AttributeSelectorContext ctx) {
		int currentLine = ctx.getStart().getLine();

		String variable = ctx.ID(0).toString();
		String value = ctx.ID(1).toString();

		ir.assertExisting(variable, currentLine);
		ir.assertVisible(variable, currentLine);

		rewriteSelector(ctx.OP().getText(), variable, value);
	}

	@Override
	public void enterMethodSelector(
			@NotNull JjQueryParser.MethodSelectorContext ctx) {
		String method = ctx.ID(0).toString() + "()";
		String value = ctx.ID(1).toString();

		rewriteSelector(ctx.OP().getText(), method, value);
	}

	private void rewriteSelector(String operator, String attributeOrMethod,
			String returnValue) {
		switch (operator) {
		// Selects elements that have the specified attribute with a value
		// containing a given substring.
		case "*=":
			// ... title.toLowerCase().contains("compiler") ...
			translation += attributeOrMethod + ".toLowerCase().contains(\""
					+ returnValue.toLowerCase() + "\")";
			break;

		// Selects elements that have the specified attribute with a value
		// ending exactly with a given string. The comparison is case sensitive.
		case "$=":
			// ... title.endsWith("compiler") ...
			translation += attributeOrMethod + ".endsWith(\"" + returnValue
					+ "\")";
			break;

		// Selects elements that have the specified attribute with a value
		// exactly equal to a certain value.
		case "=":
			// ... title.toLowerCase().equals("compiler") ...
			translation += attributeOrMethod + ".toLowerCase().equals(\""
					+ returnValue.toLowerCase() + "\")";
			break;

		// Select elements that either don’t have the specified attribute, or do
		// have the specified attribute but not with a certain value.
		case "!=":
			break;

		// Selects elements that have the specified attribute with a value
		// beginning exactly with a given string.
		case "^=":
			// ... title.toLowerCase().startsWith("compiler") ...
			translation += attributeOrMethod + ".toLowerCase().startsWith(\""
					+ returnValue.toLowerCase() + "\")";
			break;

		default:
			break;
		}
	}

	@Override
	public void exitAssign(@NotNull JjQueryParser.AssignContext ctx) {
		// ... )
		translation += ")" + "\n";

		// selected.add(library.get(i).isbn);
		translation += indentation + "\t\t";
		translation += out + ".add(" + in + ".get(i)." + attribute + ");";

		rewriter.replace(ctx.getStart(), ctx.getStop(), translation);
	}

}
