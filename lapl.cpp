// --- Includes ---
#include <iostream>
#include "antlr4-runtime.h"
#include "antlrFiles/laplLexer.cpp"
#include "antlrFiles/laplParser.cpp"
#include "antlrFiles/laplVisitor.cpp"
#include <string>
#include <regex>
#include <iostream>
#include <wordexp.h>
#include <fstream>
#include <istream>
#include "libs/cpptrim.h"
#include <stdio.h>
#include <math.h>
#include <vector>
#include <unordered_map>
#include <random>
#include "libs/chtext.h"

// --- Namespaces ---
using namespace std;
using namespace antlr4;

// --- Constants ---
const string VERSION = "1.0";
const string VERSIONNAME = "Amazing Archaeopteryx";
#define TYPE_STRING  0
#define TYPE_NUMBER  1
#define TYPE_BOOLEAN 2
#define LAPL_NUMBER_EPSILON 0.00000001
#define EXCEPTION_CONTINUE 0
#define EXCEPTION_BREAK 1

// --- Custom Types ---
typedef double lapl_number;
typedef char lapl_type;
class lapl_variable;
class lapl_function;
class lapl_string;


// --- Global Variables ---
vector<unordered_map<string, lapl_variable>> variable_scope;
vector<unordered_map<string, lapl_function>> function_scope;

// --- Function Declarations ---
string expandPath(const string & input);
string parseArguments(int argc, const char* argv[]);
string loadFileContents(const string & path);
void error(const string & msg);
lapl_number stoln(const string & str);
string to_lapl_string(const lapl_number x);
void displayVersionInformation();
lapl_type getValueType(const antlrcpp::Any & type);
void declareVariable(const string & var_name, const antlrcpp::Any & value);
void setVariable(const string & var_name, const antlrcpp::Any & value);
void addVariableScope();
void delVariableScope();
void addFunctionScope();
void delFunctionScope();
bool variableExists(const string & var_name);
lapl_variable & getVariable(const string & var_name);
void setFunction(const string & function_name, const vector<string> & parameters, tree::ParseTree * execution_tree);
lapl_function & getFunction(const string & function_name);
void printFunctionScope();
void printVariableScope();
lapl_number getRandomNumber();
bool stringIsNumber(const string & text);

// --- Class Definitions ---
class lapl_variable
{
    private:
    // All variables default to false.
    lapl_type type = TYPE_BOOLEAN;
    antlrcpp::Any value = make_shared<bool>(false);
    lapl_number number_value;

    public:
    void setValue(antlrcpp::Any value)
    {
        this->type = getValueType(value);
        /*if (this->type == TYPE_STRING)
        {
            this->value = make_shared<string>(
                *value.as<shared_ptr<string>>()
            );
        }
        else if (this->type == TYPE_NUMBER)
        {
            this->number_value = *value.as<shared_ptr<lapl_number>>();
            this->value = make_shared<lapl_number>(this->number_value);
        }
        else if (this->type == TYPE_BOOLEAN)
        {
            this->value = make_shared<bool>(
                *value.as<shared_ptr<bool>>()
            );
        }*/
        this->value = value;
    }
    antlrcpp::Any getValue()
    {
        return this->value;
    }
    lapl_type getType()
    {
        return this->type;
    }
};

class lapl_function
{
    private:
    vector<string> parameters;
    tree::ParseTree * execution_tree;

    public:
    void define(const vector<string> & parameters, tree::ParseTree * execution_tree)
    {
        for(const string & parameter : parameters)
        {
            this->parameters.push_back(parameter);
        }
        this->execution_tree = execution_tree;
    }
    tree::ParseTree * getTree()
    {
        return this->execution_tree;
    }
    unsigned int parameterCount()
    {
        return this->parameters.size();
    }
    vector<string> & getParameters()
    {
        return this->parameters;
    }
};

// --- Visitor Class ---
class LaplVisitor : public laplVisitor
{
    virtual antlrcpp::Any visitLapl_source(laplParser::Lapl_sourceContext *context)
    {
        return visitChildren(context);
    }

    virtual antlrcpp::Any visitStatement(laplParser::StatementContext *context)
    {
        return visitChildren(context);
    }

    virtual antlrcpp::Any visitBlock(laplParser::BlockContext *context)
    {
        // while blocks, if blocks and functiond declarations are also blocks
        // because they not require a ; at the end (the statement that follows
        // them does) and thus it was simpler to make them blocks from a syntactic
        // point of view.
        if(context->BLOCK_OPEN() and context->BLOCK_CLOSE())
        {
            addVariableScope();
            addFunctionScope();
            visitChildren(context);
            delFunctionScope();
            delVariableScope();
        }
        else
        {
            visitChildren(context);
        }
        return nullptr;
    }

    virtual antlrcpp::Any visitEmpty_line(laplParser::Empty_lineContext *context)
    {
        return visitChildren(context);
    }

    virtual antlrcpp::Any visitLine_statement(laplParser::Line_statementContext *context)
    {
        return visitChildren(context);
    }

    virtual antlrcpp::Any visitString(laplParser::StringContext *context)
    {
        if (context->STRING())
        {
            string stringValue = context->STRING()->toString();
            stringValue = stringValue.substr(1, stringValue.length() - 2);
            replaceAll(stringValue, "\\n", "\n");
            replaceAll(stringValue, "\\r", "\r");
            replaceAll(stringValue, "\\t", "\t");
            replaceAll(stringValue, "\\\\", "\\");
            replaceAll(stringValue, "\\0", "\0");
            shared_ptr<string> valueToReturn = make_shared<string>(stringValue);
            return valueToReturn;
        }
        if (context->LINEFEED())
        {
            shared_ptr<string> valueToReturn = make_shared<string>("\n");
            return valueToReturn;
        }
        if (context->CRLF())
        {
            shared_ptr<string> valueToReturn = make_shared<string>("\r\n");
            return valueToReturn;
        }
        else if (context->STR_OP())
        {
            lapl_number numeric_value = *visit(context->children[1]).as<shared_ptr<lapl_number>>();
            string string_value = to_lapl_string(numeric_value);
            shared_ptr<string> valueToReturn = make_shared<string>(string_value);
            return valueToReturn;
        }
    }

    virtual antlrcpp::Any visitNumber(laplParser::NumberContext *context)
    {
        if (context->NUMBER())
        {
            lapl_number numberValue = stoln(context->NUMBER()->toString());
            shared_ptr<lapl_number> valueToReturn = make_shared<lapl_number>(numberValue);
            return valueToReturn;
        }
        else if (context->NUM_OP())
        {
            string string_value = *visit(context->children[1]).as<shared_ptr<string>>();
            lapl_number numeric_value = stoln(string_value);
            shared_ptr<lapl_number> valueToReturn = make_shared<lapl_number>(numeric_value);
            return valueToReturn;
        }
        else if (context->TYPE())
        {
            lapl_number numberValue = getValueType(visit(context->value()));
            shared_ptr<lapl_number> valueToReturn = make_shared<lapl_number>(numberValue);
            return valueToReturn;
        }
    }

    virtual antlrcpp::Any visitNumber_expression(laplParser::Number_expressionContext *context)
    {
        if (context->number())
        {
            return visit(context->number());
        }
        else if (context->PLUS_OP())
        {
            lapl_number value1 = *visit(context->children[0]).as<shared_ptr<lapl_number>>();
            lapl_number value2 = *visit(context->children[2]).as<shared_ptr<lapl_number>>();
            return make_shared<lapl_number>(value1 + value2);
        }
        else if (context->MINUS_OP())
        {
            lapl_number value1 = *visit(context->children[0]).as<shared_ptr<lapl_number>>();
            lapl_number value2 = *visit(context->children[2]).as<shared_ptr<lapl_number>>();
            return make_shared<lapl_number>(value1 - value2);
        }
        else if (context->TIMES_OP())
        {
            lapl_number value1 = *visit(context->children[0]).as<shared_ptr<lapl_number>>();
            lapl_number value2 = *visit(context->children[2]).as<shared_ptr<lapl_number>>();
            return make_shared<lapl_number>(value1 * value2);
        }
        else if (context->DIV_OP())
        {
            lapl_number value1 = *visit(context->children[0]).as<shared_ptr<lapl_number>>();
            lapl_number value2 = *visit(context->children[2]).as<shared_ptr<lapl_number>>();
            return make_shared<lapl_number>(value1 / value2);
        }
        else if (context->MOD_OP())
        {
            lapl_number value1 = *visit(context->children[0]).as<shared_ptr<lapl_number>>();
            lapl_number value2 = *visit(context->children[2]).as<shared_ptr<lapl_number>>();
            return make_shared<lapl_number>((long long)(value1) % (long long)(value2));
        }
        else if (context->POW_OP())
        {
            lapl_number value1 = *visit(context->children[0]).as<shared_ptr<lapl_number>>();
            lapl_number value2 = *visit(context->children[2]).as<shared_ptr<lapl_number>>();
            return make_shared<lapl_number>(pow(value1, value2));
        }
        else if (context->FLOOR_OP())
        {
            lapl_number value1 = *visit(context->children[1]).as<shared_ptr<lapl_number>>();
            return make_shared<lapl_number>(floor(value1));
        }
        else if (context->CEIL_OP())
        {
            lapl_number value1 = *visit(context->children[1]).as<shared_ptr<lapl_number>>();
            return make_shared<lapl_number>(ceil(value1));
        }
        else if (context->LPAR() and context->RPAR())
        {
            return visit(context->children[1]);
        }
        else if (context->function_call())
        {
            antlrcpp::Any return_value = visit(context->function_call());
            if(getValueType(return_value) != TYPE_NUMBER)
            {
                error("the returned value is not a number.");
            }
            return return_value;
        }
        else if (context->VARIABLE())
        {
            string var_name = context->VARIABLE()->toString();
            lapl_variable & var = getVariable(var_name);
            if(var.getType() != TYPE_NUMBER)
            {
                error("the variable '" + var_name + "' doesn't hold a number.");
            }
            return var.getValue();
        }
        else if (context->builtin_number_function())
        {
            return visit(context->builtin_number_function());
        }
    }

    virtual antlrcpp::Any visitString_expression(laplParser::String_expressionContext *context)
    {
        if (context->string())
        {
            return visit(context->string());
        }
        else if (context->CONCAT_OP())
        {
            string value1 = *visit(context->children[0]).as<shared_ptr<string>>();
            string value2 = *visit(context->children[2]).as<shared_ptr<string>>();
            return make_shared<string>(value1 + value2);
        }
        else if (context->LPAR() and context->RPAR())
        {
            return visit(context->children[1]);
        }
        else if (context->INDEX_ACCESS_O() and context->INDEX_ACCESS_C() and context->COMMA())
        {
            string string_value = *visit(context->children[0]).as<shared_ptr<string>>();
            lapl_number index_val_min = *visit(context->children[2]).as<shared_ptr<lapl_number>>();
            lapl_number index_val_max = *visit(context->children[4]).as<shared_ptr<lapl_number>>();
            if (index_val_min < 0 or index_val_min >= string_value.length())
            {
                error("string index out of bounds (index " + to_lapl_string(index_val_min) + " for string '" + string_value + "'.");
            }
            else if (index_val_max < 0 or index_val_max >= string_value.length())
            {
                error("string index out of bounds (index " + to_lapl_string(index_val_max) + " for string '" + string_value + "'.");
            }
            return make_shared<string>(string_value.substr(index_val_min, index_val_max));
        }
        else if (context->INDEX_ACCESS_O() and context->INDEX_ACCESS_C())
        {
            string string_value = *visit(context->children[0]).as<shared_ptr<string>>();
            lapl_number index_val = *visit(context->children[2]).as<shared_ptr<lapl_number>>();
            if (index_val < 0 or index_val >= string_value.length())
            {
                error("string index out of bounds (index " + to_lapl_string(index_val) + " for string '" + string_value + "'.");
            }
            return make_shared<string>(string_value.substr(index_val, 1));
        }
        else if (context->function_call())
        {
            antlrcpp::Any return_value = visit(context->function_call());
            if(getValueType(return_value) != TYPE_STRING) 
            {
                error("the returned value is not a string.");
            }
            return return_value;
        }
        else if (context->VARIABLE())
        {
            string var_name = context->VARIABLE()->toString();
            lapl_variable & var = getVariable(var_name);
            if(var.getType() != TYPE_STRING)
            {
                error("the variable '" + var_name + "' doesn't hold a string."); //TODO add line number to errors
            }
            return var.getValue();
        }
        else if (context->builtin_string_function())
        {
            return visit(context->builtin_string_function());
        }
    }

    //virtual antlrcpp::Any visitArray(laplParser::ArrayContext *context){}

    //virtual antlrcpp::Any visitMap(laplParser::MapContext *context){}

    //virtual antlrcpp::Any visitArray_expression(laplParser::Array_expressionContext *context){}

    //virtual antlrcpp::Any visitMap_expression(laplParser::Map_expressionContext *context){}

    virtual antlrcpp::Any visitValue(laplParser::ValueContext *context)
    {
        if (context->string_expression())
        {
            return visit(context->string_expression());
        }
        else if (context->number_expression())
        {
            return visit(context->number_expression());
        }
        else if (context->boolean_expr())
        {
            return visit(context->boolean_expr());
        }
        /*else if (context->array_expression())
        {
            return visit(context->array_expression());
        }
        else if (context->map_expression())
        {
            return visit(context->map_expression());
        }*/
        else if (context->VARIABLE())
        {
            string var_name = context->VARIABLE()->toString();
            lapl_variable & variable = getVariable(var_name);
            return variable.getValue();      
        }
        else if (context->function_call())
        {
            return visit(context->function_call());
        }
    }

    virtual antlrcpp::Any visitArgument(laplParser::ArgumentContext *context)
    {
        if(context->value())
        {
            return visit(context->value());
        }
        return nullptr;
    }

    virtual antlrcpp::Any visitAssignment(laplParser::AssignmentContext *context)
    {
        if(context->VARIABLE() and not context->VAR() and context->ASSIGN_OP())
        {
            string var_name = context->VARIABLE()->toString();
            setVariable(var_name, visit(context->value()));
        }
        else if(context->VARIABLE() and context->VAR() and context->ASSIGN_OP())
        {
            string var_name = context->VARIABLE()->toString();
            declareVariable(var_name, visit(context->value()));
        }
        else if(context->VARIABLE() and context->VAR() and not context->ASSIGN_OP())
        {
            string var_name = context->VARIABLE()->toString();
            declareVariable(var_name, make_shared<bool>(false));
        }
        return nullptr;
    }

    virtual antlrcpp::Any visitFunction_call(laplParser::Function_callContext *context)
    {
        string function_name = context->IDENTIFIER()->toString();
        string function_return_name = "$" + function_name;
        antlrcpp::Any return_value;
        lapl_function & function = getFunction(function_name);
        addVariableScope();
        addFunctionScope();
        declareVariable(function_return_name, make_shared<bool>(false));
        size_t parameter_number = 0;
        if(context->argument().size() != function.parameterCount())
        {
            error("argument count mismatch for function '" + function_name + "'.");
        }
        vector<string> & parameters = function.getParameters();
        for(const auto & argument : context->argument())
        {
            declareVariable(parameters[parameter_number], visit(argument));
            ++parameter_number;
        }
        try
        {
            visit(function.getTree());
        }
        catch(int e)
        {
            if (e == EXCEPTION_CONTINUE)
            {
                error("continue cannot be used in this context.");
            }
            else if(e == EXCEPTION_BREAK)
            {
                // Just exit the function
            }
            else {
                throw e;
            }
        }
        return_value = getVariable(function_return_name).getValue();
        delFunctionScope();
        delVariableScope();
        return return_value;
    }

    virtual antlrcpp::Any visitWhile_block(laplParser::While_blockContext *context)
    {
        while(true)
        {
            bool boolean_value = *visit(context->boolean_expr()).as<shared_ptr<bool>>();
            if(!boolean_value) break;
            else{
                try
                {
                    visit(context->statement());
                }
                catch(int e)
                {
                    // Break or continue!
                    if (e == EXCEPTION_CONTINUE)
                    {
                        continue;
                    }
                    else if(e == EXCEPTION_BREAK)
                    {
                        break;
                    }
                    else {
                        throw e;
                    }
                }
            }
        }
        return nullptr;
    }

    virtual antlrcpp::Any visitBoolean_value(laplParser::Boolean_valueContext *context)
    {
        bool booleanValue = context->TRUE() ? true : false;
        shared_ptr<bool> valueToReturn = make_shared<bool>(booleanValue);
        return valueToReturn;
    }

    virtual antlrcpp::Any visitBoolean_expr(laplParser::Boolean_exprContext *context)
    {
        if (context->boolean_value())
        {
            return visit(context->boolean_value());
        }
        else if (context->NOT_OP())
        {
            bool value1 = *visit(context->children[1]).as<shared_ptr<bool>>();
            return make_shared<bool>(not value1);
        }
        else if (context->AND_OP())
        {
            bool value1 = *visit(context->children[0]).as<shared_ptr<bool>>();
            bool value2 = *visit(context->children[2]).as<shared_ptr<bool>>();
            return make_shared<bool>(value1 and value2);
        }
        else if (context->OR_OP())
        {
            bool value1 = *visit(context->children[0]).as<shared_ptr<bool>>();
            bool value2 = *visit(context->children[2]).as<shared_ptr<bool>>();
            return make_shared<bool>(value1 or value2);
        }
        else if (context->EQ_OP() and not context->boolean_expr().empty())
        {
            bool value1 = *visit(context->children[0]).as<shared_ptr<bool>>();
            bool value2 = *visit(context->children[2]).as<shared_ptr<bool>>();
            return make_shared<bool>(value1 == value2);
        }
        else if (context->NEQ_OP() and not context->boolean_expr().empty())
        {
            bool value1 = *visit(context->children[0]).as<shared_ptr<bool>>();
            bool value2 = *visit(context->children[2]).as<shared_ptr<bool>>();
            return make_shared<bool>(value1 != value2);
        }
        else if (context->EQ_OP() and not context->string_expression().empty())
        {
            string value1 = *visit(context->children[0]).as<shared_ptr<string>>();
            string value2 = *visit(context->children[2]).as<shared_ptr<string>>();
            return make_shared<bool>(value1 == value2);
        }
        else if (context->NEQ_OP() and not context->string_expression().empty())
        {
            string value1 = *visit(context->children[0]).as<shared_ptr<string>>();
            string value2 = *visit(context->children[2]).as<shared_ptr<string>>();
            return make_shared<bool>(value1 != value2);
        }
        else if (context->LT_OP() and not context->string_expression().empty())
        {
            string value1 = *visit(context->children[0]).as<shared_ptr<string>>();
            string value2 = *visit(context->children[2]).as<shared_ptr<string>>();
            return make_shared<bool>(value1 < value2);
        }
        else if (context->GT_OP() and not context->string_expression().empty())
        {
            string value1 = *visit(context->children[0]).as<shared_ptr<string>>();
            string value2 = *visit(context->children[2]).as<shared_ptr<string>>();
            return make_shared<bool>(value1 > value2);
        }
        else if (context->LE_OP() and not context->string_expression().empty())
        {
            string value1 = *visit(context->children[0]).as<shared_ptr<string>>();
            string value2 = *visit(context->children[2]).as<shared_ptr<string>>();
            return make_shared<bool>(value1 <= value2);
        }
        else if (context->GE_OP() and not context->string_expression().empty())
        {
            string value1 = *visit(context->children[0]).as<shared_ptr<string>>();
            string value2 = *visit(context->children[2]).as<shared_ptr<string>>();
            return make_shared<bool>(value1 >= value2);
        }
        else if (context->EQ_OP() and not context->number_expression().empty())
        {
            lapl_number value1 = *visit(context->children[0]).as<shared_ptr<lapl_number>>();
            lapl_number value2 = *visit(context->children[2]).as<shared_ptr<lapl_number>>();
            return make_shared<bool>(fabs(value1 - value2) < LAPL_NUMBER_EPSILON);
        }
        else if (context->NEQ_OP() and not context->number_expression().empty())
        {
            lapl_number value1 = *visit(context->children[0]).as<shared_ptr<lapl_number>>();
            lapl_number value2 = *visit(context->children[2]).as<shared_ptr<lapl_number>>();
            return make_shared<bool>(value1 != value2);
        }
        else if (context->LT_OP() and not context->number_expression().empty())
        {
            lapl_number value1 = *visit(context->children[0]).as<shared_ptr<lapl_number>>();
            lapl_number value2 = *visit(context->children[2]).as<shared_ptr<lapl_number>>();
            return make_shared<bool>(value1 < value2);
        }
        else if (context->GT_OP() and not context->number_expression().empty())
        {
            lapl_number value1 = *visit(context->children[0]).as<shared_ptr<lapl_number>>();
            lapl_number value2 = *visit(context->children[2]).as<shared_ptr<lapl_number>>();
            return make_shared<bool>(value1 > value2);
        }
        else if (context->LE_OP() and not context->number_expression().empty())
        {
            lapl_number value1 = *visit(context->children[0]).as<shared_ptr<lapl_number>>();
            lapl_number value2 = *visit(context->children[2]).as<shared_ptr<lapl_number>>();
            return make_shared<bool>(value1 <= value2);
        }
        else if (context->GE_OP() and not context->number_expression().empty())
        {
            lapl_number value1 = *visit(context->children[0]).as<shared_ptr<lapl_number>>();
            lapl_number value2 = *visit(context->children[2]).as<shared_ptr<lapl_number>>();
            return make_shared<bool>(value1 >= value2);
        }
        else if (context->LPAR() and context->RPAR())
        {
            return visit(context->children[1]);
        }
        else if (context->function_call())
        {
            antlrcpp::Any return_value = visit(context->function_call());
            if(getValueType(return_value) != TYPE_BOOLEAN)
            {
                error("the returned value is not a boolean.");
            }
            return return_value;
        }
        else if (context->VARIABLE())
        {
            string var_name = context->VARIABLE()->toString();
            lapl_variable & var = getVariable(var_name);
            if(var.getType() != TYPE_BOOLEAN)
            {
                error("the variable '" + var_name + "' doesn't hold a boolean.");
            }
            return var.getValue();
        }
        else if (context->builtin_boolean_function())
        {
            return visit(context->builtin_boolean_function());
        }
    }

    virtual antlrcpp::Any visitIf_block(laplParser::If_blockContext *context)
    {
        bool boolean_value = *visit(context->boolean_expr()).as<shared_ptr<bool>>();
        if(boolean_value) visit(context->statement());
        else
        {
            if(context->else_block())
            {
                visit(context->else_block());
            }
        }
        return nullptr;
    }

    virtual antlrcpp::Any visitElse_block(laplParser::Else_blockContext *context)
    {
        visit(context->statement());
        return nullptr;
    }

    virtual antlrcpp::Any visitContinue_statement(laplParser::Continue_statementContext *context)
    {
        throw 0;
    }

    virtual antlrcpp::Any visitBreak_statement(laplParser::Break_statementContext *context)
    {
        throw 1;
    }

    virtual antlrcpp::Any visitExit_statement(laplParser::Exit_statementContext *context)
    {
        if (context->number_expression())
        {
            lapl_number exit_code = *visit(context->children[1]).as<shared_ptr<lapl_number>>();
            exit((int) exit_code);
        }
        else exit(0);
    }

    virtual antlrcpp::Any visitFunction_declaration(laplParser::Function_declarationContext *context)
    {
        string function_name = context->IDENTIFIER()->toString();
        vector<string> parameters;
        for(const auto & parameter : context->VARIABLE())
        {
            parameters.push_back(parameter->toString());
        }
        setFunction(function_name, parameters, context->statement());
        return nullptr;
    }

    virtual antlrcpp::Any visitDisplay_statement(laplParser::Display_statementContext *context)
    {
        return visit(context->display_values());
    }

    virtual antlrcpp::Any visitDisplay_values(laplParser::Display_valuesContext *context)
    {
        for (auto & child : context->children)
        {
            antlrcpp::Any value_to_print = visit(child);
            if (value_to_print.is<shared_ptr<string>>())
            {
                string string_to_print = *value_to_print.as<shared_ptr<string>>();
                cout << string_to_print << flush;
            }
            else if (value_to_print.is<shared_ptr<lapl_number>>())
            {
                lapl_number number_to_print = *value_to_print.as<shared_ptr<lapl_number>>();
                cout << to_lapl_string(number_to_print) << flush;
            }
            else if (value_to_print.is<shared_ptr<bool>>())
            {
                bool boolean_value = *value_to_print.as<shared_ptr<bool>>();
                cout << (boolean_value ? "true" : "false") << flush;
            }
        }
        return nullptr;
    }

    virtual antlrcpp::Any visitBuiltin_number_function(laplParser::Builtin_number_functionContext *context)
    {
        // len(string)
        if(context->BIF_LEN())
        {
            string value = *visit(context->children[2]).as<shared_ptr<string>>();
            return make_shared<lapl_number>(value.length());
        }
        // random()
        else if(context->RANDOM())
        {
            return make_shared<lapl_number>(getRandomNumber());
        }
    }

    virtual antlrcpp::Any visitBuiltin_string_function(laplParser::Builtin_string_functionContext *context)
    {
        // accept()
        if(context->ACCEPT())
        {
            string s = "";
            getline(cin, s);
            return make_shared<string>(s);
        }
    }

    virtual antlrcpp::Any visitBuiltin_boolean_function(laplParser::Builtin_boolean_functionContext *context)
    {
        // isNumeric(string)
        if(context->BIF_ISNUM())
        {
            string value = *visit(context->children[2]).as<shared_ptr<string>>();
            return make_shared<bool>(stringIsNumber(value));
        }
    }
};

// --- Main ---
int main(int argc, const char * argv[])
{
    string fileName = parseArguments(argc, argv);
    string filePath = expandPath(fileName);
    string fileContents = loadFileContents(filePath);

    //https://stackoverflow.com/questions/44515370/how-to-override-error-reporting-in-c-target-of-antlr4
    ANTLRInputStream input(fileContents);
    laplLexer lexer(&input);
    CommonTokenStream tokens(&lexer);
    laplParser parser(&tokens);
    tree::ParseTree *tree = parser.lapl_source();
    LaplVisitor visitor;

    addVariableScope();
    addFunctionScope();
    try
    {
        visitor.visit(tree);
    }
    catch(int e)
    {
        if (e == EXCEPTION_CONTINUE)
        {
            error("continue cannot be used in this context.");
        }
        else if(e == EXCEPTION_BREAK)
        {
            error("break cannot be used in this context.");
        }
        else {
            throw e;
        }
    }

    return 0;
}

// --- Functions ---
string expandPath(const string & input)
{
    string text = input;
    wordexp_t expandedPath;
    char** expandedPathString;
    wordexp(text.c_str(), &expandedPath, 0);
    expandedPathString = expandedPath.we_wordv;
    text = "";
    for (size_t i = 0; i < expandedPath.we_wordc; i++)
    {
        text += expandedPathString[i];
        text += " ";
    }
    wordfree(&expandedPath);
    trim(text);
    return text;
}

string parseArguments(int argc, const char * argv[])
{
    vector<string> args(argv + 1, argv + argc);
    string filename = "";
    for (string & arg : args)
    {
        if (arg == "-h" || arg == "--help")
        {
            //TODO
            exit(0);
        }
        else if (arg == "-v" || arg == "--version")
        {
            displayVersionInformation();
            exit(0);
        }
        else if (arg[0] == '-')
        {
            error("unrecognized switch '" + arg +"'.");
        }
        else if(filename == "")
        {
            filename = arg;
        }
        else
        {
            error("multiple file paths found.");
        }
    }
    return filename;
}

string loadFileContents(const string & path)
{
    string fileContents = "";
    ifstream file(path);
    if (file.is_open())
    {
        string line = "";
        while (getline(file, line))
        {
            fileContents += line;
            fileContents += "\n";
        }
    }
    else
    {
        error("file '" + path + "' not found.");
    }
    return fileContents;
}

void error(const string & msg)
{
    cerr << "\033[1;31mFatal LAPL Error: ";
    cerr << msg;
    cerr << "\033[0m" << endl;
    exit(1);
}

lapl_number stoln(const string & str)
{
    if(stringIsNumber(str)) return stod(str);
    error("the string '" + str + "' is not numeric and cannot be converted to a number.");
}

string to_lapl_string(const lapl_number x)
{
    ostringstream out;
    out.precision(10);
    out << fixed << x;
    string str = out.str();
    str.erase(str.find_last_not_of('0') + 1, string::npos);
    str.erase(str.find_last_not_of('.') + 1, string::npos);
    return str;
}

void displayVersionInformation()
{
    cout << endl;
    cout << " This is \033[32;1mLAPL version " << VERSION << "\033[0m '\033[32;1m" << VERSIONNAME << "\033[0m'." << endl << endl;
    cout << " Copyright 2020, \033[35;1mMartín del Río\033[0m (www.lartu.net)." << endl;
    cout << endl;
    cout << " LAPL may be copied only under the terms of the Apache License" << endl;
    cout << " Version 2.0, which may be found in the LAPL repository." << endl;
    /*cout << endl;
    cout << " This binary was compiled on \033[31;1m" << COMPILEDATE << "\033[0m at \033[31;1m" << COMPILEHOUR << "\033[0m." << endl;*/
    cout << endl;
}

lapl_type getValueType(const antlrcpp::Any & type)
{
    if (type.is<shared_ptr<string>>())
    {
        return TYPE_STRING;
    }
    else if (type.is<shared_ptr<lapl_number>>())
    {
        return TYPE_NUMBER;
    }
    else if (type.is<shared_ptr<bool>>())
    {
        return TYPE_BOOLEAN;
    }
    error("unkown type for value; very, very fatal error. Please report this!");
    return -1;
}

void addVariableScope()
{
    variable_scope.push_back(unordered_map<string, lapl_variable>());
}

void delVariableScope()
{
    variable_scope.pop_back();
}

void addFunctionScope()
{
    function_scope.push_back(unordered_map<string, lapl_function>());
}

void delFunctionScope()
{
    function_scope.pop_back();
}

void declareVariable(const string & var_name, const antlrcpp::Any & value)
{
    int last_scope = variable_scope.size() - 1;
    lapl_variable & var = variable_scope[last_scope][var_name];
    var = lapl_variable();
    lapl_type type = getValueType(value);
    var.setValue(value);
}

void setVariable(const string & var_name, const antlrcpp::Any & value)
{
    for(int scope_depth = variable_scope.size() - 1; scope_depth >= 0; --scope_depth)
    {
        unordered_map<string, lapl_variable> & scope = variable_scope[scope_depth];
        if(scope.find(var_name) != scope.end())
        {
            lapl_variable & var = variable_scope[scope_depth][var_name];
            lapl_type type = getValueType(value);
            var.setValue(value);
            return;
        }
    }
    int last_scope = variable_scope.size() - 1;
    lapl_variable & var = variable_scope[last_scope][var_name];
    var = lapl_variable();
    lapl_type type = getValueType(value);
    var.setValue(value);
}

bool variableExists(const string & var_name)
{
    for(int scope_depth = variable_scope.size() - 1; scope_depth >= 0; --scope_depth)
    {
        unordered_map<string, lapl_variable> & scope = variable_scope[scope_depth];
        if(scope.find(var_name) != scope.end()) return true;
    }
    return false;
}

lapl_variable & getVariable(const string & var_name)
{
    for(int scope_depth = variable_scope.size() - 1; scope_depth >= 0; --scope_depth)
    {
        unordered_map<string, lapl_variable> & scope = variable_scope[scope_depth];
        if(scope.find(var_name) != scope.end())
        {
            return scope[var_name];
        }
    }
    error("the variable '" + var_name + "' hasn't been declared in this scope.");
}

void setFunction(const string & function_name, const vector<string> & parameters, tree::ParseTree * execution_tree)
{
    /*for(int scope_depth = 0; scope_depth < function_scope.size(); ++scope_depth)
    {
        auto & scope = function_scope[scope_depth];
        if(scope.find(function_name) != scope.end())
        {
            lapl_function & fun = function_scope[scope_depth][function_name];
            fun.define(parameters, execution_tree);
            return;
        }
    }*/
    int last_scope = function_scope.size() - 1;
    lapl_function & fun = function_scope[last_scope][function_name];
    fun = lapl_function();
    fun.define(parameters, execution_tree);
}

lapl_function & getFunction(const string & function_name)
{
    for(int scope_depth = function_scope.size() - 1; scope_depth >= 0; --scope_depth)
    {
        auto & scope = function_scope[scope_depth];
        if(scope.find(function_name) != scope.end())
        {
            return scope[function_name];
        }
    }
    error("the function '" + function_name + "' hasn't been declared in this scope.");
}

void printFunctionScope()
{
    cout << "--- Function Scope ---" << endl;
    size_t depth = 0;
    for(const auto & scope : function_scope)
    {
        for(const auto & tuple : scope)
        {
            cout << "Depth " << depth << " ";
            for(size_t i = 1; i <= depth + 1; ++i)
            {
                cout << "..";
            }
            cout << " " << tuple.first << endl;
        }
        ++depth;
    }
    cout << "----------------------" << endl;
}

void printVariableScope()
{
    cout << "--- Variable Scope ---" << endl;
    size_t depth = 0;
    for(const auto & scope : variable_scope)
    {
        for(const auto & tuple : scope)
        {
            cout << "Depth " << depth << " ";
            for(size_t i = 1; i <= depth + 1; ++i)
            {
                cout << "..";
            }
            cout << " " << tuple.first << endl;
        }
        ++depth;
    }
    cout << "----------------------" << endl;
}

lapl_number getRandomNumber(){
    random_device rd;
    mt19937 mt(rd());
    uniform_real_distribution<double> dist(0.0, 1.0);
    lapl_number r = (lapl_number) dist(mt);
    return r;
}

bool stringIsNumber(const string & text)
{
    try
    {
        stod(text);
    }
    catch (std::invalid_argument const &)
    {
        return false;
    }
    return true;
}