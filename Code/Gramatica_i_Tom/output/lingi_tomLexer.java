// $ANTLR 3.4 C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g 2012-12-17 22:26:40

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class lingi_tomLexer extends Lexer {
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
    public static final int AddExpr1=50;
    public static final int AddExpr2=51;
    public static final int AddExprAux=52;
    public static final int AndExpr1=53;
    public static final int AndExpr2=54;
    public static final int AndExprAux=55;
    public static final int Args1=56;
    public static final int Args2=57;
    public static final int ArgsAux=58;
    public static final int Argumentos=59;
    public static final int Atribuicao=60;
    public static final int BlocoMore=61;
    public static final int BlocoOne=62;
    public static final int Cabecalho1=63;
    public static final int Cabecalho2=64;
    public static final int ConstanteBool=65;
    public static final int ConstanteChar=66;
    public static final int ConstanteInt=67;
    public static final int ConstanteString=68;
    public static final int Corpo_Funcao1=69;
    public static final int Corpo_Funcao2=70;
    public static final int Declaracao=71;
    public static final int DeclaracaoExpr1=72;
    public static final int DeclaracaoExpr2=73;
    public static final int Declaracoes=74;
    public static final int EqualExpr1=75;
    public static final int EqualExpr2=76;
    public static final int EqualExprAux=77;
    public static final int Expr=78;
    public static final int FatorConstante=79;
    public static final int FatorID=80;
    public static final int FatorInvocacao=81;
    public static final int ForExprAtribuicao=82;
    public static final int ForExprExpr=83;
    public static final int Fors=84;
    public static final int Funcao=85;
    public static final int Ifs1=86;
    public static final int Ifs2=87;
    public static final int IfsElse=88;
    public static final int Invocacao=89;
    public static final int MultExpr1=90;
    public static final int MultExpr2=91;
    public static final int MultExprAux=92;
    public static final int NegationExpr=93;
    public static final int NotExpr=94;
    public static final int OrExpr1=95;
    public static final int OrExpr2=96;
    public static final int OrExprAux=97;
    public static final int Programa=98;
    public static final int Retorna=99;
    public static final int Statement=100;
    public static final int StatementAtribuicao=101;
    public static final int StatementFors=102;
    public static final int StatementIfs=103;
    public static final int StatementInvocacao=104;
    public static final int StatementRetorna=105;
    public static final int StatementWhiles=106;
    public static final int Whiles=107;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public lingi_tomLexer() {} 
    public lingi_tomLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public lingi_tomLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g"; }

    // $ANTLR start "TD_INT"
    public final void mTD_INT() throws RecognitionException {
        try {
            int _type = TD_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:249:8: ( 'int' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:249:10: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TD_INT"

    // $ANTLR start "TD_BOOL"
    public final void mTD_BOOL() throws RecognitionException {
        try {
            int _type = TD_BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:250:9: ( 'bool' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:250:11: 'bool'
            {
            match("bool"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TD_BOOL"

    // $ANTLR start "TD_STRING"
    public final void mTD_STRING() throws RecognitionException {
        try {
            int _type = TD_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:251:10: ( 'string' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:251:12: 'string'
            {
            match("string"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TD_STRING"

    // $ANTLR start "TD_CHAR"
    public final void mTD_CHAR() throws RecognitionException {
        try {
            int _type = TD_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:252:9: ( 'char' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:252:11: 'char'
            {
            match("char"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TD_CHAR"

    // $ANTLR start "TD_FLOAT"
    public final void mTD_FLOAT() throws RecognitionException {
        try {
            int _type = TD_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:253:9: ( 'float' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:253:11: 'float'
            {
            match("float"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TD_FLOAT"

    // $ANTLR start "TD_VOID"
    public final void mTD_VOID() throws RecognitionException {
        try {
            int _type = TD_VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:254:9: ( 'void' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:254:11: 'void'
            {
            match("void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TD_VOID"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:255:6: ( 'true' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:255:8: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:256:7: ( 'false' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:256:9: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:258:8: ( 'return' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:258:10: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:259:4: ( 'if' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:259:6: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:260:6: ( 'else' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:260:8: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:261:7: ( 'while' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:261:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:262:5: ( 'for' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:262:7: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:264:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:264:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:264:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:267:5: ( ( '0' .. '9' )+ )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:267:7: ( '0' .. '9' )+
            {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:267:7: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:271:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:271:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:271:9: ( '0' .. '9' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    match('.'); 

                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:271:25: ( '0' .. '9' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:271:37: ( EXPONENT )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='E'||LA5_0=='e') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:271:37: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:272:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 

                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:272:13: ( '0' .. '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


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


                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:272:25: ( EXPONENT )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='E'||LA7_0=='e') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:272:25: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:273:9: ( '0' .. '9' )+ EXPONENT
                    {
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:273:9: ( '0' .. '9' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


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


                    mEXPONENT(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:277:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='/') ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1=='/') ) {
                    alt13=1;
                }
                else if ( (LA13_1=='*') ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:277:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:277:14: (~ ( '\\n' | '\\r' ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\t')||(LA10_0 >= '\u000B' && LA10_0 <= '\f')||(LA10_0 >= '\u000E' && LA10_0 <= '\uFFFF')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:277:28: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:277:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:278:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:278:14: ( options {greedy=false; } : . )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='*') ) {
                            int LA12_1 = input.LA(2);

                            if ( (LA12_1=='/') ) {
                                alt12=2;
                            }
                            else if ( ((LA12_1 >= '\u0000' && LA12_1 <= '.')||(LA12_1 >= '0' && LA12_1 <= '\uFFFF')) ) {
                                alt12=1;
                            }


                        }
                        else if ( ((LA12_0 >= '\u0000' && LA12_0 <= ')')||(LA12_0 >= '+' && LA12_0 <= '\uFFFF')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:278:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:281:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:281:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:289:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:289:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:289:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\\') ) {
                    alt14=1;
                }
                else if ( ((LA14_0 >= '\u0000' && LA14_0 <= '!')||(LA14_0 >= '#' && LA14_0 <= '[')||(LA14_0 >= ']' && LA14_0 <= '\uFFFF')) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:289:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:289:24: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:292:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:292:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:292:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\\') ) {
                alt15=1;
            }
            else if ( ((LA15_0 >= '\u0000' && LA15_0 <= '&')||(LA15_0 >= '(' && LA15_0 <= '[')||(LA15_0 >= ']' && LA15_0 <= '\uFFFF')) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:292:15: ESC_SEQ
                    {
                    mESC_SEQ(); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:292:25: ~ ( '\\'' | '\\\\' )
                    {
                    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:297:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:297:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:297:22: ( '+' | '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='+'||LA16_0=='-') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:297:33: ( '0' .. '9' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0 >= '0' && LA17_0 <= '9')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:300:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:304:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt18=1;
                    }
                    break;
                case 'u':
                    {
                    alt18=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt18=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:304:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 

                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:305:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 


                    }
                    break;
                case 3 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:306:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:311:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\\') ) {
                int LA19_1 = input.LA(2);

                if ( ((LA19_1 >= '0' && LA19_1 <= '3')) ) {
                    int LA19_2 = input.LA(3);

                    if ( ((LA19_2 >= '0' && LA19_2 <= '7')) ) {
                        int LA19_4 = input.LA(4);

                        if ( ((LA19_4 >= '0' && LA19_4 <= '7')) ) {
                            alt19=1;
                        }
                        else {
                            alt19=2;
                        }
                    }
                    else {
                        alt19=3;
                    }
                }
                else if ( ((LA19_1 >= '4' && LA19_1 <= '7')) ) {
                    int LA19_3 = input.LA(3);

                    if ( ((LA19_3 >= '0' && LA19_3 <= '7')) ) {
                        alt19=2;
                    }
                    else {
                        alt19=3;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:311:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:312:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:313:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:318:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:318:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 

            match('u'); 

            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_ESC"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:1:8: ( TD_INT | TD_BOOL | TD_STRING | TD_CHAR | TD_FLOAT | TD_VOID | TRUE | FALSE | RETURN | IF | ELSE | WHILE | FOR | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR )
        int alt20=20;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:1:10: TD_INT
                {
                mTD_INT(); 


                }
                break;
            case 2 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:1:17: TD_BOOL
                {
                mTD_BOOL(); 


                }
                break;
            case 3 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:1:25: TD_STRING
                {
                mTD_STRING(); 


                }
                break;
            case 4 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:1:35: TD_CHAR
                {
                mTD_CHAR(); 


                }
                break;
            case 5 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:1:43: TD_FLOAT
                {
                mTD_FLOAT(); 


                }
                break;
            case 6 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:1:52: TD_VOID
                {
                mTD_VOID(); 


                }
                break;
            case 7 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:1:60: TRUE
                {
                mTRUE(); 


                }
                break;
            case 8 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:1:65: FALSE
                {
                mFALSE(); 


                }
                break;
            case 9 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:1:71: RETURN
                {
                mRETURN(); 


                }
                break;
            case 10 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:1:78: IF
                {
                mIF(); 


                }
                break;
            case 11 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:1:81: ELSE
                {
                mELSE(); 


                }
                break;
            case 12 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:1:86: WHILE
                {
                mWHILE(); 


                }
                break;
            case 13 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:1:92: FOR
                {
                mFOR(); 


                }
                break;
            case 14 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:1:96: ID
                {
                mID(); 


                }
                break;
            case 15 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:1:99: INT
                {
                mINT(); 


                }
                break;
            case 16 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:1:103: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 17 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:1:109: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 18 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:1:117: WS
                {
                mWS(); 


                }
                break;
            case 19 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:1:120: STRING
                {
                mSTRING(); 


                }
                break;
            case 20 :
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:1:127: CHAR
                {
                mCHAR(); 


                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA9_eotS =
        "\5\uffff";
    static final String DFA9_eofS =
        "\5\uffff";
    static final String DFA9_minS =
        "\2\56\3\uffff";
    static final String DFA9_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA9_specialS =
        "\5\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "270:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA20_eotS =
        "\1\uffff\12\13\1\uffff\1\37\5\uffff\1\13\1\41\13\13\1\uffff\1\55"+
        "\1\uffff\5\13\1\63\5\13\1\uffff\1\71\1\13\1\73\2\13\1\uffff\1\76"+
        "\1\77\1\13\1\101\1\13\1\uffff\1\13\1\uffff\1\104\1\105\2\uffff\1"+
        "\13\1\uffff\1\107\1\110\2\uffff\1\111\3\uffff";
    static final String DFA20_eofS =
        "\112\uffff";
    static final String DFA20_minS =
        "\1\11\1\146\1\157\1\164\1\150\1\141\1\157\1\162\1\145\1\154\1\150"+
        "\1\uffff\1\56\5\uffff\1\164\1\60\1\157\1\162\1\141\1\157\1\154\1"+
        "\162\1\151\1\165\1\164\1\163\1\151\1\uffff\1\60\1\uffff\1\154\1"+
        "\151\1\162\1\141\1\163\1\60\1\144\1\145\1\165\1\145\1\154\1\uffff"+
        "\1\60\1\156\1\60\1\164\1\145\1\uffff\2\60\1\162\1\60\1\145\1\uffff"+
        "\1\147\1\uffff\2\60\2\uffff\1\156\1\uffff\2\60\2\uffff\1\60\3\uffff";
    static final String DFA20_maxS =
        "\1\172\1\156\1\157\1\164\1\150\2\157\1\162\1\145\1\154\1\150\1\uffff"+
        "\1\145\5\uffff\1\164\1\172\1\157\1\162\1\141\1\157\1\154\1\162\1"+
        "\151\1\165\1\164\1\163\1\151\1\uffff\1\172\1\uffff\1\154\1\151\1"+
        "\162\1\141\1\163\1\172\1\144\1\145\1\165\1\145\1\154\1\uffff\1\172"+
        "\1\156\1\172\1\164\1\145\1\uffff\2\172\1\162\1\172\1\145\1\uffff"+
        "\1\147\1\uffff\2\172\2\uffff\1\156\1\uffff\2\172\2\uffff\1\172\3"+
        "\uffff";
    static final String DFA20_acceptS =
        "\13\uffff\1\16\1\uffff\1\20\1\21\1\22\1\23\1\24\15\uffff\1\17\1"+
        "\uffff\1\12\13\uffff\1\1\5\uffff\1\15\5\uffff\1\2\1\uffff\1\4\2"+
        "\uffff\1\6\1\7\1\uffff\1\13\2\uffff\1\5\1\10\1\uffff\1\14\1\3\1"+
        "\11";
    static final String DFA20_specialS =
        "\112\uffff}>";
    static final String[] DFA20_transitionS = {
            "\2\17\2\uffff\1\17\22\uffff\1\17\1\uffff\1\20\4\uffff\1\21\6"+
            "\uffff\1\15\1\16\12\14\7\uffff\32\13\4\uffff\1\13\1\uffff\1"+
            "\13\1\2\1\4\1\13\1\11\1\5\2\13\1\1\10\13\1\10\1\3\1\7\1\13\1"+
            "\6\1\12\3\13",
            "\1\23\7\uffff\1\22",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\30\12\uffff\1\27\2\uffff\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "",
            "\1\15\1\uffff\12\14\13\uffff\1\15\37\uffff\1\15",
            "",
            "",
            "",
            "",
            "",
            "\1\40",
            "\12\13\7\uffff\32\13\4\uffff\1\13\1\uffff\32\13",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "",
            "\12\13\7\uffff\32\13\4\uffff\1\13\1\uffff\32\13",
            "",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\12\13\7\uffff\32\13\4\uffff\1\13\1\uffff\32\13",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "",
            "\12\13\7\uffff\32\13\4\uffff\1\13\1\uffff\32\13",
            "\1\72",
            "\12\13\7\uffff\32\13\4\uffff\1\13\1\uffff\32\13",
            "\1\74",
            "\1\75",
            "",
            "\12\13\7\uffff\32\13\4\uffff\1\13\1\uffff\32\13",
            "\12\13\7\uffff\32\13\4\uffff\1\13\1\uffff\32\13",
            "\1\100",
            "\12\13\7\uffff\32\13\4\uffff\1\13\1\uffff\32\13",
            "\1\102",
            "",
            "\1\103",
            "",
            "\12\13\7\uffff\32\13\4\uffff\1\13\1\uffff\32\13",
            "\12\13\7\uffff\32\13\4\uffff\1\13\1\uffff\32\13",
            "",
            "",
            "\1\106",
            "",
            "\12\13\7\uffff\32\13\4\uffff\1\13\1\uffff\32\13",
            "\12\13\7\uffff\32\13\4\uffff\1\13\1\uffff\32\13",
            "",
            "",
            "\12\13\7\uffff\32\13\4\uffff\1\13\1\uffff\32\13",
            "",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( TD_INT | TD_BOOL | TD_STRING | TD_CHAR | TD_FLOAT | TD_VOID | TRUE | FALSE | RETURN | IF | ELSE | WHILE | FOR | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR );";
        }
    }
 

}