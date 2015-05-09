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
	public static final int DOLLAR = 13, OPEN_BRACKET = 17, JQBegin = 4,
			SINGLE_LINE_COMMENT = 20, WS = 19, IN = 6, OUT = 7, JAVA = 3,
			OP = 14, SEMICOLON = 11, EQUALS = 12, QUOTES = 9, APOSTROPHE = 10,
			WHITESPACE_CHANNEL = 1, ID = 8, COMMENTS_CHANNEL = 2, JQEnd = 5,
			OPEN_PARENTHESIS = 15, CLOSE_PARENTHESIS = 16, CLOSE_BRACKET = 18;
	public static final String[] tokenNames = { "<INVALID>",
			"WHITESPACE_CHANNEL", "COMMENTS_CHANNEL", "JAVA", "'/*@jQ'",
			"'*/'", "'in'", "'out'", "ID", "'\"'", "'''", "';'", "'='", "'$'",
			"OP", "'('", "')'", "'['", "']'", "WS", "SINGLE_LINE_COMMENT" };
	public static final int RULE_src = 0, RULE_jQuery = 1, RULE_in = 2,
			RULE_out = 3, RULE_assign = 4, RULE_selector = 5;
	public static final String[] ruleNames = { "src", "jQuery", "in", "out",
			"assign", "selector" };

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

	public static class SrcContext extends ParserRuleContext {
		public TerminalNode EOF() {
			return getToken(JjQueryParser.EOF, 0);
		}

		public JQueryContext jQuery(int i) {
			return getRuleContext(JQueryContext.class, i);
		}

		public List<TerminalNode> JAVA() {
			return getTokens(JjQueryParser.JAVA);
		}

		public List<JQueryContext> jQuery() {
			return getRuleContexts(JQueryContext.class);
		}

		public TerminalNode JAVA(int i) {
			return getToken(JjQueryParser.JAVA, i);
		}

		public SrcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_src;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).enterSrc(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryParserListener)
				((JjQueryParserListener) listener).exitSrc(this);
		}
	}

	public final SrcContext src() throws RecognitionException {
		SrcContext _localctx = new SrcContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_src);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(14);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						setState(14);
						switch (_input.LA(1)) {
						case JAVA: {
							setState(12);
							match(JAVA);
						}
							break;
						case JQBegin: {
							setState(13);
							jQuery();
						}
							break;
						default:
							throw new NoViableAltException(this);
						}
					}
					setState(16);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while (_la == JAVA || _la == JQBegin);
				setState(18);
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

	public static class JQueryContext extends ParserRuleContext {
		public List<OutContext> out() {
			return getRuleContexts(OutContext.class);
		}

		public TerminalNode JQBegin() {
			return getToken(JjQueryParser.JQBegin, 0);
		}

		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}

		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class, i);
		}

		public List<InContext> in() {
			return getRuleContexts(InContext.class);
		}

		public TerminalNode JQEnd() {
			return getToken(JjQueryParser.JQEnd, 0);
		}

		public OutContext out(int i) {
			return getRuleContext(OutContext.class, i);
		}

		public InContext in(int i) {
			return getRuleContext(InContext.class, i);
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
		enterRule(_localctx, 2, RULE_jQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(20);
				match(JQBegin);
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN)
						| (1L << OUT) | (1L << ID))) != 0)) {
					{
						setState(24);
						switch (_input.LA(1)) {
						case IN: {
							setState(21);
							in();
						}
							break;
						case OUT: {
							setState(22);
							out();
						}
							break;
						case ID: {
							setState(23);
							assign();
						}
							break;
						default:
							throw new NoViableAltException(this);
						}
					}
					setState(28);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(29);
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
		public TerminalNode IN() {
			return getToken(JjQueryParser.IN, 0);
		}

		public TerminalNode SEMICOLON() {
			return getToken(JjQueryParser.SEMICOLON, 0);
		}

		public TerminalNode ID() {
			return getToken(JjQueryParser.ID, 0);
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
		enterRule(_localctx, 4, RULE_in);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(31);
				match(IN);
				setState(32);
				match(ID);
				setState(33);
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
		public TerminalNode SEMICOLON() {
			return getToken(JjQueryParser.SEMICOLON, 0);
		}

		public TerminalNode ID() {
			return getToken(JjQueryParser.ID, 0);
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
		enterRule(_localctx, 6, RULE_out);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(35);
				match(OUT);
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() {
			return getToken(JjQueryParser.SEMICOLON, 0);
		}

		public TerminalNode EQUALS() {
			return getToken(JjQueryParser.EQUALS, 0);
		}

		public List<TerminalNode> ID() {
			return getTokens(JjQueryParser.ID);
		}

		public TerminalNode QUOTES(int i) {
			return getToken(JjQueryParser.QUOTES, i);
		}

		public TerminalNode DOLLAR() {
			return getToken(JjQueryParser.DOLLAR, 0);
		}

		public TerminalNode CLOSE_PARENTHESIS() {
			return getToken(JjQueryParser.CLOSE_PARENTHESIS, 0);
		}

		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class, 0);
		}

		public List<TerminalNode> QUOTES() {
			return getTokens(JjQueryParser.QUOTES);
		}

		public TerminalNode OPEN_PARENTHESIS() {
			return getToken(JjQueryParser.OPEN_PARENTHESIS, 0);
		}

		public TerminalNode ID(int i) {
			return getToken(JjQueryParser.ID, i);
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
		enterRule(_localctx, 8, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(39);
				match(ID);
				setState(40);
				match(EQUALS);
				setState(41);
				match(DOLLAR);
				setState(42);
				match(OPEN_PARENTHESIS);
				setState(43);
				match(QUOTES);
				setState(44);
				match(ID);
				setState(45);
				selector();
				setState(46);
				match(ID);
				setState(47);
				match(QUOTES);
				setState(48);
				match(CLOSE_PARENTHESIS);
				setState(49);
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
		public TerminalNode OP() {
			return getToken(JjQueryParser.OP, 0);
		}

		public TerminalNode CLOSE_BRACKET() {
			return getToken(JjQueryParser.CLOSE_BRACKET, 0);
		}

		public List<TerminalNode> ID() {
			return getTokens(JjQueryParser.ID);
		}

		public TerminalNode OPEN_BRACKET() {
			return getToken(JjQueryParser.OPEN_BRACKET, 0);
		}

		public TerminalNode APOSTROPHE(int i) {
			return getToken(JjQueryParser.APOSTROPHE, i);
		}

		public List<TerminalNode> APOSTROPHE() {
			return getTokens(JjQueryParser.APOSTROPHE);
		}

		public TerminalNode ID(int i) {
			return getToken(JjQueryParser.ID, i);
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
		enterRule(_localctx, 10, RULE_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(51);
				match(OPEN_BRACKET);
				setState(52);
				match(ID);
				setState(53);
				match(OP);
				setState(54);
				match(APOSTROPHE);
				setState(55);
				match(ID);
				setState(56);
				match(APOSTROPHE);
				setState(57);
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

	public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\26>\4\2\t\2\4\3\t"
			+ "\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\6\2\21\n\2\r\2\16\2\22\3\2"
			+ "\3\2\3\3\3\3\3\3\3\3\7\3\33\n\3\f\3\16\3\36\13\3\3\3\3\3\3\4\3\4\3\4\3"
			+ "\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7"
			+ "\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\2<\2\20\3\2\2\2\4"
			+ "\26\3\2\2\2\6!\3\2\2\2\b%\3\2\2\2\n)\3\2\2\2\f\65\3\2\2\2\16\21\7\5\2"
			+ "\2\17\21\5\4\3\2\20\16\3\2\2\2\20\17\3\2\2\2\21\22\3\2\2\2\22\20\3\2\2"
			+ "\2\22\23\3\2\2\2\23\24\3\2\2\2\24\25\7\2\2\3\25\3\3\2\2\2\26\34\7\6\2"
			+ "\2\27\33\5\6\4\2\30\33\5\b\5\2\31\33\5\n\6\2\32\27\3\2\2\2\32\30\3\2\2"
			+ "\2\32\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\37\3\2\2"
			+ "\2\36\34\3\2\2\2\37 \7\7\2\2 \5\3\2\2\2!\"\7\b\2\2\"#\7\n\2\2#$\7\r\2"
			+ "\2$\7\3\2\2\2%&\7\t\2\2&\'\7\n\2\2\'(\7\r\2\2(\t\3\2\2\2)*\7\n\2\2*+\7"
			+ "\16\2\2+,\7\17\2\2,-\7\21\2\2-.\7\13\2\2./\7\n\2\2/\60\5\f\7\2\60\61\7"
			+ "\n\2\2\61\62\7\13\2\2\62\63\7\22\2\2\63\64\7\r\2\2\64\13\3\2\2\2\65\66"
			+ "\7\23\2\2\66\67\7\n\2\2\678\7\20\2\289\7\f\2\29:\7\n\2\2:;\7\f\2\2;<\7"
			+ "\24\2\2<\r\3\2\2\2\6\20\22\32\34";
	public static final ATN _ATN = new ATNDeserializer()
			.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}