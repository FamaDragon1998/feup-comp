package antlr4;

// Generated from Tokens.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class Tokens extends Lexer {
	static {
		RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int ID = 1, INT = 2, OP = 3, JQUERYBLOCKSTART = 4,
			JQUERYBLOCKEND = 5, ASSIGN = 6, DOLLAR = 7, OPEN_PARENTHESES = 8,
			CLOSE_PARENTHESES = 9, OPEN_BRACKET = 10, CLOSE_BRACKET = 11,
			QUOTES = 12, APOSTROPHE = 13, SEMICOLON = 14, NEWLINE = 15,
			SINGLE_LINE_COMMENT = 16, MULTI_LINE_COMMENT = 17, WS = 18;
	public static String[] modeNames = { "DEFAULT_MODE" };

	public static final String[] tokenNames = { "'\\u0000'", "'\\u0001'",
			"'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", "'\\u0006'",
			"'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", "'\r'",
			"'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'" };
	public static final String[] ruleNames = { "ID", "INT", "OP",
			"JQUERYBLOCKSTART", "JQUERYBLOCKEND", "ASSIGN", "DOLLAR",
			"OPEN_PARENTHESES", "CLOSE_PARENTHESES", "OPEN_BRACKET",
			"CLOSE_BRACKET", "QUOTES", "APOSTROPHE", "SEMICOLON", "NEWLINE",
			"SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", "WS" };

	public Tokens(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this, _ATN, _decisionToDFA,
				_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() {
		return "Tokens.g4";
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

	public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24\u0088\b\1\4\2"
			+ "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"
			+ "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"
			+ "\t\22\4\23\t\23\3\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\3\6\3\60\n\3\r\3\16"
			+ "\3\61\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\5\3\5"
			+ "\3\5\3\5\3\5\3\5\3\6\5\6I\n\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n"
			+ "\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\5\20a\n\20\3\20"
			+ "\3\20\3\21\3\21\3\21\3\21\7\21i\n\21\f\21\16\21l\13\21\3\22\3\22\3\22"
			+ "\3\22\3\22\3\22\3\22\3\22\3\22\7\22w\n\22\f\22\16\22z\13\22\3\22\3\22"
			+ "\5\22~\n\22\3\22\3\22\3\23\6\23\u0083\n\23\r\23\16\23\u0084\3\23\3\23"
			+ "\3x\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"
			+ "\35\20\37\21!\22#\23%\24\3\2\b\4\2C\\c|\5\2\62;C\\c|\3\2\62;\4\2\f\f\17"
			+ "\17\6\2))BBSSll\5\2\13\f\17\17\"\"\u0094\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"
			+ "\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"
			+ "\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"
			+ "\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5/"
			+ "\3\2\2\2\7?\3\2\2\2\tA\3\2\2\2\13H\3\2\2\2\rM\3\2\2\2\17O\3\2\2\2\21Q"
			+ "\3\2\2\2\23S\3\2\2\2\25U\3\2\2\2\27W\3\2\2\2\31Y\3\2\2\2\33[\3\2\2\2\35"
			+ "]\3\2\2\2\37`\3\2\2\2!d\3\2\2\2#}\3\2\2\2%\u0082\3\2\2\2\'+\t\2\2\2(*"
			+ "\t\3\2\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\4\3\2\2\2-+\3\2\2\2"
			+ ".\60\t\4\2\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\6\3"
			+ "\2\2\2\63\64\7,\2\2\64@\7?\2\2\65\66\7~\2\2\66@\7?\2\2\678\7\u0080\2\2"
			+ "8@\7?\2\29:\7&\2\2:@\7?\2\2;<\7#\2\2<@\7?\2\2=>\7`\2\2>@\7?\2\2?\63\3"
			+ "\2\2\2?\65\3\2\2\2?\67\3\2\2\2?9\3\2\2\2?;\3\2\2\2?=\3\2\2\2@\b\3\2\2"
			+ "\2AB\7\61\2\2BC\7,\2\2CD\7B\2\2DE\7l\2\2EF\7S\2\2F\n\3\2\2\2GI\5\37\20"
			+ "\2HG\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\7,\2\2KL\7\61\2\2L\f\3\2\2\2MN\7?\2"
			+ "\2N\16\3\2\2\2OP\7&\2\2P\20\3\2\2\2QR\7*\2\2R\22\3\2\2\2ST\7+\2\2T\24"
			+ "\3\2\2\2UV\7]\2\2V\26\3\2\2\2WX\7_\2\2X\30\3\2\2\2YZ\7$\2\2Z\32\3\2\2"
			+ "\2[\\\7)\2\2\\\34\3\2\2\2]^\7=\2\2^\36\3\2\2\2_a\7\17\2\2`_\3\2\2\2`a"
			+ "\3\2\2\2ab\3\2\2\2bc\7\f\2\2c \3\2\2\2de\7\61\2\2ef\7\61\2\2fj\3\2\2\2"
			+ "gi\n\5\2\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\"\3\2\2\2lj\3\2\2"
			+ "\2mn\7\61\2\2no\7,\2\2op\7,\2\2p~\7\61\2\2qr\7\61\2\2rs\7,\2\2st\3\2\2"
			+ "\2tx\n\6\2\2uw\13\2\2\2vu\3\2\2\2wz\3\2\2\2xy\3\2\2\2xv\3\2\2\2y{\3\2"
			+ "\2\2zx\3\2\2\2{|\7,\2\2|~\7\61\2\2}m\3\2\2\2}q\3\2\2\2~\177\3\2\2\2\177"
			+ "\u0080\b\22\2\2\u0080$\3\2\2\2\u0081\u0083\t\7\2\2\u0082\u0081\3\2\2\2"
			+ "\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086"
			+ "\3\2\2\2\u0086\u0087\b\23\2\2\u0087&\3\2\2\2\f\2+\61?H`jx}\u0084\3\b\2"
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