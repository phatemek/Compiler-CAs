grammar FunctionCraft;

//LEXER

//keywords

DEF: 'def';
IF: 'if';
ELSE: 'else';
ELSEIF: 'elseif';
END: 'end';
TRUE: 'true';
FALSE: 'false';
METHOD: 'method';
PATTERN: 'pattern';
MATCH: 'match';
NEXT: 'next';
BREAK: 'break';
LOOP: 'loop';
DO: 'do';
FOR: 'for';
IN: 'in';
RETURN: 'return';

//primitive data types

INT: 'int';
FLOAT: 'float';
STRING: 'string';
BOOL: 'bool';
LIST: 'list';
FPTR: 'fptr';

//primitive functions

PUSH: 'push';
PUTS: 'puts';
CHOP: 'chop';
CHOMP: 'chomp';
MAIN: 'main';
LEN: 'len';
//KEYWORD: MAIN|DEF|IF|ELSE|ELSEIF|END|TRUE|FALSE|CHOP|CHOMP|PUSH|PUTS|METHOD|LEN|PATTERN|MATCH|NEXT|BREAK|LOOP|DO|FOR|IN|RETURN;

//symbols

UNDERSCORE: '_';
LBRACE: '{';
RBRACE: '}';
COMMA: ',';
COLON: ':';
SEMICOLON: ';';
ARROW: '->';
QUOT: '"';
DDOT: '..';
LINE: '|';
INDENTATION: '    ';

//operators

LPAR: '(';
RPAR: ')';
LBRACK: '[';
RBRACK: ']';

//arithmatic operators

DEC: '--';
INC: '++';
MULT: '*';
DIV: '/';
PLUS: '+';
MINUS: '-';

//comparison operators

LEQ: '<=';
GEQ: '>=';
LES: '<';
GRT: '>';
EQL: '==';
NEQL: '!=';

//logical operators

AND: '&&';
OR: '||';
NOT: '!';

//append

APPEND: '<<';

//assignment operators

ASSIGN: '=';
PLUSEQ: '+=';
MINUSEQ: '-=';
MULTEQ: '*=';
DIVEQ: '/=';
REMEQ: '%=';

//basic

LETTER: [a-zA-Z];
DIGIT: [0-9];
INT_VAL: [1-9][0-9]*;
FLOAT_VAL: INT_VAL '.' [0-9]+;
STRING_VAL:   '"' ('\\' ["\\] | ~["\\\r\n])* '"';
BOOL_VAL: TRUE | FALSE;

//ids

IDENTIFIER: (LETTER|UNDERSCORE)(DIGIT|LETTER|UNDERSCORE)*;

//comments

SLCOMMENT: '#' ~[\r\n]* -> skip;
MLCOMMENT: '=begin' ~[=end]* '=end' -> skip;
WS: [ \t\r\n]+ -> skip;

//PARSER

program:
    (function | comment)*
    main;

comment:
    SLCOMMENT |
    MLCOMMENT;

function:
    DEF IDENTIFIER LPAR function_args RPAR
    function_body
    END;

main:
    DEF MAIN LPAR RPAR
    function_body
    END;

function_args:
    IDENTIFIER COMMA function_args |
    optional_args COMMA function_args |
    IDENTIFIER |
    optional_args;

optional_args:
    LBRACK assignment_eq (COMMA assignment_eq)* RBRACK;

assignment_eq:
    IDENTIFIER ASSIGN (INT_VAL | FLOAT_VAL | STRING_VAL | BOOL_VAL | list_val | fptr_val);
