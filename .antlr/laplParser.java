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
	public static final int
		RULE_lapl_source = 0, RULE_statement = 1, RULE_empty_line = 2, RULE_block = 3, 
		RULE_line_statement = 4, RULE_string = 5, RULE_number = 6, RULE_number_expression = 7, 
		RULE_string_expression = 8, RULE_value = 9, RULE_argument = 10, RULE_assignment = 11, 
		RULE_function_call = 12, RULE_while_block = 13, RULE_boolean_value = 14, 
		RULE_boolean_expr = 15, RULE_if_block = 16, RULE_else_block = 17, RULE_continue_statement = 18, 
		RULE_break_statement = 19, RULE_exit_statement = 20, RULE_function_declaration = 21, 
		RULE_return_statement = 22, RULE_display_statement = 23, RULE_display_values = 24;
	public static final String[] ruleNames = {
		"lapl_source", "statement", "empty_line", "block", "line_statement", "string", 
		"number", "number_expression", "string_expression", "value", "argument", 
		"assignment", "function_call", "while_block", "boolean_value", "boolean_expr", 
		"if_block", "else_block", "continue_statement", "break_statement", "exit_statement", 
		"function_declaration", "return_statement", "display_statement", "display_values"
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
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMICOLON) | (1L << BLOCK_OPEN) | (1L << VARIABLE) | (1L << WHILE) | (1L << CONTINUE) | (1L << BREAK) | (1L << IF) | (1L << DISPLAY) | (1L << EXIT) | (1L << RETURN) | (1L << FUNCTION) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(50);
				statement();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
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
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BLOCK_OPEN:
			case WHILE:
			case IF:
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				block();
				}
				break;
			case VARIABLE:
			case CONTINUE:
			case BREAK:
			case DISPLAY:
			case EXIT:
			case RETURN:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				line_statement();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
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
			setState(63);
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
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BLOCK_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(BLOCK_OPEN);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMICOLON) | (1L << BLOCK_OPEN) | (1L << VARIABLE) | (1L << WHILE) | (1L << CONTINUE) | (1L << BREAK) | (1L << IF) | (1L << DISPLAY) | (1L << EXIT) | (1L << RETURN) | (1L << FUNCTION) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(66);
					statement();
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(72);
				match(BLOCK_CLOSE);
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				while_block();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				if_block();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
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
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
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
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				{
				setState(78);
				assignment();
				}
				break;
			case IDENTIFIER:
				{
				setState(79);
				function_call();
				}
				break;
			case CONTINUE:
				{
				setState(80);
				continue_statement();
				}
				break;
			case BREAK:
				{
				setState(81);
				break_statement();
				}
				break;
			case EXIT:
				{
				setState(82);
				exit_statement();
				}
				break;
			case RETURN:
				{
				setState(83);
				return_statement();
				}
				break;
			case DISPLAY:
				{
				setState(84);
				display_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(87);
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
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(STRING);
				}
				break;
			case STR_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(STR_OP);
				setState(91);
				number_expression(0);
				}
				break;
			case LINEFEED:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				match(LINEFEED);
				}
				break;
			case CRLF:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
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
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS_OP:
			case MINUS_OP:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS_OP) {
					{
					{
					setState(96);
					match(PLUS_OP);
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MINUS_OP) {
					{
					{
					setState(102);
					match(MINUS_OP);
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(108);
				match(NUMBER);
				}
				break;
			case NUM_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(NUM_OP);
				setState(110);
				string_expression(0);
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				match(TYPE);
				setState(112);
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
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS_OP:
			case MINUS_OP:
			case NUM_OP:
			case TYPE:
			case NUMBER:
				{
				setState(116);
				number();
				}
				break;
			case IDENTIFIER:
				{
				setState(117);
				function_call();
				}
				break;
			case VARIABLE:
				{
				setState(118);
				match(VARIABLE);
				}
				break;
			case CEIL_OP:
				{
				setState(119);
				match(CEIL_OP);
				setState(120);
				number_expression(9);
				}
				break;
			case FLOOR_OP:
				{
				setState(121);
				match(FLOOR_OP);
				setState(122);
				number_expression(8);
				}
				break;
			case LPAR:
				{
				setState(123);
				match(LPAR);
				setState(124);
				number_expression(0);
				setState(125);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(147);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new Number_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_number_expression);
						setState(129);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(130);
						match(POW_OP);
						setState(131);
						number_expression(8);
						}
						break;
					case 2:
						{
						_localctx = new Number_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_number_expression);
						setState(132);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(133);
						match(MOD_OP);
						setState(134);
						number_expression(7);
						}
						break;
					case 3:
						{
						_localctx = new Number_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_number_expression);
						setState(135);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(136);
						match(DIV_OP);
						setState(137);
						number_expression(6);
						}
						break;
					case 4:
						{
						_localctx = new Number_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_number_expression);
						setState(138);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(139);
						match(TIMES_OP);
						setState(140);
						number_expression(5);
						}
						break;
					case 5:
						{
						_localctx = new Number_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_number_expression);
						setState(141);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(142);
						match(MINUS_OP);
						setState(143);
						number_expression(4);
						}
						break;
					case 6:
						{
						_localctx = new Number_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_number_expression);
						setState(144);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(145);
						match(PLUS_OP);
						setState(146);
						number_expression(3);
						}
						break;
					}
					} 
				}
				setState(151);
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
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR_OP:
			case LINEFEED:
			case CRLF:
			case STRING:
				{
				setState(153);
				string();
				}
				break;
			case IDENTIFIER:
				{
				setState(154);
				function_call();
				}
				break;
			case VARIABLE:
				{
				setState(155);
				match(VARIABLE);
				}
				break;
			case LPAR:
				{
				setState(156);
				match(LPAR);
				setState(157);
				string_expression(0);
				setState(158);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(177);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new String_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_string_expression);
						setState(162);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(163);
						match(CONCAT_OP);
						setState(164);
						string_expression(3);
						}
						break;
					case 2:
						{
						_localctx = new String_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_string_expression);
						setState(165);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(166);
						match(INDEX_ACCESS_O);
						setState(167);
						number_expression(0);
						setState(168);
						match(INDEX_ACCESS_C);
						}
						break;
					case 3:
						{
						_localctx = new String_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_string_expression);
						setState(170);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(171);
						match(INDEX_ACCESS_O);
						setState(172);
						number_expression(0);
						setState(173);
						match(COMMA);
						setState(174);
						number_expression(0);
						setState(175);
						match(INDEX_ACCESS_C);
						}
						break;
					}
					} 
				}
				setState(181);
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
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(VARIABLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				string_expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				number_expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
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
		public TerminalNode REF_OP() { return getToken(laplParser.REF_OP, 0); }
		public TerminalNode VARIABLE() { return getToken(laplParser.VARIABLE, 0); }
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
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REF_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(REF_OP);
				setState(189);
				match(VARIABLE);
				}
				break;
			case PLUS_OP:
			case MINUS_OP:
			case LPAR:
			case VARIABLE:
			case FLOOR_OP:
			case CEIL_OP:
			case NOT_OP:
			case STR_OP:
			case NUM_OP:
			case TRUE:
			case FALSE:
			case LINEFEED:
			case CRLF:
			case TYPE:
			case IDENTIFIER:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(laplParser.VARIABLE, 0); }
		public TerminalNode ASSIGN_OP() { return getToken(laplParser.ASSIGN_OP, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(VARIABLE);
			setState(194);
			match(ASSIGN_OP);
			setState(195);
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
			setState(197);
			match(IDENTIFIER);
			setState(198);
			match(LPAR);
			setState(199);
			argument();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(200);
				match(COMMA);
				setState(201);
				argument();
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
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
			setState(209);
			match(WHILE);
			setState(210);
			boolean_expr(0);
			setState(211);
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
			setState(213);
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
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(216);
				boolean_value();
				}
				break;
			case 2:
				{
				setState(217);
				function_call();
				}
				break;
			case 3:
				{
				setState(218);
				match(VARIABLE);
				}
				break;
			case 4:
				{
				setState(219);
				match(NOT_OP);
				setState(220);
				boolean_expr(16);
				}
				break;
			case 5:
				{
				setState(221);
				string_expression(0);
				setState(222);
				match(EQ_OP);
				setState(223);
				string_expression(0);
				}
				break;
			case 6:
				{
				setState(225);
				string_expression(0);
				setState(226);
				match(NEQ_OP);
				setState(227);
				string_expression(0);
				}
				break;
			case 7:
				{
				setState(229);
				string_expression(0);
				setState(230);
				match(LT_OP);
				setState(231);
				string_expression(0);
				}
				break;
			case 8:
				{
				setState(233);
				string_expression(0);
				setState(234);
				match(GT_OP);
				setState(235);
				string_expression(0);
				}
				break;
			case 9:
				{
				setState(237);
				string_expression(0);
				setState(238);
				match(LE_OP);
				setState(239);
				string_expression(0);
				}
				break;
			case 10:
				{
				setState(241);
				string_expression(0);
				setState(242);
				match(GE_OP);
				setState(243);
				string_expression(0);
				}
				break;
			case 11:
				{
				setState(245);
				number_expression(0);
				setState(246);
				match(EQ_OP);
				setState(247);
				number_expression(0);
				}
				break;
			case 12:
				{
				setState(249);
				number_expression(0);
				setState(250);
				match(NEQ_OP);
				setState(251);
				number_expression(0);
				}
				break;
			case 13:
				{
				setState(253);
				number_expression(0);
				setState(254);
				match(LT_OP);
				setState(255);
				number_expression(0);
				}
				break;
			case 14:
				{
				setState(257);
				number_expression(0);
				setState(258);
				match(GT_OP);
				setState(259);
				number_expression(0);
				}
				break;
			case 15:
				{
				setState(261);
				number_expression(0);
				setState(262);
				match(LE_OP);
				setState(263);
				number_expression(0);
				}
				break;
			case 16:
				{
				setState(265);
				number_expression(0);
				setState(266);
				match(GE_OP);
				setState(267);
				number_expression(0);
				}
				break;
			case 17:
				{
				setState(269);
				match(LPAR);
				setState(270);
				boolean_expr(0);
				setState(271);
				match(RPAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(281);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new Boolean_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_boolean_expr);
						setState(275);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(276);
						match(OR_OP);
						setState(277);
						boolean_expr(4);
						}
						break;
					case 2:
						{
						_localctx = new Boolean_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_boolean_expr);
						setState(278);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(279);
						match(AND_OP);
						setState(280);
						boolean_expr(3);
						}
						break;
					}
					} 
				}
				setState(285);
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
			setState(286);
			match(IF);
			setState(287);
			boolean_expr(0);
			setState(288);
			statement();
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(289);
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
			setState(292);
			match(ELSE);
			setState(293);
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
			setState(295);
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
			setState(297);
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
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				match(EXIT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				match(EXIT);
				setState(301);
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
			setState(304);
			match(FUNCTION);
			setState(305);
			match(IDENTIFIER);
			setState(306);
			match(LPAR);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABLE) {
				{
				setState(307);
				match(VARIABLE);
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(308);
					match(COMMA);
					setState(309);
					match(VARIABLE);
					}
					}
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(317);
			match(RPAR);
			setState(318);
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

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(laplParser.RETURN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(RETURN);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (PLUS_OP - 14)) | (1L << (MINUS_OP - 14)) | (1L << (LPAR - 14)) | (1L << (VARIABLE - 14)) | (1L << (FLOOR_OP - 14)) | (1L << (CEIL_OP - 14)) | (1L << (NOT_OP - 14)) | (1L << (STR_OP - 14)) | (1L << (NUM_OP - 14)) | (1L << (TRUE - 14)) | (1L << (FALSE - 14)) | (1L << (LINEFEED - 14)) | (1L << (CRLF - 14)) | (1L << (TYPE - 14)) | (1L << (IDENTIFIER - 14)) | (1L << (NUMBER - 14)) | (1L << (STRING - 14)))) != 0)) {
				{
				setState(321);
				value();
				}
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
		enterRule(_localctx, 46, RULE_display_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(DISPLAY);
			setState(325);
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
		enterRule(_localctx, 48, RULE_display_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(327);
				value();
				}
				}
				setState(330); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (PLUS_OP - 14)) | (1L << (MINUS_OP - 14)) | (1L << (LPAR - 14)) | (1L << (VARIABLE - 14)) | (1L << (FLOOR_OP - 14)) | (1L << (CEIL_OP - 14)) | (1L << (NOT_OP - 14)) | (1L << (STR_OP - 14)) | (1L << (NUM_OP - 14)) | (1L << (TRUE - 14)) | (1L << (FALSE - 14)) | (1L << (LINEFEED - 14)) | (1L << (CRLF - 14)) | (1L << (TYPE - 14)) | (1L << (IDENTIFIER - 14)) | (1L << (NUMBER - 14)) | (1L << (STRING - 14)))) != 0) );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\u014f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\7\2\66\n\2\f\2\16\29\13\2\3\2\3\2\3\3\3\3\3\3\5\3@\n\3"+
		"\3\4\3\4\3\5\3\5\7\5F\n\5\f\5\16\5I\13\5\3\5\3\5\3\5\3\5\5\5O\n\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6X\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7a\n\7"+
		"\3\b\7\bd\n\b\f\b\16\bg\13\b\3\b\7\bj\n\b\f\b\16\bm\13\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\bt\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0082"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\7\t\u0096\n\t\f\t\16\t\u0099\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u00a3\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\7\n\u00b4\n\n\f\n\16\n\u00b7\13\n\3\13\3\13\3\13\3\13\5\13\u00bd"+
		"\n\13\3\f\3\f\3\f\5\f\u00c2\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\7\16\u00cd\n\16\f\16\16\16\u00d0\13\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\5\21\u0114\n\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\7\21\u011c\n\21\f\21\16\21\u011f\13\21\3\22\3\22\3\22\3\22\5\22\u0125"+
		"\n\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\5\26\u0131\n\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0139\n\27\f\27\16\27\u013c\13\27"+
		"\5\27\u013e\n\27\3\27\3\27\3\27\3\30\3\30\5\30\u0145\n\30\3\31\3\31\3"+
		"\31\3\32\6\32\u014b\n\32\r\32\16\32\u014c\3\32\2\5\20\22 \33\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\3\3\2\62\63\2\u0177\2\67"+
		"\3\2\2\2\4?\3\2\2\2\6A\3\2\2\2\bN\3\2\2\2\nW\3\2\2\2\f`\3\2\2\2\16s\3"+
		"\2\2\2\20\u0081\3\2\2\2\22\u00a2\3\2\2\2\24\u00bc\3\2\2\2\26\u00c1\3\2"+
		"\2\2\30\u00c3\3\2\2\2\32\u00c7\3\2\2\2\34\u00d3\3\2\2\2\36\u00d7\3\2\2"+
		"\2 \u0113\3\2\2\2\"\u0120\3\2\2\2$\u0126\3\2\2\2&\u0129\3\2\2\2(\u012b"+
		"\3\2\2\2*\u0130\3\2\2\2,\u0132\3\2\2\2.\u0142\3\2\2\2\60\u0146\3\2\2\2"+
		"\62\u014a\3\2\2\2\64\66\5\4\3\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2"+
		"\2\678\3\2\2\28:\3\2\2\29\67\3\2\2\2:;\7\2\2\3;\3\3\2\2\2<@\5\b\5\2=@"+
		"\5\n\6\2>@\5\6\4\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@\5\3\2\2\2AB\7\32\2\2"+
		"B\7\3\2\2\2CG\7\34\2\2DF\5\4\3\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2"+
		"\2HJ\3\2\2\2IG\3\2\2\2JO\7\35\2\2KO\5\34\17\2LO\5\"\22\2MO\5,\27\2NC\3"+
		"\2\2\2NK\3\2\2\2NL\3\2\2\2NM\3\2\2\2O\t\3\2\2\2PX\5\30\r\2QX\5\32\16\2"+
		"RX\5&\24\2SX\5(\25\2TX\5*\26\2UX\5.\30\2VX\5\60\31\2WP\3\2\2\2WQ\3\2\2"+
		"\2WR\3\2\2\2WS\3\2\2\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2XY\3\2\2\2YZ\7\32"+
		"\2\2Z\13\3\2\2\2[a\7B\2\2\\]\7(\2\2]a\5\20\t\2^a\78\2\2_a\79\2\2`[\3\2"+
		"\2\2`\\\3\2\2\2`^\3\2\2\2`_\3\2\2\2a\r\3\2\2\2bd\7\20\2\2cb\3\2\2\2dg"+
		"\3\2\2\2ec\3\2\2\2ef\3\2\2\2fk\3\2\2\2ge\3\2\2\2hj\7\21\2\2ih\3\2\2\2"+
		"jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2nt\7<\2\2op\7)\2\2p"+
		"t\5\22\n\2qr\7:\2\2rt\5\24\13\2se\3\2\2\2so\3\2\2\2sq\3\2\2\2t\17\3\2"+
		"\2\2uv\b\t\1\2v\u0082\5\16\b\2w\u0082\5\32\16\2x\u0082\7 \2\2yz\7$\2\2"+
		"z\u0082\5\20\t\13{|\7#\2\2|\u0082\5\20\t\n}~\7\30\2\2~\177\5\20\t\2\177"+
		"\u0080\7\31\2\2\u0080\u0082\3\2\2\2\u0081u\3\2\2\2\u0081w\3\2\2\2\u0081"+
		"x\3\2\2\2\u0081y\3\2\2\2\u0081{\3\2\2\2\u0081}\3\2\2\2\u0082\u0097\3\2"+
		"\2\2\u0083\u0084\f\t\2\2\u0084\u0085\7\22\2\2\u0085\u0096\5\20\t\n\u0086"+
		"\u0087\f\b\2\2\u0087\u0088\7\25\2\2\u0088\u0096\5\20\t\t\u0089\u008a\f"+
		"\7\2\2\u008a\u008b\7\24\2\2\u008b\u0096\5\20\t\b\u008c\u008d\f\6\2\2\u008d"+
		"\u008e\7\23\2\2\u008e\u0096\5\20\t\7\u008f\u0090\f\5\2\2\u0090\u0091\7"+
		"\21\2\2\u0091\u0096\5\20\t\6\u0092\u0093\f\4\2\2\u0093\u0094\7\20\2\2"+
		"\u0094\u0096\5\20\t\5\u0095\u0083\3\2\2\2\u0095\u0086\3\2\2\2\u0095\u0089"+
		"\3\2\2\2\u0095\u008c\3\2\2\2\u0095\u008f\3\2\2\2\u0095\u0092\3\2\2\2\u0096"+
		"\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\21\3\2\2"+
		"\2\u0099\u0097\3\2\2\2\u009a\u009b\b\n\1\2\u009b\u00a3\5\f\7\2\u009c\u00a3"+
		"\5\32\16\2\u009d\u00a3\7 \2\2\u009e\u009f\7\30\2\2\u009f\u00a0\5\22\n"+
		"\2\u00a0\u00a1\7\31\2\2\u00a1\u00a3\3\2\2\2\u00a2\u009a\3\2\2\2\u00a2"+
		"\u009c\3\2\2\2\u00a2\u009d\3\2\2\2\u00a2\u009e\3\2\2\2\u00a3\u00b5\3\2"+
		"\2\2\u00a4\u00a5\f\4\2\2\u00a5\u00a6\7\27\2\2\u00a6\u00b4\5\22\n\5\u00a7"+
		"\u00a8\f\6\2\2\u00a8\u00a9\7\36\2\2\u00a9\u00aa\5\20\t\2\u00aa\u00ab\7"+
		"\37\2\2\u00ab\u00b4\3\2\2\2\u00ac\u00ad\f\5\2\2\u00ad\u00ae\7\36\2\2\u00ae"+
		"\u00af\5\20\t\2\u00af\u00b0\7!\2\2\u00b0\u00b1\5\20\t\2\u00b1\u00b2\7"+
		"\37\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00a4\3\2\2\2\u00b3\u00a7\3\2\2\2\u00b3"+
		"\u00ac\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\23\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00bd\7 \2\2\u00b9\u00bd"+
		"\5\22\n\2\u00ba\u00bd\5\20\t\2\u00bb\u00bd\5 \21\2\u00bc\u00b8\3\2\2\2"+
		"\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\25"+
		"\3\2\2\2\u00be\u00bf\7\"\2\2\u00bf\u00c2\7 \2\2\u00c0\u00c2\5\24\13\2"+
		"\u00c1\u00be\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\27\3\2\2\2\u00c3\u00c4"+
		"\7 \2\2\u00c4\u00c5\7\26\2\2\u00c5\u00c6\5\24\13\2\u00c6\31\3\2\2\2\u00c7"+
		"\u00c8\7;\2\2\u00c8\u00c9\7\30\2\2\u00c9\u00ce\5\26\f\2\u00ca\u00cb\7"+
		"!\2\2\u00cb\u00cd\5\26\f\2\u00cc\u00ca\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2"+
		"\2\2\u00d1\u00d2\7\31\2\2\u00d2\33\3\2\2\2\u00d3\u00d4\7+\2\2\u00d4\u00d5"+
		"\5 \21\2\u00d5\u00d6\5\4\3\2\u00d6\35\3\2\2\2\u00d7\u00d8\t\2\2\2\u00d8"+
		"\37\3\2\2\2\u00d9\u00da\b\21\1\2\u00da\u0114\5\36\20\2\u00db\u0114\5\32"+
		"\16\2\u00dc\u0114\7 \2\2\u00dd\u00de\7%\2\2\u00de\u0114\5 \21\22\u00df"+
		"\u00e0\5\22\n\2\u00e0\u00e1\7\n\2\2\u00e1\u00e2\5\22\n\2\u00e2\u0114\3"+
		"\2\2\2\u00e3\u00e4\5\22\n\2\u00e4\u00e5\7\13\2\2\u00e5\u00e6\5\22\n\2"+
		"\u00e6\u0114\3\2\2\2\u00e7\u00e8\5\22\n\2\u00e8\u00e9\7\f\2\2\u00e9\u00ea"+
		"\5\22\n\2\u00ea\u0114\3\2\2\2\u00eb\u00ec\5\22\n\2\u00ec\u00ed\7\r\2\2"+
		"\u00ed\u00ee\5\22\n\2\u00ee\u0114\3\2\2\2\u00ef\u00f0\5\22\n\2\u00f0\u00f1"+
		"\7\16\2\2\u00f1\u00f2\5\22\n\2\u00f2\u0114\3\2\2\2\u00f3\u00f4\5\22\n"+
		"\2\u00f4\u00f5\7\17\2\2\u00f5\u00f6\5\22\n\2\u00f6\u0114\3\2\2\2\u00f7"+
		"\u00f8\5\20\t\2\u00f8\u00f9\7\n\2\2\u00f9\u00fa\5\20\t\2\u00fa\u0114\3"+
		"\2\2\2\u00fb\u00fc\5\20\t\2\u00fc\u00fd\7\13\2\2\u00fd\u00fe\5\20\t\2"+
		"\u00fe\u0114\3\2\2\2\u00ff\u0100\5\20\t\2\u0100\u0101\7\f\2\2\u0101\u0102"+
		"\5\20\t\2\u0102\u0114\3\2\2\2\u0103\u0104\5\20\t\2\u0104\u0105\7\r\2\2"+
		"\u0105\u0106\5\20\t\2\u0106\u0114\3\2\2\2\u0107\u0108\5\20\t\2\u0108\u0109"+
		"\7\16\2\2\u0109\u010a\5\20\t\2\u010a\u0114\3\2\2\2\u010b\u010c\5\20\t"+
		"\2\u010c\u010d\7\17\2\2\u010d\u010e\5\20\t\2\u010e\u0114\3\2\2\2\u010f"+
		"\u0110\7\30\2\2\u0110\u0111\5 \21\2\u0111\u0112\7\31\2\2\u0112\u0114\3"+
		"\2\2\2\u0113\u00d9\3\2\2\2\u0113\u00db\3\2\2\2\u0113\u00dc\3\2\2\2\u0113"+
		"\u00dd\3\2\2\2\u0113\u00df\3\2\2\2\u0113\u00e3\3\2\2\2\u0113\u00e7\3\2"+
		"\2\2\u0113\u00eb\3\2\2\2\u0113\u00ef\3\2\2\2\u0113\u00f3\3\2\2\2\u0113"+
		"\u00f7\3\2\2\2\u0113\u00fb\3\2\2\2\u0113\u00ff\3\2\2\2\u0113\u0103\3\2"+
		"\2\2\u0113\u0107\3\2\2\2\u0113\u010b\3\2\2\2\u0113\u010f\3\2\2\2\u0114"+
		"\u011d\3\2\2\2\u0115\u0116\f\5\2\2\u0116\u0117\7&\2\2\u0117\u011c\5 \21"+
		"\6\u0118\u0119\f\4\2\2\u0119\u011a\7\'\2\2\u011a\u011c\5 \21\5\u011b\u0115"+
		"\3\2\2\2\u011b\u0118\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e!\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121\7.\2\2\u0121"+
		"\u0122\5 \21\2\u0122\u0124\5\4\3\2\u0123\u0125\5$\23\2\u0124\u0123\3\2"+
		"\2\2\u0124\u0125\3\2\2\2\u0125#\3\2\2\2\u0126\u0127\7/\2\2\u0127\u0128"+
		"\5\4\3\2\u0128%\3\2\2\2\u0129\u012a\7,\2\2\u012a\'\3\2\2\2\u012b\u012c"+
		"\7-\2\2\u012c)\3\2\2\2\u012d\u0131\7\61\2\2\u012e\u012f\7\61\2\2\u012f"+
		"\u0131\5\20\t\2\u0130\u012d\3\2\2\2\u0130\u012e\3\2\2\2\u0131+\3\2\2\2"+
		"\u0132\u0133\7\65\2\2\u0133\u0134\7;\2\2\u0134\u013d\7\30\2\2\u0135\u013a"+
		"\7 \2\2\u0136\u0137\7!\2\2\u0137\u0139\7 \2\2\u0138\u0136\3\2\2\2\u0139"+
		"\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013e\3\2"+
		"\2\2\u013c\u013a\3\2\2\2\u013d\u0135\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0140\7\31\2\2\u0140\u0141\5\4\3\2\u0141-\3\2\2\2"+
		"\u0142\u0144\7\64\2\2\u0143\u0145\5\24\13\2\u0144\u0143\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145/\3\2\2\2\u0146\u0147\7\60\2\2\u0147\u0148\5\62\32"+
		"\2\u0148\61\3\2\2\2\u0149\u014b\5\24\13\2\u014a\u0149\3\2\2\2\u014b\u014c"+
		"\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\63\3\2\2\2\35\67"+
		"?GNW`eks\u0081\u0095\u0097\u00a2\u00b3\u00b5\u00bc\u00c1\u00ce\u0113\u011b"+
		"\u011d\u0124\u0130\u013a\u013d\u0144\u014c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}