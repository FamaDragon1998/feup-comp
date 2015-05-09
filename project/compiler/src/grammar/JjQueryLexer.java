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
			QUOTES = 9, APOSTROPHE = 10, SEMICOLON = 11, EQUALS = 12,
			DOLLAR = 13, OP = 14, OPEN_PARENTHESIS = 15,
			CLOSE_PARENTHESIS = 16, OPEN_BRACKET = 17, CLOSE_BRACKET = 18,
			WS = 19, SINGLE_LINE_COMMENT = 20;
	public static final int JQUERY = 1;
	public static String[] modeNames = { "DEFAULT_MODE", "JQUERY" };

	public static final String[] tokenNames = { "'\\u0000'", "'\\u0001'",
			"'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", "'\\u0006'",
			"'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", "'\r'",
			"'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'",
			"'\\u0013'", "'\\u0014'" };
	public static final String[] ruleNames = { "JAVA", "JQBegin", "JQEnd",
			"IN", "OUT", "ID", "QUOTES", "APOSTROPHE", "SEMICOLON", "EQUALS",
			"DOLLAR", "OP", "OPEN_PARENTHESIS", "CLOSE_PARENTHESIS",
			"OPEN_BRACKET", "CLOSE_BRACKET", "WS", "SINGLE_LINE_COMMENT" };

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

	public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26z\b\1\b\1\4\2\t"
			+ "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"
			+ "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"
			+ "\4\23\t\23\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"
			+ "\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\7\7A\n\7\f\7\16\7D\13\7\3\b\3\b\3"
			+ "\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"
			+ "\r\3\r\3\r\3\r\5\r]\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\6"
			+ "\22h\n\22\r\22\16\22i\3\22\3\22\3\23\3\23\3\23\3\23\7\23r\n\23\f\23\16"
			+ "\23u\13\23\3\23\3\23\3\23\3\23\3s\2\24\4\5\6\6\b\7\n\b\f\t\16\n\20\13"
			+ "\22\f\24\r\26\16\30\17\32\20\34\21\36\22 \23\"\24$\25&\26\4\2\3\5\5\2"
			+ "C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\u0081\2\4\3\2\2\2\2\6\3\2\2"
			+ "\2\3\b\3\2\2\2\3\n\3\2\2\2\3\f\3\2\2\2\3\16\3\2\2\2\3\20\3\2\2\2\3\22"
			+ "\3\2\2\2\3\24\3\2\2\2\3\26\3\2\2\2\3\30\3\2\2\2\3\32\3\2\2\2\3\34\3\2"
			+ "\2\2\3\36\3\2\2\2\3 \3\2\2\2\3\"\3\2\2\2\3$\3\2\2\2\3&\3\2\2\2\4(\3\2"
			+ "\2\2\6*\3\2\2\2\b\62\3\2\2\2\n\67\3\2\2\2\f:\3\2\2\2\16>\3\2\2\2\20E\3"
			+ "\2\2\2\22G\3\2\2\2\24I\3\2\2\2\26K\3\2\2\2\30M\3\2\2\2\32\\\3\2\2\2\34"
			+ "^\3\2\2\2\36`\3\2\2\2 b\3\2\2\2\"d\3\2\2\2$g\3\2\2\2&m\3\2\2\2()\13\2"
			+ "\2\2)\5\3\2\2\2*+\7\61\2\2+,\7,\2\2,-\7B\2\2-.\7l\2\2./\7S\2\2/\60\3\2"
			+ "\2\2\60\61\b\3\2\2\61\7\3\2\2\2\62\63\7,\2\2\63\64\7\61\2\2\64\65\3\2"
			+ "\2\2\65\66\b\4\3\2\66\t\3\2\2\2\678\7k\2\289\7p\2\29\13\3\2\2\2:;\7q\2"
			+ "\2;<\7w\2\2<=\7v\2\2=\r\3\2\2\2>B\t\2\2\2?A\t\3\2\2@?\3\2\2\2AD\3\2\2"
			+ "\2B@\3\2\2\2BC\3\2\2\2C\17\3\2\2\2DB\3\2\2\2EF\7$\2\2F\21\3\2\2\2GH\7"
			+ ")\2\2H\23\3\2\2\2IJ\7=\2\2J\25\3\2\2\2KL\7?\2\2L\27\3\2\2\2MN\7&\2\2N"
			+ "\31\3\2\2\2OP\7,\2\2P]\7?\2\2QR\7~\2\2R]\7?\2\2ST\7\u0080\2\2T]\7?\2\2"
			+ "UV\7&\2\2V]\7?\2\2W]\7?\2\2XY\7#\2\2Y]\7?\2\2Z[\7`\2\2[]\7?\2\2\\O\3\2"
			+ "\2\2\\Q\3\2\2\2\\S\3\2\2\2\\U\3\2\2\2\\W\3\2\2\2\\X\3\2\2\2\\Z\3\2\2\2"
			+ "]\33\3\2\2\2^_\7*\2\2_\35\3\2\2\2`a\7+\2\2a\37\3\2\2\2bc\7]\2\2c!\3\2"
			+ "\2\2de\7_\2\2e#\3\2\2\2fh\t\4\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2"
			+ "\2\2jk\3\2\2\2kl\b\22\4\2l%\3\2\2\2mn\7\61\2\2no\7\61\2\2os\3\2\2\2pr"
			+ "\13\2\2\2qp\3\2\2\2ru\3\2\2\2st\3\2\2\2sq\3\2\2\2tv\3\2\2\2us\3\2\2\2"
			+ "vw\7\f\2\2wx\3\2\2\2xy\b\23\5\2y\'\3\2\2\2\b\2\3B\\is\6\7\3\2\6\2\2\2"
			+ "\3\2\2\4\2";
	public static final ATN _ATN = new ATNDeserializer()
			.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}