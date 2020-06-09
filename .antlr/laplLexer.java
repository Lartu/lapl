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
		MULTICOMMENT=1, MULTICOMMENTB=2, MULTICOMMENTALL=3, MULTICOMMENTALLB=4, 
		COMMENT=5, COMMENTB=6, WHITESPACE=7, EQ_OP=8, NEQ_OP=9, LT_OP=10, GT_OP=11, 
		LE_OP=12, GE_OP=13, PLUS_OP=14, MINUS_OP=15, POW_OP=16, TIMES_OP=17, DIV_OP=18, 
		MOD_OP=19, ASSIGN_OP=20, CONCAT_OP=21, LPAR=22, RPAR=23, SEMICOLON=24, 
		COLON=25, BLOCK_OPEN=26, BLOCK_CLOSE=27, INDEX_ACCESS_O=28, INDEX_ACCESS_C=29, 
		VARIABLE=30, COMMA=31, REF_OP=32, FLOOR_OP=33, CEIL_OP=34, NOT_OP=35, 
		OR_OP=36, AND_OP=37, STR_OP=38, NUM_OP=39, BOOLOP=40, WHILE=41, CONTINUE=42, 
		BREAK=43, IF=44, ELSE=45, DISPLAY=46, EXIT=47, TRUE=48, FALSE=49, RETURN=50, 
		FUNCTION=51, ARRAY=52, MAP=53, LINEFEED=54, CRLF=55, TYPE=56, IDENTIFIER=57, 
		NUMBER=58, QUOTE=59, DQUOTE=60, CHAR=61, DCHAR=62, ESCAPEDCHAR=63, STRING=64;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"MULTICOMMENT", "MULTICOMMENTB", "MULTICOMMENTALL", "MULTICOMMENTALLB", 
		"COMMENT", "COMMENTB", "WHITESPACE", "EQ_OP", "NEQ_OP", "LT_OP", "GT_OP", 
		"LE_OP", "GE_OP", "PLUS_OP", "MINUS_OP", "POW_OP", "TIMES_OP", "DIV_OP", 
		"MOD_OP", "ASSIGN_OP", "CONCAT_OP", "LPAR", "RPAR", "SEMICOLON", "COLON", 
		"BLOCK_OPEN", "BLOCK_CLOSE", "INDEX_ACCESS_O", "INDEX_ACCESS_C", "VARIABLE", 
		"COMMA", "REF_OP", "FLOOR_OP", "CEIL_OP", "NOT_OP", "OR_OP", "AND_OP", 
		"STR_OP", "NUM_OP", "BOOLOP", "WHILE", "CONTINUE", "BREAK", "IF", "ELSE", 
		"DISPLAY", "EXIT", "TRUE", "FALSE", "RETURN", "FUNCTION", "ARRAY", "MAP", 
		"LINEFEED", "CRLF", "TYPE", "IDENTIFIER", "NUMBER", "QUOTE", "DQUOTE", 
		"CHAR", "DCHAR", "ESCAPEDCHAR", "STRING"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, "'=='", "'!='", "'<'", 
		"'>'", "'<='", "'>='", "'+'", "'-'", "'**'", "'*'", "'/'", "'%'", "'='", 
		"'&'", "'('", "')'", "';'", "':'", "'{'", "'}'", "'['", "']'", null, "','", 
		"'ref'", "'floor'", "'ceil'", "'not'", "'or'", "'and'", "'str'", "'num'", 
		"'bool'", "'while'", "'continue'", "'break'", "'if'", "'else'", "'display'", 
		"'exit'", "'true'", "'false'", "'return'", "'fun'", "'array'", "'map'", 
		"'lf'", "'crlf'", "'type'", null, null, "'''", "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MULTICOMMENT", "MULTICOMMENTB", "MULTICOMMENTALL", "MULTICOMMENTALLB", 
		"COMMENT", "COMMENTB", "WHITESPACE", "EQ_OP", "NEQ_OP", "LT_OP", "GT_OP", 
		"LE_OP", "GE_OP", "PLUS_OP", "MINUS_OP", "POW_OP", "TIMES_OP", "DIV_OP", 
		"MOD_OP", "ASSIGN_OP", "CONCAT_OP", "LPAR", "RPAR", "SEMICOLON", "COLON", 
		"BLOCK_OPEN", "BLOCK_CLOSE", "INDEX_ACCESS_O", "INDEX_ACCESS_C", "VARIABLE", 
		"COMMA", "REF_OP", "FLOOR_OP", "CEIL_OP", "NOT_OP", "OR_OP", "AND_OP", 
		"STR_OP", "NUM_OP", "BOOLOP", "WHILE", "CONTINUE", "BREAK", "IF", "ELSE", 
		"DISPLAY", "EXIT", "TRUE", "FALSE", "RETURN", "FUNCTION", "ARRAY", "MAP", 
		"LINEFEED", "CRLF", "TYPE", "IDENTIFIER", "NUMBER", "QUOTE", "DQUOTE", 
		"CHAR", "DCHAR", "ESCAPEDCHAR", "STRING"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2B\u01c5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\3\2\3\2\7\2\u0088\n\2\f\2\16\2\u008b"+
		"\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\u0096\n\3\f\3\16\3\u0099"+
		"\13\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4\u00a4\n\4\f\4\16\4\u00a7"+
		"\13\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5\u00b1\n\5\f\5\16\5\u00b4\13"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\7\6\u00bc\n\6\f\6\16\6\u00bf\13\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\7\7\u00c9\n\7\f\7\16\7\u00cc\13\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\7\37\u010a"+
		"\n\37\f\37\16\37\u010d\13\37\3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		",\3,\3,\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\38\3"+
		"8\39\39\39\39\39\3:\3:\7:\u0191\n:\f:\16:\u0194\13:\3;\6;\u0197\n;\r;"+
		"\16;\u0198\3;\3;\6;\u019d\n;\r;\16;\u019e\5;\u01a1\n;\3<\3<\3=\3=\3>\3"+
		">\5>\u01a9\n>\3?\3?\5?\u01ad\n?\3@\3@\3@\3A\3A\7A\u01b4\nA\fA\16A\u01b7"+
		"\13A\3A\3A\3A\3A\7A\u01bd\nA\fA\16A\u01c0\13A\3A\3A\5A\u01c4\nA\b\u0089"+
		"\u0097\u00a5\u00b2\u00bd\u00ca\2B\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\3\2\b\5\2\13"+
		"\f\17\17\"\"\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\3\2))\3\2$$\2\u01d4\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2"+
		"o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3"+
		"\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\3\u0083\3\2\2\2\5\u0091"+
		"\3\2\2\2\7\u009f\3\2\2\2\t\u00ac\3\2\2\2\13\u00b9\3\2\2\2\r\u00c4\3\2"+
		"\2\2\17\u00d1\3\2\2\2\21\u00d5\3\2\2\2\23\u00d8\3\2\2\2\25\u00db\3\2\2"+
		"\2\27\u00dd\3\2\2\2\31\u00df\3\2\2\2\33\u00e2\3\2\2\2\35\u00e5\3\2\2\2"+
		"\37\u00e7\3\2\2\2!\u00e9\3\2\2\2#\u00ec\3\2\2\2%\u00ee\3\2\2\2\'\u00f0"+
		"\3\2\2\2)\u00f2\3\2\2\2+\u00f4\3\2\2\2-\u00f6\3\2\2\2/\u00f8\3\2\2\2\61"+
		"\u00fa\3\2\2\2\63\u00fc\3\2\2\2\65\u00fe\3\2\2\2\67\u0100\3\2\2\29\u0102"+
		"\3\2\2\2;\u0104\3\2\2\2=\u0106\3\2\2\2?\u010e\3\2\2\2A\u0110\3\2\2\2C"+
		"\u0114\3\2\2\2E\u011a\3\2\2\2G\u011f\3\2\2\2I\u0123\3\2\2\2K\u0126\3\2"+
		"\2\2M\u012a\3\2\2\2O\u012e\3\2\2\2Q\u0132\3\2\2\2S\u0137\3\2\2\2U\u013d"+
		"\3\2\2\2W\u0146\3\2\2\2Y\u014c\3\2\2\2[\u014f\3\2\2\2]\u0154\3\2\2\2_"+
		"\u015c\3\2\2\2a\u0161\3\2\2\2c\u0166\3\2\2\2e\u016c\3\2\2\2g\u0173\3\2"+
		"\2\2i\u0177\3\2\2\2k\u017d\3\2\2\2m\u0181\3\2\2\2o\u0184\3\2\2\2q\u0189"+
		"\3\2\2\2s\u018e\3\2\2\2u\u0196\3\2\2\2w\u01a2\3\2\2\2y\u01a4\3\2\2\2{"+
		"\u01a8\3\2\2\2}\u01ac\3\2\2\2\177\u01ae\3\2\2\2\u0081\u01c3\3\2\2\2\u0083"+
		"\u0084\7\61\2\2\u0084\u0085\7,\2\2\u0085\u0089\3\2\2\2\u0086\u0088\13"+
		"\2\2\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u008a\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7,"+
		"\2\2\u008d\u008e\7\61\2\2\u008e\u008f\3\2\2\2\u008f\u0090\b\2\2\2\u0090"+
		"\4\3\2\2\2\u0091\u0092\7%\2\2\u0092\u0093\7,\2\2\u0093\u0097\3\2\2\2\u0094"+
		"\u0096\13\2\2\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0098\3"+
		"\2\2\2\u0097\u0095\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a"+
		"\u009b\7,\2\2\u009b\u009c\7%\2\2\u009c\u009d\3\2\2\2\u009d\u009e\b\3\2"+
		"\2\u009e\6\3\2\2\2\u009f\u00a0\7\61\2\2\u00a0\u00a1\7,\2\2\u00a1\u00a5"+
		"\3\2\2\2\u00a2\u00a4\13\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2"+
		"\u00a5\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5"+
		"\3\2\2\2\u00a8\u00a9\7\2\2\3\u00a9\u00aa\3\2\2\2\u00aa\u00ab\b\4\2\2\u00ab"+
		"\b\3\2\2\2\u00ac\u00ad\7\61\2\2\u00ad\u00ae\7,\2\2\u00ae\u00b2\3\2\2\2"+
		"\u00af\u00b1\13\2\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b3"+
		"\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5"+
		"\u00b6\7\2\2\3\u00b6\u00b7\3\2\2\2\u00b7\u00b8\b\5\2\2\u00b8\n\3\2\2\2"+
		"\u00b9\u00bd\7%\2\2\u00ba\u00bc\13\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf"+
		"\3\2\2\2\u00bd\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00c0\u00c1\7\f\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\b\6"+
		"\2\2\u00c3\f\3\2\2\2\u00c4\u00c5\7\61\2\2\u00c5\u00c6\7\61\2\2\u00c6\u00ca"+
		"\3\2\2\2\u00c7\u00c9\13\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2"+
		"\u00ca\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca"+
		"\3\2\2\2\u00cd\u00ce\7\f\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\b\7\2\2\u00d0"+
		"\16\3\2\2\2\u00d1\u00d2\t\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\b\b\2"+
		"\2\u00d4\20\3\2\2\2\u00d5\u00d6\7?\2\2\u00d6\u00d7\7?\2\2\u00d7\22\3\2"+
		"\2\2\u00d8\u00d9\7#\2\2\u00d9\u00da\7?\2\2\u00da\24\3\2\2\2\u00db\u00dc"+
		"\7>\2\2\u00dc\26\3\2\2\2\u00dd\u00de\7@\2\2\u00de\30\3\2\2\2\u00df\u00e0"+
		"\7>\2\2\u00e0\u00e1\7?\2\2\u00e1\32\3\2\2\2\u00e2\u00e3\7@\2\2\u00e3\u00e4"+
		"\7?\2\2\u00e4\34\3\2\2\2\u00e5\u00e6\7-\2\2\u00e6\36\3\2\2\2\u00e7\u00e8"+
		"\7/\2\2\u00e8 \3\2\2\2\u00e9\u00ea\7,\2\2\u00ea\u00eb\7,\2\2\u00eb\"\3"+
		"\2\2\2\u00ec\u00ed\7,\2\2\u00ed$\3\2\2\2\u00ee\u00ef\7\61\2\2\u00ef&\3"+
		"\2\2\2\u00f0\u00f1\7\'\2\2\u00f1(\3\2\2\2\u00f2\u00f3\7?\2\2\u00f3*\3"+
		"\2\2\2\u00f4\u00f5\7(\2\2\u00f5,\3\2\2\2\u00f6\u00f7\7*\2\2\u00f7.\3\2"+
		"\2\2\u00f8\u00f9\7+\2\2\u00f9\60\3\2\2\2\u00fa\u00fb\7=\2\2\u00fb\62\3"+
		"\2\2\2\u00fc\u00fd\7<\2\2\u00fd\64\3\2\2\2\u00fe\u00ff\7}\2\2\u00ff\66"+
		"\3\2\2\2\u0100\u0101\7\177\2\2\u01018\3\2\2\2\u0102\u0103\7]\2\2\u0103"+
		":\3\2\2\2\u0104\u0105\7_\2\2\u0105<\3\2\2\2\u0106\u0107\7&\2\2\u0107\u010b"+
		"\t\3\2\2\u0108\u010a\t\4\2\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c>\3\2\2\2\u010d\u010b\3\2\2\2"+
		"\u010e\u010f\7.\2\2\u010f@\3\2\2\2\u0110\u0111\7t\2\2\u0111\u0112\7g\2"+
		"\2\u0112\u0113\7h\2\2\u0113B\3\2\2\2\u0114\u0115\7h\2\2\u0115\u0116\7"+
		"n\2\2\u0116\u0117\7q\2\2\u0117\u0118\7q\2\2\u0118\u0119\7t\2\2\u0119D"+
		"\3\2\2\2\u011a\u011b\7e\2\2\u011b\u011c\7g\2\2\u011c\u011d\7k\2\2\u011d"+
		"\u011e\7n\2\2\u011eF\3\2\2\2\u011f\u0120\7p\2\2\u0120\u0121\7q\2\2\u0121"+
		"\u0122\7v\2\2\u0122H\3\2\2\2\u0123\u0124\7q\2\2\u0124\u0125\7t\2\2\u0125"+
		"J\3\2\2\2\u0126\u0127\7c\2\2\u0127\u0128\7p\2\2\u0128\u0129\7f\2\2\u0129"+
		"L\3\2\2\2\u012a\u012b\7u\2\2\u012b\u012c\7v\2\2\u012c\u012d\7t\2\2\u012d"+
		"N\3\2\2\2\u012e\u012f\7p\2\2\u012f\u0130\7w\2\2\u0130\u0131\7o\2\2\u0131"+
		"P\3\2\2\2\u0132\u0133\7d\2\2\u0133\u0134\7q\2\2\u0134\u0135\7q\2\2\u0135"+
		"\u0136\7n\2\2\u0136R\3\2\2\2\u0137\u0138\7y\2\2\u0138\u0139\7j\2\2\u0139"+
		"\u013a\7k\2\2\u013a\u013b\7n\2\2\u013b\u013c\7g\2\2\u013cT\3\2\2\2\u013d"+
		"\u013e\7e\2\2\u013e\u013f\7q\2\2\u013f\u0140\7p\2\2\u0140\u0141\7v\2\2"+
		"\u0141\u0142\7k\2\2\u0142\u0143\7p\2\2\u0143\u0144\7w\2\2\u0144\u0145"+
		"\7g\2\2\u0145V\3\2\2\2\u0146\u0147\7d\2\2\u0147\u0148\7t\2\2\u0148\u0149"+
		"\7g\2\2\u0149\u014a\7c\2\2\u014a\u014b\7m\2\2\u014bX\3\2\2\2\u014c\u014d"+
		"\7k\2\2\u014d\u014e\7h\2\2\u014eZ\3\2\2\2\u014f\u0150\7g\2\2\u0150\u0151"+
		"\7n\2\2\u0151\u0152\7u\2\2\u0152\u0153\7g\2\2\u0153\\\3\2\2\2\u0154\u0155"+
		"\7f\2\2\u0155\u0156\7k\2\2\u0156\u0157\7u\2\2\u0157\u0158\7r\2\2\u0158"+
		"\u0159\7n\2\2\u0159\u015a\7c\2\2\u015a\u015b\7{\2\2\u015b^\3\2\2\2\u015c"+
		"\u015d\7g\2\2\u015d\u015e\7z\2\2\u015e\u015f\7k\2\2\u015f\u0160\7v\2\2"+
		"\u0160`\3\2\2\2\u0161\u0162\7v\2\2\u0162\u0163\7t\2\2\u0163\u0164\7w\2"+
		"\2\u0164\u0165\7g\2\2\u0165b\3\2\2\2\u0166\u0167\7h\2\2\u0167\u0168\7"+
		"c\2\2\u0168\u0169\7n\2\2\u0169\u016a\7u\2\2\u016a\u016b\7g\2\2\u016bd"+
		"\3\2\2\2\u016c\u016d\7t\2\2\u016d\u016e\7g\2\2\u016e\u016f\7v\2\2\u016f"+
		"\u0170\7w\2\2\u0170\u0171\7t\2\2\u0171\u0172\7p\2\2\u0172f\3\2\2\2\u0173"+
		"\u0174\7h\2\2\u0174\u0175\7w\2\2\u0175\u0176\7p\2\2\u0176h\3\2\2\2\u0177"+
		"\u0178\7c\2\2\u0178\u0179\7t\2\2\u0179\u017a\7t\2\2\u017a\u017b\7c\2\2"+
		"\u017b\u017c\7{\2\2\u017cj\3\2\2\2\u017d\u017e\7o\2\2\u017e\u017f\7c\2"+
		"\2\u017f\u0180\7r\2\2\u0180l\3\2\2\2\u0181\u0182\7n\2\2\u0182\u0183\7"+
		"h\2\2\u0183n\3\2\2\2\u0184\u0185\7e\2\2\u0185\u0186\7t\2\2\u0186\u0187"+
		"\7n\2\2\u0187\u0188\7h\2\2\u0188p\3\2\2\2\u0189\u018a\7v\2\2\u018a\u018b"+
		"\7{\2\2\u018b\u018c\7r\2\2\u018c\u018d\7g\2\2\u018dr\3\2\2\2\u018e\u0192"+
		"\t\3\2\2\u018f\u0191\t\4\2\2\u0190\u018f\3\2\2\2\u0191\u0194\3\2\2\2\u0192"+
		"\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193t\3\2\2\2\u0194\u0192\3\2\2\2"+
		"\u0195\u0197\t\5\2\2\u0196\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0196"+
		"\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u01a0\3\2\2\2\u019a\u019c\7\60\2\2"+
		"\u019b\u019d\t\5\2\2\u019c\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019c"+
		"\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u019a\3\2\2\2\u01a0"+
		"\u01a1\3\2\2\2\u01a1v\3\2\2\2\u01a2\u01a3\7)\2\2\u01a3x\3\2\2\2\u01a4"+
		"\u01a5\7$\2\2\u01a5z\3\2\2\2\u01a6\u01a9\n\6\2\2\u01a7\u01a9\5\177@\2"+
		"\u01a8\u01a6\3\2\2\2\u01a8\u01a7\3\2\2\2\u01a9|\3\2\2\2\u01aa\u01ad\n"+
		"\7\2\2\u01ab\u01ad\5\177@\2\u01ac\u01aa\3\2\2\2\u01ac\u01ab\3\2\2\2\u01ad"+
		"~\3\2\2\2\u01ae\u01af\7^\2\2\u01af\u01b0\13\2\2\2\u01b0\u0080\3\2\2\2"+
		"\u01b1\u01b5\5w<\2\u01b2\u01b4\5{>\2\u01b3\u01b2\3\2\2\2\u01b4\u01b7\3"+
		"\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b8\3\2\2\2\u01b7"+
		"\u01b5\3\2\2\2\u01b8\u01b9\5w<\2\u01b9\u01c4\3\2\2\2\u01ba\u01be\5y=\2"+
		"\u01bb\u01bd\5}?\2\u01bc\u01bb\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc"+
		"\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c1\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1"+
		"\u01c2\5y=\2\u01c2\u01c4\3\2\2\2\u01c3\u01b1\3\2\2\2\u01c3\u01ba\3\2\2"+
		"\2\u01c4\u0082\3\2\2\2\23\2\u0089\u0097\u00a5\u00b2\u00bd\u00ca\u010b"+
		"\u0192\u0198\u019e\u01a0\u01a8\u01ac\u01b5\u01be\u01c3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}