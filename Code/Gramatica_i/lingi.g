grammar lingi;

// GAMMAR
programa: funcao+
	;

funcao	:	cabecalho '{' corpo_funcao+ '}'
	;

cabecalho
	:	tipo ID '(' argumentos? ')'
	;

argumentos
	:	declaracao (',' declaracao)*
	;	

corpo_funcao
	:	(declaracoes)? statements
	;

declaracoes
	:	(declaracao ('=' expr)? ';')+
	;

declaracao
	:	tipo ID
	;

statements
	:	statement+
	;
	
statement
	:	atribuicao ';'
	|	ifs
	|	whiles
	|	fors
	|	invocacao ';'
	|	retorna ';'
	;

atribuicao
	:	ID '=' expr
	;

ifs	:	IF '(' expr ')' bloco (ELSE bloco)?
	;

whiles	:	WHILE '(' expr ')' bloco
	;

fors	:	FOR '(' (expr|atribuicao) ';' expr ';' (expr|atribuicao) ')' bloco
	;

invocacao
	:	ID '(' args ')'
	;

retorna	:	RETURN expr
	;
	
bloco	:	'{' statements '}'
	|	statement
	;


args	:	expr (',' expr )*
	;
	
expr	:	orExpr
	;

orExpr	:	andExpr (opOr andExpr )*
	;

andExpr	:	equalExpr(opAnd equalExpr)*
	;

equalExpr
	:	addExpr(opRel addExpr)*
	;
	
addExpr	:	multExpr(opAdd multExpr)*
	;
	
multExpr:	notExpr(opMul notExpr)*
	;
	
notExpr	:	(opNot)? negationExpr
	;
	
negationExpr
	:	('-')? fator
	;

opAdd	:	'+'
	|	'-'
	;

opMul	:	'*'
	|	'/'
	|	\'%'
	;

opOr	:	'||'
	;

opAnd	:	'&&'
	;

opRel	:	'>'
	|	'<'
	|	'>='
	|	'<='
	|	'=='
	|	'!='
	;

opNot	:	'!'
	;

fator	:	ID
	|	constante
	|	invocacao
	;

constante
	:	STRING
	|	CHAR
	|	INT
	|	TRUE
	|	FALSE
	;

tipo	:	TD_INT
	|	TD_BOOL
	|	TD_STRING
	|	TD_CHAR
	|	TD_FLOAT
	|	TD_VOID
	;
// LEXER
TD_INT	:	'int';
TD_BOOL	:	'bool';
TD_STRING:	'string';
TD_CHAR	:	'char';
TD_FLOAT:	'float';
TD_VOID	:	'void';
TRUE	:	'true';
FALSE	:	'false';

RETURN	:	'return';
IF	:	'if';
ELSE	:	'else';
WHILE	:	'while';
FOR	:	'for';

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
