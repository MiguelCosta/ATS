tree grammar CmbTGME;

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
	private boolean corpoFuncao = false;
	private Metrica me = new Metrica();
	private FuncaoInfo fTmp = new FuncaoInfo();
	private ArrayList<String> funcoes = new ArrayList<String>();
		
}

programa returns [Metrica metrica]
	: 	^(PROGRAMA (funcao)+
	{
		$programa.metrica = me;
	}
	)
	;

funcao
@init{
	fTmp = new FuncaoInfo();
}
@after{
	me.putFuncao(fTmp);
}
	:  ^(FUNCAO {fTmp.setLinha($FUNCAO.line);} cabecalho corpo_funcao)
	;
	
cabecalho
	:  ^(CAEBECALHO tipo ID {fTmp.setNome($ID.text);} argumentos?);

argumentos
	:  ^(ARGUMENTOS declaracao+)
	;

corpo_funcao
	: ^(CORPO {corpoFuncao = true;} declaracoes statements {corpoFuncao = false;} );

declaracoes
	: ^(DECLARACOES declaracao+)
	;
	
declaracao
	:	^(DECLARACAO tipo ID {if(corpoFuncao == false){ fTmp.incParametros();} else { fTmp.incDeclaracoes();}})
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
	: ^('=' ID expr)
	;

write 	: ^(WRITE expr)
	;
	
read 	: ^(READ ID)
	;
	
	
ifs 	: ^(IF  
		expr  
		a=bloco
		(b=bloco)? )
	;
	
whiles 	: ^(WHILE 
	expr 
	bloco)
	;

bloco 	: statements
	;
	
expr returns [String instrucao]
	:	^('||' a=expr b=expr) 	{$expr.instrucao = $a.instrucao + "||" 	+ $b.instrucao;}
	|	^('&&' a=expr b=expr) 	{$expr.instrucao = $a.instrucao + "&&" 	+ $b.instrucao;}
	|	^('+' a=expr b=expr) 	{$expr.instrucao = $a.instrucao + "+" 	+ $b.instrucao;}
	|	^('-' a=expr b=expr) 	{$expr.instrucao = $a.instrucao + "-" 	+ $b.instrucao;}
	|	^('*' a=expr b=expr) 	{$expr.instrucao = $a.instrucao + "*" 	+ $b.instrucao;}
	|	^('/' a=expr b=expr) 	{$expr.instrucao = $a.instrucao + "/" 	+ $b.instrucao;}
	|	^(\'%' a=expr b=expr) 	{$expr.instrucao = $a.instrucao + "\%" 	+ $b.instrucao;}
	|	^('>' a=expr b=expr) 	{$expr.instrucao = $a.instrucao + ">" 	+ $b.instrucao;}
	|	^('<' a=expr b=expr) 	{$expr.instrucao = $a.instrucao + "<" 	+ $b.instrucao;}
	|	^('>=' a=expr b=expr) 	{$expr.instrucao = $a.instrucao + ">=" 	+ $b.instrucao;}
	| 	^('<=' a=expr b=expr) 	{$expr.instrucao = $a.instrucao + "<=" 	+ $b.instrucao;}
	|	^('==' a=expr b=expr) 	{$expr.instrucao = $a.instrucao + "==" 	+ $b.instrucao;}
	|	^('!=' a=expr b=expr) 	{$expr.instrucao = $a.instrucao + "!=" 	+ $b.instrucao;}
	|	^('!' a=expr) 			{$expr.instrucao = "!" + $a.instrucao;}
	|	factor 					{$expr.instrucao = $factor.instrucao;}
	;
	
factor returns [String instrucao]
	: ID 		{$factor.instrucao = $ID.text;}
	| constante	{$factor.instrucao = $constante.valor;}
	| invocacao
	;
	
constante returns [String valor]
	:	STRING	{$constante.valor = $STRING.text;}
	|	INT	{$constante.valor = $INT.text;}
	|	TRUE	{$constante.valor = $TRUE.text;}
	|	FALSE	{$constante.valor = $FALSE.text;}
	;
	