grammar FunctionCraft;

//PARSER

program:
    (function | pattern)*
    { System.out.println("MAIN"); }
    main;

function:
    DEF name=IDENTIFIER { System.out.println("FuncDec: " + $name.text); }
    LPAR function_args RPAR
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
    LBRACK optional_arg (COMMA optional_arg)* RBRACK;

optional_arg:
    IDENTIFIER ASSIGN expression;

init:
    (
    (name=IDENTIFIER (LBRACK expression RBRACK)+ |
    name=IDENTIFIER) { System.out.println("Assignment: " + $name.text); })
    ASSIGN expression;

expression:
    (
    append_line |
    LPAR expression RPAR |
    value
    ) expr_prim;

expr_prim:
    ((bool_operator | arithmatic_operator) expression expr_prim) | ;

append_line:
    (IDENTIFIER | list_val | STRING_VAL | value_from_list) APPEND { System.out.println("Operator: " + "<<"); }
    ((IDENTIFIER | list_val | STRING_VAL | expression | value_from_list) APPEND { System.out.println("Operator: " + "<<"); })*
    (IDENTIFIER | list_val | STRING_VAL | expression | value_from_list);

bool_operator:
    name=(
    EQL |
    NEQL |
    LEQ |
    GEQ |
    LES |
    GRT)
    { System.out.println("Operator: " + $name.text); }
    ;

arithmatic_operator:
    name=(PLUS |
    MINUS |
    MULT |
    DIV)
    { System.out.println("Operator: " + $name.text); };

value_from_list:
    (list_val | function_call | IDENTIFIER) (LBRACK expression RBRACK)+;

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
    MINUS value |
    NOT if_condition |
    IDENTIFIER |
    LPAR value RPAR |
    value INC |
    value DEC;

list_val:
   LBRACK (expression) (COMMA expression)* RBRACK |
   LBRACK RBRACK;

if_condition:
    LPAR(
    expression |
    NOT LPAR expression RPAR |
    expression bool_operator expression |
    if_condition OR if_condition |
    if_condition AND if_condition)
    RPAR;

fptr_val:
    METHOD LPAR COLON IDENTIFIER RPAR |
    { System.out.println("Structure: LAMBDA"); }
    ARROW LPAR function_args RPAR LBRACE function_body RBRACE;

primitive_function:
    name=(PUSH |
    PUTS |
    CHOP |
    CHOMP |
    LEN)
    { System.out.println("Built-In: " + $name.text.toUpperCase()); }
    ;

function_call:
    (primitive_function) LPAR (expression (COMMA expression)*)? RPAR |
    { System.out.println("Function Call"); } (IDENTIFIER | fptr_val) LPAR (expression (COMMA expression)*)? RPAR;

function_body:
    (init SEMICOLON |
    if_scope |
    for_scope |
    function_call SEMICOLON |
    pattern_call SEMICOLON |
    expression SEMICOLON |
    return_line)*;

if_scope:
    { System.out.println("Decision: IF"); }
    IF if_condition function_body (elseif_scope)* (else_scope)? END;

elseif_scope:
    { System.out.println("Decision: ELSE IF"); }
    ELSEIF if_condition function_body;

else_scope:
    { System.out.println("Decision: ELSE"); }
    ELSE function_body;

loop_body:
    (init SEMICOLON |
    if_scope |
    for_scope |
    function_call SEMICOLON |
    pattern_call SEMICOLON |
    return_line)+;

for_scope:
    { System.out.println("Loop: DO"); }
    LOOP DO (loop_body | next | break)* END |
    { System.out.println("Loop: FOR"); }
    FOR IDENTIFIER IN for_range (loop_body | next | break)* END;

for_range:
    IDENTIFIER |
    list_val |
    LPAR value DDOT value RPAR;

next:
    { System.out.println("Control: NEXT"); }
    (NEXT SEMICOLON |
    NEXT IF if_condition SEMICOLON);

break:
    { System.out.println("Control: BREAK"); }
    (BREAK SEMICOLON |
    BREAK IF if_condition SEMICOLON);

return_line:
    { System.out.println("RETURN"); }
    RETURN (init | expression) SEMICOLON;

pattern:
    PATTERN name=IDENTIFIER { System.out.println("PatternDec: " + $name.text); }
    LPAR function_args RPAR
    (INDLINE if_condition ASSIGN expression)* SEMICOLON;

pattern_call:
    IDENTIFIER DOT MATCH { System.out.println("Built-In: MATCH"); } LPAR (expression (COMMA expression)*)? RPAR;

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
 INDLINE: '\r\n    |' | '\n    |' | '\n\t|' | '\r\n\t|';

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