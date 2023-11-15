grammar SimpleLang;

prog: dec+ EOF;

dec: typed_idfr LParen (vardec)? RParen body;

vardec: (typed_idfr(Comma typed_idfr)*);

typed_idfr: type Idfr;

type: IntType | BoolType | UnitType;

body: LBrace (typed_idfr Assign exp Semicolon)* ene RBrace;

block: LBrace ene (Semicolon ene)* RBrace;

ene: exp (Semicolon exp)*;

exp: Idfr Assign exp                                       #AssignExpr
    | LParen exp binop exp RParen                           #BinOpExpr
    | Idfr LParen (args (Comma args)*)? RParen              #InvokeExpr
    | block                                                 #BlockExpr
    | If exp Then block Else block                          #IfExpr
    | While exp Do block                                    #WhileExpr
    | Repeat block Until exp                                #RepeatExpr
    | Print exp                                             #PrintExpr
    | Space                                                 #SpaceExpr
    | Idfr                                                  #IdExpr
    | IntLit                                                #IntExprb
    | BoolLit                                               #BoolLitExpr
    | NewLine                                               #NewlineExpr
    | Skip                                                  #SkipExpr
    | LParen exp RParen                                     #ParenExpr
    | Minus exp                                             #NegateExpr
    | exp binop exp                                         #TimeExpr
;

args: (exp (Comma exp)*)?;

binop:
      Power
    | Times | Divide
    | Plus | Minus
    | Eq | Less | LessEq | Greater | GreaterEq
    | And | Or
    ;

LParen : '(' ;
Comma : ',' ;
RParen : ')' ;
LBrace : '{' ;
Semicolon : ';' ;
RBrace : '}' ;

Eq : '==' ;
Less : '<' ;
LessEq : '<=' ;
Greater : '>';
GreaterEq : '>=';
Divide : '/';
And : '&';
Or : '|';
Power : '^';

Plus : '+' ;
Times : '*' ;
Minus : '-' ;

Assign : ':=' ;

Print : 'print' ;
Space : 'space' ;
NewLine : 'newline' ;
Skip : 'skip';
If : 'if' ;
Then : 'then' ;
Else : 'else' ;
While : 'while';
Repeat : 'repeat';
Do : 'do';
Until : 'until';

IntType : 'int' ;
BoolType : 'bool' ;
UnitType : 'unit' ;

BoolLit : 'true' | 'false' ;
IntLit : '0' | ('-'? [1-9][0-9]*) ;
Idfr : [a-z][A-Za-z0-9_]* ;
WS : [ \n\r\t]+ -> skip ;