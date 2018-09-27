package kcai.calc;

// Generated from calculator.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class calculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, DOUBLE=2, SCIENTIFIC_NUMBER=3, COS=4, SIN=5, TAN=6, ACOS=7, ASIN=8, 
		ATAN=9, LN=10, LOG=11, SQRT=12, LPAREN=13, RPAREN=14, PLUS=15, MINUS=16, 
		TIMES=17, DIV=18, GT=19, LT=20, EQ=21, COMMA=22, POINT=23, POW=24, PI=25, 
		EULER=26, I=27, VARIABLE=28, NUMBER=29, NEWLINE=30, WS=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INT", "DOUBLE", "SCIENTIFIC_NUMBER", "COS", "SIN", "TAN", "ACOS", "ASIN", 
		"ATAN", "LN", "LOG", "SQRT", "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", 
		"DIV", "GT", "LT", "EQ", "COMMA", "POINT", "POW", "PI", "EULER", "I", 
		"VARIABLE", "VALID_ID_START", "VALID_ID_CHAR", "NUMBER", "E1", "E2", "SIGN", 
		"NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'cos'", "'sin'", "'tan'", "'acos'", "'asin'", 
		"'atan'", "'ln'", "'log'", "'sqrt'", "'('", "')'", "'+'", "'-'", "'*'", 
		"'/'", "'>'", "'<'", "'='", "','", "'.'", "'^'", "'pi'", null, "'i'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT", "DOUBLE", "SCIENTIFIC_NUMBER", "COS", "SIN", "TAN", "ACOS", 
		"ASIN", "ATAN", "LN", "LOG", "SQRT", "LPAREN", "RPAREN", "PLUS", "MINUS", 
		"TIMES", "DIV", "GT", "LT", "EQ", "COMMA", "POINT", "POW", "PI", "EULER", 
		"I", "VARIABLE", "NUMBER", "NEWLINE", "WS"
	};
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


	public calculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "calculator.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00dc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\6\2M\n\2\r\2\16\2N\3\3\6\3R\n\3\r\3"+
		"\16\3S\3\3\3\3\6\3X\n\3\r\3\16\3Y\3\4\6\4]\n\4\r\4\16\4^\3\4\3\4\5\4c"+
		"\n\4\3\4\5\4f\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\7\35\u00b2\n\35\f\35\16\35\u00b5\13\35\3\36\5\36\u00b8\n\36\3\37\3\37"+
		"\5\37\u00bc\n\37\3 \6 \u00bf\n \r \16 \u00c0\3 \3 \6 \u00c5\n \r \16 "+
		"\u00c6\5 \u00c9\n \3!\3!\3\"\3\"\3#\3#\3$\5$\u00d2\n$\3$\3$\3%\6%\u00d7"+
		"\n%\r%\16%\u00d8\3%\3%\2\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\2=\2?\37A\2C\2E\2G I!\3\2\6\3\2\62;\5\2C\\aac"+
		"|\4\2--//\5\2\13\f\17\17\"\"\2\u00e3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2?\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3L\3\2"+
		"\2\2\5Q\3\2\2\2\7\\\3\2\2\2\ti\3\2\2\2\13m\3\2\2\2\rq\3\2\2\2\17u\3\2"+
		"\2\2\21z\3\2\2\2\23\177\3\2\2\2\25\u0084\3\2\2\2\27\u0087\3\2\2\2\31\u008b"+
		"\3\2\2\2\33\u0090\3\2\2\2\35\u0092\3\2\2\2\37\u0094\3\2\2\2!\u0096\3\2"+
		"\2\2#\u0098\3\2\2\2%\u009a\3\2\2\2\'\u009c\3\2\2\2)\u009e\3\2\2\2+\u00a0"+
		"\3\2\2\2-\u00a2\3\2\2\2/\u00a4\3\2\2\2\61\u00a6\3\2\2\2\63\u00a8\3\2\2"+
		"\2\65\u00ab\3\2\2\2\67\u00ad\3\2\2\29\u00af\3\2\2\2;\u00b7\3\2\2\2=\u00bb"+
		"\3\2\2\2?\u00be\3\2\2\2A\u00ca\3\2\2\2C\u00cc\3\2\2\2E\u00ce\3\2\2\2G"+
		"\u00d1\3\2\2\2I\u00d6\3\2\2\2KM\t\2\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2"+
		"NO\3\2\2\2O\4\3\2\2\2PR\t\2\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2"+
		"\2TU\3\2\2\2UW\7\60\2\2VX\t\2\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2"+
		"\2\2Z\6\3\2\2\2[]\5\3\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_b"+
		"\3\2\2\2`c\5A!\2ac\5C\"\2b`\3\2\2\2ba\3\2\2\2ce\3\2\2\2df\5E#\2ed\3\2"+
		"\2\2ef\3\2\2\2fg\3\2\2\2gh\5? \2h\b\3\2\2\2ij\7e\2\2jk\7q\2\2kl\7u\2\2"+
		"l\n\3\2\2\2mn\7u\2\2no\7k\2\2op\7p\2\2p\f\3\2\2\2qr\7v\2\2rs\7c\2\2st"+
		"\7p\2\2t\16\3\2\2\2uv\7c\2\2vw\7e\2\2wx\7q\2\2xy\7u\2\2y\20\3\2\2\2z{"+
		"\7c\2\2{|\7u\2\2|}\7k\2\2}~\7p\2\2~\22\3\2\2\2\177\u0080\7c\2\2\u0080"+
		"\u0081\7v\2\2\u0081\u0082\7c\2\2\u0082\u0083\7p\2\2\u0083\24\3\2\2\2\u0084"+
		"\u0085\7n\2\2\u0085\u0086\7p\2\2\u0086\26\3\2\2\2\u0087\u0088\7n\2\2\u0088"+
		"\u0089\7q\2\2\u0089\u008a\7i\2\2\u008a\30\3\2\2\2\u008b\u008c\7u\2\2\u008c"+
		"\u008d\7s\2\2\u008d\u008e\7t\2\2\u008e\u008f\7v\2\2\u008f\32\3\2\2\2\u0090"+
		"\u0091\7*\2\2\u0091\34\3\2\2\2\u0092\u0093\7+\2\2\u0093\36\3\2\2\2\u0094"+
		"\u0095\7-\2\2\u0095 \3\2\2\2\u0096\u0097\7/\2\2\u0097\"\3\2\2\2\u0098"+
		"\u0099\7,\2\2\u0099$\3\2\2\2\u009a\u009b\7\61\2\2\u009b&\3\2\2\2\u009c"+
		"\u009d\7@\2\2\u009d(\3\2\2\2\u009e\u009f\7>\2\2\u009f*\3\2\2\2\u00a0\u00a1"+
		"\7?\2\2\u00a1,\3\2\2\2\u00a2\u00a3\7.\2\2\u00a3.\3\2\2\2\u00a4\u00a5\7"+
		"\60\2\2\u00a5\60\3\2\2\2\u00a6\u00a7\7`\2\2\u00a7\62\3\2\2\2\u00a8\u00a9"+
		"\7r\2\2\u00a9\u00aa\7k\2\2\u00aa\64\3\2\2\2\u00ab\u00ac\5C\"\2\u00ac\66"+
		"\3\2\2\2\u00ad\u00ae\7k\2\2\u00ae8\3\2\2\2\u00af\u00b3\5;\36\2\u00b0\u00b2"+
		"\5=\37\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4:\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b8\t\3\2\2"+
		"\u00b7\u00b6\3\2\2\2\u00b8<\3\2\2\2\u00b9\u00bc\5;\36\2\u00ba\u00bc\4"+
		"\62;\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc>\3\2\2\2\u00bd\u00bf"+
		"\4\62;\2\u00be\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c8\3\2\2\2\u00c2\u00c4\7\60\2\2\u00c3\u00c5\4"+
		"\62;\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c2\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9@\3\2\2\2\u00ca\u00cb\7G\2\2\u00cbB\3\2\2\2\u00cc\u00cd\7g\2"+
		"\2\u00cdD\3\2\2\2\u00ce\u00cf\t\4\2\2\u00cfF\3\2\2\2\u00d0\u00d2\7\17"+
		"\2\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d4\7\f\2\2\u00d4H\3\2\2\2\u00d5\u00d7\t\5\2\2\u00d6\u00d5\3\2\2\2"+
		"\u00d7\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da"+
		"\3\2\2\2\u00da\u00db\b%\2\2\u00dbJ\3\2\2\2\21\2NSY^be\u00b3\u00b7\u00bb"+
		"\u00c0\u00c6\u00c8\u00d1\u00d8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}