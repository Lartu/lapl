// Generated from /home/martu/Desktop/Link to LAPL/lapl.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class laplLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MULTICOMMENT=1, MULTICOMMENTB=2, COMMENT=3, COMMENTB=4, WHITESPACE=5, 
		EQ_OP=6, NEQ_OP=7, LT_OP=8, GT_OP=9, LE_OP=10, GE_OP=11, PLUS_OP=12, MINUS_OP=13, 
		POW_OP=14, TIMES_OP=15, DIV_OP=16, MOD_OP=17, ASSIGN_OP=18, CONCAT_OP=19, 
		LPAR=20, RPAR=21, SEMICOLON=22, COLON=23, BLOCK_OPEN=24, BLOCK_CLOSE=25, 
		INDEX_ACCESS_O=26, INDEX_ACCESS_C=27, VARIABLE=28, COMMA=29, REF_OP=30, 
		FLOOR_OP=31, CEIL_OP=32, NOT_OP=33, OR_OP=34, AND_OP=35, STR_OP=36, NUM_OP=37, 
		BOOLOP=38, WHILE=39, CONTINUE=40, BREAK=41, IF=42, ELSE=43, DISPLAY=44, 
		EXIT=45, TRUE=46, FALSE=47, RETURN=48, FUNCTION=49, ARRAY=50, MAP=51, 
		LINEFEED=52, CRLF=53, TYPE=54, VAR=55, IDENTIFIER=56, NUMBER=57, QUOTE=58, 
		DQUOTE=59, CHAR=60, DCHAR=61, ESCAPEDCHAR=62, STRING=63;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"MULTICOMMENT", "MULTICOMMENTB", "COMMENT", "COMMENTB", "WHITESPACE", 
		"EQ_OP", "NEQ_OP", "LT_OP", "GT_OP", "LE_OP", "GE_OP", "PLUS_OP", "MINUS_OP", 
		"POW_OP", "TIMES_OP", "DIV_OP", "MOD_OP", "ASSIGN_OP", "CONCAT_OP", "LPAR", 
		"RPAR", "SEMICOLON", "COLON", "BLOCK_OPEN", "BLOCK_CLOSE", "INDEX_ACCESS_O", 
		"INDEX_ACCESS_C", "VARIABLE", "COMMA", "REF_OP", "FLOOR_OP", "CEIL_OP", 
		"NOT_OP", "OR_OP", "AND_OP", "STR_OP", "NUM_OP", "BOOLOP", "WHILE", "CONTINUE", 
		"BREAK", "IF", "ELSE", "DISPLAY", "EXIT", "TRUE", "FALSE", "RETURN", "FUNCTION", 
		"ARRAY", "MAP", "LINEFEED", "CRLF", "TYPE", "VAR", "IDENTIFIER", "NUMBER", 
		"QUOTE", "DQUOTE", "CHAR", "DCHAR", "ESCAPEDCHAR", "STRING"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'=='", "'!='", "'<'", "'>'", "'<='", 
		"'>='", "'+'", "'-'", "'**'", "'*'", "'/'", "'%'", "'='", "'&'", "'('", 
		"')'", "';'", "':'", "'{'", "'}'", "'['", "']'", null, "','", "'ref'", 
		"'floor'", "'ceil'", "'not'", "'or'", "'and'", "'str'", "'num'", "'bool'", 
		"'while'", "'continue'", "'break'", "'if'", "'else'", "'display'", "'exit'", 
		"'true'", "'false'", "'return'", "'fun'", "'array'", "'map'", "'lf'", 
		"'crlf'", "'type'", "'var'", null, null, "'''", "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MULTICOMMENT", "MULTICOMMENTB", "COMMENT", "COMMENTB", "WHITESPACE", 
		"EQ_OP", "NEQ_OP", "LT_OP", "GT_OP", "LE_OP", "GE_OP", "PLUS_OP", "MINUS_OP", 
		"POW_OP", "TIMES_OP", "DIV_OP", "MOD_OP", "ASSIGN_OP", "CONCAT_OP", "LPAR", 
		"RPAR", "SEMICOLON", "COLON", "BLOCK_OPEN", "BLOCK_CLOSE", "INDEX_ACCESS_O", 
		"INDEX_ACCESS_C", "VARIABLE", "COMMA", "REF_OP", "FLOOR_OP", "CEIL_OP", 
		"NOT_OP", "OR_OP", "AND_OP", "STR_OP", "NUM_OP", "BOOLOP", "WHILE", "CONTINUE", 
		"BREAK", "IF", "ELSE", "DISPLAY", "EXIT", "TRUE", "FALSE", "RETURN", "FUNCTION", 
		"ARRAY", "MAP", "LINEFEED", "CRLF", "TYPE", "VAR", "IDENTIFIER", "NUMBER", 
		"QUOTE", "DQUOTE", "CHAR", "DCHAR", "ESCAPEDCHAR", "STRING"
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


	public laplLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "lapl.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2A\u01ad\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\2\3\2\7\2\u0086\n\2\f\2\16\2\u0089\13\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\u0094\n\3\f\3\16\3\u0097\13\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\7\4\u00a0\n\4\f\4\16\4\u00a3\13\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\7\5\u00ad\n\5\f\5\16\5\u00b0\13\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\7\35\u00ee\n\35"+
		"\f\35\16\35\u00f1\13\35\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3"+
		" \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3&\3"+
		"&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67"+
		"\3\67\3\67\3\67\3\67\38\38\38\38\39\39\79\u0179\n9\f9\169\u017c\139\3"+
		":\6:\u017f\n:\r:\16:\u0180\3:\3:\6:\u0185\n:\r:\16:\u0186\5:\u0189\n:"+
		"\3;\3;\3<\3<\3=\3=\5=\u0191\n=\3>\3>\5>\u0195\n>\3?\3?\3?\3@\3@\7@\u019c"+
		"\n@\f@\16@\u019f\13@\3@\3@\3@\3@\7@\u01a5\n@\f@\16@\u01a8\13@\3@\3@\5"+
		"@\u01ac\n@\6\u0087\u0095\u00a1\u00ae\2A\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
		"-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\3\2\b\5\2"+
		"\13\f\17\17\"\"\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\3\2))\3\2$$\2\u01ba"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
		"{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\3\u0081\3\2\2\2\5\u008f\3\2\2\2\7\u009d"+
		"\3\2\2\2\t\u00a8\3\2\2\2\13\u00b5\3\2\2\2\r\u00b9\3\2\2\2\17\u00bc\3\2"+
		"\2\2\21\u00bf\3\2\2\2\23\u00c1\3\2\2\2\25\u00c3\3\2\2\2\27\u00c6\3\2\2"+
		"\2\31\u00c9\3\2\2\2\33\u00cb\3\2\2\2\35\u00cd\3\2\2\2\37\u00d0\3\2\2\2"+
		"!\u00d2\3\2\2\2#\u00d4\3\2\2\2%\u00d6\3\2\2\2\'\u00d8\3\2\2\2)\u00da\3"+
		"\2\2\2+\u00dc\3\2\2\2-\u00de\3\2\2\2/\u00e0\3\2\2\2\61\u00e2\3\2\2\2\63"+
		"\u00e4\3\2\2\2\65\u00e6\3\2\2\2\67\u00e8\3\2\2\29\u00ea\3\2\2\2;\u00f2"+
		"\3\2\2\2=\u00f4\3\2\2\2?\u00f8\3\2\2\2A\u00fe\3\2\2\2C\u0103\3\2\2\2E"+
		"\u0107\3\2\2\2G\u010a\3\2\2\2I\u010e\3\2\2\2K\u0112\3\2\2\2M\u0116\3\2"+
		"\2\2O\u011b\3\2\2\2Q\u0121\3\2\2\2S\u012a\3\2\2\2U\u0130\3\2\2\2W\u0133"+
		"\3\2\2\2Y\u0138\3\2\2\2[\u0140\3\2\2\2]\u0145\3\2\2\2_\u014a\3\2\2\2a"+
		"\u0150\3\2\2\2c\u0157\3\2\2\2e\u015b\3\2\2\2g\u0161\3\2\2\2i\u0165\3\2"+
		"\2\2k\u0168\3\2\2\2m\u016d\3\2\2\2o\u0172\3\2\2\2q\u0176\3\2\2\2s\u017e"+
		"\3\2\2\2u\u018a\3\2\2\2w\u018c\3\2\2\2y\u0190\3\2\2\2{\u0194\3\2\2\2}"+
		"\u0196\3\2\2\2\177\u01ab\3\2\2\2\u0081\u0082\7\61\2\2\u0082\u0083\7,\2"+
		"\2\u0083\u0087\3\2\2\2\u0084\u0086\13\2\2\2\u0085\u0084\3\2\2\2\u0086"+
		"\u0089\3\2\2\2\u0087\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008a\3\2"+
		"\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7,\2\2\u008b\u008c\7\61\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008e\b\2\2\2\u008e\4\3\2\2\2\u008f\u0090\7%\2\2"+
		"\u0090\u0091\7,\2\2\u0091\u0095\3\2\2\2\u0092\u0094\13\2\2\2\u0093\u0092"+
		"\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096"+
		"\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7,\2\2\u0099\u009a\7%\2"+
		"\2\u009a\u009b\3\2\2\2\u009b\u009c\b\3\2\2\u009c\6\3\2\2\2\u009d\u00a1"+
		"\7%\2\2\u009e\u00a0\13\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2"+
		"\2\2\u00a4\u00a5\7\f\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\b\4\2\2\u00a7"+
		"\b\3\2\2\2\u00a8\u00a9\7\61\2\2\u00a9\u00aa\7\61\2\2\u00aa\u00ae\3\2\2"+
		"\2\u00ab\u00ad\13\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b1\u00b2\7\f\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\b\5\2\2\u00b4"+
		"\n\3\2\2\2\u00b5\u00b6\t\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\b\6\2\2"+
		"\u00b8\f\3\2\2\2\u00b9\u00ba\7?\2\2\u00ba\u00bb\7?\2\2\u00bb\16\3\2\2"+
		"\2\u00bc\u00bd\7#\2\2\u00bd\u00be\7?\2\2\u00be\20\3\2\2\2\u00bf\u00c0"+
		"\7>\2\2\u00c0\22\3\2\2\2\u00c1\u00c2\7@\2\2\u00c2\24\3\2\2\2\u00c3\u00c4"+
		"\7>\2\2\u00c4\u00c5\7?\2\2\u00c5\26\3\2\2\2\u00c6\u00c7\7@\2\2\u00c7\u00c8"+
		"\7?\2\2\u00c8\30\3\2\2\2\u00c9\u00ca\7-\2\2\u00ca\32\3\2\2\2\u00cb\u00cc"+
		"\7/\2\2\u00cc\34\3\2\2\2\u00cd\u00ce\7,\2\2\u00ce\u00cf\7,\2\2\u00cf\36"+
		"\3\2\2\2\u00d0\u00d1\7,\2\2\u00d1 \3\2\2\2\u00d2\u00d3\7\61\2\2\u00d3"+
		"\"\3\2\2\2\u00d4\u00d5\7\'\2\2\u00d5$\3\2\2\2\u00d6\u00d7\7?\2\2\u00d7"+
		"&\3\2\2\2\u00d8\u00d9\7(\2\2\u00d9(\3\2\2\2\u00da\u00db\7*\2\2\u00db*"+
		"\3\2\2\2\u00dc\u00dd\7+\2\2\u00dd,\3\2\2\2\u00de\u00df\7=\2\2\u00df.\3"+
		"\2\2\2\u00e0\u00e1\7<\2\2\u00e1\60\3\2\2\2\u00e2\u00e3\7}\2\2\u00e3\62"+
		"\3\2\2\2\u00e4\u00e5\7\177\2\2\u00e5\64\3\2\2\2\u00e6\u00e7\7]\2\2\u00e7"+
		"\66\3\2\2\2\u00e8\u00e9\7_\2\2\u00e98\3\2\2\2\u00ea\u00eb\7&\2\2\u00eb"+
		"\u00ef\t\3\2\2\u00ec\u00ee\t\4\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2"+
		"\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0:\3\2\2\2\u00f1\u00ef"+
		"\3\2\2\2\u00f2\u00f3\7.\2\2\u00f3<\3\2\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6"+
		"\7g\2\2\u00f6\u00f7\7h\2\2\u00f7>\3\2\2\2\u00f8\u00f9\7h\2\2\u00f9\u00fa"+
		"\7n\2\2\u00fa\u00fb\7q\2\2\u00fb\u00fc\7q\2\2\u00fc\u00fd\7t\2\2\u00fd"+
		"@\3\2\2\2\u00fe\u00ff\7e\2\2\u00ff\u0100\7g\2\2\u0100\u0101\7k\2\2\u0101"+
		"\u0102\7n\2\2\u0102B\3\2\2\2\u0103\u0104\7p\2\2\u0104\u0105\7q\2\2\u0105"+
		"\u0106\7v\2\2\u0106D\3\2\2\2\u0107\u0108\7q\2\2\u0108\u0109\7t\2\2\u0109"+
		"F\3\2\2\2\u010a\u010b\7c\2\2\u010b\u010c\7p\2\2\u010c\u010d\7f\2\2\u010d"+
		"H\3\2\2\2\u010e\u010f\7u\2\2\u010f\u0110\7v\2\2\u0110\u0111\7t\2\2\u0111"+
		"J\3\2\2\2\u0112\u0113\7p\2\2\u0113\u0114\7w\2\2\u0114\u0115\7o\2\2\u0115"+
		"L\3\2\2\2\u0116\u0117\7d\2\2\u0117\u0118\7q\2\2\u0118\u0119\7q\2\2\u0119"+
		"\u011a\7n\2\2\u011aN\3\2\2\2\u011b\u011c\7y\2\2\u011c\u011d\7j\2\2\u011d"+
		"\u011e\7k\2\2\u011e\u011f\7n\2\2\u011f\u0120\7g\2\2\u0120P\3\2\2\2\u0121"+
		"\u0122\7e\2\2\u0122\u0123\7q\2\2\u0123\u0124\7p\2\2\u0124\u0125\7v\2\2"+
		"\u0125\u0126\7k\2\2\u0126\u0127\7p\2\2\u0127\u0128\7w\2\2\u0128\u0129"+
		"\7g\2\2\u0129R\3\2\2\2\u012a\u012b\7d\2\2\u012b\u012c\7t\2\2\u012c\u012d"+
		"\7g\2\2\u012d\u012e\7c\2\2\u012e\u012f\7m\2\2\u012fT\3\2\2\2\u0130\u0131"+
		"\7k\2\2\u0131\u0132\7h\2\2\u0132V\3\2\2\2\u0133\u0134\7g\2\2\u0134\u0135"+
		"\7n\2\2\u0135\u0136\7u\2\2\u0136\u0137\7g\2\2\u0137X\3\2\2\2\u0138\u0139"+
		"\7f\2\2\u0139\u013a\7k\2\2\u013a\u013b\7u\2\2\u013b\u013c\7r\2\2\u013c"+
		"\u013d\7n\2\2\u013d\u013e\7c\2\2\u013e\u013f\7{\2\2\u013fZ\3\2\2\2\u0140"+
		"\u0141\7g\2\2\u0141\u0142\7z\2\2\u0142\u0143\7k\2\2\u0143\u0144\7v\2\2"+
		"\u0144\\\3\2\2\2\u0145\u0146\7v\2\2\u0146\u0147\7t\2\2\u0147\u0148\7w"+
		"\2\2\u0148\u0149\7g\2\2\u0149^\3\2\2\2\u014a\u014b\7h\2\2\u014b\u014c"+
		"\7c\2\2\u014c\u014d\7n\2\2\u014d\u014e\7u\2\2\u014e\u014f\7g\2\2\u014f"+
		"`\3\2\2\2\u0150\u0151\7t\2\2\u0151\u0152\7g\2\2\u0152\u0153\7v\2\2\u0153"+
		"\u0154\7w\2\2\u0154\u0155\7t\2\2\u0155\u0156\7p\2\2\u0156b\3\2\2\2\u0157"+
		"\u0158\7h\2\2\u0158\u0159\7w\2\2\u0159\u015a\7p\2\2\u015ad\3\2\2\2\u015b"+
		"\u015c\7c\2\2\u015c\u015d\7t\2\2\u015d\u015e\7t\2\2\u015e\u015f\7c\2\2"+
		"\u015f\u0160\7{\2\2\u0160f\3\2\2\2\u0161\u0162\7o\2\2\u0162\u0163\7c\2"+
		"\2\u0163\u0164\7r\2\2\u0164h\3\2\2\2\u0165\u0166\7n\2\2\u0166\u0167\7"+
		"h\2\2\u0167j\3\2\2\2\u0168\u0169\7e\2\2\u0169\u016a\7t\2\2\u016a\u016b"+
		"\7n\2\2\u016b\u016c\7h\2\2\u016cl\3\2\2\2\u016d\u016e\7v\2\2\u016e\u016f"+
		"\7{\2\2\u016f\u0170\7r\2\2\u0170\u0171\7g\2\2\u0171n\3\2\2\2\u0172\u0173"+
		"\7x\2\2\u0173\u0174\7c\2\2\u0174\u0175\7t\2\2\u0175p\3\2\2\2\u0176\u017a"+
		"\t\3\2\2\u0177\u0179\t\4\2\2\u0178\u0177\3\2\2\2\u0179\u017c\3\2\2\2\u017a"+
		"\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017br\3\2\2\2\u017c\u017a\3\2\2\2"+
		"\u017d\u017f\t\5\2\2\u017e\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u017e"+
		"\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0188\3\2\2\2\u0182\u0184\7\60\2\2"+
		"\u0183\u0185\t\5\2\2\u0184\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0184"+
		"\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0189\3\2\2\2\u0188\u0182\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189t\3\2\2\2\u018a\u018b\7)\2\2\u018bv\3\2\2\2\u018c"+
		"\u018d\7$\2\2\u018dx\3\2\2\2\u018e\u0191\n\6\2\2\u018f\u0191\5}?\2\u0190"+
		"\u018e\3\2\2\2\u0190\u018f\3\2\2\2\u0191z\3\2\2\2\u0192\u0195\n\7\2\2"+
		"\u0193\u0195\5}?\2\u0194\u0192\3\2\2\2\u0194\u0193\3\2\2\2\u0195|\3\2"+
		"\2\2\u0196\u0197\7^\2\2\u0197\u0198\13\2\2\2\u0198~\3\2\2\2\u0199\u019d"+
		"\5u;\2\u019a\u019c\5y=\2\u019b\u019a\3\2\2\2\u019c\u019f\3\2\2\2\u019d"+
		"\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a0\3\2\2\2\u019f\u019d\3\2"+
		"\2\2\u01a0\u01a1\5u;\2\u01a1\u01ac\3\2\2\2\u01a2\u01a6\5w<\2\u01a3\u01a5"+
		"\5{>\2\u01a4\u01a3\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7\u01a9\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01aa\5w"+
		"<\2\u01aa\u01ac\3\2\2\2\u01ab\u0199\3\2\2\2\u01ab\u01a2\3\2\2\2\u01ac"+
		"\u0080\3\2\2\2\21\2\u0087\u0095\u00a1\u00ae\u00ef\u017a\u0180\u0186\u0188"+
		"\u0190\u0194\u019d\u01a6\u01ab\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}