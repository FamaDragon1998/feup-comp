package antlr4;

// Generated from JjQuery.g4 by ANTLR 4.4
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
		RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int T__1 = 1, T__0 = 2, ID = 3, INT = 4, OP = 5,
			JQUERYBLOCKSTART = 6, JQUERYBLOCKEND = 7, ASSIGN = 8, DOLLAR = 9,
			OPEN_PARENTHESES = 10, CLOSE_PARENTHESES = 11, OPEN_BRACKET = 12,
			CLOSE_BRACKET = 13, QUOTES = 14, APOSTROPHE = 15, SEMICOLON = 16,
			NEWLINE = 17, SINGLE_LINE_COMMENT = 18, MULTI_LINE_COMMENT = 19,
			WS = 20;
	public static String[] modeNames = { "DEFAULT_MODE" };

	public static final String[] tokenNames = { "'\\u0000'", "'\\u0001'",
			"'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", "'\\u0006'",
			"'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", "'\r'",
			"'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'",
			"'\\u0013'", "'\\u0014'" };
	public static final String[] ruleNames = { "T__1", "T__0", "ID", "INT",
			"OP", "JQUERYBLOCKSTART", "JQUERYBLOCKEND", "ASSIGN", "DOLLAR",
			"OPEN_PARENTHESES", "CLOSE_PARENTHESES", "OPEN_BRACKET",
			"CLOSE_BRACKET", "QUOTES", "APOSTROPHE", "SEMICOLON", "NEWLINE",
			"SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", "WS" };

	public JjQueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this, _ATN, _decisionToDFA,
				_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() {
		return "JjQuery.g4";
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

	public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26\u0093\b\1\4\2"
			+ "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"
			+ "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"
			+ "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3"
			+ "\4\7\4\65\n\4\f\4\16\48\13\4\3\5\6\5;\n\5\r\5\16\5<\3\6\3\6\3\6\3\6\3"
			+ "\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6K\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\5"
			+ "\bT\n\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"
			+ "\3\17\3\17\3\20\3\20\3\21\3\21\3\22\5\22l\n\22\3\22\3\22\3\23\3\23\3\23"
			+ "\3\23\7\23t\n\23\f\23\16\23w\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"
			+ "\3\24\3\24\7\24\u0082\n\24\f\24\16\24\u0085\13\24\3\24\3\24\5\24\u0089"
			+ "\n\24\3\24\3\24\3\25\6\25\u008e\n\25\r\25\16\25\u008f\3\25\3\25\3\u0083"
			+ "\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"
			+ "\20\37\21!\22#\23%\24\'\25)\26\3\2\b\4\2C\\c|\5\2\62;C\\c|\3\2\62;\4\2"
			+ "\f\f\17\17\6\2))BBSSll\5\2\13\f\17\17\"\"\u009f\2\3\3\2\2\2\2\5\3\2\2"
			+ "\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"
			+ "\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"
			+ "\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"
			+ "\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5.\3\2\2\2\7\62\3\2\2\2\t:\3\2\2\2\13J\3"
			+ "\2\2\2\rL\3\2\2\2\17S\3\2\2\2\21X\3\2\2\2\23Z\3\2\2\2\25\\\3\2\2\2\27"
			+ "^\3\2\2\2\31`\3\2\2\2\33b\3\2\2\2\35d\3\2\2\2\37f\3\2\2\2!h\3\2\2\2#k"
			+ "\3\2\2\2%o\3\2\2\2\'\u0088\3\2\2\2)\u008d\3\2\2\2+,\7k\2\2,-\7p\2\2-\4"
			+ "\3\2\2\2./\7q\2\2/\60\7w\2\2\60\61\7v\2\2\61\6\3\2\2\2\62\66\t\2\2\2\63"
			+ "\65\t\3\2\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\b"
			+ "\3\2\2\28\66\3\2\2\29;\t\4\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2"
			+ "=\n\3\2\2\2>?\7,\2\2?K\7?\2\2@A\7~\2\2AK\7?\2\2BC\7\u0080\2\2CK\7?\2\2"
			+ "DE\7&\2\2EK\7?\2\2FG\7#\2\2GK\7?\2\2HI\7`\2\2IK\7?\2\2J>\3\2\2\2J@\3\2"
			+ "\2\2JB\3\2\2\2JD\3\2\2\2JF\3\2\2\2JH\3\2\2\2K\f\3\2\2\2LM\7\61\2\2MN\7"
			+ ",\2\2NO\7B\2\2OP\7l\2\2PQ\7S\2\2Q\16\3\2\2\2RT\5#\22\2SR\3\2\2\2ST\3\2"
			+ "\2\2TU\3\2\2\2UV\7,\2\2VW\7\61\2\2W\20\3\2\2\2XY\7?\2\2Y\22\3\2\2\2Z["
			+ "\7&\2\2[\24\3\2\2\2\\]\7*\2\2]\26\3\2\2\2^_\7+\2\2_\30\3\2\2\2`a\7]\2"
			+ "\2a\32\3\2\2\2bc\7_\2\2c\34\3\2\2\2de\7$\2\2e\36\3\2\2\2fg\7)\2\2g \3"
			+ "\2\2\2hi\7=\2\2i\"\3\2\2\2jl\7\17\2\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn"
			+ "\7\f\2\2n$\3\2\2\2op\7\61\2\2pq\7\61\2\2qu\3\2\2\2rt\n\5\2\2sr\3\2\2\2"
			+ "tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v&\3\2\2\2wu\3\2\2\2xy\7\61\2\2yz\7,\2\2"
			+ "z{\7,\2\2{\u0089\7\61\2\2|}\7\61\2\2}~\7,\2\2~\177\3\2\2\2\177\u0083\n"
			+ "\6\2\2\u0080\u0082\13\2\2\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083"
			+ "\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2"
			+ "\2\2\u0086\u0087\7,\2\2\u0087\u0089\7\61\2\2\u0088x\3\2\2\2\u0088|\3\2"
			+ "\2\2\u0089\u008a\3\2\2\2\u008a\u008b\b\24\2\2\u008b(\3\2\2\2\u008c\u008e"
			+ "\t\7\2\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f"
			+ "\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\b\25\2\2\u0092*\3\2\2\2"
			+ "\f\2\66<JSku\u0083\u0088\u008f\3\b\2\2";
	public static final ATN _ATN = new ATNDeserializer()
			.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}