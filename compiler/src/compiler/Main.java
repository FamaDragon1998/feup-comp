package compiler;

import java.io.FileInputStream;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import antlr4.JjQueryLexer;
import antlr4.JjQueryParser;

public class Main {

	public static void main(String[] args) throws Exception {
		String inputFile = "test/Test.java";

		/*
		if (args.length > 0) {
			inputFile = args[0];
			System.out.println("Input: " + inputFile);
		} else {
			System.out.println("Error: specify input file");
			return;
		}
		*/

		InputStream is = System.in;
		if (inputFile != null)
			is = new FileInputStream(inputFile);

		ANTLRInputStream input = new ANTLRInputStream(is);
		JjQueryLexer lexer = new JjQueryLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		JjQueryParser parser = new JjQueryParser(tokens);
		ParseTree tree = parser.main(); // parse; start at prog

		System.out.println(tree.toStringTree(parser)); // print tree as text
	}

}
