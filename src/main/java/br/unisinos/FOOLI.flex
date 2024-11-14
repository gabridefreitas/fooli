%%
%class FoolLexer
%unicode
%public
%integer
%standalone

DIGIT = [0-9]
LETTER = [a-zA-Z]
IDENTIFIER = {LETTER}({LETTER}|{DIGIT}|_)*

%%
"class"                     { return new Symbol(sym.CLASS_KEYWORD); }
"void"                      { return new Symbol(sym.VOID_TYPE); }
"int"                       { return new Symbol(sym.INT_TYPE); }
"bool"                      { return new Symbol(sym.BOOL_TYPE); }
"if"                        { return new Symbol(sym.IF_KEYWORD); }
"else"                      { return new Symbol(sym.ELSE_KEYWORD); }
"return"                    { return new Symbol(sym.RETURN_KEYWORD); }
"True"                      { return new Symbol(sym.TRUE_LITERAL); }
"False"                     { return new Symbol(sym.FALSE_LITERAL); }
"not"                       { return new Symbol(sym.NOT_OPERATOR); }
"and"                       { return new Symbol(sym.AND_OPERATOR); }
"or"                        { return new Symbol(sym.OR_OPERATOR); }

"while"                     { return new Symbol(sym.WHILE_KEYWORD); }
"main"                      { return new Symbol(sym.MAIN_FUNCTION); }

"=="                        { return new Symbol(sym.EQUALITY_OPERATOR); }
"<"                         { return new Symbol(sym.LESS_THAN_OPERATOR); }
">"                         { return new Symbol(sym.GREATER_THAN_OPERATOR); }
"+"                         { return new Symbol(sym.PLUS_OPERATOR); }
"*"                         { return new Symbol(sym.MULTIPLY_OPERATOR); }
"="                         { return new Symbol(sym.ASSIGNMENT_OPERATOR); }

"("                         { return new Symbol(sym.LEFT_PARENTHESIS); }
")"                         { return new Symbol(sym.RIGHT_PARENTHESIS); }
"{"                         { return new Symbol(sym.LEFT_BRACE); }
"}"                         { return new Symbol(sym.RIGHT_BRACE); }
";"                         { return new Symbol(sym.SEMICOLON); }
","                         { return new Symbol(sym.COMMA); }

{IDENTIFIER}                { return new Symbol(sym.IDENTIFIER, yytext()); }

{DIGIT}+                    { return new Symbol(sym.INTEGER_LITERAL, Integer.parseInt(yytext())); }

\s+                         { /* Ignora espaços em branco */ }
.                           { /* Ignora outros caracteres */ }

"//".*                      { /* Ignora comentários de linha única */ }
"/*"([^*]|[*][^/])*"*/"     { /* Ignora blocos de comentários */ }
