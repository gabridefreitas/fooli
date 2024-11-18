grammar FOOLI;

program
    : classDeclaration* mainFunction EOF
    ;

mainFunction
    : 'void' 'main' '(' ')' block
    ;

classDeclaration
    : '{' 'class' IDENTIFIER classBody '}'
    ;

classBody
    : fieldDeclaration* methodDeclaration* mainFunction?
    ;

classUsage
    : IDENTIFIER '.' IDENTIFIER ';'
    | IDENTIFIER '.' assignment
    | IDENTIFIER '.' methodExecution
    ;

fieldDeclaration
    : type IDENTIFIER ';'
    ;

methodDeclaration
    : type IDENTIFIER '(' parameters? ')' block
    ;

methodExecution
    : IDENTIFIER '(' parameters? ')' ';'
    ;

parameters
    : parameter (',' parameter)*
    ;

parameter
    : type? IDENTIFIER | INTEGER_LITERAL
    ;

type
    : 'int' | 'bool' | 'void' | IDENTIFIER
    ;

block
    : '{' statement* '}'
    ;

statement
    : ifStatement
    | returnStatement
    | assignment
    | expressionStatement
    | whileStatement
    | methodExecution
    | fieldDeclaration
    | classUsage
    ;

ifStatement
    : 'if' '(' expression ')' block ('else' block)?
    ;

returnStatement
    : 'return' expression? ';'
    ;

assignment
    : IDENTIFIER '=' expression ';'
    ;

expressionStatement
    : expression ';'
    ;

whileStatement
    : 'while' '(' expression ')' block
    ;

expression
    : logicalOrExpression
    | methodExecution
    ;

logicalOrExpression
    : logicalOrExpression '||' logicalAndExpression
    | logicalAndExpression
    ;

logicalAndExpression
    : logicalAndExpression '&&' equalityExpression
    | equalityExpression
    ;

equalityExpression
    : equalityExpression '==' relationalExpression
    | relationalExpression
    ;

relationalExpression
    : relationalExpression ('<' | '>') additiveExpression
    | additiveExpression
    ;

additiveExpression
    : additiveExpression '+' multiplicativeExpression
    | multiplicativeExpression
    ;

multiplicativeExpression
    : multiplicativeExpression '*' primary
    | primary
    ;

primary
    : '(' expression ')'
    | IDENTIFIER
    | INTEGER_LITERAL
    | 'True'
    | 'False'
    ;

IDENTIFIER: [a-zA-Z_] [a-zA-Z_0-9]* ;

INTEGER_LITERAL: [0-9]+ ;

WS: [ \t\r\n]+ -> skip ;

LINE_COMMENT: '//' ~[\r\n]* -> skip ;
BLOCK_COMMENT: '/*' .*? '*/' -> skip ;
