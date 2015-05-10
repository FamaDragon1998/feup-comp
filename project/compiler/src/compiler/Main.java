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

public class Main {

	private static final String INPUT = "../test-input/Main.java";
	private static final String OUTPUT = "test/Main.java";

	public static void main(String[] args) throws Exception {
		FileInputStream stream = new FileInputStream(INPUT);
		ANTLRInputStream input = new ANTLRInputStream(stream);

		// create a lexer that feeds off of input CharStream
		JjQueryLexer lexer = new JjQueryLexer(input);

		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// create a parser that feeds off the tokens buffer
		JjQueryParser parser = new JjQueryParser(tokens);

		ParseTree tree = parser.init(); // begin parsing at init rule

		System.out.println(tree.toStringTree(parser)); // print LISP-style tree

		// Create a generic parse tree walker that can trigger callbacks
		ParseTreeWalker walker = new ParseTreeWalker();

		File file = new File(OUTPUT);
		file.getParentFile().mkdirs();

		PrintWriter writer = new PrintWriter(OUTPUT, "UTF-8");

		// Walk the tree created during the parse, trigger callbacks
		walker.walk(new Translator(writer), tree);

		writer.close();
	}

}
