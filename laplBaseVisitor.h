
// Generated from lapl.g4 by ANTLR 4.8

#pragma once


#include "antlr4-runtime.h"
#include "laplVisitor.h"


/**
 * This class provides an empty implementation of laplVisitor, which can be
 * extended to create a visitor which only needs to handle a subset of the available methods.
 */
class  laplBaseVisitor : public laplVisitor {
public:

  virtual antlrcpp::Any visitLapl_source(laplParser::Lapl_sourceContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitStatement(laplParser::StatementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitEmpty_line(laplParser::Empty_lineContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBlock(laplParser::BlockContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitLine_statement(laplParser::Line_statementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitString(laplParser::StringContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitNumber(laplParser::NumberContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitNumber_expression(laplParser::Number_expressionContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitString_expression(laplParser::String_expressionContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitValue(laplParser::ValueContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitArgument(laplParser::ArgumentContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitAssignment(laplParser::AssignmentContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFunction_call(laplParser::Function_callContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitWhile_block(laplParser::While_blockContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBoolean_value(laplParser::Boolean_valueContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBoolean_expr(laplParser::Boolean_exprContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitIf_block(laplParser::If_blockContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitElse_block(laplParser::Else_blockContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitContinue_statement(laplParser::Continue_statementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBreak_statement(laplParser::Break_statementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitExit_statement(laplParser::Exit_statementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFunction_declaration(laplParser::Function_declarationContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitReturn_statement(laplParser::Return_statementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitDisplay_statement(laplParser::Display_statementContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitDisplay_values(laplParser::Display_valuesContext *ctx) override {
    return visitChildren(ctx);
  }


};

