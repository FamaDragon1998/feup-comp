package compiler;

import grammar.JjQueryLexer;
import grammar.JjQueryParser;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import utils.Log;

public class Main {

	private static String inputFile;
	private static String outputFile;

	public static void main(String[] args) throws Exception {
		if (args.length != 2)
			Log.error("Usage: Main.jar <input file> <output file>");
		else {
			inputFile = args[0];
			outputFile = args[1];

			FileInputStream stream = new FileInputStream(inputFile);
			ANTLRInputStream input = new ANTLRInputStream(stream);

			// create a lexer that feeds off of input CharStream
			JjQueryLexer lexer = new JjQueryLexer(input);

			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);

			// create a parser that feeds off the tokens buffer
			JjQueryParser parser = new JjQueryParser(tokens);

			ParseTree tree = parser.compilationUnit(); // begin parsing at init
														// rule

			// System.out.println(tree.toStringTree(parser)); // print tree

			// Create a generic parse tree walker that can trigger callbacks
			ParseTreeWalker walker = new ParseTreeWalker();

			Translator translator = new Translator(tokens);

			// Walk the tree created during the parse, trigger callbacks
			walker.walk(translator, tree);

			// create output folder if it does not exist
			File file = new File(outputFile);
			if (file.getParentFile() != null)
				file.getParentFile().mkdirs();

			PrintWriter writer = new PrintWriter(outputFile, "UTF-8");
			writer.print(translator.rewriter.getText());
			writer.close();

			Log.info("Translation finished");
		}

		Log.printStats();
	}

}
