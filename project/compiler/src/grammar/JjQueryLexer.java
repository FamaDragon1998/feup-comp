package grammar;

// Generated from JjQueryLexer.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class JjQueryLexer extends Lexer {
	static {
		// RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int WHITESPACE_CHANNEL = 1, COMMENTS_CHANNEL = 2,
			JAVA = 3, JQBegin = 4, JQEnd = 5, IN = 6, OUT = 7, ID = 8,
			QUOTES = 9, APOSTROPHE = 10, SEMICOLON = 11, DOLLAR = 12, OP = 13,
			OPEN_PARENTHESIS = 14, CLOSE_PARENTHESIS = 15, OPEN_BRACKET = 16,
			CLOSE_BRACKET = 17, WS = 18, SINGLE_LINE_COMMENT = 19;
	public static final int JQUERY = 1;
	public static String[] modeNames = { "DEFAULT_MODE", "JQUERY" };

	public static final String[] tokenNames = { "'\\u0000'", "'\\u0001'",
			"'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", "'\\u0006'",
			"'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", "'\r'",
			"'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'",
			"'\\u0013'" };
	public static final String[] ruleNames = { "JAVA", "JQBegin", "JQEnd",
			"IN", "OUT", "ID", "QUOTES", "APOSTROPHE", "SEMICOLON", "DOLLAR",
			"OP", "OPEN_PARENTHESIS", "CLOSE_PARENTHESIS", "OPEN_BRACKET",
			"CLOSE_BRACKET", "WS", "SINGLE_LINE_COMMENT" };

	public JjQueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this, _ATN, _decisionToDFA,
				_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() {
		return "JjQueryLexer.g4";
	}

	@Override
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public String[] getModeNames() {
		return modeNames;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25v\b\1\b\1\4\2\t"
			+ "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"
			+ "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"
			+ "\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"
			+ "\5\3\6\3\6\3\6\3\6\3\7\3\7\7\7?\n\7\f\7\16\7B\13\7\3\b\3\b\3\t\3\t\3\n"
			+ "\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"
			+ "Y\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\6\21d\n\21\r\21\16\21"
			+ "e\3\21\3\21\3\22\3\22\3\22\3\22\7\22n\n\22\f\22\16\22q\13\22\3\22\3\22"
			+ "\3\22\3\22\3o\2\23\4\5\6\6\b\7\n\b\f\t\16\n\20\13\22\f\24\r\26\16\30\17"
			+ "\32\20\34\21\36\22 \23\"\24$\25\4\2\3\5\5\2C\\aac|\6\2\62;C\\aac|\5\2"
			+ "\13\f\17\17\"\"}\2\4\3\2\2\2\2\6\3\2\2\2\3\b\3\2\2\2\3\n\3\2\2\2\3\f\3"
			+ "\2\2\2\3\16\3\2\2\2\3\20\3\2\2\2\3\22\3\2\2\2\3\24\3\2\2\2\3\26\3\2\2"
			+ "\2\3\30\3\2\2\2\3\32\3\2\2\2\3\34\3\2\2\2\3\36\3\2\2\2\3 \3\2\2\2\3\""
			+ "\3\2\2\2\3$\3\2\2\2\4&\3\2\2\2\6(\3\2\2\2\b\60\3\2\2\2\n\65\3\2\2\2\f"
			+ "8\3\2\2\2\16<\3\2\2\2\20C\3\2\2\2\22E\3\2\2\2\24G\3\2\2\2\26I\3\2\2\2"
			+ "\30X\3\2\2\2\32Z\3\2\2\2\34\\\3\2\2\2\36^\3\2\2\2 `\3\2\2\2\"c\3\2\2\2"
			+ "$i\3\2\2\2&\'\13\2\2\2\'\5\3\2\2\2()\7\61\2\2)*\7,\2\2*+\7B\2\2+,\7l\2"
			+ "\2,-\7S\2\2-.\3\2\2\2./\b\3\2\2/\7\3\2\2\2\60\61\7,\2\2\61\62\7\61\2\2"
			+ "\62\63\3\2\2\2\63\64\b\4\3\2\64\t\3\2\2\2\65\66\7k\2\2\66\67\7p\2\2\67"
			+ "\13\3\2\2\289\7q\2\29:\7w\2\2:;\7v\2\2;\r\3\2\2\2<@\t\2\2\2=?\t\3\2\2"
			+ ">=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\17\3\2\2\2B@\3\2\2\2CD\7$\2"
			+ "\2D\21\3\2\2\2EF\7)\2\2F\23\3\2\2\2GH\7=\2\2H\25\3\2\2\2IJ\7&\2\2J\27"
			+ "\3\2\2\2KL\7~\2\2LY\7?\2\2MN\7,\2\2NY\7?\2\2OP\7\u0080\2\2PY\7?\2\2QR"
			+ "\7&\2\2RY\7?\2\2SY\7?\2\2TU\7#\2\2UY\7?\2\2VW\7`\2\2WY\7?\2\2XK\3\2\2"
			+ "\2XM\3\2\2\2XO\3\2\2\2XQ\3\2\2\2XS\3\2\2\2XT\3\2\2\2XV\3\2\2\2Y\31\3\2"
			+ "\2\2Z[\7*\2\2[\33\3\2\2\2\\]\7+\2\2]\35\3\2\2\2^_\7]\2\2_\37\3\2\2\2`"
			+ "a\7_\2\2a!\3\2\2\2bd\t\4\2\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2f"
			+ "g\3\2\2\2gh\b\21\4\2h#\3\2\2\2ij\7\61\2\2jk\7\61\2\2ko\3\2\2\2ln\13\2"
			+ "\2\2ml\3\2\2\2nq\3\2\2\2op\3\2\2\2om\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7\f"
			+ "\2\2st\3\2\2\2tu\b\22\5\2u%\3\2\2\2\b\2\3@Xeo\6\7\3\2\6\2\2\2\3\2\2\4"
			+ "\2";
	public static final ATN _ATN = new ATNDeserializer()
			.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}