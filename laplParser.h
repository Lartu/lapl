
// Generated from lapl.g4 by ANTLR 4.8

#pragma once


#include "antlr4-runtime.h"




class  laplParser : public antlr4::Parser {
public:
  enum {
    MULTICOMMENT = 1, MULTICOMMENTB = 2, COMMENT = 3, COMMENTB = 4, WHITESPACE = 5, 
    EQ_OP = 6, NEQ_OP = 7, LT_OP = 8, GT_OP = 9, LE_OP = 10, GE_OP = 11, 
    PLUS_OP = 12, MINUS_OP = 13, POW_OP = 14, TIMES_OP = 15, DIV_OP = 16, 
    MOD_OP = 17, ASSIGN_OP = 18, CONCAT_OP = 19, LPAR = 20, RPAR = 21, SEMICOLON = 22, 
    COLON = 23, BLOCK_OPEN = 24, BLOCK_CLOSE = 25, INDEX_ACCESS_O = 26, 
    INDEX_ACCESS_C = 27, VARIABLE = 28, COMMA = 29, REF_OP = 30, FLOOR_OP = 31, 
    CEIL_OP = 32, NOT_OP = 33, OR_OP = 34, AND_OP = 35, STR_OP = 36, NUM_OP = 37, 
    BOOLOP = 38, WHILE = 39, CONTINUE = 40, BREAK = 41, IF = 42, ELSE = 43, 
    DISPLAY = 44, EXIT = 45, TRUE = 46, FALSE = 47, RETURN = 48, FUNCTION = 49, 
    ARRAY = 50, MAP = 51, LINEFEED = 52, CRLF = 53, TYPE = 54, VAR = 55, 
    IDENTIFIER = 56, NUMBER = 57, QUOTE = 58, DQUOTE = 59, CHAR = 60, DCHAR = 61, 
    ESCAPEDCHAR = 62, STRING = 63
  };

  enum {
    RuleLapl_source = 0, RuleStatement = 1, RuleEmpty_line = 2, RuleBlock = 3, 
    RuleLine_statement = 4, RuleString = 5, RuleNumber = 6, RuleNumber_expression = 7, 
    RuleString_expression = 8, RuleValue = 9, RuleArgument = 10, RuleAssignment = 11, 
    RuleFunction_call = 12, RuleWhile_block = 13, RuleBoolean_value = 14, 
    RuleBoolean_expr = 15, RuleIf_block = 16, RuleElse_block = 17, RuleContinue_statement = 18, 
    RuleBreak_statement = 19, RuleExit_statement = 20, RuleFunction_declaration = 21, 
    RuleDisplay_statement = 22, RuleDisplay_values = 23
  };

  laplParser(antlr4::TokenStream *input);
  ~laplParser();

  virtual std::string getGrammarFileName() const override;
  virtual const antlr4::atn::ATN& getATN() const override { return _atn; };
  virtual const std::vector<std::string>& getTokenNames() const override { return _tokenNames; }; // deprecated: use vocabulary instead.
  virtual const std::vector<std::string>& getRuleNames() const override;
  virtual antlr4::dfa::Vocabulary& getVocabulary() const override;


  class Lapl_sourceContext;
  class StatementContext;
  class Empty_lineContext;
  class BlockContext;
  class Line_statementContext;
  class StringContext;
  class NumberContext;
  class Number_expressionContext;
  class String_expressionContext;
  class ValueContext;
  class ArgumentContext;
  class AssignmentContext;
  class Function_callContext;
  class While_blockContext;
  class Boolean_valueContext;
  class Boolean_exprContext;
  class If_blockContext;
  class Else_blockContext;
  class Continue_statementContext;
  class Break_statementContext;
  class Exit_statementContext;
  class Function_declarationContext;
  class Display_statementContext;
  class Display_valuesContext; 

  class  Lapl_sourceContext : public antlr4::ParserRuleContext {
  public:
    Lapl_sourceContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *EOF();
    std::vector<StatementContext *> statement();
    StatementContext* statement(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  Lapl_sourceContext* lapl_source();

  class  StatementContext : public antlr4::ParserRuleContext {
  public:
    StatementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    BlockContext *block();
    Line_statementContext *line_statement();
    Empty_lineContext *empty_line();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  StatementContext* statement();

  class  Empty_lineContext : public antlr4::ParserRuleContext {
  public:
    Empty_lineContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *SEMICOLON();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  Empty_lineContext* empty_line();

  class  BlockContext : public antlr4::ParserRuleContext {
  public:
    BlockContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *BLOCK_OPEN();
    antlr4::tree::TerminalNode *BLOCK_CLOSE();
    std::vector<StatementContext *> statement();
    StatementContext* statement(size_t i);
    While_blockContext *while_block();
    If_blockContext *if_block();
    Function_declarationContext *function_declaration();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BlockContext* block();

  class  Line_statementContext : public antlr4::ParserRuleContext {
  public:
    Line_statementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *SEMICOLON();
    AssignmentContext *assignment();
    Function_callContext *function_call();
    Continue_statementContext *continue_statement();
    Break_statementContext *break_statement();
    Exit_statementContext *exit_statement();
    Display_statementContext *display_statement();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  Line_statementContext* line_statement();

  class  StringContext : public antlr4::ParserRuleContext {
  public:
    StringContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *STRING();
    antlr4::tree::TerminalNode *STR_OP();
    Number_expressionContext *number_expression();
    antlr4::tree::TerminalNode *LINEFEED();
    antlr4::tree::TerminalNode *CRLF();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  StringContext* string();

  class  NumberContext : public antlr4::ParserRuleContext {
  public:
    NumberContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *NUMBER();
    std::vector<antlr4::tree::TerminalNode *> PLUS_OP();
    antlr4::tree::TerminalNode* PLUS_OP(size_t i);
    std::vector<antlr4::tree::TerminalNode *> MINUS_OP();
    antlr4::tree::TerminalNode* MINUS_OP(size_t i);
    antlr4::tree::TerminalNode *NUM_OP();
    String_expressionContext *string_expression();
    antlr4::tree::TerminalNode *TYPE();
    ValueContext *value();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  NumberContext* number();

  class  Number_expressionContext : public antlr4::ParserRuleContext {
  public:
    Number_expressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    NumberContext *number();
    Function_callContext *function_call();
    antlr4::tree::TerminalNode *VARIABLE();
    antlr4::tree::TerminalNode *CEIL_OP();
    std::vector<Number_expressionContext *> number_expression();
    Number_expressionContext* number_expression(size_t i);
    antlr4::tree::TerminalNode *FLOOR_OP();
    antlr4::tree::TerminalNode *LPAR();
    antlr4::tree::TerminalNode *RPAR();
    antlr4::tree::TerminalNode *POW_OP();
    antlr4::tree::TerminalNode *MOD_OP();
    antlr4::tree::TerminalNode *DIV_OP();
    antlr4::tree::TerminalNode *TIMES_OP();
    antlr4::tree::TerminalNode *MINUS_OP();
    antlr4::tree::TerminalNode *PLUS_OP();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  Number_expressionContext* number_expression();
  Number_expressionContext* number_expression(int precedence);
  class  String_expressionContext : public antlr4::ParserRuleContext {
  public:
    String_expressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    StringContext *string();
    Function_callContext *function_call();
    antlr4::tree::TerminalNode *VARIABLE();
    antlr4::tree::TerminalNode *LPAR();
    std::vector<String_expressionContext *> string_expression();
    String_expressionContext* string_expression(size_t i);
    antlr4::tree::TerminalNode *RPAR();
    antlr4::tree::TerminalNode *CONCAT_OP();
    antlr4::tree::TerminalNode *INDEX_ACCESS_O();
    std::vector<Number_expressionContext *> number_expression();
    Number_expressionContext* number_expression(size_t i);
    antlr4::tree::TerminalNode *INDEX_ACCESS_C();
    antlr4::tree::TerminalNode *COMMA();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  String_expressionContext* string_expression();
  String_expressionContext* string_expression(int precedence);
  class  ValueContext : public antlr4::ParserRuleContext {
  public:
    ValueContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *VARIABLE();
    Function_callContext *function_call();
    String_expressionContext *string_expression();
    Number_expressionContext *number_expression();
    Boolean_exprContext *boolean_expr();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ValueContext* value();

  class  ArgumentContext : public antlr4::ParserRuleContext {
  public:
    ArgumentContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ValueContext *value();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ArgumentContext* argument();

  class  AssignmentContext : public antlr4::ParserRuleContext {
  public:
    AssignmentContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *VARIABLE();
    antlr4::tree::TerminalNode *ASSIGN_OP();
    ValueContext *value();
    antlr4::tree::TerminalNode *VAR();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  AssignmentContext* assignment();

  class  Function_callContext : public antlr4::ParserRuleContext {
  public:
    Function_callContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *IDENTIFIER();
    antlr4::tree::TerminalNode *LPAR();
    std::vector<ArgumentContext *> argument();
    ArgumentContext* argument(size_t i);
    antlr4::tree::TerminalNode *RPAR();
    std::vector<antlr4::tree::TerminalNode *> COMMA();
    antlr4::tree::TerminalNode* COMMA(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  Function_callContext* function_call();

  class  While_blockContext : public antlr4::ParserRuleContext {
  public:
    While_blockContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *WHILE();
    Boolean_exprContext *boolean_expr();
    StatementContext *statement();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  While_blockContext* while_block();

  class  Boolean_valueContext : public antlr4::ParserRuleContext {
  public:
    Boolean_valueContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *TRUE();
    antlr4::tree::TerminalNode *FALSE();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  Boolean_valueContext* boolean_value();

  class  Boolean_exprContext : public antlr4::ParserRuleContext {
  public:
    Boolean_exprContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    Boolean_valueContext *boolean_value();
    Function_callContext *function_call();
    antlr4::tree::TerminalNode *VARIABLE();
    antlr4::tree::TerminalNode *NOT_OP();
    std::vector<Boolean_exprContext *> boolean_expr();
    Boolean_exprContext* boolean_expr(size_t i);
    std::vector<String_expressionContext *> string_expression();
    String_expressionContext* string_expression(size_t i);
    antlr4::tree::TerminalNode *EQ_OP();
    antlr4::tree::TerminalNode *NEQ_OP();
    antlr4::tree::TerminalNode *LT_OP();
    antlr4::tree::TerminalNode *GT_OP();
    antlr4::tree::TerminalNode *LE_OP();
    antlr4::tree::TerminalNode *GE_OP();
    std::vector<Number_expressionContext *> number_expression();
    Number_expressionContext* number_expression(size_t i);
    antlr4::tree::TerminalNode *LPAR();
    antlr4::tree::TerminalNode *RPAR();
    antlr4::tree::TerminalNode *OR_OP();
    antlr4::tree::TerminalNode *AND_OP();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  Boolean_exprContext* boolean_expr();
  Boolean_exprContext* boolean_expr(int precedence);
  class  If_blockContext : public antlr4::ParserRuleContext {
  public:
    If_blockContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *IF();
    Boolean_exprContext *boolean_expr();
    StatementContext *statement();
    Else_blockContext *else_block();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  If_blockContext* if_block();

  class  Else_blockContext : public antlr4::ParserRuleContext {
  public:
    Else_blockContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *ELSE();
    StatementContext *statement();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  Else_blockContext* else_block();

  class  Continue_statementContext : public antlr4::ParserRuleContext {
  public:
    Continue_statementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *CONTINUE();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  Continue_statementContext* continue_statement();

  class  Break_statementContext : public antlr4::ParserRuleContext {
  public:
    Break_statementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *BREAK();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  Break_statementContext* break_statement();

  class  Exit_statementContext : public antlr4::ParserRuleContext {
  public:
    Exit_statementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *EXIT();
    Number_expressionContext *number_expression();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  Exit_statementContext* exit_statement();

  class  Function_declarationContext : public antlr4::ParserRuleContext {
  public:
    Function_declarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *FUNCTION();
    antlr4::tree::TerminalNode *IDENTIFIER();
    antlr4::tree::TerminalNode *LPAR();
    antlr4::tree::TerminalNode *RPAR();
    StatementContext *statement();
    std::vector<antlr4::tree::TerminalNode *> VARIABLE();
    antlr4::tree::TerminalNode* VARIABLE(size_t i);
    std::vector<antlr4::tree::TerminalNode *> COMMA();
    antlr4::tree::TerminalNode* COMMA(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  Function_declarationContext* function_declaration();

  class  Display_statementContext : public antlr4::ParserRuleContext {
  public:
    Display_statementContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *DISPLAY();
    Display_valuesContext *display_values();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  Display_statementContext* display_statement();

  class  Display_valuesContext : public antlr4::ParserRuleContext {
  public:
    Display_valuesContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<ValueContext *> value();
    ValueContext* value(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  Display_valuesContext* display_values();


  virtual bool sempred(antlr4::RuleContext *_localctx, size_t ruleIndex, size_t predicateIndex) override;
  bool number_expressionSempred(Number_expressionContext *_localctx, size_t predicateIndex);
  bool string_expressionSempred(String_expressionContext *_localctx, size_t predicateIndex);
  bool boolean_exprSempred(Boolean_exprContext *_localctx, size_t predicateIndex);

private:
  static std::vector<antlr4::dfa::DFA> _decisionToDFA;
  static antlr4::atn::PredictionContextCache _sharedContextCache;
  static std::vector<std::string> _ruleNames;
  static std::vector<std::string> _tokenNames;

  static std::vector<std::string> _literalNames;
  static std::vector<std::string> _symbolicNames;
  static antlr4::dfa::Vocabulary _vocabulary;
  static antlr4::atn::ATN _atn;
  static std::vector<uint16_t> _serializedATN;


  struct Initializer {
    Initializer();
  };
  static Initializer _init;
};

