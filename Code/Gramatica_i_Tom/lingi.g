grammar lingi;
options {
  output=AST;
  ASTLabelType=Tree;
  tokenVocab=RuleTokens;
  k=2;
}

@header { package parser; }
@lexer::header { package parser; }

programa: funcao*			-> ^(Programa Funcao*)
		;

funcao	:	c1=cabecalho '{' c2=corpo_funcao '}'
							-> ^(Funcao $c1 $c2)
		;

cabecalho
		:	tipo ID '(' a1=argumentos? ')'
							-> {a1==null}? ^(Cabecalho1 tipo ID)
							-> ^(Cabecalho2 tipo ID argumentos?)
		;

argumentos
		:	declaracao (',' declaracao)*
							-> ^(Argumentos declaracao+)
		;	

corpo_funcao
		:	(declaracoes)? statements
							-> {declaracoes == null} ^(Corpo_Funcao statements)
							-> ^(Corpo_Funcao declaracoes statements)
		;

declaracoes
		:	(declaracao ('=' expr)? ';')+	
							-> ^(declaracao expr?)
		;

declaracao
		:	tipo ID			-> ^(Declaracao tipo ID)
		;

statements
		:	statement*		-> ^(Statement statement*)
		;
	
statement
		:	atribuicao ';'	-> ^(StatementAtribuicao atribuicao)
		|	ifs				-> ^(StatementIfs ifs)
		|	whiles			-> ^(StatementWhiles whiles)
		|	fors			-> ^(StatementFors fors)
		|	invocacao ';'	-> ^(StatementInvocacao invocacao)
		|	retorna ';'		-> ^(StatementRetorna retorna)
		;

atribuicao
		:	ID '=' expr		-> ^(Atribuicao ID expr)
		;

ifs		:	IF '(' expr ')' bloco (ELSE bloco)? //ver como fazer este
		;

whiles	:	WHILE '(' expr ')' bloco
							-> ^(Whiles exr bloco)
		;

fors	:	FOR '(' forsexpr ';' expr ';' forsexpr ')' bloco
							-> ^(Fors forexpr expr forexpr bloco)
		;

forsexpr: expr				-> ^(ForExprExpr expr)
		| atribuicao		-> ^(ForExprAtribuicao atribuicao)
		;
	
invocacao
		:	ID '(' args ')'	-> ^(Invocacao args)
		;

retorna	:	RETURN expr		-> ^(Retorna expr)
		;
	
bloco	:	'{' statements '}' -> ^(BlocoMore statements)
		|	statement		->  ^(BlocoOne statement)
		;

args	:	e1=expr a1=argsAux*	-> {a1==null} ^(Args1 e1)
							-> ^(Args2 e1 a1*)
		;
argsAux : ',' expr 			-> ^(ArgsAux expr)
		;
		
expr	:	orExpr			-> ^(Expr orExpr)
		;

orExpr	:	andExpr orExprAux*
							-> {orExprAux==null} ^(OrExpr1 andExpr)
							-> ^(OrExpr2 andExpr orExprAux*)
		;
	
orExprAux:	opOr andExpr	-> ^(OrExprAux andExpr)
		;

andExpr	:	equalExpr (andExprAux)*
							-> {andExprAux == null} ^(AndExpr1 equalExpr)
							-> ^(AndExpr2 equalExpr andExprAux*)
		;		

andExprAux: opAnd equalExpr	-> ^(AndExprAux equalExpr)
		;

equalExpr
		:	addExpr (equalExprAux)*
							-> {equalExprAux==null} ^(EqualExpr1 addExpr)
							-> ^(EqualExpr2 addExpr equalExprAux*)
		;
		
equalExprAux: opRel addExpr	-> ^(EqualExprAux addExpr)
		;
	
addExpr	:	multExpr (addExprAux)*
							-> {addExprAux == null} ^(AddExpr1 multExpr)
							-> ^(AddExpr2 multExpr AddExprAux*)
		;
	
addExprAux: opAdd multExpr 	-> ^(AddExprAux multExpr)
		;

multExpr:	notExpr (multExprAux)*
							-> {multExprAux==null} ^(MultExpr1 notExpr)
							-> ^(MultExpr2 notExpr multExprAux*)
		;

multExprAux: opMul notExpr	-> ^(MultExprAux notExpr)
		;
	
notExpr	:	(opNot)? negationExpr
							-> ^(NotExpr negationExpr)
		;
	
negationExpr
		:	('-')? fator	-> ^(NegationExpr fator)
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

fator	:	ID				-> ^(Fator1 ID)
	|	constante			-> ^(Fator2 constante)
	|	invocacao			-> ^(Fator3 invocacao)
	;

constante
	:	STRING				-> ^(ConstanteString STRING)
	|	CHAR				-> ^(ConstanteChar CHAR)
	|	INT					-> ^(ConstanteInt INT)
	|	TRUE				-> ^(ConstanteBool TRUE)
	|	FALSE				-> ^(ConstanteBool FALSE)
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
