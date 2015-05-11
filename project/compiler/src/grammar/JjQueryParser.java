package grammar;

// Generated from JjQueryParser.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class JjQueryParser extends Parser {
	static {
		// RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int JAVA = 3, OP = 13, OPEN_PARENTHESIS = 14,
			CLOSE_PARENTHESIS = 15, IN = 6, APOSTROPHE = 10, OPEN_BRACKET = 16,
			CLOSE_BRACKET = 17, JQEnd = 5, OUT = 7, SINGLE_LINE_COMMENT = 19,
			JQBegin = 4, SEMICOLON = 11, COMMENTS_CHANNEL = 2, DOLLAR = 12,
			WHITESPACE_CHANNEL = 1, ID = 8, QUOTES = 9, WS = 18;
	public static final String[] tokenNames = { "<INVALID>",
			"WHITESPACE_CHANNEL", "COMMENTS_CHANNEL", "JAVA", "'/*@jQ'",
			"'*/'", "'in'", "'out'", "ID", "'\"'", "'''", "';'", "'$'", "OP",
			"'('", "')'", "'['", "']'", "WS", "SINGLE_LINE_COMMENT" };
	public static final int RULE_init = 0, RULE_java = 1, RULE_jQuery = 2,
			RULE_in = 3, RULE_out = 4, RULE_assign = 5, RULE_selector = 6;
	public static final String[] ruleNames = { "init", "java", "jQuery", "in",
			"out", "assign", "selector" };

	@Override
	public String getGrammarFileName() {
		return "JjQueryParser.g4";
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
	public ATN getATN() {
		return _ATN;
	}

	public JjQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA,
				_sharedContextCache);
	}

	public static class InitContext extends ParserRuleContext {
		public TerminalNode EOF() {
			return getToken(JjQueryParser.EOF, 0);
		}

		public List<JQueryContext> jQuery() {
			return getRuleContexts(JQueryContext.class);
		}

		public List<JavaContext> java() {
			return getRuleContexts(JavaContext.class);
		}

		public JavaContext java(int i) {
			return getRuleContext(JavaContext.class, i);
		}

		public JQueryContext jQuery(int i) {
			return getRuleContext(JQueryContext.class, i);
		}

		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_init;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterInit(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						setState(16);
						switch (_input.LA(1)) {
						case JAVA: {
							setState(14);
							java();
						}
							break;
						case JQBegin: {
							setState(15);
							jQuery();
						}
							break;
						default:
							throw new NoViableAltException(this);
						}
					}
					setState(18);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while (_la == JAVA || _la == JQBegin);
				setState(20);
				match(EOF);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JavaContext extends ParserRuleContext {
		public TerminalNode JAVA() {
			return getToken(JjQueryParser.JAVA, 0);
		}

		public JavaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_java;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterJava(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitJava(this);
		}
	}

	public final JavaContext java() throws RecognitionException {
		JavaContext _localctx = new JavaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_java);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(22);
				match(JAVA);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JQueryContext extends ParserRuleContext {
		public TerminalNode JQBegin() {
			return getToken(JjQueryParser.JQBegin, 0);
		}

		public List<InContext> in() {
			return getRuleContexts(InContext.class);
		}

		public TerminalNode JQEnd() {
			return getToken(JjQueryParser.JQEnd, 0);
		}

		public InContext in(int i) {
			return getRuleContext(InContext.class, i);
		}

		public List<OutContext> out() {
			return getRuleContexts(OutContext.class);
		}

		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}

		public OutContext out(int i) {
			return getRuleContext(OutContext.class, i);
		}

		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class, i);
		}

		public JQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_jQuery;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterJQuery(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitJQuery(this);
		}
	}

	public final JQueryContext jQuery() throws RecognitionException {
		JQueryContext _localctx = new JQueryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_jQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(24);
				match(JQBegin);
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN)
						| (1L << OUT) | (1L << ID))) != 0)) {
					{
						setState(28);
						switch (_input.LA(1)) {
						case IN: {
							setState(25);
							in();
						}
							break;
						case OUT: {
							setState(26);
							out();
						}
							break;
						case ID: {
							setState(27);
							assign();
						}
							break;
						default:
							throw new NoViableAltException(this);
						}
					}
					setState(32);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(33);
				match(JQEnd);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InContext extends ParserRuleContext {
		public TerminalNode ID() {
			return getToken(JjQueryParser.ID, 0);
		}

		public TerminalNode SEMICOLON() {
			return getToken(JjQueryParser.SEMICOLON, 0);
		}

		public TerminalNode IN() {
			return getToken(JjQueryParser.IN, 0);
		}

		public InContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_in;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterIn(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitIn(this);
		}
	}

	public final InContext in() throws RecognitionException {
		InContext _localctx = new InContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_in);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(35);
				match(IN);
				setState(36);
				match(ID);
				setState(37);
				match(SEMICOLON);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutContext extends ParserRuleContext {
		public TerminalNode ID() {
			return getToken(JjQueryParser.ID, 0);
		}

		public TerminalNode SEMICOLON() {
			return getToken(JjQueryParser.SEMICOLON, 0);
		}

		public TerminalNode OUT() {
			return getToken(JjQueryParser.OUT, 0);
		}

		public OutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_out;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterOut(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitOut(this);
		}
	}

	public final OutContext out() throws RecognitionException {
		OutContext _localctx = new OutContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_out);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(39);
				match(OUT);
				setState(40);
				match(ID);
				setState(41);
				match(SEMICOLON);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public List<TerminalNode> ID() {
			return getTokens(JjQueryParser.ID);
		}

		public TerminalNode SEMICOLON() {
			return getToken(JjQueryParser.SEMICOLON, 0);
		}

		public TerminalNode CLOSE_PARENTHESIS() {
			return getToken(JjQueryParser.CLOSE_PARENTHESIS, 0);
		}

		public TerminalNode OP() {
			return getToken(JjQueryParser.OP, 0);
		}

		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class, 0);
		}

		public List<TerminalNode> QUOTES() {
			return getTokens(JjQueryParser.QUOTES);
		}

		public TerminalNode DOLLAR() {
			return getToken(JjQueryParser.DOLLAR, 0);
		}

		public TerminalNode ID(int i) {
			return getToken(JjQueryParser.ID, i);
		}

		public TerminalNode QUOTES(int i) {
			return getToken(JjQueryParser.QUOTES, i);
		}

		public TerminalNode OPEN_PARENTHESIS() {
			return getToken(JjQueryParser.OPEN_PARENTHESIS, 0);
		}

		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_assign;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterAssign(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(43);
				match(ID);
				setState(44);
				match(OP);
				setState(45);
				match(DOLLAR);
				setState(46);
				match(OPEN_PARENTHESIS);
				setState(47);
				match(QUOTES);
				setState(48);
				match(ID);
				setState(49);
				selector();
				setState(50);
				match(ID);
				setState(51);
				match(QUOTES);
				setState(52);
				match(CLOSE_PARENTHESIS);
				setState(53);
				match(SEMICOLON);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectorContext extends ParserRuleContext {
		public List<TerminalNode> ID() {
			return getTokens(JjQueryParser.ID);
		}

		public TerminalNode OP() {
			return getToken(JjQueryParser.OP, 0);
		}

		public TerminalNode OPEN_BRACKET() {
			return getToken(JjQueryParser.OPEN_BRACKET, 0);
		}

		public List<TerminalNode> APOSTROPHE() {
			return getTokens(JjQueryParser.APOSTROPHE);
		}

		public TerminalNode APOSTROPHE(int i) {
			return getToken(JjQueryParser.APOSTROPHE, i);
		}

		public TerminalNode ID(int i) {
			return getToken(JjQueryParser.ID, i);
		}

		public TerminalNode CLOSE_BRACKET() {
			return getToken(JjQueryParser.CLOSE_BRACKET, 0);
		}

		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_selector;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterSelector(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitSelector(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(55);
				match(OPEN_BRACKET);
				setState(56);
				match(ID);
				setState(57);
				match(OP);
				setState(58);
				match(APOSTROPHE);
				setState(59);
				match(ID);
				setState(60);
				match(APOSTROPHE);
				setState(61);
				match(CLOSE_BRACKET);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25B\4\2\t\2\4\3\t"
			+ "\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\6\2\23\n\2\r\2\16\2"
			+ "\24\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\7\4\37\n\4\f\4\16\4\"\13\4\3\4\3\4"
			+ "\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"
			+ "\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2"
			+ "\2?\2\22\3\2\2\2\4\30\3\2\2\2\6\32\3\2\2\2\b%\3\2\2\2\n)\3\2\2\2\f-\3"
			+ "\2\2\2\169\3\2\2\2\20\23\5\4\3\2\21\23\5\6\4\2\22\20\3\2\2\2\22\21\3\2"
			+ "\2\2\23\24\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\26\3\2\2\2\26\27\7\2"
			+ "\2\3\27\3\3\2\2\2\30\31\7\5\2\2\31\5\3\2\2\2\32 \7\6\2\2\33\37\5\b\5\2"
			+ "\34\37\5\n\6\2\35\37\5\f\7\2\36\33\3\2\2\2\36\34\3\2\2\2\36\35\3\2\2\2"
			+ "\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!#\3\2\2\2\" \3\2\2\2#$\7\7\2\2$\7"
			+ "\3\2\2\2%&\7\b\2\2&\'\7\n\2\2\'(\7\r\2\2(\t\3\2\2\2)*\7\t\2\2*+\7\n\2"
			+ "\2+,\7\r\2\2,\13\3\2\2\2-.\7\n\2\2./\7\17\2\2/\60\7\16\2\2\60\61\7\20"
			+ "\2\2\61\62\7\13\2\2\62\63\7\n\2\2\63\64\5\16\b\2\64\65\7\n\2\2\65\66\7"
			+ "\13\2\2\66\67\7\21\2\2\678\7\r\2\28\r\3\2\2\29:\7\22\2\2:;\7\n\2\2;<\7"
			+ "\17\2\2<=\7\f\2\2=>\7\n\2\2>?\7\f\2\2?@\7\23\2\2@\17\3\2\2\2\6\22\24\36"
			+ " ";
	public static final ATN _ATN = new ATNDeserializer()
			.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}