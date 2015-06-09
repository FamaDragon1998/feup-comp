package compiler;

import grammar.JjQueryLexer;
import grammar.JjQueryParser;
import grammar.JjQueryParserBaseListener;

import java.io.PrintWriter;
import java.util.List;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.NotNull;

public class Translator extends JjQueryParserBaseListener {

	private BufferedTokenStream tokens;
	private PrintWriter outputStream;

	public Translator(BufferedTokenStream tokens, PrintWriter writer) {
		this.tokens = tokens;
		this.outputStream = writer;
	}

	@Override
	public void enterJava(@NotNull JjQueryParser.JavaContext ctx) {
		outputStream.print(ctx.getText());
	}

	@Override
	public void enterJQuery(@NotNull JjQueryParser.JQueryContext ctx) {
		outputStream.println("// --- BEGIN --- jQuery block");
		outputStream.println();
	}

	@Override
	public void exitJQuery(@NotNull JjQueryParser.JQueryContext ctx) {
		outputStream.print("// --- END --- jQuery block");
	}

	private String in;

	@Override
	public void enterIn(@NotNull JjQueryParser.InContext ctx) {
		List<Token> commentsChannel = tokens.getHiddenTokensToRight(ctx
				.getStop().getTokenIndex(), JjQueryLexer.COMMENTS_CHANNEL);

		if (commentsChannel != null)
			for (Token token : commentsChannel)
				outputStream.print(token.getText());

		outputStream.println("// " + ctx.getText());
		outputStream.println();
	}

	private String out;

	@Override
	public void enterOut(@NotNull JjQueryParser.OutContext ctx) {
		List<Token> commentsChannel = tokens.getHiddenTokensToRight(ctx
				.getStop().getTokenIndex(), JjQueryLexer.COMMENTS_CHANNEL);

		if (commentsChannel != null)
			for (Token token : commentsChannel)
				outputStream.print(token.getText());

		outputStream.println("// " + ctx.getText());
		outputStream.println();
	}

	private String attribute;

	@Override
	public void enterAssign(@NotNull JjQueryParser.AssignContext ctx) {
		// semantic analysis
		if (!ctx.OP().getText().equals("="))
			System.err.println("Expecting '=' on assignment, line "
					+ ctx.getStart().getLine());

		// translation
		outputStream.println("// " + ctx.getText());

		out = ctx.ID(0).getText();
		in = ctx.ID(1).getText();
		attribute = ctx.ID(2).getText();

		// for (int i = 0; i < library.size(); i++) {
		outputStream.println("for (int i = 0; i < " + in + ".size(); i++)");

		// if (library.get(i). ...
		outputStream.print("if (" + in + ".get(i).");
	}

	@Override
	public void enterSelector(@NotNull JjQueryParser.SelectorContext ctx) {
		String attr = ctx.ID(0).toString();
		String substr = ctx.ID(1).toString();

		switch (ctx.OP().getText()) {
		/*
		 * Selects elements that have the specified attribute with a value
		 * containing a given substring.
		 */
		case "*=":
			// ... title.toLowerCase().contains("compiler") ...
			outputStream.print(attr + ".toLowerCase().contains(\""
					+ substr.toLowerCase() + "\")");
			break;

		/*
		 * Selects elements that have the specified attribute with a value
		 * ending exactly with a given string. The comparison is case sensitive.
		 */
		case "$=":
			// ... title.endsWith("compiler") ...
			outputStream.print(attr + ".endsWith(\"" + substr + "\")");
			break;

		/*
		 * Selects elements that have the specified attribute with a value
		 * exactly equal to a certain value.
		 */
		case "=":
			// ... title.toLowerCase().equals("compiler") ...
			outputStream.print(attr + ".toLowerCase().equals(\""
					+ substr.toLowerCase() + "\")");
			break;

		/*
		 * Select elements that either don’t have the specified attribute, or do
		 * have the specified attribute but not with a certain value.
		 */
		case "!=":
			break;

		/*
		 * Selects elements that have the specified attribute with a value
		 * beginning exactly with a given string.
		 */
		case "^=":
			// ... title.toLowerCase().startsWith("compiler") ...
			outputStream.print(attr + ".toLowerCase().startsWith(\""
					+ substr.toLowerCase() + "\")");
			break;

		default:
			break;
		}
	}

	@Override
	public void exitAssign(@NotNull JjQueryParser.AssignContext ctx) {
		// ... )
		outputStream.println(")");

		// selected.add(library.get(i).isbn);
		outputStream
				.println(out + ".add(" + in + ".get(i)." + attribute + ");");

		outputStream.println();
	}

}
