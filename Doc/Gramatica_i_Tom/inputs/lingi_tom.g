grammar lingi_tom;
options {
  output=AST;
  ASTLabelType=Tree;
  tokenVocab=lingi;
  k=2;
}

tokens {
	Programa;
	Funcao;
	Cabecalho1;
	Cabecalho2;
	Argumentos;
	Corpo_Funcao1;
	Corpo_Funcao2;
	Declaracoes;
	Declaracao;
	DeclaracaoExpr1;
	DeclaracaoExpr2;
	Statement;
	StatementAtribuicao;
	StatementIfs;
	StatementWhiles;
	StatementFors;
	StatementInvocacao;
	StatementRetorna;
	Atribuicao;
	Ifs1;
	Ifs2;
	IfsElse;
	Whiles;
	Fors;
	ForExprExpr;
	ForExprAtribuicao;
	Invocacao;
	Retorna;
	BlocoMore;
	BlocoOne;
	Args1;
	Args2;
	ArgsAux;
	Expr;
	AndExpr1;
	AndExpr2;
	OrExpr1;
	OrExpr2;
	OrExprAux;
	AndExprAux;
	EqualExpr1;
	EqualExpr2;
	EqualExprAux;
	AddExpr1;
	AddExpr2;
	AddExprAux;
	MultExpr1;
	MultExpr2;
	MultExprAux;
	NotExpr;
	NegationExpr;
	FatorID;
	FatorConstante;
	FatorInvocacao;
	ConstanteString;
	ConstanteChar;
	ConstanteInt;
	ConstanteBool;
}

programa: funcao*					-> ^(Programa funcao*)
		;

funcao		:	c1=cabecalho '{' c2=corpo_funcao '}'	
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
		:	d1=declaracoes? statements
									-> {d1==null}? ^(Corpo_Funcao1 statements)
									-> ^(Corpo_Funcao2 $d1 statements)
		;

declaracoes
		:	declaracaoExpr+			-> ^(Declaracoes declaracaoExpr*)
		;
		
declaracaoExpr	:	declaracao ('=' expr)? ';'
									-> {expr==null}? ^(DeclaracaoExpr1 declaracao)
									-> ^(DeclaracaoExpr2 declaracao expr)
		;

declaracao
		:	tipo ID					-> ^(Declaracao tipo ID)
		;

statements
		:	statement*				-> ^(Statement statement*)
		;
	
statement
		:	atribuicao ';'			-> ^(StatementAtribuicao atribuicao)
		|	ifs						-> ^(StatementIfs ifs)
		|	whiles					-> ^(StatementWhiles whiles)
		|	fors					-> ^(StatementFors fors)
		|	invocacao ';'			-> ^(StatementInvocacao invocacao)
		|	retorna ';'				-> ^(StatementRetorna retorna)
		;

atribuicao
		:	ID '=' expr				-> ^(Atribuicao ID expr)
		;

ifs		:	IF '(' expr ')' bloco ifsElse?	
									-> {ifsElse==null}? ^(Ifs1 expr bloco)
									-> ^(Ifs2 expr bloco ifsElse)
		;

ifsElse		:	ELSE bloco			-> ^(IfsElse bloco)
		;

whiles	:	WHILE '(' expr ')' bloco-> ^(Whiles expr bloco)
		;

fors	:	FOR '(' f1=forsexpr ';' expr ';' f2=forsexpr ')' bloco
									-> ^(Fors $f1 expr $f2 bloco)
		;

forsexpr: expr						-> ^(ForExprExpr expr)
		| atribuicao				-> ^(ForExprAtribuicao atribuicao)
		;
	
invocacao
		:	ID '(' args ')'			-> ^(Invocacao args)
		;

retorna	:	RETURN expr				-> ^(Retorna expr)
		;
	
bloco	:	'{' statements '}' 		-> ^(BlocoMore statements)
		|	statement				->  ^(BlocoOne statement)
		;

args	:	e1=expr a1=argsAux*		-> {a1==null}? ^(Args1 $e1)
									-> ^(Args2 $e1 $a1*)
		;
argsAux : ',' expr 					-> ^(ArgsAux expr)
		;
		
expr	:	orExpr					-> ^(Expr orExpr)
		;

orExpr	:	andExpr orExprAux*		-> {orExprAux==null}? ^(OrExpr1 andExpr)
									-> ^(OrExpr2 andExpr orExprAux*)
		;
	
orExprAux:	opOr andExpr			-> ^(OrExprAux andExpr)
		;

andExpr	:	equalExpr (andExprAux)*	-> {andExprAux == null}? ^(AndExpr1 equalExpr)
									-> ^(AndExpr2 equalExpr andExprAux*)
		;		

andExprAux: opAnd equalExpr			-> ^(AndExprAux equalExpr)
		;

equalExpr
		:	addExpr (equalExprAux)*	-> {equalExprAux==null}? ^(EqualExpr1 addExpr)
									-> ^(EqualExpr2 addExpr equalExprAux*)
		;
		
equalExprAux: opRel addExpr			-> ^(EqualExprAux addExpr)
		;
	
addExpr	:	multExpr (addExprAux)*	-> {addExprAux == null}? ^(AddExpr1 multExpr)
									-> ^(AddExpr2 multExpr AddExprAux*)
		;
	
addExprAux: opAdd multExpr 			-> ^(AddExprAux multExpr)
		;

multExpr:	notExpr (multExprAux)*	-> {multExprAux==null}? ^(MultExpr1 notExpr)
									-> ^(MultExpr2 notExpr multExprAux*)
		;

multExprAux: opMul notExpr			-> ^(MultExprAux notExpr)
		;
	
notExpr	:	(opNot)? negationExpr	-> ^(NotExpr negationExpr)
		;
	
negationExpr
		:	('-')? fator			-> ^(NegationExpr fator)
		;


fator	:	ID						-> ^(FatorID ID)
	|	constante					-> ^(FatorConstante constante)
	|	invocacao					-> ^(FatorInvocacao invocacao)
	;

constante
	:	STRING						-> ^(ConstanteString STRING)
	|	CHAR						-> ^(ConstanteChar CHAR)
	|	INT							-> ^(ConstanteInt INT)
	|	TRUE						-> ^(ConstanteBool TRUE)
	|	FALSE						-> ^(ConstanteBool FALSE)
	;

tipo	:	TD_INT
	|	TD_BOOL
	|	TD_STRING
	|	TD_CHAR
	|	TD_FLOAT
	|	TD_VOID
	;
