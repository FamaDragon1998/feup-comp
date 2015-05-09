package compiler;

import org.antlr.v4.runtime.misc.NotNull;

import grammar.JjQueryParser;
import grammar.JjQueryParserBaseListener;

public class Translator extends JjQueryParserBaseListener {

	/** Translate to // jQuery block was here */
	@Override
	public void enterJQuery(@NotNull JjQueryParser.JQueryContext ctx) {
		System.out.println("// jQuery block was here");
	}

}
