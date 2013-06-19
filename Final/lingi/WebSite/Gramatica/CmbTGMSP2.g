tree grammar CmbTGMSP2;

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
	private boolean corpoFuncao = false;
	
	private ArrayList<String> instrucoes = new ArrayList<String>();
	private ArrayList<String> declaracoes = new ArrayList<String>();
		
	void regCode(String codeStr){
		instrucoes.add(codeStr);
	}
	
	void regDecl(String decl){
		declaracoes.add(decl);
	}
		
}

programa returns [ArrayList<String> msp_declaracoes, ArrayList<String> msp_instrucoes]
	: 	^(PROGRAMA (funcao)+
	{
		$programa.msp_declaracoes = declaracoes;
		$programa.msp_instrucoes = instrucoes;	
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
	: ^(CORPO {corpoFuncao = true;} declaracoes statements {corpoFuncao = false;} );

declaracoes
	: ^(DECLARACOES declaracao+)
	;
	
declaracao
	:	^(DECLARACAO tipo ID {if(corpoFuncao) regDecl("Decl \"" + $ID.text + "\" " + i++ + " 1");})
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
	: ^(RETURN expr)
	;

invocacao 
	: ^(INVOCACAO ID args?)
	;

args
	: ^(ARGS (expr)+)
	;

atribuicao 
	: ^('=' ID {regCode("Pusha \"" + $ID.text +"\"") ;} expr {regCode("Store");})
	;

write 	: ^(WRITE expr {regCode("IOut");})
	;
	
read 	: ^(READ ID {regCode("Pusha \"" + $ID.text + "\",IIn,Store");})
	;
	
	
ifs 	: ^(IF  
		expr {regCode("Jumpf \"senao"+ $IF.line +"\"");} 
		a=bloco {regCode("Jump \"fse"+ $IF.line +"\""); regCode("ALabel \"senao"+$IF.line+"\" ");}
		(b=bloco)? {regCode("ALabel \"fse"+$IF.line+"\""); }  )
	;
	
whiles 	: ^(WHILE {regCode("enq"+ $WHILE.line+ ": ");} 
	expr {regCode("JMPF fenq"+ $WHILE.line);} 
	bloco {regCode("fenq"+$WHILE.line+": ");})
	;

bloco 	: statements
	;
	
expr returns [String instrucao]
	:	^('||' a=expr b=expr) 	{regCode("Or"); $expr.instrucao = $a.instrucao + "||" 	+ $b.instrucao;}
	|	^('&&' a=expr b=expr) 	{regCode("And"); $expr.instrucao = $a.instrucao + "&&" 	+ $b.instrucao;}
	|	^('+' a=expr b=expr) 	{$expr.instrucao = $a.instrucao + "+" 	+ $b.instrucao;}
	|	^('-' a=expr b=expr) 	{$expr.instrucao = $a.instrucao + "-" 	+ $b.instrucao;}
	|	^('*' a=expr b=expr) 	{regCode("Mul"); $expr.instrucao = $a.instrucao + "*" 	+ $b.instrucao;}
	|	^('/' a=expr b=expr) 	{regCode("Div");$expr.instrucao = $a.instrucao + "/" 	+ $b.instrucao;}
	|	^(\'%' a=expr b=expr) 	{regCode("Mod"); $expr.instrucao = $a.instrucao + "\%" 	+ $b.instrucao;}
	|	^('>' a=expr b=expr) 	{regCode("Gt"); $expr.instrucao = $a.instrucao + ">" 	+ $b.instrucao;}
	|	^('<' a=expr b=expr) 	{regCode("Lt"); $expr.instrucao = $a.instrucao + "<" 	+ $b.instrucao;}
	|	^('>=' a=expr b=expr) 	{regCode("Ge"); $expr.instrucao = $a.instrucao + ">=" 	+ $b.instrucao;}
	| 	^('<=' a=expr b=expr) 	{regCode("Le"); $expr.instrucao = $a.instrucao + "<=" 	+ $b.instrucao;}
	|	^('==' a=expr b=expr) 	{regCode("Eq"); $expr.instrucao = $a.instrucao + "==" 	+ $b.instrucao;}
	|	^('!=' a=expr b=expr) 	{regCode("Ne"); $expr.instrucao = $a.instrucao + "!=" 	+ $b.instrucao;}
	|	^('!' a=expr) 			{$expr.instrucao = "!" + $a.instrucao;}
	|	factor 					{$expr.instrucao = $factor.instrucao;}
	;
	
factor returns [String instrucao]
	: ID 		{regCode("Pusha \"" + $ID.text + "\",Load"); $factor.instrucao = $ID.text;}
	| constante	{System.out.println("PUSH " + $constante.text); $factor.instrucao = $constante.valor;}
	| invocacao
	;
	
constante returns [String valor]
	:	STRING	{$constante.valor = $STRING.text;}
	|	INT	{$constante.valor = $INT.text;}
	|	TRUE	{$constante.valor = $TRUE.text;}
	|	FALSE	{$constante.valor = $FALSE.text;}
	;
	