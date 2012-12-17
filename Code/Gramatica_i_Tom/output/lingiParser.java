// $ANTLR 3.4 C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g 2012-12-17 22:26:37

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class lingiParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMENT", "ELSE", "ESC_SEQ", "EXPONENT", "FALSE", "FLOAT", "FOR", "HEX_DIGIT", "ID", "IF", "INT", "OCTAL_ESC", "RETURN", "STRING", "TD_BOOL", "TD_CHAR", "TD_FLOAT", "TD_INT", "TD_STRING", "TD_VOID", "TRUE", "UNICODE_ESC", "WHILE", "WS", "'!'", "'!='", "'%'", "'&&'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", "';'", "'<'", "'<='", "'='", "'=='", "'>'", "'>='", "'{'", "'||'", "'}'"
    };

    public static final int EOF=-1;
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
    public static final int T__49=49;
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
    public static final int TD_CHAR=20;
    public static final int TD_FLOAT=21;
    public static final int TD_INT=22;
    public static final int TD_STRING=23;
    public static final int TD_VOID=24;
    public static final int TRUE=25;
    public static final int UNICODE_ESC=26;
    public static final int WHILE=27;
    public static final int WS=28;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public lingiParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public lingiParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return lingiParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g"; }



    // $ANTLR start "programa"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:4:1: programa : ( funcao )* ;
    public final void programa() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:4:9: ( ( funcao )* )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:4:11: ( funcao )*
            {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:4:11: ( funcao )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= TD_BOOL && LA1_0 <= TD_VOID)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:4:11: funcao
            	    {
            	    pushFollow(FOLLOW_funcao_in_programa10);
            	    funcao();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "programa"



    // $ANTLR start "funcao"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:7:1: funcao : cabecalho '{' ( corpo_funcao )+ '}' ;
    public final void funcao() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:7:8: ( cabecalho '{' ( corpo_funcao )+ '}' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:7:10: cabecalho '{' ( corpo_funcao )+ '}'
            {
            pushFollow(FOLLOW_cabecalho_in_funcao21);
            cabecalho();

            state._fsp--;


            match(input,47,FOLLOW_47_in_funcao23); 

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:7:24: ( corpo_funcao )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==FOR||(LA2_0 >= ID && LA2_0 <= IF)||LA2_0==RETURN||(LA2_0 >= TD_BOOL && LA2_0 <= TD_VOID)||LA2_0==WHILE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:7:24: corpo_funcao
            	    {
            	    pushFollow(FOLLOW_corpo_funcao_in_funcao25);
            	    corpo_funcao();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            match(input,49,FOLLOW_49_in_funcao28); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "funcao"



    // $ANTLR start "cabecalho"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:10:1: cabecalho : tipo ID '(' ( argumentos )? ')' ;
    public final void cabecalho() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:11:2: ( tipo ID '(' ( argumentos )? ')' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:11:4: tipo ID '(' ( argumentos )? ')'
            {
            pushFollow(FOLLOW_tipo_in_cabecalho39);
            tipo();

            state._fsp--;


            match(input,ID,FOLLOW_ID_in_cabecalho41); 

            match(input,33,FOLLOW_33_in_cabecalho43); 

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:11:16: ( argumentos )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0 >= TD_BOOL && LA3_0 <= TD_VOID)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:11:16: argumentos
                    {
                    pushFollow(FOLLOW_argumentos_in_cabecalho45);
                    argumentos();

                    state._fsp--;


                    }
                    break;

            }


            match(input,34,FOLLOW_34_in_cabecalho48); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "cabecalho"



    // $ANTLR start "argumentos"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:14:1: argumentos : declaracao ( ',' declaracao )* ;
    public final void argumentos() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:15:2: ( declaracao ( ',' declaracao )* )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:15:4: declaracao ( ',' declaracao )*
            {
            pushFollow(FOLLOW_declaracao_in_argumentos59);
            declaracao();

            state._fsp--;


            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:15:15: ( ',' declaracao )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==37) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:15:16: ',' declaracao
            	    {
            	    match(input,37,FOLLOW_37_in_argumentos62); 

            	    pushFollow(FOLLOW_declaracao_in_argumentos64);
            	    declaracao();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "argumentos"



    // $ANTLR start "corpo_funcao"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:18:1: corpo_funcao : ( declaracoes )? statements ;
    public final void corpo_funcao() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:19:2: ( ( declaracoes )? statements )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:19:4: ( declaracoes )? statements
            {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:19:4: ( declaracoes )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0 >= TD_BOOL && LA5_0 <= TD_VOID)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:19:5: declaracoes
                    {
                    pushFollow(FOLLOW_declaracoes_in_corpo_funcao79);
                    declaracoes();

                    state._fsp--;


                    }
                    break;

            }


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
        return ;
    }
    // $ANTLR end "corpo_funcao"



    // $ANTLR start "declaracoes"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:22:1: declaracoes : ( declaracaoExpr )+ ;
    public final void declaracoes() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:23:2: ( ( declaracaoExpr )+ )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:23:4: ( declaracaoExpr )+
            {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:23:4: ( declaracaoExpr )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= TD_BOOL && LA6_0 <= TD_VOID)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:23:4: declaracaoExpr
            	    {
            	    pushFollow(FOLLOW_declaracaoExpr_in_declaracoes94);
            	    declaracaoExpr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "declaracoes"



    // $ANTLR start "declaracaoExpr"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:26:1: declaracaoExpr : declaracao ( '=' expr )? ';' ;
    public final void declaracaoExpr() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:27:2: ( declaracao ( '=' expr )? ';' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:27:4: declaracao ( '=' expr )? ';'
            {
            pushFollow(FOLLOW_declaracao_in_declaracaoExpr106);
            declaracao();

            state._fsp--;


            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:27:15: ( '=' expr )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==43) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:27:16: '=' expr
                    {
                    match(input,43,FOLLOW_43_in_declaracaoExpr109); 

                    pushFollow(FOLLOW_expr_in_declaracaoExpr111);
                    expr();

                    state._fsp--;


                    }
                    break;

            }


            match(input,40,FOLLOW_40_in_declaracaoExpr115); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "declaracaoExpr"



    // $ANTLR start "declaracao"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:30:1: declaracao : tipo ID ;
    public final void declaracao() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:31:2: ( tipo ID )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:31:4: tipo ID
            {
            pushFollow(FOLLOW_tipo_in_declaracao126);
            tipo();

            state._fsp--;


            match(input,ID,FOLLOW_ID_in_declaracao128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "declaracao"



    // $ANTLR start "statements"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:34:1: statements : ( statement )+ ;
    public final void statements() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:35:2: ( ( statement )+ )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:35:4: ( statement )+
            {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:35:4: ( statement )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
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

                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:35:4: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_statements139);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "statements"



    // $ANTLR start "statement"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:38:1: statement : ( atribuicao ';' | ifs | whiles | fors | invocacao ';' | retorna ';' );
    public final void statement() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:39:2: ( atribuicao ';' | ifs | whiles | fors | invocacao ';' | retorna ';' )
            int alt9=6;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==43) ) {
                    alt9=1;
                }
                else if ( (LA9_1==33) ) {
                    alt9=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

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

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:39:4: atribuicao ';'
                    {
                    pushFollow(FOLLOW_atribuicao_in_statement152);
                    atribuicao();

                    state._fsp--;


                    match(input,40,FOLLOW_40_in_statement154); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:40:4: ifs
                    {
                    pushFollow(FOLLOW_ifs_in_statement159);
                    ifs();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:41:4: whiles
                    {
                    pushFollow(FOLLOW_whiles_in_statement164);
                    whiles();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:42:4: fors
                    {
                    pushFollow(FOLLOW_fors_in_statement169);
                    fors();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:43:4: invocacao ';'
                    {
                    pushFollow(FOLLOW_invocacao_in_statement174);
                    invocacao();

                    state._fsp--;


                    match(input,40,FOLLOW_40_in_statement176); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:44:4: retorna ';'
                    {
                    pushFollow(FOLLOW_retorna_in_statement181);
                    retorna();

                    state._fsp--;


                    match(input,40,FOLLOW_40_in_statement183); 

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
        return ;
    }
    // $ANTLR end "statement"



    // $ANTLR start "atribuicao"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:47:1: atribuicao : ID '=' expr ;
    public final void atribuicao() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:48:2: ( ID '=' expr )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:48:4: ID '=' expr
            {
            match(input,ID,FOLLOW_ID_in_atribuicao194); 

            match(input,43,FOLLOW_43_in_atribuicao196); 

            pushFollow(FOLLOW_expr_in_atribuicao198);
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
        return ;
    }
    // $ANTLR end "atribuicao"



    // $ANTLR start "ifs"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:51:1: ifs : IF '(' expr ')' bloco ( ifsElse )? ;
    public final void ifs() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:51:5: ( IF '(' expr ')' bloco ( ifsElse )? )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:51:7: IF '(' expr ')' bloco ( ifsElse )?
            {
            match(input,IF,FOLLOW_IF_in_ifs208); 

            match(input,33,FOLLOW_33_in_ifs210); 

            pushFollow(FOLLOW_expr_in_ifs212);
            expr();

            state._fsp--;


            match(input,34,FOLLOW_34_in_ifs214); 

            pushFollow(FOLLOW_bloco_in_ifs216);
            bloco();

            state._fsp--;


            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:51:29: ( ifsElse )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ELSE) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:51:29: ifsElse
                    {
                    pushFollow(FOLLOW_ifsElse_in_ifs218);
                    ifsElse();

                    state._fsp--;


                    }
                    break;

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
        return ;
    }
    // $ANTLR end "ifs"



    // $ANTLR start "ifsElse"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:54:1: ifsElse : ELSE bloco ;
    public final void ifsElse() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:54:9: ( ELSE bloco )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:54:11: ELSE bloco
            {
            match(input,ELSE,FOLLOW_ELSE_in_ifsElse229); 

            pushFollow(FOLLOW_bloco_in_ifsElse231);
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
        return ;
    }
    // $ANTLR end "ifsElse"



    // $ANTLR start "whiles"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:57:1: whiles : WHILE '(' expr ')' bloco ;
    public final void whiles() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:57:8: ( WHILE '(' expr ')' bloco )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:57:10: WHILE '(' expr ')' bloco
            {
            match(input,WHILE,FOLLOW_WHILE_in_whiles241); 

            match(input,33,FOLLOW_33_in_whiles243); 

            pushFollow(FOLLOW_expr_in_whiles245);
            expr();

            state._fsp--;


            match(input,34,FOLLOW_34_in_whiles247); 

            pushFollow(FOLLOW_bloco_in_whiles249);
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
        return ;
    }
    // $ANTLR end "whiles"



    // $ANTLR start "fors"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:60:1: fors : FOR '(' forsexpr ';' expr ';' forsexpr ')' bloco ;
    public final void fors() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:60:6: ( FOR '(' forsexpr ';' expr ';' forsexpr ')' bloco )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:60:8: FOR '(' forsexpr ';' expr ';' forsexpr ')' bloco
            {
            match(input,FOR,FOLLOW_FOR_in_fors259); 

            match(input,33,FOLLOW_33_in_fors261); 

            pushFollow(FOLLOW_forsexpr_in_fors263);
            forsexpr();

            state._fsp--;


            match(input,40,FOLLOW_40_in_fors265); 

            pushFollow(FOLLOW_expr_in_fors267);
            expr();

            state._fsp--;


            match(input,40,FOLLOW_40_in_fors269); 

            pushFollow(FOLLOW_forsexpr_in_fors271);
            forsexpr();

            state._fsp--;


            match(input,34,FOLLOW_34_in_fors273); 

            pushFollow(FOLLOW_bloco_in_fors275);
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
        return ;
    }
    // $ANTLR end "fors"



    // $ANTLR start "forsexpr"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:63:1: forsexpr : ( expr | atribuicao );
    public final void forsexpr() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:63:9: ( expr | atribuicao )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==CHAR||LA11_0==FALSE||LA11_0==INT||LA11_0==STRING||LA11_0==TRUE||LA11_0==29||LA11_0==38) ) {
                alt11=1;
            }
            else if ( (LA11_0==ID) ) {
                int LA11_2 = input.LA(2);

                if ( ((LA11_2 >= 30 && LA11_2 <= 36)||(LA11_2 >= 38 && LA11_2 <= 42)||(LA11_2 >= 44 && LA11_2 <= 46)||LA11_2==48) ) {
                    alt11=1;
                }
                else if ( (LA11_2==43) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:63:11: expr
                    {
                    pushFollow(FOLLOW_expr_in_forsexpr284);
                    expr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:64:4: atribuicao
                    {
                    pushFollow(FOLLOW_atribuicao_in_forsexpr289);
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
        return ;
    }
    // $ANTLR end "forsexpr"



    // $ANTLR start "invocacao"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:67:1: invocacao : ID '(' args ')' ;
    public final void invocacao() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:68:2: ( ID '(' args ')' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:68:4: ID '(' args ')'
            {
            match(input,ID,FOLLOW_ID_in_invocacao300); 

            match(input,33,FOLLOW_33_in_invocacao302); 

            pushFollow(FOLLOW_args_in_invocacao304);
            args();

            state._fsp--;


            match(input,34,FOLLOW_34_in_invocacao306); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "invocacao"



    // $ANTLR start "retorna"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:71:1: retorna : RETURN expr ;
    public final void retorna() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:71:9: ( RETURN expr )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:71:11: RETURN expr
            {
            match(input,RETURN,FOLLOW_RETURN_in_retorna316); 

            pushFollow(FOLLOW_expr_in_retorna318);
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
        return ;
    }
    // $ANTLR end "retorna"



    // $ANTLR start "bloco"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:74:1: bloco : ( '{' statements '}' | statement );
    public final void bloco() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:74:7: ( '{' statements '}' | statement )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==47) ) {
                alt12=1;
            }
            else if ( (LA12_0==FOR||(LA12_0 >= ID && LA12_0 <= IF)||LA12_0==RETURN||LA12_0==WHILE) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:74:9: '{' statements '}'
                    {
                    match(input,47,FOLLOW_47_in_bloco329); 

                    pushFollow(FOLLOW_statements_in_bloco331);
                    statements();

                    state._fsp--;


                    match(input,49,FOLLOW_49_in_bloco333); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:75:4: statement
                    {
                    pushFollow(FOLLOW_statement_in_bloco338);
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
        return ;
    }
    // $ANTLR end "bloco"



    // $ANTLR start "args"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:78:1: args : expr ( argsAux )* ;
    public final void args() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:78:6: ( expr ( argsAux )* )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:78:8: expr ( argsAux )*
            {
            pushFollow(FOLLOW_expr_in_args348);
            expr();

            state._fsp--;


            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:78:13: ( argsAux )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==37) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:78:13: argsAux
            	    {
            	    pushFollow(FOLLOW_argsAux_in_args350);
            	    argsAux();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "args"



    // $ANTLR start "argsAux"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:81:1: argsAux : ',' expr ;
    public final void argsAux() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:81:9: ( ',' expr )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:81:12: ',' expr
            {
            match(input,37,FOLLOW_37_in_argsAux362); 

            pushFollow(FOLLOW_expr_in_argsAux364);
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
        return ;
    }
    // $ANTLR end "argsAux"



    // $ANTLR start "expr"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:84:1: expr : orExpr ;
    public final void expr() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:84:6: ( orExpr )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:84:8: orExpr
            {
            pushFollow(FOLLOW_orExpr_in_expr374);
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
        return ;
    }
    // $ANTLR end "expr"



    // $ANTLR start "orExpr"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:87:1: orExpr : andExpr ( orExprAux )* ;
    public final void orExpr() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:87:8: ( andExpr ( orExprAux )* )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:87:10: andExpr ( orExprAux )*
            {
            pushFollow(FOLLOW_andExpr_in_orExpr384);
            andExpr();

            state._fsp--;


            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:87:18: ( orExprAux )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==48) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:87:18: orExprAux
            	    {
            	    pushFollow(FOLLOW_orExprAux_in_orExpr386);
            	    orExprAux();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "orExpr"



    // $ANTLR start "orExprAux"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:90:1: orExprAux : opOr andExpr ;
    public final void orExprAux() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:90:10: ( opOr andExpr )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:90:12: opOr andExpr
            {
            pushFollow(FOLLOW_opOr_in_orExprAux396);
            opOr();

            state._fsp--;


            pushFollow(FOLLOW_andExpr_in_orExprAux398);
            andExpr();

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
        return ;
    }
    // $ANTLR end "orExprAux"



    // $ANTLR start "andExpr"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:93:1: andExpr : equalExpr ( andExprAux )* ;
    public final void andExpr() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:93:9: ( equalExpr ( andExprAux )* )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:93:11: equalExpr ( andExprAux )*
            {
            pushFollow(FOLLOW_equalExpr_in_andExpr408);
            equalExpr();

            state._fsp--;


            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:93:21: ( andExprAux )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==32) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:93:21: andExprAux
            	    {
            	    pushFollow(FOLLOW_andExprAux_in_andExpr410);
            	    andExprAux();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "andExpr"



    // $ANTLR start "andExprAux"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:96:1: andExprAux : opAnd equalExpr ;
    public final void andExprAux() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:96:11: ( opAnd equalExpr )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:96:13: opAnd equalExpr
            {
            pushFollow(FOLLOW_opAnd_in_andExprAux420);
            opAnd();

            state._fsp--;


            pushFollow(FOLLOW_equalExpr_in_andExprAux422);
            equalExpr();

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
        return ;
    }
    // $ANTLR end "andExprAux"



    // $ANTLR start "equalExpr"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:99:1: equalExpr : addExpr ( equalExprAux )* ;
    public final void equalExpr() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:100:2: ( addExpr ( equalExprAux )* )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:100:4: addExpr ( equalExprAux )*
            {
            pushFollow(FOLLOW_addExpr_in_equalExpr433);
            addExpr();

            state._fsp--;


            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:100:12: ( equalExprAux )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==30||(LA16_0 >= 41 && LA16_0 <= 42)||(LA16_0 >= 44 && LA16_0 <= 46)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:100:12: equalExprAux
            	    {
            	    pushFollow(FOLLOW_equalExprAux_in_equalExpr435);
            	    equalExprAux();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "equalExpr"



    // $ANTLR start "equalExprAux"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:103:1: equalExprAux : opRel addExpr ;
    public final void equalExprAux() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:103:13: ( opRel addExpr )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:103:15: opRel addExpr
            {
            pushFollow(FOLLOW_opRel_in_equalExprAux446);
            opRel();

            state._fsp--;


            pushFollow(FOLLOW_addExpr_in_equalExprAux448);
            addExpr();

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
        return ;
    }
    // $ANTLR end "equalExprAux"



    // $ANTLR start "addExpr"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:106:1: addExpr : multExpr ( addExprAux )* ;
    public final void addExpr() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:106:9: ( multExpr ( addExprAux )* )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:106:11: multExpr ( addExprAux )*
            {
            pushFollow(FOLLOW_multExpr_in_addExpr460);
            multExpr();

            state._fsp--;


            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:106:20: ( addExprAux )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==36||LA17_0==38) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:106:20: addExprAux
            	    {
            	    pushFollow(FOLLOW_addExprAux_in_addExpr462);
            	    addExprAux();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "addExpr"



    // $ANTLR start "addExprAux"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:109:1: addExprAux : opAdd multExpr ;
    public final void addExprAux() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:109:11: ( opAdd multExpr )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:109:13: opAdd multExpr
            {
            pushFollow(FOLLOW_opAdd_in_addExprAux472);
            opAdd();

            state._fsp--;


            pushFollow(FOLLOW_multExpr_in_addExprAux474);
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
        return ;
    }
    // $ANTLR end "addExprAux"



    // $ANTLR start "multExpr"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:112:1: multExpr : notExpr ( multExprAux )* ;
    public final void multExpr() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:112:9: ( notExpr ( multExprAux )* )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:112:11: notExpr ( multExprAux )*
            {
            pushFollow(FOLLOW_notExpr_in_multExpr484);
            notExpr();

            state._fsp--;


            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:112:19: ( multExprAux )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==31||LA18_0==35||LA18_0==39) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:112:19: multExprAux
            	    {
            	    pushFollow(FOLLOW_multExprAux_in_multExpr486);
            	    multExprAux();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "multExpr"



    // $ANTLR start "multExprAux"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:115:1: multExprAux : opMul notExpr ;
    public final void multExprAux() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:115:12: ( opMul notExpr )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:115:14: opMul notExpr
            {
            pushFollow(FOLLOW_opMul_in_multExprAux496);
            opMul();

            state._fsp--;


            pushFollow(FOLLOW_notExpr_in_multExprAux498);
            notExpr();

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
        return ;
    }
    // $ANTLR end "multExprAux"



    // $ANTLR start "notExpr"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:118:1: notExpr : ( opNot )? negationExpr ;
    public final void notExpr() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:118:9: ( ( opNot )? negationExpr )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:118:11: ( opNot )? negationExpr
            {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:118:11: ( opNot )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:118:12: opNot
                    {
                    pushFollow(FOLLOW_opNot_in_notExpr509);
                    opNot();

                    state._fsp--;


                    }
                    break;

            }


            pushFollow(FOLLOW_negationExpr_in_notExpr513);
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
        return ;
    }
    // $ANTLR end "notExpr"



    // $ANTLR start "negationExpr"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:121:1: negationExpr : ( '-' )? fator ;
    public final void negationExpr() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:122:2: ( ( '-' )? fator )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:122:4: ( '-' )? fator
            {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:122:4: ( '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:122:5: '-'
                    {
                    match(input,38,FOLLOW_38_in_negationExpr526); 

                    }
                    break;

            }


            pushFollow(FOLLOW_fator_in_negationExpr530);
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
        return ;
    }
    // $ANTLR end "negationExpr"



    // $ANTLR start "opAdd"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:125:1: opAdd : ( '+' | '-' );
    public final void opAdd() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:125:7: ( '+' | '-' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:
            {
            if ( input.LA(1)==36||input.LA(1)==38 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return ;
    }
    // $ANTLR end "opAdd"



    // $ANTLR start "opMul"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:129:1: opMul : ( '*' | '/' | '%' );
    public final void opMul() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:129:7: ( '*' | '/' | '%' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:
            {
            if ( input.LA(1)==31||input.LA(1)==35||input.LA(1)==39 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return ;
    }
    // $ANTLR end "opMul"



    // $ANTLR start "opOr"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:134:1: opOr : '||' ;
    public final void opOr() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:134:6: ( '||' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:134:8: '||'
            {
            match(input,48,FOLLOW_48_in_opOr575); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "opOr"



    // $ANTLR start "opAnd"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:137:1: opAnd : '&&' ;
    public final void opAnd() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:137:7: ( '&&' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:137:9: '&&'
            {
            match(input,32,FOLLOW_32_in_opAnd585); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "opAnd"



    // $ANTLR start "opRel"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:140:1: opRel : ( '>' | '<' | '>=' | '<=' | '==' | '!=' );
    public final void opRel() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:140:7: ( '>' | '<' | '>=' | '<=' | '==' | '!=' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:
            {
            if ( input.LA(1)==30||(input.LA(1) >= 41 && input.LA(1) <= 42)||(input.LA(1) >= 44 && input.LA(1) <= 46) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return ;
    }
    // $ANTLR end "opRel"



    // $ANTLR start "opNot"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:148:1: opNot : '!' ;
    public final void opNot() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:148:7: ( '!' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:148:9: '!'
            {
            match(input,29,FOLLOW_29_in_opNot630); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "opNot"



    // $ANTLR start "fator"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:151:1: fator : ( ID | constante | invocacao );
    public final void fator() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:151:7: ( ID | constante | invocacao )
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==33) ) {
                    alt21=3;
                }
                else if ( ((LA21_1 >= 30 && LA21_1 <= 32)||(LA21_1 >= 34 && LA21_1 <= 42)||(LA21_1 >= 44 && LA21_1 <= 46)||LA21_1==48) ) {
                    alt21=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA21_0==CHAR||LA21_0==FALSE||LA21_0==INT||LA21_0==STRING||LA21_0==TRUE) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:151:9: ID
                    {
                    match(input,ID,FOLLOW_ID_in_fator640); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:152:4: constante
                    {
                    pushFollow(FOLLOW_constante_in_fator645);
                    constante();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:153:4: invocacao
                    {
                    pushFollow(FOLLOW_invocacao_in_fator650);
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
        return ;
    }
    // $ANTLR end "fator"



    // $ANTLR start "constante"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:156:1: constante : ( STRING | CHAR | INT | TRUE | FALSE );
    public final void constante() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:157:2: ( STRING | CHAR | INT | TRUE | FALSE )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:
            {
            if ( input.LA(1)==CHAR||input.LA(1)==FALSE||input.LA(1)==INT||input.LA(1)==STRING||input.LA(1)==TRUE ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return ;
    }
    // $ANTLR end "constante"



    // $ANTLR start "tipo"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:164:1: tipo : ( TD_INT | TD_BOOL | TD_STRING | TD_CHAR | TD_FLOAT | TD_VOID );
    public final void tipo() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:164:6: ( TD_INT | TD_BOOL | TD_STRING | TD_CHAR | TD_FLOAT | TD_VOID )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi.g:
            {
            if ( (input.LA(1) >= TD_BOOL && input.LA(1) <= TD_VOID) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return ;
    }
    // $ANTLR end "tipo"

    // Delegated rules


 

    public static final BitSet FOLLOW_funcao_in_programa10 = new BitSet(new long[]{0x0000000001F80002L});
    public static final BitSet FOLLOW_cabecalho_in_funcao21 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_funcao23 = new BitSet(new long[]{0x0000000009FA6800L});
    public static final BitSet FOLLOW_corpo_funcao_in_funcao25 = new BitSet(new long[]{0x0002000009FA6800L});
    public static final BitSet FOLLOW_49_in_funcao28 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tipo_in_cabecalho39 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_cabecalho41 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_cabecalho43 = new BitSet(new long[]{0x0000000401F80000L});
    public static final BitSet FOLLOW_argumentos_in_cabecalho45 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_cabecalho48 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracao_in_argumentos59 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_argumentos62 = new BitSet(new long[]{0x0000000001F80000L});
    public static final BitSet FOLLOW_declaracao_in_argumentos64 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_declaracoes_in_corpo_funcao79 = new BitSet(new long[]{0x0000000008026800L});
    public static final BitSet FOLLOW_statements_in_corpo_funcao83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracaoExpr_in_declaracoes94 = new BitSet(new long[]{0x0000000001F80002L});
    public static final BitSet FOLLOW_declaracao_in_declaracaoExpr106 = new BitSet(new long[]{0x0000090000000000L});
    public static final BitSet FOLLOW_43_in_declaracaoExpr109 = new BitSet(new long[]{0x000000402204A210L});
    public static final BitSet FOLLOW_expr_in_declaracaoExpr111 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_declaracaoExpr115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tipo_in_declaracao126 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_declaracao128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statements139 = new BitSet(new long[]{0x0000000008026802L});
    public static final BitSet FOLLOW_atribuicao_in_statement152 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_statement154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifs_in_statement159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whiles_in_statement164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fors_in_statement169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invocacao_in_statement174 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_statement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_retorna_in_statement181 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_statement183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atribuicao194 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_atribuicao196 = new BitSet(new long[]{0x000000402204A210L});
    public static final BitSet FOLLOW_expr_in_atribuicao198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifs208 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ifs210 = new BitSet(new long[]{0x000000402204A210L});
    public static final BitSet FOLLOW_expr_in_ifs212 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ifs214 = new BitSet(new long[]{0x0000800008026800L});
    public static final BitSet FOLLOW_bloco_in_ifs216 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ifsElse_in_ifs218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_ifsElse229 = new BitSet(new long[]{0x0000800008026800L});
    public static final BitSet FOLLOW_bloco_in_ifsElse231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whiles241 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_whiles243 = new BitSet(new long[]{0x000000402204A210L});
    public static final BitSet FOLLOW_expr_in_whiles245 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_whiles247 = new BitSet(new long[]{0x0000800008026800L});
    public static final BitSet FOLLOW_bloco_in_whiles249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_fors259 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_fors261 = new BitSet(new long[]{0x000000402204A210L});
    public static final BitSet FOLLOW_forsexpr_in_fors263 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_fors265 = new BitSet(new long[]{0x000000402204A210L});
    public static final BitSet FOLLOW_expr_in_fors267 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_fors269 = new BitSet(new long[]{0x000000402204A210L});
    public static final BitSet FOLLOW_forsexpr_in_fors271 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_fors273 = new BitSet(new long[]{0x0000800008026800L});
    public static final BitSet FOLLOW_bloco_in_fors275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_forsexpr284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atribuicao_in_forsexpr289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_invocacao300 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_invocacao302 = new BitSet(new long[]{0x000000402204A210L});
    public static final BitSet FOLLOW_args_in_invocacao304 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_invocacao306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_retorna316 = new BitSet(new long[]{0x000000402204A210L});
    public static final BitSet FOLLOW_expr_in_retorna318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_bloco329 = new BitSet(new long[]{0x0000000008026800L});
    public static final BitSet FOLLOW_statements_in_bloco331 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_bloco333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_bloco338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_args348 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_argsAux_in_args350 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_argsAux362 = new BitSet(new long[]{0x000000402204A210L});
    public static final BitSet FOLLOW_expr_in_argsAux364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpr_in_expr374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpr_in_orExpr384 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_orExprAux_in_orExpr386 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_opOr_in_orExprAux396 = new BitSet(new long[]{0x000000402204A210L});
    public static final BitSet FOLLOW_andExpr_in_orExprAux398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalExpr_in_andExpr408 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_andExprAux_in_andExpr410 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_opAnd_in_andExprAux420 = new BitSet(new long[]{0x000000402204A210L});
    public static final BitSet FOLLOW_equalExpr_in_andExprAux422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addExpr_in_equalExpr433 = new BitSet(new long[]{0x0000760040000002L});
    public static final BitSet FOLLOW_equalExprAux_in_equalExpr435 = new BitSet(new long[]{0x0000760040000002L});
    public static final BitSet FOLLOW_opRel_in_equalExprAux446 = new BitSet(new long[]{0x000000402204A210L});
    public static final BitSet FOLLOW_addExpr_in_equalExprAux448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExpr_in_addExpr460 = new BitSet(new long[]{0x0000005000000002L});
    public static final BitSet FOLLOW_addExprAux_in_addExpr462 = new BitSet(new long[]{0x0000005000000002L});
    public static final BitSet FOLLOW_opAdd_in_addExprAux472 = new BitSet(new long[]{0x000000402204A210L});
    public static final BitSet FOLLOW_multExpr_in_addExprAux474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notExpr_in_multExpr484 = new BitSet(new long[]{0x0000008880000002L});
    public static final BitSet FOLLOW_multExprAux_in_multExpr486 = new BitSet(new long[]{0x0000008880000002L});
    public static final BitSet FOLLOW_opMul_in_multExprAux496 = new BitSet(new long[]{0x000000402204A210L});
    public static final BitSet FOLLOW_notExpr_in_multExprAux498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_opNot_in_notExpr509 = new BitSet(new long[]{0x000000400204A210L});
    public static final BitSet FOLLOW_negationExpr_in_notExpr513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_negationExpr526 = new BitSet(new long[]{0x000000000204A210L});
    public static final BitSet FOLLOW_fator_in_negationExpr530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_opOr575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_opAnd585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_opNot630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fator640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constante_in_fator645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invocacao_in_fator650 = new BitSet(new long[]{0x0000000000000002L});

}