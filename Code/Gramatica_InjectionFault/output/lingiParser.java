// $ANTLR 3.4 /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g 2013-02-17 18:05:16

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class lingiParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMENT", "ELSE", "ESCREVER", "ESC_SEQ", "EXPONENT", "FALSE", "FLOAT", "FOR", "HEX_DIGIT", "ID", "IF", "INT", "LER", "OCTAL_ESC", "RETURN", "STRING", "TD_BOOL", "TD_CHAR", "TD_FLOAT", "TD_INT", "TD_STRING", "TD_VOID", "TRUE", "UNICODE_ESC", "WHILE", "WS", "'!'", "'!='", "'%'", "'&&'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", "';'", "'<'", "'<='", "'='", "'=='", "'>'", "'>='", "'{'", "'||'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int CHAR=4;
    public static final int COMMENT=5;
    public static final int ELSE=6;
    public static final int ESCREVER=7;
    public static final int ESC_SEQ=8;
    public static final int EXPONENT=9;
    public static final int FALSE=10;
    public static final int FLOAT=11;
    public static final int FOR=12;
    public static final int HEX_DIGIT=13;
    public static final int ID=14;
    public static final int IF=15;
    public static final int INT=16;
    public static final int LER=17;
    public static final int OCTAL_ESC=18;
    public static final int RETURN=19;
    public static final int STRING=20;
    public static final int TD_BOOL=21;
    public static final int TD_CHAR=22;
    public static final int TD_FLOAT=23;
    public static final int TD_INT=24;
    public static final int TD_STRING=25;
    public static final int TD_VOID=26;
    public static final int TRUE=27;
    public static final int UNICODE_ESC=28;
    public static final int WHILE=29;
    public static final int WS=30;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "fors", "declaracao", "opAdd", "equalExprAux", "argsAux", 
    "tipo", "funcao", "opRel", "opMul", "bloco", "andExprAux", "opNot", 
    "ifsElse", "constante", "addExpr", "orExpr", "notExpr", "ifs", "forsexpr", 
    "negationExpr", "declaracaoExpr", "whiles", "opOr", "declaracoes", "expr", 
    "multExprAux", "multExpr", "orExprAux", "andExpr", "argumentos", "retorna", 
    "cabecalho", "opAnd", "invocacao", "atribuicao", "args", "statements", 
    "corpo_funcao", "escrever", "fator", "addExprAux", "ler", "statement", 
    "equalExpr", "programa"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false, false, false, false, false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public lingiParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public lingiParser(TokenStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this, port, null);

        setDebugListener(proxy);
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
    }

public lingiParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg, new RecognizerSharedState());
}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

    public String[] getTokenNames() { return lingiParser.tokenNames; }
    public String getGrammarFileName() { return "/home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g"; }


    	private int i = 0;
    	private int fse = 0;
    	private int senao = 0;
    	private int enq = 0;
    	private int fenq = 0;



    // $ANTLR start "programa"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:12:1: programa : ( funcao )* ;
    public final void programa() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "programa");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(12, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:12:9: ( ( funcao )* )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:13:2: ( funcao )*
            {
            dbg.location(13,2);
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:13:2: ( funcao )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= TD_BOOL && LA1_0 <= TD_VOID)) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:13:2: funcao
            	    {
            	    dbg.location(13,2);
            	    pushFollow(FOLLOW_funcao_in_programa17);
            	    funcao();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(14, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "programa");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "programa"



    // $ANTLR start "funcao"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:16:1: funcao : cabecalho '{' ( corpo_funcao )+ '}' ;
    public final void funcao() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "funcao");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(16, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:16:8: ( cabecalho '{' ( corpo_funcao )+ '}' )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:16:10: cabecalho '{' ( corpo_funcao )+ '}'
            {
            dbg.location(16,10);
            pushFollow(FOLLOW_cabecalho_in_funcao28);
            cabecalho();

            state._fsp--;

            dbg.location(16,20);
            match(input,49,FOLLOW_49_in_funcao30); 
            dbg.location(16,24);
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:16:24: ( corpo_funcao )+
            int cnt2=0;
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==ESCREVER||LA2_0==FOR||(LA2_0 >= ID && LA2_0 <= IF)||LA2_0==LER||LA2_0==RETURN||(LA2_0 >= TD_BOOL && LA2_0 <= TD_VOID)||LA2_0==WHILE) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:16:24: corpo_funcao
            	    {
            	    dbg.location(16,24);
            	    pushFollow(FOLLOW_corpo_funcao_in_funcao32);
            	    corpo_funcao();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt2++;
            } while (true);
            } finally {dbg.exitSubRule(2);}

            dbg.location(16,38);
            match(input,51,FOLLOW_51_in_funcao35); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(17, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "funcao");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "funcao"



    // $ANTLR start "cabecalho"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:19:1: cabecalho : tipo ID '(' ( argumentos )? ')' ;
    public final void cabecalho() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "cabecalho");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(19, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:20:2: ( tipo ID '(' ( argumentos )? ')' )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:20:4: tipo ID '(' ( argumentos )? ')'
            {
            dbg.location(20,4);
            pushFollow(FOLLOW_tipo_in_cabecalho46);
            tipo();

            state._fsp--;

            dbg.location(20,9);
            match(input,ID,FOLLOW_ID_in_cabecalho48); 
            dbg.location(20,12);
            match(input,35,FOLLOW_35_in_cabecalho50); 
            dbg.location(20,16);
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:20:16: ( argumentos )?
            int alt3=2;
            try { dbg.enterSubRule(3);
            try { dbg.enterDecision(3, decisionCanBacktrack[3]);

            int LA3_0 = input.LA(1);

            if ( ((LA3_0 >= TD_BOOL && LA3_0 <= TD_VOID)) ) {
                alt3=1;
            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:20:16: argumentos
                    {
                    dbg.location(20,16);
                    pushFollow(FOLLOW_argumentos_in_cabecalho52);
                    argumentos();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(3);}

            dbg.location(20,28);
            match(input,36,FOLLOW_36_in_cabecalho55); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(21, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cabecalho");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "cabecalho"



    // $ANTLR start "argumentos"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:23:1: argumentos : declaracao ( ',' declaracao )* ;
    public final void argumentos() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "argumentos");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(23, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:24:2: ( declaracao ( ',' declaracao )* )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:24:4: declaracao ( ',' declaracao )*
            {
            dbg.location(24,4);
            pushFollow(FOLLOW_declaracao_in_argumentos66);
            declaracao();

            state._fsp--;

            dbg.location(24,15);
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:24:15: ( ',' declaracao )*
            try { dbg.enterSubRule(4);

            loop4:
            do {
                int alt4=2;
                try { dbg.enterDecision(4, decisionCanBacktrack[4]);

                int LA4_0 = input.LA(1);

                if ( (LA4_0==39) ) {
                    alt4=1;
                }


                } finally {dbg.exitDecision(4);}

                switch (alt4) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:24:16: ',' declaracao
            	    {
            	    dbg.location(24,16);
            	    match(input,39,FOLLOW_39_in_argumentos69); 
            	    dbg.location(24,20);
            	    pushFollow(FOLLOW_declaracao_in_argumentos71);
            	    declaracao();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);
            } finally {dbg.exitSubRule(4);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(25, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "argumentos");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "argumentos"



    // $ANTLR start "corpo_funcao"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:27:1: corpo_funcao : ( declaracoes )? statements ;
    public final void corpo_funcao() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "corpo_funcao");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(27, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:28:2: ( ( declaracoes )? statements )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:28:4: ( declaracoes )? statements
            {
            dbg.location(28,4);
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:28:4: ( declaracoes )?
            int alt5=2;
            try { dbg.enterSubRule(5);
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            int LA5_0 = input.LA(1);

            if ( ((LA5_0 >= TD_BOOL && LA5_0 <= TD_VOID)) ) {
                alt5=1;
            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:28:5: declaracoes
                    {
                    dbg.location(28,5);
                    pushFollow(FOLLOW_declaracoes_in_corpo_funcao86);
                    declaracoes();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}

            dbg.location(28,19);
            System.out.println("CODIGO");
            dbg.location(28,52);
            pushFollow(FOLLOW_statements_in_corpo_funcao93);
            statements();

            state._fsp--;

            dbg.location(28,63);
            System.out.println("HALT");

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(29, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "corpo_funcao");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "corpo_funcao"



    // $ANTLR start "declaracoes"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:31:1: declaracoes : ( declaracaoExpr )+ ;
    public final void declaracoes() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "declaracoes");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(31, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:32:2: ( ( declaracaoExpr )+ )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:32:4: ( declaracaoExpr )+
            {
            dbg.location(32,4);
            System.out.println("MEMORIA DE DADOS");
            dbg.location(32,46);
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:32:46: ( declaracaoExpr )+
            int cnt6=0;
            try { dbg.enterSubRule(6);

            loop6:
            do {
                int alt6=2;
                try { dbg.enterDecision(6, decisionCanBacktrack[6]);

                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= TD_BOOL && LA6_0 <= TD_VOID)) ) {
                    alt6=1;
                }


                } finally {dbg.exitDecision(6);}

                switch (alt6) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:32:46: declaracaoExpr
            	    {
            	    dbg.location(32,46);
            	    pushFollow(FOLLOW_declaracaoExpr_in_declaracoes108);
            	    declaracaoExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt6++;
            } while (true);
            } finally {dbg.exitSubRule(6);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(33, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "declaracoes");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "declaracoes"



    // $ANTLR start "declaracaoExpr"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:35:1: declaracaoExpr : declaracao ';' ;
    public final void declaracaoExpr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "declaracaoExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(35, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:36:2: ( declaracao ';' )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:36:4: declaracao ';'
            {
            dbg.location(36,4);
            pushFollow(FOLLOW_declaracao_in_declaracaoExpr120);
            declaracao();

            state._fsp--;

            dbg.location(36,82);
            match(input,42,FOLLOW_42_in_declaracaoExpr124); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(37, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "declaracaoExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "declaracaoExpr"



    // $ANTLR start "declaracao"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:39:1: declaracao : tipo ID ;
    public final void declaracao() throws RecognitionException {
        Token ID1=null;

        try { dbg.enterRule(getGrammarFileName(), "declaracao");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(39, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:40:2: ( tipo ID )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:40:4: tipo ID
            {
            dbg.location(40,4);
            pushFollow(FOLLOW_tipo_in_declaracao135);
            tipo();

            state._fsp--;

            dbg.location(40,9);
            ID1=(Token)match(input,ID,FOLLOW_ID_in_declaracao137); 
            dbg.location(40,12);
            System.out.println((ID1!=null?ID1.getText():null) + " " + i++ + " TAM 1");

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(41, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "declaracao");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "declaracao"



    // $ANTLR start "statements"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:43:1: statements : ( statement )+ ;
    public final void statements() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "statements");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(43, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:44:2: ( ( statement )+ )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:44:4: ( statement )+
            {
            dbg.location(44,4);
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:44:4: ( statement )+
            int cnt7=0;
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7, decisionCanBacktrack[7]);

                switch ( input.LA(1) ) {
                case ID:
                    {
                    alt7=1;
                    }
                    break;
                case IF:
                    {
                    alt7=1;
                    }
                    break;
                case WHILE:
                    {
                    alt7=1;
                    }
                    break;
                case FOR:
                    {
                    alt7=1;
                    }
                    break;
                case RETURN:
                    {
                    alt7=1;
                    }
                    break;
                case LER:
                    {
                    alt7=1;
                    }
                    break;
                case ESCREVER:
                    {
                    alt7=1;
                    }
                    break;

                }

                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:44:4: statement
            	    {
            	    dbg.location(44,4);
            	    pushFollow(FOLLOW_statement_in_statements150);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt7++;
            } while (true);
            } finally {dbg.exitSubRule(7);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(45, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "statements");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "statements"



    // $ANTLR start "statement"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:47:1: statement : ( atribuicao ';' | ifs | whiles | fors | invocacao ';' | retorna ';' | ler ';' | escrever ';' );
    public final void statement() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(47, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:48:2: ( atribuicao ';' | ifs | whiles | fors | invocacao ';' | retorna ';' | ler ';' | escrever ';' )
            int alt8=8;
            try { dbg.enterDecision(8, decisionCanBacktrack[8]);

            switch ( input.LA(1) ) {
            case ID:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==35) ) {
                    alt8=5;
                }
                else if ( (LA8_1==45) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case IF:
                {
                alt8=2;
                }
                break;
            case WHILE:
                {
                alt8=3;
                }
                break;
            case FOR:
                {
                alt8=4;
                }
                break;
            case RETURN:
                {
                alt8=6;
                }
                break;
            case LER:
                {
                alt8=7;
                }
                break;
            case ESCREVER:
                {
                alt8=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:48:4: atribuicao ';'
                    {
                    dbg.location(48,4);
                    pushFollow(FOLLOW_atribuicao_in_statement163);
                    atribuicao();

                    state._fsp--;

                    dbg.location(48,15);
                    match(input,42,FOLLOW_42_in_statement165); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:49:4: ifs
                    {
                    dbg.location(49,4);
                    pushFollow(FOLLOW_ifs_in_statement170);
                    ifs();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:50:4: whiles
                    {
                    dbg.location(50,4);
                    pushFollow(FOLLOW_whiles_in_statement175);
                    whiles();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:51:4: fors
                    {
                    dbg.location(51,4);
                    pushFollow(FOLLOW_fors_in_statement180);
                    fors();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:52:4: invocacao ';'
                    {
                    dbg.location(52,4);
                    pushFollow(FOLLOW_invocacao_in_statement185);
                    invocacao();

                    state._fsp--;

                    dbg.location(52,14);
                    match(input,42,FOLLOW_42_in_statement187); 

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:53:4: retorna ';'
                    {
                    dbg.location(53,4);
                    pushFollow(FOLLOW_retorna_in_statement192);
                    retorna();

                    state._fsp--;

                    dbg.location(53,12);
                    match(input,42,FOLLOW_42_in_statement194); 

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:54:4: ler ';'
                    {
                    dbg.location(54,4);
                    pushFollow(FOLLOW_ler_in_statement199);
                    ler();

                    state._fsp--;

                    dbg.location(54,8);
                    match(input,42,FOLLOW_42_in_statement201); 

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:55:4: escrever ';'
                    {
                    dbg.location(55,4);
                    pushFollow(FOLLOW_escrever_in_statement206);
                    escrever();

                    state._fsp--;

                    dbg.location(55,13);
                    match(input,42,FOLLOW_42_in_statement208); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(56, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "statement"



    // $ANTLR start "ler"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:58:1: ler : LER '(' ID ')' ;
    public final void ler() throws RecognitionException {
        Token ID2=null;

        try { dbg.enterRule(getGrammarFileName(), "ler");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(58, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:58:5: ( LER '(' ID ')' )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:58:7: LER '(' ID ')'
            {
            dbg.location(58,7);
            match(input,LER,FOLLOW_LER_in_ler218); 
            dbg.location(58,11);
            match(input,35,FOLLOW_35_in_ler220); 
            dbg.location(58,15);
            ID2=(Token)match(input,ID,FOLLOW_ID_in_ler222); 
            dbg.location(58,18);
            match(input,36,FOLLOW_36_in_ler224); 
            dbg.location(58,24);
            System.out.println("PSHA " + (ID2!=null?ID2.getText():null) + "\nIN\nSTORE");

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(59, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ler");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "ler"



    // $ANTLR start "escrever"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:61:1: escrever : ESCREVER '(' ID ')' ;
    public final void escrever() throws RecognitionException {
        Token ID3=null;

        try { dbg.enterRule(getGrammarFileName(), "escrever");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(61, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:61:9: ( ESCREVER '(' ID ')' )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:61:11: ESCREVER '(' ID ')'
            {
            dbg.location(61,11);
            match(input,ESCREVER,FOLLOW_ESCREVER_in_escrever239); 
            dbg.location(61,20);
            match(input,35,FOLLOW_35_in_escrever241); 
            dbg.location(61,24);
            ID3=(Token)match(input,ID,FOLLOW_ID_in_escrever243); 
            dbg.location(61,27);
            match(input,36,FOLLOW_36_in_escrever245); 
            dbg.location(61,31);
            System.out.println("PSHA " + (ID3!=null?ID3.getText():null) + "\nLOAD\nOUT");

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(62, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "escrever");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "escrever"



    // $ANTLR start "atribuicao"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:64:1: atribuicao : ID '=' expr ;
    public final void atribuicao() throws RecognitionException {
        Token ID4=null;

        try { dbg.enterRule(getGrammarFileName(), "atribuicao");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(64, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:65:2: ( ID '=' expr )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:65:4: ID '=' expr
            {
            dbg.location(65,4);
            ID4=(Token)match(input,ID,FOLLOW_ID_in_atribuicao258); 
            dbg.location(65,7);
            System.out.println("PSHA " + (ID4!=null?ID4.getText():null));
            dbg.location(65,49);
            match(input,45,FOLLOW_45_in_atribuicao262); 
            dbg.location(65,53);
            pushFollow(FOLLOW_expr_in_atribuicao264);
            expr();

            state._fsp--;

            dbg.location(65,58);
            System.out.println("STORE");

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(66, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "atribuicao");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "atribuicao"



    // $ANTLR start "ifs"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:68:1: ifs : IF '(' expr ')' bloco ( ifsElse )? ;
    public final void ifs() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "ifs");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(68, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:68:5: ( IF '(' expr ')' bloco ( ifsElse )? )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:68:7: IF '(' expr ')' bloco ( ifsElse )?
            {
            dbg.location(68,7);
            match(input,IF,FOLLOW_IF_in_ifs276); 
            dbg.location(68,10);
            match(input,35,FOLLOW_35_in_ifs278); 
            dbg.location(68,14);
            pushFollow(FOLLOW_expr_in_ifs280);
            expr();

            state._fsp--;

            dbg.location(68,19);
            match(input,36,FOLLOW_36_in_ifs282); 
            dbg.location(68,23);
            System.out.println("JMPF senao"+ ++senao);
            dbg.location(68,68);
            pushFollow(FOLLOW_bloco_in_ifs286);
            bloco();

            state._fsp--;

            dbg.location(68,74);
            System.out.println("JMP fse"+ ++fse);
            dbg.location(68,114);
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:68:114: ( ifsElse )?
            int alt9=2;
            try { dbg.enterSubRule(9);
            try { dbg.enterDecision(9, decisionCanBacktrack[9]);

            int LA9_0 = input.LA(1);

            if ( (LA9_0==ELSE) ) {
                alt9=1;
            }
            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:68:114: ifsElse
                    {
                    dbg.location(68,114);
                    pushFollow(FOLLOW_ifsElse_in_ifs290);
                    ifsElse();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(9);}

            dbg.location(68,123);
            System.out.print("fse"+fse+": ");

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(69, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ifs");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "ifs"



    // $ANTLR start "ifsElse"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:71:1: ifsElse : ELSE bloco ;
    public final void ifsElse() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "ifsElse");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(71, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:71:9: ( ELSE bloco )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:71:11: ELSE bloco
            {
            dbg.location(71,11);
            match(input,ELSE,FOLLOW_ELSE_in_ifsElse303); 
            dbg.location(71,17);
            System.out.print("senao"+senao+": ");
            dbg.location(71,57);
            pushFollow(FOLLOW_bloco_in_ifsElse308);
            bloco();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(72, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ifsElse");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "ifsElse"



    // $ANTLR start "whiles"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:74:1: whiles : WHILE '(' expr ')' bloco ;
    public final void whiles() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "whiles");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(74, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:74:8: ( WHILE '(' expr ')' bloco )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:74:10: WHILE '(' expr ')' bloco
            {
            dbg.location(74,10);
            match(input,WHILE,FOLLOW_WHILE_in_whiles318); 
            dbg.location(74,16);
            System.out.print("enq"+ ++enq + ": ");
            dbg.location(74,57);
            match(input,35,FOLLOW_35_in_whiles322); 
            dbg.location(74,61);
            pushFollow(FOLLOW_expr_in_whiles324);
            expr();

            state._fsp--;

            dbg.location(74,66);
            match(input,36,FOLLOW_36_in_whiles326); 
            dbg.location(74,70);
            System.out.print("JMPF fenq"+ ++fenq);
            dbg.location(74,112);
            pushFollow(FOLLOW_bloco_in_whiles331);
            bloco();

            state._fsp--;

            dbg.location(74,118);
            System.out.print("fenq"+fenq+": ");

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(75, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "whiles");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "whiles"



    // $ANTLR start "fors"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:77:1: fors : FOR '(' forsexpr ';' expr ';' forsexpr ')' bloco ;
    public final void fors() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "fors");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(77, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:77:6: ( FOR '(' forsexpr ';' expr ';' forsexpr ')' bloco )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:77:8: FOR '(' forsexpr ';' expr ';' forsexpr ')' bloco
            {
            dbg.location(77,8);
            match(input,FOR,FOLLOW_FOR_in_fors343); 
            dbg.location(77,12);
            match(input,35,FOLLOW_35_in_fors345); 
            dbg.location(77,16);
            pushFollow(FOLLOW_forsexpr_in_fors347);
            forsexpr();

            state._fsp--;

            dbg.location(77,25);
            match(input,42,FOLLOW_42_in_fors349); 
            dbg.location(77,29);
            pushFollow(FOLLOW_expr_in_fors351);
            expr();

            state._fsp--;

            dbg.location(77,34);
            match(input,42,FOLLOW_42_in_fors353); 
            dbg.location(77,38);
            pushFollow(FOLLOW_forsexpr_in_fors355);
            forsexpr();

            state._fsp--;

            dbg.location(77,47);
            match(input,36,FOLLOW_36_in_fors357); 
            dbg.location(77,51);
            pushFollow(FOLLOW_bloco_in_fors359);
            bloco();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(78, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "fors");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "fors"



    // $ANTLR start "forsexpr"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:80:1: forsexpr : ( expr | atribuicao );
    public final void forsexpr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "forsexpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(80, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:80:9: ( expr | atribuicao )
            int alt10=2;
            try { dbg.enterDecision(10, decisionCanBacktrack[10]);

            int LA10_0 = input.LA(1);

            if ( (LA10_0==CHAR||LA10_0==FALSE||LA10_0==INT||LA10_0==STRING||LA10_0==TRUE||LA10_0==31||LA10_0==40) ) {
                alt10=1;
            }
            else if ( (LA10_0==ID) ) {
                int LA10_2 = input.LA(2);

                if ( ((LA10_2 >= 32 && LA10_2 <= 38)||(LA10_2 >= 40 && LA10_2 <= 44)||(LA10_2 >= 46 && LA10_2 <= 48)||LA10_2==50) ) {
                    alt10=1;
                }
                else if ( (LA10_2==45) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:80:11: expr
                    {
                    dbg.location(80,11);
                    pushFollow(FOLLOW_expr_in_forsexpr368);
                    expr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:81:4: atribuicao
                    {
                    dbg.location(81,4);
                    pushFollow(FOLLOW_atribuicao_in_forsexpr373);
                    atribuicao();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(82, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "forsexpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "forsexpr"



    // $ANTLR start "invocacao"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:84:1: invocacao : ID '(' args ')' ;
    public final void invocacao() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "invocacao");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(84, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:85:2: ( ID '(' args ')' )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:85:4: ID '(' args ')'
            {
            dbg.location(85,4);
            match(input,ID,FOLLOW_ID_in_invocacao384); 
            dbg.location(85,7);
            match(input,35,FOLLOW_35_in_invocacao386); 
            dbg.location(85,11);
            pushFollow(FOLLOW_args_in_invocacao388);
            args();

            state._fsp--;

            dbg.location(85,16);
            match(input,36,FOLLOW_36_in_invocacao390); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(86, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "invocacao");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "invocacao"



    // $ANTLR start "retorna"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:88:1: retorna : RETURN expr ;
    public final void retorna() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "retorna");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(88, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:88:9: ( RETURN expr )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:88:11: RETURN expr
            {
            dbg.location(88,11);
            match(input,RETURN,FOLLOW_RETURN_in_retorna400); 
            dbg.location(88,18);
            pushFollow(FOLLOW_expr_in_retorna402);
            expr();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(89, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "retorna");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "retorna"



    // $ANTLR start "bloco"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:91:1: bloco : ( '{' statements '}' | statement );
    public final void bloco() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "bloco");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(91, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:91:7: ( '{' statements '}' | statement )
            int alt11=2;
            try { dbg.enterDecision(11, decisionCanBacktrack[11]);

            int LA11_0 = input.LA(1);

            if ( (LA11_0==49) ) {
                alt11=1;
            }
            else if ( (LA11_0==ESCREVER||LA11_0==FOR||(LA11_0 >= ID && LA11_0 <= IF)||LA11_0==LER||LA11_0==RETURN||LA11_0==WHILE) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:91:9: '{' statements '}'
                    {
                    dbg.location(91,9);
                    match(input,49,FOLLOW_49_in_bloco413); 
                    dbg.location(91,13);
                    pushFollow(FOLLOW_statements_in_bloco415);
                    statements();

                    state._fsp--;

                    dbg.location(91,24);
                    match(input,51,FOLLOW_51_in_bloco417); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:92:4: statement
                    {
                    dbg.location(92,4);
                    pushFollow(FOLLOW_statement_in_bloco422);
                    statement();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(93, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "bloco");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "bloco"



    // $ANTLR start "args"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:95:1: args : expr ( argsAux )* ;
    public final void args() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "args");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(95, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:95:6: ( expr ( argsAux )* )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:95:8: expr ( argsAux )*
            {
            dbg.location(95,8);
            pushFollow(FOLLOW_expr_in_args432);
            expr();

            state._fsp--;

            dbg.location(95,13);
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:95:13: ( argsAux )*
            try { dbg.enterSubRule(12);

            loop12:
            do {
                int alt12=2;
                try { dbg.enterDecision(12, decisionCanBacktrack[12]);

                int LA12_0 = input.LA(1);

                if ( (LA12_0==39) ) {
                    alt12=1;
                }


                } finally {dbg.exitDecision(12);}

                switch (alt12) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:95:13: argsAux
            	    {
            	    dbg.location(95,13);
            	    pushFollow(FOLLOW_argsAux_in_args434);
            	    argsAux();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);
            } finally {dbg.exitSubRule(12);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(96, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "args");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "args"



    // $ANTLR start "argsAux"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:98:1: argsAux : ',' expr ;
    public final void argsAux() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "argsAux");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(98, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:98:9: ( ',' expr )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:98:12: ',' expr
            {
            dbg.location(98,12);
            match(input,39,FOLLOW_39_in_argsAux446); 
            dbg.location(98,16);
            pushFollow(FOLLOW_expr_in_argsAux448);
            expr();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(99, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "argsAux");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "argsAux"



    // $ANTLR start "expr"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:101:1: expr : orExpr ;
    public final void expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(101, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:101:6: ( orExpr )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:101:8: orExpr
            {
            dbg.location(101,8);
            pushFollow(FOLLOW_orExpr_in_expr458);
            orExpr();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(102, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "expr"



    // $ANTLR start "orExpr"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:104:1: orExpr : andExpr ( orExprAux )* ;
    public final void orExpr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "orExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(104, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:104:8: ( andExpr ( orExprAux )* )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:104:10: andExpr ( orExprAux )*
            {
            dbg.location(104,10);
            pushFollow(FOLLOW_andExpr_in_orExpr468);
            andExpr();

            state._fsp--;

            dbg.location(104,18);
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:104:18: ( orExprAux )*
            try { dbg.enterSubRule(13);

            loop13:
            do {
                int alt13=2;
                try { dbg.enterDecision(13, decisionCanBacktrack[13]);

                int LA13_0 = input.LA(1);

                if ( (LA13_0==50) ) {
                    alt13=1;
                }


                } finally {dbg.exitDecision(13);}

                switch (alt13) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:104:18: orExprAux
            	    {
            	    dbg.location(104,18);
            	    pushFollow(FOLLOW_orExprAux_in_orExpr470);
            	    orExprAux();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);
            } finally {dbg.exitSubRule(13);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(105, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "orExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "orExpr"



    // $ANTLR start "orExprAux"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:107:1: orExprAux : opOr andExpr ;
    public final void orExprAux() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "orExprAux");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(107, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:107:10: ( opOr andExpr )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:107:12: opOr andExpr
            {
            dbg.location(107,12);
            pushFollow(FOLLOW_opOr_in_orExprAux481);
            opOr();

            state._fsp--;

            dbg.location(107,17);
            pushFollow(FOLLOW_andExpr_in_orExprAux483);
            andExpr();

            state._fsp--;

            dbg.location(107,26);
            System.out.println("OR");

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(108, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "orExprAux");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "orExprAux"



    // $ANTLR start "andExpr"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:110:1: andExpr : equalExpr ( andExprAux )* ;
    public final void andExpr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "andExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(110, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:110:9: ( equalExpr ( andExprAux )* )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:110:11: equalExpr ( andExprAux )*
            {
            dbg.location(110,11);
            pushFollow(FOLLOW_equalExpr_in_andExpr496);
            equalExpr();

            state._fsp--;

            dbg.location(110,21);
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:110:21: ( andExprAux )*
            try { dbg.enterSubRule(14);

            loop14:
            do {
                int alt14=2;
                try { dbg.enterDecision(14, decisionCanBacktrack[14]);

                int LA14_0 = input.LA(1);

                if ( (LA14_0==34) ) {
                    alt14=1;
                }


                } finally {dbg.exitDecision(14);}

                switch (alt14) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:110:21: andExprAux
            	    {
            	    dbg.location(110,21);
            	    pushFollow(FOLLOW_andExprAux_in_andExpr498);
            	    andExprAux();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);
            } finally {dbg.exitSubRule(14);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(111, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "andExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "andExpr"



    // $ANTLR start "andExprAux"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:113:1: andExprAux : opAnd equalExpr ;
    public final void andExprAux() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "andExprAux");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(113, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:113:11: ( opAnd equalExpr )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:113:13: opAnd equalExpr
            {
            dbg.location(113,13);
            pushFollow(FOLLOW_opAnd_in_andExprAux508);
            opAnd();

            state._fsp--;

            dbg.location(113,19);
            pushFollow(FOLLOW_equalExpr_in_andExprAux510);
            equalExpr();

            state._fsp--;

            dbg.location(113,30);
            System.out.println("AND");

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(114, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "andExprAux");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "andExprAux"



    // $ANTLR start "equalExpr"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:116:1: equalExpr : addExpr ( equalExprAux )* ;
    public final void equalExpr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "equalExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(116, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:117:2: ( addExpr ( equalExprAux )* )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:117:4: addExpr ( equalExprAux )*
            {
            dbg.location(117,4);
            pushFollow(FOLLOW_addExpr_in_equalExpr524);
            addExpr();

            state._fsp--;

            dbg.location(117,12);
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:117:12: ( equalExprAux )*
            try { dbg.enterSubRule(15);

            loop15:
            do {
                int alt15=2;
                try { dbg.enterDecision(15, decisionCanBacktrack[15]);

                int LA15_0 = input.LA(1);

                if ( (LA15_0==32||(LA15_0 >= 43 && LA15_0 <= 44)||(LA15_0 >= 46 && LA15_0 <= 48)) ) {
                    alt15=1;
                }


                } finally {dbg.exitDecision(15);}

                switch (alt15) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:117:12: equalExprAux
            	    {
            	    dbg.location(117,12);
            	    pushFollow(FOLLOW_equalExprAux_in_equalExpr526);
            	    equalExprAux();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);
            } finally {dbg.exitSubRule(15);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(118, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "equalExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "equalExpr"



    // $ANTLR start "equalExprAux"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:120:1: equalExprAux : opRel addExpr ;
    public final void equalExprAux() throws RecognitionException {
        lingiParser.opRel_return opRel5 =null;


        try { dbg.enterRule(getGrammarFileName(), "equalExprAux");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(120, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:120:13: ( opRel addExpr )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:120:15: opRel addExpr
            {
            dbg.location(120,15);
            pushFollow(FOLLOW_opRel_in_equalExprAux538);
            opRel5=opRel();

            state._fsp--;

            dbg.location(120,21);
            pushFollow(FOLLOW_addExpr_in_equalExprAux540);
            addExpr();

            state._fsp--;

            dbg.location(120,30);
            if((opRel5!=null?input.toString(opRel5.start,opRel5.stop):null).equals("==")) System.out.println("EQ");
            					if((opRel5!=null?input.toString(opRel5.start,opRel5.stop):null).equals(">")) System.out.println("GT");
            					if((opRel5!=null?input.toString(opRel5.start,opRel5.stop):null).equals(">=")) System.out.println("GE");
            					if((opRel5!=null?input.toString(opRel5.start,opRel5.stop):null).equals("<")) System.out.println("LT");
            					if((opRel5!=null?input.toString(opRel5.start,opRel5.stop):null).equals("<=")) System.out.println("LE");
            					if((opRel5!=null?input.toString(opRel5.start,opRel5.stop):null).equals("!=")) System.out.println("NE");

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(126, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "equalExprAux");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "equalExprAux"



    // $ANTLR start "addExpr"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:128:1: addExpr : multExpr ( addExprAux )* ;
    public final void addExpr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "addExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(128, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:128:9: ( multExpr ( addExprAux )* )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:128:11: multExpr ( addExprAux )*
            {
            dbg.location(128,11);
            pushFollow(FOLLOW_multExpr_in_addExpr555);
            multExpr();

            state._fsp--;

            dbg.location(128,20);
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:128:20: ( addExprAux )*
            try { dbg.enterSubRule(16);

            loop16:
            do {
                int alt16=2;
                try { dbg.enterDecision(16, decisionCanBacktrack[16]);

                int LA16_0 = input.LA(1);

                if ( (LA16_0==38||LA16_0==40) ) {
                    alt16=1;
                }


                } finally {dbg.exitDecision(16);}

                switch (alt16) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:128:20: addExprAux
            	    {
            	    dbg.location(128,20);
            	    pushFollow(FOLLOW_addExprAux_in_addExpr557);
            	    addExprAux();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);
            } finally {dbg.exitSubRule(16);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(129, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "addExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "addExpr"



    // $ANTLR start "addExprAux"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:131:1: addExprAux : opAdd multExpr ;
    public final void addExprAux() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "addExprAux");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(131, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:131:11: ( opAdd multExpr )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:131:13: opAdd multExpr
            {
            dbg.location(131,13);
            pushFollow(FOLLOW_opAdd_in_addExprAux567);
            opAdd();

            state._fsp--;

            dbg.location(131,19);
            pushFollow(FOLLOW_multExpr_in_addExprAux569);
            multExpr();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(132, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "addExprAux");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "addExprAux"



    // $ANTLR start "multExpr"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:134:1: multExpr : notExpr ( multExprAux )* ;
    public final void multExpr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "multExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(134, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:134:9: ( notExpr ( multExprAux )* )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:134:11: notExpr ( multExprAux )*
            {
            dbg.location(134,11);
            pushFollow(FOLLOW_notExpr_in_multExpr579);
            notExpr();

            state._fsp--;

            dbg.location(134,19);
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:134:19: ( multExprAux )*
            try { dbg.enterSubRule(17);

            loop17:
            do {
                int alt17=2;
                try { dbg.enterDecision(17, decisionCanBacktrack[17]);

                int LA17_0 = input.LA(1);

                if ( (LA17_0==33||LA17_0==37||LA17_0==41) ) {
                    alt17=1;
                }


                } finally {dbg.exitDecision(17);}

                switch (alt17) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:134:19: multExprAux
            	    {
            	    dbg.location(134,19);
            	    pushFollow(FOLLOW_multExprAux_in_multExpr581);
            	    multExprAux();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);
            } finally {dbg.exitSubRule(17);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(135, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "multExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "multExpr"



    // $ANTLR start "multExprAux"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:137:1: multExprAux : opMul notExpr ;
    public final void multExprAux() throws RecognitionException {
        lingiParser.opMul_return opMul6 =null;


        try { dbg.enterRule(getGrammarFileName(), "multExprAux");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(137, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:137:12: ( opMul notExpr )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:137:14: opMul notExpr
            {
            dbg.location(137,14);
            pushFollow(FOLLOW_opMul_in_multExprAux591);
            opMul6=opMul();

            state._fsp--;

            dbg.location(137,20);
            pushFollow(FOLLOW_notExpr_in_multExprAux593);
            notExpr();

            state._fsp--;

            dbg.location(137,29);
            if((opMul6!=null?input.toString(opMul6.start,opMul6.stop):null).equals("/")) System.out.println("DIV");
            					if((opMul6!=null?input.toString(opMul6.start,opMul6.stop):null).equals("*")) System.out.println("MUL");
            					if((opMul6!=null?input.toString(opMul6.start,opMul6.stop):null).equals("%")) System.out.println("MOD");

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(140, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "multExprAux");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "multExprAux"



    // $ANTLR start "notExpr"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:142:1: notExpr : ( opNot )? negationExpr ;
    public final void notExpr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "notExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(142, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:142:9: ( ( opNot )? negationExpr )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:142:11: ( opNot )? negationExpr
            {
            dbg.location(142,11);
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:142:11: ( opNot )?
            int alt18=2;
            try { dbg.enterSubRule(18);
            try { dbg.enterDecision(18, decisionCanBacktrack[18]);

            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            } finally {dbg.exitDecision(18);}

            switch (alt18) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:142:12: opNot
                    {
                    dbg.location(142,12);
                    pushFollow(FOLLOW_opNot_in_notExpr607);
                    opNot();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(18);}

            dbg.location(142,20);
            pushFollow(FOLLOW_negationExpr_in_notExpr611);
            negationExpr();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(143, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "notExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "notExpr"



    // $ANTLR start "negationExpr"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:145:1: negationExpr : ( '-' )? fator ;
    public final void negationExpr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "negationExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(145, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:146:2: ( ( '-' )? fator )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:146:4: ( '-' )? fator
            {
            dbg.location(146,4);
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:146:4: ( '-' )?
            int alt19=2;
            try { dbg.enterSubRule(19);
            try { dbg.enterDecision(19, decisionCanBacktrack[19]);

            int LA19_0 = input.LA(1);

            if ( (LA19_0==40) ) {
                alt19=1;
            }
            } finally {dbg.exitDecision(19);}

            switch (alt19) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:146:5: '-'
                    {
                    dbg.location(146,5);
                    match(input,40,FOLLOW_40_in_negationExpr624); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(19);}

            dbg.location(146,11);
            pushFollow(FOLLOW_fator_in_negationExpr628);
            fator();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(147, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "negationExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "negationExpr"



    // $ANTLR start "opAdd"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:149:1: opAdd : ( '+' | '-' );
    public final void opAdd() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "opAdd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(149, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:149:7: ( '+' | '-' )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:
            {
            dbg.location(149,7);
            if ( input.LA(1)==38||input.LA(1)==40 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(151, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "opAdd");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "opAdd"


    public static class opMul_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "opMul"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:153:1: opMul : ( '*' | '/' | '%' );
    public final lingiParser.opMul_return opMul() throws RecognitionException {
        lingiParser.opMul_return retval = new lingiParser.opMul_return();
        retval.start = input.LT(1);


        try { dbg.enterRule(getGrammarFileName(), "opMul");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(153, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:153:7: ( '*' | '/' | '%' )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:
            {
            dbg.location(153,7);
            if ( input.LA(1)==33||input.LA(1)==37||input.LA(1)==41 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(156, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "opMul");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "opMul"



    // $ANTLR start "opOr"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:158:1: opOr : '||' ;
    public final void opOr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "opOr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(158, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:158:6: ( '||' )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:158:8: '||'
            {
            dbg.location(158,8);
            match(input,50,FOLLOW_50_in_opOr673); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(159, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "opOr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "opOr"



    // $ANTLR start "opAnd"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:161:1: opAnd : '&&' ;
    public final void opAnd() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "opAnd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(161, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:161:7: ( '&&' )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:161:9: '&&'
            {
            dbg.location(161,9);
            match(input,34,FOLLOW_34_in_opAnd683); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(162, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "opAnd");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "opAnd"


    public static class opRel_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "opRel"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:164:1: opRel : ( '>' | '<' | '>=' | '<=' | '==' | '!=' );
    public final lingiParser.opRel_return opRel() throws RecognitionException {
        lingiParser.opRel_return retval = new lingiParser.opRel_return();
        retval.start = input.LT(1);


        try { dbg.enterRule(getGrammarFileName(), "opRel");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(164, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:164:7: ( '>' | '<' | '>=' | '<=' | '==' | '!=' )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:
            {
            dbg.location(164,7);
            if ( input.LA(1)==32||(input.LA(1) >= 43 && input.LA(1) <= 44)||(input.LA(1) >= 46 && input.LA(1) <= 48) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(170, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "opRel");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "opRel"



    // $ANTLR start "opNot"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:172:1: opNot : '!' ;
    public final void opNot() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "opNot");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(172, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:172:7: ( '!' )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:172:9: '!'
            {
            dbg.location(172,9);
            match(input,31,FOLLOW_31_in_opNot728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(173, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "opNot");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "opNot"



    // $ANTLR start "fator"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:175:1: fator : ( ID | constante | invocacao );
    public final void fator() throws RecognitionException {
        Token ID7=null;
        lingiParser.constante_return constante8 =null;


        try { dbg.enterRule(getGrammarFileName(), "fator");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(175, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:175:7: ( ID | constante | invocacao )
            int alt20=3;
            try { dbg.enterDecision(20, decisionCanBacktrack[20]);

            int LA20_0 = input.LA(1);

            if ( (LA20_0==ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==35) ) {
                    alt20=3;
                }
                else if ( ((LA20_1 >= 32 && LA20_1 <= 34)||(LA20_1 >= 36 && LA20_1 <= 44)||(LA20_1 >= 46 && LA20_1 <= 48)||LA20_1==50) ) {
                    alt20=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA20_0==CHAR||LA20_0==FALSE||LA20_0==INT||LA20_0==STRING||LA20_0==TRUE) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(20);}

            switch (alt20) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:175:9: ID
                    {
                    dbg.location(175,9);
                    ID7=(Token)match(input,ID,FOLLOW_ID_in_fator738); 
                    dbg.location(175,13);
                    System.out.println("PSHA " + (ID7!=null?ID7.getText():null) + "\nLOAD");

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:176:4: constante
                    {
                    dbg.location(176,4);
                    pushFollow(FOLLOW_constante_in_fator746);
                    constante8=constante();

                    state._fsp--;

                    dbg.location(176,14);
                    System.out.println("PUSH " + (constante8!=null?input.toString(constante8.start,constante8.stop):null));

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:177:4: invocacao
                    {
                    dbg.location(177,4);
                    pushFollow(FOLLOW_invocacao_in_fator753);
                    invocacao();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(178, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "fator");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "fator"


    public static class constante_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "constante"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:180:1: constante : ( STRING | CHAR | INT | TRUE | FALSE );
    public final lingiParser.constante_return constante() throws RecognitionException {
        lingiParser.constante_return retval = new lingiParser.constante_return();
        retval.start = input.LT(1);


        try { dbg.enterRule(getGrammarFileName(), "constante");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(180, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:181:2: ( STRING | CHAR | INT | TRUE | FALSE )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:
            {
            dbg.location(181,2);
            if ( input.LA(1)==CHAR||input.LA(1)==FALSE||input.LA(1)==INT||input.LA(1)==STRING||input.LA(1)==TRUE ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(186, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "constante");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "constante"



    // $ANTLR start "tipo"
    // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:188:1: tipo : ( TD_INT | TD_BOOL | TD_STRING | TD_CHAR | TD_FLOAT | TD_VOID );
    public final void tipo() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "tipo");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(188, 0);

        try {
            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:188:6: ( TD_INT | TD_BOOL | TD_STRING | TD_CHAR | TD_FLOAT | TD_VOID )
            dbg.enterAlt(1);

            // /home/miguel/Documentos/ACS/ATS/Code/Gramatica_MSP/lingi.g:
            {
            dbg.location(188,6);
            if ( (input.LA(1) >= TD_BOOL && input.LA(1) <= TD_VOID) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(194, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "tipo");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "tipo"

    // Delegated rules


 

    public static final BitSet FOLLOW_funcao_in_programa17 = new BitSet(new long[]{0x0000000007E00002L});
    public static final BitSet FOLLOW_cabecalho_in_funcao28 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_funcao30 = new BitSet(new long[]{0x0000000027EAD080L});
    public static final BitSet FOLLOW_corpo_funcao_in_funcao32 = new BitSet(new long[]{0x0008000027EAD080L});
    public static final BitSet FOLLOW_51_in_funcao35 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tipo_in_cabecalho46 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_cabecalho48 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_cabecalho50 = new BitSet(new long[]{0x0000001007E00000L});
    public static final BitSet FOLLOW_argumentos_in_cabecalho52 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_cabecalho55 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracao_in_argumentos66 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_argumentos69 = new BitSet(new long[]{0x0000000007E00000L});
    public static final BitSet FOLLOW_declaracao_in_argumentos71 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_declaracoes_in_corpo_funcao86 = new BitSet(new long[]{0x00000000200AD080L});
    public static final BitSet FOLLOW_statements_in_corpo_funcao93 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracaoExpr_in_declaracoes108 = new BitSet(new long[]{0x0000000007E00002L});
    public static final BitSet FOLLOW_declaracao_in_declaracaoExpr120 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_declaracaoExpr124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tipo_in_declaracao135 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_declaracao137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statements150 = new BitSet(new long[]{0x00000000200AD082L});
    public static final BitSet FOLLOW_atribuicao_in_statement163 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_statement165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifs_in_statement170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whiles_in_statement175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fors_in_statement180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invocacao_in_statement185 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_statement187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_retorna_in_statement192 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_statement194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ler_in_statement199 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_statement201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_escrever_in_statement206 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_statement208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LER_in_ler218 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ler220 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_ler222 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ler224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ESCREVER_in_escrever239 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_escrever241 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_escrever243 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_escrever245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atribuicao258 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_atribuicao262 = new BitSet(new long[]{0x0000010088114410L});
    public static final BitSet FOLLOW_expr_in_atribuicao264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifs276 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ifs278 = new BitSet(new long[]{0x0000010088114410L});
    public static final BitSet FOLLOW_expr_in_ifs280 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ifs282 = new BitSet(new long[]{0x00020000200AD080L});
    public static final BitSet FOLLOW_bloco_in_ifs286 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ifsElse_in_ifs290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_ifsElse303 = new BitSet(new long[]{0x00020000200AD080L});
    public static final BitSet FOLLOW_bloco_in_ifsElse308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whiles318 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_whiles322 = new BitSet(new long[]{0x0000010088114410L});
    public static final BitSet FOLLOW_expr_in_whiles324 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_whiles326 = new BitSet(new long[]{0x00020000200AD080L});
    public static final BitSet FOLLOW_bloco_in_whiles331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_fors343 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_fors345 = new BitSet(new long[]{0x0000010088114410L});
    public static final BitSet FOLLOW_forsexpr_in_fors347 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_fors349 = new BitSet(new long[]{0x0000010088114410L});
    public static final BitSet FOLLOW_expr_in_fors351 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_fors353 = new BitSet(new long[]{0x0000010088114410L});
    public static final BitSet FOLLOW_forsexpr_in_fors355 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_fors357 = new BitSet(new long[]{0x00020000200AD080L});
    public static final BitSet FOLLOW_bloco_in_fors359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_forsexpr368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atribuicao_in_forsexpr373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_invocacao384 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_invocacao386 = new BitSet(new long[]{0x0000010088114410L});
    public static final BitSet FOLLOW_args_in_invocacao388 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_invocacao390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_retorna400 = new BitSet(new long[]{0x0000010088114410L});
    public static final BitSet FOLLOW_expr_in_retorna402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_bloco413 = new BitSet(new long[]{0x00000000200AD080L});
    public static final BitSet FOLLOW_statements_in_bloco415 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_bloco417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_bloco422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_args432 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_argsAux_in_args434 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_argsAux446 = new BitSet(new long[]{0x0000010088114410L});
    public static final BitSet FOLLOW_expr_in_argsAux448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpr_in_expr458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpr_in_orExpr468 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_orExprAux_in_orExpr470 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_opOr_in_orExprAux481 = new BitSet(new long[]{0x0000010088114410L});
    public static final BitSet FOLLOW_andExpr_in_orExprAux483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalExpr_in_andExpr496 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_andExprAux_in_andExpr498 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_opAnd_in_andExprAux508 = new BitSet(new long[]{0x0000010088114410L});
    public static final BitSet FOLLOW_equalExpr_in_andExprAux510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addExpr_in_equalExpr524 = new BitSet(new long[]{0x0001D80100000002L});
    public static final BitSet FOLLOW_equalExprAux_in_equalExpr526 = new BitSet(new long[]{0x0001D80100000002L});
    public static final BitSet FOLLOW_opRel_in_equalExprAux538 = new BitSet(new long[]{0x0000010088114410L});
    public static final BitSet FOLLOW_addExpr_in_equalExprAux540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExpr_in_addExpr555 = new BitSet(new long[]{0x0000014000000002L});
    public static final BitSet FOLLOW_addExprAux_in_addExpr557 = new BitSet(new long[]{0x0000014000000002L});
    public static final BitSet FOLLOW_opAdd_in_addExprAux567 = new BitSet(new long[]{0x0000010088114410L});
    public static final BitSet FOLLOW_multExpr_in_addExprAux569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notExpr_in_multExpr579 = new BitSet(new long[]{0x0000022200000002L});
    public static final BitSet FOLLOW_multExprAux_in_multExpr581 = new BitSet(new long[]{0x0000022200000002L});
    public static final BitSet FOLLOW_opMul_in_multExprAux591 = new BitSet(new long[]{0x0000010088114410L});
    public static final BitSet FOLLOW_notExpr_in_multExprAux593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_opNot_in_notExpr607 = new BitSet(new long[]{0x0000010008114410L});
    public static final BitSet FOLLOW_negationExpr_in_notExpr611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_negationExpr624 = new BitSet(new long[]{0x0000000008114410L});
    public static final BitSet FOLLOW_fator_in_negationExpr628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_opOr673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_opAnd683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_opNot728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fator738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constante_in_fator746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invocacao_in_fator753 = new BitSet(new long[]{0x0000000000000002L});

}