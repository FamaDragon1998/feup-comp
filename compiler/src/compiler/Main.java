package compiler;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintWriter;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import antlr4.JjQueryLexer;
import antlr4.JjQueryParser;

public class Main {

	public static void main(String[] args) throws Exception {
		String inputFile = "test/Input.java";
		String outputFile = "test/Output.java";

		/*
		 * if (args.length > 0) { inputFile = args[0];
		 * System.out.println("Input: " + inputFile); } else {
		 * System.out.println("Error: specify input file"); return; }
		 */

		InputStream is = System.in;
		if (inputFile != null)
			is = new FileInputStream(inputFile);
		ANTLRInputStream input = new ANTLRInputStream(is);
		
		JjQueryLexer lexer = new JjQueryLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		JjQueryParser parser = new JjQueryParser(tokens);
		ParseTree tree = parser.main();

		ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
		MyListener extractor = new MyListener(parser);
		walker.walk(extractor, tree); // initiate walk of tree with listener
		
		System.out.println(tree.toStringTree(parser));

		PrintWriter writer = new PrintWriter(outputFile, "UTF-8");

		for (int i = 0; i < tree.getChildCount(); i++) {
			for (int j = 0; j < tree.getChild(i).getChildCount(); j++)
				writer.println(tree.getChild(i).getChild(j).toString());
		}

		writer.close();
	}

}
