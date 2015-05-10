package compiler;

import grammar.JjQueryParser;
import grammar.JjQueryParserBaseListener;

import java.io.PrintWriter;

import org.antlr.v4.runtime.misc.NotNull;

public class Translator extends JjQueryParserBaseListener {

	private PrintWriter outputStream;

	public Translator(PrintWriter writer) {
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

	@Override
	public void enterIn(@NotNull JjQueryParser.InContext ctx) {
		outputStream.println("// in");
		outputStream.println();
	}

	@Override
	public void enterOut(@NotNull JjQueryParser.OutContext ctx) {
		outputStream.println("// out");
		outputStream.println();
	}

	String out, in, attribute;

	@Override
	public void enterAssign(@NotNull JjQueryParser.AssignContext ctx) {
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
	public void exitAssign(@NotNull JjQueryParser.AssignContext ctx) {
		// ... )
		outputStream.println(")");

		// selected.add(library.get(i).isbn);
		outputStream
				.println(out + ".add(" + in + ".get(i)." + attribute + ");");

		outputStream.println();
	}

	@Override
	public void enterSelector(@NotNull JjQueryParser.SelectorContext ctx) {
		switch (ctx.OP().getText()) {
		/*
		 * Selects elements that have the specified attribute with a value
		 * containing a given substring.
		 */
		case "*=":
			String attr = ctx.ID(0).toString();
			String substr = ctx.ID(1).toString();

			// ... title.toLowerCase().contains("compiler") ...
			outputStream.print(attr + ".toLowerCase().contains(\""
					+ substr.toLowerCase() + "\")");

			break;

		/*
		 * Selects elements that have the specified attribute with a value
		 * ending exactly with a given string. The comparison is case sensitive.
		 */
		case "$=":
			break;

		/*
		 * Selects elements that have the specified attribute with a value
		 * exactly equal to a certain value.
		 */
		case "=":
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
			break;

		default:
			break;
		}
	}

}
