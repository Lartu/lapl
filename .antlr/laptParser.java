// Generated from /home/martu/Desktop/Lasit - Lamct/lapt.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class laptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MULTICOMMENT=1, QUOTED_STRING=2, OPEN_PAR=3, CLOSE_PAR=4, ELIF_CO=5, ELSE_CO=6, 
		IF_CO=7, WHILE_CO=8, WHITESPACE=9, PLAIN_STRING=10, INVOQUER=11, GETTER=12, 
		SETTER=13;
	public static final int
		RULE_lapt_source = 0, RULE_string_list = 1, RULE_string = 2, RULE_quoted_string = 3, 
		RULE_plain_string = 4, RULE_block_string = 5, RULE_elif_statement = 6, 
		RULE_if_statement = 7, RULE_condition = 8, RULE_else_statement = 9, RULE_while_statement = 10, 
		RULE_sugar_function_call = 11, RULE_sugar_var_get = 12, RULE_sugar_var_set = 13;
	public static final String[] ruleNames = {
		"lapt_source", "string_list", "string", "quoted_string", "plain_string", 
		"block_string", "elif_statement", "if_statement", "condition", "else_statement", 
		"while_statement", "sugar_function_call", "sugar_var_get", "sugar_var_set"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'('", "')'", "'elif'", "'else'", "'if'", "'while'", 
		null, null, "'%'", "'@'", "'>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MULTICOMMENT", "QUOTED_STRING", "OPEN_PAR", "CLOSE_PAR", "ELIF_CO", 
		"ELSE_CO", "IF_CO", "WHILE_CO", "WHITESPACE", "PLAIN_STRING", "INVOQUER", 
		"GETTER", "SETTER"
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
	public String getGrammarFileName() { return "lapt.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public laptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Lapt_sourceContext extends ParserRuleContext {
		public String_listContext string_list() {
			return getRuleContext(String_listContext.class,0);
		}
		public TerminalNode EOF() { return getToken(laptParser.EOF, 0); }
		public Lapt_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lapt_source; }
	}

	public final Lapt_sourceContext lapt_source() throws RecognitionException {
		Lapt_sourceContext _localctx = new Lapt_sourceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_lapt_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			string_list();
			setState(29);
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

	public static class String_listContext extends ParserRuleContext {
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(laptParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(laptParser.WHITESPACE, i);
		}
		public String_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_list; }
	}

	public final String_listContext string_list() throws RecognitionException {
		String_listContext _localctx = new String_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_string_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUOTED_STRING) | (1L << OPEN_PAR) | (1L << IF_CO) | (1L << WHILE_CO) | (1L << WHITESPACE) | (1L << PLAIN_STRING) | (1L << GETTER) | (1L << SETTER))) != 0)) {
				{
				{
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(31);
					match(WHITESPACE);
					}
					}
					setState(36);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(37);
				string();
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(38);
						match(WHITESPACE);
						}
						} 
					}
					setState(43);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class StringContext extends ParserRuleContext {
		public Quoted_stringContext quoted_string() {
			return getRuleContext(Quoted_stringContext.class,0);
		}
		public Plain_stringContext plain_string() {
			return getRuleContext(Plain_stringContext.class,0);
		}
		public Block_stringContext block_string() {
			return getRuleContext(Block_stringContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Sugar_function_callContext sugar_function_call() {
			return getRuleContext(Sugar_function_callContext.class,0);
		}
		public Sugar_var_getContext sugar_var_get() {
			return getRuleContext(Sugar_var_getContext.class,0);
		}
		public Sugar_var_setContext sugar_var_set() {
			return getRuleContext(Sugar_var_setContext.class,0);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_string);
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				quoted_string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				plain_string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				block_string();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				if_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
				while_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(54);
				sugar_function_call();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(55);
				sugar_var_get();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(56);
				sugar_var_set();
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

	public static class Quoted_stringContext extends ParserRuleContext {
		public TerminalNode QUOTED_STRING() { return getToken(laptParser.QUOTED_STRING, 0); }
		public Quoted_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quoted_string; }
	}

	public final Quoted_stringContext quoted_string() throws RecognitionException {
		Quoted_stringContext _localctx = new Quoted_stringContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_quoted_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(QUOTED_STRING);
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

	public static class Plain_stringContext extends ParserRuleContext {
		public TerminalNode PLAIN_STRING() { return getToken(laptParser.PLAIN_STRING, 0); }
		public Plain_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plain_string; }
	}

	public final Plain_stringContext plain_string() throws RecognitionException {
		Plain_stringContext _localctx = new Plain_stringContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_plain_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(PLAIN_STRING);
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

	public static class Block_stringContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(laptParser.OPEN_PAR, 0); }
		public String_listContext string_list() {
			return getRuleContext(String_listContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(laptParser.CLOSE_PAR, 0); }
		public Block_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_string; }
	}

	public final Block_stringContext block_string() throws RecognitionException {
		Block_stringContext _localctx = new Block_stringContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(OPEN_PAR);
			setState(64);
			string_list();
			setState(65);
			match(CLOSE_PAR);
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

	public static class Elif_statementContext extends ParserRuleContext {
		public TerminalNode ELIF_CO() { return getToken(laptParser.ELIF_CO, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Block_stringContext block_string() {
			return getRuleContext(Block_stringContext.class,0);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(laptParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(laptParser.WHITESPACE, i);
		}
		public Elif_statementContext elif_statement() {
			return getRuleContext(Elif_statementContext.class,0);
		}
		public Elif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_statement; }
	}

	public final Elif_statementContext elif_statement() throws RecognitionException {
		Elif_statementContext _localctx = new Elif_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elif_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(ELIF_CO);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(68);
				match(WHITESPACE);
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			condition();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(75);
				match(WHITESPACE);
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			block_string();
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(82);
					match(WHITESPACE);
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELIF_CO) {
				{
				setState(88);
				elif_statement();
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF_CO() { return getToken(laptParser.IF_CO, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Block_stringContext block_string() {
			return getRuleContext(Block_stringContext.class,0);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(laptParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(laptParser.WHITESPACE, i);
		}
		public Elif_statementContext elif_statement() {
			return getRuleContext(Elif_statementContext.class,0);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(IF_CO);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(92);
				match(WHITESPACE);
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			condition();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(99);
				match(WHITESPACE);
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			block_string();
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(106);
					match(WHITESPACE);
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELIF_CO) {
				{
				setState(112);
				elif_statement();
				}
			}

			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_CO) {
				{
				setState(115);
				else_statement();
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

	public static class ConditionContext extends ParserRuleContext {
		public Block_stringContext block_string() {
			return getRuleContext(Block_stringContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			block_string();
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

	public static class Else_statementContext extends ParserRuleContext {
		public TerminalNode ELSE_CO() { return getToken(laptParser.ELSE_CO, 0); }
		public Block_stringContext block_string() {
			return getRuleContext(Block_stringContext.class,0);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(laptParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(laptParser.WHITESPACE, i);
		}
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_else_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(ELSE_CO);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(121);
				match(WHITESPACE);
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			block_string();
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(128);
					match(WHITESPACE);
					}
					} 
				}
				setState(133);
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
			exitRule();
		}
		return _localctx;
	}

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE_CO() { return getToken(laptParser.WHILE_CO, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Block_stringContext block_string() {
			return getRuleContext(Block_stringContext.class,0);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(laptParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(laptParser.WHITESPACE, i);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_while_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(WHILE_CO);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(135);
				match(WHITESPACE);
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			condition();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(142);
				match(WHITESPACE);
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			block_string();
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

	public static class Sugar_function_callContext extends ParserRuleContext {
		public Plain_stringContext plain_string() {
			return getRuleContext(Plain_stringContext.class,0);
		}
		public TerminalNode INVOQUER() { return getToken(laptParser.INVOQUER, 0); }
		public Sugar_function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sugar_function_call; }
	}

	public final Sugar_function_callContext sugar_function_call() throws RecognitionException {
		Sugar_function_callContext _localctx = new Sugar_function_callContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sugar_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			plain_string();
			setState(151);
			match(INVOQUER);
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

	public static class Sugar_var_getContext extends ParserRuleContext {
		public TerminalNode GETTER() { return getToken(laptParser.GETTER, 0); }
		public Plain_stringContext plain_string() {
			return getRuleContext(Plain_stringContext.class,0);
		}
		public Sugar_var_getContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sugar_var_get; }
	}

	public final Sugar_var_getContext sugar_var_get() throws RecognitionException {
		Sugar_var_getContext _localctx = new Sugar_var_getContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sugar_var_get);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(GETTER);
			setState(154);
			plain_string();
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

	public static class Sugar_var_setContext extends ParserRuleContext {
		public TerminalNode SETTER() { return getToken(laptParser.SETTER, 0); }
		public Plain_stringContext plain_string() {
			return getRuleContext(Plain_stringContext.class,0);
		}
		public Sugar_var_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sugar_var_set; }
	}

	public final Sugar_var_setContext sugar_var_set() throws RecognitionException {
		Sugar_var_setContext _localctx = new Sugar_var_setContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sugar_var_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(SETTER);
			setState(157);
			plain_string();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17\u00a2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\3\7\3#\n\3\f\3"+
		"\16\3&\13\3\3\3\3\3\7\3*\n\3\f\3\16\3-\13\3\7\3/\n\3\f\3\16\3\62\13\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4<\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\7\bH\n\b\f\b\16\bK\13\b\3\b\3\b\7\bO\n\b\f\b\16\bR\13\b\3"+
		"\b\3\b\7\bV\n\b\f\b\16\bY\13\b\3\b\5\b\\\n\b\3\t\3\t\7\t`\n\t\f\t\16\t"+
		"c\13\t\3\t\3\t\7\tg\n\t\f\t\16\tj\13\t\3\t\3\t\7\tn\n\t\f\t\16\tq\13\t"+
		"\3\t\5\tt\n\t\3\t\5\tw\n\t\3\n\3\n\3\13\3\13\7\13}\n\13\f\13\16\13\u0080"+
		"\13\13\3\13\3\13\7\13\u0084\n\13\f\13\16\13\u0087\13\13\3\f\3\f\7\f\u008b"+
		"\n\f\f\f\16\f\u008e\13\f\3\f\3\f\7\f\u0092\n\f\f\f\16\f\u0095\13\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\2\2\2\u00aa\2\36\3\2\2\2\4\60\3\2\2\2\6;\3\2"+
		"\2\2\b=\3\2\2\2\n?\3\2\2\2\fA\3\2\2\2\16E\3\2\2\2\20]\3\2\2\2\22x\3\2"+
		"\2\2\24z\3\2\2\2\26\u0088\3\2\2\2\30\u0098\3\2\2\2\32\u009b\3\2\2\2\34"+
		"\u009e\3\2\2\2\36\37\5\4\3\2\37 \7\2\2\3 \3\3\2\2\2!#\7\13\2\2\"!\3\2"+
		"\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\'\3\2\2\2&$\3\2\2\2\'+\5\6\4\2(*"+
		"\7\13\2\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,/\3\2\2\2-+\3\2\2\2"+
		".$\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\5\3\2\2\2\62\60\3"+
		"\2\2\2\63<\5\b\5\2\64<\5\n\6\2\65<\5\f\7\2\66<\5\20\t\2\67<\5\26\f\28"+
		"<\5\30\r\29<\5\32\16\2:<\5\34\17\2;\63\3\2\2\2;\64\3\2\2\2;\65\3\2\2\2"+
		";\66\3\2\2\2;\67\3\2\2\2;8\3\2\2\2;9\3\2\2\2;:\3\2\2\2<\7\3\2\2\2=>\7"+
		"\4\2\2>\t\3\2\2\2?@\7\f\2\2@\13\3\2\2\2AB\7\5\2\2BC\5\4\3\2CD\7\6\2\2"+
		"D\r\3\2\2\2EI\7\7\2\2FH\7\13\2\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2"+
		"\2JL\3\2\2\2KI\3\2\2\2LP\5\22\n\2MO\7\13\2\2NM\3\2\2\2OR\3\2\2\2PN\3\2"+
		"\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2SW\5\f\7\2TV\7\13\2\2UT\3\2\2\2VY\3"+
		"\2\2\2WU\3\2\2\2WX\3\2\2\2X[\3\2\2\2YW\3\2\2\2Z\\\5\16\b\2[Z\3\2\2\2["+
		"\\\3\2\2\2\\\17\3\2\2\2]a\7\t\2\2^`\7\13\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2"+
		"\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2dh\5\22\n\2eg\7\13\2\2fe\3\2\2\2gj\3"+
		"\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2ko\5\f\7\2ln\7\13\2\2ml"+
		"\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2ps\3\2\2\2qo\3\2\2\2rt\5\16\b\2"+
		"sr\3\2\2\2st\3\2\2\2tv\3\2\2\2uw\5\24\13\2vu\3\2\2\2vw\3\2\2\2w\21\3\2"+
		"\2\2xy\5\f\7\2y\23\3\2\2\2z~\7\b\2\2{}\7\13\2\2|{\3\2\2\2}\u0080\3\2\2"+
		"\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0085"+
		"\5\f\7\2\u0082\u0084\7\13\2\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2"+
		"\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\25\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0088\u008c\7\n\2\2\u0089\u008b\7\13\2\2\u008a\u0089\3\2\2\2"+
		"\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0093\5\22\n\2\u0090\u0092\7\13\2\2"+
		"\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094"+
		"\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\5\f\7\2\u0097"+
		"\27\3\2\2\2\u0098\u0099\5\n\6\2\u0099\u009a\7\r\2\2\u009a\31\3\2\2\2\u009b"+
		"\u009c\7\16\2\2\u009c\u009d\5\n\6\2\u009d\33\3\2\2\2\u009e\u009f\7\17"+
		"\2\2\u009f\u00a0\5\n\6\2\u00a0\35\3\2\2\2\23$+\60;IPW[ahosv~\u0085\u008c"+
		"\u0093";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}