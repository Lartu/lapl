// Generated from /home/martu/Desktop/Link to LAPL/lapl.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class laplParser extends Parser {
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
	public static final int
		RULE_lapl_source = 0, RULE_statement = 1, RULE_empty_line = 2, RULE_block = 3, 
		RULE_line_statement = 4, RULE_string = 5, RULE_number = 6, RULE_number_expression = 7, 
		RULE_string_expression = 8, RULE_value = 9, RULE_argument = 10, RULE_assignment = 11, 
		RULE_function_call = 12, RULE_while_block = 13, RULE_boolean_value = 14, 
		RULE_boolean_expr = 15, RULE_if_block = 16, RULE_else_block = 17, RULE_continue_statement = 18, 
		RULE_break_statement = 19, RULE_exit_statement = 20, RULE_function_declaration = 21, 
		RULE_display_statement = 22, RULE_display_values = 23;
	public static final String[] ruleNames = {
		"lapl_source", "statement", "empty_line", "block", "line_statement", "string", 
		"number", "number_expression", "string_expression", "value", "argument", 
		"assignment", "function_call", "while_block", "boolean_value", "boolean_expr", 
		"if_block", "else_block", "continue_statement", "break_statement", "exit_statement", 
		"function_declaration", "display_statement", "display_values"
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

	@Override
	public String getGrammarFileName() { return "lapl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public laplParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Lapl_sourceContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(laplParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Lapl_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lapl_source; }
	}

	public final Lapl_sourceContext lapl_source() throws RecognitionException {
		Lapl_sourceContext _localctx = new Lapl_sourceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_lapl_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMICOLON) | (1L << BLOCK_OPEN) | (1L << VARIABLE) | (1L << WHILE) | (1L << CONTINUE) | (1L << BREAK) | (1L << IF) | (1L << DISPLAY) | (1L << EXIT) | (1L << FUNCTION) | (1L << VAR) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(48);
				statement();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Line_statementContext line_statement() {
			return getRuleContext(Line_statementContext.class,0);
		}
		public Empty_lineContext empty_line() {
			return getRuleContext(Empty_lineContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BLOCK_OPEN:
			case WHILE:
			case IF:
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				block();
				}
				break;
			case VARIABLE:
			case CONTINUE:
			case BREAK:
			case DISPLAY:
			case EXIT:
			case VAR:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				line_statement();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				empty_line();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Empty_lineContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(laplParser.SEMICOLON, 0); }
		public Empty_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_line; }
	}

	public final Empty_lineContext empty_line() throws RecognitionException {
		Empty_lineContext _localctx = new Empty_lineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_empty_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(SEMICOLON);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BLOCK_OPEN() { return getToken(laplParser.BLOCK_OPEN, 0); }
		public TerminalNode BLOCK_CLOSE() { return getToken(laplParser.BLOCK_CLOSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public While_blockContext while_block() {
			return getRuleContext(While_blockContext.class,0);
		}
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BLOCK_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(BLOCK_OPEN);
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMICOLON) | (1L << BLOCK_OPEN) | (1L << VARIABLE) | (1L << WHILE) | (1L << CONTINUE) | (1L << BREAK) | (1L << IF) | (1L << DISPLAY) | (1L << EXIT) | (1L << FUNCTION) | (1L << VAR) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(64);
					statement();
					}
					}
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(70);
				match(BLOCK_CLOSE);
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				while_block();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				if_block();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				function_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Line_statementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(laplParser.SEMICOLON, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Continue_statementContext continue_statement() {
			return getRuleContext(Continue_statementContext.class,0);
		}
		public Break_statementContext break_statement() {
			return getRuleContext(Break_statementContext.class,0);
		}
		public Exit_statementContext exit_statement() {
			return getRuleContext(Exit_statementContext.class,0);
		}
		public Display_statementContext display_statement() {
			return getRuleContext(Display_statementContext.class,0);
		}
		public Line_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_statement; }
	}

	public final Line_statementContext line_statement() throws RecognitionException {
		Line_statementContext _localctx = new Line_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_line_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
			case VAR:
				{
				setState(76);
				assignment();
				}
				break;
			case IDENTIFIER:
				{
				setState(77);
				function_call();
				}
				break;
			case CONTINUE:
				{
				setState(78);
				continue_statement();
				}
				break;
			case BREAK:
				{
				setState(79);
				break_statement();
				}
				break;
			case EXIT:
				{
				setState(80);
				exit_statement();
				}
				break;
			case DISPLAY:
				{
				setState(81);
				display_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(84);
			match(SEMICOLON);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(laplParser.STRING, 0); }
		public TerminalNode STR_OP() { return getToken(laplParser.STR_OP, 0); }
		public Number_expressionContext number_expression() {
			return getRuleContext(Number_expressionContext.class,0);
		}
		public TerminalNode LINEFEED() { return getToken(laplParser.LINEFEED, 0); }
		public TerminalNode CRLF() { return getToken(laplParser.CRLF, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_string);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(STRING);
				}
				break;
			case STR_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(STR_OP);
				setState(88);
				number_expression(0);
				}
				break;
			case LINEFEED:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				match(LINEFEED);
				}
				break;
			case CRLF:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				match(CRLF);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(laplParser.NUMBER, 0); }
		public List<TerminalNode> PLUS_OP() { return getTokens(laplParser.PLUS_OP); }
		public TerminalNode PLUS_OP(int i) {
			return getToken(laplParser.PLUS_OP, i);
		}
		public List<TerminalNode> MINUS_OP() { return getTokens(laplParser.MINUS_OP); }
		public TerminalNode MINUS_OP(int i) {
			return getToken(laplParser.MINUS_OP, i);
		}
		public TerminalNode NUM_OP() { return getToken(laplParser.NUM_OP, 0); }
		public String_expressionContext string_expression() {
			return getRuleContext(String_expressionContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(laplParser.TYPE, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_number);
		int _la;
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS_OP:
			case MINUS_OP:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS_OP) {
					{
					{
					setState(93);
					match(PLUS_OP);
					}
					}
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MINUS_OP) {
					{
					{
					setState(99);
					match(MINUS_OP);
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(105);
				match(NUMBER);
				}
				break;
			case NUM_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(NUM_OP);
				setState(107);
				string_expression(0);
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				match(TYPE);
				setState(109);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Number_expressionContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(laplParser.VARIABLE, 0); }
		public TerminalNode CEIL_OP() { return getToken(laplParser.CEIL_OP, 0); }
		public List<Number_expressionContext> number_expression() {
			return getRuleContexts(Number_expressionContext.class);
		}
		public Number_expressionContext number_expression(int i) {
			return getRuleContext(Number_expressionContext.class,i);
		}
		public TerminalNode FLOOR_OP() { return getToken(laplParser.FLOOR_OP, 0); }
		public TerminalNode LPAR() { return getToken(laplParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(laplParser.RPAR, 0); }
		public TerminalNode POW_OP() { return getToken(laplParser.POW_OP, 0); }
		public TerminalNode MOD_OP() { return getToken(laplParser.MOD_OP, 0); }
		public TerminalNode DIV_OP() { return getToken(laplParser.DIV_OP, 0); }
		public TerminalNode TIMES_OP() { return getToken(laplParser.TIMES_OP, 0); }
		public TerminalNode MINUS_OP() { return getToken(laplParser.MINUS_OP, 0); }
		public TerminalNode PLUS_OP() { return getToken(laplParser.PLUS_OP, 0); }
		public Number_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_expression; }
	}

	public final Number_expressionContext number_expression() throws RecognitionException {
		return number_expression(0);
	}

	private Number_expressionContext number_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Number_expressionContext _localctx = new Number_expressionContext(_ctx, _parentState);
		Number_expressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_number_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS_OP:
			case MINUS_OP:
			case NUM_OP:
			case TYPE:
			case NUMBER:
				{
				setState(113);
				number();
				}
				break;
			case IDENTIFIER:
				{
				setState(114);
				function_call();
				}
				break;
			case VARIABLE:
				{
				setState(115);
				match(VARIABLE);
				}
				break;
			case CEIL_OP:
				{
				setState(116);
				match(CEIL_OP);
				setState(117);
				number_expression(9);
				}
				break;
			case FLOOR_OP:
				{
				setState(118);
				match(FLOOR_OP);
				setState(119);
				number_expression(8);
				}
				break;
			case LPAR:
				{
				setState(120);
				match(LPAR);
				setState(121);
				number_expression(0);
				setState(122);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(144);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new Number_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_number_expression);
						setState(126);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(127);
						match(POW_OP);
						setState(128);
						number_expression(8);
						}
						break;
					case 2:
						{
						_localctx = new Number_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_number_expression);
						setState(129);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(130);
						match(MOD_OP);
						setState(131);
						number_expression(7);
						}
						break;
					case 3:
						{
						_localctx = new Number_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_number_expression);
						setState(132);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(133);
						match(DIV_OP);
						setState(134);
						number_expression(6);
						}
						break;
					case 4:
						{
						_localctx = new Number_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_number_expression);
						setState(135);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(136);
						match(TIMES_OP);
						setState(137);
						number_expression(5);
						}
						break;
					case 5:
						{
						_localctx = new Number_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_number_expression);
						setState(138);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(139);
						match(MINUS_OP);
						setState(140);
						number_expression(4);
						}
						break;
					case 6:
						{
						_localctx = new Number_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_number_expression);
						setState(141);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(142);
						match(PLUS_OP);
						setState(143);
						number_expression(3);
						}
						break;
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class String_expressionContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(laplParser.VARIABLE, 0); }
		public TerminalNode LPAR() { return getToken(laplParser.LPAR, 0); }
		public List<String_expressionContext> string_expression() {
			return getRuleContexts(String_expressionContext.class);
		}
		public String_expressionContext string_expression(int i) {
			return getRuleContext(String_expressionContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(laplParser.RPAR, 0); }
		public TerminalNode CONCAT_OP() { return getToken(laplParser.CONCAT_OP, 0); }
		public TerminalNode INDEX_ACCESS_O() { return getToken(laplParser.INDEX_ACCESS_O, 0); }
		public List<Number_expressionContext> number_expression() {
			return getRuleContexts(Number_expressionContext.class);
		}
		public Number_expressionContext number_expression(int i) {
			return getRuleContext(Number_expressionContext.class,i);
		}
		public TerminalNode INDEX_ACCESS_C() { return getToken(laplParser.INDEX_ACCESS_C, 0); }
		public TerminalNode COMMA() { return getToken(laplParser.COMMA, 0); }
		public String_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_expression; }
	}

	public final String_expressionContext string_expression() throws RecognitionException {
		return string_expression(0);
	}

	private String_expressionContext string_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		String_expressionContext _localctx = new String_expressionContext(_ctx, _parentState);
		String_expressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_string_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR_OP:
			case LINEFEED:
			case CRLF:
			case STRING:
				{
				setState(150);
				string();
				}
				break;
			case IDENTIFIER:
				{
				setState(151);
				function_call();
				}
				break;
			case VARIABLE:
				{
				setState(152);
				match(VARIABLE);
				}
				break;
			case LPAR:
				{
				setState(153);
				match(LPAR);
				setState(154);
				string_expression(0);
				setState(155);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(174);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new String_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_string_expression);
						setState(159);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(160);
						match(CONCAT_OP);
						setState(161);
						string_expression(3);
						}
						break;
					case 2:
						{
						_localctx = new String_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_string_expression);
						setState(162);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(163);
						match(INDEX_ACCESS_O);
						setState(164);
						number_expression(0);
						setState(165);
						match(INDEX_ACCESS_C);
						}
						break;
					case 3:
						{
						_localctx = new String_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_string_expression);
						setState(167);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(168);
						match(INDEX_ACCESS_O);
						setState(169);
						number_expression(0);
						setState(170);
						match(COMMA);
						setState(171);
						number_expression(0);
						setState(172);
						match(INDEX_ACCESS_C);
						}
						break;
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(laplParser.VARIABLE, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public String_expressionContext string_expression() {
			return getRuleContext(String_expressionContext.class,0);
		}
		public Number_expressionContext number_expression() {
			return getRuleContext(Number_expressionContext.class,0);
		}
		public Boolean_exprContext boolean_expr() {
			return getRuleContext(Boolean_exprContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_value);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(VARIABLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				function_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				string_expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				number_expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				boolean_expr(0);
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

	public static class ArgumentContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			value();
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(laplParser.VARIABLE, 0); }
		public TerminalNode ASSIGN_OP() { return getToken(laplParser.ASSIGN_OP, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode VAR() { return getToken(laplParser.VAR, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(VARIABLE);
				setState(189);
				match(ASSIGN_OP);
				setState(190);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(VAR);
				setState(192);
				match(VARIABLE);
				setState(193);
				match(ASSIGN_OP);
				setState(194);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				match(VAR);
				setState(196);
				match(VARIABLE);
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(laplParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(laplParser.LPAR, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(laplParser.RPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(laplParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(laplParser.COMMA, i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(IDENTIFIER);
			setState(200);
			match(LPAR);
			setState(201);
			argument();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(202);
				match(COMMA);
				setState(203);
				argument();
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209);
			match(RPAR);
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

	public static class While_blockContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(laplParser.WHILE, 0); }
		public Boolean_exprContext boolean_expr() {
			return getRuleContext(Boolean_exprContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_block; }
	}

	public final While_blockContext while_block() throws RecognitionException {
		While_blockContext _localctx = new While_blockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_while_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(WHILE);
			setState(212);
			boolean_expr(0);
			setState(213);
			statement();
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

	public static class Boolean_valueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(laplParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(laplParser.FALSE, 0); }
		public Boolean_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_value; }
	}

	public final Boolean_valueContext boolean_value() throws RecognitionException {
		Boolean_valueContext _localctx = new Boolean_valueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_boolean_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Boolean_exprContext extends ParserRuleContext {
		public Boolean_valueContext boolean_value() {
			return getRuleContext(Boolean_valueContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(laplParser.VARIABLE, 0); }
		public TerminalNode NOT_OP() { return getToken(laplParser.NOT_OP, 0); }
		public List<Boolean_exprContext> boolean_expr() {
			return getRuleContexts(Boolean_exprContext.class);
		}
		public Boolean_exprContext boolean_expr(int i) {
			return getRuleContext(Boolean_exprContext.class,i);
		}
		public List<String_expressionContext> string_expression() {
			return getRuleContexts(String_expressionContext.class);
		}
		public String_expressionContext string_expression(int i) {
			return getRuleContext(String_expressionContext.class,i);
		}
		public TerminalNode EQ_OP() { return getToken(laplParser.EQ_OP, 0); }
		public TerminalNode NEQ_OP() { return getToken(laplParser.NEQ_OP, 0); }
		public TerminalNode LT_OP() { return getToken(laplParser.LT_OP, 0); }
		public TerminalNode GT_OP() { return getToken(laplParser.GT_OP, 0); }
		public TerminalNode LE_OP() { return getToken(laplParser.LE_OP, 0); }
		public TerminalNode GE_OP() { return getToken(laplParser.GE_OP, 0); }
		public List<Number_expressionContext> number_expression() {
			return getRuleContexts(Number_expressionContext.class);
		}
		public Number_expressionContext number_expression(int i) {
			return getRuleContext(Number_expressionContext.class,i);
		}
		public TerminalNode LPAR() { return getToken(laplParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(laplParser.RPAR, 0); }
		public TerminalNode OR_OP() { return getToken(laplParser.OR_OP, 0); }
		public TerminalNode AND_OP() { return getToken(laplParser.AND_OP, 0); }
		public Boolean_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_expr; }
	}

	public final Boolean_exprContext boolean_expr() throws RecognitionException {
		return boolean_expr(0);
	}

	private Boolean_exprContext boolean_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Boolean_exprContext _localctx = new Boolean_exprContext(_ctx, _parentState);
		Boolean_exprContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_boolean_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(218);
				boolean_value();
				}
				break;
			case 2:
				{
				setState(219);
				function_call();
				}
				break;
			case 3:
				{
				setState(220);
				match(VARIABLE);
				}
				break;
			case 4:
				{
				setState(221);
				match(NOT_OP);
				setState(222);
				boolean_expr(16);
				}
				break;
			case 5:
				{
				setState(223);
				string_expression(0);
				setState(224);
				match(EQ_OP);
				setState(225);
				string_expression(0);
				}
				break;
			case 6:
				{
				setState(227);
				string_expression(0);
				setState(228);
				match(NEQ_OP);
				setState(229);
				string_expression(0);
				}
				break;
			case 7:
				{
				setState(231);
				string_expression(0);
				setState(232);
				match(LT_OP);
				setState(233);
				string_expression(0);
				}
				break;
			case 8:
				{
				setState(235);
				string_expression(0);
				setState(236);
				match(GT_OP);
				setState(237);
				string_expression(0);
				}
				break;
			case 9:
				{
				setState(239);
				string_expression(0);
				setState(240);
				match(LE_OP);
				setState(241);
				string_expression(0);
				}
				break;
			case 10:
				{
				setState(243);
				string_expression(0);
				setState(244);
				match(GE_OP);
				setState(245);
				string_expression(0);
				}
				break;
			case 11:
				{
				setState(247);
				number_expression(0);
				setState(248);
				match(EQ_OP);
				setState(249);
				number_expression(0);
				}
				break;
			case 12:
				{
				setState(251);
				number_expression(0);
				setState(252);
				match(NEQ_OP);
				setState(253);
				number_expression(0);
				}
				break;
			case 13:
				{
				setState(255);
				number_expression(0);
				setState(256);
				match(LT_OP);
				setState(257);
				number_expression(0);
				}
				break;
			case 14:
				{
				setState(259);
				number_expression(0);
				setState(260);
				match(GT_OP);
				setState(261);
				number_expression(0);
				}
				break;
			case 15:
				{
				setState(263);
				number_expression(0);
				setState(264);
				match(LE_OP);
				setState(265);
				number_expression(0);
				}
				break;
			case 16:
				{
				setState(267);
				number_expression(0);
				setState(268);
				match(GE_OP);
				setState(269);
				number_expression(0);
				}
				break;
			case 17:
				{
				setState(271);
				match(LPAR);
				setState(272);
				boolean_expr(0);
				setState(273);
				match(RPAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(283);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new Boolean_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_boolean_expr);
						setState(277);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(278);
						match(OR_OP);
						setState(279);
						boolean_expr(4);
						}
						break;
					case 2:
						{
						_localctx = new Boolean_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_boolean_expr);
						setState(280);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(281);
						match(AND_OP);
						setState(282);
						boolean_expr(3);
						}
						break;
					}
					} 
				}
				setState(287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class If_blockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(laplParser.IF, 0); }
		public Boolean_exprContext boolean_expr() {
			return getRuleContext(Boolean_exprContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public If_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_block; }
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_if_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(IF);
			setState(289);
			boolean_expr(0);
			setState(290);
			statement();
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(291);
				else_block();
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

	public static class Else_blockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(laplParser.ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(ELSE);
			setState(295);
			statement();
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

	public static class Continue_statementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(laplParser.CONTINUE, 0); }
		public Continue_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_statement; }
	}

	public final Continue_statementContext continue_statement() throws RecognitionException {
		Continue_statementContext _localctx = new Continue_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_continue_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(CONTINUE);
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

	public static class Break_statementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(laplParser.BREAK, 0); }
		public Break_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_statement; }
	}

	public final Break_statementContext break_statement() throws RecognitionException {
		Break_statementContext _localctx = new Break_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(BREAK);
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

	public static class Exit_statementContext extends ParserRuleContext {
		public TerminalNode EXIT() { return getToken(laplParser.EXIT, 0); }
		public Number_expressionContext number_expression() {
			return getRuleContext(Number_expressionContext.class,0);
		}
		public Exit_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit_statement; }
	}

	public final Exit_statementContext exit_statement() throws RecognitionException {
		Exit_statementContext _localctx = new Exit_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_exit_statement);
		try {
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				match(EXIT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				match(EXIT);
				setState(303);
				number_expression(0);
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

	public static class Function_declarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(laplParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(laplParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(laplParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(laplParser.RPAR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<TerminalNode> VARIABLE() { return getTokens(laplParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(laplParser.VARIABLE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(laplParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(laplParser.COMMA, i);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(FUNCTION);
			setState(307);
			match(IDENTIFIER);
			setState(308);
			match(LPAR);
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABLE) {
				{
				setState(309);
				match(VARIABLE);
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(310);
					match(COMMA);
					setState(311);
					match(VARIABLE);
					}
					}
					setState(316);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(319);
			match(RPAR);
			setState(320);
			statement();
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

	public static class Display_statementContext extends ParserRuleContext {
		public TerminalNode DISPLAY() { return getToken(laplParser.DISPLAY, 0); }
		public Display_valuesContext display_values() {
			return getRuleContext(Display_valuesContext.class,0);
		}
		public Display_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_display_statement; }
	}

	public final Display_statementContext display_statement() throws RecognitionException {
		Display_statementContext _localctx = new Display_statementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_display_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(DISPLAY);
			setState(323);
			display_values();
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

	public static class Display_valuesContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Display_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_display_values; }
	}

	public final Display_valuesContext display_values() throws RecognitionException {
		Display_valuesContext _localctx = new Display_valuesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_display_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(325);
				value();
				}
				}
				setState(328); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_OP) | (1L << MINUS_OP) | (1L << LPAR) | (1L << VARIABLE) | (1L << FLOOR_OP) | (1L << CEIL_OP) | (1L << NOT_OP) | (1L << STR_OP) | (1L << NUM_OP) | (1L << TRUE) | (1L << FALSE) | (1L << LINEFEED) | (1L << CRLF) | (1L << TYPE) | (1L << IDENTIFIER) | (1L << NUMBER) | (1L << STRING))) != 0) );
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return number_expression_sempred((Number_expressionContext)_localctx, predIndex);
		case 8:
			return string_expression_sempred((String_expressionContext)_localctx, predIndex);
		case 15:
			return boolean_expr_sempred((Boolean_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean number_expression_sempred(Number_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean string_expression_sempred(String_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean boolean_expr_sempred(Boolean_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3A\u014d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\3\2\3\3\3\3\3\3\5\3>\n\3\3\4\3\4"+
		"\3\5\3\5\7\5D\n\5\f\5\16\5G\13\5\3\5\3\5\3\5\3\5\5\5M\n\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6U\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7^\n\7\3\b\7\ba\n"+
		"\b\f\b\16\bd\13\b\3\b\7\bg\n\b\f\b\16\bj\13\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"q\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\177\n\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7"+
		"\t\u0093\n\t\f\t\16\t\u0096\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a0"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00b1"+
		"\n\n\f\n\16\n\u00b4\13\n\3\13\3\13\3\13\3\13\3\13\5\13\u00bb\n\13\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c8\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\7\16\u00cf\n\16\f\16\16\16\u00d2\13\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0116\n\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\7\21\u011e\n\21\f\21\16\21\u0121\13\21\3\22\3\22\3\22\3\22\5\22"+
		"\u0127\n\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\5\26\u0133"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u013b\n\27\f\27\16\27\u013e\13"+
		"\27\5\27\u0140\n\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\6\31\u0149\n\31"+
		"\r\31\16\31\u014a\3\31\2\5\20\22 \32\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\2\3\3\2\60\61\2\u0176\2\65\3\2\2\2\4=\3\2\2\2\6?\3"+
		"\2\2\2\bL\3\2\2\2\nT\3\2\2\2\f]\3\2\2\2\16p\3\2\2\2\20~\3\2\2\2\22\u009f"+
		"\3\2\2\2\24\u00ba\3\2\2\2\26\u00bc\3\2\2\2\30\u00c7\3\2\2\2\32\u00c9\3"+
		"\2\2\2\34\u00d5\3\2\2\2\36\u00d9\3\2\2\2 \u0115\3\2\2\2\"\u0122\3\2\2"+
		"\2$\u0128\3\2\2\2&\u012b\3\2\2\2(\u012d\3\2\2\2*\u0132\3\2\2\2,\u0134"+
		"\3\2\2\2.\u0144\3\2\2\2\60\u0148\3\2\2\2\62\64\5\4\3\2\63\62\3\2\2\2\64"+
		"\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\289\7"+
		"\2\2\39\3\3\2\2\2:>\5\b\5\2;>\5\n\6\2<>\5\6\4\2=:\3\2\2\2=;\3\2\2\2=<"+
		"\3\2\2\2>\5\3\2\2\2?@\7\30\2\2@\7\3\2\2\2AE\7\32\2\2BD\5\4\3\2CB\3\2\2"+
		"\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HM\7\33\2\2IM\5\34"+
		"\17\2JM\5\"\22\2KM\5,\27\2LA\3\2\2\2LI\3\2\2\2LJ\3\2\2\2LK\3\2\2\2M\t"+
		"\3\2\2\2NU\5\30\r\2OU\5\32\16\2PU\5&\24\2QU\5(\25\2RU\5*\26\2SU\5.\30"+
		"\2TN\3\2\2\2TO\3\2\2\2TP\3\2\2\2TQ\3\2\2\2TR\3\2\2\2TS\3\2\2\2UV\3\2\2"+
		"\2VW\7\30\2\2W\13\3\2\2\2X^\7A\2\2YZ\7&\2\2Z^\5\20\t\2[^\7\66\2\2\\^\7"+
		"\67\2\2]X\3\2\2\2]Y\3\2\2\2][\3\2\2\2]\\\3\2\2\2^\r\3\2\2\2_a\7\16\2\2"+
		"`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ch\3\2\2\2db\3\2\2\2eg\7\17\2"+
		"\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2kq\7;\2"+
		"\2lm\7\'\2\2mq\5\22\n\2no\78\2\2oq\5\24\13\2pb\3\2\2\2pl\3\2\2\2pn\3\2"+
		"\2\2q\17\3\2\2\2rs\b\t\1\2s\177\5\16\b\2t\177\5\32\16\2u\177\7\36\2\2"+
		"vw\7\"\2\2w\177\5\20\t\13xy\7!\2\2y\177\5\20\t\nz{\7\26\2\2{|\5\20\t\2"+
		"|}\7\27\2\2}\177\3\2\2\2~r\3\2\2\2~t\3\2\2\2~u\3\2\2\2~v\3\2\2\2~x\3\2"+
		"\2\2~z\3\2\2\2\177\u0094\3\2\2\2\u0080\u0081\f\t\2\2\u0081\u0082\7\20"+
		"\2\2\u0082\u0093\5\20\t\n\u0083\u0084\f\b\2\2\u0084\u0085\7\23\2\2\u0085"+
		"\u0093\5\20\t\t\u0086\u0087\f\7\2\2\u0087\u0088\7\22\2\2\u0088\u0093\5"+
		"\20\t\b\u0089\u008a\f\6\2\2\u008a\u008b\7\21\2\2\u008b\u0093\5\20\t\7"+
		"\u008c\u008d\f\5\2\2\u008d\u008e\7\17\2\2\u008e\u0093\5\20\t\6\u008f\u0090"+
		"\f\4\2\2\u0090\u0091\7\16\2\2\u0091\u0093\5\20\t\5\u0092\u0080\3\2\2\2"+
		"\u0092\u0083\3\2\2\2\u0092\u0086\3\2\2\2\u0092\u0089\3\2\2\2\u0092\u008c"+
		"\3\2\2\2\u0092\u008f\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\21\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\b\n\1"+
		"\2\u0098\u00a0\5\f\7\2\u0099\u00a0\5\32\16\2\u009a\u00a0\7\36\2\2\u009b"+
		"\u009c\7\26\2\2\u009c\u009d\5\22\n\2\u009d\u009e\7\27\2\2\u009e\u00a0"+
		"\3\2\2\2\u009f\u0097\3\2\2\2\u009f\u0099\3\2\2\2\u009f\u009a\3\2\2\2\u009f"+
		"\u009b\3\2\2\2\u00a0\u00b2\3\2\2\2\u00a1\u00a2\f\4\2\2\u00a2\u00a3\7\25"+
		"\2\2\u00a3\u00b1\5\22\n\5\u00a4\u00a5\f\6\2\2\u00a5\u00a6\7\34\2\2\u00a6"+
		"\u00a7\5\20\t\2\u00a7\u00a8\7\35\2\2\u00a8\u00b1\3\2\2\2\u00a9\u00aa\f"+
		"\5\2\2\u00aa\u00ab\7\34\2\2\u00ab\u00ac\5\20\t\2\u00ac\u00ad\7\37\2\2"+
		"\u00ad\u00ae\5\20\t\2\u00ae\u00af\7\35\2\2\u00af\u00b1\3\2\2\2\u00b0\u00a1"+
		"\3\2\2\2\u00b0\u00a4\3\2\2\2\u00b0\u00a9\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\23\3\2\2\2\u00b4\u00b2\3\2\2"+
		"\2\u00b5\u00bb\7\36\2\2\u00b6\u00bb\5\32\16\2\u00b7\u00bb\5\22\n\2\u00b8"+
		"\u00bb\5\20\t\2\u00b9\u00bb\5 \21\2\u00ba\u00b5\3\2\2\2\u00ba\u00b6\3"+
		"\2\2\2\u00ba\u00b7\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb"+
		"\25\3\2\2\2\u00bc\u00bd\5\24\13\2\u00bd\27\3\2\2\2\u00be\u00bf\7\36\2"+
		"\2\u00bf\u00c0\7\24\2\2\u00c0\u00c8\5\24\13\2\u00c1\u00c2\79\2\2\u00c2"+
		"\u00c3\7\36\2\2\u00c3\u00c4\7\24\2\2\u00c4\u00c8\5\24\13\2\u00c5\u00c6"+
		"\79\2\2\u00c6\u00c8\7\36\2\2\u00c7\u00be\3\2\2\2\u00c7\u00c1\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c8\31\3\2\2\2\u00c9\u00ca\7:\2\2\u00ca\u00cb\7\26\2"+
		"\2\u00cb\u00d0\5\26\f\2\u00cc\u00cd\7\37\2\2\u00cd\u00cf\5\26\f\2\u00ce"+
		"\u00cc\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\7\27\2\2\u00d4"+
		"\33\3\2\2\2\u00d5\u00d6\7)\2\2\u00d6\u00d7\5 \21\2\u00d7\u00d8\5\4\3\2"+
		"\u00d8\35\3\2\2\2\u00d9\u00da\t\2\2\2\u00da\37\3\2\2\2\u00db\u00dc\b\21"+
		"\1\2\u00dc\u0116\5\36\20\2\u00dd\u0116\5\32\16\2\u00de\u0116\7\36\2\2"+
		"\u00df\u00e0\7#\2\2\u00e0\u0116\5 \21\22\u00e1\u00e2\5\22\n\2\u00e2\u00e3"+
		"\7\b\2\2\u00e3\u00e4\5\22\n\2\u00e4\u0116\3\2\2\2\u00e5\u00e6\5\22\n\2"+
		"\u00e6\u00e7\7\t\2\2\u00e7\u00e8\5\22\n\2\u00e8\u0116\3\2\2\2\u00e9\u00ea"+
		"\5\22\n\2\u00ea\u00eb\7\n\2\2\u00eb\u00ec\5\22\n\2\u00ec\u0116\3\2\2\2"+
		"\u00ed\u00ee\5\22\n\2\u00ee\u00ef\7\13\2\2\u00ef\u00f0\5\22\n\2\u00f0"+
		"\u0116\3\2\2\2\u00f1\u00f2\5\22\n\2\u00f2\u00f3\7\f\2\2\u00f3\u00f4\5"+
		"\22\n\2\u00f4\u0116\3\2\2\2\u00f5\u00f6\5\22\n\2\u00f6\u00f7\7\r\2\2\u00f7"+
		"\u00f8\5\22\n\2\u00f8\u0116\3\2\2\2\u00f9\u00fa\5\20\t\2\u00fa\u00fb\7"+
		"\b\2\2\u00fb\u00fc\5\20\t\2\u00fc\u0116\3\2\2\2\u00fd\u00fe\5\20\t\2\u00fe"+
		"\u00ff\7\t\2\2\u00ff\u0100\5\20\t\2\u0100\u0116\3\2\2\2\u0101\u0102\5"+
		"\20\t\2\u0102\u0103\7\n\2\2\u0103\u0104\5\20\t\2\u0104\u0116\3\2\2\2\u0105"+
		"\u0106\5\20\t\2\u0106\u0107\7\13\2\2\u0107\u0108\5\20\t\2\u0108\u0116"+
		"\3\2\2\2\u0109\u010a\5\20\t\2\u010a\u010b\7\f\2\2\u010b\u010c\5\20\t\2"+
		"\u010c\u0116\3\2\2\2\u010d\u010e\5\20\t\2\u010e\u010f\7\r\2\2\u010f\u0110"+
		"\5\20\t\2\u0110\u0116\3\2\2\2\u0111\u0112\7\26\2\2\u0112\u0113\5 \21\2"+
		"\u0113\u0114\7\27\2\2\u0114\u0116\3\2\2\2\u0115\u00db\3\2\2\2\u0115\u00dd"+
		"\3\2\2\2\u0115\u00de\3\2\2\2\u0115\u00df\3\2\2\2\u0115\u00e1\3\2\2\2\u0115"+
		"\u00e5\3\2\2\2\u0115\u00e9\3\2\2\2\u0115\u00ed\3\2\2\2\u0115\u00f1\3\2"+
		"\2\2\u0115\u00f5\3\2\2\2\u0115\u00f9\3\2\2\2\u0115\u00fd\3\2\2\2\u0115"+
		"\u0101\3\2\2\2\u0115\u0105\3\2\2\2\u0115\u0109\3\2\2\2\u0115\u010d\3\2"+
		"\2\2\u0115\u0111\3\2\2\2\u0116\u011f\3\2\2\2\u0117\u0118\f\5\2\2\u0118"+
		"\u0119\7$\2\2\u0119\u011e\5 \21\6\u011a\u011b\f\4\2\2\u011b\u011c\7%\2"+
		"\2\u011c\u011e\5 \21\5\u011d\u0117\3\2\2\2\u011d\u011a\3\2\2\2\u011e\u0121"+
		"\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120!\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0122\u0123\7,\2\2\u0123\u0124\5 \21\2\u0124\u0126\5\4"+
		"\3\2\u0125\u0127\5$\23\2\u0126\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"#\3\2\2\2\u0128\u0129\7-\2\2\u0129\u012a\5\4\3\2\u012a%\3\2\2\2\u012b"+
		"\u012c\7*\2\2\u012c\'\3\2\2\2\u012d\u012e\7+\2\2\u012e)\3\2\2\2\u012f"+
		"\u0133\7/\2\2\u0130\u0131\7/\2\2\u0131\u0133\5\20\t\2\u0132\u012f\3\2"+
		"\2\2\u0132\u0130\3\2\2\2\u0133+\3\2\2\2\u0134\u0135\7\63\2\2\u0135\u0136"+
		"\7:\2\2\u0136\u013f\7\26\2\2\u0137\u013c\7\36\2\2\u0138\u0139\7\37\2\2"+
		"\u0139\u013b\7\36\2\2\u013a\u0138\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a"+
		"\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013f"+
		"\u0137\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\7\27"+
		"\2\2\u0142\u0143\5\4\3\2\u0143-\3\2\2\2\u0144\u0145\7.\2\2\u0145\u0146"+
		"\5\60\31\2\u0146/\3\2\2\2\u0147\u0149\5\24\13\2\u0148\u0147\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\61\3\2\2"+
		"\2\34\65=ELT]bhp~\u0092\u0094\u009f\u00b0\u00b2\u00ba\u00c7\u00d0\u0115"+
		"\u011d\u011f\u0126\u0132\u013c\u013f\u014a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}