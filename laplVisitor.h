
// Generated from lapl.g4 by ANTLR 4.8

#pragma once


#include "antlr4-runtime.h"
#include "laplParser.h"



/**
 * This class defines an abstract visitor for a parse tree
 * produced by laplParser.
 */
class  laplVisitor : public antlr4::tree::AbstractParseTreeVisitor {
public:

  /**
   * Visit parse trees produced by laplParser.
   */
    virtual antlrcpp::Any visitLapl_source(laplParser::Lapl_sourceContext *context) = 0;

    virtual antlrcpp::Any visitStatement(laplParser::StatementContext *context) = 0;

    virtual antlrcpp::Any visitEmpty_line(laplParser::Empty_lineContext *context) = 0;

    virtual antlrcpp::Any visitBlock(laplParser::BlockContext *context) = 0;

    virtual antlrcpp::Any visitLine_statement(laplParser::Line_statementContext *context) = 0;

    virtual antlrcpp::Any visitString(laplParser::StringContext *context) = 0;

    virtual antlrcpp::Any visitNumber(laplParser::NumberContext *context) = 0;

    virtual antlrcpp::Any visitNumber_expression(laplParser::Number_expressionContext *context) = 0;

    virtual antlrcpp::Any visitString_expression(laplParser::String_expressionContext *context) = 0;

    virtual antlrcpp::Any visitValue(laplParser::ValueContext *context) = 0;

    virtual antlrcpp::Any visitArgument(laplParser::ArgumentContext *context) = 0;

    virtual antlrcpp::Any visitAssignment(laplParser::AssignmentContext *context) = 0;

    virtual antlrcpp::Any visitFunction_call(laplParser::Function_callContext *context) = 0;

    virtual antlrcpp::Any visitWhile_block(laplParser::While_blockContext *context) = 0;

    virtual antlrcpp::Any visitBoolean_value(laplParser::Boolean_valueContext *context) = 0;

    virtual antlrcpp::Any visitBoolean_expr(laplParser::Boolean_exprContext *context) = 0;

    virtual antlrcpp::Any visitIf_block(laplParser::If_blockContext *context) = 0;

    virtual antlrcpp::Any visitElse_block(laplParser::Else_blockContext *context) = 0;

    virtual antlrcpp::Any visitContinue_statement(laplParser::Continue_statementContext *context) = 0;

    virtual antlrcpp::Any visitBreak_statement(laplParser::Break_statementContext *context) = 0;

    virtual antlrcpp::Any visitExit_statement(laplParser::Exit_statementContext *context) = 0;

    virtual antlrcpp::Any visitFunction_declaration(laplParser::Function_declarationContext *context) = 0;

    virtual antlrcpp::Any visitReturn_statement(laplParser::Return_statementContext *context) = 0;

    virtual antlrcpp::Any visitDisplay_statement(laplParser::Display_statementContext *context) = 0;

    virtual antlrcpp::Any visitDisplay_values(laplParser::Display_valuesContext *context) = 0;


};

