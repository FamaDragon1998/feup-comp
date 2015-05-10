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

	@Override
	public void enterAssign(@NotNull JjQueryParser.AssignContext ctx) {
		System.out.println(ctx.toStringTree());

		String out = ctx.ID(0).getText();
		String in = ctx.ID(1).getText();
		String attribute = ctx.ID(2).getText();

		outputStream.println("// " + ctx.getText());

		// for (int i = 0; i < library.size(); i++) {
		outputStream.println("for (int i = 0; i < " + in + ".size(); i++) {");

		outputStream.println("if (" + in + ".get(i)) {");

		outputStream
				.println(out + ".add(" + in + ".get(i)." + attribute + ");");

		outputStream.println("}");
	}

	@Override
	public void exitAssign(@NotNull JjQueryParser.AssignContext ctx) {
		outputStream.println("}");
		outputStream.println();
	}

	@Override
	public void enterSelector(@NotNull JjQueryParser.SelectorContext ctx) {
		switch (ctx.OP().getText()) {
		case "*=":
			System.out
					.println("attribute with value containing a given substring");

			String attribute = ctx.ID(0).toString();
			String substr = ctx.ID(1).toString();

			// outputStream.println(attribute);

			System.out.println("'" + substr
					+ "' must be a substring of the value of the attribute '"
					+ attribute + "'");
			break;

		case "$=":
			System.out
					.println("elements that have the specified attribute with a value ending exactly with a given string. The comparison is case sensitive");
			break;

		case "=":
			System.out
					.println("elements that have the specified attribute with a value exactly equal to a certain value");
			break;

		case "!=":
			System.out
					.println("elements that either don’t have the specified attribute, or do have the specified attribute but not with a certain value");
			break;

		case "^=":
			System.out
					.println("elements that have the specified attribute with a value beginning exactly with a given string");
			break;

		default:
			break;
		}
	}

}
