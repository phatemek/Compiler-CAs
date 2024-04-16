grammar FunctionCraft;

//PARSER

program:
    (function | pattern)*
    { System.out.println("MAIN"); }main;

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
    LBRACK init (COMMA init)* RBRACK;

init:
    value ASSIGN expression;

expression:
    (
    append_line |
    LPAR expression RPAR |
    value INC |
    value DEC |
    NOT expression |
    MINUS expression |
    logical_expression |
    value
    ) expr_prim;

append_line:
    (IDENTIFIER | list_val | STRING_VAL | value_from_list) APPEND
    ((IDENTIFIER | list_val | STRING_VAL | expression | value_from_list) APPEND)*
    (IDENTIFIER | list_val | STRING_VAL | expression | value_from_list);

expr_prim:
    (arithmatic_operator expression expr_prim) | ;

arithmatic_operator:
    PLUS |
    MINUS |
    MULT |
    DIV;

value_from_list:
    (RPAR expression LPAR | list_val | function_call | IDENTIFIER) ((LBRACK value RBRACK)+);

value:
    value_from_list |
    INT_VAL |
    FLOAT_VAL |
    BOOL_VAL |
    STRING_VAL |
    list_val |
    fptr_val |
    function_call |
    pattern_call |
    IDENTIFIER;

list_val:
   LBRACK (expression) (COMMA expression)* RBRACK |
   LBRACK RBRACK;

logical_expression:
    LPAR
    (expression |
    NOT LPAR expression RPAR |
    expression EQL expression |
    expression NEQL expression |
    expression LEQ expression |
    expression GEQ expression |
    expression LES expression |
    expression GRT expression |
    LPAR logical_expression RPAR OR LPAR logical_expression RPAR |
    LPAR logical_expression RPAR AND LPAR logical_expression RPAR)
    RPAR;

fptr_val:
    METHOD LPAR COLON IDENTIFIER RPAR |
    ARROW LPAR function_args RPAR LBRACE function_body RBRACE;

primitive_function:
    PUSH |
    PUTS |
    CHOP |
    CHOMP |
    LEN;

function_call:
    (primitive_function | IDENTIFIER | fptr_val) LPAR (expression (COMMA expression)*)? RPAR;

function_body:
    (init SEMICOLON |
    if_scope |
    for_scope |
    function_call SEMICOLON |
    pattern_call SEMICOLON |
    expression SEMICOLON |
    return_line)*;

if_scope:
    IF logical_expression function_body (elseif_scope)* (else_scope)? END;

elseif_scope:
    ELSEIF logical_expression function_body;

else_scope:
    ELSE function_body;

loop_body:
    (init SEMICOLON |
    if_scope |
    for_scope |
    function_call SEMICOLON |
    pattern_call SEMICOLON |
    return_line)+;

for_scope:
    LOOP DO (loop_body | next | break)* END |
    FOR IDENTIFIER IN for_range (loop_body | next | break)* END;

for_range:
    IDENTIFIER |
    list_val |
    LPAR value DDOT value RPAR;

next:
    NEXT SEMICOLON |
    NEXT IF logical_expression SEMICOLON;

break:
    BREAK SEMICOLON |
    BREAK IF logical_expression SEMICOLON;

return_line:
    RETURN (init | expression) SEMICOLON;

pattern:
    PATTERN IDENTIFIER LPAR function_args RPAR
    (INDLINE logical_expression ASSIGN expression)* SEMICOLON;

pattern_call:
    IDENTIFIER DOT MATCH LPAR (expression (COMMA expression)*)? RPAR;

//LEXER

 //keywords

 FLOAT_VAL: INT_VAL '.' DIGIT+;
 BOOL_VAL: TRUE | FALSE;

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

 //primitive functions

 PUSH: 'push';
 PUTS: 'puts';
 CHOP: 'chop';
 CHOMP: 'chomp';
 MAIN: 'main';
 LEN: 'len';

 //symbols

 UNDERSCORE: '_';
 LBRACE: '{';
 RBRACE: '}';
 COMMA: ',';
 COLON: ':';
 SEMICOLON: ';';
 ARROW: '->';
 QUOT: '"';
 DOT: '.';
 DDOT: '..';
 INDLINE: '\r    |' | '\n    |' | '\n\t|' | '\r\t|';

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

 IDENTIFIER: (LETTER|UNDERSCORE)(DIGIT|LETTER|UNDERSCORE)*;
 INT_VAL: ([1-9][0-9]* | [0]);
 STRING_VAL:   '"' ('\\' ["\\] | ~["\\\r\n])* '"';
 LETTER: [a-zA-Z];
 DIGIT: [0-9];

 //comments

 SLCOMMENT: '#' ~[\r\n]* -> skip;
 MLCOMMENT: '=begin' ~[=end]* '=end' -> skip;
 WS: [ \t\r\n]+ -> skip;