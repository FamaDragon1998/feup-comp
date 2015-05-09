package compiler;

import grammar.JjQueryLexer;
import grammar.JjQueryParser;

import java.io.FileInputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {

	private static final String INPUT = "../test-input/Main.java";

	public static void main(String[] args) throws Exception {
		FileInputStream stream = new FileInputStream(INPUT);
		ANTLRInputStream input = new ANTLRInputStream(stream);

		// create a lexer that feeds off of input CharStream
		JjQueryLexer lexer = new JjQueryLexer(input);

		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// create a parser that feeds off the tokens buffer
		JjQueryParser parser = new JjQueryParser(tokens);

		ParseTree tree = parser.src(); // begin parsing at src rule

		System.out.println(tree.toStringTree(parser)); // print LISP-style tree

		// Create a generic parse tree walker that can trigger callbacks
		ParseTreeWalker walker = new ParseTreeWalker();

		// Walk the tree created during the parse, trigger callbacks
		walker.walk(new Translator(), tree);

		System.out.println(); // print a \n after translation
	}

}
