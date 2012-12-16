grammar Gram;
 
@header { package parser; }
@lexer::header { package parser; }
 
ruleset : rule (rule)* EOF ;
 
rule : 'a' | 'b' ;
 
WS : (' '|'\t'|'\n')+ { $channel=HIDDEN; } ;
SLCOMMENT : '//' (~('\n'|'\r'))* ('\n'|'\r'('\n')?)? { $channel=HIDDEN; } ;