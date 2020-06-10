
// Generated from lapl.g4 by ANTLR 4.8

#pragma once


#include "antlr4-runtime.h"




class  laplLexer : public antlr4::Lexer {
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

  laplLexer(antlr4::CharStream *input);
  ~laplLexer();

  virtual std::string getGrammarFileName() const override;
  virtual const std::vector<std::string>& getRuleNames() const override;

  virtual const std::vector<std::string>& getChannelNames() const override;
  virtual const std::vector<std::string>& getModeNames() const override;
  virtual const std::vector<std::string>& getTokenNames() const override; // deprecated, use vocabulary instead
  virtual antlr4::dfa::Vocabulary& getVocabulary() const override;

  virtual const std::vector<uint16_t> getSerializedATN() const override;
  virtual const antlr4::atn::ATN& getATN() const override;

private:
  static std::vector<antlr4::dfa::DFA> _decisionToDFA;
  static antlr4::atn::PredictionContextCache _sharedContextCache;
  static std::vector<std::string> _ruleNames;
  static std::vector<std::string> _tokenNames;
  static std::vector<std::string> _channelNames;
  static std::vector<std::string> _modeNames;

  static std::vector<std::string> _literalNames;
  static std::vector<std::string> _symbolicNames;
  static antlr4::dfa::Vocabulary _vocabulary;
  static antlr4::atn::ATN _atn;
  static std::vector<uint16_t> _serializedATN;


  // Individual action functions triggered by action() above.

  // Individual semantic predicate functions triggered by sempred() above.

  struct Initializer {
    Initializer();
  };
  static Initializer _init;
};

