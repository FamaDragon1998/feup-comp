package antlr4;

// Generated from JjQuery.g4 by ANTLR 4.4
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
	public static final String[] tokenNames = { "<INVALID>", "'in'", "'out'",
			"ID", "INT", "OP", "'/*@jQ'", "JQUERYBLOCKEND", "'='", "'$'",
			"'('", "')'", "'['", "']'", "'\"'", "'''", "';'", "NEWLINE",
			"SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", "WS" };
	public static final int RULE_main = 0, RULE_java = 1, RULE_jQueryBlock = 2,
			RULE_jQuery = 3, RULE_in = 4, RULE_out = 5, RULE_assign = 6,
			RULE_selector = 7;
	public static final String[] ruleNames = { "main", "java", "jQueryBlock",
			"jQuery", "in", "out", "assign", "selector" };

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
	public ATN getATN() {
		return _ATN;
	}

	public JjQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA,
				_sharedContextCache);
	}

	public static class MainContext extends ParserRuleContext {
		public List<JavaContext> java() {
			return getRuleContexts(JavaContext.class);
		}

		public List<JQueryBlockContext> jQueryBlock() {
			return getRuleContexts(JQueryBlockContext.class);
		}

		public JavaContext java(int i) {
			return getRuleContext(JavaContext.class, i);
		}

		public JQueryBlockContext jQueryBlock(int i) {
			return getRuleContext(JQueryBlockContext.class, i);
		}

		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_main;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryListener)
				((JjQueryListener) listener).enterMain(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryListener)
				((JjQueryListener) listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(16);
				java();
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == JQUERYBLOCKSTART) {
					{
						{
							setState(18);
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1: {
									{
										setState(17);
										jQueryBlock();
									}
								}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(20);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,
										0, _ctx);
							} while (_alt != 2
									&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
							setState(22);
							java();
						}
					}
					setState(28);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
		public JavaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_java;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryListener)
				((JjQueryListener) listener).enterJava(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryListener)
				((JjQueryListener) listener).exitJava(this);
		}
	}

	public final JavaContext java() throws RecognitionException {
		JavaContext _localctx = new JavaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_java);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(32);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 2, _ctx);
				while (_alt != 1
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1 + 1) {
						{
							{
								setState(29);
								matchWildcard();
							}
						}
					}
					setState(34);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 2, _ctx);
				}
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

	public static class JQueryBlockContext extends ParserRuleContext {
		public TerminalNode JQUERYBLOCKEND() {
			return getToken(JjQueryParser.JQUERYBLOCKEND, 0);
		}

		public JQueryContext jQuery(int i) {
			return getRuleContext(JQueryContext.class, i);
		}

		public TerminalNode JQUERYBLOCKSTART() {
			return getToken(JjQueryParser.JQUERYBLOCKSTART, 0);
		}

		public List<TerminalNode> SINGLE_LINE_COMMENT() {
			return getTokens(JjQueryParser.SINGLE_LINE_COMMENT);
		}

		public List<JQueryContext> jQuery() {
			return getRuleContexts(JQueryContext.class);
		}

		public TerminalNode SINGLE_LINE_COMMENT(int i) {
			return getToken(JjQueryParser.SINGLE_LINE_COMMENT, i);
		}

		public JQueryBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_jQueryBlock;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryListener)
				((JjQueryListener) listener).enterJQueryBlock(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryListener)
				((JjQueryListener) listener).exitJQueryBlock(this);
		}
	}

	public final JQueryBlockContext jQueryBlock() throws RecognitionException {
		JQueryBlockContext _localctx = new JQueryBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_jQueryBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(35);
				match(JQUERYBLOCKSTART);
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1)
						| (1L << T__0) | (1L << ID))) != 0)) {
					{
						{
							setState(36);
							jQuery();
							setState(38);
							_la = _input.LA(1);
							if (_la == SINGLE_LINE_COMMENT) {
								{
									setState(37);
									match(SINGLE_LINE_COMMENT);
								}
							}

						}
					}
					setState(44);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(45);
				match(JQUERYBLOCKEND);
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
		public OutContext out() {
			return getRuleContext(OutContext.class, 0);
		}

		public AssignContext assign() {
			return getRuleContext(AssignContext.class, 0);
		}

		public InContext in() {
			return getRuleContext(InContext.class, 0);
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
			if (listener instanceof JjQueryListener)
				((JjQueryListener) listener).enterJQuery(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryListener)
				((JjQueryListener) listener).exitJQuery(this);
		}
	}

	public final JQueryContext jQuery() throws RecognitionException {
		JQueryContext _localctx = new JQueryContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_jQuery);
		try {
			setState(50);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
					setState(47);
					in();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
					setState(48);
					out();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
					setState(49);
					assign();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
			if (listener instanceof JjQueryListener)
				((JjQueryListener) listener).enterIn(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryListener)
				((JjQueryListener) listener).exitIn(this);
		}
	}

	public final InContext in() throws RecognitionException {
		InContext _localctx = new InContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_in);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(52);
				match(T__1);
				setState(53);
				match(ID);
				setState(54);
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

		public OutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_out;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryListener)
				((JjQueryListener) listener).enterOut(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryListener)
				((JjQueryListener) listener).exitOut(this);
		}
	}

	public final OutContext out() throws RecognitionException {
		OutContext _localctx = new OutContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_out);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(56);
				match(T__0);
				setState(57);
				match(ID);
				setState(58);
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

		public TerminalNode ASSIGN() {
			return getToken(JjQueryParser.ASSIGN, 0);
		}

		public TerminalNode CLOSE_PARENTHESES() {
			return getToken(JjQueryParser.CLOSE_PARENTHESES, 0);
		}

		public TerminalNode OPEN_PARENTHESES() {
			return getToken(JjQueryParser.OPEN_PARENTHESES, 0);
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

		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class, 0);
		}

		public List<TerminalNode> QUOTES() {
			return getTokens(JjQueryParser.QUOTES);
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
			if (listener instanceof JjQueryListener)
				((JjQueryListener) listener).enterAssign(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryListener)
				((JjQueryListener) listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(60);
				match(ID);
				setState(61);
				match(ASSIGN);
				setState(62);
				match(DOLLAR);
				setState(63);
				match(OPEN_PARENTHESES);
				setState(64);
				match(QUOTES);
				setState(65);
				match(ID);
				setState(66);
				selector();
				setState(67);
				match(ID);
				setState(68);
				match(QUOTES);
				setState(69);
				match(CLOSE_PARENTHESES);
				setState(70);
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
			if (listener instanceof JjQueryListener)
				((JjQueryListener) listener).enterSelector(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof JjQueryListener)
				((JjQueryListener) listener).exitSelector(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(72);
				match(OPEN_BRACKET);
				setState(73);
				match(ID);
				setState(74);
				match(OP);
				setState(75);
				match(APOSTROPHE);
				setState(76);
				match(ID);
				setState(77);
				match(APOSTROPHE);
				setState(78);
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

	public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\26S\4\2\t\2\4\3\t"
			+ "\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\6\2\25\n\2"
			+ "\r\2\16\2\26\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\3\7\3!\n\3\f\3\16\3"
			+ "$\13\3\3\4\3\4\3\4\5\4)\n\4\7\4+\n\4\f\4\16\4.\13\4\3\4\3\4\3\5\3\5\3"
			+ "\5\5\5\65\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"
			+ "\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\"\2\n\2"
			+ "\4\6\b\n\f\16\20\2\2Q\2\22\3\2\2\2\4\"\3\2\2\2\6%\3\2\2\2\b\64\3\2\2\2"
			+ "\n\66\3\2\2\2\f:\3\2\2\2\16>\3\2\2\2\20J\3\2\2\2\22\34\5\4\3\2\23\25\5"
			+ "\6\4\2\24\23\3\2\2\2\25\26\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\30\3"
			+ "\2\2\2\30\31\5\4\3\2\31\33\3\2\2\2\32\24\3\2\2\2\33\36\3\2\2\2\34\32\3"
			+ "\2\2\2\34\35\3\2\2\2\35\3\3\2\2\2\36\34\3\2\2\2\37!\13\2\2\2 \37\3\2\2"
			+ "\2!$\3\2\2\2\"#\3\2\2\2\" \3\2\2\2#\5\3\2\2\2$\"\3\2\2\2%,\7\b\2\2&(\5"
			+ "\b\5\2\')\7\24\2\2(\'\3\2\2\2()\3\2\2\2)+\3\2\2\2*&\3\2\2\2+.\3\2\2\2"
			+ ",*\3\2\2\2,-\3\2\2\2-/\3\2\2\2.,\3\2\2\2/\60\7\t\2\2\60\7\3\2\2\2\61\65"
			+ "\5\n\6\2\62\65\5\f\7\2\63\65\5\16\b\2\64\61\3\2\2\2\64\62\3\2\2\2\64\63"
			+ "\3\2\2\2\65\t\3\2\2\2\66\67\7\3\2\2\678\7\5\2\289\7\22\2\29\13\3\2\2\2"
			+ ":;\7\4\2\2;<\7\5\2\2<=\7\22\2\2=\r\3\2\2\2>?\7\5\2\2?@\7\n\2\2@A\7\13"
			+ "\2\2AB\7\f\2\2BC\7\20\2\2CD\7\5\2\2DE\5\20\t\2EF\7\5\2\2FG\7\20\2\2GH"
			+ "\7\r\2\2HI\7\22\2\2I\17\3\2\2\2JK\7\16\2\2KL\7\5\2\2LM\7\7\2\2MN\7\21"
			+ "\2\2NO\7\5\2\2OP\7\21\2\2PQ\7\17\2\2Q\21\3\2\2\2\b\26\34\"(,\64";
	public static final ATN _ATN = new ATNDeserializer()
			.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}