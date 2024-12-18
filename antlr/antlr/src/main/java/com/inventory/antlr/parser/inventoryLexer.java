// Generated from inventory.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class inventoryLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=1, REMOVE=2, UPDATE=3, SHOW=4, SAVE=5, LOAD=6, SEARCH=7, HISTORY=8, 
		SORT=9, BY=10, NAME=11, CATEGORY=12, DESCRIPTION=13, HELP=14, ASSIGN=15, 
		SEMICOLON=16, IDENTIFIER=17, NUMBER=18, WS=19, ERROR=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ADD", "REMOVE", "UPDATE", "SHOW", "SAVE", "LOAD", "SEARCH", "HISTORY", 
			"SORT", "BY", "NAME", "CATEGORY", "DESCRIPTION", "HELP", "ASSIGN", "SEMICOLON", 
			"IDENTIFIER", "NUMBER", "WS", "ERROR"
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


	public inventoryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "inventory.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u009b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\7\22\u0089\n\22\f\22\16\22\u008c\13\22\3\23\6\23\u008f"+
		"\n\23\r\23\16\23\u0090\3\24\6\24\u0094\n\24\r\24\16\24\u0095\3\24\3\24"+
		"\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26\3\2\6\5\2C\\aac|\6\2\62;C\\"+
		"aac|\3\2\62;\5\2\13\f\17\17\"\"\2\u009d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\3+\3\2\2\2\5/\3\2\2\2\7\66\3\2\2\2\t=\3\2\2\2\13B\3\2\2\2\rG"+
		"\3\2\2\2\17L\3\2\2\2\21S\3\2\2\2\23[\3\2\2\2\25`\3\2\2\2\27c\3\2\2\2\31"+
		"h\3\2\2\2\33q\3\2\2\2\35}\3\2\2\2\37\u0082\3\2\2\2!\u0084\3\2\2\2#\u0086"+
		"\3\2\2\2%\u008e\3\2\2\2\'\u0093\3\2\2\2)\u0099\3\2\2\2+,\7c\2\2,-\7f\2"+
		"\2-.\7f\2\2.\4\3\2\2\2/\60\7t\2\2\60\61\7g\2\2\61\62\7o\2\2\62\63\7q\2"+
		"\2\63\64\7x\2\2\64\65\7g\2\2\65\6\3\2\2\2\66\67\7w\2\2\678\7r\2\289\7"+
		"f\2\29:\7c\2\2:;\7v\2\2;<\7g\2\2<\b\3\2\2\2=>\7u\2\2>?\7j\2\2?@\7q\2\2"+
		"@A\7y\2\2A\n\3\2\2\2BC\7u\2\2CD\7c\2\2DE\7x\2\2EF\7g\2\2F\f\3\2\2\2GH"+
		"\7n\2\2HI\7q\2\2IJ\7c\2\2JK\7f\2\2K\16\3\2\2\2LM\7u\2\2MN\7g\2\2NO\7c"+
		"\2\2OP\7t\2\2PQ\7e\2\2QR\7j\2\2R\20\3\2\2\2ST\7j\2\2TU\7k\2\2UV\7u\2\2"+
		"VW\7v\2\2WX\7q\2\2XY\7t\2\2YZ\7{\2\2Z\22\3\2\2\2[\\\7u\2\2\\]\7q\2\2]"+
		"^\7t\2\2^_\7v\2\2_\24\3\2\2\2`a\7d\2\2ab\7{\2\2b\26\3\2\2\2cd\7p\2\2d"+
		"e\7c\2\2ef\7o\2\2fg\7g\2\2g\30\3\2\2\2hi\7e\2\2ij\7c\2\2jk\7v\2\2kl\7"+
		"g\2\2lm\7i\2\2mn\7q\2\2no\7t\2\2op\7{\2\2p\32\3\2\2\2qr\7f\2\2rs\7g\2"+
		"\2st\7u\2\2tu\7e\2\2uv\7t\2\2vw\7k\2\2wx\7r\2\2xy\7v\2\2yz\7k\2\2z{\7"+
		"q\2\2{|\7p\2\2|\34\3\2\2\2}~\7j\2\2~\177\7g\2\2\177\u0080\7n\2\2\u0080"+
		"\u0081\7r\2\2\u0081\36\3\2\2\2\u0082\u0083\7?\2\2\u0083 \3\2\2\2\u0084"+
		"\u0085\7=\2\2\u0085\"\3\2\2\2\u0086\u008a\t\2\2\2\u0087\u0089\t\3\2\2"+
		"\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b$\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008f\t\4\2\2\u008e"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091&\3\2\2\2\u0092\u0094\t\5\2\2\u0093\u0092\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0098\b\24\2\2\u0098(\3\2\2\2\u0099\u009a\13\2\2\2\u009a*\3\2\2\2\6\2"+
		"\u008a\u0090\u0095\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}