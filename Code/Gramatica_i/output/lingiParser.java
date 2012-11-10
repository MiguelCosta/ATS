// $ANTLR 3.4 C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g 2012-11-10 19:43:06

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class lingiParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMENT", "ELSE", "ESC_SEQ", "EXPONENT", "FALSE", "FLOAT", "FOR", "HEX_DIGIT", "ID", "IF", "INT", "OCTAL_ESC", "RETURN", "STRING", "TD_BOOL", "TD_FLOAT", "TD_INT", "TD_STRING", "TD_VOID", "TRUE", "UNICODE_ESC", "WHILE", "WS", "'!'", "'!='", "'%'", "'&&'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", "';'", "'<'", "'<='", "'='", "'=='", "'>'", "'>='", "'{'", "'||'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
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
    public static final int CHAR=4;
    public static final int COMMENT=5;
    public static final int ELSE=6;
    public static final int ESC_SEQ=7;
    public static final int EXPONENT=8;
    public static final int FALSE=9;
    public static final int FLOAT=10;
    public static final int FOR=11;
    public static final int HEX_DIGIT=12;
    public static final int ID=13;
    public static final int IF=14;
    public static final int INT=15;
    public static final int OCTAL_ESC=16;
    public static final int RETURN=17;
    public static final int STRING=18;
    public static final int TD_BOOL=19;
    public static final int TD_FLOAT=20;
    public static final int TD_INT=21;
    public static final int TD_STRING=22;
    public static final int TD_VOID=23;
    public static final int TRUE=24;
    public static final int UNICODE_ESC=25;
    public static final int WHILE=26;
    public static final int WS=27;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "addExpr", "opRel", "atribuicao", "constante", "opAdd", 
    "argumentos", "equalExpr", "fator", "corpo_funcao", "cabecalho", "programa", 
    "negationExpr", "args", "orExpr", "opAnd", "retorna", "statements", 
    "whiles", "fors", "opOr", "ifs", "invocacao", "declaracoes", "bloco", 
    "statement", "opNot", "multExpr", "funcao", "declaracao", "opMul", "andExpr", 
    "tipo", "expr", "notExpr"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false, false, false, false, false, false, 
        false, false
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
    public String getGrammarFileName() { return "C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g"; }



    // $ANTLR start "programa"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:4:1: programa : ( funcao )+ ;
    public final void programa() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "programa");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(4, 0);

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:4:9: ( ( funcao )+ )
            dbg.enterAlt(1);

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:4:11: ( funcao )+
            {
            dbg.location(4,11);
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:4:11: ( funcao )+
            int cnt1=0;
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

            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:4:11: funcao
            	    {
            	    dbg.location(4,11);
            	    pushFollow(FOLLOW_funcao_in_programa10);
            	    funcao();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt1++;
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
        dbg.location(5, 1);

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
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:7:1: funcao : cabecalho '{' ( corpo_funcao )+ '}' ;
    public final void funcao() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "funcao");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(7, 0);

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:7:8: ( cabecalho '{' ( corpo_funcao )+ '}' )
            dbg.enterAlt(1);

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:7:10: cabecalho '{' ( corpo_funcao )+ '}'
            {
            dbg.location(7,10);
            pushFollow(FOLLOW_cabecalho_in_funcao21);
            cabecalho();

            state._fsp--;

            dbg.location(7,20);
            match(input,46,FOLLOW_46_in_funcao23); 
            dbg.location(7,24);
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:7:24: ( corpo_funcao )+
            int cnt2=0;
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==FOR||(LA2_0 >= ID && LA2_0 <= IF)||LA2_0==RETURN||(LA2_0 >= TD_BOOL && LA2_0 <= TD_VOID)||LA2_0==WHILE) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:7:24: corpo_funcao
            	    {
            	    dbg.location(7,24);
            	    pushFollow(FOLLOW_corpo_funcao_in_funcao25);
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

            dbg.location(7,38);
            match(input,48,FOLLOW_48_in_funcao28); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(8, 1);

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
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:10:1: cabecalho : tipo ID '(' ( argumentos )? ')' ;
    public final void cabecalho() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "cabecalho");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(10, 0);

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:11:2: ( tipo ID '(' ( argumentos )? ')' )
            dbg.enterAlt(1);

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:11:4: tipo ID '(' ( argumentos )? ')'
            {
            dbg.location(11,4);
            pushFollow(FOLLOW_tipo_in_cabecalho39);
            tipo();

            state._fsp--;

            dbg.location(11,9);
            match(input,ID,FOLLOW_ID_in_cabecalho41); 
            dbg.location(11,12);
            match(input,32,FOLLOW_32_in_cabecalho43); 
            dbg.location(11,16);
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:11:16: ( argumentos )?
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

                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:11:16: argumentos
                    {
                    dbg.location(11,16);
                    pushFollow(FOLLOW_argumentos_in_cabecalho45);
                    argumentos();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(3);}

            dbg.location(11,28);
            match(input,33,FOLLOW_33_in_cabecalho48); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(12, 1);

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
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:14:1: argumentos : declaracao ( ',' declaracao )* ;
    public final void argumentos() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "argumentos");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(14, 0);

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:15:2: ( declaracao ( ',' declaracao )* )
            dbg.enterAlt(1);

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:15:4: declaracao ( ',' declaracao )*
            {
            dbg.location(15,4);
            pushFollow(FOLLOW_declaracao_in_argumentos59);
            declaracao();

            state._fsp--;

            dbg.location(15,15);
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:15:15: ( ',' declaracao )*
            try { dbg.enterSubRule(4);

            loop4:
            do {
                int alt4=2;
                try { dbg.enterDecision(4, decisionCanBacktrack[4]);

                int LA4_0 = input.LA(1);

                if ( (LA4_0==36) ) {
                    alt4=1;
                }


                } finally {dbg.exitDecision(4);}

                switch (alt4) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:15:16: ',' declaracao
            	    {
            	    dbg.location(15,16);
            	    match(input,36,FOLLOW_36_in_argumentos62); 
            	    dbg.location(15,20);
            	    pushFollow(FOLLOW_declaracao_in_argumentos64);
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
        dbg.location(16, 1);

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
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:18:1: corpo_funcao : ( declaracoes )? statements ;
    public final void corpo_funcao() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "corpo_funcao");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(18, 0);

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:19:2: ( ( declaracoes )? statements )
            dbg.enterAlt(1);

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:19:4: ( declaracoes )? statements
            {
            dbg.location(19,4);
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:19:4: ( declaracoes )?
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

                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:19:5: declaracoes
                    {
                    dbg.location(19,5);
                    pushFollow(FOLLOW_declaracoes_in_corpo_funcao79);
                    declaracoes();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}

            dbg.location(19,19);
            pushFollow(FOLLOW_statements_in_corpo_funcao83);
            statements();

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
        dbg.location(20, 1);

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
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:22:1: declaracoes : ( declaracao ( '=' expr )? ';' )+ ;
    public final void declaracoes() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "declaracoes");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(22, 0);

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:23:2: ( ( declaracao ( '=' expr )? ';' )+ )
            dbg.enterAlt(1);

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:23:4: ( declaracao ( '=' expr )? ';' )+
            {
            dbg.location(23,4);
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:23:4: ( declaracao ( '=' expr )? ';' )+
            int cnt7=0;
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7, decisionCanBacktrack[7]);

                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= TD_BOOL && LA7_0 <= TD_VOID)) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:23:5: declaracao ( '=' expr )? ';'
            	    {
            	    dbg.location(23,5);
            	    pushFollow(FOLLOW_declaracao_in_declaracoes95);
            	    declaracao();

            	    state._fsp--;

            	    dbg.location(23,16);
            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:23:16: ( '=' expr )?
            	    int alt6=2;
            	    try { dbg.enterSubRule(6);
            	    try { dbg.enterDecision(6, decisionCanBacktrack[6]);

            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==42) ) {
            	        alt6=1;
            	    }
            	    } finally {dbg.exitDecision(6);}

            	    switch (alt6) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:23:17: '=' expr
            	            {
            	            dbg.location(23,17);
            	            match(input,42,FOLLOW_42_in_declaracoes98); 
            	            dbg.location(23,21);
            	            pushFollow(FOLLOW_expr_in_declaracoes100);
            	            expr();

            	            state._fsp--;


            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(6);}

            	    dbg.location(23,28);
            	    match(input,39,FOLLOW_39_in_declaracoes104); 

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
        dbg.location(24, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "declaracoes");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "declaracoes"



    // $ANTLR start "declaracao"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:26:1: declaracao : tipo ID ;
    public final void declaracao() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "declaracao");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(26, 0);

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:27:2: ( tipo ID )
            dbg.enterAlt(1);

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:27:4: tipo ID
            {
            dbg.location(27,4);
            pushFollow(FOLLOW_tipo_in_declaracao117);
            tipo();

            state._fsp--;

            dbg.location(27,9);
            match(input,ID,FOLLOW_ID_in_declaracao119); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(28, 1);

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
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:30:1: statements : ( statement )+ ;
    public final void statements() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "statements");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(30, 0);

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:31:2: ( ( statement )+ )
            dbg.enterAlt(1);

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:31:4: ( statement )+
            {
            dbg.location(31,4);
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:31:4: ( statement )+
            int cnt8=0;
            try { dbg.enterSubRule(8);

            loop8:
            do {
                int alt8=2;
                try { dbg.enterDecision(8, decisionCanBacktrack[8]);

                switch ( input.LA(1) ) {
                case ID:
                    {
                    alt8=1;
                    }
                    break;
                case IF:
                    {
                    alt8=1;
                    }
                    break;
                case WHILE:
                    {
                    alt8=1;
                    }
                    break;
                case FOR:
                    {
                    alt8=1;
                    }
                    break;
                case RETURN:
                    {
                    alt8=1;
                    }
                    break;

                }

                } finally {dbg.exitDecision(8);}

                switch (alt8) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:31:4: statement
            	    {
            	    dbg.location(31,4);
            	    pushFollow(FOLLOW_statement_in_statements130);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt8++;
            } while (true);
            } finally {dbg.exitSubRule(8);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(32, 1);

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
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:34:1: statement : ( atribuicao ';' | ifs | whiles | fors | invocacao ';' | retorna ';' );
    public final void statement() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(34, 0);

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:35:2: ( atribuicao ';' | ifs | whiles | fors | invocacao ';' | retorna ';' )
            int alt9=6;
            try { dbg.enterDecision(9, decisionCanBacktrack[9]);

            switch ( input.LA(1) ) {
            case ID:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==42) ) {
                    alt9=1;
                }
                else if ( (LA9_1==32) ) {
                    alt9=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case IF:
                {
                alt9=2;
                }
                break;
            case WHILE:
                {
                alt9=3;
                }
                break;
            case FOR:
                {
                alt9=4;
                }
                break;
            case RETURN:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:35:4: atribuicao ';'
                    {
                    dbg.location(35,4);
                    pushFollow(FOLLOW_atribuicao_in_statement143);
                    atribuicao();

                    state._fsp--;

                    dbg.location(35,15);
                    match(input,39,FOLLOW_39_in_statement145); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:36:4: ifs
                    {
                    dbg.location(36,4);
                    pushFollow(FOLLOW_ifs_in_statement150);
                    ifs();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:37:4: whiles
                    {
                    dbg.location(37,4);
                    pushFollow(FOLLOW_whiles_in_statement155);
                    whiles();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:38:4: fors
                    {
                    dbg.location(38,4);
                    pushFollow(FOLLOW_fors_in_statement160);
                    fors();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:39:4: invocacao ';'
                    {
                    dbg.location(39,4);
                    pushFollow(FOLLOW_invocacao_in_statement165);
                    invocacao();

                    state._fsp--;

                    dbg.location(39,14);
                    match(input,39,FOLLOW_39_in_statement167); 

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:40:4: retorna ';'
                    {
                    dbg.location(40,4);
                    pushFollow(FOLLOW_retorna_in_statement172);
                    retorna();

                    state._fsp--;

                    dbg.location(40,12);
                    match(input,39,FOLLOW_39_in_statement174); 

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
        dbg.location(41, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "statement"



    // $ANTLR start "atribuicao"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:43:1: atribuicao : ID '=' expr ;
    public final void atribuicao() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "atribuicao");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(43, 0);

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:44:2: ( ID '=' expr )
            dbg.enterAlt(1);

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:44:4: ID '=' expr
            {
            dbg.location(44,4);
            match(input,ID,FOLLOW_ID_in_atribuicao185); 
            dbg.location(44,7);
            match(input,42,FOLLOW_42_in_atribuicao187); 
            dbg.location(44,11);
            pushFollow(FOLLOW_expr_in_atribuicao189);
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
        dbg.location(45, 1);

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
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:47:1: ifs : IF '(' expr ')' bloco ( ELSE bloco )? ;
    public final void ifs() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "ifs");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(47, 0);

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:47:5: ( IF '(' expr ')' bloco ( ELSE bloco )? )
            dbg.enterAlt(1);

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:47:7: IF '(' expr ')' bloco ( ELSE bloco )?
            {
            dbg.location(47,7);
            match(input,IF,FOLLOW_IF_in_ifs199); 
            dbg.location(47,10);
            match(input,32,FOLLOW_32_in_ifs201); 
            dbg.location(47,14);
            pushFollow(FOLLOW_expr_in_ifs203);
            expr();

            state._fsp--;

            dbg.location(47,19);
            match(input,33,FOLLOW_33_in_ifs205); 
            dbg.location(47,23);
            pushFollow(FOLLOW_bloco_in_ifs207);
            bloco();

            state._fsp--;

            dbg.location(47,29);
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:47:29: ( ELSE bloco )?
            int alt10=2;
            try { dbg.enterSubRule(10);
            try { dbg.enterDecision(10, decisionCanBacktrack[10]);

            int LA10_0 = input.LA(1);

            if ( (LA10_0==ELSE) ) {
                alt10=1;
            }
            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:47:30: ELSE bloco
                    {
                    dbg.location(47,30);
                    match(input,ELSE,FOLLOW_ELSE_in_ifs210); 
                    dbg.location(47,35);
                    pushFollow(FOLLOW_bloco_in_ifs212);
                    bloco();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(10);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(48, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ifs");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "ifs"



    // $ANTLR start "whiles"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:50:1: whiles : WHILE '(' expr ')' bloco ;
    public final void whiles() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "whiles");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(50, 0);

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:50:8: ( WHILE '(' expr ')' bloco )
            dbg.enterAlt(1);

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:50:10: WHILE '(' expr ')' bloco
            {
            dbg.location(50,10);
            match(input,WHILE,FOLLOW_WHILE_in_whiles224); 
            dbg.location(50,16);
            match(input,32,FOLLOW_32_in_whiles226); 
            dbg.location(50,20);
            pushFollow(FOLLOW_expr_in_whiles228);
            expr();

            state._fsp--;

            dbg.location(50,25);
            match(input,33,FOLLOW_33_in_whiles230); 
            dbg.location(50,29);
            pushFollow(FOLLOW_bloco_in_whiles232);
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
        dbg.location(51, 1);

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
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:53:1: fors : FOR '(' ( expr | atribuicao ) ';' expr ';' ( expr | atribuicao ) ')' bloco ;
    public final void fors() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "fors");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(53, 0);

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:53:6: ( FOR '(' ( expr | atribuicao ) ';' expr ';' ( expr | atribuicao ) ')' bloco )
            dbg.enterAlt(1);

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:53:8: FOR '(' ( expr | atribuicao ) ';' expr ';' ( expr | atribuicao ) ')' bloco
            {
            dbg.location(53,8);
            match(input,FOR,FOLLOW_FOR_in_fors242); 
            dbg.location(53,12);
            match(input,32,FOLLOW_32_in_fors244); 
            dbg.location(53,16);
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:53:16: ( expr | atribuicao )
            int alt11=2;
            try { dbg.enterSubRule(11);
            try { dbg.enterDecision(11, decisionCanBacktrack[11]);

            int LA11_0 = input.LA(1);

            if ( (LA11_0==CHAR||LA11_0==FALSE||LA11_0==INT||LA11_0==STRING||LA11_0==TRUE||LA11_0==28||LA11_0==37) ) {
                alt11=1;
            }
            else if ( (LA11_0==ID) ) {
                int LA11_2 = input.LA(2);

                if ( ((LA11_2 >= 29 && LA11_2 <= 32)||(LA11_2 >= 34 && LA11_2 <= 35)||(LA11_2 >= 37 && LA11_2 <= 41)||(LA11_2 >= 43 && LA11_2 <= 45)||LA11_2==47) ) {
                    alt11=1;
                }
                else if ( (LA11_2==42) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
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

                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:53:17: expr
                    {
                    dbg.location(53,17);
                    pushFollow(FOLLOW_expr_in_fors247);
                    expr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:53:22: atribuicao
                    {
                    dbg.location(53,22);
                    pushFollow(FOLLOW_atribuicao_in_fors249);
                    atribuicao();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(11);}

            dbg.location(53,34);
            match(input,39,FOLLOW_39_in_fors252); 
            dbg.location(53,38);
            pushFollow(FOLLOW_expr_in_fors254);
            expr();

            state._fsp--;

            dbg.location(53,43);
            match(input,39,FOLLOW_39_in_fors256); 
            dbg.location(53,47);
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:53:47: ( expr | atribuicao )
            int alt12=2;
            try { dbg.enterSubRule(12);
            try { dbg.enterDecision(12, decisionCanBacktrack[12]);

            int LA12_0 = input.LA(1);

            if ( (LA12_0==CHAR||LA12_0==FALSE||LA12_0==INT||LA12_0==STRING||LA12_0==TRUE||LA12_0==28||LA12_0==37) ) {
                alt12=1;
            }
            else if ( (LA12_0==ID) ) {
                int LA12_2 = input.LA(2);

                if ( ((LA12_2 >= 29 && LA12_2 <= 35)||(LA12_2 >= 37 && LA12_2 <= 38)||(LA12_2 >= 40 && LA12_2 <= 41)||(LA12_2 >= 43 && LA12_2 <= 45)||LA12_2==47) ) {
                    alt12=1;
                }
                else if ( (LA12_2==42) ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(12);}

            switch (alt12) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:53:48: expr
                    {
                    dbg.location(53,48);
                    pushFollow(FOLLOW_expr_in_fors259);
                    expr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:53:53: atribuicao
                    {
                    dbg.location(53,53);
                    pushFollow(FOLLOW_atribuicao_in_fors261);
                    atribuicao();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(12);}

            dbg.location(53,65);
            match(input,33,FOLLOW_33_in_fors264); 
            dbg.location(53,69);
            pushFollow(FOLLOW_bloco_in_fors266);
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
        dbg.location(54, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "fors");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "fors"



    // $ANTLR start "invocacao"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:56:1: invocacao : ID '(' args ')' ;
    public final void invocacao() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "invocacao");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(56, 0);

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:57:2: ( ID '(' args ')' )
            dbg.enterAlt(1);

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:57:4: ID '(' args ')'
            {
            dbg.location(57,4);
            match(input,ID,FOLLOW_ID_in_invocacao277); 
            dbg.location(57,7);
            match(input,32,FOLLOW_32_in_invocacao279); 
            dbg.location(57,11);
            pushFollow(FOLLOW_args_in_invocacao281);
            args();

            state._fsp--;

            dbg.location(57,16);
            match(input,33,FOLLOW_33_in_invocacao283); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(58, 1);

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
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:60:1: retorna : RETURN expr ;
    public final void retorna() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "retorna");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(60, 0);

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:60:9: ( RETURN expr )
            dbg.enterAlt(1);

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:60:11: RETURN expr
            {
            dbg.location(60,11);
            match(input,RETURN,FOLLOW_RETURN_in_retorna293); 
            dbg.location(60,18);
            pushFollow(FOLLOW_expr_in_retorna295);
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
        dbg.location(61, 1);

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
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:63:1: bloco : ( '{' statements '}' | statement );
    public final void bloco() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "bloco");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(63, 0);

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:63:7: ( '{' statements '}' | statement )
            int alt13=2;
            try { dbg.enterDecision(13, decisionCanBacktrack[13]);

            int LA13_0 = input.LA(1);

            if ( (LA13_0==46) ) {
                alt13=1;
            }
            else if ( (LA13_0==FOR||(LA13_0 >= ID && LA13_0 <= IF)||LA13_0==RETURN||LA13_0==WHILE) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(13);}

            switch (alt13) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:63:9: '{' statements '}'
                    {
                    dbg.location(63,9);
                    match(input,46,FOLLOW_46_in_bloco306); 
                    dbg.location(63,13);
                    pushFollow(FOLLOW_statements_in_bloco308);
                    statements();

                    state._fsp--;

                    dbg.location(63,24);
                    match(input,48,FOLLOW_48_in_bloco310); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:64:4: statement
                    {
                    dbg.location(64,4);
                    pushFollow(FOLLOW_statement_in_bloco315);
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
        dbg.location(65, 1);

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
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:68:1: args : expr ( ',' expr )* ;
    public final void args() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "args");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(68, 0);

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:68:6: ( expr ( ',' expr )* )
            dbg.enterAlt(1);

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:68:8: expr ( ',' expr )*
            {
            dbg.location(68,8);
            pushFollow(FOLLOW_expr_in_args326);
            expr();

            state._fsp--;

            dbg.location(68,13);
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:68:13: ( ',' expr )*
            try { dbg.enterSubRule(14);

            loop14:
            do {
                int alt14=2;
                try { dbg.enterDecision(14, decisionCanBacktrack[14]);

                int LA14_0 = input.LA(1);

                if ( (LA14_0==36) ) {
                    alt14=1;
                }


                } finally {dbg.exitDecision(14);}

                switch (alt14) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:68:14: ',' expr
            	    {
            	    dbg.location(68,14);
            	    match(input,36,FOLLOW_36_in_args329); 
            	    dbg.location(68,18);
            	    pushFollow(FOLLOW_expr_in_args331);
            	    expr();

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
        dbg.location(69, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "args");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "args"



    // $ANTLR start "expr"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:71:1: expr : orExpr ;
    public final void expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(71, 0);

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:71:6: ( orExpr )
            dbg.enterAlt(1);

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:71:8: orExpr
            {
            dbg.location(71,8);
            pushFollow(FOLLOW_orExpr_in_expr345);
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
        dbg.location(72, 1);

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
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:74:1: orExpr : andExpr ( opOr andExpr )* ;
    public final void orExpr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "orExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(74, 0);

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:74:8: ( andExpr ( opOr andExpr )* )
            dbg.enterAlt(1);

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:74:10: andExpr ( opOr andExpr )*
            {
            dbg.location(74,10);
            pushFollow(FOLLOW_andExpr_in_orExpr355);
            andExpr();

            state._fsp--;

            dbg.location(74,18);
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:74:18: ( opOr andExpr )*
            try { dbg.enterSubRule(15);

            loop15:
            do {
                int alt15=2;
                try { dbg.enterDecision(15, decisionCanBacktrack[15]);

                int LA15_0 = input.LA(1);

                if ( (LA15_0==47) ) {
                    alt15=1;
                }


                } finally {dbg.exitDecision(15);}

                switch (alt15) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:74:19: opOr andExpr
            	    {
            	    dbg.location(74,19);
            	    pushFollow(FOLLOW_opOr_in_orExpr358);
            	    opOr();

            	    state._fsp--;

            	    dbg.location(74,24);
            	    pushFollow(FOLLOW_andExpr_in_orExpr360);
            	    andExpr();

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
        dbg.location(75, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "orExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "orExpr"



    // $ANTLR start "andExpr"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:77:1: andExpr : equalExpr ( opAnd equalExpr )* ;
    public final void andExpr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "andExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(77, 0);

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:77:9: ( equalExpr ( opAnd equalExpr )* )
            dbg.enterAlt(1);

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:77:11: equalExpr ( opAnd equalExpr )*
            {
            dbg.location(77,11);
            pushFollow(FOLLOW_equalExpr_in_andExpr373);
            equalExpr();

            state._fsp--;

            dbg.location(77,20);
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:77:20: ( opAnd equalExpr )*
            try { dbg.enterSubRule(16);

            loop16:
            do {
                int alt16=2;
                try { dbg.enterDecision(16, decisionCanBacktrack[16]);

                int LA16_0 = input.LA(1);

                if ( (LA16_0==31) ) {
                    alt16=1;
                }


                } finally {dbg.exitDecision(16);}

                switch (alt16) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:77:21: opAnd equalExpr
            	    {
            	    dbg.location(77,21);
            	    pushFollow(FOLLOW_opAnd_in_andExpr375);
            	    opAnd();

            	    state._fsp--;

            	    dbg.location(77,27);
            	    pushFollow(FOLLOW_equalExpr_in_andExpr377);
            	    equalExpr();

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
        dbg.location(78, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "andExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "andExpr"



    // $ANTLR start "equalExpr"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:80:1: equalExpr : addExpr ( opRel addExpr )* ;
    public final void equalExpr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "equalExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(80, 0);

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:81:2: ( addExpr ( opRel addExpr )* )
            dbg.enterAlt(1);

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:81:4: addExpr ( opRel addExpr )*
            {
            dbg.location(81,4);
            pushFollow(FOLLOW_addExpr_in_equalExpr390);
            addExpr();

            state._fsp--;

            dbg.location(81,11);
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:81:11: ( opRel addExpr )*
            try { dbg.enterSubRule(17);

            loop17:
            do {
                int alt17=2;
                try { dbg.enterDecision(17, decisionCanBacktrack[17]);

                int LA17_0 = input.LA(1);

                if ( (LA17_0==29||(LA17_0 >= 40 && LA17_0 <= 41)||(LA17_0 >= 43 && LA17_0 <= 45)) ) {
                    alt17=1;
                }


                } finally {dbg.exitDecision(17);}

                switch (alt17) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:81:12: opRel addExpr
            	    {
            	    dbg.location(81,12);
            	    pushFollow(FOLLOW_opRel_in_equalExpr392);
            	    opRel();

            	    state._fsp--;

            	    dbg.location(81,18);
            	    pushFollow(FOLLOW_addExpr_in_equalExpr394);
            	    addExpr();

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
        dbg.location(82, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "equalExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "equalExpr"



    // $ANTLR start "addExpr"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:84:1: addExpr : multExpr ( opAdd multExpr )* ;
    public final void addExpr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "addExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(84, 0);

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:84:9: ( multExpr ( opAdd multExpr )* )
            dbg.enterAlt(1);

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:84:11: multExpr ( opAdd multExpr )*
            {
            dbg.location(84,11);
            pushFollow(FOLLOW_multExpr_in_addExpr407);
            multExpr();

            state._fsp--;

            dbg.location(84,19);
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:84:19: ( opAdd multExpr )*
            try { dbg.enterSubRule(18);

            loop18:
            do {
                int alt18=2;
                try { dbg.enterDecision(18, decisionCanBacktrack[18]);

                int LA18_0 = input.LA(1);

                if ( (LA18_0==35||LA18_0==37) ) {
                    alt18=1;
                }


                } finally {dbg.exitDecision(18);}

                switch (alt18) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:84:20: opAdd multExpr
            	    {
            	    dbg.location(84,20);
            	    pushFollow(FOLLOW_opAdd_in_addExpr409);
            	    opAdd();

            	    state._fsp--;

            	    dbg.location(84,26);
            	    pushFollow(FOLLOW_multExpr_in_addExpr411);
            	    multExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);
            } finally {dbg.exitSubRule(18);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(85, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "addExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "addExpr"



    // $ANTLR start "multExpr"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:87:1: multExpr : notExpr ( opMul notExpr )* ;
    public final void multExpr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "multExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(87, 0);

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:87:9: ( notExpr ( opMul notExpr )* )
            dbg.enterAlt(1);

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:87:11: notExpr ( opMul notExpr )*
            {
            dbg.location(87,11);
            pushFollow(FOLLOW_notExpr_in_multExpr423);
            notExpr();

            state._fsp--;

            dbg.location(87,18);
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:87:18: ( opMul notExpr )*
            try { dbg.enterSubRule(19);

            loop19:
            do {
                int alt19=2;
                try { dbg.enterDecision(19, decisionCanBacktrack[19]);

                int LA19_0 = input.LA(1);

                if ( (LA19_0==30||LA19_0==34||LA19_0==38) ) {
                    alt19=1;
                }


                } finally {dbg.exitDecision(19);}

                switch (alt19) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:87:19: opMul notExpr
            	    {
            	    dbg.location(87,19);
            	    pushFollow(FOLLOW_opMul_in_multExpr425);
            	    opMul();

            	    state._fsp--;

            	    dbg.location(87,25);
            	    pushFollow(FOLLOW_notExpr_in_multExpr427);
            	    notExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);
            } finally {dbg.exitSubRule(19);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(88, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "multExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "multExpr"



    // $ANTLR start "notExpr"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:90:1: notExpr : ( opNot )? negationExpr ;
    public final void notExpr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "notExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(90, 0);

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:90:9: ( ( opNot )? negationExpr )
            dbg.enterAlt(1);

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:90:11: ( opNot )? negationExpr
            {
            dbg.location(90,11);
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:90:11: ( opNot )?
            int alt20=2;
            try { dbg.enterSubRule(20);
            try { dbg.enterDecision(20, decisionCanBacktrack[20]);

            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            } finally {dbg.exitDecision(20);}

            switch (alt20) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:90:12: opNot
                    {
                    dbg.location(90,12);
                    pushFollow(FOLLOW_opNot_in_notExpr441);
                    opNot();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(20);}

            dbg.location(90,20);
            pushFollow(FOLLOW_negationExpr_in_notExpr445);
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
        dbg.location(91, 1);

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
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:93:1: negationExpr : ( '-' )? fator ;
    public final void negationExpr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "negationExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(93, 0);

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:94:2: ( ( '-' )? fator )
            dbg.enterAlt(1);

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:94:4: ( '-' )? fator
            {
            dbg.location(94,4);
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:94:4: ( '-' )?
            int alt21=2;
            try { dbg.enterSubRule(21);
            try { dbg.enterDecision(21, decisionCanBacktrack[21]);

            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            } finally {dbg.exitDecision(21);}

            switch (alt21) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:94:5: '-'
                    {
                    dbg.location(94,5);
                    match(input,37,FOLLOW_37_in_negationExpr458); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(21);}

            dbg.location(94,11);
            pushFollow(FOLLOW_fator_in_negationExpr462);
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
        dbg.location(95, 1);

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
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:97:1: opAdd : ( '+' | '-' );
    public final void opAdd() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "opAdd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(97, 0);

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:97:7: ( '+' | '-' )
            dbg.enterAlt(1);

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:
            {
            dbg.location(97,7);
            if ( input.LA(1)==35||input.LA(1)==37 ) {
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
        dbg.location(99, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "opAdd");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "opAdd"



    // $ANTLR start "opMul"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:101:1: opMul : ( '*' | '/' | '%' );
    public final void opMul() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "opMul");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(101, 0);

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:101:7: ( '*' | '/' | '%' )
            dbg.enterAlt(1);

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:
            {
            dbg.location(101,7);
            if ( input.LA(1)==30||input.LA(1)==34||input.LA(1)==38 ) {
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
        dbg.location(104, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "opMul");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "opMul"



    // $ANTLR start "opOr"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:106:1: opOr : '||' ;
    public final void opOr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "opOr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(106, 0);

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:106:6: ( '||' )
            dbg.enterAlt(1);

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:106:8: '||'
            {
            dbg.location(106,8);
            match(input,47,FOLLOW_47_in_opOr507); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(107, 1);

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
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:109:1: opAnd : '&&' ;
    public final void opAnd() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "opAnd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(109, 0);

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:109:7: ( '&&' )
            dbg.enterAlt(1);

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:109:9: '&&'
            {
            dbg.location(109,9);
            match(input,31,FOLLOW_31_in_opAnd517); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(110, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "opAnd");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "opAnd"



    // $ANTLR start "opRel"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:112:1: opRel : ( '>' | '<' | '>=' | '<=' | '==' | '!=' );
    public final void opRel() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "opRel");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(112, 0);

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:112:7: ( '>' | '<' | '>=' | '<=' | '==' | '!=' )
            dbg.enterAlt(1);

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:
            {
            dbg.location(112,7);
            if ( input.LA(1)==29||(input.LA(1) >= 40 && input.LA(1) <= 41)||(input.LA(1) >= 43 && input.LA(1) <= 45) ) {
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
        dbg.location(118, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "opRel");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "opRel"



    // $ANTLR start "opNot"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:120:1: opNot : '!' ;
    public final void opNot() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "opNot");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(120, 0);

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:120:7: ( '!' )
            dbg.enterAlt(1);

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:120:9: '!'
            {
            dbg.location(120,9);
            match(input,28,FOLLOW_28_in_opNot562); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(121, 1);

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
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:123:1: fator : ( ID | constante | invocacao );
    public final void fator() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "fator");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(123, 0);

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:123:7: ( ID | constante | invocacao )
            int alt22=3;
            try { dbg.enterDecision(22, decisionCanBacktrack[22]);

            int LA22_0 = input.LA(1);

            if ( (LA22_0==ID) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==32) ) {
                    alt22=3;
                }
                else if ( ((LA22_1 >= 29 && LA22_1 <= 31)||(LA22_1 >= 33 && LA22_1 <= 41)||(LA22_1 >= 43 && LA22_1 <= 45)||LA22_1==47) ) {
                    alt22=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA22_0==CHAR||LA22_0==FALSE||LA22_0==INT||LA22_0==STRING||LA22_0==TRUE) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(22);}

            switch (alt22) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:123:9: ID
                    {
                    dbg.location(123,9);
                    match(input,ID,FOLLOW_ID_in_fator572); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:124:4: constante
                    {
                    dbg.location(124,4);
                    pushFollow(FOLLOW_constante_in_fator577);
                    constante();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:125:4: invocacao
                    {
                    dbg.location(125,4);
                    pushFollow(FOLLOW_invocacao_in_fator582);
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
        dbg.location(126, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "fator");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "fator"



    // $ANTLR start "constante"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:128:1: constante : ( STRING | CHAR | INT | TRUE | FALSE );
    public final void constante() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "constante");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(128, 0);

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:129:2: ( STRING | CHAR | INT | TRUE | FALSE )
            dbg.enterAlt(1);

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:
            {
            dbg.location(129,2);
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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(134, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "constante");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "constante"



    // $ANTLR start "tipo"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:136:1: tipo : ( TD_INT | TD_BOOL | TD_STRING | TD_FLOAT | TD_VOID );
    public final void tipo() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "tipo");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(136, 0);

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:136:6: ( TD_INT | TD_BOOL | TD_STRING | TD_FLOAT | TD_VOID )
            dbg.enterAlt(1);

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Gramática i--\\lingi.g:
            {
            dbg.location(136,6);
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
        dbg.location(141, 1);

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


 

    public static final BitSet FOLLOW_funcao_in_programa10 = new BitSet(new long[]{0x0000000000F80002L});
    public static final BitSet FOLLOW_cabecalho_in_funcao21 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_funcao23 = new BitSet(new long[]{0x0000000004FA6800L});
    public static final BitSet FOLLOW_corpo_funcao_in_funcao25 = new BitSet(new long[]{0x0001000004FA6800L});
    public static final BitSet FOLLOW_48_in_funcao28 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tipo_in_cabecalho39 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_cabecalho41 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_cabecalho43 = new BitSet(new long[]{0x0000000200F80000L});
    public static final BitSet FOLLOW_argumentos_in_cabecalho45 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_cabecalho48 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracao_in_argumentos59 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_argumentos62 = new BitSet(new long[]{0x0000000000F80000L});
    public static final BitSet FOLLOW_declaracao_in_argumentos64 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_declaracoes_in_corpo_funcao79 = new BitSet(new long[]{0x0000000004026800L});
    public static final BitSet FOLLOW_statements_in_corpo_funcao83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracao_in_declaracoes95 = new BitSet(new long[]{0x0000048000000000L});
    public static final BitSet FOLLOW_42_in_declaracoes98 = new BitSet(new long[]{0x000000201104A210L});
    public static final BitSet FOLLOW_expr_in_declaracoes100 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_declaracoes104 = new BitSet(new long[]{0x0000000000F80002L});
    public static final BitSet FOLLOW_tipo_in_declaracao117 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_declaracao119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statements130 = new BitSet(new long[]{0x0000000004026802L});
    public static final BitSet FOLLOW_atribuicao_in_statement143 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_statement145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifs_in_statement150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whiles_in_statement155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fors_in_statement160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invocacao_in_statement165 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_statement167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_retorna_in_statement172 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_statement174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atribuicao185 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_atribuicao187 = new BitSet(new long[]{0x000000201104A210L});
    public static final BitSet FOLLOW_expr_in_atribuicao189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifs199 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ifs201 = new BitSet(new long[]{0x000000201104A210L});
    public static final BitSet FOLLOW_expr_in_ifs203 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ifs205 = new BitSet(new long[]{0x0000400004026800L});
    public static final BitSet FOLLOW_bloco_in_ifs207 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ELSE_in_ifs210 = new BitSet(new long[]{0x0000400004026800L});
    public static final BitSet FOLLOW_bloco_in_ifs212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whiles224 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_whiles226 = new BitSet(new long[]{0x000000201104A210L});
    public static final BitSet FOLLOW_expr_in_whiles228 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_whiles230 = new BitSet(new long[]{0x0000400004026800L});
    public static final BitSet FOLLOW_bloco_in_whiles232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_fors242 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_fors244 = new BitSet(new long[]{0x000000201104A210L});
    public static final BitSet FOLLOW_expr_in_fors247 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_atribuicao_in_fors249 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_fors252 = new BitSet(new long[]{0x000000201104A210L});
    public static final BitSet FOLLOW_expr_in_fors254 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_fors256 = new BitSet(new long[]{0x000000201104A210L});
    public static final BitSet FOLLOW_expr_in_fors259 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_atribuicao_in_fors261 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_fors264 = new BitSet(new long[]{0x0000400004026800L});
    public static final BitSet FOLLOW_bloco_in_fors266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_invocacao277 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_invocacao279 = new BitSet(new long[]{0x000000201104A210L});
    public static final BitSet FOLLOW_args_in_invocacao281 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_invocacao283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_retorna293 = new BitSet(new long[]{0x000000201104A210L});
    public static final BitSet FOLLOW_expr_in_retorna295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_bloco306 = new BitSet(new long[]{0x0000000004026800L});
    public static final BitSet FOLLOW_statements_in_bloco308 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_bloco310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_bloco315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_args326 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_args329 = new BitSet(new long[]{0x000000201104A210L});
    public static final BitSet FOLLOW_expr_in_args331 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_orExpr_in_expr345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpr_in_orExpr355 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_opOr_in_orExpr358 = new BitSet(new long[]{0x000000201104A210L});
    public static final BitSet FOLLOW_andExpr_in_orExpr360 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_equalExpr_in_andExpr373 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_opAnd_in_andExpr375 = new BitSet(new long[]{0x000000201104A210L});
    public static final BitSet FOLLOW_equalExpr_in_andExpr377 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_addExpr_in_equalExpr390 = new BitSet(new long[]{0x00003B0020000002L});
    public static final BitSet FOLLOW_opRel_in_equalExpr392 = new BitSet(new long[]{0x000000201104A210L});
    public static final BitSet FOLLOW_addExpr_in_equalExpr394 = new BitSet(new long[]{0x00003B0020000002L});
    public static final BitSet FOLLOW_multExpr_in_addExpr407 = new BitSet(new long[]{0x0000002800000002L});
    public static final BitSet FOLLOW_opAdd_in_addExpr409 = new BitSet(new long[]{0x000000201104A210L});
    public static final BitSet FOLLOW_multExpr_in_addExpr411 = new BitSet(new long[]{0x0000002800000002L});
    public static final BitSet FOLLOW_notExpr_in_multExpr423 = new BitSet(new long[]{0x0000004440000002L});
    public static final BitSet FOLLOW_opMul_in_multExpr425 = new BitSet(new long[]{0x000000201104A210L});
    public static final BitSet FOLLOW_notExpr_in_multExpr427 = new BitSet(new long[]{0x0000004440000002L});
    public static final BitSet FOLLOW_opNot_in_notExpr441 = new BitSet(new long[]{0x000000200104A210L});
    public static final BitSet FOLLOW_negationExpr_in_notExpr445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_negationExpr458 = new BitSet(new long[]{0x000000000104A210L});
    public static final BitSet FOLLOW_fator_in_negationExpr462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_opOr507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_opAnd517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_opNot562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fator572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constante_in_fator577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invocacao_in_fator582 = new BitSet(new long[]{0x0000000000000002L});

}