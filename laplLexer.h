
// Generated from lapl.g4 by ANTLR 4.8

#pragma once


#include "antlr4-runtime.h"




class  laplLexer : public antlr4::Lexer {
public:
  enum {
    MULTICOMMENT = 1, MULTICOMMENTB = 2, MULTICOMMENTALL = 3, MULTICOMMENTALLB = 4, 
    COMMENT = 5, COMMENTB = 6, WHITESPACE = 7, EQ_OP = 8, NEQ_OP = 9, LT_OP = 10, 
    GT_OP = 11, LE_OP = 12, GE_OP = 13, PLUS_OP = 14, MINUS_OP = 15, POW_OP = 16, 
    TIMES_OP = 17, DIV_OP = 18, MOD_OP = 19, ASSIGN_OP = 20, CONCAT_OP = 21, 
    LPAR = 22, RPAR = 23, SEMICOLON = 24, COLON = 25, BLOCK_OPEN = 26, BLOCK_CLOSE = 27, 
    INDEX_ACCESS_O = 28, INDEX_ACCESS_C = 29, VARIABLE = 30, COMMA = 31, 
    REF_OP = 32, FLOOR_OP = 33, CEIL_OP = 34, NOT_OP = 35, OR_OP = 36, AND_OP = 37, 
    STR_OP = 38, NUM_OP = 39, BOOLOP = 40, WHILE = 41, CONTINUE = 42, BREAK = 43, 
    IF = 44, ELSE = 45, DISPLAY = 46, EXIT = 47, TRUE = 48, FALSE = 49, 
    RETURN = 50, FUNCTION = 51, ARRAY = 52, MAP = 53, LINEFEED = 54, CRLF = 55, 
    TYPE = 56, IDENTIFIER = 57, NUMBER = 58, QUOTE = 59, DQUOTE = 60, CHAR = 61, 
    DCHAR = 62, ESCAPEDCHAR = 63, STRING = 64
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

