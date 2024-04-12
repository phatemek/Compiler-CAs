grammar FunctionCraft;

// Lexer rules
// The lexer rules define patterns for recognizing tokens like numbers, booleans, strings,
// comments, keywords, identifiers, and operators in the input text. These rules are used
// by the lexer to break the input into a token stream.

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

//ids

IDENTIFIER: (LETTER|UNDERSCORE)(DIGIT|LETTER|UNDERSCORE)*;

//comments

SLCOMMENT: '#' ~[\r\n]* -> skip;
MLCOMMENT: '=begin' ~[=end]* '=end' -> skip;
WS: [ \t\r\n]+ -> skip;

// TODO

// Parser rules
// The parser rules start with the program rule, which defines the overall structure of a
// valid program. They then specify how tokens can be combined to form declarations, control
// structures, expressions, assignments, function calls, and other constructs within a program.
// The parser rules collectively define the syntax of the language.

// TODO