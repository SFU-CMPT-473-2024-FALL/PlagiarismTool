// Generated from c:/Users/colle/Desktop/.SFU CLASS/CMPT 473/Term Project/PlagiarismTool/srcANTLR/PlagiarismTool.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PlagiarismToolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WORD=2, NUMBER=3, SYMBOL=4, OPERATOR=5, STRING=6, ESCAPED=7, WHITESPACE=8, 
		COMMENT=9, BLOCK_COMMENT=10;
	public static final int
		RULE_diagrams = 0, RULE_diagram = 1, RULE_section = 2, RULE_body = 3, 
		RULE_textline = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"diagrams", "diagram", "section", "body", "textline"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "WORD", "NUMBER", "SYMBOL", "OPERATOR", "STRING", "ESCAPED", 
			"WHITESPACE", "COMMENT", "BLOCK_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PlagiarismTool.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PlagiarismToolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DiagramsContext extends ParserRuleContext {
		public List<DiagramContext> diagram() {
			return getRuleContexts(DiagramContext.class);
		}
		public DiagramContext diagram(int i) {
			return getRuleContext(DiagramContext.class,i);
		}
		public DiagramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diagrams; }
	}

	public final DiagramsContext diagrams() throws RecognitionException {
		DiagramsContext _localctx = new DiagramsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_diagrams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				diagram();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DiagramContext extends ParserRuleContext {
		public List<SectionContext> section() {
			return getRuleContexts(SectionContext.class);
		}
		public SectionContext section(int i) {
			return getRuleContext(SectionContext.class,i);
		}
		public DiagramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diagram; }
	}

	public final DiagramContext diagram() throws RecognitionException {
		DiagramContext _localctx = new DiagramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_diagram);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(16); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(15);
					section();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(18); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SectionContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(PlagiarismToolParser.WORD, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_section);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(WORD);
			setState(21);
			match(T__0);
			setState(23);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(22);
				body();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public List<TextlineContext> textline() {
			return getRuleContexts(TextlineContext.class);
		}
		public TextlineContext textline(int i) {
			return getRuleContext(TextlineContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(26); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(25);
					textline();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(28); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextlineContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(PlagiarismToolParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(PlagiarismToolParser.WORD, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(PlagiarismToolParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(PlagiarismToolParser.NUMBER, i);
		}
		public List<TerminalNode> SYMBOL() { return getTokens(PlagiarismToolParser.SYMBOL); }
		public TerminalNode SYMBOL(int i) {
			return getToken(PlagiarismToolParser.SYMBOL, i);
		}
		public List<TerminalNode> OPERATOR() { return getTokens(PlagiarismToolParser.OPERATOR); }
		public TerminalNode OPERATOR(int i) {
			return getToken(PlagiarismToolParser.OPERATOR, i);
		}
		public List<TerminalNode> STRING() { return getTokens(PlagiarismToolParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(PlagiarismToolParser.STRING, i);
		}
		public List<TerminalNode> ESCAPED() { return getTokens(PlagiarismToolParser.ESCAPED); }
		public TerminalNode ESCAPED(int i) {
			return getToken(PlagiarismToolParser.ESCAPED, i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(PlagiarismToolParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(PlagiarismToolParser.WHITESPACE, i);
		}
		public TextlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textline; }
	}

	public final TextlineContext textline() throws RecognitionException {
		TextlineContext _localctx = new TextlineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_textline);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(31); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(30);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 508L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(33); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\n$\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0004\u0000\f\b\u0000\u000b\u0000\f\u0000\r\u0001\u0001\u0004\u0001"+
		"\u0011\b\u0001\u000b\u0001\f\u0001\u0012\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u0018\b\u0002\u0001\u0003\u0004\u0003\u001b\b\u0003"+
		"\u000b\u0003\f\u0003\u001c\u0001\u0004\u0004\u0004 \b\u0004\u000b\u0004"+
		"\f\u0004!\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000"+
		"\u0001\u0001\u0000\u0002\b#\u0000\u000b\u0001\u0000\u0000\u0000\u0002"+
		"\u0010\u0001\u0000\u0000\u0000\u0004\u0014\u0001\u0000\u0000\u0000\u0006"+
		"\u001a\u0001\u0000\u0000\u0000\b\u001f\u0001\u0000\u0000\u0000\n\f\u0003"+
		"\u0002\u0001\u0000\u000b\n\u0001\u0000\u0000\u0000\f\r\u0001\u0000\u0000"+
		"\u0000\r\u000b\u0001\u0000\u0000\u0000\r\u000e\u0001\u0000\u0000\u0000"+
		"\u000e\u0001\u0001\u0000\u0000\u0000\u000f\u0011\u0003\u0004\u0002\u0000"+
		"\u0010\u000f\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000"+
		"\u0012\u0010\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000"+
		"\u0013\u0003\u0001\u0000\u0000\u0000\u0014\u0015\u0005\u0002\u0000\u0000"+
		"\u0015\u0017\u0005\u0001\u0000\u0000\u0016\u0018\u0003\u0006\u0003\u0000"+
		"\u0017\u0016\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000"+
		"\u0018\u0005\u0001\u0000\u0000\u0000\u0019\u001b\u0003\b\u0004\u0000\u001a"+
		"\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c"+
		"\u001a\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d"+
		"\u0007\u0001\u0000\u0000\u0000\u001e \u0007\u0000\u0000\u0000\u001f\u001e"+
		"\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\u001f\u0001\u0000"+
		"\u0000\u0000!\"\u0001\u0000\u0000\u0000\"\t\u0001\u0000\u0000\u0000\u0005"+
		"\r\u0012\u0017\u001c!";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}