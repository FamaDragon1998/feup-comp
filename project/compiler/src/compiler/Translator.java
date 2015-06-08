package compiler;

import ir.IntermediateRepresentation;

import java.util.List;

import grammar.JjQueryLexer;
import grammar.JjQueryParser;
import grammar.JjQueryParser.FieldModifierContext;
import grammar.JjQueryParser.VariableDeclaratorContext;
import grammar.JjQueryParser.VariableDeclaratorListContext;
import grammar.JjQueryParserBaseListener;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.misc.NotNull;

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
		System.out.println("DBG: " + ctx.getText());

		for (FieldModifierContext fmc : ctx.fieldModifier())
			System.out.println("MODIFIER: " + fmc.getText());

		System.out.println("TYPE: " + ctx.unannType().getText());

		VariableDeclaratorListContext vdlc = ctx.variableDeclaratorList();
		for (VariableDeclaratorContext vdc : vdlc.variableDeclarator())
			System.out.println("VAR: " + vdc.getText());

		System.out.println();
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
	public void enterAssign(@NotNull JjQueryParser.AssignContext ctx) {
		initIndentationAndTranslation(ctx);

		// semantic analysis
		if (!ctx.OP().getText().equals("="))
			System.err.println("Expecting '=' on assignment, line "
					+ ctx.getStart().getLine());

		// translation
		translation += "// " + ctx.getText() + "\n";

		// TODO semantic analysis on these variables
		// initialize variables content
		out = ctx.ID(0).getText();
		in = ctx.ID(1).getText();
		attribute = ctx.ID(2).getText();

		// for (int i = 0; i < library.size(); i++) {
		translation += indentation;
		translation += "for (int i = 0; i < " + in + ".size(); i++)" + "\n";

		// if (library.get(i). ...
		translation += indentation + "\t";
		translation += "if (" + in + ".get(i).";
	}

	@Override
	public void enterAttributeSelector(
			@NotNull JjQueryParser.AttributeSelectorContext ctx) {
		String attribute = ctx.ID(0).toString();
		String value = ctx.ID(1).toString();

		rewriteSelector(ctx.OP().getText(), attribute, value);
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
