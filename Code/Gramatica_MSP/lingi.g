grammar lingi;

@members{
	private int i = 0;
	private int fse = 0;
	private int senao = 0;
	private int enq = 0;
	private int fenq = 0;
}

// GAMMAR
programa: 
	funcao*
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
	:	(declaracoes)? {System.out.println("CODIGO");}  statements {System.out.println("HALT");}
	;

declaracoes
	:	{System.out.println("MEMORIA DE DADOS");} declaracaoExpr+
	;

declaracaoExpr
	:	declaracao /*('=' expr)? depois tentar adicionar aqui as expressoes no MSP */ ';'
	;

declaracao
	:	tipo ID	{System.out.println($ID.text + " " + i++ + " TAM 1");}
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
	|	ler ';'
	|	escrever ';'
	;

ler	:	LER '(' ID ')' 		{System.out.println("PSHA " + $ID.text + "\nIN\nSTORE");}
	;	
	
escrever:	ESCREVER '(' ID ')'	{System.out.println("PSHA " + $ID.text + "\nLOAD\nOUT");}
	;

atribuicao
	:	ID {System.out.println("PSHA " + $ID.text);} '=' expr {System.out.println("STORE");}
	;

ifs	:	IF '(' expr ')' {System.out.println("JMPF senao"+ ++senao);} bloco {System.out.println("JMP fse"+ ++fse);} ifsElse? {System.out.print("fse"+fse+": ");}
	;

ifsElse	:	ELSE  {System.out.print("senao"+senao+": ");} bloco
	;

whiles	:	WHILE {System.out.print("enq"+ ++enq + ": ");} '(' expr ')' {System.out.print("JMPF fenq"+ ++fenq);}  bloco {System.out.print("fenq"+fenq+": ");}
	;

fors	:	FOR '(' forsexpr ';' expr ';' forsexpr ')' bloco
	;

forsexpr: expr
	| atribuicao
	;

invocacao
	:	ID '(' args ')'
	;

retorna	:	RETURN expr
	;
	
bloco	:	'{' statements '}'
	|	statement
	;

args	:	expr argsAux*
	;

argsAux : 	',' expr
	;

expr	:	orExpr
	;

orExpr	:	andExpr orExprAux*	
	;

orExprAux:	opOr andExpr		{System.out.println("OR");}
	;

andExpr	:	equalExpr andExprAux*
	;

andExprAux: opAnd equalExpr		{System.out.println("AND");}
	;

equalExpr
	:	addExpr equalExprAux*	
	;
	
equalExprAux: opRel addExpr		{if($opRel.text.equals("==")) System.out.println("EQ");
					if($opRel.text.equals(">")) System.out.println("GT");
					if($opRel.text.equals(">=")) System.out.println("GE");
					if($opRel.text.equals("<")) System.out.println("LT");
					if($opRel.text.equals("<=")) System.out.println("LE");
					if($opRel.text.equals("!=")) System.out.println("NE");}
	;	
	
addExpr	:	multExpr addExprAux*
	;

addExprAux: opAdd multExpr
	;
	
multExpr:	notExpr multExprAux*
	;

multExprAux: opMul notExpr		{if($opMul.text.equals("/")) System.out.println("DIV");
					if($opMul.text.equals("*")) System.out.println("MUL");
					if($opMul.text.equals("\%")) System.out.println("MOD");}
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

fator	:	ID		{System.out.println("PSHA " + $ID.text + "\nLOAD");}
	|	constante	{System.out.println("PUSH " + $constante.text);}
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
LER	:	'ler';
ESCREVER:	'escrever';

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
