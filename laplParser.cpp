
// Generated from lapl.g4 by ANTLR 4.8


#include "laplVisitor.h"

#include "laplParser.h"


using namespace antlrcpp;
using namespace antlr4;

laplParser::laplParser(TokenStream *input) : Parser(input) {
  _interpreter = new atn::ParserATNSimulator(this, _atn, _decisionToDFA, _sharedContextCache);
}

laplParser::~laplParser() {
  delete _interpreter;
}

std::string laplParser::getGrammarFileName() const {
  return "lapl.g4";
}

const std::vector<std::string>& laplParser::getRuleNames() const {
  return _ruleNames;
}

dfa::Vocabulary& laplParser::getVocabulary() const {
  return _vocabulary;
}


//----------------- Lapl_sourceContext ------------------------------------------------------------------

laplParser::Lapl_sourceContext::Lapl_sourceContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* laplParser::Lapl_sourceContext::EOF() {
  return getToken(laplParser::EOF, 0);
}

std::vector<laplParser::StatementContext *> laplParser::Lapl_sourceContext::statement() {
  return getRuleContexts<laplParser::StatementContext>();
}

laplParser::StatementContext* laplParser::Lapl_sourceContext::statement(size_t i) {
  return getRuleContext<laplParser::StatementContext>(i);
}


size_t laplParser::Lapl_sourceContext::getRuleIndex() const {
  return laplParser::RuleLapl_source;
}


antlrcpp::Any laplParser::Lapl_sourceContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<laplVisitor*>(visitor))
    return parserVisitor->visitLapl_source(this);
  else
    return visitor->visitChildren(this);
}

laplParser::Lapl_sourceContext* laplParser::lapl_source() {
  Lapl_sourceContext *_localctx = _tracker.createInstance<Lapl_sourceContext>(_ctx, getState());
  enterRule(_localctx, 0, laplParser::RuleLapl_source);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(53);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << laplParser::SEMICOLON)
      | (1ULL << laplParser::BLOCK_OPEN)
      | (1ULL << laplParser::VARIABLE)
      | (1ULL << laplParser::WHILE)
      | (1ULL << laplParser::CONTINUE)
      | (1ULL << laplParser::BREAK)
      | (1ULL << laplParser::IF)
      | (1ULL << laplParser::DISPLAY)
      | (1ULL << laplParser::EXIT)
      | (1ULL << laplParser::RETURN)
      | (1ULL << laplParser::FUNCTION)
      | (1ULL << laplParser::IDENTIFIER))) != 0)) {
      setState(50);
      statement();
      setState(55);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(56);
    match(laplParser::EOF);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- StatementContext ------------------------------------------------------------------

laplParser::StatementContext::StatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

laplParser::BlockContext* laplParser::StatementContext::block() {
  return getRuleContext<laplParser::BlockContext>(0);
}

laplParser::Line_statementContext* laplParser::StatementContext::line_statement() {
  return getRuleContext<laplParser::Line_statementContext>(0);
}

laplParser::Empty_lineContext* laplParser::StatementContext::empty_line() {
  return getRuleContext<laplParser::Empty_lineContext>(0);
}


size_t laplParser::StatementContext::getRuleIndex() const {
  return laplParser::RuleStatement;
}


antlrcpp::Any laplParser::StatementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<laplVisitor*>(visitor))
    return parserVisitor->visitStatement(this);
  else
    return visitor->visitChildren(this);
}

laplParser::StatementContext* laplParser::statement() {
  StatementContext *_localctx = _tracker.createInstance<StatementContext>(_ctx, getState());
  enterRule(_localctx, 2, laplParser::RuleStatement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(61);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case laplParser::BLOCK_OPEN:
      case laplParser::WHILE:
      case laplParser::IF:
      case laplParser::FUNCTION: {
        enterOuterAlt(_localctx, 1);
        setState(58);
        block();
        break;
      }

      case laplParser::VARIABLE:
      case laplParser::CONTINUE:
      case laplParser::BREAK:
      case laplParser::DISPLAY:
      case laplParser::EXIT:
      case laplParser::RETURN:
      case laplParser::IDENTIFIER: {
        enterOuterAlt(_localctx, 2);
        setState(59);
        line_statement();
        break;
      }

      case laplParser::SEMICOLON: {
        enterOuterAlt(_localctx, 3);
        setState(60);
        empty_line();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Empty_lineContext ------------------------------------------------------------------

laplParser::Empty_lineContext::Empty_lineContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* laplParser::Empty_lineContext::SEMICOLON() {
  return getToken(laplParser::SEMICOLON, 0);
}


size_t laplParser::Empty_lineContext::getRuleIndex() const {
  return laplParser::RuleEmpty_line;
}


antlrcpp::Any laplParser::Empty_lineContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<laplVisitor*>(visitor))
    return parserVisitor->visitEmpty_line(this);
  else
    return visitor->visitChildren(this);
}

laplParser::Empty_lineContext* laplParser::empty_line() {
  Empty_lineContext *_localctx = _tracker.createInstance<Empty_lineContext>(_ctx, getState());
  enterRule(_localctx, 4, laplParser::RuleEmpty_line);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(63);
    match(laplParser::SEMICOLON);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockContext ------------------------------------------------------------------

laplParser::BlockContext::BlockContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* laplParser::BlockContext::BLOCK_OPEN() {
  return getToken(laplParser::BLOCK_OPEN, 0);
}

tree::TerminalNode* laplParser::BlockContext::BLOCK_CLOSE() {
  return getToken(laplParser::BLOCK_CLOSE, 0);
}

std::vector<laplParser::StatementContext *> laplParser::BlockContext::statement() {
  return getRuleContexts<laplParser::StatementContext>();
}

laplParser::StatementContext* laplParser::BlockContext::statement(size_t i) {
  return getRuleContext<laplParser::StatementContext>(i);
}

laplParser::While_blockContext* laplParser::BlockContext::while_block() {
  return getRuleContext<laplParser::While_blockContext>(0);
}

laplParser::If_blockContext* laplParser::BlockContext::if_block() {
  return getRuleContext<laplParser::If_blockContext>(0);
}

laplParser::Function_declarationContext* laplParser::BlockContext::function_declaration() {
  return getRuleContext<laplParser::Function_declarationContext>(0);
}


size_t laplParser::BlockContext::getRuleIndex() const {
  return laplParser::RuleBlock;
}


antlrcpp::Any laplParser::BlockContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<laplVisitor*>(visitor))
    return parserVisitor->visitBlock(this);
  else
    return visitor->visitChildren(this);
}

laplParser::BlockContext* laplParser::block() {
  BlockContext *_localctx = _tracker.createInstance<BlockContext>(_ctx, getState());
  enterRule(_localctx, 6, laplParser::RuleBlock);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(76);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case laplParser::BLOCK_OPEN: {
        enterOuterAlt(_localctx, 1);
        setState(65);
        match(laplParser::BLOCK_OPEN);
        setState(69);
        _errHandler->sync(this);
        _la = _input->LA(1);
        while ((((_la & ~ 0x3fULL) == 0) &&
          ((1ULL << _la) & ((1ULL << laplParser::SEMICOLON)
          | (1ULL << laplParser::BLOCK_OPEN)
          | (1ULL << laplParser::VARIABLE)
          | (1ULL << laplParser::WHILE)
          | (1ULL << laplParser::CONTINUE)
          | (1ULL << laplParser::BREAK)
          | (1ULL << laplParser::IF)
          | (1ULL << laplParser::DISPLAY)
          | (1ULL << laplParser::EXIT)
          | (1ULL << laplParser::RETURN)
          | (1ULL << laplParser::FUNCTION)
          | (1ULL << laplParser::IDENTIFIER))) != 0)) {
          setState(66);
          statement();
          setState(71);
          _errHandler->sync(this);
          _la = _input->LA(1);
        }
        setState(72);
        match(laplParser::BLOCK_CLOSE);
        break;
      }

      case laplParser::WHILE: {
        enterOuterAlt(_localctx, 2);
        setState(73);
        while_block();
        break;
      }

      case laplParser::IF: {
        enterOuterAlt(_localctx, 3);
        setState(74);
        if_block();
        break;
      }

      case laplParser::FUNCTION: {
        enterOuterAlt(_localctx, 4);
        setState(75);
        function_declaration();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Line_statementContext ------------------------------------------------------------------

laplParser::Line_statementContext::Line_statementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* laplParser::Line_statementContext::SEMICOLON() {
  return getToken(laplParser::SEMICOLON, 0);
}

laplParser::AssignmentContext* laplParser::Line_statementContext::assignment() {
  return getRuleContext<laplParser::AssignmentContext>(0);
}

laplParser::Function_callContext* laplParser::Line_statementContext::function_call() {
  return getRuleContext<laplParser::Function_callContext>(0);
}

laplParser::Continue_statementContext* laplParser::Line_statementContext::continue_statement() {
  return getRuleContext<laplParser::Continue_statementContext>(0);
}

laplParser::Break_statementContext* laplParser::Line_statementContext::break_statement() {
  return getRuleContext<laplParser::Break_statementContext>(0);
}

laplParser::Exit_statementContext* laplParser::Line_statementContext::exit_statement() {
  return getRuleContext<laplParser::Exit_statementContext>(0);
}

laplParser::Return_statementContext* laplParser::Line_statementContext::return_statement() {
  return getRuleContext<laplParser::Return_statementContext>(0);
}

laplParser::Display_statementContext* laplParser::Line_statementContext::display_statement() {
  return getRuleContext<laplParser::Display_statementContext>(0);
}


size_t laplParser::Line_statementContext::getRuleIndex() const {
  return laplParser::RuleLine_statement;
}


antlrcpp::Any laplParser::Line_statementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<laplVisitor*>(visitor))
    return parserVisitor->visitLine_statement(this);
  else
    return visitor->visitChildren(this);
}

laplParser::Line_statementContext* laplParser::line_statement() {
  Line_statementContext *_localctx = _tracker.createInstance<Line_statementContext>(_ctx, getState());
  enterRule(_localctx, 8, laplParser::RuleLine_statement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(85);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case laplParser::VARIABLE: {
        setState(78);
        assignment();
        break;
      }

      case laplParser::IDENTIFIER: {
        setState(79);
        function_call();
        break;
      }

      case laplParser::CONTINUE: {
        setState(80);
        continue_statement();
        break;
      }

      case laplParser::BREAK: {
        setState(81);
        break_statement();
        break;
      }

      case laplParser::EXIT: {
        setState(82);
        exit_statement();
        break;
      }

      case laplParser::RETURN: {
        setState(83);
        return_statement();
        break;
      }

      case laplParser::DISPLAY: {
        setState(84);
        display_statement();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
    setState(87);
    match(laplParser::SEMICOLON);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- StringContext ------------------------------------------------------------------

laplParser::StringContext::StringContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* laplParser::StringContext::STRING() {
  return getToken(laplParser::STRING, 0);
}

tree::TerminalNode* laplParser::StringContext::STR_OP() {
  return getToken(laplParser::STR_OP, 0);
}

laplParser::Number_expressionContext* laplParser::StringContext::number_expression() {
  return getRuleContext<laplParser::Number_expressionContext>(0);
}

tree::TerminalNode* laplParser::StringContext::LINEFEED() {
  return getToken(laplParser::LINEFEED, 0);
}

tree::TerminalNode* laplParser::StringContext::CRLF() {
  return getToken(laplParser::CRLF, 0);
}


size_t laplParser::StringContext::getRuleIndex() const {
  return laplParser::RuleString;
}


antlrcpp::Any laplParser::StringContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<laplVisitor*>(visitor))
    return parserVisitor->visitString(this);
  else
    return visitor->visitChildren(this);
}

laplParser::StringContext* laplParser::string() {
  StringContext *_localctx = _tracker.createInstance<StringContext>(_ctx, getState());
  enterRule(_localctx, 10, laplParser::RuleString);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(94);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case laplParser::STRING: {
        enterOuterAlt(_localctx, 1);
        setState(89);
        match(laplParser::STRING);
        break;
      }

      case laplParser::STR_OP: {
        enterOuterAlt(_localctx, 2);
        setState(90);
        match(laplParser::STR_OP);
        setState(91);
        number_expression(0);
        break;
      }

      case laplParser::LINEFEED: {
        enterOuterAlt(_localctx, 3);
        setState(92);
        match(laplParser::LINEFEED);
        break;
      }

      case laplParser::CRLF: {
        enterOuterAlt(_localctx, 4);
        setState(93);
        match(laplParser::CRLF);
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- NumberContext ------------------------------------------------------------------

laplParser::NumberContext::NumberContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* laplParser::NumberContext::NUMBER() {
  return getToken(laplParser::NUMBER, 0);
}

std::vector<tree::TerminalNode *> laplParser::NumberContext::PLUS_OP() {
  return getTokens(laplParser::PLUS_OP);
}

tree::TerminalNode* laplParser::NumberContext::PLUS_OP(size_t i) {
  return getToken(laplParser::PLUS_OP, i);
}

std::vector<tree::TerminalNode *> laplParser::NumberContext::MINUS_OP() {
  return getTokens(laplParser::MINUS_OP);
}

tree::TerminalNode* laplParser::NumberContext::MINUS_OP(size_t i) {
  return getToken(laplParser::MINUS_OP, i);
}

tree::TerminalNode* laplParser::NumberContext::NUM_OP() {
  return getToken(laplParser::NUM_OP, 0);
}

laplParser::String_expressionContext* laplParser::NumberContext::string_expression() {
  return getRuleContext<laplParser::String_expressionContext>(0);
}

tree::TerminalNode* laplParser::NumberContext::TYPE() {
  return getToken(laplParser::TYPE, 0);
}

laplParser::ValueContext* laplParser::NumberContext::value() {
  return getRuleContext<laplParser::ValueContext>(0);
}


size_t laplParser::NumberContext::getRuleIndex() const {
  return laplParser::RuleNumber;
}


antlrcpp::Any laplParser::NumberContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<laplVisitor*>(visitor))
    return parserVisitor->visitNumber(this);
  else
    return visitor->visitChildren(this);
}

laplParser::NumberContext* laplParser::number() {
  NumberContext *_localctx = _tracker.createInstance<NumberContext>(_ctx, getState());
  enterRule(_localctx, 12, laplParser::RuleNumber);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(113);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case laplParser::PLUS_OP:
      case laplParser::MINUS_OP:
      case laplParser::NUMBER: {
        enterOuterAlt(_localctx, 1);
        setState(99);
        _errHandler->sync(this);
        _la = _input->LA(1);
        while (_la == laplParser::PLUS_OP) {
          setState(96);
          match(laplParser::PLUS_OP);
          setState(101);
          _errHandler->sync(this);
          _la = _input->LA(1);
        }
        setState(105);
        _errHandler->sync(this);
        _la = _input->LA(1);
        while (_la == laplParser::MINUS_OP) {
          setState(102);
          match(laplParser::MINUS_OP);
          setState(107);
          _errHandler->sync(this);
          _la = _input->LA(1);
        }
        setState(108);
        match(laplParser::NUMBER);
        break;
      }

      case laplParser::NUM_OP: {
        enterOuterAlt(_localctx, 2);
        setState(109);
        match(laplParser::NUM_OP);
        setState(110);
        string_expression(0);
        break;
      }

      case laplParser::TYPE: {
        enterOuterAlt(_localctx, 3);
        setState(111);
        match(laplParser::TYPE);
        setState(112);
        value();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Number_expressionContext ------------------------------------------------------------------

laplParser::Number_expressionContext::Number_expressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

laplParser::NumberContext* laplParser::Number_expressionContext::number() {
  return getRuleContext<laplParser::NumberContext>(0);
}

laplParser::Function_callContext* laplParser::Number_expressionContext::function_call() {
  return getRuleContext<laplParser::Function_callContext>(0);
}

tree::TerminalNode* laplParser::Number_expressionContext::VARIABLE() {
  return getToken(laplParser::VARIABLE, 0);
}

tree::TerminalNode* laplParser::Number_expressionContext::CEIL_OP() {
  return getToken(laplParser::CEIL_OP, 0);
}

std::vector<laplParser::Number_expressionContext *> laplParser::Number_expressionContext::number_expression() {
  return getRuleContexts<laplParser::Number_expressionContext>();
}

laplParser::Number_expressionContext* laplParser::Number_expressionContext::number_expression(size_t i) {
  return getRuleContext<laplParser::Number_expressionContext>(i);
}

tree::TerminalNode* laplParser::Number_expressionContext::FLOOR_OP() {
  return getToken(laplParser::FLOOR_OP, 0);
}

tree::TerminalNode* laplParser::Number_expressionContext::LPAR() {
  return getToken(laplParser::LPAR, 0);
}

tree::TerminalNode* laplParser::Number_expressionContext::RPAR() {
  return getToken(laplParser::RPAR, 0);
}

tree::TerminalNode* laplParser::Number_expressionContext::POW_OP() {
  return getToken(laplParser::POW_OP, 0);
}

tree::TerminalNode* laplParser::Number_expressionContext::MOD_OP() {
  return getToken(laplParser::MOD_OP, 0);
}

tree::TerminalNode* laplParser::Number_expressionContext::DIV_OP() {
  return getToken(laplParser::DIV_OP, 0);
}

tree::TerminalNode* laplParser::Number_expressionContext::TIMES_OP() {
  return getToken(laplParser::TIMES_OP, 0);
}

tree::TerminalNode* laplParser::Number_expressionContext::MINUS_OP() {
  return getToken(laplParser::MINUS_OP, 0);
}

tree::TerminalNode* laplParser::Number_expressionContext::PLUS_OP() {
  return getToken(laplParser::PLUS_OP, 0);
}


size_t laplParser::Number_expressionContext::getRuleIndex() const {
  return laplParser::RuleNumber_expression;
}


antlrcpp::Any laplParser::Number_expressionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<laplVisitor*>(visitor))
    return parserVisitor->visitNumber_expression(this);
  else
    return visitor->visitChildren(this);
}


laplParser::Number_expressionContext* laplParser::number_expression() {
   return number_expression(0);
}

laplParser::Number_expressionContext* laplParser::number_expression(int precedence) {
  ParserRuleContext *parentContext = _ctx;
  size_t parentState = getState();
  laplParser::Number_expressionContext *_localctx = _tracker.createInstance<Number_expressionContext>(_ctx, parentState);
  laplParser::Number_expressionContext *previousContext = _localctx;
  (void)previousContext; // Silence compiler, in case the context is not used by generated code.
  size_t startState = 14;
  enterRecursionRule(_localctx, 14, laplParser::RuleNumber_expression, precedence);

    

  auto onExit = finally([=] {
    unrollRecursionContexts(parentContext);
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(127);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case laplParser::PLUS_OP:
      case laplParser::MINUS_OP:
      case laplParser::NUM_OP:
      case laplParser::TYPE:
      case laplParser::NUMBER: {
        setState(116);
        number();
        break;
      }

      case laplParser::IDENTIFIER: {
        setState(117);
        function_call();
        break;
      }

      case laplParser::VARIABLE: {
        setState(118);
        match(laplParser::VARIABLE);
        break;
      }

      case laplParser::CEIL_OP: {
        setState(119);
        match(laplParser::CEIL_OP);
        setState(120);
        number_expression(9);
        break;
      }

      case laplParser::FLOOR_OP: {
        setState(121);
        match(laplParser::FLOOR_OP);
        setState(122);
        number_expression(8);
        break;
      }

      case laplParser::LPAR: {
        setState(123);
        match(laplParser::LPAR);
        setState(124);
        number_expression(0);
        setState(125);
        match(laplParser::RPAR);
        break;
      }

    default:
      throw NoViableAltException(this);
    }
    _ctx->stop = _input->LT(-1);
    setState(149);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 11, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        if (!_parseListeners.empty())
          triggerExitRuleEvent();
        previousContext = _localctx;
        setState(147);
        _errHandler->sync(this);
        switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 10, _ctx)) {
        case 1: {
          _localctx = _tracker.createInstance<Number_expressionContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleNumber_expression);
          setState(129);

          if (!(precpred(_ctx, 7))) throw FailedPredicateException(this, "precpred(_ctx, 7)");
          setState(130);
          match(laplParser::POW_OP);
          setState(131);
          number_expression(8);
          break;
        }

        case 2: {
          _localctx = _tracker.createInstance<Number_expressionContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleNumber_expression);
          setState(132);

          if (!(precpred(_ctx, 6))) throw FailedPredicateException(this, "precpred(_ctx, 6)");
          setState(133);
          match(laplParser::MOD_OP);
          setState(134);
          number_expression(7);
          break;
        }

        case 3: {
          _localctx = _tracker.createInstance<Number_expressionContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleNumber_expression);
          setState(135);

          if (!(precpred(_ctx, 5))) throw FailedPredicateException(this, "precpred(_ctx, 5)");
          setState(136);
          match(laplParser::DIV_OP);
          setState(137);
          number_expression(6);
          break;
        }

        case 4: {
          _localctx = _tracker.createInstance<Number_expressionContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleNumber_expression);
          setState(138);

          if (!(precpred(_ctx, 4))) throw FailedPredicateException(this, "precpred(_ctx, 4)");
          setState(139);
          match(laplParser::TIMES_OP);
          setState(140);
          number_expression(5);
          break;
        }

        case 5: {
          _localctx = _tracker.createInstance<Number_expressionContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleNumber_expression);
          setState(141);

          if (!(precpred(_ctx, 3))) throw FailedPredicateException(this, "precpred(_ctx, 3)");
          setState(142);
          match(laplParser::MINUS_OP);
          setState(143);
          number_expression(4);
          break;
        }

        case 6: {
          _localctx = _tracker.createInstance<Number_expressionContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleNumber_expression);
          setState(144);

          if (!(precpred(_ctx, 2))) throw FailedPredicateException(this, "precpred(_ctx, 2)");
          setState(145);
          match(laplParser::PLUS_OP);
          setState(146);
          number_expression(3);
          break;
        }

        } 
      }
      setState(151);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 11, _ctx);
    }
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }
  return _localctx;
}

//----------------- String_expressionContext ------------------------------------------------------------------

laplParser::String_expressionContext::String_expressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

laplParser::StringContext* laplParser::String_expressionContext::string() {
  return getRuleContext<laplParser::StringContext>(0);
}

laplParser::Function_callContext* laplParser::String_expressionContext::function_call() {
  return getRuleContext<laplParser::Function_callContext>(0);
}

tree::TerminalNode* laplParser::String_expressionContext::VARIABLE() {
  return getToken(laplParser::VARIABLE, 0);
}

tree::TerminalNode* laplParser::String_expressionContext::LPAR() {
  return getToken(laplParser::LPAR, 0);
}

std::vector<laplParser::String_expressionContext *> laplParser::String_expressionContext::string_expression() {
  return getRuleContexts<laplParser::String_expressionContext>();
}

laplParser::String_expressionContext* laplParser::String_expressionContext::string_expression(size_t i) {
  return getRuleContext<laplParser::String_expressionContext>(i);
}

tree::TerminalNode* laplParser::String_expressionContext::RPAR() {
  return getToken(laplParser::RPAR, 0);
}

tree::TerminalNode* laplParser::String_expressionContext::CONCAT_OP() {
  return getToken(laplParser::CONCAT_OP, 0);
}

tree::TerminalNode* laplParser::String_expressionContext::INDEX_ACCESS_O() {
  return getToken(laplParser::INDEX_ACCESS_O, 0);
}

std::vector<laplParser::Number_expressionContext *> laplParser::String_expressionContext::number_expression() {
  return getRuleContexts<laplParser::Number_expressionContext>();
}

laplParser::Number_expressionContext* laplParser::String_expressionContext::number_expression(size_t i) {
  return getRuleContext<laplParser::Number_expressionContext>(i);
}

tree::TerminalNode* laplParser::String_expressionContext::INDEX_ACCESS_C() {
  return getToken(laplParser::INDEX_ACCESS_C, 0);
}

tree::TerminalNode* laplParser::String_expressionContext::COMMA() {
  return getToken(laplParser::COMMA, 0);
}


size_t laplParser::String_expressionContext::getRuleIndex() const {
  return laplParser::RuleString_expression;
}


antlrcpp::Any laplParser::String_expressionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<laplVisitor*>(visitor))
    return parserVisitor->visitString_expression(this);
  else
    return visitor->visitChildren(this);
}


laplParser::String_expressionContext* laplParser::string_expression() {
   return string_expression(0);
}

laplParser::String_expressionContext* laplParser::string_expression(int precedence) {
  ParserRuleContext *parentContext = _ctx;
  size_t parentState = getState();
  laplParser::String_expressionContext *_localctx = _tracker.createInstance<String_expressionContext>(_ctx, parentState);
  laplParser::String_expressionContext *previousContext = _localctx;
  (void)previousContext; // Silence compiler, in case the context is not used by generated code.
  size_t startState = 16;
  enterRecursionRule(_localctx, 16, laplParser::RuleString_expression, precedence);

    

  auto onExit = finally([=] {
    unrollRecursionContexts(parentContext);
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(160);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case laplParser::STR_OP:
      case laplParser::LINEFEED:
      case laplParser::CRLF:
      case laplParser::STRING: {
        setState(153);
        string();
        break;
      }

      case laplParser::IDENTIFIER: {
        setState(154);
        function_call();
        break;
      }

      case laplParser::VARIABLE: {
        setState(155);
        match(laplParser::VARIABLE);
        break;
      }

      case laplParser::LPAR: {
        setState(156);
        match(laplParser::LPAR);
        setState(157);
        string_expression(0);
        setState(158);
        match(laplParser::RPAR);
        break;
      }

    default:
      throw NoViableAltException(this);
    }
    _ctx->stop = _input->LT(-1);
    setState(179);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 14, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        if (!_parseListeners.empty())
          triggerExitRuleEvent();
        previousContext = _localctx;
        setState(177);
        _errHandler->sync(this);
        switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 13, _ctx)) {
        case 1: {
          _localctx = _tracker.createInstance<String_expressionContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleString_expression);
          setState(162);

          if (!(precpred(_ctx, 2))) throw FailedPredicateException(this, "precpred(_ctx, 2)");
          setState(163);
          match(laplParser::CONCAT_OP);
          setState(164);
          string_expression(3);
          break;
        }

        case 2: {
          _localctx = _tracker.createInstance<String_expressionContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleString_expression);
          setState(165);

          if (!(precpred(_ctx, 4))) throw FailedPredicateException(this, "precpred(_ctx, 4)");
          setState(166);
          match(laplParser::INDEX_ACCESS_O);
          setState(167);
          number_expression(0);
          setState(168);
          match(laplParser::INDEX_ACCESS_C);
          break;
        }

        case 3: {
          _localctx = _tracker.createInstance<String_expressionContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleString_expression);
          setState(170);

          if (!(precpred(_ctx, 3))) throw FailedPredicateException(this, "precpred(_ctx, 3)");
          setState(171);
          match(laplParser::INDEX_ACCESS_O);
          setState(172);
          number_expression(0);
          setState(173);
          match(laplParser::COMMA);
          setState(174);
          number_expression(0);
          setState(175);
          match(laplParser::INDEX_ACCESS_C);
          break;
        }

        } 
      }
      setState(181);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 14, _ctx);
    }
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }
  return _localctx;
}

//----------------- ValueContext ------------------------------------------------------------------

laplParser::ValueContext::ValueContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* laplParser::ValueContext::VARIABLE() {
  return getToken(laplParser::VARIABLE, 0);
}

laplParser::String_expressionContext* laplParser::ValueContext::string_expression() {
  return getRuleContext<laplParser::String_expressionContext>(0);
}

laplParser::Number_expressionContext* laplParser::ValueContext::number_expression() {
  return getRuleContext<laplParser::Number_expressionContext>(0);
}

laplParser::Boolean_exprContext* laplParser::ValueContext::boolean_expr() {
  return getRuleContext<laplParser::Boolean_exprContext>(0);
}


size_t laplParser::ValueContext::getRuleIndex() const {
  return laplParser::RuleValue;
}


antlrcpp::Any laplParser::ValueContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<laplVisitor*>(visitor))
    return parserVisitor->visitValue(this);
  else
    return visitor->visitChildren(this);
}

laplParser::ValueContext* laplParser::value() {
  ValueContext *_localctx = _tracker.createInstance<ValueContext>(_ctx, getState());
  enterRule(_localctx, 18, laplParser::RuleValue);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(186);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 15, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(182);
      match(laplParser::VARIABLE);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(183);
      string_expression(0);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(184);
      number_expression(0);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(185);
      boolean_expr(0);
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ArgumentContext ------------------------------------------------------------------

laplParser::ArgumentContext::ArgumentContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* laplParser::ArgumentContext::REF_OP() {
  return getToken(laplParser::REF_OP, 0);
}

tree::TerminalNode* laplParser::ArgumentContext::VARIABLE() {
  return getToken(laplParser::VARIABLE, 0);
}

laplParser::ValueContext* laplParser::ArgumentContext::value() {
  return getRuleContext<laplParser::ValueContext>(0);
}


size_t laplParser::ArgumentContext::getRuleIndex() const {
  return laplParser::RuleArgument;
}


antlrcpp::Any laplParser::ArgumentContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<laplVisitor*>(visitor))
    return parserVisitor->visitArgument(this);
  else
    return visitor->visitChildren(this);
}

laplParser::ArgumentContext* laplParser::argument() {
  ArgumentContext *_localctx = _tracker.createInstance<ArgumentContext>(_ctx, getState());
  enterRule(_localctx, 20, laplParser::RuleArgument);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(191);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case laplParser::REF_OP: {
        enterOuterAlt(_localctx, 1);
        setState(188);
        match(laplParser::REF_OP);
        setState(189);
        match(laplParser::VARIABLE);
        break;
      }

      case laplParser::PLUS_OP:
      case laplParser::MINUS_OP:
      case laplParser::LPAR:
      case laplParser::VARIABLE:
      case laplParser::FLOOR_OP:
      case laplParser::CEIL_OP:
      case laplParser::NOT_OP:
      case laplParser::STR_OP:
      case laplParser::NUM_OP:
      case laplParser::TRUE:
      case laplParser::FALSE:
      case laplParser::LINEFEED:
      case laplParser::CRLF:
      case laplParser::TYPE:
      case laplParser::IDENTIFIER:
      case laplParser::NUMBER:
      case laplParser::STRING: {
        enterOuterAlt(_localctx, 2);
        setState(190);
        value();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- AssignmentContext ------------------------------------------------------------------

laplParser::AssignmentContext::AssignmentContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* laplParser::AssignmentContext::VARIABLE() {
  return getToken(laplParser::VARIABLE, 0);
}

tree::TerminalNode* laplParser::AssignmentContext::ASSIGN_OP() {
  return getToken(laplParser::ASSIGN_OP, 0);
}

laplParser::ValueContext* laplParser::AssignmentContext::value() {
  return getRuleContext<laplParser::ValueContext>(0);
}


size_t laplParser::AssignmentContext::getRuleIndex() const {
  return laplParser::RuleAssignment;
}


antlrcpp::Any laplParser::AssignmentContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<laplVisitor*>(visitor))
    return parserVisitor->visitAssignment(this);
  else
    return visitor->visitChildren(this);
}

laplParser::AssignmentContext* laplParser::assignment() {
  AssignmentContext *_localctx = _tracker.createInstance<AssignmentContext>(_ctx, getState());
  enterRule(_localctx, 22, laplParser::RuleAssignment);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(193);
    match(laplParser::VARIABLE);
    setState(194);
    match(laplParser::ASSIGN_OP);
    setState(195);
    value();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Function_callContext ------------------------------------------------------------------

laplParser::Function_callContext::Function_callContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* laplParser::Function_callContext::IDENTIFIER() {
  return getToken(laplParser::IDENTIFIER, 0);
}

tree::TerminalNode* laplParser::Function_callContext::LPAR() {
  return getToken(laplParser::LPAR, 0);
}

std::vector<laplParser::ArgumentContext *> laplParser::Function_callContext::argument() {
  return getRuleContexts<laplParser::ArgumentContext>();
}

laplParser::ArgumentContext* laplParser::Function_callContext::argument(size_t i) {
  return getRuleContext<laplParser::ArgumentContext>(i);
}

tree::TerminalNode* laplParser::Function_callContext::RPAR() {
  return getToken(laplParser::RPAR, 0);
}

std::vector<tree::TerminalNode *> laplParser::Function_callContext::COMMA() {
  return getTokens(laplParser::COMMA);
}

tree::TerminalNode* laplParser::Function_callContext::COMMA(size_t i) {
  return getToken(laplParser::COMMA, i);
}


size_t laplParser::Function_callContext::getRuleIndex() const {
  return laplParser::RuleFunction_call;
}


antlrcpp::Any laplParser::Function_callContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<laplVisitor*>(visitor))
    return parserVisitor->visitFunction_call(this);
  else
    return visitor->visitChildren(this);
}

laplParser::Function_callContext* laplParser::function_call() {
  Function_callContext *_localctx = _tracker.createInstance<Function_callContext>(_ctx, getState());
  enterRule(_localctx, 24, laplParser::RuleFunction_call);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(197);
    match(laplParser::IDENTIFIER);
    setState(198);
    match(laplParser::LPAR);
    setState(199);
    argument();
    setState(204);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == laplParser::COMMA) {
      setState(200);
      match(laplParser::COMMA);
      setState(201);
      argument();
      setState(206);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(207);
    match(laplParser::RPAR);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- While_blockContext ------------------------------------------------------------------

laplParser::While_blockContext::While_blockContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* laplParser::While_blockContext::WHILE() {
  return getToken(laplParser::WHILE, 0);
}

laplParser::Boolean_exprContext* laplParser::While_blockContext::boolean_expr() {
  return getRuleContext<laplParser::Boolean_exprContext>(0);
}

laplParser::StatementContext* laplParser::While_blockContext::statement() {
  return getRuleContext<laplParser::StatementContext>(0);
}


size_t laplParser::While_blockContext::getRuleIndex() const {
  return laplParser::RuleWhile_block;
}


antlrcpp::Any laplParser::While_blockContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<laplVisitor*>(visitor))
    return parserVisitor->visitWhile_block(this);
  else
    return visitor->visitChildren(this);
}

laplParser::While_blockContext* laplParser::while_block() {
  While_blockContext *_localctx = _tracker.createInstance<While_blockContext>(_ctx, getState());
  enterRule(_localctx, 26, laplParser::RuleWhile_block);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(209);
    match(laplParser::WHILE);
    setState(210);
    boolean_expr(0);
    setState(211);
    statement();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Boolean_valueContext ------------------------------------------------------------------

laplParser::Boolean_valueContext::Boolean_valueContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* laplParser::Boolean_valueContext::TRUE() {
  return getToken(laplParser::TRUE, 0);
}

tree::TerminalNode* laplParser::Boolean_valueContext::FALSE() {
  return getToken(laplParser::FALSE, 0);
}


size_t laplParser::Boolean_valueContext::getRuleIndex() const {
  return laplParser::RuleBoolean_value;
}


antlrcpp::Any laplParser::Boolean_valueContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<laplVisitor*>(visitor))
    return parserVisitor->visitBoolean_value(this);
  else
    return visitor->visitChildren(this);
}

laplParser::Boolean_valueContext* laplParser::boolean_value() {
  Boolean_valueContext *_localctx = _tracker.createInstance<Boolean_valueContext>(_ctx, getState());
  enterRule(_localctx, 28, laplParser::RuleBoolean_value);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(213);
    _la = _input->LA(1);
    if (!(_la == laplParser::TRUE

    || _la == laplParser::FALSE)) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Boolean_exprContext ------------------------------------------------------------------

laplParser::Boolean_exprContext::Boolean_exprContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

laplParser::Boolean_valueContext* laplParser::Boolean_exprContext::boolean_value() {
  return getRuleContext<laplParser::Boolean_valueContext>(0);
}

laplParser::Function_callContext* laplParser::Boolean_exprContext::function_call() {
  return getRuleContext<laplParser::Function_callContext>(0);
}

tree::TerminalNode* laplParser::Boolean_exprContext::VARIABLE() {
  return getToken(laplParser::VARIABLE, 0);
}

tree::TerminalNode* laplParser::Boolean_exprContext::NOT_OP() {
  return getToken(laplParser::NOT_OP, 0);
}

std::vector<laplParser::Boolean_exprContext *> laplParser::Boolean_exprContext::boolean_expr() {
  return getRuleContexts<laplParser::Boolean_exprContext>();
}

laplParser::Boolean_exprContext* laplParser::Boolean_exprContext::boolean_expr(size_t i) {
  return getRuleContext<laplParser::Boolean_exprContext>(i);
}

std::vector<laplParser::String_expressionContext *> laplParser::Boolean_exprContext::string_expression() {
  return getRuleContexts<laplParser::String_expressionContext>();
}

laplParser::String_expressionContext* laplParser::Boolean_exprContext::string_expression(size_t i) {
  return getRuleContext<laplParser::String_expressionContext>(i);
}

tree::TerminalNode* laplParser::Boolean_exprContext::EQ_OP() {
  return getToken(laplParser::EQ_OP, 0);
}

tree::TerminalNode* laplParser::Boolean_exprContext::NEQ_OP() {
  return getToken(laplParser::NEQ_OP, 0);
}

tree::TerminalNode* laplParser::Boolean_exprContext::LT_OP() {
  return getToken(laplParser::LT_OP, 0);
}

tree::TerminalNode* laplParser::Boolean_exprContext::GT_OP() {
  return getToken(laplParser::GT_OP, 0);
}

tree::TerminalNode* laplParser::Boolean_exprContext::LE_OP() {
  return getToken(laplParser::LE_OP, 0);
}

tree::TerminalNode* laplParser::Boolean_exprContext::GE_OP() {
  return getToken(laplParser::GE_OP, 0);
}

std::vector<laplParser::Number_expressionContext *> laplParser::Boolean_exprContext::number_expression() {
  return getRuleContexts<laplParser::Number_expressionContext>();
}

laplParser::Number_expressionContext* laplParser::Boolean_exprContext::number_expression(size_t i) {
  return getRuleContext<laplParser::Number_expressionContext>(i);
}

tree::TerminalNode* laplParser::Boolean_exprContext::LPAR() {
  return getToken(laplParser::LPAR, 0);
}

tree::TerminalNode* laplParser::Boolean_exprContext::RPAR() {
  return getToken(laplParser::RPAR, 0);
}

tree::TerminalNode* laplParser::Boolean_exprContext::OR_OP() {
  return getToken(laplParser::OR_OP, 0);
}

tree::TerminalNode* laplParser::Boolean_exprContext::AND_OP() {
  return getToken(laplParser::AND_OP, 0);
}


size_t laplParser::Boolean_exprContext::getRuleIndex() const {
  return laplParser::RuleBoolean_expr;
}


antlrcpp::Any laplParser::Boolean_exprContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<laplVisitor*>(visitor))
    return parserVisitor->visitBoolean_expr(this);
  else
    return visitor->visitChildren(this);
}


laplParser::Boolean_exprContext* laplParser::boolean_expr() {
   return boolean_expr(0);
}

laplParser::Boolean_exprContext* laplParser::boolean_expr(int precedence) {
  ParserRuleContext *parentContext = _ctx;
  size_t parentState = getState();
  laplParser::Boolean_exprContext *_localctx = _tracker.createInstance<Boolean_exprContext>(_ctx, parentState);
  laplParser::Boolean_exprContext *previousContext = _localctx;
  (void)previousContext; // Silence compiler, in case the context is not used by generated code.
  size_t startState = 30;
  enterRecursionRule(_localctx, 30, laplParser::RuleBoolean_expr, precedence);

    

  auto onExit = finally([=] {
    unrollRecursionContexts(parentContext);
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(273);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 18, _ctx)) {
    case 1: {
      setState(216);
      boolean_value();
      break;
    }

    case 2: {
      setState(217);
      function_call();
      break;
    }

    case 3: {
      setState(218);
      match(laplParser::VARIABLE);
      break;
    }

    case 4: {
      setState(219);
      match(laplParser::NOT_OP);
      setState(220);
      boolean_expr(16);
      break;
    }

    case 5: {
      setState(221);
      string_expression(0);
      setState(222);
      match(laplParser::EQ_OP);
      setState(223);
      string_expression(0);
      break;
    }

    case 6: {
      setState(225);
      string_expression(0);
      setState(226);
      match(laplParser::NEQ_OP);
      setState(227);
      string_expression(0);
      break;
    }

    case 7: {
      setState(229);
      string_expression(0);
      setState(230);
      match(laplParser::LT_OP);
      setState(231);
      string_expression(0);
      break;
    }

    case 8: {
      setState(233);
      string_expression(0);
      setState(234);
      match(laplParser::GT_OP);
      setState(235);
      string_expression(0);
      break;
    }

    case 9: {
      setState(237);
      string_expression(0);
      setState(238);
      match(laplParser::LE_OP);
      setState(239);
      string_expression(0);
      break;
    }

    case 10: {
      setState(241);
      string_expression(0);
      setState(242);
      match(laplParser::GE_OP);
      setState(243);
      string_expression(0);
      break;
    }

    case 11: {
      setState(245);
      number_expression(0);
      setState(246);
      match(laplParser::EQ_OP);
      setState(247);
      number_expression(0);
      break;
    }

    case 12: {
      setState(249);
      number_expression(0);
      setState(250);
      match(laplParser::NEQ_OP);
      setState(251);
      number_expression(0);
      break;
    }

    case 13: {
      setState(253);
      number_expression(0);
      setState(254);
      match(laplParser::LT_OP);
      setState(255);
      number_expression(0);
      break;
    }

    case 14: {
      setState(257);
      number_expression(0);
      setState(258);
      match(laplParser::GT_OP);
      setState(259);
      number_expression(0);
      break;
    }

    case 15: {
      setState(261);
      number_expression(0);
      setState(262);
      match(laplParser::LE_OP);
      setState(263);
      number_expression(0);
      break;
    }

    case 16: {
      setState(265);
      number_expression(0);
      setState(266);
      match(laplParser::GE_OP);
      setState(267);
      number_expression(0);
      break;
    }

    case 17: {
      setState(269);
      match(laplParser::LPAR);
      setState(270);
      boolean_expr(0);
      setState(271);
      match(laplParser::RPAR);
      break;
    }

    }
    _ctx->stop = _input->LT(-1);
    setState(283);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 20, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        if (!_parseListeners.empty())
          triggerExitRuleEvent();
        previousContext = _localctx;
        setState(281);
        _errHandler->sync(this);
        switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 19, _ctx)) {
        case 1: {
          _localctx = _tracker.createInstance<Boolean_exprContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleBoolean_expr);
          setState(275);

          if (!(precpred(_ctx, 3))) throw FailedPredicateException(this, "precpred(_ctx, 3)");
          setState(276);
          match(laplParser::OR_OP);
          setState(277);
          boolean_expr(4);
          break;
        }

        case 2: {
          _localctx = _tracker.createInstance<Boolean_exprContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleBoolean_expr);
          setState(278);

          if (!(precpred(_ctx, 2))) throw FailedPredicateException(this, "precpred(_ctx, 2)");
          setState(279);
          match(laplParser::AND_OP);
          setState(280);
          boolean_expr(3);
          break;
        }

        } 
      }
      setState(285);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 20, _ctx);
    }
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }
  return _localctx;
}

//----------------- If_blockContext ------------------------------------------------------------------

laplParser::If_blockContext::If_blockContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* laplParser::If_blockContext::IF() {
  return getToken(laplParser::IF, 0);
}

laplParser::Boolean_exprContext* laplParser::If_blockContext::boolean_expr() {
  return getRuleContext<laplParser::Boolean_exprContext>(0);
}

laplParser::StatementContext* laplParser::If_blockContext::statement() {
  return getRuleContext<laplParser::StatementContext>(0);
}

laplParser::Else_blockContext* laplParser::If_blockContext::else_block() {
  return getRuleContext<laplParser::Else_blockContext>(0);
}


size_t laplParser::If_blockContext::getRuleIndex() const {
  return laplParser::RuleIf_block;
}


antlrcpp::Any laplParser::If_blockContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<laplVisitor*>(visitor))
    return parserVisitor->visitIf_block(this);
  else
    return visitor->visitChildren(this);
}

laplParser::If_blockContext* laplParser::if_block() {
  If_blockContext *_localctx = _tracker.createInstance<If_blockContext>(_ctx, getState());
  enterRule(_localctx, 32, laplParser::RuleIf_block);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(286);
    match(laplParser::IF);
    setState(287);
    boolean_expr(0);
    setState(288);
    statement();
    setState(290);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 21, _ctx)) {
    case 1: {
      setState(289);
      else_block();
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Else_blockContext ------------------------------------------------------------------

laplParser::Else_blockContext::Else_blockContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* laplParser::Else_blockContext::ELSE() {
  return getToken(laplParser::ELSE, 0);
}

laplParser::StatementContext* laplParser::Else_blockContext::statement() {
  return getRuleContext<laplParser::StatementContext>(0);
}


size_t laplParser::Else_blockContext::getRuleIndex() const {
  return laplParser::RuleElse_block;
}


antlrcpp::Any laplParser::Else_blockContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<laplVisitor*>(visitor))
    return parserVisitor->visitElse_block(this);
  else
    return visitor->visitChildren(this);
}

laplParser::Else_blockContext* laplParser::else_block() {
  Else_blockContext *_localctx = _tracker.createInstance<Else_blockContext>(_ctx, getState());
  enterRule(_localctx, 34, laplParser::RuleElse_block);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(292);
    match(laplParser::ELSE);
    setState(293);
    statement();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Continue_statementContext ------------------------------------------------------------------

laplParser::Continue_statementContext::Continue_statementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* laplParser::Continue_statementContext::CONTINUE() {
  return getToken(laplParser::CONTINUE, 0);
}


size_t laplParser::Continue_statementContext::getRuleIndex() const {
  return laplParser::RuleContinue_statement;
}


antlrcpp::Any laplParser::Continue_statementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<laplVisitor*>(visitor))
    return parserVisitor->visitContinue_statement(this);
  else
    return visitor->visitChildren(this);
}

laplParser::Continue_statementContext* laplParser::continue_statement() {
  Continue_statementContext *_localctx = _tracker.createInstance<Continue_statementContext>(_ctx, getState());
  enterRule(_localctx, 36, laplParser::RuleContinue_statement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(295);
    match(laplParser::CONTINUE);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Break_statementContext ------------------------------------------------------------------

laplParser::Break_statementContext::Break_statementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* laplParser::Break_statementContext::BREAK() {
  return getToken(laplParser::BREAK, 0);
}


size_t laplParser::Break_statementContext::getRuleIndex() const {
  return laplParser::RuleBreak_statement;
}


antlrcpp::Any laplParser::Break_statementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<laplVisitor*>(visitor))
    return parserVisitor->visitBreak_statement(this);
  else
    return visitor->visitChildren(this);
}

laplParser::Break_statementContext* laplParser::break_statement() {
  Break_statementContext *_localctx = _tracker.createInstance<Break_statementContext>(_ctx, getState());
  enterRule(_localctx, 38, laplParser::RuleBreak_statement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(297);
    match(laplParser::BREAK);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Exit_statementContext ------------------------------------------------------------------

laplParser::Exit_statementContext::Exit_statementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* laplParser::Exit_statementContext::EXIT() {
  return getToken(laplParser::EXIT, 0);
}

laplParser::Number_expressionContext* laplParser::Exit_statementContext::number_expression() {
  return getRuleContext<laplParser::Number_expressionContext>(0);
}


size_t laplParser::Exit_statementContext::getRuleIndex() const {
  return laplParser::RuleExit_statement;
}


antlrcpp::Any laplParser::Exit_statementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<laplVisitor*>(visitor))
    return parserVisitor->visitExit_statement(this);
  else
    return visitor->visitChildren(this);
}

laplParser::Exit_statementContext* laplParser::exit_statement() {
  Exit_statementContext *_localctx = _tracker.createInstance<Exit_statementContext>(_ctx, getState());
  enterRule(_localctx, 40, laplParser::RuleExit_statement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(302);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 22, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(299);
      match(laplParser::EXIT);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(300);
      match(laplParser::EXIT);
      setState(301);
      number_expression(0);
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Function_declarationContext ------------------------------------------------------------------

laplParser::Function_declarationContext::Function_declarationContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* laplParser::Function_declarationContext::FUNCTION() {
  return getToken(laplParser::FUNCTION, 0);
}

tree::TerminalNode* laplParser::Function_declarationContext::IDENTIFIER() {
  return getToken(laplParser::IDENTIFIER, 0);
}

tree::TerminalNode* laplParser::Function_declarationContext::LPAR() {
  return getToken(laplParser::LPAR, 0);
}

tree::TerminalNode* laplParser::Function_declarationContext::RPAR() {
  return getToken(laplParser::RPAR, 0);
}

laplParser::StatementContext* laplParser::Function_declarationContext::statement() {
  return getRuleContext<laplParser::StatementContext>(0);
}

std::vector<tree::TerminalNode *> laplParser::Function_declarationContext::VARIABLE() {
  return getTokens(laplParser::VARIABLE);
}

tree::TerminalNode* laplParser::Function_declarationContext::VARIABLE(size_t i) {
  return getToken(laplParser::VARIABLE, i);
}

std::vector<tree::TerminalNode *> laplParser::Function_declarationContext::COMMA() {
  return getTokens(laplParser::COMMA);
}

tree::TerminalNode* laplParser::Function_declarationContext::COMMA(size_t i) {
  return getToken(laplParser::COMMA, i);
}


size_t laplParser::Function_declarationContext::getRuleIndex() const {
  return laplParser::RuleFunction_declaration;
}


antlrcpp::Any laplParser::Function_declarationContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<laplVisitor*>(visitor))
    return parserVisitor->visitFunction_declaration(this);
  else
    return visitor->visitChildren(this);
}

laplParser::Function_declarationContext* laplParser::function_declaration() {
  Function_declarationContext *_localctx = _tracker.createInstance<Function_declarationContext>(_ctx, getState());
  enterRule(_localctx, 42, laplParser::RuleFunction_declaration);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(304);
    match(laplParser::FUNCTION);
    setState(305);
    match(laplParser::IDENTIFIER);
    setState(306);
    match(laplParser::LPAR);
    setState(315);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == laplParser::VARIABLE) {
      setState(307);
      match(laplParser::VARIABLE);
      setState(312);
      _errHandler->sync(this);
      _la = _input->LA(1);
      while (_la == laplParser::COMMA) {
        setState(308);
        match(laplParser::COMMA);
        setState(309);
        match(laplParser::VARIABLE);
        setState(314);
        _errHandler->sync(this);
        _la = _input->LA(1);
      }
    }
    setState(317);
    match(laplParser::RPAR);
    setState(318);
    statement();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Return_statementContext ------------------------------------------------------------------

laplParser::Return_statementContext::Return_statementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* laplParser::Return_statementContext::RETURN() {
  return getToken(laplParser::RETURN, 0);
}

laplParser::ValueContext* laplParser::Return_statementContext::value() {
  return getRuleContext<laplParser::ValueContext>(0);
}


size_t laplParser::Return_statementContext::getRuleIndex() const {
  return laplParser::RuleReturn_statement;
}


antlrcpp::Any laplParser::Return_statementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<laplVisitor*>(visitor))
    return parserVisitor->visitReturn_statement(this);
  else
    return visitor->visitChildren(this);
}

laplParser::Return_statementContext* laplParser::return_statement() {
  Return_statementContext *_localctx = _tracker.createInstance<Return_statementContext>(_ctx, getState());
  enterRule(_localctx, 44, laplParser::RuleReturn_statement);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(320);
    match(laplParser::RETURN);
    setState(322);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (((((_la - 14) & ~ 0x3fULL) == 0) &&
      ((1ULL << (_la - 14)) & ((1ULL << (laplParser::PLUS_OP - 14))
      | (1ULL << (laplParser::MINUS_OP - 14))
      | (1ULL << (laplParser::LPAR - 14))
      | (1ULL << (laplParser::VARIABLE - 14))
      | (1ULL << (laplParser::FLOOR_OP - 14))
      | (1ULL << (laplParser::CEIL_OP - 14))
      | (1ULL << (laplParser::NOT_OP - 14))
      | (1ULL << (laplParser::STR_OP - 14))
      | (1ULL << (laplParser::NUM_OP - 14))
      | (1ULL << (laplParser::TRUE - 14))
      | (1ULL << (laplParser::FALSE - 14))
      | (1ULL << (laplParser::LINEFEED - 14))
      | (1ULL << (laplParser::CRLF - 14))
      | (1ULL << (laplParser::TYPE - 14))
      | (1ULL << (laplParser::IDENTIFIER - 14))
      | (1ULL << (laplParser::NUMBER - 14))
      | (1ULL << (laplParser::STRING - 14)))) != 0)) {
      setState(321);
      value();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Display_statementContext ------------------------------------------------------------------

laplParser::Display_statementContext::Display_statementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* laplParser::Display_statementContext::DISPLAY() {
  return getToken(laplParser::DISPLAY, 0);
}

laplParser::Display_valuesContext* laplParser::Display_statementContext::display_values() {
  return getRuleContext<laplParser::Display_valuesContext>(0);
}


size_t laplParser::Display_statementContext::getRuleIndex() const {
  return laplParser::RuleDisplay_statement;
}


antlrcpp::Any laplParser::Display_statementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<laplVisitor*>(visitor))
    return parserVisitor->visitDisplay_statement(this);
  else
    return visitor->visitChildren(this);
}

laplParser::Display_statementContext* laplParser::display_statement() {
  Display_statementContext *_localctx = _tracker.createInstance<Display_statementContext>(_ctx, getState());
  enterRule(_localctx, 46, laplParser::RuleDisplay_statement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(324);
    match(laplParser::DISPLAY);
    setState(325);
    display_values();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Display_valuesContext ------------------------------------------------------------------

laplParser::Display_valuesContext::Display_valuesContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<laplParser::ValueContext *> laplParser::Display_valuesContext::value() {
  return getRuleContexts<laplParser::ValueContext>();
}

laplParser::ValueContext* laplParser::Display_valuesContext::value(size_t i) {
  return getRuleContext<laplParser::ValueContext>(i);
}


size_t laplParser::Display_valuesContext::getRuleIndex() const {
  return laplParser::RuleDisplay_values;
}


antlrcpp::Any laplParser::Display_valuesContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<laplVisitor*>(visitor))
    return parserVisitor->visitDisplay_values(this);
  else
    return visitor->visitChildren(this);
}

laplParser::Display_valuesContext* laplParser::display_values() {
  Display_valuesContext *_localctx = _tracker.createInstance<Display_valuesContext>(_ctx, getState());
  enterRule(_localctx, 48, laplParser::RuleDisplay_values);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(328); 
    _errHandler->sync(this);
    _la = _input->LA(1);
    do {
      setState(327);
      value();
      setState(330); 
      _errHandler->sync(this);
      _la = _input->LA(1);
    } while (((((_la - 14) & ~ 0x3fULL) == 0) &&
      ((1ULL << (_la - 14)) & ((1ULL << (laplParser::PLUS_OP - 14))
      | (1ULL << (laplParser::MINUS_OP - 14))
      | (1ULL << (laplParser::LPAR - 14))
      | (1ULL << (laplParser::VARIABLE - 14))
      | (1ULL << (laplParser::FLOOR_OP - 14))
      | (1ULL << (laplParser::CEIL_OP - 14))
      | (1ULL << (laplParser::NOT_OP - 14))
      | (1ULL << (laplParser::STR_OP - 14))
      | (1ULL << (laplParser::NUM_OP - 14))
      | (1ULL << (laplParser::TRUE - 14))
      | (1ULL << (laplParser::FALSE - 14))
      | (1ULL << (laplParser::LINEFEED - 14))
      | (1ULL << (laplParser::CRLF - 14))
      | (1ULL << (laplParser::TYPE - 14))
      | (1ULL << (laplParser::IDENTIFIER - 14))
      | (1ULL << (laplParser::NUMBER - 14))
      | (1ULL << (laplParser::STRING - 14)))) != 0));
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

bool laplParser::sempred(RuleContext *context, size_t ruleIndex, size_t predicateIndex) {
  switch (ruleIndex) {
    case 7: return number_expressionSempred(dynamic_cast<Number_expressionContext *>(context), predicateIndex);
    case 8: return string_expressionSempred(dynamic_cast<String_expressionContext *>(context), predicateIndex);
    case 15: return boolean_exprSempred(dynamic_cast<Boolean_exprContext *>(context), predicateIndex);

  default:
    break;
  }
  return true;
}

bool laplParser::number_expressionSempred(Number_expressionContext *_localctx, size_t predicateIndex) {
  switch (predicateIndex) {
    case 0: return precpred(_ctx, 7);
    case 1: return precpred(_ctx, 6);
    case 2: return precpred(_ctx, 5);
    case 3: return precpred(_ctx, 4);
    case 4: return precpred(_ctx, 3);
    case 5: return precpred(_ctx, 2);

  default:
    break;
  }
  return true;
}

bool laplParser::string_expressionSempred(String_expressionContext *_localctx, size_t predicateIndex) {
  switch (predicateIndex) {
    case 6: return precpred(_ctx, 2);
    case 7: return precpred(_ctx, 4);
    case 8: return precpred(_ctx, 3);

  default:
    break;
  }
  return true;
}

bool laplParser::boolean_exprSempred(Boolean_exprContext *_localctx, size_t predicateIndex) {
  switch (predicateIndex) {
    case 9: return precpred(_ctx, 3);
    case 10: return precpred(_ctx, 2);

  default:
    break;
  }
  return true;
}

// Static vars and initialization.
std::vector<dfa::DFA> laplParser::_decisionToDFA;
atn::PredictionContextCache laplParser::_sharedContextCache;

// We own the ATN which in turn owns the ATN states.
atn::ATN laplParser::_atn;
std::vector<uint16_t> laplParser::_serializedATN;

std::vector<std::string> laplParser::_ruleNames = {
  "lapl_source", "statement", "empty_line", "block", "line_statement", "string", 
  "number", "number_expression", "string_expression", "value", "argument", 
  "assignment", "function_call", "while_block", "boolean_value", "boolean_expr", 
  "if_block", "else_block", "continue_statement", "break_statement", "exit_statement", 
  "function_declaration", "return_statement", "display_statement", "display_values"
};

std::vector<std::string> laplParser::_literalNames = {
  "", "", "", "", "", "", "", "", "'=='", "'!='", "'<'", "'>'", "'<='", 
  "'>='", "'+'", "'-'", "'**'", "'*'", "'/'", "'%'", "'='", "'&'", "'('", 
  "')'", "';'", "':'", "'{'", "'}'", "'['", "']'", "", "','", "'ref'", "'floor'", 
  "'ceil'", "'not'", "'or'", "'and'", "'str'", "'num'", "'bool'", "'while'", 
  "'continue'", "'break'", "'if'", "'else'", "'display'", "'exit'", "'true'", 
  "'false'", "'return'", "'fun'", "'array'", "'map'", "'lf'", "'crlf'", 
  "'type'", "", "", "'''", "'\"'"
};

std::vector<std::string> laplParser::_symbolicNames = {
  "", "MULTICOMMENT", "MULTICOMMENTB", "MULTICOMMENTALL", "MULTICOMMENTALLB", 
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

dfa::Vocabulary laplParser::_vocabulary(_literalNames, _symbolicNames);

std::vector<std::string> laplParser::_tokenNames;

laplParser::Initializer::Initializer() {
	for (size_t i = 0; i < _symbolicNames.size(); ++i) {
		std::string name = _vocabulary.getLiteralName(i);
		if (name.empty()) {
			name = _vocabulary.getSymbolicName(i);
		}

		if (name.empty()) {
			_tokenNames.push_back("<INVALID>");
		} else {
      _tokenNames.push_back(name);
    }
	}

  _serializedATN = {
    0x3, 0x608b, 0xa72a, 0x8133, 0xb9ed, 0x417c, 0x3be7, 0x7786, 0x5964, 
    0x3, 0x42, 0x14f, 0x4, 0x2, 0x9, 0x2, 0x4, 0x3, 0x9, 0x3, 0x4, 0x4, 
    0x9, 0x4, 0x4, 0x5, 0x9, 0x5, 0x4, 0x6, 0x9, 0x6, 0x4, 0x7, 0x9, 0x7, 
    0x4, 0x8, 0x9, 0x8, 0x4, 0x9, 0x9, 0x9, 0x4, 0xa, 0x9, 0xa, 0x4, 0xb, 
    0x9, 0xb, 0x4, 0xc, 0x9, 0xc, 0x4, 0xd, 0x9, 0xd, 0x4, 0xe, 0x9, 0xe, 
    0x4, 0xf, 0x9, 0xf, 0x4, 0x10, 0x9, 0x10, 0x4, 0x11, 0x9, 0x11, 0x4, 
    0x12, 0x9, 0x12, 0x4, 0x13, 0x9, 0x13, 0x4, 0x14, 0x9, 0x14, 0x4, 0x15, 
    0x9, 0x15, 0x4, 0x16, 0x9, 0x16, 0x4, 0x17, 0x9, 0x17, 0x4, 0x18, 0x9, 
    0x18, 0x4, 0x19, 0x9, 0x19, 0x4, 0x1a, 0x9, 0x1a, 0x3, 0x2, 0x7, 0x2, 
    0x36, 0xa, 0x2, 0xc, 0x2, 0xe, 0x2, 0x39, 0xb, 0x2, 0x3, 0x2, 0x3, 0x2, 
    0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x5, 0x3, 0x40, 0xa, 0x3, 0x3, 0x4, 0x3, 
    0x4, 0x3, 0x5, 0x3, 0x5, 0x7, 0x5, 0x46, 0xa, 0x5, 0xc, 0x5, 0xe, 0x5, 
    0x49, 0xb, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x5, 0x5, 0x4f, 
    0xa, 0x5, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 
    0x3, 0x6, 0x5, 0x6, 0x58, 0xa, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x7, 0x3, 
    0x7, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 0x5, 0x7, 0x61, 0xa, 0x7, 0x3, 0x8, 
    0x7, 0x8, 0x64, 0xa, 0x8, 0xc, 0x8, 0xe, 0x8, 0x67, 0xb, 0x8, 0x3, 0x8, 
    0x7, 0x8, 0x6a, 0xa, 0x8, 0xc, 0x8, 0xe, 0x8, 0x6d, 0xb, 0x8, 0x3, 0x8, 
    0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 0x5, 0x8, 0x74, 0xa, 0x8, 0x3, 
    0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 
    0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x5, 0x9, 0x82, 0xa, 0x9, 
    0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 
    0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 
    0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x7, 0x9, 0x96, 0xa, 0x9, 0xc, 
    0x9, 0xe, 0x9, 0x99, 0xb, 0x9, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
    0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x5, 0xa, 0xa3, 0xa, 0xa, 0x3, 
    0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 
    0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 
    0xa, 0x7, 0xa, 0xb4, 0xa, 0xa, 0xc, 0xa, 0xe, 0xa, 0xb7, 0xb, 0xa, 0x3, 
    0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x5, 0xb, 0xbd, 0xa, 0xb, 0x3, 0xc, 
    0x3, 0xc, 0x3, 0xc, 0x5, 0xc, 0xc2, 0xa, 0xc, 0x3, 0xd, 0x3, 0xd, 0x3, 
    0xd, 0x3, 0xd, 0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 0x7, 
    0xe, 0xcd, 0xa, 0xe, 0xc, 0xe, 0xe, 0xe, 0xd0, 0xb, 0xe, 0x3, 0xe, 0x3, 
    0xe, 0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 0x3, 0x10, 0x3, 0x10, 0x3, 
    0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 
    0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 
    0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 
    0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 
    0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 
    0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 
    0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 
    0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 
    0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x5, 0x11, 
    0x114, 0xa, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 
    0x3, 0x11, 0x7, 0x11, 0x11c, 0xa, 0x11, 0xc, 0x11, 0xe, 0x11, 0x11f, 
    0xb, 0x11, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 0x5, 0x12, 0x125, 
    0xa, 0x12, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x3, 0x14, 0x3, 0x14, 0x3, 
    0x15, 0x3, 0x15, 0x3, 0x16, 0x3, 0x16, 0x3, 0x16, 0x5, 0x16, 0x131, 
    0xa, 0x16, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 
    0x17, 0x7, 0x17, 0x139, 0xa, 0x17, 0xc, 0x17, 0xe, 0x17, 0x13c, 0xb, 
    0x17, 0x5, 0x17, 0x13e, 0xa, 0x17, 0x3, 0x17, 0x3, 0x17, 0x3, 0x17, 
    0x3, 0x18, 0x3, 0x18, 0x5, 0x18, 0x145, 0xa, 0x18, 0x3, 0x19, 0x3, 0x19, 
    0x3, 0x19, 0x3, 0x1a, 0x6, 0x1a, 0x14b, 0xa, 0x1a, 0xd, 0x1a, 0xe, 0x1a, 
    0x14c, 0x3, 0x1a, 0x2, 0x5, 0x10, 0x12, 0x20, 0x1b, 0x2, 0x4, 0x6, 0x8, 
    0xa, 0xc, 0xe, 0x10, 0x12, 0x14, 0x16, 0x18, 0x1a, 0x1c, 0x1e, 0x20, 
    0x22, 0x24, 0x26, 0x28, 0x2a, 0x2c, 0x2e, 0x30, 0x32, 0x2, 0x3, 0x3, 
    0x2, 0x32, 0x33, 0x2, 0x177, 0x2, 0x37, 0x3, 0x2, 0x2, 0x2, 0x4, 0x3f, 
    0x3, 0x2, 0x2, 0x2, 0x6, 0x41, 0x3, 0x2, 0x2, 0x2, 0x8, 0x4e, 0x3, 0x2, 
    0x2, 0x2, 0xa, 0x57, 0x3, 0x2, 0x2, 0x2, 0xc, 0x60, 0x3, 0x2, 0x2, 0x2, 
    0xe, 0x73, 0x3, 0x2, 0x2, 0x2, 0x10, 0x81, 0x3, 0x2, 0x2, 0x2, 0x12, 
    0xa2, 0x3, 0x2, 0x2, 0x2, 0x14, 0xbc, 0x3, 0x2, 0x2, 0x2, 0x16, 0xc1, 
    0x3, 0x2, 0x2, 0x2, 0x18, 0xc3, 0x3, 0x2, 0x2, 0x2, 0x1a, 0xc7, 0x3, 
    0x2, 0x2, 0x2, 0x1c, 0xd3, 0x3, 0x2, 0x2, 0x2, 0x1e, 0xd7, 0x3, 0x2, 
    0x2, 0x2, 0x20, 0x113, 0x3, 0x2, 0x2, 0x2, 0x22, 0x120, 0x3, 0x2, 0x2, 
    0x2, 0x24, 0x126, 0x3, 0x2, 0x2, 0x2, 0x26, 0x129, 0x3, 0x2, 0x2, 0x2, 
    0x28, 0x12b, 0x3, 0x2, 0x2, 0x2, 0x2a, 0x130, 0x3, 0x2, 0x2, 0x2, 0x2c, 
    0x132, 0x3, 0x2, 0x2, 0x2, 0x2e, 0x142, 0x3, 0x2, 0x2, 0x2, 0x30, 0x146, 
    0x3, 0x2, 0x2, 0x2, 0x32, 0x14a, 0x3, 0x2, 0x2, 0x2, 0x34, 0x36, 0x5, 
    0x4, 0x3, 0x2, 0x35, 0x34, 0x3, 0x2, 0x2, 0x2, 0x36, 0x39, 0x3, 0x2, 
    0x2, 0x2, 0x37, 0x35, 0x3, 0x2, 0x2, 0x2, 0x37, 0x38, 0x3, 0x2, 0x2, 
    0x2, 0x38, 0x3a, 0x3, 0x2, 0x2, 0x2, 0x39, 0x37, 0x3, 0x2, 0x2, 0x2, 
    0x3a, 0x3b, 0x7, 0x2, 0x2, 0x3, 0x3b, 0x3, 0x3, 0x2, 0x2, 0x2, 0x3c, 
    0x40, 0x5, 0x8, 0x5, 0x2, 0x3d, 0x40, 0x5, 0xa, 0x6, 0x2, 0x3e, 0x40, 
    0x5, 0x6, 0x4, 0x2, 0x3f, 0x3c, 0x3, 0x2, 0x2, 0x2, 0x3f, 0x3d, 0x3, 
    0x2, 0x2, 0x2, 0x3f, 0x3e, 0x3, 0x2, 0x2, 0x2, 0x40, 0x5, 0x3, 0x2, 
    0x2, 0x2, 0x41, 0x42, 0x7, 0x1a, 0x2, 0x2, 0x42, 0x7, 0x3, 0x2, 0x2, 
    0x2, 0x43, 0x47, 0x7, 0x1c, 0x2, 0x2, 0x44, 0x46, 0x5, 0x4, 0x3, 0x2, 
    0x45, 0x44, 0x3, 0x2, 0x2, 0x2, 0x46, 0x49, 0x3, 0x2, 0x2, 0x2, 0x47, 
    0x45, 0x3, 0x2, 0x2, 0x2, 0x47, 0x48, 0x3, 0x2, 0x2, 0x2, 0x48, 0x4a, 
    0x3, 0x2, 0x2, 0x2, 0x49, 0x47, 0x3, 0x2, 0x2, 0x2, 0x4a, 0x4f, 0x7, 
    0x1d, 0x2, 0x2, 0x4b, 0x4f, 0x5, 0x1c, 0xf, 0x2, 0x4c, 0x4f, 0x5, 0x22, 
    0x12, 0x2, 0x4d, 0x4f, 0x5, 0x2c, 0x17, 0x2, 0x4e, 0x43, 0x3, 0x2, 0x2, 
    0x2, 0x4e, 0x4b, 0x3, 0x2, 0x2, 0x2, 0x4e, 0x4c, 0x3, 0x2, 0x2, 0x2, 
    0x4e, 0x4d, 0x3, 0x2, 0x2, 0x2, 0x4f, 0x9, 0x3, 0x2, 0x2, 0x2, 0x50, 
    0x58, 0x5, 0x18, 0xd, 0x2, 0x51, 0x58, 0x5, 0x1a, 0xe, 0x2, 0x52, 0x58, 
    0x5, 0x26, 0x14, 0x2, 0x53, 0x58, 0x5, 0x28, 0x15, 0x2, 0x54, 0x58, 
    0x5, 0x2a, 0x16, 0x2, 0x55, 0x58, 0x5, 0x2e, 0x18, 0x2, 0x56, 0x58, 
    0x5, 0x30, 0x19, 0x2, 0x57, 0x50, 0x3, 0x2, 0x2, 0x2, 0x57, 0x51, 0x3, 
    0x2, 0x2, 0x2, 0x57, 0x52, 0x3, 0x2, 0x2, 0x2, 0x57, 0x53, 0x3, 0x2, 
    0x2, 0x2, 0x57, 0x54, 0x3, 0x2, 0x2, 0x2, 0x57, 0x55, 0x3, 0x2, 0x2, 
    0x2, 0x57, 0x56, 0x3, 0x2, 0x2, 0x2, 0x58, 0x59, 0x3, 0x2, 0x2, 0x2, 
    0x59, 0x5a, 0x7, 0x1a, 0x2, 0x2, 0x5a, 0xb, 0x3, 0x2, 0x2, 0x2, 0x5b, 
    0x61, 0x7, 0x42, 0x2, 0x2, 0x5c, 0x5d, 0x7, 0x28, 0x2, 0x2, 0x5d, 0x61, 
    0x5, 0x10, 0x9, 0x2, 0x5e, 0x61, 0x7, 0x38, 0x2, 0x2, 0x5f, 0x61, 0x7, 
    0x39, 0x2, 0x2, 0x60, 0x5b, 0x3, 0x2, 0x2, 0x2, 0x60, 0x5c, 0x3, 0x2, 
    0x2, 0x2, 0x60, 0x5e, 0x3, 0x2, 0x2, 0x2, 0x60, 0x5f, 0x3, 0x2, 0x2, 
    0x2, 0x61, 0xd, 0x3, 0x2, 0x2, 0x2, 0x62, 0x64, 0x7, 0x10, 0x2, 0x2, 
    0x63, 0x62, 0x3, 0x2, 0x2, 0x2, 0x64, 0x67, 0x3, 0x2, 0x2, 0x2, 0x65, 
    0x63, 0x3, 0x2, 0x2, 0x2, 0x65, 0x66, 0x3, 0x2, 0x2, 0x2, 0x66, 0x6b, 
    0x3, 0x2, 0x2, 0x2, 0x67, 0x65, 0x3, 0x2, 0x2, 0x2, 0x68, 0x6a, 0x7, 
    0x11, 0x2, 0x2, 0x69, 0x68, 0x3, 0x2, 0x2, 0x2, 0x6a, 0x6d, 0x3, 0x2, 
    0x2, 0x2, 0x6b, 0x69, 0x3, 0x2, 0x2, 0x2, 0x6b, 0x6c, 0x3, 0x2, 0x2, 
    0x2, 0x6c, 0x6e, 0x3, 0x2, 0x2, 0x2, 0x6d, 0x6b, 0x3, 0x2, 0x2, 0x2, 
    0x6e, 0x74, 0x7, 0x3c, 0x2, 0x2, 0x6f, 0x70, 0x7, 0x29, 0x2, 0x2, 0x70, 
    0x74, 0x5, 0x12, 0xa, 0x2, 0x71, 0x72, 0x7, 0x3a, 0x2, 0x2, 0x72, 0x74, 
    0x5, 0x14, 0xb, 0x2, 0x73, 0x65, 0x3, 0x2, 0x2, 0x2, 0x73, 0x6f, 0x3, 
    0x2, 0x2, 0x2, 0x73, 0x71, 0x3, 0x2, 0x2, 0x2, 0x74, 0xf, 0x3, 0x2, 
    0x2, 0x2, 0x75, 0x76, 0x8, 0x9, 0x1, 0x2, 0x76, 0x82, 0x5, 0xe, 0x8, 
    0x2, 0x77, 0x82, 0x5, 0x1a, 0xe, 0x2, 0x78, 0x82, 0x7, 0x20, 0x2, 0x2, 
    0x79, 0x7a, 0x7, 0x24, 0x2, 0x2, 0x7a, 0x82, 0x5, 0x10, 0x9, 0xb, 0x7b, 
    0x7c, 0x7, 0x23, 0x2, 0x2, 0x7c, 0x82, 0x5, 0x10, 0x9, 0xa, 0x7d, 0x7e, 
    0x7, 0x18, 0x2, 0x2, 0x7e, 0x7f, 0x5, 0x10, 0x9, 0x2, 0x7f, 0x80, 0x7, 
    0x19, 0x2, 0x2, 0x80, 0x82, 0x3, 0x2, 0x2, 0x2, 0x81, 0x75, 0x3, 0x2, 
    0x2, 0x2, 0x81, 0x77, 0x3, 0x2, 0x2, 0x2, 0x81, 0x78, 0x3, 0x2, 0x2, 
    0x2, 0x81, 0x79, 0x3, 0x2, 0x2, 0x2, 0x81, 0x7b, 0x3, 0x2, 0x2, 0x2, 
    0x81, 0x7d, 0x3, 0x2, 0x2, 0x2, 0x82, 0x97, 0x3, 0x2, 0x2, 0x2, 0x83, 
    0x84, 0xc, 0x9, 0x2, 0x2, 0x84, 0x85, 0x7, 0x12, 0x2, 0x2, 0x85, 0x96, 
    0x5, 0x10, 0x9, 0xa, 0x86, 0x87, 0xc, 0x8, 0x2, 0x2, 0x87, 0x88, 0x7, 
    0x15, 0x2, 0x2, 0x88, 0x96, 0x5, 0x10, 0x9, 0x9, 0x89, 0x8a, 0xc, 0x7, 
    0x2, 0x2, 0x8a, 0x8b, 0x7, 0x14, 0x2, 0x2, 0x8b, 0x96, 0x5, 0x10, 0x9, 
    0x8, 0x8c, 0x8d, 0xc, 0x6, 0x2, 0x2, 0x8d, 0x8e, 0x7, 0x13, 0x2, 0x2, 
    0x8e, 0x96, 0x5, 0x10, 0x9, 0x7, 0x8f, 0x90, 0xc, 0x5, 0x2, 0x2, 0x90, 
    0x91, 0x7, 0x11, 0x2, 0x2, 0x91, 0x96, 0x5, 0x10, 0x9, 0x6, 0x92, 0x93, 
    0xc, 0x4, 0x2, 0x2, 0x93, 0x94, 0x7, 0x10, 0x2, 0x2, 0x94, 0x96, 0x5, 
    0x10, 0x9, 0x5, 0x95, 0x83, 0x3, 0x2, 0x2, 0x2, 0x95, 0x86, 0x3, 0x2, 
    0x2, 0x2, 0x95, 0x89, 0x3, 0x2, 0x2, 0x2, 0x95, 0x8c, 0x3, 0x2, 0x2, 
    0x2, 0x95, 0x8f, 0x3, 0x2, 0x2, 0x2, 0x95, 0x92, 0x3, 0x2, 0x2, 0x2, 
    0x96, 0x99, 0x3, 0x2, 0x2, 0x2, 0x97, 0x95, 0x3, 0x2, 0x2, 0x2, 0x97, 
    0x98, 0x3, 0x2, 0x2, 0x2, 0x98, 0x11, 0x3, 0x2, 0x2, 0x2, 0x99, 0x97, 
    0x3, 0x2, 0x2, 0x2, 0x9a, 0x9b, 0x8, 0xa, 0x1, 0x2, 0x9b, 0xa3, 0x5, 
    0xc, 0x7, 0x2, 0x9c, 0xa3, 0x5, 0x1a, 0xe, 0x2, 0x9d, 0xa3, 0x7, 0x20, 
    0x2, 0x2, 0x9e, 0x9f, 0x7, 0x18, 0x2, 0x2, 0x9f, 0xa0, 0x5, 0x12, 0xa, 
    0x2, 0xa0, 0xa1, 0x7, 0x19, 0x2, 0x2, 0xa1, 0xa3, 0x3, 0x2, 0x2, 0x2, 
    0xa2, 0x9a, 0x3, 0x2, 0x2, 0x2, 0xa2, 0x9c, 0x3, 0x2, 0x2, 0x2, 0xa2, 
    0x9d, 0x3, 0x2, 0x2, 0x2, 0xa2, 0x9e, 0x3, 0x2, 0x2, 0x2, 0xa3, 0xb5, 
    0x3, 0x2, 0x2, 0x2, 0xa4, 0xa5, 0xc, 0x4, 0x2, 0x2, 0xa5, 0xa6, 0x7, 
    0x17, 0x2, 0x2, 0xa6, 0xb4, 0x5, 0x12, 0xa, 0x5, 0xa7, 0xa8, 0xc, 0x6, 
    0x2, 0x2, 0xa8, 0xa9, 0x7, 0x1e, 0x2, 0x2, 0xa9, 0xaa, 0x5, 0x10, 0x9, 
    0x2, 0xaa, 0xab, 0x7, 0x1f, 0x2, 0x2, 0xab, 0xb4, 0x3, 0x2, 0x2, 0x2, 
    0xac, 0xad, 0xc, 0x5, 0x2, 0x2, 0xad, 0xae, 0x7, 0x1e, 0x2, 0x2, 0xae, 
    0xaf, 0x5, 0x10, 0x9, 0x2, 0xaf, 0xb0, 0x7, 0x21, 0x2, 0x2, 0xb0, 0xb1, 
    0x5, 0x10, 0x9, 0x2, 0xb1, 0xb2, 0x7, 0x1f, 0x2, 0x2, 0xb2, 0xb4, 0x3, 
    0x2, 0x2, 0x2, 0xb3, 0xa4, 0x3, 0x2, 0x2, 0x2, 0xb3, 0xa7, 0x3, 0x2, 
    0x2, 0x2, 0xb3, 0xac, 0x3, 0x2, 0x2, 0x2, 0xb4, 0xb7, 0x3, 0x2, 0x2, 
    0x2, 0xb5, 0xb3, 0x3, 0x2, 0x2, 0x2, 0xb5, 0xb6, 0x3, 0x2, 0x2, 0x2, 
    0xb6, 0x13, 0x3, 0x2, 0x2, 0x2, 0xb7, 0xb5, 0x3, 0x2, 0x2, 0x2, 0xb8, 
    0xbd, 0x7, 0x20, 0x2, 0x2, 0xb9, 0xbd, 0x5, 0x12, 0xa, 0x2, 0xba, 0xbd, 
    0x5, 0x10, 0x9, 0x2, 0xbb, 0xbd, 0x5, 0x20, 0x11, 0x2, 0xbc, 0xb8, 0x3, 
    0x2, 0x2, 0x2, 0xbc, 0xb9, 0x3, 0x2, 0x2, 0x2, 0xbc, 0xba, 0x3, 0x2, 
    0x2, 0x2, 0xbc, 0xbb, 0x3, 0x2, 0x2, 0x2, 0xbd, 0x15, 0x3, 0x2, 0x2, 
    0x2, 0xbe, 0xbf, 0x7, 0x22, 0x2, 0x2, 0xbf, 0xc2, 0x7, 0x20, 0x2, 0x2, 
    0xc0, 0xc2, 0x5, 0x14, 0xb, 0x2, 0xc1, 0xbe, 0x3, 0x2, 0x2, 0x2, 0xc1, 
    0xc0, 0x3, 0x2, 0x2, 0x2, 0xc2, 0x17, 0x3, 0x2, 0x2, 0x2, 0xc3, 0xc4, 
    0x7, 0x20, 0x2, 0x2, 0xc4, 0xc5, 0x7, 0x16, 0x2, 0x2, 0xc5, 0xc6, 0x5, 
    0x14, 0xb, 0x2, 0xc6, 0x19, 0x3, 0x2, 0x2, 0x2, 0xc7, 0xc8, 0x7, 0x3b, 
    0x2, 0x2, 0xc8, 0xc9, 0x7, 0x18, 0x2, 0x2, 0xc9, 0xce, 0x5, 0x16, 0xc, 
    0x2, 0xca, 0xcb, 0x7, 0x21, 0x2, 0x2, 0xcb, 0xcd, 0x5, 0x16, 0xc, 0x2, 
    0xcc, 0xca, 0x3, 0x2, 0x2, 0x2, 0xcd, 0xd0, 0x3, 0x2, 0x2, 0x2, 0xce, 
    0xcc, 0x3, 0x2, 0x2, 0x2, 0xce, 0xcf, 0x3, 0x2, 0x2, 0x2, 0xcf, 0xd1, 
    0x3, 0x2, 0x2, 0x2, 0xd0, 0xce, 0x3, 0x2, 0x2, 0x2, 0xd1, 0xd2, 0x7, 
    0x19, 0x2, 0x2, 0xd2, 0x1b, 0x3, 0x2, 0x2, 0x2, 0xd3, 0xd4, 0x7, 0x2b, 
    0x2, 0x2, 0xd4, 0xd5, 0x5, 0x20, 0x11, 0x2, 0xd5, 0xd6, 0x5, 0x4, 0x3, 
    0x2, 0xd6, 0x1d, 0x3, 0x2, 0x2, 0x2, 0xd7, 0xd8, 0x9, 0x2, 0x2, 0x2, 
    0xd8, 0x1f, 0x3, 0x2, 0x2, 0x2, 0xd9, 0xda, 0x8, 0x11, 0x1, 0x2, 0xda, 
    0x114, 0x5, 0x1e, 0x10, 0x2, 0xdb, 0x114, 0x5, 0x1a, 0xe, 0x2, 0xdc, 
    0x114, 0x7, 0x20, 0x2, 0x2, 0xdd, 0xde, 0x7, 0x25, 0x2, 0x2, 0xde, 0x114, 
    0x5, 0x20, 0x11, 0x12, 0xdf, 0xe0, 0x5, 0x12, 0xa, 0x2, 0xe0, 0xe1, 
    0x7, 0xa, 0x2, 0x2, 0xe1, 0xe2, 0x5, 0x12, 0xa, 0x2, 0xe2, 0x114, 0x3, 
    0x2, 0x2, 0x2, 0xe3, 0xe4, 0x5, 0x12, 0xa, 0x2, 0xe4, 0xe5, 0x7, 0xb, 
    0x2, 0x2, 0xe5, 0xe6, 0x5, 0x12, 0xa, 0x2, 0xe6, 0x114, 0x3, 0x2, 0x2, 
    0x2, 0xe7, 0xe8, 0x5, 0x12, 0xa, 0x2, 0xe8, 0xe9, 0x7, 0xc, 0x2, 0x2, 
    0xe9, 0xea, 0x5, 0x12, 0xa, 0x2, 0xea, 0x114, 0x3, 0x2, 0x2, 0x2, 0xeb, 
    0xec, 0x5, 0x12, 0xa, 0x2, 0xec, 0xed, 0x7, 0xd, 0x2, 0x2, 0xed, 0xee, 
    0x5, 0x12, 0xa, 0x2, 0xee, 0x114, 0x3, 0x2, 0x2, 0x2, 0xef, 0xf0, 0x5, 
    0x12, 0xa, 0x2, 0xf0, 0xf1, 0x7, 0xe, 0x2, 0x2, 0xf1, 0xf2, 0x5, 0x12, 
    0xa, 0x2, 0xf2, 0x114, 0x3, 0x2, 0x2, 0x2, 0xf3, 0xf4, 0x5, 0x12, 0xa, 
    0x2, 0xf4, 0xf5, 0x7, 0xf, 0x2, 0x2, 0xf5, 0xf6, 0x5, 0x12, 0xa, 0x2, 
    0xf6, 0x114, 0x3, 0x2, 0x2, 0x2, 0xf7, 0xf8, 0x5, 0x10, 0x9, 0x2, 0xf8, 
    0xf9, 0x7, 0xa, 0x2, 0x2, 0xf9, 0xfa, 0x5, 0x10, 0x9, 0x2, 0xfa, 0x114, 
    0x3, 0x2, 0x2, 0x2, 0xfb, 0xfc, 0x5, 0x10, 0x9, 0x2, 0xfc, 0xfd, 0x7, 
    0xb, 0x2, 0x2, 0xfd, 0xfe, 0x5, 0x10, 0x9, 0x2, 0xfe, 0x114, 0x3, 0x2, 
    0x2, 0x2, 0xff, 0x100, 0x5, 0x10, 0x9, 0x2, 0x100, 0x101, 0x7, 0xc, 
    0x2, 0x2, 0x101, 0x102, 0x5, 0x10, 0x9, 0x2, 0x102, 0x114, 0x3, 0x2, 
    0x2, 0x2, 0x103, 0x104, 0x5, 0x10, 0x9, 0x2, 0x104, 0x105, 0x7, 0xd, 
    0x2, 0x2, 0x105, 0x106, 0x5, 0x10, 0x9, 0x2, 0x106, 0x114, 0x3, 0x2, 
    0x2, 0x2, 0x107, 0x108, 0x5, 0x10, 0x9, 0x2, 0x108, 0x109, 0x7, 0xe, 
    0x2, 0x2, 0x109, 0x10a, 0x5, 0x10, 0x9, 0x2, 0x10a, 0x114, 0x3, 0x2, 
    0x2, 0x2, 0x10b, 0x10c, 0x5, 0x10, 0x9, 0x2, 0x10c, 0x10d, 0x7, 0xf, 
    0x2, 0x2, 0x10d, 0x10e, 0x5, 0x10, 0x9, 0x2, 0x10e, 0x114, 0x3, 0x2, 
    0x2, 0x2, 0x10f, 0x110, 0x7, 0x18, 0x2, 0x2, 0x110, 0x111, 0x5, 0x20, 
    0x11, 0x2, 0x111, 0x112, 0x7, 0x19, 0x2, 0x2, 0x112, 0x114, 0x3, 0x2, 
    0x2, 0x2, 0x113, 0xd9, 0x3, 0x2, 0x2, 0x2, 0x113, 0xdb, 0x3, 0x2, 0x2, 
    0x2, 0x113, 0xdc, 0x3, 0x2, 0x2, 0x2, 0x113, 0xdd, 0x3, 0x2, 0x2, 0x2, 
    0x113, 0xdf, 0x3, 0x2, 0x2, 0x2, 0x113, 0xe3, 0x3, 0x2, 0x2, 0x2, 0x113, 
    0xe7, 0x3, 0x2, 0x2, 0x2, 0x113, 0xeb, 0x3, 0x2, 0x2, 0x2, 0x113, 0xef, 
    0x3, 0x2, 0x2, 0x2, 0x113, 0xf3, 0x3, 0x2, 0x2, 0x2, 0x113, 0xf7, 0x3, 
    0x2, 0x2, 0x2, 0x113, 0xfb, 0x3, 0x2, 0x2, 0x2, 0x113, 0xff, 0x3, 0x2, 
    0x2, 0x2, 0x113, 0x103, 0x3, 0x2, 0x2, 0x2, 0x113, 0x107, 0x3, 0x2, 
    0x2, 0x2, 0x113, 0x10b, 0x3, 0x2, 0x2, 0x2, 0x113, 0x10f, 0x3, 0x2, 
    0x2, 0x2, 0x114, 0x11d, 0x3, 0x2, 0x2, 0x2, 0x115, 0x116, 0xc, 0x5, 
    0x2, 0x2, 0x116, 0x117, 0x7, 0x26, 0x2, 0x2, 0x117, 0x11c, 0x5, 0x20, 
    0x11, 0x6, 0x118, 0x119, 0xc, 0x4, 0x2, 0x2, 0x119, 0x11a, 0x7, 0x27, 
    0x2, 0x2, 0x11a, 0x11c, 0x5, 0x20, 0x11, 0x5, 0x11b, 0x115, 0x3, 0x2, 
    0x2, 0x2, 0x11b, 0x118, 0x3, 0x2, 0x2, 0x2, 0x11c, 0x11f, 0x3, 0x2, 
    0x2, 0x2, 0x11d, 0x11b, 0x3, 0x2, 0x2, 0x2, 0x11d, 0x11e, 0x3, 0x2, 
    0x2, 0x2, 0x11e, 0x21, 0x3, 0x2, 0x2, 0x2, 0x11f, 0x11d, 0x3, 0x2, 0x2, 
    0x2, 0x120, 0x121, 0x7, 0x2e, 0x2, 0x2, 0x121, 0x122, 0x5, 0x20, 0x11, 
    0x2, 0x122, 0x124, 0x5, 0x4, 0x3, 0x2, 0x123, 0x125, 0x5, 0x24, 0x13, 
    0x2, 0x124, 0x123, 0x3, 0x2, 0x2, 0x2, 0x124, 0x125, 0x3, 0x2, 0x2, 
    0x2, 0x125, 0x23, 0x3, 0x2, 0x2, 0x2, 0x126, 0x127, 0x7, 0x2f, 0x2, 
    0x2, 0x127, 0x128, 0x5, 0x4, 0x3, 0x2, 0x128, 0x25, 0x3, 0x2, 0x2, 0x2, 
    0x129, 0x12a, 0x7, 0x2c, 0x2, 0x2, 0x12a, 0x27, 0x3, 0x2, 0x2, 0x2, 
    0x12b, 0x12c, 0x7, 0x2d, 0x2, 0x2, 0x12c, 0x29, 0x3, 0x2, 0x2, 0x2, 
    0x12d, 0x131, 0x7, 0x31, 0x2, 0x2, 0x12e, 0x12f, 0x7, 0x31, 0x2, 0x2, 
    0x12f, 0x131, 0x5, 0x10, 0x9, 0x2, 0x130, 0x12d, 0x3, 0x2, 0x2, 0x2, 
    0x130, 0x12e, 0x3, 0x2, 0x2, 0x2, 0x131, 0x2b, 0x3, 0x2, 0x2, 0x2, 0x132, 
    0x133, 0x7, 0x35, 0x2, 0x2, 0x133, 0x134, 0x7, 0x3b, 0x2, 0x2, 0x134, 
    0x13d, 0x7, 0x18, 0x2, 0x2, 0x135, 0x13a, 0x7, 0x20, 0x2, 0x2, 0x136, 
    0x137, 0x7, 0x21, 0x2, 0x2, 0x137, 0x139, 0x7, 0x20, 0x2, 0x2, 0x138, 
    0x136, 0x3, 0x2, 0x2, 0x2, 0x139, 0x13c, 0x3, 0x2, 0x2, 0x2, 0x13a, 
    0x138, 0x3, 0x2, 0x2, 0x2, 0x13a, 0x13b, 0x3, 0x2, 0x2, 0x2, 0x13b, 
    0x13e, 0x3, 0x2, 0x2, 0x2, 0x13c, 0x13a, 0x3, 0x2, 0x2, 0x2, 0x13d, 
    0x135, 0x3, 0x2, 0x2, 0x2, 0x13d, 0x13e, 0x3, 0x2, 0x2, 0x2, 0x13e, 
    0x13f, 0x3, 0x2, 0x2, 0x2, 0x13f, 0x140, 0x7, 0x19, 0x2, 0x2, 0x140, 
    0x141, 0x5, 0x4, 0x3, 0x2, 0x141, 0x2d, 0x3, 0x2, 0x2, 0x2, 0x142, 0x144, 
    0x7, 0x34, 0x2, 0x2, 0x143, 0x145, 0x5, 0x14, 0xb, 0x2, 0x144, 0x143, 
    0x3, 0x2, 0x2, 0x2, 0x144, 0x145, 0x3, 0x2, 0x2, 0x2, 0x145, 0x2f, 0x3, 
    0x2, 0x2, 0x2, 0x146, 0x147, 0x7, 0x30, 0x2, 0x2, 0x147, 0x148, 0x5, 
    0x32, 0x1a, 0x2, 0x148, 0x31, 0x3, 0x2, 0x2, 0x2, 0x149, 0x14b, 0x5, 
    0x14, 0xb, 0x2, 0x14a, 0x149, 0x3, 0x2, 0x2, 0x2, 0x14b, 0x14c, 0x3, 
    0x2, 0x2, 0x2, 0x14c, 0x14a, 0x3, 0x2, 0x2, 0x2, 0x14c, 0x14d, 0x3, 
    0x2, 0x2, 0x2, 0x14d, 0x33, 0x3, 0x2, 0x2, 0x2, 0x1d, 0x37, 0x3f, 0x47, 
    0x4e, 0x57, 0x60, 0x65, 0x6b, 0x73, 0x81, 0x95, 0x97, 0xa2, 0xb3, 0xb5, 
    0xbc, 0xc1, 0xce, 0x113, 0x11b, 0x11d, 0x124, 0x130, 0x13a, 0x13d, 0x144, 
    0x14c, 
  };

  atn::ATNDeserializer deserializer;
  _atn = deserializer.deserialize(_serializedATN);

  size_t count = _atn.getNumberOfDecisions();
  _decisionToDFA.reserve(count);
  for (size_t i = 0; i < count; i++) { 
    _decisionToDFA.emplace_back(_atn.getDecisionState(i), i);
  }
}

laplParser::Initializer laplParser::_init;
