grammar FOOLI;

@header {
    import java.util.Map;
    import java.util.HashMap;
    import java.util.List;
    import java.util.ArrayList;
}

@members {
    Map<String, String> symbolTable = new HashMap<>();
    List<String> tacList = new ArrayList<>();
}

program
    : classDeclaration* mainFunction EOF
    ;

mainFunction
    : 'void' 'main' '(' ')' block
    ;

classDeclaration
    : '{' 'class' IDENTIFIER classBody '}'
      { symbolTable.put($IDENTIFIER.getText(), "class"); }
    ;

classBody
    : fieldDeclaration* methodDeclaration* mainFunction?
    ;

classUsage
    : IDENTIFIER '.' IDENTIFIER ';'
      { tacList.add($IDENTIFIER(0).getText() + "." + $IDENTIFIER(1).getText() + ";"); }
    | IDENTIFIER '.' assignment
    | IDENTIFIER '.' methodExecution
    ;

fieldDeclaration
    : type IDENTIFIER ';'
      { symbolTable.put($IDENTIFIER.getText(), $type.value); }
    ;

methodDeclaration
    : type IDENTIFIER '(' parameters? ')' block
      { symbolTable.put($IDENTIFIER.getText(), "method: " + $type.value); }
    ;

methodExecution
    : IDENTIFIER '(' parameters? ')' ';'
      { tacList.add("CALL " + $IDENTIFIER.getText() + " " + ($parameters.text != "" ? $parameters.text : "")); }
    ;

parameters
    : parameter (',' parameter)*
    ;

parameter
    : type IDENTIFIER
      { symbolTable.put($IDENTIFIER.getText(), $type.value); }
    | INTEGER_LITERAL
    ;

type returns [String value]
    : 'int'     { $value = "int"; }
    | 'bool'    { $value = "bool"; }
    | 'void'    { $value = "void"; }
    | IDENTIFIER { $value = $IDENTIFIER.getText(); }
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
      { tacList.add("IF " + ($expression.text != null ? $expression.text : "unknown") + " THEN ..."); }
    ;

returnStatement
    : 'return' expression? ';'
      { tacList.add("RETURN " + ($expression.text != "" ? $expression.text : "void")); }
    ;

assignment
    : IDENTIFIER '=' expression ';'
      { tacList.add($IDENTIFIER.getText() + " = " + ($expression.text != null ? $expression.text : "unknown") + ";"); }
    ;

expressionStatement
    : expression ';'
    ;

whileStatement
    : 'while' '(' expression ')' block
      { tacList.add("WHILE " + ($expression.text != null ? $expression.text : "unknown") + " DO ..."); }
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
