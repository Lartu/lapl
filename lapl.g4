grammar lapl;

// +-----------------------------------------+ //
// |               Lexer Rules               | //
// +-----------------------------------------+ //

MULTICOMMENT    : '/*' .*? '*/' -> skip ;
MULTICOMMENTB   : '#*' .*? '*#' -> skip ;
/*MULTICOMMENTALL : '/*' .*? EOF -> skip ;
MULTICOMMENTALLB: '/*' .*? EOF -> skip ;*/
COMMENT         : '#' .*? '\n' -> skip ;
COMMENTB        : '//' .*? '\n' -> skip ;
WHITESPACE      : (' ' | '\t' | '\n' |'\r') -> skip;
EQ_OP           : '==';
NEQ_OP          : '!=';
LT_OP           : '<';
GT_OP           : '>';
LE_OP           : '<=';
GE_OP           : '>=';
PLUS_OP         : '+';
MINUS_OP        : '-';
POW_OP          : '**';
TIMES_OP        : '*';
DIV_OP          : '/';
MOD_OP          : '%';
ASSIGN_OP       : '=';
CONCAT_OP       : '&';
LPAR            : '(';
RPAR            : ')' ;
SEMICOLON       : ';' ;
COLON           : ':' ;
BLOCK_OPEN      : '{' ;
BLOCK_CLOSE     : '}' ;
INDEX_ACCESS_O  : '[' ;
INDEX_ACCESS_C  : ']' ; 
VARIABLE        : '$' [a-zA-Z_] [a-zA-Z0-9_]* ;
COMMA           : ',' ;
// <Reserved words>
REF_OP          : 'ref';
FLOOR_OP        : 'floor';
CEIL_OP         : 'ceil';
NOT_OP          : 'not';
OR_OP           : 'or';
AND_OP          : 'and';
STR_OP          : 'str';
NUM_OP          : 'num';
BOOLOP          : 'bool';
WHILE           : 'while' ;
CONTINUE        : 'continue' ;
BREAK           : 'break' ;
IF              : 'if' ;
ELSE            : 'else' ;
DISPLAY         : 'display' ;
EXIT            : 'exit' ;
TRUE            : 'true' ;
FALSE           : 'false' ;
RETURN          : 'return' ;
FUNCTION        : 'fun' ;
ARRAY           : 'array' ;
MAP             : 'map' ;
LINEFEED        : 'lf' ;
CRLF            : 'crlf' ;
TYPE            : 'type' ;
VAR             : 'var';
// </Reserved words>
IDENTIFIER      : [a-zA-Z_] [a-zA-Z0-9_]* ;
NUMBER          : [0-9]+ ('.' [0-9]+)? ;
QUOTE           : '\'';
DQUOTE          : '"';
CHAR            : ~['] | ESCAPEDCHAR ;
DCHAR            : ~["] | ESCAPEDCHAR ;
ESCAPEDCHAR     : '\\' . ;
STRING          : (QUOTE CHAR* QUOTE) | (DQUOTE DCHAR* DQUOTE);


// +------------------------------------------+ //
// |               Parser Rules               | //
// +------------------------------------------+ //

lapl_source             
        : statement* EOF
        ;
statement               
        : block
        | line_statement
        | empty_line
        ;
empty_line
        : SEMICOLON
        ;
block                   
        : BLOCK_OPEN statement* BLOCK_CLOSE
        | while_block
        | if_block
        | function_declaration
        ;
line_statement
        : 
        ( assignment
        | function_call
        | continue_statement
        | break_statement
        | exit_statement
        | display_statement
        ) SEMICOLON
        ;
string
        : STRING
        | STR_OP number_expression
        | LINEFEED
        | CRLF
        ;
number
        : PLUS_OP* MINUS_OP* NUMBER 
        | NUM_OP string_expression
        | TYPE value
        ;
number_expression
        : number
        | function_call
        | VARIABLE
        | CEIL_OP number_expression
        | FLOOR_OP number_expression
        | number_expression POW_OP number_expression
        | number_expression MOD_OP number_expression
        | number_expression DIV_OP number_expression
        | number_expression TIMES_OP number_expression
        | number_expression MINUS_OP number_expression
        | number_expression PLUS_OP number_expression
        | LPAR number_expression RPAR
        ; //Precedence goes from bottom (higher) to top (lower)
string_expression
        : string
        | function_call
        | VARIABLE
        | string_expression INDEX_ACCESS_O number_expression INDEX_ACCESS_C
        | string_expression INDEX_ACCESS_O number_expression COMMA number_expression INDEX_ACCESS_C
        | string_expression CONCAT_OP string_expression
        | LPAR string_expression RPAR
        ; 
/*array //TODO check
        : ARRAY
        | VARIABLE INDEX_ACCESS_O value INDEX_ACCESS_C
        | function_call INDEX_ACCESS_O value INDEX_ACCESS_C
        ;
map //TODO check
        : MAP
        | VARIABLE BLOCK_OPEN value BLOCK_CLOSE
        | function_call BLOCK_OPEN value BLOCK_CLOSE
        ;
array_expression
        : array
        | VARIABLE
        | function_call
        ;
map_expression
        : map
        | VARIABLE
        | function_call
        ;*/
value
        : VARIABLE
        | function_call
        | string_expression
        | number_expression
        | boolean_expr
        //| array_expression
        //| map_expression
        ;
argument
        : value
        //| REF_OP VARIABLE
        ;
assignment
        : VARIABLE ASSIGN_OP value
        | VAR VARIABLE ASSIGN_OP value
        | VAR VARIABLE
        //| VARIABLE INDEX_ACCESS_O value INDEX_ACCESS_C ASSIGN_OP value
        ;
function_call
        : IDENTIFIER LPAR argument (COMMA argument)* RPAR
        ;
while_block
        : WHILE boolean_expr statement
        ;
boolean_value
        : TRUE
        | FALSE
        ;
boolean_expr
        : boolean_value
        | function_call
        | VARIABLE
        | NOT_OP boolean_expr
        | string_expression EQ_OP string_expression
        | string_expression NEQ_OP string_expression
        | string_expression LT_OP string_expression
        | string_expression GT_OP string_expression
        | string_expression LE_OP string_expression
        | string_expression GE_OP string_expression
        | number_expression EQ_OP number_expression
        | number_expression NEQ_OP number_expression
        | number_expression LT_OP number_expression
        | number_expression GT_OP number_expression
        | number_expression LE_OP number_expression
        | number_expression GE_OP number_expression
        | boolean_expr OR_OP boolean_expr
        | boolean_expr AND_OP boolean_expr
        | LPAR boolean_expr RPAR
        ;
if_block
        : IF boolean_expr statement else_block?
        ;
else_block
        : ELSE statement
        ;
continue_statement
        : CONTINUE
        ;
break_statement
        : BREAK
        ;
exit_statement
        : EXIT
        | EXIT number_expression
        ;
function_declaration
        : FUNCTION IDENTIFIER LPAR (VARIABLE (COMMA VARIABLE)*)? RPAR statement
        ;
display_statement
        : DISPLAY display_values
        ;
display_values
        : value+
        ;

/*
FEATURES TO BE ADDED (in no particular order):
accept
arrays
maps
pass by reference for maps and arrays
copy maps and arrays
ternary operator
include
SCRIPTDIR
try - except
try without except
for
for each
namespaces
sleep
execute
file saving, loading and appending (and reading line by line)
string length
string uppercase
string lowercase
random number
trigonometric functions
fork
mutex
semaphores
*/