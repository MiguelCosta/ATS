grammar lingi;

options{
	language=Java;
}

@header{
	import java.util.GregorianCalendar;
	import java.util.Calendar;
}

@members{
	private int i = 0;
	
	private boolean teste = false;
	private boolean inject = false;
	
	void declLine(){
		if(teste){
			System.out.println("line " + i++ + " TAM 1");
		}
	}
	
	void regLine(Integer line){
		if(teste){
			System.out.println("PSHA line\nPUSH " + line + "\nSTORE");
			System.out.println("PSHA line\nLOAD\nOUT");
		}
	}
	
	void injectMaior(){
		GregorianCalendar data = new GregorianCalendar();
		if(data.get(Calendar.HOUR_OF_DAY) \% 2 != 0 && inject){
			System.out.println("GT");
		}else{
			System.out.println("GE");
		}
	
	}
	
}

// GAMMAR



programa
@after{
	//System.out.println("\n***************\nLinhas: ");
	//for (Integer l : linhas) System.out.println(l + ";");
}	: 
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
	:	(declaracoes)? {System.out.println("CODIGO");}  statements {System.out.println("Fim: HALT");}
	;

declaracoes
	:	{System.out.println("MEMORIA DE DADOS"); declLine();} declaracaoExpr+
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

ler	:	LER '(' ID ')' 		{System.out.println("PSHA " + $ID.text + "\nIN\nSTORE"); regLine($LER.line);}
	;	
	
escrever:	ESCREVER '(' ID ')'	{System.out.println("PSHA " + $ID.text + "\nLOAD\nOUT"); regLine($ESCREVER.line);}
	;

atribuicao
	:	ID {System.out.println("PSHA " + $ID.text);} '=' expr {System.out.println("STORE"); regLine($ID.line);}
	;

ifs	:	IF {regLine($IF.line);} '(' expr ')' {System.out.println("JMPF senao"+ $IF.line);} 
		bloco {System.out.println("JMP fse"+ $IF.line); System.out.print("senao"+$IF.line+": ");} 
		ifsElse? {System.out.print("fse"+$IF.line+": "); } 
	;

ifsElse	:	ELSE  { regLine($ELSE.line);} bloco
	;

whiles	:	WHILE {System.out.print("enq"+ $WHILE.line+ ": "); regLine($WHILE.line);} '(' expr ')' {System.out.print("JMPF fenq"+ $WHILE.line);}  bloco {System.out.print("fenq"+$WHILE.line+": ");}
	;

fors	:	FOR '(' forsexpr ';' expr ';' forsexpr ')' bloco
	;

forsexpr: expr
	| atribuicao
	;

invocacao
	:	ID '(' args ')' {regLine($ID.line);}
	;

retorna	:	RETURN expr {regLine($RETURN.line);}
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
					if($opRel.text.equals(">")) injectMaior(); /*System.out.println("GT");*/
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

multExprAux: opMul notExpr		{if($opMul.text.equals("/")) System.out.println("DIV"); //trocar a divisao por multiplicacao
					if($opMul.text.equals("*")) System.out.println("MUL");	// trocar a divisao por multiplicacao
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
