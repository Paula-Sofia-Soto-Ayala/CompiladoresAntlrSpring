// Generated from inventory.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class inventoryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=1, REMOVE=2, UPDATE=3, SHOW=4, SAVE=5, LOAD=6, SEARCH=7, HISTORY=8, 
		SORT=9, BY=10, NAME=11, CATEGORY=12, DESCRIPTION=13, HELP=14, ASSIGN=15, 
		SEMICOLON=16, IDENTIFIER=17, NUMBER=18, WS=19, ERROR=20;
	public static final int
		RULE_program = 0, RULE_statement = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'add'", "'remove'", "'update'", "'show'", "'save'", "'load'", 
			"'search'", "'history'", "'sort'", "'by'", "'name'", "'category'", "'description'", 
			"'help'", "'='", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ADD", "REMOVE", "UPDATE", "SHOW", "SAVE", "LOAD", "SEARCH", "HISTORY", 
			"SORT", "BY", "NAME", "CATEGORY", "DESCRIPTION", "HELP", "ASSIGN", "SEMICOLON", 
			"IDENTIFIER", "NUMBER", "WS", "ERROR"
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
	public String getGrammarFileName() { return "inventory.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public inventoryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(inventoryParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inventoryListener ) ((inventoryListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inventoryListener ) ((inventoryListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(5); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4);
				statement();
				}
				}
				setState(7); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << REMOVE) | (1L << UPDATE) | (1L << SHOW) | (1L << SAVE) | (1L << LOAD) | (1L << SEARCH) | (1L << SORT) | (1L << HELP))) != 0) );
			setState(9);
			match(EOF);
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(inventoryParser.ADD, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(inventoryParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(inventoryParser.IDENTIFIER, i);
		}
		public TerminalNode ASSIGN() { return getToken(inventoryParser.ASSIGN, 0); }
		public TerminalNode NUMBER() { return getToken(inventoryParser.NUMBER, 0); }
		public TerminalNode DESCRIPTION() { return getToken(inventoryParser.DESCRIPTION, 0); }
		public TerminalNode CATEGORY() { return getToken(inventoryParser.CATEGORY, 0); }
		public TerminalNode SEMICOLON() { return getToken(inventoryParser.SEMICOLON, 0); }
		public TerminalNode REMOVE() { return getToken(inventoryParser.REMOVE, 0); }
		public TerminalNode UPDATE() { return getToken(inventoryParser.UPDATE, 0); }
		public TerminalNode SHOW() { return getToken(inventoryParser.SHOW, 0); }
		public TerminalNode SAVE() { return getToken(inventoryParser.SAVE, 0); }
		public TerminalNode LOAD() { return getToken(inventoryParser.LOAD, 0); }
		public TerminalNode SEARCH() { return getToken(inventoryParser.SEARCH, 0); }
		public TerminalNode NAME() { return getToken(inventoryParser.NAME, 0); }
		public TerminalNode HISTORY() { return getToken(inventoryParser.HISTORY, 0); }
		public TerminalNode SORT() { return getToken(inventoryParser.SORT, 0); }
		public TerminalNode BY() { return getToken(inventoryParser.BY, 0); }
		public TerminalNode HELP() { return getToken(inventoryParser.HELP, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof inventoryListener ) ((inventoryListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof inventoryListener ) ((inventoryListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(11);
				match(ADD);
				setState(12);
				match(IDENTIFIER);
				setState(13);
				match(ASSIGN);
				setState(14);
				match(NUMBER);
				setState(15);
				match(DESCRIPTION);
				setState(16);
				match(IDENTIFIER);
				setState(17);
				match(CATEGORY);
				setState(18);
				match(IDENTIFIER);
				setState(19);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				match(REMOVE);
				setState(21);
				match(IDENTIFIER);
				setState(22);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(23);
				match(UPDATE);
				setState(24);
				match(IDENTIFIER);
				setState(25);
				match(ASSIGN);
				setState(26);
				match(NUMBER);
				setState(27);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(28);
				match(UPDATE);
				setState(29);
				match(IDENTIFIER);
				setState(30);
				match(DESCRIPTION);
				setState(31);
				match(IDENTIFIER);
				setState(32);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(33);
				match(UPDATE);
				setState(34);
				match(IDENTIFIER);
				setState(35);
				match(CATEGORY);
				setState(36);
				match(IDENTIFIER);
				setState(37);
				match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(38);
				match(SHOW);
				setState(39);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(40);
				match(SAVE);
				setState(41);
				match(IDENTIFIER);
				setState(42);
				match(SEMICOLON);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(43);
				match(LOAD);
				setState(44);
				match(IDENTIFIER);
				setState(45);
				match(SEMICOLON);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(46);
				match(SEARCH);
				setState(47);
				match(CATEGORY);
				setState(48);
				match(IDENTIFIER);
				setState(49);
				match(SEMICOLON);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(50);
				match(SEARCH);
				setState(51);
				match(DESCRIPTION);
				setState(52);
				match(IDENTIFIER);
				setState(53);
				match(SEMICOLON);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(54);
				match(SEARCH);
				setState(55);
				match(NAME);
				setState(56);
				match(IDENTIFIER);
				setState(57);
				match(SEMICOLON);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(58);
				match(SHOW);
				setState(59);
				match(HISTORY);
				setState(60);
				match(SEMICOLON);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(61);
				match(SORT);
				setState(62);
				match(BY);
				setState(63);
				match(NAME);
				setState(64);
				match(SEMICOLON);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(65);
				match(HELP);
				setState(66);
				match(SEMICOLON);
				}
				break;
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26H\4\2\t\2\4\3\t"+
		"\3\3\2\6\2\b\n\2\r\2\16\2\t\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3F\n\3\3\3\2\2\4"+
		"\2\4\2\2\2S\2\7\3\2\2\2\4E\3\2\2\2\6\b\5\4\3\2\7\6\3\2\2\2\b\t\3\2\2\2"+
		"\t\7\3\2\2\2\t\n\3\2\2\2\n\13\3\2\2\2\13\f\7\2\2\3\f\3\3\2\2\2\r\16\7"+
		"\3\2\2\16\17\7\23\2\2\17\20\7\21\2\2\20\21\7\24\2\2\21\22\7\17\2\2\22"+
		"\23\7\23\2\2\23\24\7\16\2\2\24\25\7\23\2\2\25F\7\22\2\2\26\27\7\4\2\2"+
		"\27\30\7\23\2\2\30F\7\22\2\2\31\32\7\5\2\2\32\33\7\23\2\2\33\34\7\21\2"+
		"\2\34\35\7\24\2\2\35F\7\22\2\2\36\37\7\5\2\2\37 \7\23\2\2 !\7\17\2\2!"+
		"\"\7\23\2\2\"F\7\22\2\2#$\7\5\2\2$%\7\23\2\2%&\7\16\2\2&\'\7\23\2\2\'"+
		"F\7\22\2\2()\7\6\2\2)F\7\22\2\2*+\7\7\2\2+,\7\23\2\2,F\7\22\2\2-.\7\b"+
		"\2\2./\7\23\2\2/F\7\22\2\2\60\61\7\t\2\2\61\62\7\16\2\2\62\63\7\23\2\2"+
		"\63F\7\22\2\2\64\65\7\t\2\2\65\66\7\17\2\2\66\67\7\23\2\2\67F\7\22\2\2"+
		"89\7\t\2\29:\7\r\2\2:;\7\23\2\2;F\7\22\2\2<=\7\6\2\2=>\7\n\2\2>F\7\22"+
		"\2\2?@\7\13\2\2@A\7\f\2\2AB\7\r\2\2BF\7\22\2\2CD\7\20\2\2DF\7\22\2\2E"+
		"\r\3\2\2\2E\26\3\2\2\2E\31\3\2\2\2E\36\3\2\2\2E#\3\2\2\2E(\3\2\2\2E*\3"+
		"\2\2\2E-\3\2\2\2E\60\3\2\2\2E\64\3\2\2\2E8\3\2\2\2E<\3\2\2\2E?\3\2\2\2"+
		"EC\3\2\2\2F\5\3\2\2\2\4\tE";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}