tree grammar CmbTGMSP;

options{
	tokenVocab=Cmb;
	ASTLabelType = CommonTree;
	output = AST;
	backtrack = true;
}

@header{
	import java.util.ArrayList;
}

@members{
	private int i = 0;
	
	private ArrayList<String> code = new ArrayList<String>();
	private ArrayList<String> lines = new ArrayList<String>();
	
	void regLine(Integer line){
		lines.add("PSHA line\nPUSH " + line + "\nSTORE");
		lines.add("PSHA line\nLOAD\nOUT");
	}
	
	void regCode(String codeStr){
		code.add(codeStr);
		lines.add(codeStr);
	}
		
}

programa returns [ArrayList<String> msp_code, ArrayList<String> msp_lines]
	: 	^(PROGRAMA (funcao)+
	{
		$programa.msp_code = code;
		$programa.msp_lines = lines;	
	}
	)
	;

funcao
	:  ^(FUNCAO cabecalho corpo_funcao)
	;
	
cabecalho
	:  ^(CAEBECALHO tipo ID argumentos?);

argumentos
	:  ^(ARGUMENTOS declaracao+)
	;

corpo_funcao
	: ^(CORPO declaracoes {regCode("CODIGO");} statements {regCode("Fim: HALT");} );

declaracoes
	: ^(DECLARACOES {regCode("MEMORIA DE DADOS");} declaracao+)
	;
	
declaracao
	:	^(DECLARACAO tipo ID {regCode($ID.text + " " + i++ + " TAM 1");})
	;
	
tipo
	:	TD_INT		
	|	TD_BOOL	
	|	TD_STRING
	|	TD_VAZIO
	;
	
statements 
	:	 ^(STATEMENTS (statement)+)
	;
	

statement 
	:	atribuicao
	|	read
	|	write
	|	ifs
	|	whiles
	|	invocacao
	|	retorna
	;
	
retorna 
	: ^(RETURN expr {regLine($RETURN.line);})
	;

invocacao 
	: ^(INVOCACAO ID args? {regLine($ID.line);})
	;

args
	: ^(ARGS (expr)+)
	;

atribuicao 
	: ^('=' ID {regCode("PSHA " + $ID.text);} expr {regCode("STORE"); regLine($ID.line);})
	;

write 	: ^(WRITE expr {regCode("PSHA " + $expr.instrucao + "\nLOAD\nOUT"); regLine($WRITE.line);})
	;
	
read 	: ^(READ ID {regCode("PSHA " + $ID.text + "\nIN\nSTORE"); regLine($READ.line);})
	;
	
	
ifs 	: ^(IF {regLine($IF.line);} 
		expr {regCode("JMPF senao"+ $IF.line);} 
		a=bloco {regCode("JMP fse"+ $IF.line); regCode("senao"+$IF.line+": ");}
		(b=bloco)? {regCode("fse"+$IF.line+": "); }  )
	;
	
whiles 	: ^(WHILE {regCode("enq"+ $WHILE.line+ ": "); regLine($WHILE.line);} 
	expr {regCode("JMPF fenq"+ $WHILE.line);} 
	bloco {regCode("fenq"+$WHILE.line+": ");})
	;

bloco 	: statements
	;
	
expr returns [String instrucao]
	:	^('||' a=expr b=expr) 	{regCode("OR"); $expr.instrucao = $a.instrucao + "||" 	+ $b.instrucao;}
	|	^('&&' a=expr b=expr) 	{regCode("AND"); $expr.instrucao = $a.instrucao + "&&" 	+ $b.instrucao;}
	|	^('+' a=expr b=expr) 	{$expr.instrucao = $a.instrucao + "+" 	+ $b.instrucao;}
	|	^('-' a=expr b=expr) 	{$expr.instrucao = $a.instrucao + "-" 	+ $b.instrucao;}
	|	^('*' a=expr b=expr) 	{regCode("MUL"); $expr.instrucao = $a.instrucao + "*" 	+ $b.instrucao;}
	|	^('/' a=expr b=expr) 	{regCode("DIV");$expr.instrucao = $a.instrucao + "/" 	+ $b.instrucao;}
	|	^(\'%' a=expr b=expr) 	{regCode("MOD"); $expr.instrucao = $a.instrucao + "\%" 	+ $b.instrucao;}
	|	^('>' a=expr b=expr) 	{regCode("GT"); $expr.instrucao = $a.instrucao + ">" 	+ $b.instrucao;}
	|	^('<' a=expr b=expr) 	{regCode("LT"); $expr.instrucao = $a.instrucao + "<" 	+ $b.instrucao;}
	|	^('>=' a=expr b=expr) 	{regCode("GE"); $expr.instrucao = $a.instrucao + ">=" 	+ $b.instrucao;}
	| 	^('<=' a=expr b=expr) 	{regCode("LE"); $expr.instrucao = $a.instrucao + "<=" 	+ $b.instrucao;}
	|	^('==' a=expr b=expr) 	{regCode("EQ"); $expr.instrucao = $a.instrucao + "==" 	+ $b.instrucao;}
	|	^('!=' a=expr b=expr) 	{regCode("NE"); $expr.instrucao = $a.instrucao + "!=" 	+ $b.instrucao;}
	|	^('!' a=expr) 			{$expr.instrucao = "!" + $a.instrucao;}
	|	factor 					{$expr.instrucao = $factor.instrucao;}
	;
	
factor returns [String instrucao]
	: ID 		{regCode("PSHA " + $ID.text + "\nLOAD"); $factor.instrucao = $ID.text;}
	| constante	{System.out.println("PUSH " + $constante.text); $factor.instrucao = $constante.valor;}
	| invocacao
	;
	
constante returns [String valor]
	:	STRING	{$constante.valor = $STRING.text;}
	|	INT	{$constante.valor = $INT.text;}
	|	TRUE	{$constante.valor = $TRUE.text;}
	|	FALSE	{$constante.valor = $FALSE.text;}
	;
	