// $ANTLR 3.4 /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g 2013-06-11 23:43:25

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class CmbParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARGS", "ARGUMENTOS", "ATRIBUICAO", "CAEBECALHO", "CHAR", "COMMENT", "CORPO", "DECLARACAO", "DECLARACOES", "ELSE", "ESC_SEQ", "FALSE", "FUNCAO", "HEX_DIGIT", "ID", "IF", "INT", "INVOCACAO", "OCTAL_ESC", "PROGRAMA", "READ", "RETURN", "STATEMENTS", "STRING", "TD_BOOL", "TD_INT", "TD_STRING", "TD_VAZIO", "THEN", "TRUE", "UNICODE_ESC", "WHILE", "WRITE", "WS", "'!'", "'!='", "'%'", "'&&'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", "';'", "'<'", "'<='", "'='", "'=='", "'>'", "'>='", "'{'", "'||'", "'}'"
    };

    public static final int EOF=-1;
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
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int ARGS=4;
    public static final int ARGUMENTOS=5;
    public static final int ATRIBUICAO=6;
    public static final int CAEBECALHO=7;
    public static final int CHAR=8;
    public static final int COMMENT=9;
    public static final int CORPO=10;
    public static final int DECLARACAO=11;
    public static final int DECLARACOES=12;
    public static final int ELSE=13;
    public static final int ESC_SEQ=14;
    public static final int FALSE=15;
    public static final int FUNCAO=16;
    public static final int HEX_DIGIT=17;
    public static final int ID=18;
    public static final int IF=19;
    public static final int INT=20;
    public static final int INVOCACAO=21;
    public static final int OCTAL_ESC=22;
    public static final int PROGRAMA=23;
    public static final int READ=24;
    public static final int RETURN=25;
    public static final int STATEMENTS=26;
    public static final int STRING=27;
    public static final int TD_BOOL=28;
    public static final int TD_INT=29;
    public static final int TD_STRING=30;
    public static final int TD_VAZIO=31;
    public static final int THEN=32;
    public static final int TRUE=33;
    public static final int UNICODE_ESC=34;
    public static final int WHILE=35;
    public static final int WRITE=36;
    public static final int WS=37;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public CmbParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public CmbParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return CmbParser.tokenNames; }
    public String getGrammarFileName() { return "/home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g"; }


    public static class programa_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "programa"
    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:28:1: programa : ( funcao )+ -> ^( PROGRAMA ( funcao )+ ) ;
    public final CmbParser.programa_return programa() throws RecognitionException {
        CmbParser.programa_return retval = new CmbParser.programa_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        CmbParser.funcao_return funcao1 =null;


        RewriteRuleSubtreeStream stream_funcao=new RewriteRuleSubtreeStream(adaptor,"rule funcao");
        try {
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:29:2: ( ( funcao )+ -> ^( PROGRAMA ( funcao )+ ) )
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:29:4: ( funcao )+
            {
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:29:4: ( funcao )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= TD_BOOL && LA1_0 <= TD_VAZIO)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:29:4: funcao
            	    {
            	    pushFollow(FOLLOW_funcao_in_programa99);
            	    funcao1=funcao();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_funcao.add(funcao1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            // AST REWRITE
            // elements: funcao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 30:2: -> ^( PROGRAMA ( funcao )+ )
            {
                // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:30:5: ^( PROGRAMA ( funcao )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PROGRAMA, "PROGRAMA")
                , root_1);

                if ( !(stream_funcao.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_funcao.hasNext() ) {
                    adaptor.addChild(root_1, stream_funcao.nextTree());

                }
                stream_funcao.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "programa"


    public static class funcao_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcao"
    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:33:1: funcao : cabecalho '{' corpo_funcao '}' -> ^( FUNCAO cabecalho corpo_funcao ) ;
    public final CmbParser.funcao_return funcao() throws RecognitionException {
        CmbParser.funcao_return retval = new CmbParser.funcao_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal3=null;
        Token char_literal5=null;
        CmbParser.cabecalho_return cabecalho2 =null;

        CmbParser.corpo_funcao_return corpo_funcao4 =null;


        Object char_literal3_tree=null;
        Object char_literal5_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleSubtreeStream stream_cabecalho=new RewriteRuleSubtreeStream(adaptor,"rule cabecalho");
        RewriteRuleSubtreeStream stream_corpo_funcao=new RewriteRuleSubtreeStream(adaptor,"rule corpo_funcao");
        try {
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:34:2: ( cabecalho '{' corpo_funcao '}' -> ^( FUNCAO cabecalho corpo_funcao ) )
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:34:4: cabecalho '{' corpo_funcao '}'
            {
            pushFollow(FOLLOW_cabecalho_in_funcao121);
            cabecalho2=cabecalho();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_cabecalho.add(cabecalho2.getTree());

            char_literal3=(Token)match(input,56,FOLLOW_56_in_funcao123); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_56.add(char_literal3);


            pushFollow(FOLLOW_corpo_funcao_in_funcao125);
            corpo_funcao4=corpo_funcao();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_corpo_funcao.add(corpo_funcao4.getTree());

            char_literal5=(Token)match(input,58,FOLLOW_58_in_funcao127); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_58.add(char_literal5);


            // AST REWRITE
            // elements: cabecalho, corpo_funcao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 35:2: -> ^( FUNCAO cabecalho corpo_funcao )
            {
                // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:35:5: ^( FUNCAO cabecalho corpo_funcao )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FUNCAO, "FUNCAO")
                , root_1);

                adaptor.addChild(root_1, stream_cabecalho.nextTree());

                adaptor.addChild(root_1, stream_corpo_funcao.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "funcao"


    public static class cabecalho_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cabecalho"
    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:38:1: cabecalho : tipo ID '(' ( argumentos )? ')' -> ^( CAEBECALHO tipo ID ( argumentos )? ) ;
    public final CmbParser.cabecalho_return cabecalho() throws RecognitionException {
        CmbParser.cabecalho_return retval = new CmbParser.cabecalho_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID7=null;
        Token char_literal8=null;
        Token char_literal10=null;
        CmbParser.tipo_return tipo6 =null;

        CmbParser.argumentos_return argumentos9 =null;


        Object ID7_tree=null;
        Object char_literal8_tree=null;
        Object char_literal10_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_tipo=new RewriteRuleSubtreeStream(adaptor,"rule tipo");
        RewriteRuleSubtreeStream stream_argumentos=new RewriteRuleSubtreeStream(adaptor,"rule argumentos");
        try {
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:39:2: ( tipo ID '(' ( argumentos )? ')' -> ^( CAEBECALHO tipo ID ( argumentos )? ) )
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:39:4: tipo ID '(' ( argumentos )? ')'
            {
            pushFollow(FOLLOW_tipo_in_cabecalho150);
            tipo6=tipo();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tipo.add(tipo6.getTree());

            ID7=(Token)match(input,ID,FOLLOW_ID_in_cabecalho152); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID7);


            char_literal8=(Token)match(input,42,FOLLOW_42_in_cabecalho154); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_42.add(char_literal8);


            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:39:16: ( argumentos )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0 >= TD_BOOL && LA2_0 <= TD_VAZIO)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:39:16: argumentos
                    {
                    pushFollow(FOLLOW_argumentos_in_cabecalho156);
                    argumentos9=argumentos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_argumentos.add(argumentos9.getTree());

                    }
                    break;

            }


            char_literal10=(Token)match(input,43,FOLLOW_43_in_cabecalho159); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_43.add(char_literal10);


            // AST REWRITE
            // elements: argumentos, tipo, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 40:2: -> ^( CAEBECALHO tipo ID ( argumentos )? )
            {
                // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:40:5: ^( CAEBECALHO tipo ID ( argumentos )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CAEBECALHO, "CAEBECALHO")
                , root_1);

                adaptor.addChild(root_1, stream_tipo.nextTree());

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:40:26: ( argumentos )?
                if ( stream_argumentos.hasNext() ) {
                    adaptor.addChild(root_1, stream_argumentos.nextTree());

                }
                stream_argumentos.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "cabecalho"


    public static class argumentos_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "argumentos"
    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:43:1: argumentos : declaracao ( ',' declaracao )* -> ^( ARGUMENTOS ( declaracao )+ ) ;
    public final CmbParser.argumentos_return argumentos() throws RecognitionException {
        CmbParser.argumentos_return retval = new CmbParser.argumentos_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal12=null;
        CmbParser.declaracao_return declaracao11 =null;

        CmbParser.declaracao_return declaracao13 =null;


        Object char_literal12_tree=null;
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleSubtreeStream stream_declaracao=new RewriteRuleSubtreeStream(adaptor,"rule declaracao");
        try {
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:44:2: ( declaracao ( ',' declaracao )* -> ^( ARGUMENTOS ( declaracao )+ ) )
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:44:4: declaracao ( ',' declaracao )*
            {
            pushFollow(FOLLOW_declaracao_in_argumentos184);
            declaracao11=declaracao();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declaracao.add(declaracao11.getTree());

            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:44:15: ( ',' declaracao )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==46) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:44:16: ',' declaracao
            	    {
            	    char_literal12=(Token)match(input,46,FOLLOW_46_in_argumentos187); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_46.add(char_literal12);


            	    pushFollow(FOLLOW_declaracao_in_argumentos189);
            	    declaracao13=declaracao();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_declaracao.add(declaracao13.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            // AST REWRITE
            // elements: declaracao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 45:2: -> ^( ARGUMENTOS ( declaracao )+ )
            {
                // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:45:5: ^( ARGUMENTOS ( declaracao )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ARGUMENTOS, "ARGUMENTOS")
                , root_1);

                if ( !(stream_declaracao.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_declaracao.hasNext() ) {
                    adaptor.addChild(root_1, stream_declaracao.nextTree());

                }
                stream_declaracao.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "argumentos"


    public static class corpo_funcao_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "corpo_funcao"
    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:48:1: corpo_funcao : declaracoes statements -> ^( CORPO declaracoes statements ) ;
    public final CmbParser.corpo_funcao_return corpo_funcao() throws RecognitionException {
        CmbParser.corpo_funcao_return retval = new CmbParser.corpo_funcao_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        CmbParser.declaracoes_return declaracoes14 =null;

        CmbParser.statements_return statements15 =null;


        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        RewriteRuleSubtreeStream stream_declaracoes=new RewriteRuleSubtreeStream(adaptor,"rule declaracoes");
        try {
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:49:2: ( declaracoes statements -> ^( CORPO declaracoes statements ) )
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:49:4: declaracoes statements
            {
            pushFollow(FOLLOW_declaracoes_in_corpo_funcao212);
            declaracoes14=declaracoes();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declaracoes.add(declaracoes14.getTree());

            pushFollow(FOLLOW_statements_in_corpo_funcao214);
            statements15=statements();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statements.add(statements15.getTree());

            // AST REWRITE
            // elements: declaracoes, statements
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 50:2: -> ^( CORPO declaracoes statements )
            {
                // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:50:5: ^( CORPO declaracoes statements )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CORPO, "CORPO")
                , root_1);

                adaptor.addChild(root_1, stream_declaracoes.nextTree());

                adaptor.addChild(root_1, stream_statements.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "corpo_funcao"


    public static class declaracoes_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaracoes"
    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:54:1: declaracoes : ( declaracao ';' )+ -> ^( DECLARACOES ( declaracao )+ ) ;
    public final CmbParser.declaracoes_return declaracoes() throws RecognitionException {
        CmbParser.declaracoes_return retval = new CmbParser.declaracoes_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal17=null;
        CmbParser.declaracao_return declaracao16 =null;


        Object char_literal17_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleSubtreeStream stream_declaracao=new RewriteRuleSubtreeStream(adaptor,"rule declaracao");
        try {
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:55:2: ( ( declaracao ';' )+ -> ^( DECLARACOES ( declaracao )+ ) )
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:55:4: ( declaracao ';' )+
            {
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:55:4: ( declaracao ';' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= TD_BOOL && LA4_0 <= TD_VAZIO)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:55:5: declaracao ';'
            	    {
            	    pushFollow(FOLLOW_declaracao_in_declaracoes238);
            	    declaracao16=declaracao();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_declaracao.add(declaracao16.getTree());

            	    char_literal17=(Token)match(input,49,FOLLOW_49_in_declaracoes240); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_49.add(char_literal17);


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            // AST REWRITE
            // elements: declaracao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 56:2: -> ^( DECLARACOES ( declaracao )+ )
            {
                // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:56:5: ^( DECLARACOES ( declaracao )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DECLARACOES, "DECLARACOES")
                , root_1);

                if ( !(stream_declaracao.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_declaracao.hasNext() ) {
                    adaptor.addChild(root_1, stream_declaracao.nextTree());

                }
                stream_declaracao.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declaracoes"


    public static class declaracao_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaracao"
    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:59:1: declaracao : tipo ID -> ^( DECLARACAO tipo ID ) ;
    public final CmbParser.declaracao_return declaracao() throws RecognitionException {
        CmbParser.declaracao_return retval = new CmbParser.declaracao_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID19=null;
        CmbParser.tipo_return tipo18 =null;


        Object ID19_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_tipo=new RewriteRuleSubtreeStream(adaptor,"rule tipo");
        try {
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:60:2: ( tipo ID -> ^( DECLARACAO tipo ID ) )
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:60:4: tipo ID
            {
            pushFollow(FOLLOW_tipo_in_declaracao264);
            tipo18=tipo();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tipo.add(tipo18.getTree());

            ID19=(Token)match(input,ID,FOLLOW_ID_in_declaracao266); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID19);


            // AST REWRITE
            // elements: tipo, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 61:2: -> ^( DECLARACAO tipo ID )
            {
                // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:61:5: ^( DECLARACAO tipo ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DECLARACAO, "DECLARACAO")
                , root_1);

                adaptor.addChild(root_1, stream_tipo.nextTree());

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declaracao"


    public static class tipo_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tipo"
    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:64:1: tipo : ( TD_INT | TD_BOOL | TD_STRING | TD_VAZIO );
    public final CmbParser.tipo_return tipo() throws RecognitionException {
        CmbParser.tipo_return retval = new CmbParser.tipo_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set20=null;

        Object set20_tree=null;

        try {
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:65:2: ( TD_INT | TD_BOOL | TD_STRING | TD_VAZIO )
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:
            {
            root_0 = (Object)adaptor.nil();


            set20=(Token)input.LT(1);

            if ( (input.LA(1) >= TD_BOOL && input.LA(1) <= TD_VAZIO) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set20)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tipo"


    public static class statements_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statements"
    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:71:1: statements : ( statement )+ -> ^( STATEMENTS ( statement )+ ) ;
    public final CmbParser.statements_return statements() throws RecognitionException {
        CmbParser.statements_return retval = new CmbParser.statements_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        CmbParser.statement_return statement21 =null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:72:2: ( ( statement )+ -> ^( STATEMENTS ( statement )+ ) )
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:72:4: ( statement )+
            {
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:72:4: ( statement )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= ID && LA5_0 <= IF)||(LA5_0 >= READ && LA5_0 <= RETURN)||(LA5_0 >= WHILE && LA5_0 <= WRITE)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:72:4: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_statements321);
            	    statement21=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement21.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 73:2: -> ^( STATEMENTS ( statement )+ )
            {
                // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:73:5: ^( STATEMENTS ( statement )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(STATEMENTS, "STATEMENTS")
                , root_1);

                if ( !(stream_statement.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statements"


    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:77:1: statement : ( atribuicao ';' -> atribuicao | read ';' -> read | write ';' -> write | ifs -> ifs | whiles -> whiles | invocacao ';' -> invocacao | retorna ';' -> retorna );
    public final CmbParser.statement_return statement() throws RecognitionException {
        CmbParser.statement_return retval = new CmbParser.statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal23=null;
        Token char_literal25=null;
        Token char_literal27=null;
        Token char_literal31=null;
        Token char_literal33=null;
        CmbParser.atribuicao_return atribuicao22 =null;

        CmbParser.read_return read24 =null;

        CmbParser.write_return write26 =null;

        CmbParser.ifs_return ifs28 =null;

        CmbParser.whiles_return whiles29 =null;

        CmbParser.invocacao_return invocacao30 =null;

        CmbParser.retorna_return retorna32 =null;


        Object char_literal23_tree=null;
        Object char_literal25_tree=null;
        Object char_literal27_tree=null;
        Object char_literal31_tree=null;
        Object char_literal33_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleSubtreeStream stream_atribuicao=new RewriteRuleSubtreeStream(adaptor,"rule atribuicao");
        RewriteRuleSubtreeStream stream_write=new RewriteRuleSubtreeStream(adaptor,"rule write");
        RewriteRuleSubtreeStream stream_retorna=new RewriteRuleSubtreeStream(adaptor,"rule retorna");
        RewriteRuleSubtreeStream stream_read=new RewriteRuleSubtreeStream(adaptor,"rule read");
        RewriteRuleSubtreeStream stream_whiles=new RewriteRuleSubtreeStream(adaptor,"rule whiles");
        RewriteRuleSubtreeStream stream_ifs=new RewriteRuleSubtreeStream(adaptor,"rule ifs");
        RewriteRuleSubtreeStream stream_invocacao=new RewriteRuleSubtreeStream(adaptor,"rule invocacao");
        try {
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:78:2: ( atribuicao ';' -> atribuicao | read ';' -> read | write ';' -> write | ifs -> ifs | whiles -> whiles | invocacao ';' -> invocacao | retorna ';' -> retorna )
            int alt6=7;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==52) ) {
                    alt6=1;
                }
                else if ( (LA6_1==42) ) {
                    alt6=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
                }
                break;
            case READ:
                {
                alt6=2;
                }
                break;
            case WRITE:
                {
                alt6=3;
                }
                break;
            case IF:
                {
                alt6=4;
                }
                break;
            case WHILE:
                {
                alt6=5;
                }
                break;
            case RETURN:
                {
                alt6=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:78:4: atribuicao ';'
                    {
                    pushFollow(FOLLOW_atribuicao_in_statement345);
                    atribuicao22=atribuicao();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_atribuicao.add(atribuicao22.getTree());

                    char_literal23=(Token)match(input,49,FOLLOW_49_in_statement347); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_49.add(char_literal23);


                    // AST REWRITE
                    // elements: atribuicao
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 78:20: -> atribuicao
                    {
                        adaptor.addChild(root_0, stream_atribuicao.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:79:4: read ';'
                    {
                    pushFollow(FOLLOW_read_in_statement357);
                    read24=read();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_read.add(read24.getTree());

                    char_literal25=(Token)match(input,49,FOLLOW_49_in_statement359); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_49.add(char_literal25);


                    // AST REWRITE
                    // elements: read
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 79:14: -> read
                    {
                        adaptor.addChild(root_0, stream_read.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:80:4: write ';'
                    {
                    pushFollow(FOLLOW_write_in_statement369);
                    write26=write();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_write.add(write26.getTree());

                    char_literal27=(Token)match(input,49,FOLLOW_49_in_statement371); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_49.add(char_literal27);


                    // AST REWRITE
                    // elements: write
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 80:15: -> write
                    {
                        adaptor.addChild(root_0, stream_write.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:81:4: ifs
                    {
                    pushFollow(FOLLOW_ifs_in_statement381);
                    ifs28=ifs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ifs.add(ifs28.getTree());

                    // AST REWRITE
                    // elements: ifs
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 81:10: -> ifs
                    {
                        adaptor.addChild(root_0, stream_ifs.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:82:4: whiles
                    {
                    pushFollow(FOLLOW_whiles_in_statement392);
                    whiles29=whiles();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_whiles.add(whiles29.getTree());

                    // AST REWRITE
                    // elements: whiles
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 82:13: -> whiles
                    {
                        adaptor.addChild(root_0, stream_whiles.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:83:4: invocacao ';'
                    {
                    pushFollow(FOLLOW_invocacao_in_statement403);
                    invocacao30=invocacao();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_invocacao.add(invocacao30.getTree());

                    char_literal31=(Token)match(input,49,FOLLOW_49_in_statement405); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_49.add(char_literal31);


                    // AST REWRITE
                    // elements: invocacao
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 83:18: -> invocacao
                    {
                        adaptor.addChild(root_0, stream_invocacao.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:84:4: retorna ';'
                    {
                    pushFollow(FOLLOW_retorna_in_statement414);
                    retorna32=retorna();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_retorna.add(retorna32.getTree());

                    char_literal33=(Token)match(input,49,FOLLOW_49_in_statement416); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_49.add(char_literal33);


                    // AST REWRITE
                    // elements: retorna
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 84:16: -> retorna
                    {
                        adaptor.addChild(root_0, stream_retorna.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class retorna_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "retorna"
    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:87:1: retorna : RETURN expr -> ^( RETURN expr ) ;
    public final CmbParser.retorna_return retorna() throws RecognitionException {
        CmbParser.retorna_return retval = new CmbParser.retorna_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RETURN34=null;
        CmbParser.expr_return expr35 =null;


        Object RETURN34_tree=null;
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:88:2: ( RETURN expr -> ^( RETURN expr ) )
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:88:4: RETURN expr
            {
            RETURN34=(Token)match(input,RETURN,FOLLOW_RETURN_in_retorna432); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RETURN.add(RETURN34);


            pushFollow(FOLLOW_expr_in_retorna434);
            expr35=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr35.getTree());

            // AST REWRITE
            // elements: RETURN, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 89:2: -> ^( RETURN expr )
            {
                // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:89:5: ^( RETURN expr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_RETURN.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "retorna"


    public static class invocacao_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "invocacao"
    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:92:1: invocacao : ID '(' ( args )? ')' -> ^( INVOCACAO ID ( args )? ) ;
    public final CmbParser.invocacao_return invocacao() throws RecognitionException {
        CmbParser.invocacao_return retval = new CmbParser.invocacao_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID36=null;
        Token char_literal37=null;
        Token char_literal39=null;
        CmbParser.args_return args38 =null;


        Object ID36_tree=null;
        Object char_literal37_tree=null;
        Object char_literal39_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:93:2: ( ID '(' ( args )? ')' -> ^( INVOCACAO ID ( args )? ) )
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:93:4: ID '(' ( args )? ')'
            {
            ID36=(Token)match(input,ID,FOLLOW_ID_in_invocacao454); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID36);


            char_literal37=(Token)match(input,42,FOLLOW_42_in_invocacao456); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_42.add(char_literal37);


            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:93:11: ( args )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==FALSE||LA7_0==ID||LA7_0==INT||LA7_0==STRING||LA7_0==TRUE||LA7_0==38||LA7_0==47) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:93:11: args
                    {
                    pushFollow(FOLLOW_args_in_invocacao458);
                    args38=args();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_args.add(args38.getTree());

                    }
                    break;

            }


            char_literal39=(Token)match(input,43,FOLLOW_43_in_invocacao461); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_43.add(char_literal39);


            // AST REWRITE
            // elements: ID, args
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 94:2: -> ^( INVOCACAO ID ( args )? )
            {
                // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:94:5: ^( INVOCACAO ID ( args )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INVOCACAO, "INVOCACAO")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:94:20: ( args )?
                if ( stream_args.hasNext() ) {
                    adaptor.addChild(root_1, stream_args.nextTree());

                }
                stream_args.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "invocacao"


    public static class args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "args"
    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:97:1: args : expr ( ',' expr )* -> ^( ARGS ( expr )+ ) ;
    public final CmbParser.args_return args() throws RecognitionException {
        CmbParser.args_return retval = new CmbParser.args_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal41=null;
        CmbParser.expr_return expr40 =null;

        CmbParser.expr_return expr42 =null;


        Object char_literal41_tree=null;
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:98:2: ( expr ( ',' expr )* -> ^( ARGS ( expr )+ ) )
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:98:4: expr ( ',' expr )*
            {
            pushFollow(FOLLOW_expr_in_args484);
            expr40=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr40.getTree());

            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:98:9: ( ',' expr )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==46) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:98:11: ',' expr
            	    {
            	    char_literal41=(Token)match(input,46,FOLLOW_46_in_args488); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_46.add(char_literal41);


            	    pushFollow(FOLLOW_expr_in_args490);
            	    expr42=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr42.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 99:2: -> ^( ARGS ( expr )+ )
            {
                // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:99:5: ^( ARGS ( expr )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ARGS, "ARGS")
                , root_1);

                if ( !(stream_expr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "args"


    public static class atribuicao_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atribuicao"
    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:102:1: atribuicao : ID '=' expr -> ^( '=' ID expr ) ;
    public final CmbParser.atribuicao_return atribuicao() throws RecognitionException {
        CmbParser.atribuicao_return retval = new CmbParser.atribuicao_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID43=null;
        Token char_literal44=null;
        CmbParser.expr_return expr45 =null;


        Object ID43_tree=null;
        Object char_literal44_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:103:2: ( ID '=' expr -> ^( '=' ID expr ) )
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:103:4: ID '=' expr
            {
            ID43=(Token)match(input,ID,FOLLOW_ID_in_atribuicao514); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID43);


            char_literal44=(Token)match(input,52,FOLLOW_52_in_atribuicao516); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_52.add(char_literal44);


            pushFollow(FOLLOW_expr_in_atribuicao518);
            expr45=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr45.getTree());

            // AST REWRITE
            // elements: ID, expr, 52
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 104:2: -> ^( '=' ID expr )
            {
                // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:104:5: ^( '=' ID expr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_52.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atribuicao"


    public static class write_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "write"
    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:107:1: write : WRITE '(' expr ')' -> ^( WRITE expr ) ;
    public final CmbParser.write_return write() throws RecognitionException {
        CmbParser.write_return retval = new CmbParser.write_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WRITE46=null;
        Token char_literal47=null;
        Token char_literal49=null;
        CmbParser.expr_return expr48 =null;


        Object WRITE46_tree=null;
        Object char_literal47_tree=null;
        Object char_literal49_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_WRITE=new RewriteRuleTokenStream(adaptor,"token WRITE");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:108:2: ( WRITE '(' expr ')' -> ^( WRITE expr ) )
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:108:4: WRITE '(' expr ')'
            {
            WRITE46=(Token)match(input,WRITE,FOLLOW_WRITE_in_write542); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WRITE.add(WRITE46);


            char_literal47=(Token)match(input,42,FOLLOW_42_in_write544); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_42.add(char_literal47);


            pushFollow(FOLLOW_expr_in_write546);
            expr48=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr48.getTree());

            char_literal49=(Token)match(input,43,FOLLOW_43_in_write548); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_43.add(char_literal49);


            // AST REWRITE
            // elements: expr, WRITE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 109:2: -> ^( WRITE expr )
            {
                // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:109:5: ^( WRITE expr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_WRITE.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "write"


    public static class read_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "read"
    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:112:1: read : READ '(' ID ')' -> ^( READ ID ) ;
    public final CmbParser.read_return read() throws RecognitionException {
        CmbParser.read_return retval = new CmbParser.read_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token READ50=null;
        Token char_literal51=null;
        Token ID52=null;
        Token char_literal53=null;

        Object READ50_tree=null;
        Object char_literal51_tree=null;
        Object ID52_tree=null;
        Object char_literal53_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_READ=new RewriteRuleTokenStream(adaptor,"token READ");

        try {
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:113:2: ( READ '(' ID ')' -> ^( READ ID ) )
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:113:4: READ '(' ID ')'
            {
            READ50=(Token)match(input,READ,FOLLOW_READ_in_read570); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_READ.add(READ50);


            char_literal51=(Token)match(input,42,FOLLOW_42_in_read572); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_42.add(char_literal51);


            ID52=(Token)match(input,ID,FOLLOW_ID_in_read574); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID52);


            char_literal53=(Token)match(input,43,FOLLOW_43_in_read576); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_43.add(char_literal53);


            // AST REWRITE
            // elements: ID, READ
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 114:2: -> ^( READ ID )
            {
                // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:114:5: ^( READ ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_READ.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "read"


    public static class ifs_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifs"
    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:118:1: ifs : IF '(' expr ')' bloco ( ELSE bloco )? -> ^( IF expr bloco ( bloco )? ) ;
    public final CmbParser.ifs_return ifs() throws RecognitionException {
        CmbParser.ifs_return retval = new CmbParser.ifs_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IF54=null;
        Token char_literal55=null;
        Token char_literal57=null;
        Token ELSE59=null;
        CmbParser.expr_return expr56 =null;

        CmbParser.bloco_return bloco58 =null;

        CmbParser.bloco_return bloco60 =null;


        Object IF54_tree=null;
        Object char_literal55_tree=null;
        Object char_literal57_tree=null;
        Object ELSE59_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_bloco=new RewriteRuleSubtreeStream(adaptor,"rule bloco");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:119:2: ( IF '(' expr ')' bloco ( ELSE bloco )? -> ^( IF expr bloco ( bloco )? ) )
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:119:4: IF '(' expr ')' bloco ( ELSE bloco )?
            {
            IF54=(Token)match(input,IF,FOLLOW_IF_in_ifs599); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF54);


            char_literal55=(Token)match(input,42,FOLLOW_42_in_ifs601); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_42.add(char_literal55);


            pushFollow(FOLLOW_expr_in_ifs603);
            expr56=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr56.getTree());

            char_literal57=(Token)match(input,43,FOLLOW_43_in_ifs605); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_43.add(char_literal57);


            pushFollow(FOLLOW_bloco_in_ifs607);
            bloco58=bloco();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bloco.add(bloco58.getTree());

            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:119:26: ( ELSE bloco )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ELSE) ) {
                int LA9_1 = input.LA(2);

                if ( (synpred17_Cmb()) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:119:27: ELSE bloco
                    {
                    ELSE59=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifs610); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE59);


                    pushFollow(FOLLOW_bloco_in_ifs612);
                    bloco60=bloco();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bloco.add(bloco60.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: bloco, IF, expr, bloco
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 120:2: -> ^( IF expr bloco ( bloco )? )
            {
                // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:120:5: ^( IF expr bloco ( bloco )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_IF.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_1, stream_bloco.nextTree());

                // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:120:21: ( bloco )?
                if ( stream_bloco.hasNext() ) {
                    adaptor.addChild(root_1, stream_bloco.nextTree());

                }
                stream_bloco.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ifs"


    public static class whiles_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whiles"
    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:123:1: whiles : WHILE '(' expr ')' bloco -> ^( WHILE expr bloco ) ;
    public final CmbParser.whiles_return whiles() throws RecognitionException {
        CmbParser.whiles_return retval = new CmbParser.whiles_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WHILE61=null;
        Token char_literal62=null;
        Token char_literal64=null;
        CmbParser.expr_return expr63 =null;

        CmbParser.bloco_return bloco65 =null;


        Object WHILE61_tree=null;
        Object char_literal62_tree=null;
        Object char_literal64_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleSubtreeStream stream_bloco=new RewriteRuleSubtreeStream(adaptor,"rule bloco");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:124:2: ( WHILE '(' expr ')' bloco -> ^( WHILE expr bloco ) )
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:124:4: WHILE '(' expr ')' bloco
            {
            WHILE61=(Token)match(input,WHILE,FOLLOW_WHILE_in_whiles642); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE61);


            char_literal62=(Token)match(input,42,FOLLOW_42_in_whiles644); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_42.add(char_literal62);


            pushFollow(FOLLOW_expr_in_whiles646);
            expr63=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr63.getTree());

            char_literal64=(Token)match(input,43,FOLLOW_43_in_whiles648); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_43.add(char_literal64);


            pushFollow(FOLLOW_bloco_in_whiles650);
            bloco65=bloco();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bloco.add(bloco65.getTree());

            // AST REWRITE
            // elements: expr, bloco, WHILE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 125:2: -> ^( WHILE expr bloco )
            {
                // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:125:5: ^( WHILE expr bloco )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_WHILE.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_1, stream_bloco.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "whiles"


    public static class bloco_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bloco"
    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:128:1: bloco : ( '{' statements '}' -> statements | statement -> ^( STATEMENTS statement ) );
    public final CmbParser.bloco_return bloco() throws RecognitionException {
        CmbParser.bloco_return retval = new CmbParser.bloco_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal66=null;
        Token char_literal68=null;
        CmbParser.statements_return statements67 =null;

        CmbParser.statement_return statement69 =null;


        Object char_literal66_tree=null;
        Object char_literal68_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        try {
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:129:2: ( '{' statements '}' -> statements | statement -> ^( STATEMENTS statement ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==56) ) {
                alt10=1;
            }
            else if ( ((LA10_0 >= ID && LA10_0 <= IF)||(LA10_0 >= READ && LA10_0 <= RETURN)||(LA10_0 >= WHILE && LA10_0 <= WRITE)) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:129:4: '{' statements '}'
                    {
                    char_literal66=(Token)match(input,56,FOLLOW_56_in_bloco672); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_56.add(char_literal66);


                    pushFollow(FOLLOW_statements_in_bloco674);
                    statements67=statements();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statements.add(statements67.getTree());

                    char_literal68=(Token)match(input,58,FOLLOW_58_in_bloco676); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_58.add(char_literal68);


                    // AST REWRITE
                    // elements: statements
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 129:25: -> statements
                    {
                        adaptor.addChild(root_0, stream_statements.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:130:4: statement
                    {
                    pushFollow(FOLLOW_statement_in_bloco688);
                    statement69=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement69.getTree());

                    // AST REWRITE
                    // elements: statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 130:17: -> ^( STATEMENTS statement )
                    {
                        // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:130:21: ^( STATEMENTS statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(STATEMENTS, "STATEMENTS")
                        , root_1);

                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bloco"


    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:133:1: expr : orExpr -> orExpr ;
    public final CmbParser.expr_return expr() throws RecognitionException {
        CmbParser.expr_return retval = new CmbParser.expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        CmbParser.orExpr_return orExpr70 =null;


        RewriteRuleSubtreeStream stream_orExpr=new RewriteRuleSubtreeStream(adaptor,"rule orExpr");
        try {
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:134:2: ( orExpr -> orExpr )
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:134:4: orExpr
            {
            pushFollow(FOLLOW_orExpr_in_expr712);
            orExpr70=orExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_orExpr.add(orExpr70.getTree());

            // AST REWRITE
            // elements: orExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 135:2: -> orExpr
            {
                adaptor.addChild(root_0, stream_orExpr.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class orExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "orExpr"
    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:138:1: orExpr : andExpr ( opOr ^ andExpr )* ;
    public final CmbParser.orExpr_return orExpr() throws RecognitionException {
        CmbParser.orExpr_return retval = new CmbParser.orExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        CmbParser.andExpr_return andExpr71 =null;

        CmbParser.opOr_return opOr72 =null;

        CmbParser.andExpr_return andExpr73 =null;



        try {
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:139:2: ( andExpr ( opOr ^ andExpr )* )
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:139:4: andExpr ( opOr ^ andExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_andExpr_in_orExpr730);
            andExpr71=andExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpr71.getTree());

            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:139:12: ( opOr ^ andExpr )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==57) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:139:13: opOr ^ andExpr
            	    {
            	    pushFollow(FOLLOW_opOr_in_orExpr733);
            	    opOr72=opOr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(opOr72.getTree(), root_0);

            	    pushFollow(FOLLOW_andExpr_in_orExpr736);
            	    andExpr73=andExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpr73.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "orExpr"


    public static class andExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "andExpr"
    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:142:1: andExpr : equalityExpr ( opAnd ^ equalityExpr )* ;
    public final CmbParser.andExpr_return andExpr() throws RecognitionException {
        CmbParser.andExpr_return retval = new CmbParser.andExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        CmbParser.equalityExpr_return equalityExpr74 =null;

        CmbParser.opAnd_return opAnd75 =null;

        CmbParser.equalityExpr_return equalityExpr76 =null;



        try {
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:143:2: ( equalityExpr ( opAnd ^ equalityExpr )* )
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:143:4: equalityExpr ( opAnd ^ equalityExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_equalityExpr_in_andExpr751);
            equalityExpr74=equalityExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpr74.getTree());

            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:143:16: ( opAnd ^ equalityExpr )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==41) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:143:17: opAnd ^ equalityExpr
            	    {
            	    pushFollow(FOLLOW_opAnd_in_andExpr753);
            	    opAnd75=opAnd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(opAnd75.getTree(), root_0);

            	    pushFollow(FOLLOW_equalityExpr_in_andExpr756);
            	    equalityExpr76=equalityExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpr76.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "andExpr"


    public static class equalityExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equalityExpr"
    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:146:1: equalityExpr : additiveExpr ( opRel ^ additiveExpr )* ;
    public final CmbParser.equalityExpr_return equalityExpr() throws RecognitionException {
        CmbParser.equalityExpr_return retval = new CmbParser.equalityExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        CmbParser.additiveExpr_return additiveExpr77 =null;

        CmbParser.opRel_return opRel78 =null;

        CmbParser.additiveExpr_return additiveExpr79 =null;



        try {
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:147:2: ( additiveExpr ( opRel ^ additiveExpr )* )
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:147:4: additiveExpr ( opRel ^ additiveExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_additiveExpr_in_equalityExpr771);
            additiveExpr77=additiveExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpr77.getTree());

            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:147:17: ( opRel ^ additiveExpr )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==39||(LA13_0 >= 50 && LA13_0 <= 51)||(LA13_0 >= 53 && LA13_0 <= 55)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:147:18: opRel ^ additiveExpr
            	    {
            	    pushFollow(FOLLOW_opRel_in_equalityExpr774);
            	    opRel78=opRel();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(opRel78.getTree(), root_0);

            	    pushFollow(FOLLOW_additiveExpr_in_equalityExpr777);
            	    additiveExpr79=additiveExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpr79.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "equalityExpr"


    public static class additiveExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "additiveExpr"
    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:151:1: additiveExpr : multiplicativeExpr ( opAdd ^ multiplicativeExpr )* ;
    public final CmbParser.additiveExpr_return additiveExpr() throws RecognitionException {
        CmbParser.additiveExpr_return retval = new CmbParser.additiveExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        CmbParser.multiplicativeExpr_return multiplicativeExpr80 =null;

        CmbParser.opAdd_return opAdd81 =null;

        CmbParser.multiplicativeExpr_return multiplicativeExpr82 =null;



        try {
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:152:2: ( multiplicativeExpr ( opAdd ^ multiplicativeExpr )* )
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:152:4: multiplicativeExpr ( opAdd ^ multiplicativeExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_multiplicativeExpr_in_additiveExpr792);
            multiplicativeExpr80=multiplicativeExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpr80.getTree());

            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:152:23: ( opAdd ^ multiplicativeExpr )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==45||LA14_0==47) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:152:24: opAdd ^ multiplicativeExpr
            	    {
            	    pushFollow(FOLLOW_opAdd_in_additiveExpr795);
            	    opAdd81=opAdd();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(opAdd81.getTree(), root_0);

            	    pushFollow(FOLLOW_multiplicativeExpr_in_additiveExpr798);
            	    multiplicativeExpr82=multiplicativeExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpr82.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "additiveExpr"


    public static class multiplicativeExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multiplicativeExpr"
    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:155:1: multiplicativeExpr : notExpr ( opMul ^ notExpr )* ;
    public final CmbParser.multiplicativeExpr_return multiplicativeExpr() throws RecognitionException {
        CmbParser.multiplicativeExpr_return retval = new CmbParser.multiplicativeExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        CmbParser.notExpr_return notExpr83 =null;

        CmbParser.opMul_return opMul84 =null;

        CmbParser.notExpr_return notExpr85 =null;



        try {
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:156:2: ( notExpr ( opMul ^ notExpr )* )
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:156:4: notExpr ( opMul ^ notExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_notExpr_in_multiplicativeExpr813);
            notExpr83=notExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, notExpr83.getTree());

            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:156:12: ( opMul ^ notExpr )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==40||LA15_0==44||LA15_0==48) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:156:13: opMul ^ notExpr
            	    {
            	    pushFollow(FOLLOW_opMul_in_multiplicativeExpr816);
            	    opMul84=opMul();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(opMul84.getTree(), root_0);

            	    pushFollow(FOLLOW_notExpr_in_multiplicativeExpr819);
            	    notExpr85=notExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, notExpr85.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "multiplicativeExpr"


    public static class notExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "notExpr"
    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:159:1: notExpr : ( opNot ^)? negationExpr ;
    public final CmbParser.notExpr_return notExpr() throws RecognitionException {
        CmbParser.notExpr_return retval = new CmbParser.notExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        CmbParser.opNot_return opNot86 =null;

        CmbParser.negationExpr_return negationExpr87 =null;



        try {
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:160:2: ( ( opNot ^)? negationExpr )
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:160:4: ( opNot ^)? negationExpr
            {
            root_0 = (Object)adaptor.nil();


            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:160:4: ( opNot ^)?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==38) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:160:5: opNot ^
                    {
                    pushFollow(FOLLOW_opNot_in_notExpr835);
                    opNot86=opNot();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(opNot86.getTree(), root_0);

                    }
                    break;

            }


            pushFollow(FOLLOW_negationExpr_in_notExpr840);
            negationExpr87=negationExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, negationExpr87.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "notExpr"


    public static class negationExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "negationExpr"
    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:163:1: negationExpr : ( '-' ^)? factor ;
    public final CmbParser.negationExpr_return negationExpr() throws RecognitionException {
        CmbParser.negationExpr_return retval = new CmbParser.negationExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal88=null;
        CmbParser.factor_return factor89 =null;


        Object char_literal88_tree=null;

        try {
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:164:2: ( ( '-' ^)? factor )
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:164:4: ( '-' ^)? factor
            {
            root_0 = (Object)adaptor.nil();


            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:164:4: ( '-' ^)?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==47) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:164:5: '-' ^
                    {
                    char_literal88=(Token)match(input,47,FOLLOW_47_in_negationExpr852); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal88_tree = 
                    (Object)adaptor.create(char_literal88)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(char_literal88_tree, root_0);
                    }

                    }
                    break;

            }


            pushFollow(FOLLOW_factor_in_negationExpr857);
            factor89=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, factor89.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "negationExpr"


    public static class opAdd_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "opAdd"
    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:168:1: opAdd : ( '+' | '-' );
    public final CmbParser.opAdd_return opAdd() throws RecognitionException {
        CmbParser.opAdd_return retval = new CmbParser.opAdd_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set90=null;

        Object set90_tree=null;

        try {
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:169:2: ( '+' | '-' )
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:
            {
            root_0 = (Object)adaptor.nil();


            set90=(Token)input.LT(1);

            if ( input.LA(1)==45||input.LA(1)==47 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set90)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "opAdd"


    public static class opMul_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "opMul"
    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:173:1: opMul : ( '*' | '/' | '%' );
    public final CmbParser.opMul_return opMul() throws RecognitionException {
        CmbParser.opMul_return retval = new CmbParser.opMul_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set91=null;

        Object set91_tree=null;

        try {
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:174:2: ( '*' | '/' | '%' )
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:
            {
            root_0 = (Object)adaptor.nil();


            set91=(Token)input.LT(1);

            if ( input.LA(1)==40||input.LA(1)==44||input.LA(1)==48 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set91)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "opMul"


    public static class opOr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "opOr"
    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:179:1: opOr : '||' ;
    public final CmbParser.opOr_return opOr() throws RecognitionException {
        CmbParser.opOr_return retval = new CmbParser.opOr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal92=null;

        Object string_literal92_tree=null;

        try {
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:179:5: ( '||' )
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:179:7: '||'
            {
            root_0 = (Object)adaptor.nil();


            string_literal92=(Token)match(input,57,FOLLOW_57_in_opOr915); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal92_tree = 
            (Object)adaptor.create(string_literal92)
            ;
            adaptor.addChild(root_0, string_literal92_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "opOr"


    public static class opAnd_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "opAnd"
    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:182:1: opAnd : '&&' ;
    public final CmbParser.opAnd_return opAnd() throws RecognitionException {
        CmbParser.opAnd_return retval = new CmbParser.opAnd_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal93=null;

        Object string_literal93_tree=null;

        try {
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:183:2: ( '&&' )
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:183:4: '&&'
            {
            root_0 = (Object)adaptor.nil();


            string_literal93=(Token)match(input,41,FOLLOW_41_in_opAnd929); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal93_tree = 
            (Object)adaptor.create(string_literal93)
            ;
            adaptor.addChild(root_0, string_literal93_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "opAnd"


    public static class opRel_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "opRel"
    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:186:1: opRel : ( '>' | '<' | '>=' | '<=' | '==' | '!=' );
    public final CmbParser.opRel_return opRel() throws RecognitionException {
        CmbParser.opRel_return retval = new CmbParser.opRel_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set94=null;

        Object set94_tree=null;

        try {
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:187:2: ( '>' | '<' | '>=' | '<=' | '==' | '!=' )
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:
            {
            root_0 = (Object)adaptor.nil();


            set94=(Token)input.LT(1);

            if ( input.LA(1)==39||(input.LA(1) >= 50 && input.LA(1) <= 51)||(input.LA(1) >= 53 && input.LA(1) <= 55) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set94)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "opRel"


    public static class opNot_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "opNot"
    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:195:1: opNot : '!' ;
    public final CmbParser.opNot_return opNot() throws RecognitionException {
        CmbParser.opNot_return retval = new CmbParser.opNot_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal95=null;

        Object char_literal95_tree=null;

        try {
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:196:2: ( '!' )
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:196:4: '!'
            {
            root_0 = (Object)adaptor.nil();


            char_literal95=(Token)match(input,38,FOLLOW_38_in_opNot992); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal95_tree = 
            (Object)adaptor.create(char_literal95)
            ;
            adaptor.addChild(root_0, char_literal95_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "opNot"


    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:199:1: factor : ( ID | constante -> constante | invocacao -> invocacao );
    public final CmbParser.factor_return factor() throws RecognitionException {
        CmbParser.factor_return retval = new CmbParser.factor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID96=null;
        CmbParser.constante_return constante97 =null;

        CmbParser.invocacao_return invocacao98 =null;


        Object ID96_tree=null;
        RewriteRuleSubtreeStream stream_constante=new RewriteRuleSubtreeStream(adaptor,"rule constante");
        RewriteRuleSubtreeStream stream_invocacao=new RewriteRuleSubtreeStream(adaptor,"rule invocacao");
        try {
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:200:2: ( ID | constante -> constante | invocacao -> invocacao )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ID) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==42) ) {
                    alt18=3;
                }
                else if ( (LA18_1==EOF||(LA18_1 >= 39 && LA18_1 <= 41)||(LA18_1 >= 43 && LA18_1 <= 51)||(LA18_1 >= 53 && LA18_1 <= 55)||LA18_1==57) ) {
                    alt18=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA18_0==FALSE||LA18_0==INT||LA18_0==STRING||LA18_0==TRUE) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:200:4: ID
                    {
                    root_0 = (Object)adaptor.nil();


                    ID96=(Token)match(input,ID,FOLLOW_ID_in_factor1005); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID96_tree = 
                    (Object)adaptor.create(ID96)
                    ;
                    adaptor.addChild(root_0, ID96_tree);
                    }

                    }
                    break;
                case 2 :
                    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:201:4: constante
                    {
                    pushFollow(FOLLOW_constante_in_factor1011);
                    constante97=constante();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constante.add(constante97.getTree());

                    // AST REWRITE
                    // elements: constante
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 201:15: -> constante
                    {
                        adaptor.addChild(root_0, stream_constante.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:202:4: invocacao
                    {
                    pushFollow(FOLLOW_invocacao_in_factor1022);
                    invocacao98=invocacao();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_invocacao.add(invocacao98.getTree());

                    // AST REWRITE
                    // elements: invocacao
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 202:15: -> invocacao
                    {
                        adaptor.addChild(root_0, stream_invocacao.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"


    public static class constante_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constante"
    // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:205:1: constante : ( STRING | INT | TRUE | FALSE );
    public final CmbParser.constante_return constante() throws RecognitionException {
        CmbParser.constante_return retval = new CmbParser.constante_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set99=null;

        Object set99_tree=null;

        try {
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:206:2: ( STRING | INT | TRUE | FALSE )
            // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:
            {
            root_0 = (Object)adaptor.nil();


            set99=(Token)input.LT(1);

            if ( input.LA(1)==FALSE||input.LA(1)==INT||input.LA(1)==STRING||input.LA(1)==TRUE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set99)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constante"

    // $ANTLR start synpred17_Cmb
    public final void synpred17_Cmb_fragment() throws RecognitionException {
        // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:119:27: ( ELSE bloco )
        // /home/miguel/Documentos/ACS/ATS_EL/Cmb/Gramatica/Cmb.g:119:27: ELSE bloco
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred17_Cmb610); if (state.failed) return ;

        pushFollow(FOLLOW_bloco_in_synpred17_Cmb612);
        bloco();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred17_Cmb

    // Delegated rules

    public final boolean synpred17_Cmb() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_Cmb_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_funcao_in_programa99 = new BitSet(new long[]{0x00000000F0000002L});
    public static final BitSet FOLLOW_cabecalho_in_funcao121 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_funcao123 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_corpo_funcao_in_funcao125 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_funcao127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tipo_in_cabecalho150 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_cabecalho152 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_cabecalho154 = new BitSet(new long[]{0x00000800F0000000L});
    public static final BitSet FOLLOW_argumentos_in_cabecalho156 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_cabecalho159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracao_in_argumentos184 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_argumentos187 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_declaracao_in_argumentos189 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_declaracoes_in_corpo_funcao212 = new BitSet(new long[]{0x00000018030C0000L});
    public static final BitSet FOLLOW_statements_in_corpo_funcao214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracao_in_declaracoes238 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_declaracoes240 = new BitSet(new long[]{0x00000000F0000002L});
    public static final BitSet FOLLOW_tipo_in_declaracao264 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_declaracao266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statements321 = new BitSet(new long[]{0x00000018030C0002L});
    public static final BitSet FOLLOW_atribuicao_in_statement345 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_statement347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_statement357 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_statement359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_statement369 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_statement371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifs_in_statement381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whiles_in_statement392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invocacao_in_statement403 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_statement405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_retorna_in_statement414 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_statement416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_retorna432 = new BitSet(new long[]{0x0000804208148000L});
    public static final BitSet FOLLOW_expr_in_retorna434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_invocacao454 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_invocacao456 = new BitSet(new long[]{0x0000884208148000L});
    public static final BitSet FOLLOW_args_in_invocacao458 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_invocacao461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_args484 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_args488 = new BitSet(new long[]{0x0000804208148000L});
    public static final BitSet FOLLOW_expr_in_args490 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ID_in_atribuicao514 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_atribuicao516 = new BitSet(new long[]{0x0000804208148000L});
    public static final BitSet FOLLOW_expr_in_atribuicao518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write542 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_write544 = new BitSet(new long[]{0x0000804208148000L});
    public static final BitSet FOLLOW_expr_in_write546 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_write548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read570 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_read572 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_read574 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_read576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifs599 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ifs601 = new BitSet(new long[]{0x0000804208148000L});
    public static final BitSet FOLLOW_expr_in_ifs603 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ifs605 = new BitSet(new long[]{0x01000018030C0000L});
    public static final BitSet FOLLOW_bloco_in_ifs607 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ELSE_in_ifs610 = new BitSet(new long[]{0x01000018030C0000L});
    public static final BitSet FOLLOW_bloco_in_ifs612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whiles642 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_whiles644 = new BitSet(new long[]{0x0000804208148000L});
    public static final BitSet FOLLOW_expr_in_whiles646 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_whiles648 = new BitSet(new long[]{0x01000018030C0000L});
    public static final BitSet FOLLOW_bloco_in_whiles650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_bloco672 = new BitSet(new long[]{0x00000018030C0000L});
    public static final BitSet FOLLOW_statements_in_bloco674 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_bloco676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_bloco688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpr_in_expr712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpr_in_orExpr730 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_opOr_in_orExpr733 = new BitSet(new long[]{0x0000804208148000L});
    public static final BitSet FOLLOW_andExpr_in_orExpr736 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_equalityExpr_in_andExpr751 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_opAnd_in_andExpr753 = new BitSet(new long[]{0x0000804208148000L});
    public static final BitSet FOLLOW_equalityExpr_in_andExpr756 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_additiveExpr_in_equalityExpr771 = new BitSet(new long[]{0x00EC008000000002L});
    public static final BitSet FOLLOW_opRel_in_equalityExpr774 = new BitSet(new long[]{0x0000804208148000L});
    public static final BitSet FOLLOW_additiveExpr_in_equalityExpr777 = new BitSet(new long[]{0x00EC008000000002L});
    public static final BitSet FOLLOW_multiplicativeExpr_in_additiveExpr792 = new BitSet(new long[]{0x0000A00000000002L});
    public static final BitSet FOLLOW_opAdd_in_additiveExpr795 = new BitSet(new long[]{0x0000804208148000L});
    public static final BitSet FOLLOW_multiplicativeExpr_in_additiveExpr798 = new BitSet(new long[]{0x0000A00000000002L});
    public static final BitSet FOLLOW_notExpr_in_multiplicativeExpr813 = new BitSet(new long[]{0x0001110000000002L});
    public static final BitSet FOLLOW_opMul_in_multiplicativeExpr816 = new BitSet(new long[]{0x0000804208148000L});
    public static final BitSet FOLLOW_notExpr_in_multiplicativeExpr819 = new BitSet(new long[]{0x0001110000000002L});
    public static final BitSet FOLLOW_opNot_in_notExpr835 = new BitSet(new long[]{0x0000800208148000L});
    public static final BitSet FOLLOW_negationExpr_in_notExpr840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_negationExpr852 = new BitSet(new long[]{0x0000000208148000L});
    public static final BitSet FOLLOW_factor_in_negationExpr857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_opOr915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_opAnd929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_opNot992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constante_in_factor1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invocacao_in_factor1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred17_Cmb610 = new BitSet(new long[]{0x01000018030C0000L});
    public static final BitSet FOLLOW_bloco_in_synpred17_Cmb612 = new BitSet(new long[]{0x0000000000000002L});

}