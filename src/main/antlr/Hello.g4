grammar Hello;

method : classifier? methodDeclaration METHOD_START body METHOD_END;
LB : '(' ;
RB : ')' ;
classifier : 'public'
          | 'protected'
          | 'private' ;
methodDeclaration : returnType methodName LB args RB;
body :
     | body statement
     | body variableDeclaration
     | body returnDeclaration
     | ;

statement : ID LB stringLiteral RB ';'
          | ID'.'statement;

variableDeclaration : type ID '=' value ';';

returnDeclaration : 'return' expr ';'
                  | 'return' ID ';';
expr : stringLiteral
     | ;

stringLiteral : QUOTE literal QUOTE ;

literal : ID
        | ID  literal;

args : arg
     | arg ',' args
     | ;
arg : type ID
    | stringLiteral
    | ;
value : ID
      | NUMBER
      | stringLiteral;

returnType : type
           | 'void';
methodName : ID;
type : ID
     | 'int'
     | 'double';
NUMBER : [0-9]+;
METHOD_START : '{' ;
METHOD_END : '}' ;
QUOTE : '"' ;
ID : [a-zA-Z]+ ;
WS : [ \t\n\r] -> skip ;