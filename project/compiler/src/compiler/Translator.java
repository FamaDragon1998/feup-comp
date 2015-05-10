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

	/** Translate to // jQuery block was here */
	@Override
	public void enterJQuery(@NotNull JjQueryParser.JQueryContext ctx) {
		outputStream.print("// jQuery block was here");
	}

	@Override
	public void enterJava(@NotNull JjQueryParser.JavaContext ctx) {
		outputStream.print(ctx.getText());
	}

}
