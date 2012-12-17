// $ANTLR 3.4 C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g 2012-12-17 22:26:40

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class lingi_tomParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMENT", "ELSE", "ESC_SEQ", "EXPONENT", "FALSE", "FLOAT", "FOR", "HEX_DIGIT", "ID", "IF", "INT", "OCTAL_ESC", "RETURN", "STRING", "TD_BOOL", "TD_CHAR", "TD_FLOAT", "TD_INT", "TD_STRING", "TD_VOID", "TRUE", "UNICODE_ESC", "WHILE", "WS", "'!'", "'!='", "'%'", "'&&'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", "';'", "'<'", "'<='", "'='", "'=='", "'>'", "'>='", "'{'", "'||'", "'}'", "AddExpr1", "AddExpr2", "AddExprAux", "AndExpr1", "AndExpr2", "AndExprAux", "Args1", "Args2", "ArgsAux", "Argumentos", "Atribuicao", "BlocoMore", "BlocoOne", "Cabecalho1", "Cabecalho2", "ConstanteBool", "ConstanteChar", "ConstanteInt", "ConstanteString", "Corpo_Funcao1", "Corpo_Funcao2", "Declaracao", "DeclaracaoExpr1", "DeclaracaoExpr2", "Declaracoes", "EqualExpr1", "EqualExpr2", "EqualExprAux", "Expr", "FatorConstante", "FatorID", "FatorInvocacao", "ForExprAtribuicao", "ForExprExpr", "Fors", "Funcao", "Ifs1", "Ifs2", "IfsElse", "Invocacao", "MultExpr1", "MultExpr2", "MultExprAux", "NegationExpr", "NotExpr", "OrExpr1", "OrExpr2", "OrExprAux", "Programa", "Retorna", "Statement", "StatementAtribuicao", "StatementFors", "StatementIfs", "StatementInvocacao", "StatementRetorna", "StatementWhiles", "Whiles"
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public lingi_tomParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public lingi_tomParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return lingi_tomParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g"; }


    public static class programa_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "programa"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:70:1: programa : ( funcao )* -> ^( Programa ( funcao )* ) ;
    public final lingi_tomParser.programa_return programa() throws RecognitionException {
        lingi_tomParser.programa_return retval = new lingi_tomParser.programa_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        lingi_tomParser.funcao_return funcao1 =null;


        RewriteRuleSubtreeStream stream_funcao=new RewriteRuleSubtreeStream(adaptor,"rule funcao");
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:70:9: ( ( funcao )* -> ^( Programa ( funcao )* ) )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:70:11: ( funcao )*
            {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:70:11: ( funcao )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= TD_BOOL && LA1_0 <= TD_VOID)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:70:11: funcao
            	    {
            	    pushFollow(FOLLOW_funcao_in_programa278);
            	    funcao1=funcao();

            	    state._fsp--;

            	    stream_funcao.add(funcao1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // AST REWRITE
            // elements: funcao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 70:23: -> ^( Programa ( funcao )* )
            {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:70:26: ^( Programa ( funcao )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(Programa, "Programa")
                , root_1);

                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:70:37: ( funcao )*
                while ( stream_funcao.hasNext() ) {
                    adaptor.addChild(root_1, stream_funcao.nextTree());

                }
                stream_funcao.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "programa"


    public static class funcao_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcao"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:73:1: funcao : c1= cabecalho '{' c2= corpo_funcao '}' -> ^( Funcao $c1 $c2) ;
    public final lingi_tomParser.funcao_return funcao() throws RecognitionException {
        lingi_tomParser.funcao_return retval = new lingi_tomParser.funcao_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token char_literal2=null;
        Token char_literal3=null;
        lingi_tomParser.cabecalho_return c1 =null;

        lingi_tomParser.corpo_funcao_return c2 =null;


        Tree char_literal2_tree=null;
        Tree char_literal3_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleSubtreeStream stream_cabecalho=new RewriteRuleSubtreeStream(adaptor,"rule cabecalho");
        RewriteRuleSubtreeStream stream_corpo_funcao=new RewriteRuleSubtreeStream(adaptor,"rule corpo_funcao");
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:73:9: (c1= cabecalho '{' c2= corpo_funcao '}' -> ^( Funcao $c1 $c2) )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:73:11: c1= cabecalho '{' c2= corpo_funcao '}'
            {
            pushFollow(FOLLOW_cabecalho_in_funcao306);
            c1=cabecalho();

            state._fsp--;

            stream_cabecalho.add(c1.getTree());

            char_literal2=(Token)match(input,47,FOLLOW_47_in_funcao308);  
            stream_47.add(char_literal2);


            pushFollow(FOLLOW_corpo_funcao_in_funcao312);
            c2=corpo_funcao();

            state._fsp--;

            stream_corpo_funcao.add(c2.getTree());

            char_literal3=(Token)match(input,49,FOLLOW_49_in_funcao314);  
            stream_49.add(char_literal3);


            // AST REWRITE
            // elements: c1, c2
            // token labels: 
            // rule labels: retval, c1, c2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_c1=new RewriteRuleSubtreeStream(adaptor,"rule c1",c1!=null?c1.tree:null);
            RewriteRuleSubtreeStream stream_c2=new RewriteRuleSubtreeStream(adaptor,"rule c2",c2!=null?c2.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 74:8: -> ^( Funcao $c1 $c2)
            {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:74:11: ^( Funcao $c1 $c2)
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(Funcao, "Funcao")
                , root_1);

                adaptor.addChild(root_1, stream_c1.nextTree());

                adaptor.addChild(root_1, stream_c2.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "funcao"


    public static class cabecalho_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cabecalho"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:77:1: cabecalho : tipo ID '(' (a1= argumentos )? ')' -> {a1==null}? ^( Cabecalho1 tipo ID ) -> ^( Cabecalho2 tipo ID ( argumentos )? ) ;
    public final lingi_tomParser.cabecalho_return cabecalho() throws RecognitionException {
        lingi_tomParser.cabecalho_return retval = new lingi_tomParser.cabecalho_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token ID5=null;
        Token char_literal6=null;
        Token char_literal7=null;
        lingi_tomParser.argumentos_return a1 =null;

        lingi_tomParser.tipo_return tipo4 =null;


        Tree ID5_tree=null;
        Tree char_literal6_tree=null;
        Tree char_literal7_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleSubtreeStream stream_tipo=new RewriteRuleSubtreeStream(adaptor,"rule tipo");
        RewriteRuleSubtreeStream stream_argumentos=new RewriteRuleSubtreeStream(adaptor,"rule argumentos");
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:78:3: ( tipo ID '(' (a1= argumentos )? ')' -> {a1==null}? ^( Cabecalho1 tipo ID ) -> ^( Cabecalho2 tipo ID ( argumentos )? ) )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:78:5: tipo ID '(' (a1= argumentos )? ')'
            {
            pushFollow(FOLLOW_tipo_in_cabecalho347);
            tipo4=tipo();

            state._fsp--;

            stream_tipo.add(tipo4.getTree());

            ID5=(Token)match(input,ID,FOLLOW_ID_in_cabecalho349);  
            stream_ID.add(ID5);


            char_literal6=(Token)match(input,33,FOLLOW_33_in_cabecalho351);  
            stream_33.add(char_literal6);


            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:78:19: (a1= argumentos )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0 >= TD_BOOL && LA2_0 <= TD_VOID)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:78:19: a1= argumentos
                    {
                    pushFollow(FOLLOW_argumentos_in_cabecalho355);
                    a1=argumentos();

                    state._fsp--;

                    stream_argumentos.add(a1.getTree());

                    }
                    break;

            }


            char_literal7=(Token)match(input,34,FOLLOW_34_in_cabecalho358);  
            stream_34.add(char_literal7);


            // AST REWRITE
            // elements: tipo, argumentos, tipo, ID, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 78:36: -> {a1==null}? ^( Cabecalho1 tipo ID )
            if (a1==null) {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:78:51: ^( Cabecalho1 tipo ID )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(Cabecalho1, "Cabecalho1")
                , root_1);

                adaptor.addChild(root_1, stream_tipo.nextTree());

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 79:8: -> ^( Cabecalho2 tipo ID ( argumentos )? )
            {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:79:11: ^( Cabecalho2 tipo ID ( argumentos )? )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(Cabecalho2, "Cabecalho2")
                , root_1);

                adaptor.addChild(root_1, stream_tipo.nextTree());

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:79:32: ( argumentos )?
                if ( stream_argumentos.hasNext() ) {
                    adaptor.addChild(root_1, stream_argumentos.nextTree());

                }
                stream_argumentos.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "cabecalho"


    public static class argumentos_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "argumentos"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:82:1: argumentos : declaracao ( ',' declaracao )* -> ^( Argumentos ( declaracao )+ ) ;
    public final lingi_tomParser.argumentos_return argumentos() throws RecognitionException {
        lingi_tomParser.argumentos_return retval = new lingi_tomParser.argumentos_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token char_literal9=null;
        lingi_tomParser.declaracao_return declaracao8 =null;

        lingi_tomParser.declaracao_return declaracao10 =null;


        Tree char_literal9_tree=null;
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleSubtreeStream stream_declaracao=new RewriteRuleSubtreeStream(adaptor,"rule declaracao");
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:83:3: ( declaracao ( ',' declaracao )* -> ^( Argumentos ( declaracao )+ ) )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:83:5: declaracao ( ',' declaracao )*
            {
            pushFollow(FOLLOW_declaracao_in_argumentos403);
            declaracao8=declaracao();

            state._fsp--;

            stream_declaracao.add(declaracao8.getTree());

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:83:16: ( ',' declaracao )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==37) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:83:17: ',' declaracao
            	    {
            	    char_literal9=(Token)match(input,37,FOLLOW_37_in_argumentos406);  
            	    stream_37.add(char_literal9);


            	    pushFollow(FOLLOW_declaracao_in_argumentos408);
            	    declaracao10=declaracao();

            	    state._fsp--;

            	    stream_declaracao.add(declaracao10.getTree());

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
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 83:34: -> ^( Argumentos ( declaracao )+ )
            {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:83:37: ^( Argumentos ( declaracao )+ )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(Argumentos, "Argumentos")
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

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "argumentos"


    public static class corpo_funcao_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "corpo_funcao"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:86:1: corpo_funcao : (d1= declaracoes )? statements -> {d1==null}? ^( Corpo_Funcao1 statements ) -> ^( Corpo_Funcao2 $d1 statements ) ;
    public final lingi_tomParser.corpo_funcao_return corpo_funcao() throws RecognitionException {
        lingi_tomParser.corpo_funcao_return retval = new lingi_tomParser.corpo_funcao_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        lingi_tomParser.declaracoes_return d1 =null;

        lingi_tomParser.statements_return statements11 =null;


        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        RewriteRuleSubtreeStream stream_declaracoes=new RewriteRuleSubtreeStream(adaptor,"rule declaracoes");
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:87:3: ( (d1= declaracoes )? statements -> {d1==null}? ^( Corpo_Funcao1 statements ) -> ^( Corpo_Funcao2 $d1 statements ) )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:87:5: (d1= declaracoes )? statements
            {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:87:7: (d1= declaracoes )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0 >= TD_BOOL && LA4_0 <= TD_VOID)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:87:7: d1= declaracoes
                    {
                    pushFollow(FOLLOW_declaracoes_in_corpo_funcao435);
                    d1=declaracoes();

                    state._fsp--;

                    stream_declaracoes.add(d1.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_statements_in_corpo_funcao438);
            statements11=statements();

            state._fsp--;

            stream_statements.add(statements11.getTree());

            // AST REWRITE
            // elements: d1, statements, statements
            // token labels: 
            // rule labels: d1, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_d1=new RewriteRuleSubtreeStream(adaptor,"rule d1",d1!=null?d1.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 88:8: -> {d1==null}? ^( Corpo_Funcao1 statements )
            if (d1==null) {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:88:23: ^( Corpo_Funcao1 statements )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(Corpo_Funcao1, "Corpo_Funcao1")
                , root_1);

                adaptor.addChild(root_1, stream_statements.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 89:8: -> ^( Corpo_Funcao2 $d1 statements )
            {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:89:11: ^( Corpo_Funcao2 $d1 statements )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(Corpo_Funcao2, "Corpo_Funcao2")
                , root_1);

                adaptor.addChild(root_1, stream_d1.nextTree());

                adaptor.addChild(root_1, stream_statements.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "corpo_funcao"


    public static class declaracoes_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaracoes"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:92:1: declaracoes : ( declaracaoExpr )+ -> ^( Declaracoes ( declaracaoExpr )* ) ;
    public final lingi_tomParser.declaracoes_return declaracoes() throws RecognitionException {
        lingi_tomParser.declaracoes_return retval = new lingi_tomParser.declaracoes_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        lingi_tomParser.declaracaoExpr_return declaracaoExpr12 =null;


        RewriteRuleSubtreeStream stream_declaracaoExpr=new RewriteRuleSubtreeStream(adaptor,"rule declaracaoExpr");
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:93:3: ( ( declaracaoExpr )+ -> ^( Declaracoes ( declaracaoExpr )* ) )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:93:5: ( declaracaoExpr )+
            {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:93:5: ( declaracaoExpr )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= TD_BOOL && LA5_0 <= TD_VOID)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:93:5: declaracaoExpr
            	    {
            	    pushFollow(FOLLOW_declaracaoExpr_in_declaracoes486);
            	    declaracaoExpr12=declaracaoExpr();

            	    state._fsp--;

            	    stream_declaracaoExpr.add(declaracaoExpr12.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            // AST REWRITE
            // elements: declaracaoExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 93:23: -> ^( Declaracoes ( declaracaoExpr )* )
            {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:93:26: ^( Declaracoes ( declaracaoExpr )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(Declaracoes, "Declaracoes")
                , root_1);

                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:93:40: ( declaracaoExpr )*
                while ( stream_declaracaoExpr.hasNext() ) {
                    adaptor.addChild(root_1, stream_declaracaoExpr.nextTree());

                }
                stream_declaracaoExpr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declaracoes"


    public static class declaracaoExpr_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaracaoExpr"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:96:1: declaracaoExpr : declaracao ( '=' expr )? ';' -> {expr==null}? ^( DeclaracaoExpr1 declaracao ) -> ^( DeclaracaoExpr2 declaracao expr ) ;
    public final lingi_tomParser.declaracaoExpr_return declaracaoExpr() throws RecognitionException {
        lingi_tomParser.declaracaoExpr_return retval = new lingi_tomParser.declaracaoExpr_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token char_literal14=null;
        Token char_literal16=null;
        lingi_tomParser.declaracao_return declaracao13 =null;

        lingi_tomParser.expr_return expr15 =null;


        Tree char_literal14_tree=null;
        Tree char_literal16_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleSubtreeStream stream_declaracao=new RewriteRuleSubtreeStream(adaptor,"rule declaracao");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:96:16: ( declaracao ( '=' expr )? ';' -> {expr==null}? ^( DeclaracaoExpr1 declaracao ) -> ^( DeclaracaoExpr2 declaracao expr ) )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:96:18: declaracao ( '=' expr )? ';'
            {
            pushFollow(FOLLOW_declaracao_in_declaracaoExpr511);
            declaracao13=declaracao();

            state._fsp--;

            stream_declaracao.add(declaracao13.getTree());

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:96:29: ( '=' expr )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==43) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:96:30: '=' expr
                    {
                    char_literal14=(Token)match(input,43,FOLLOW_43_in_declaracaoExpr514);  
                    stream_43.add(char_literal14);


                    pushFollow(FOLLOW_expr_in_declaracaoExpr516);
                    expr15=expr();

                    state._fsp--;

                    stream_expr.add(expr15.getTree());

                    }
                    break;

            }


            char_literal16=(Token)match(input,40,FOLLOW_40_in_declaracaoExpr520);  
            stream_40.add(char_literal16);


            // AST REWRITE
            // elements: expr, declaracao, declaracao
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 96:45: -> {expr==null}? ^( DeclaracaoExpr1 declaracao )
            if (expr==null) {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:96:62: ^( DeclaracaoExpr1 declaracao )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(DeclaracaoExpr1, "DeclaracaoExpr1")
                , root_1);

                adaptor.addChild(root_1, stream_declaracao.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 97:8: -> ^( DeclaracaoExpr2 declaracao expr )
            {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:97:11: ^( DeclaracaoExpr2 declaracao expr )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(DeclaracaoExpr2, "DeclaracaoExpr2")
                , root_1);

                adaptor.addChild(root_1, stream_declaracao.nextTree());

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declaracaoExpr"


    public static class declaracao_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaracao"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:100:1: declaracao : tipo ID -> ^( Declaracao tipo ID ) ;
    public final lingi_tomParser.declaracao_return declaracao() throws RecognitionException {
        lingi_tomParser.declaracao_return retval = new lingi_tomParser.declaracao_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token ID18=null;
        lingi_tomParser.tipo_return tipo17 =null;


        Tree ID18_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_tipo=new RewriteRuleSubtreeStream(adaptor,"rule tipo");
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:101:3: ( tipo ID -> ^( Declaracao tipo ID ) )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:101:5: tipo ID
            {
            pushFollow(FOLLOW_tipo_in_declaracao560);
            tipo17=tipo();

            state._fsp--;

            stream_tipo.add(tipo17.getTree());

            ID18=(Token)match(input,ID,FOLLOW_ID_in_declaracao562);  
            stream_ID.add(ID18);


            // AST REWRITE
            // elements: ID, tipo
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 101:16: -> ^( Declaracao tipo ID )
            {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:101:19: ^( Declaracao tipo ID )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(Declaracao, "Declaracao")
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

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declaracao"


    public static class statements_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statements"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:104:1: statements : ( statement )* -> ^( Statement ( statement )* ) ;
    public final lingi_tomParser.statements_return statements() throws RecognitionException {
        lingi_tomParser.statements_return retval = new lingi_tomParser.statements_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        lingi_tomParser.statement_return statement19 =null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:105:3: ( ( statement )* -> ^( Statement ( statement )* ) )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:105:5: ( statement )*
            {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:105:5: ( statement )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==FOR||(LA7_0 >= ID && LA7_0 <= IF)||LA7_0==RETURN||LA7_0==WHILE) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:105:5: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_statements588);
            	    statement19=statement();

            	    state._fsp--;

            	    stream_statement.add(statement19.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 105:18: -> ^( Statement ( statement )* )
            {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:105:21: ^( Statement ( statement )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(Statement, "Statement")
                , root_1);

                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:105:33: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statements"


    public static class statement_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:108:1: statement : ( atribuicao ';' -> ^( StatementAtribuicao atribuicao ) | ifs -> ^( StatementIfs ifs ) | whiles -> ^( StatementWhiles whiles ) | fors -> ^( StatementFors fors ) | invocacao ';' -> ^( StatementInvocacao invocacao ) | retorna ';' -> ^( StatementRetorna retorna ) );
    public final lingi_tomParser.statement_return statement() throws RecognitionException {
        lingi_tomParser.statement_return retval = new lingi_tomParser.statement_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token char_literal21=null;
        Token char_literal26=null;
        Token char_literal28=null;
        lingi_tomParser.atribuicao_return atribuicao20 =null;

        lingi_tomParser.ifs_return ifs22 =null;

        lingi_tomParser.whiles_return whiles23 =null;

        lingi_tomParser.fors_return fors24 =null;

        lingi_tomParser.invocacao_return invocacao25 =null;

        lingi_tomParser.retorna_return retorna27 =null;


        Tree char_literal21_tree=null;
        Tree char_literal26_tree=null;
        Tree char_literal28_tree=null;
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleSubtreeStream stream_atribuicao=new RewriteRuleSubtreeStream(adaptor,"rule atribuicao");
        RewriteRuleSubtreeStream stream_retorna=new RewriteRuleSubtreeStream(adaptor,"rule retorna");
        RewriteRuleSubtreeStream stream_fors=new RewriteRuleSubtreeStream(adaptor,"rule fors");
        RewriteRuleSubtreeStream stream_whiles=new RewriteRuleSubtreeStream(adaptor,"rule whiles");
        RewriteRuleSubtreeStream stream_ifs=new RewriteRuleSubtreeStream(adaptor,"rule ifs");
        RewriteRuleSubtreeStream stream_invocacao=new RewriteRuleSubtreeStream(adaptor,"rule invocacao");
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:109:3: ( atribuicao ';' -> ^( StatementAtribuicao atribuicao ) | ifs -> ^( StatementIfs ifs ) | whiles -> ^( StatementWhiles whiles ) | fors -> ^( StatementFors fors ) | invocacao ';' -> ^( StatementInvocacao invocacao ) | retorna ';' -> ^( StatementRetorna retorna ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==43) ) {
                    alt8=1;
                }
                else if ( (LA8_1==33) ) {
                    alt8=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:109:5: atribuicao ';'
                    {
                    pushFollow(FOLLOW_atribuicao_in_statement614);
                    atribuicao20=atribuicao();

                    state._fsp--;

                    stream_atribuicao.add(atribuicao20.getTree());

                    char_literal21=(Token)match(input,40,FOLLOW_40_in_statement616);  
                    stream_40.add(char_literal21);


                    // AST REWRITE
                    // elements: atribuicao
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 109:22: -> ^( StatementAtribuicao atribuicao )
                    {
                        // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:109:25: ^( StatementAtribuicao atribuicao )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot(
                        (Tree)adaptor.create(StatementAtribuicao, "StatementAtribuicao")
                        , root_1);

                        adaptor.addChild(root_1, stream_atribuicao.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:110:5: ifs
                    {
                    pushFollow(FOLLOW_ifs_in_statement632);
                    ifs22=ifs();

                    state._fsp--;

                    stream_ifs.add(ifs22.getTree());

                    // AST REWRITE
                    // elements: ifs
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 110:12: -> ^( StatementIfs ifs )
                    {
                        // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:110:15: ^( StatementIfs ifs )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot(
                        (Tree)adaptor.create(StatementIfs, "StatementIfs")
                        , root_1);

                        adaptor.addChild(root_1, stream_ifs.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:111:5: whiles
                    {
                    pushFollow(FOLLOW_whiles_in_statement649);
                    whiles23=whiles();

                    state._fsp--;

                    stream_whiles.add(whiles23.getTree());

                    // AST REWRITE
                    // elements: whiles
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 111:15: -> ^( StatementWhiles whiles )
                    {
                        // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:111:18: ^( StatementWhiles whiles )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot(
                        (Tree)adaptor.create(StatementWhiles, "StatementWhiles")
                        , root_1);

                        adaptor.addChild(root_1, stream_whiles.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:112:5: fors
                    {
                    pushFollow(FOLLOW_fors_in_statement666);
                    fors24=fors();

                    state._fsp--;

                    stream_fors.add(fors24.getTree());

                    // AST REWRITE
                    // elements: fors
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 112:13: -> ^( StatementFors fors )
                    {
                        // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:112:16: ^( StatementFors fors )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot(
                        (Tree)adaptor.create(StatementFors, "StatementFors")
                        , root_1);

                        adaptor.addChild(root_1, stream_fors.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:113:5: invocacao ';'
                    {
                    pushFollow(FOLLOW_invocacao_in_statement683);
                    invocacao25=invocacao();

                    state._fsp--;

                    stream_invocacao.add(invocacao25.getTree());

                    char_literal26=(Token)match(input,40,FOLLOW_40_in_statement685);  
                    stream_40.add(char_literal26);


                    // AST REWRITE
                    // elements: invocacao
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 113:21: -> ^( StatementInvocacao invocacao )
                    {
                        // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:113:24: ^( StatementInvocacao invocacao )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot(
                        (Tree)adaptor.create(StatementInvocacao, "StatementInvocacao")
                        , root_1);

                        adaptor.addChild(root_1, stream_invocacao.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:114:5: retorna ';'
                    {
                    pushFollow(FOLLOW_retorna_in_statement701);
                    retorna27=retorna();

                    state._fsp--;

                    stream_retorna.add(retorna27.getTree());

                    char_literal28=(Token)match(input,40,FOLLOW_40_in_statement703);  
                    stream_40.add(char_literal28);


                    // AST REWRITE
                    // elements: retorna
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 114:19: -> ^( StatementRetorna retorna )
                    {
                        // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:114:22: ^( StatementRetorna retorna )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot(
                        (Tree)adaptor.create(StatementRetorna, "StatementRetorna")
                        , root_1);

                        adaptor.addChild(root_1, stream_retorna.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class atribuicao_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atribuicao"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:117:1: atribuicao : ID '=' expr -> ^( Atribuicao ID expr ) ;
    public final lingi_tomParser.atribuicao_return atribuicao() throws RecognitionException {
        lingi_tomParser.atribuicao_return retval = new lingi_tomParser.atribuicao_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token ID29=null;
        Token char_literal30=null;
        lingi_tomParser.expr_return expr31 =null;


        Tree ID29_tree=null;
        Tree char_literal30_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:118:3: ( ID '=' expr -> ^( Atribuicao ID expr ) )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:118:5: ID '=' expr
            {
            ID29=(Token)match(input,ID,FOLLOW_ID_in_atribuicao726);  
            stream_ID.add(ID29);


            char_literal30=(Token)match(input,43,FOLLOW_43_in_atribuicao728);  
            stream_43.add(char_literal30);


            pushFollow(FOLLOW_expr_in_atribuicao730);
            expr31=expr();

            state._fsp--;

            stream_expr.add(expr31.getTree());

            // AST REWRITE
            // elements: ID, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 118:19: -> ^( Atribuicao ID expr )
            {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:118:22: ^( Atribuicao ID expr )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(Atribuicao, "Atribuicao")
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

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atribuicao"


    public static class ifs_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifs"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:121:1: ifs : IF '(' expr ')' bloco ( ifsElse )? -> {ifsElse==null}? ^( Ifs1 expr bloco ) -> ^( Ifs2 expr bloco ifsElse ) ;
    public final lingi_tomParser.ifs_return ifs() throws RecognitionException {
        lingi_tomParser.ifs_return retval = new lingi_tomParser.ifs_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token IF32=null;
        Token char_literal33=null;
        Token char_literal35=null;
        lingi_tomParser.expr_return expr34 =null;

        lingi_tomParser.bloco_return bloco36 =null;

        lingi_tomParser.ifsElse_return ifsElse37 =null;


        Tree IF32_tree=null;
        Tree char_literal33_tree=null;
        Tree char_literal35_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_bloco=new RewriteRuleSubtreeStream(adaptor,"rule bloco");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_ifsElse=new RewriteRuleSubtreeStream(adaptor,"rule ifsElse");
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:121:6: ( IF '(' expr ')' bloco ( ifsElse )? -> {ifsElse==null}? ^( Ifs1 expr bloco ) -> ^( Ifs2 expr bloco ifsElse ) )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:121:8: IF '(' expr ')' bloco ( ifsElse )?
            {
            IF32=(Token)match(input,IF,FOLLOW_IF_in_ifs754);  
            stream_IF.add(IF32);


            char_literal33=(Token)match(input,33,FOLLOW_33_in_ifs756);  
            stream_33.add(char_literal33);


            pushFollow(FOLLOW_expr_in_ifs758);
            expr34=expr();

            state._fsp--;

            stream_expr.add(expr34.getTree());

            char_literal35=(Token)match(input,34,FOLLOW_34_in_ifs760);  
            stream_34.add(char_literal35);


            pushFollow(FOLLOW_bloco_in_ifs762);
            bloco36=bloco();

            state._fsp--;

            stream_bloco.add(bloco36.getTree());

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:121:30: ( ifsElse )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ELSE) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:121:30: ifsElse
                    {
                    pushFollow(FOLLOW_ifsElse_in_ifs764);
                    ifsElse37=ifsElse();

                    state._fsp--;

                    stream_ifsElse.add(ifsElse37.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: bloco, ifsElse, bloco, expr, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 121:39: -> {ifsElse==null}? ^( Ifs1 expr bloco )
            if (ifsElse==null) {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:121:59: ^( Ifs1 expr bloco )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(Ifs1, "Ifs1")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_1, stream_bloco.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 122:8: -> ^( Ifs2 expr bloco ifsElse )
            {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:122:11: ^( Ifs2 expr bloco ifsElse )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(Ifs2, "Ifs2")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_1, stream_bloco.nextTree());

                adaptor.addChild(root_1, stream_ifsElse.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ifs"


    public static class ifsElse_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifsElse"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:125:1: ifsElse : ELSE bloco -> ^( IfsElse bloco ) ;
    public final lingi_tomParser.ifsElse_return ifsElse() throws RecognitionException {
        lingi_tomParser.ifsElse_return retval = new lingi_tomParser.ifsElse_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token ELSE38=null;
        lingi_tomParser.bloco_return bloco39 =null;


        Tree ELSE38_tree=null;
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_bloco=new RewriteRuleSubtreeStream(adaptor,"rule bloco");
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:125:10: ( ELSE bloco -> ^( IfsElse bloco ) )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:125:12: ELSE bloco
            {
            ELSE38=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifsElse808);  
            stream_ELSE.add(ELSE38);


            pushFollow(FOLLOW_bloco_in_ifsElse810);
            bloco39=bloco();

            state._fsp--;

            stream_bloco.add(bloco39.getTree());

            // AST REWRITE
            // elements: bloco
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 125:25: -> ^( IfsElse bloco )
            {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:125:28: ^( IfsElse bloco )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(IfsElse, "IfsElse")
                , root_1);

                adaptor.addChild(root_1, stream_bloco.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ifsElse"


    public static class whiles_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whiles"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:128:1: whiles : WHILE '(' expr ')' bloco -> ^( Whiles expr bloco ) ;
    public final lingi_tomParser.whiles_return whiles() throws RecognitionException {
        lingi_tomParser.whiles_return retval = new lingi_tomParser.whiles_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token WHILE40=null;
        Token char_literal41=null;
        Token char_literal43=null;
        lingi_tomParser.expr_return expr42 =null;

        lingi_tomParser.bloco_return bloco44 =null;


        Tree WHILE40_tree=null;
        Tree char_literal41_tree=null;
        Tree char_literal43_tree=null;
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleSubtreeStream stream_bloco=new RewriteRuleSubtreeStream(adaptor,"rule bloco");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:128:8: ( WHILE '(' expr ')' bloco -> ^( Whiles expr bloco ) )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:128:10: WHILE '(' expr ')' bloco
            {
            WHILE40=(Token)match(input,WHILE,FOLLOW_WHILE_in_whiles831);  
            stream_WHILE.add(WHILE40);


            char_literal41=(Token)match(input,33,FOLLOW_33_in_whiles833);  
            stream_33.add(char_literal41);


            pushFollow(FOLLOW_expr_in_whiles835);
            expr42=expr();

            state._fsp--;

            stream_expr.add(expr42.getTree());

            char_literal43=(Token)match(input,34,FOLLOW_34_in_whiles837);  
            stream_34.add(char_literal43);


            pushFollow(FOLLOW_bloco_in_whiles839);
            bloco44=bloco();

            state._fsp--;

            stream_bloco.add(bloco44.getTree());

            // AST REWRITE
            // elements: bloco, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 128:36: -> ^( Whiles expr bloco )
            {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:128:39: ^( Whiles expr bloco )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(Whiles, "Whiles")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_1, stream_bloco.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "whiles"


    public static class fors_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fors"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:131:1: fors : FOR '(' f1= forsexpr ';' expr ';' f2= forsexpr ')' bloco -> ^( Fors $f1 expr $f2 bloco ) ;
    public final lingi_tomParser.fors_return fors() throws RecognitionException {
        lingi_tomParser.fors_return retval = new lingi_tomParser.fors_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token FOR45=null;
        Token char_literal46=null;
        Token char_literal47=null;
        Token char_literal49=null;
        Token char_literal50=null;
        lingi_tomParser.forsexpr_return f1 =null;

        lingi_tomParser.forsexpr_return f2 =null;

        lingi_tomParser.expr_return expr48 =null;

        lingi_tomParser.bloco_return bloco51 =null;


        Tree FOR45_tree=null;
        Tree char_literal46_tree=null;
        Tree char_literal47_tree=null;
        Tree char_literal49_tree=null;
        Tree char_literal50_tree=null;
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleSubtreeStream stream_bloco=new RewriteRuleSubtreeStream(adaptor,"rule bloco");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_forsexpr=new RewriteRuleSubtreeStream(adaptor,"rule forsexpr");
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:131:6: ( FOR '(' f1= forsexpr ';' expr ';' f2= forsexpr ')' bloco -> ^( Fors $f1 expr $f2 bloco ) )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:131:8: FOR '(' f1= forsexpr ';' expr ';' f2= forsexpr ')' bloco
            {
            FOR45=(Token)match(input,FOR,FOLLOW_FOR_in_fors861);  
            stream_FOR.add(FOR45);


            char_literal46=(Token)match(input,33,FOLLOW_33_in_fors863);  
            stream_33.add(char_literal46);


            pushFollow(FOLLOW_forsexpr_in_fors867);
            f1=forsexpr();

            state._fsp--;

            stream_forsexpr.add(f1.getTree());

            char_literal47=(Token)match(input,40,FOLLOW_40_in_fors869);  
            stream_40.add(char_literal47);


            pushFollow(FOLLOW_expr_in_fors871);
            expr48=expr();

            state._fsp--;

            stream_expr.add(expr48.getTree());

            char_literal49=(Token)match(input,40,FOLLOW_40_in_fors873);  
            stream_40.add(char_literal49);


            pushFollow(FOLLOW_forsexpr_in_fors877);
            f2=forsexpr();

            state._fsp--;

            stream_forsexpr.add(f2.getTree());

            char_literal50=(Token)match(input,34,FOLLOW_34_in_fors879);  
            stream_34.add(char_literal50);


            pushFollow(FOLLOW_bloco_in_fors881);
            bloco51=bloco();

            state._fsp--;

            stream_bloco.add(bloco51.getTree());

            // AST REWRITE
            // elements: f2, expr, bloco, f1
            // token labels: 
            // rule labels: retval, f1, f2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_f1=new RewriteRuleSubtreeStream(adaptor,"rule f1",f1!=null?f1.tree:null);
            RewriteRuleSubtreeStream stream_f2=new RewriteRuleSubtreeStream(adaptor,"rule f2",f2!=null?f2.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 132:8: -> ^( Fors $f1 expr $f2 bloco )
            {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:132:11: ^( Fors $f1 expr $f2 bloco )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(Fors, "Fors")
                , root_1);

                adaptor.addChild(root_1, stream_f1.nextTree());

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_1, stream_f2.nextTree());

                adaptor.addChild(root_1, stream_bloco.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fors"


    public static class forsexpr_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forsexpr"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:135:1: forsexpr : ( expr -> ^( ForExprExpr expr ) | atribuicao -> ^( ForExprAtribuicao atribuicao ) );
    public final lingi_tomParser.forsexpr_return forsexpr() throws RecognitionException {
        lingi_tomParser.forsexpr_return retval = new lingi_tomParser.forsexpr_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        lingi_tomParser.expr_return expr52 =null;

        lingi_tomParser.atribuicao_return atribuicao53 =null;


        RewriteRuleSubtreeStream stream_atribuicao=new RewriteRuleSubtreeStream(adaptor,"rule atribuicao");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:135:9: ( expr -> ^( ForExprExpr expr ) | atribuicao -> ^( ForExprAtribuicao atribuicao ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==CHAR||LA10_0==FALSE||LA10_0==INT||LA10_0==STRING||LA10_0==TRUE||LA10_0==29||LA10_0==38) ) {
                alt10=1;
            }
            else if ( (LA10_0==ID) ) {
                int LA10_3 = input.LA(2);

                if ( ((LA10_3 >= 30 && LA10_3 <= 36)||(LA10_3 >= 38 && LA10_3 <= 42)||(LA10_3 >= 44 && LA10_3 <= 46)||LA10_3==48) ) {
                    alt10=1;
                }
                else if ( (LA10_3==43) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 3, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:135:11: expr
                    {
                    pushFollow(FOLLOW_expr_in_forsexpr914);
                    expr52=expr();

                    state._fsp--;

                    stream_expr.add(expr52.getTree());

                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 135:21: -> ^( ForExprExpr expr )
                    {
                        // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:135:24: ^( ForExprExpr expr )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot(
                        (Tree)adaptor.create(ForExprExpr, "ForExprExpr")
                        , root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:136:5: atribuicao
                    {
                    pushFollow(FOLLOW_atribuicao_in_forsexpr933);
                    atribuicao53=atribuicao();

                    state._fsp--;

                    stream_atribuicao.add(atribuicao53.getTree());

                    // AST REWRITE
                    // elements: atribuicao
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 136:19: -> ^( ForExprAtribuicao atribuicao )
                    {
                        // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:136:22: ^( ForExprAtribuicao atribuicao )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot(
                        (Tree)adaptor.create(ForExprAtribuicao, "ForExprAtribuicao")
                        , root_1);

                        adaptor.addChild(root_1, stream_atribuicao.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "forsexpr"


    public static class invocacao_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "invocacao"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:139:1: invocacao : ID '(' args ')' -> ^( Invocacao args ) ;
    public final lingi_tomParser.invocacao_return invocacao() throws RecognitionException {
        lingi_tomParser.invocacao_return retval = new lingi_tomParser.invocacao_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token ID54=null;
        Token char_literal55=null;
        Token char_literal57=null;
        lingi_tomParser.args_return args56 =null;


        Tree ID54_tree=null;
        Tree char_literal55_tree=null;
        Tree char_literal57_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:140:3: ( ID '(' args ')' -> ^( Invocacao args ) )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:140:5: ID '(' args ')'
            {
            ID54=(Token)match(input,ID,FOLLOW_ID_in_invocacao958);  
            stream_ID.add(ID54);


            char_literal55=(Token)match(input,33,FOLLOW_33_in_invocacao960);  
            stream_33.add(char_literal55);


            pushFollow(FOLLOW_args_in_invocacao962);
            args56=args();

            state._fsp--;

            stream_args.add(args56.getTree());

            char_literal57=(Token)match(input,34,FOLLOW_34_in_invocacao964);  
            stream_34.add(char_literal57);


            // AST REWRITE
            // elements: args
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 140:23: -> ^( Invocacao args )
            {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:140:26: ^( Invocacao args )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(Invocacao, "Invocacao")
                , root_1);

                adaptor.addChild(root_1, stream_args.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "invocacao"


    public static class retorna_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "retorna"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:143:1: retorna : RETURN expr -> ^( Retorna expr ) ;
    public final lingi_tomParser.retorna_return retorna() throws RecognitionException {
        lingi_tomParser.retorna_return retval = new lingi_tomParser.retorna_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token RETURN58=null;
        lingi_tomParser.expr_return expr59 =null;


        Tree RETURN58_tree=null;
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:143:9: ( RETURN expr -> ^( Retorna expr ) )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:143:11: RETURN expr
            {
            RETURN58=(Token)match(input,RETURN,FOLLOW_RETURN_in_retorna985);  
            stream_RETURN.add(RETURN58);


            pushFollow(FOLLOW_expr_in_retorna987);
            expr59=expr();

            state._fsp--;

            stream_expr.add(expr59.getTree());

            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 143:26: -> ^( Retorna expr )
            {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:143:29: ^( Retorna expr )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(Retorna, "Retorna")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "retorna"


    public static class bloco_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bloco"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:146:1: bloco : ( '{' statements '}' -> ^( BlocoMore statements ) | statement -> ^( BlocoOne statement ) );
    public final lingi_tomParser.bloco_return bloco() throws RecognitionException {
        lingi_tomParser.bloco_return retval = new lingi_tomParser.bloco_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token char_literal60=null;
        Token char_literal62=null;
        lingi_tomParser.statements_return statements61 =null;

        lingi_tomParser.statement_return statement63 =null;


        Tree char_literal60_tree=null;
        Tree char_literal62_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:146:7: ( '{' statements '}' -> ^( BlocoMore statements ) | statement -> ^( BlocoOne statement ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==47) ) {
                alt11=1;
            }
            else if ( (LA11_0==FOR||(LA11_0 >= ID && LA11_0 <= IF)||LA11_0==RETURN||LA11_0==WHILE) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:146:9: '{' statements '}'
                    {
                    char_literal60=(Token)match(input,47,FOLLOW_47_in_bloco1010);  
                    stream_47.add(char_literal60);


                    pushFollow(FOLLOW_statements_in_bloco1012);
                    statements61=statements();

                    state._fsp--;

                    stream_statements.add(statements61.getTree());

                    char_literal62=(Token)match(input,49,FOLLOW_49_in_bloco1014);  
                    stream_49.add(char_literal62);


                    // AST REWRITE
                    // elements: statements
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 146:31: -> ^( BlocoMore statements )
                    {
                        // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:146:34: ^( BlocoMore statements )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot(
                        (Tree)adaptor.create(BlocoMore, "BlocoMore")
                        , root_1);

                        adaptor.addChild(root_1, stream_statements.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:147:5: statement
                    {
                    pushFollow(FOLLOW_statement_in_bloco1031);
                    statement63=statement();

                    state._fsp--;

                    stream_statement.add(statement63.getTree());

                    // AST REWRITE
                    // elements: statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 147:17: -> ^( BlocoOne statement )
                    {
                        // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:147:21: ^( BlocoOne statement )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot(
                        (Tree)adaptor.create(BlocoOne, "BlocoOne")
                        , root_1);

                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bloco"


    public static class args_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "args"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:150:1: args : e1= expr (a1= argsAux )* -> {a1==null}? ^( Args1 $e1) -> ^( Args2 $e1 ( $a1)* ) ;
    public final lingi_tomParser.args_return args() throws RecognitionException {
        lingi_tomParser.args_return retval = new lingi_tomParser.args_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        lingi_tomParser.expr_return e1 =null;

        lingi_tomParser.argsAux_return a1 =null;


        RewriteRuleSubtreeStream stream_argsAux=new RewriteRuleSubtreeStream(adaptor,"rule argsAux");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:150:6: (e1= expr (a1= argsAux )* -> {a1==null}? ^( Args1 $e1) -> ^( Args2 $e1 ( $a1)* ) )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:150:8: e1= expr (a1= argsAux )*
            {
            pushFollow(FOLLOW_expr_in_args1055);
            e1=expr();

            state._fsp--;

            stream_expr.add(e1.getTree());

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:150:18: (a1= argsAux )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==37) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:150:18: a1= argsAux
            	    {
            	    pushFollow(FOLLOW_argsAux_in_args1059);
            	    a1=argsAux();

            	    state._fsp--;

            	    stream_argsAux.add(a1.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            // AST REWRITE
            // elements: a1, e1, e1
            // token labels: 
            // rule labels: retval, e1, a1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.tree:null);
            RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 150:30: -> {a1==null}? ^( Args1 $e1)
            if (a1==null) {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:150:45: ^( Args1 $e1)
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(Args1, "Args1")
                , root_1);

                adaptor.addChild(root_1, stream_e1.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 151:8: -> ^( Args2 $e1 ( $a1)* )
            {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:151:11: ^( Args2 $e1 ( $a1)* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(Args2, "Args2")
                , root_1);

                adaptor.addChild(root_1, stream_e1.nextTree());

                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:151:24: ( $a1)*
                while ( stream_a1.hasNext() ) {
                    adaptor.addChild(root_1, stream_a1.nextTree());

                }
                stream_a1.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "args"


    public static class argsAux_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "argsAux"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:153:1: argsAux : ',' expr -> ^( ArgsAux expr ) ;
    public final lingi_tomParser.argsAux_return argsAux() throws RecognitionException {
        lingi_tomParser.argsAux_return retval = new lingi_tomParser.argsAux_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token char_literal64=null;
        lingi_tomParser.expr_return expr65 =null;


        Tree char_literal64_tree=null;
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:153:9: ( ',' expr -> ^( ArgsAux expr ) )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:153:11: ',' expr
            {
            char_literal64=(Token)match(input,37,FOLLOW_37_in_argsAux1103);  
            stream_37.add(char_literal64);


            pushFollow(FOLLOW_expr_in_argsAux1105);
            expr65=expr();

            state._fsp--;

            stream_expr.add(expr65.getTree());

            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 153:25: -> ^( ArgsAux expr )
            {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:153:28: ^( ArgsAux expr )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(ArgsAux, "ArgsAux")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "argsAux"


    public static class expr_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:156:1: expr : orExpr -> ^( Expr orExpr ) ;
    public final lingi_tomParser.expr_return expr() throws RecognitionException {
        lingi_tomParser.expr_return retval = new lingi_tomParser.expr_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        lingi_tomParser.orExpr_return orExpr66 =null;


        RewriteRuleSubtreeStream stream_orExpr=new RewriteRuleSubtreeStream(adaptor,"rule orExpr");
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:156:6: ( orExpr -> ^( Expr orExpr ) )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:156:8: orExpr
            {
            pushFollow(FOLLOW_orExpr_in_expr1131);
            orExpr66=orExpr();

            state._fsp--;

            stream_orExpr.add(orExpr66.getTree());

            // AST REWRITE
            // elements: orExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 156:19: -> ^( Expr orExpr )
            {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:156:22: ^( Expr orExpr )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(Expr, "Expr")
                , root_1);

                adaptor.addChild(root_1, stream_orExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class orExpr_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "orExpr"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:159:1: orExpr : andExpr ( orExprAux )* -> {orExprAux==null}? ^( OrExpr1 andExpr ) -> ^( OrExpr2 andExpr ( orExprAux )* ) ;
    public final lingi_tomParser.orExpr_return orExpr() throws RecognitionException {
        lingi_tomParser.orExpr_return retval = new lingi_tomParser.orExpr_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        lingi_tomParser.andExpr_return andExpr67 =null;

        lingi_tomParser.orExprAux_return orExprAux68 =null;


        RewriteRuleSubtreeStream stream_andExpr=new RewriteRuleSubtreeStream(adaptor,"rule andExpr");
        RewriteRuleSubtreeStream stream_orExprAux=new RewriteRuleSubtreeStream(adaptor,"rule orExprAux");
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:159:8: ( andExpr ( orExprAux )* -> {orExprAux==null}? ^( OrExpr1 andExpr ) -> ^( OrExpr2 andExpr ( orExprAux )* ) )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:159:10: andExpr ( orExprAux )*
            {
            pushFollow(FOLLOW_andExpr_in_orExpr1154);
            andExpr67=andExpr();

            state._fsp--;

            stream_andExpr.add(andExpr67.getTree());

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:159:18: ( orExprAux )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==48) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:159:18: orExprAux
            	    {
            	    pushFollow(FOLLOW_orExprAux_in_orExpr1156);
            	    orExprAux68=orExprAux();

            	    state._fsp--;

            	    stream_orExprAux.add(orExprAux68.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            // AST REWRITE
            // elements: andExpr, orExprAux, andExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 159:31: -> {orExprAux==null}? ^( OrExpr1 andExpr )
            if (orExprAux==null) {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:159:53: ^( OrExpr1 andExpr )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(OrExpr1, "OrExpr1")
                , root_1);

                adaptor.addChild(root_1, stream_andExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 160:8: -> ^( OrExpr2 andExpr ( orExprAux )* )
            {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:160:11: ^( OrExpr2 andExpr ( orExprAux )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(OrExpr2, "OrExpr2")
                , root_1);

                adaptor.addChild(root_1, stream_andExpr.nextTree());

                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:160:29: ( orExprAux )*
                while ( stream_orExprAux.hasNext() ) {
                    adaptor.addChild(root_1, stream_orExprAux.nextTree());

                }
                stream_orExprAux.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "orExpr"


    public static class orExprAux_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "orExprAux"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:163:1: orExprAux : opOr andExpr -> ^( OrExprAux andExpr ) ;
    public final lingi_tomParser.orExprAux_return orExprAux() throws RecognitionException {
        lingi_tomParser.orExprAux_return retval = new lingi_tomParser.orExprAux_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        lingi_tomParser.opOr_return opOr69 =null;

        lingi_tomParser.andExpr_return andExpr70 =null;


        RewriteRuleSubtreeStream stream_andExpr=new RewriteRuleSubtreeStream(adaptor,"rule andExpr");
        RewriteRuleSubtreeStream stream_opOr=new RewriteRuleSubtreeStream(adaptor,"rule opOr");
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:163:10: ( opOr andExpr -> ^( OrExprAux andExpr ) )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:163:12: opOr andExpr
            {
            pushFollow(FOLLOW_opOr_in_orExprAux1198);
            opOr69=opOr();

            state._fsp--;

            stream_opOr.add(opOr69.getTree());

            pushFollow(FOLLOW_andExpr_in_orExprAux1200);
            andExpr70=andExpr();

            state._fsp--;

            stream_andExpr.add(andExpr70.getTree());

            // AST REWRITE
            // elements: andExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 163:28: -> ^( OrExprAux andExpr )
            {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:163:31: ^( OrExprAux andExpr )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(OrExprAux, "OrExprAux")
                , root_1);

                adaptor.addChild(root_1, stream_andExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "orExprAux"


    public static class andExpr_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "andExpr"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:166:1: andExpr : equalExpr ( andExprAux )* -> {andExprAux == null}? ^( AndExpr1 equalExpr ) -> ^( AndExpr2 equalExpr ( andExprAux )* ) ;
    public final lingi_tomParser.andExpr_return andExpr() throws RecognitionException {
        lingi_tomParser.andExpr_return retval = new lingi_tomParser.andExpr_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        lingi_tomParser.equalExpr_return equalExpr71 =null;

        lingi_tomParser.andExprAux_return andExprAux72 =null;


        RewriteRuleSubtreeStream stream_equalExpr=new RewriteRuleSubtreeStream(adaptor,"rule equalExpr");
        RewriteRuleSubtreeStream stream_andExprAux=new RewriteRuleSubtreeStream(adaptor,"rule andExprAux");
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:166:9: ( equalExpr ( andExprAux )* -> {andExprAux == null}? ^( AndExpr1 equalExpr ) -> ^( AndExpr2 equalExpr ( andExprAux )* ) )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:166:11: equalExpr ( andExprAux )*
            {
            pushFollow(FOLLOW_equalExpr_in_andExpr1222);
            equalExpr71=equalExpr();

            state._fsp--;

            stream_equalExpr.add(equalExpr71.getTree());

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:166:21: ( andExprAux )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==32) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:166:22: andExprAux
            	    {
            	    pushFollow(FOLLOW_andExprAux_in_andExpr1225);
            	    andExprAux72=andExprAux();

            	    state._fsp--;

            	    stream_andExprAux.add(andExprAux72.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            // AST REWRITE
            // elements: andExprAux, equalExpr, equalExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 166:37: -> {andExprAux == null}? ^( AndExpr1 equalExpr )
            if (andExprAux == null) {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:166:62: ^( AndExpr1 equalExpr )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(AndExpr1, "AndExpr1")
                , root_1);

                adaptor.addChild(root_1, stream_equalExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 167:8: -> ^( AndExpr2 equalExpr ( andExprAux )* )
            {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:167:11: ^( AndExpr2 equalExpr ( andExprAux )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(AndExpr2, "AndExpr2")
                , root_1);

                adaptor.addChild(root_1, stream_equalExpr.nextTree());

                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:167:32: ( andExprAux )*
                while ( stream_andExprAux.hasNext() ) {
                    adaptor.addChild(root_1, stream_andExprAux.nextTree());

                }
                stream_andExprAux.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "andExpr"


    public static class andExprAux_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "andExprAux"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:170:1: andExprAux : opAnd equalExpr -> ^( AndExprAux equalExpr ) ;
    public final lingi_tomParser.andExprAux_return andExprAux() throws RecognitionException {
        lingi_tomParser.andExprAux_return retval = new lingi_tomParser.andExprAux_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        lingi_tomParser.opAnd_return opAnd73 =null;

        lingi_tomParser.equalExpr_return equalExpr74 =null;


        RewriteRuleSubtreeStream stream_equalExpr=new RewriteRuleSubtreeStream(adaptor,"rule equalExpr");
        RewriteRuleSubtreeStream stream_opAnd=new RewriteRuleSubtreeStream(adaptor,"rule opAnd");
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:170:11: ( opAnd equalExpr -> ^( AndExprAux equalExpr ) )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:170:13: opAnd equalExpr
            {
            pushFollow(FOLLOW_opAnd_in_andExprAux1269);
            opAnd73=opAnd();

            state._fsp--;

            stream_opAnd.add(opAnd73.getTree());

            pushFollow(FOLLOW_equalExpr_in_andExprAux1271);
            equalExpr74=equalExpr();

            state._fsp--;

            stream_equalExpr.add(equalExpr74.getTree());

            // AST REWRITE
            // elements: equalExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 170:32: -> ^( AndExprAux equalExpr )
            {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:170:35: ^( AndExprAux equalExpr )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(AndExprAux, "AndExprAux")
                , root_1);

                adaptor.addChild(root_1, stream_equalExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "andExprAux"


    public static class equalExpr_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equalExpr"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:173:1: equalExpr : addExpr ( equalExprAux )* -> {equalExprAux==null}? ^( EqualExpr1 addExpr ) -> ^( EqualExpr2 addExpr ( equalExprAux )* ) ;
    public final lingi_tomParser.equalExpr_return equalExpr() throws RecognitionException {
        lingi_tomParser.equalExpr_return retval = new lingi_tomParser.equalExpr_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        lingi_tomParser.addExpr_return addExpr75 =null;

        lingi_tomParser.equalExprAux_return equalExprAux76 =null;


        RewriteRuleSubtreeStream stream_addExpr=new RewriteRuleSubtreeStream(adaptor,"rule addExpr");
        RewriteRuleSubtreeStream stream_equalExprAux=new RewriteRuleSubtreeStream(adaptor,"rule equalExprAux");
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:174:3: ( addExpr ( equalExprAux )* -> {equalExprAux==null}? ^( EqualExpr1 addExpr ) -> ^( EqualExpr2 addExpr ( equalExprAux )* ) )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:174:5: addExpr ( equalExprAux )*
            {
            pushFollow(FOLLOW_addExpr_in_equalExpr1295);
            addExpr75=addExpr();

            state._fsp--;

            stream_addExpr.add(addExpr75.getTree());

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:174:13: ( equalExprAux )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==30||(LA15_0 >= 41 && LA15_0 <= 42)||(LA15_0 >= 44 && LA15_0 <= 46)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:174:14: equalExprAux
            	    {
            	    pushFollow(FOLLOW_equalExprAux_in_equalExpr1298);
            	    equalExprAux76=equalExprAux();

            	    state._fsp--;

            	    stream_equalExprAux.add(equalExprAux76.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            // AST REWRITE
            // elements: equalExprAux, addExpr, addExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 174:30: -> {equalExprAux==null}? ^( EqualExpr1 addExpr )
            if (equalExprAux==null) {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:174:55: ^( EqualExpr1 addExpr )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(EqualExpr1, "EqualExpr1")
                , root_1);

                adaptor.addChild(root_1, stream_addExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 175:8: -> ^( EqualExpr2 addExpr ( equalExprAux )* )
            {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:175:11: ^( EqualExpr2 addExpr ( equalExprAux )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(EqualExpr2, "EqualExpr2")
                , root_1);

                adaptor.addChild(root_1, stream_addExpr.nextTree());

                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:175:32: ( equalExprAux )*
                while ( stream_equalExprAux.hasNext() ) {
                    adaptor.addChild(root_1, stream_equalExprAux.nextTree());

                }
                stream_equalExprAux.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "equalExpr"


    public static class equalExprAux_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equalExprAux"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:178:1: equalExprAux : opRel addExpr -> ^( EqualExprAux addExpr ) ;
    public final lingi_tomParser.equalExprAux_return equalExprAux() throws RecognitionException {
        lingi_tomParser.equalExprAux_return retval = new lingi_tomParser.equalExprAux_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        lingi_tomParser.opRel_return opRel77 =null;

        lingi_tomParser.addExpr_return addExpr78 =null;


        RewriteRuleSubtreeStream stream_addExpr=new RewriteRuleSubtreeStream(adaptor,"rule addExpr");
        RewriteRuleSubtreeStream stream_opRel=new RewriteRuleSubtreeStream(adaptor,"rule opRel");
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:178:13: ( opRel addExpr -> ^( EqualExprAux addExpr ) )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:178:15: opRel addExpr
            {
            pushFollow(FOLLOW_opRel_in_equalExprAux1341);
            opRel77=opRel();

            state._fsp--;

            stream_opRel.add(opRel77.getTree());

            pushFollow(FOLLOW_addExpr_in_equalExprAux1343);
            addExpr78=addExpr();

            state._fsp--;

            stream_addExpr.add(addExpr78.getTree());

            // AST REWRITE
            // elements: addExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 178:32: -> ^( EqualExprAux addExpr )
            {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:178:35: ^( EqualExprAux addExpr )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(EqualExprAux, "EqualExprAux")
                , root_1);

                adaptor.addChild(root_1, stream_addExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "equalExprAux"


    public static class addExpr_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "addExpr"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:181:1: addExpr : multExpr ( addExprAux )* -> {addExprAux == null}? ^( AddExpr1 multExpr ) -> ^( AddExpr2 multExpr ( AddExprAux )* ) ;
    public final lingi_tomParser.addExpr_return addExpr() throws RecognitionException {
        lingi_tomParser.addExpr_return retval = new lingi_tomParser.addExpr_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        lingi_tomParser.multExpr_return multExpr79 =null;

        lingi_tomParser.addExprAux_return addExprAux80 =null;


        RewriteRuleSubtreeStream stream_multExpr=new RewriteRuleSubtreeStream(adaptor,"rule multExpr");
        RewriteRuleSubtreeStream stream_addExprAux=new RewriteRuleSubtreeStream(adaptor,"rule addExprAux");
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:181:9: ( multExpr ( addExprAux )* -> {addExprAux == null}? ^( AddExpr1 multExpr ) -> ^( AddExpr2 multExpr ( AddExprAux )* ) )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:181:11: multExpr ( addExprAux )*
            {
            pushFollow(FOLLOW_multExpr_in_addExpr1366);
            multExpr79=multExpr();

            state._fsp--;

            stream_multExpr.add(multExpr79.getTree());

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:181:20: ( addExprAux )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==36||LA16_0==38) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:181:21: addExprAux
            	    {
            	    pushFollow(FOLLOW_addExprAux_in_addExpr1369);
            	    addExprAux80=addExprAux();

            	    state._fsp--;

            	    stream_addExprAux.add(addExprAux80.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            // AST REWRITE
            // elements: multExpr, multExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 181:36: -> {addExprAux == null}? ^( AddExpr1 multExpr )
            if (addExprAux == null) {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:181:61: ^( AddExpr1 multExpr )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(AddExpr1, "AddExpr1")
                , root_1);

                adaptor.addChild(root_1, stream_multExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 182:8: -> ^( AddExpr2 multExpr ( AddExprAux )* )
            {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:182:11: ^( AddExpr2 multExpr ( AddExprAux )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(AddExpr2, "AddExpr2")
                , root_1);

                adaptor.addChild(root_1, stream_multExpr.nextTree());

                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:182:31: ( AddExprAux )*
                while (  ) {
                    adaptor.addChild(root_1, 
                    (Tree)adaptor.create(AddExprAux, "AddExprAux")
                    );

                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "addExpr"


    public static class addExprAux_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "addExprAux"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:185:1: addExprAux : opAdd multExpr -> ^( AddExprAux multExpr ) ;
    public final lingi_tomParser.addExprAux_return addExprAux() throws RecognitionException {
        lingi_tomParser.addExprAux_return retval = new lingi_tomParser.addExprAux_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        lingi_tomParser.opAdd_return opAdd81 =null;

        lingi_tomParser.multExpr_return multExpr82 =null;


        RewriteRuleSubtreeStream stream_multExpr=new RewriteRuleSubtreeStream(adaptor,"rule multExpr");
        RewriteRuleSubtreeStream stream_opAdd=new RewriteRuleSubtreeStream(adaptor,"rule opAdd");
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:185:11: ( opAdd multExpr -> ^( AddExprAux multExpr ) )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:185:13: opAdd multExpr
            {
            pushFollow(FOLLOW_opAdd_in_addExprAux1412);
            opAdd81=opAdd();

            state._fsp--;

            stream_opAdd.add(opAdd81.getTree());

            pushFollow(FOLLOW_multExpr_in_addExprAux1414);
            multExpr82=multExpr();

            state._fsp--;

            stream_multExpr.add(multExpr82.getTree());

            // AST REWRITE
            // elements: multExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 185:32: -> ^( AddExprAux multExpr )
            {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:185:35: ^( AddExprAux multExpr )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(AddExprAux, "AddExprAux")
                , root_1);

                adaptor.addChild(root_1, stream_multExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "addExprAux"


    public static class multExpr_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multExpr"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:188:1: multExpr : notExpr ( multExprAux )* -> {multExprAux==null}? ^( MultExpr1 notExpr ) -> ^( MultExpr2 notExpr ( multExprAux )* ) ;
    public final lingi_tomParser.multExpr_return multExpr() throws RecognitionException {
        lingi_tomParser.multExpr_return retval = new lingi_tomParser.multExpr_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        lingi_tomParser.notExpr_return notExpr83 =null;

        lingi_tomParser.multExprAux_return multExprAux84 =null;


        RewriteRuleSubtreeStream stream_multExprAux=new RewriteRuleSubtreeStream(adaptor,"rule multExprAux");
        RewriteRuleSubtreeStream stream_notExpr=new RewriteRuleSubtreeStream(adaptor,"rule notExpr");
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:188:9: ( notExpr ( multExprAux )* -> {multExprAux==null}? ^( MultExpr1 notExpr ) -> ^( MultExpr2 notExpr ( multExprAux )* ) )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:188:11: notExpr ( multExprAux )*
            {
            pushFollow(FOLLOW_notExpr_in_multExpr1436);
            notExpr83=notExpr();

            state._fsp--;

            stream_notExpr.add(notExpr83.getTree());

            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:188:19: ( multExprAux )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==31||LA17_0==35||LA17_0==39) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:188:20: multExprAux
            	    {
            	    pushFollow(FOLLOW_multExprAux_in_multExpr1439);
            	    multExprAux84=multExprAux();

            	    state._fsp--;

            	    stream_multExprAux.add(multExprAux84.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            // AST REWRITE
            // elements: notExpr, multExprAux, notExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 188:36: -> {multExprAux==null}? ^( MultExpr1 notExpr )
            if (multExprAux==null) {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:188:60: ^( MultExpr1 notExpr )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(MultExpr1, "MultExpr1")
                , root_1);

                adaptor.addChild(root_1, stream_notExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 189:8: -> ^( MultExpr2 notExpr ( multExprAux )* )
            {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:189:11: ^( MultExpr2 notExpr ( multExprAux )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(MultExpr2, "MultExpr2")
                , root_1);

                adaptor.addChild(root_1, stream_notExpr.nextTree());

                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:189:31: ( multExprAux )*
                while ( stream_multExprAux.hasNext() ) {
                    adaptor.addChild(root_1, stream_multExprAux.nextTree());

                }
                stream_multExprAux.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "multExpr"


    public static class multExprAux_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multExprAux"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:192:1: multExprAux : opMul notExpr -> ^( MultExprAux notExpr ) ;
    public final lingi_tomParser.multExprAux_return multExprAux() throws RecognitionException {
        lingi_tomParser.multExprAux_return retval = new lingi_tomParser.multExprAux_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        lingi_tomParser.opMul_return opMul85 =null;

        lingi_tomParser.notExpr_return notExpr86 =null;


        RewriteRuleSubtreeStream stream_opMul=new RewriteRuleSubtreeStream(adaptor,"rule opMul");
        RewriteRuleSubtreeStream stream_notExpr=new RewriteRuleSubtreeStream(adaptor,"rule notExpr");
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:192:12: ( opMul notExpr -> ^( MultExprAux notExpr ) )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:192:14: opMul notExpr
            {
            pushFollow(FOLLOW_opMul_in_multExprAux1481);
            opMul85=opMul();

            state._fsp--;

            stream_opMul.add(opMul85.getTree());

            pushFollow(FOLLOW_notExpr_in_multExprAux1483);
            notExpr86=notExpr();

            state._fsp--;

            stream_notExpr.add(notExpr86.getTree());

            // AST REWRITE
            // elements: notExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 192:31: -> ^( MultExprAux notExpr )
            {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:192:34: ^( MultExprAux notExpr )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(MultExprAux, "MultExprAux")
                , root_1);

                adaptor.addChild(root_1, stream_notExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "multExprAux"


    public static class notExpr_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "notExpr"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:195:1: notExpr : ( opNot )? negationExpr -> ^( NotExpr negationExpr ) ;
    public final lingi_tomParser.notExpr_return notExpr() throws RecognitionException {
        lingi_tomParser.notExpr_return retval = new lingi_tomParser.notExpr_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        lingi_tomParser.opNot_return opNot87 =null;

        lingi_tomParser.negationExpr_return negationExpr88 =null;


        RewriteRuleSubtreeStream stream_negationExpr=new RewriteRuleSubtreeStream(adaptor,"rule negationExpr");
        RewriteRuleSubtreeStream stream_opNot=new RewriteRuleSubtreeStream(adaptor,"rule opNot");
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:195:9: ( ( opNot )? negationExpr -> ^( NotExpr negationExpr ) )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:195:11: ( opNot )? negationExpr
            {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:195:11: ( opNot )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:195:12: opNot
                    {
                    pushFollow(FOLLOW_opNot_in_notExpr1507);
                    opNot87=opNot();

                    state._fsp--;

                    stream_opNot.add(opNot87.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_negationExpr_in_notExpr1511);
            negationExpr88=negationExpr();

            state._fsp--;

            stream_negationExpr.add(negationExpr88.getTree());

            // AST REWRITE
            // elements: negationExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 195:35: -> ^( NotExpr negationExpr )
            {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:195:38: ^( NotExpr negationExpr )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(NotExpr, "NotExpr")
                , root_1);

                adaptor.addChild(root_1, stream_negationExpr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "notExpr"


    public static class negationExpr_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "negationExpr"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:198:1: negationExpr : ( '-' )? fator -> ^( NegationExpr fator ) ;
    public final lingi_tomParser.negationExpr_return negationExpr() throws RecognitionException {
        lingi_tomParser.negationExpr_return retval = new lingi_tomParser.negationExpr_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token char_literal89=null;
        lingi_tomParser.fator_return fator90 =null;


        Tree char_literal89_tree=null;
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_fator=new RewriteRuleSubtreeStream(adaptor,"rule fator");
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:199:3: ( ( '-' )? fator -> ^( NegationExpr fator ) )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:199:5: ( '-' )? fator
            {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:199:5: ( '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:199:6: '-'
                    {
                    char_literal89=(Token)match(input,38,FOLLOW_38_in_negationExpr1536);  
                    stream_38.add(char_literal89);


                    }
                    break;

            }


            pushFollow(FOLLOW_fator_in_negationExpr1540);
            fator90=fator();

            state._fsp--;

            stream_fator.add(fator90.getTree());

            // AST REWRITE
            // elements: fator
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 199:20: -> ^( NegationExpr fator )
            {
                // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:199:23: ^( NegationExpr fator )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(NegationExpr, "NegationExpr")
                , root_1);

                adaptor.addChild(root_1, stream_fator.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "negationExpr"


    public static class opAdd_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "opAdd"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:202:1: opAdd : ( '+' | '-' );
    public final lingi_tomParser.opAdd_return opAdd() throws RecognitionException {
        lingi_tomParser.opAdd_return retval = new lingi_tomParser.opAdd_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token set91=null;

        Tree set91_tree=null;

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:202:7: ( '+' | '-' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:
            {
            root_0 = (Tree)adaptor.nil();


            set91=(Token)input.LT(1);

            if ( input.LA(1)==36||input.LA(1)==38 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Tree)adaptor.create(set91)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "opAdd"


    public static class opMul_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "opMul"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:206:1: opMul : ( '*' | '/' | '%' );
    public final lingi_tomParser.opMul_return opMul() throws RecognitionException {
        lingi_tomParser.opMul_return retval = new lingi_tomParser.opMul_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token set92=null;

        Tree set92_tree=null;

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:206:7: ( '*' | '/' | '%' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:
            {
            root_0 = (Tree)adaptor.nil();


            set92=(Token)input.LT(1);

            if ( input.LA(1)==31||input.LA(1)==35||input.LA(1)==39 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Tree)adaptor.create(set92)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "opMul"


    public static class opOr_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "opOr"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:211:1: opOr : '||' ;
    public final lingi_tomParser.opOr_return opOr() throws RecognitionException {
        lingi_tomParser.opOr_return retval = new lingi_tomParser.opOr_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token string_literal93=null;

        Tree string_literal93_tree=null;

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:211:6: ( '||' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:211:8: '||'
            {
            root_0 = (Tree)adaptor.nil();


            string_literal93=(Token)match(input,48,FOLLOW_48_in_opOr1598); 
            string_literal93_tree = 
            (Tree)adaptor.create(string_literal93)
            ;
            adaptor.addChild(root_0, string_literal93_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "opOr"


    public static class opAnd_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "opAnd"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:214:1: opAnd : '&&' ;
    public final lingi_tomParser.opAnd_return opAnd() throws RecognitionException {
        lingi_tomParser.opAnd_return retval = new lingi_tomParser.opAnd_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token string_literal94=null;

        Tree string_literal94_tree=null;

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:214:7: ( '&&' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:214:9: '&&'
            {
            root_0 = (Tree)adaptor.nil();


            string_literal94=(Token)match(input,32,FOLLOW_32_in_opAnd1608); 
            string_literal94_tree = 
            (Tree)adaptor.create(string_literal94)
            ;
            adaptor.addChild(root_0, string_literal94_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "opAnd"


    public static class opRel_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "opRel"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:217:1: opRel : ( '>' | '<' | '>=' | '<=' | '==' | '!=' );
    public final lingi_tomParser.opRel_return opRel() throws RecognitionException {
        lingi_tomParser.opRel_return retval = new lingi_tomParser.opRel_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token set95=null;

        Tree set95_tree=null;

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:217:7: ( '>' | '<' | '>=' | '<=' | '==' | '!=' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:
            {
            root_0 = (Tree)adaptor.nil();


            set95=(Token)input.LT(1);

            if ( input.LA(1)==30||(input.LA(1) >= 41 && input.LA(1) <= 42)||(input.LA(1) >= 44 && input.LA(1) <= 46) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Tree)adaptor.create(set95)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "opRel"


    public static class opNot_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "opNot"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:225:1: opNot : '!' ;
    public final lingi_tomParser.opNot_return opNot() throws RecognitionException {
        lingi_tomParser.opNot_return retval = new lingi_tomParser.opNot_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token char_literal96=null;

        Tree char_literal96_tree=null;

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:225:7: ( '!' )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:225:9: '!'
            {
            root_0 = (Tree)adaptor.nil();


            char_literal96=(Token)match(input,29,FOLLOW_29_in_opNot1653); 
            char_literal96_tree = 
            (Tree)adaptor.create(char_literal96)
            ;
            adaptor.addChild(root_0, char_literal96_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "opNot"


    public static class fator_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fator"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:228:1: fator : ( ID -> ^( FatorID ID ) | constante -> ^( FatorConstante constante ) | invocacao -> ^( FatorInvocacao invocacao ) );
    public final lingi_tomParser.fator_return fator() throws RecognitionException {
        lingi_tomParser.fator_return retval = new lingi_tomParser.fator_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token ID97=null;
        lingi_tomParser.constante_return constante98 =null;

        lingi_tomParser.invocacao_return invocacao99 =null;


        Tree ID97_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_constante=new RewriteRuleSubtreeStream(adaptor,"rule constante");
        RewriteRuleSubtreeStream stream_invocacao=new RewriteRuleSubtreeStream(adaptor,"rule invocacao");
        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:228:7: ( ID -> ^( FatorID ID ) | constante -> ^( FatorConstante constante ) | invocacao -> ^( FatorInvocacao invocacao ) )
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==33) ) {
                    alt20=3;
                }
                else if ( ((LA20_1 >= 30 && LA20_1 <= 32)||(LA20_1 >= 34 && LA20_1 <= 42)||(LA20_1 >= 44 && LA20_1 <= 46)||LA20_1==48) ) {
                    alt20=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA20_0==CHAR||LA20_0==FALSE||LA20_0==INT||LA20_0==STRING||LA20_0==TRUE) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:228:9: ID
                    {
                    ID97=(Token)match(input,ID,FOLLOW_ID_in_fator1663);  
                    stream_ID.add(ID97);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 228:16: -> ^( FatorID ID )
                    {
                        // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:228:19: ^( FatorID ID )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot(
                        (Tree)adaptor.create(FatorID, "FatorID")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:229:4: constante
                    {
                    pushFollow(FOLLOW_constante_in_fator1680);
                    constante98=constante();

                    state._fsp--;

                    stream_constante.add(constante98.getTree());

                    // AST REWRITE
                    // elements: constante
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 229:17: -> ^( FatorConstante constante )
                    {
                        // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:229:20: ^( FatorConstante constante )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot(
                        (Tree)adaptor.create(FatorConstante, "FatorConstante")
                        , root_1);

                        adaptor.addChild(root_1, stream_constante.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:230:4: invocacao
                    {
                    pushFollow(FOLLOW_invocacao_in_fator1696);
                    invocacao99=invocacao();

                    state._fsp--;

                    stream_invocacao.add(invocacao99.getTree());

                    // AST REWRITE
                    // elements: invocacao
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 230:17: -> ^( FatorInvocacao invocacao )
                    {
                        // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:230:20: ^( FatorInvocacao invocacao )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot(
                        (Tree)adaptor.create(FatorInvocacao, "FatorInvocacao")
                        , root_1);

                        adaptor.addChild(root_1, stream_invocacao.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fator"


    public static class constante_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constante"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:233:1: constante : ( STRING -> ^( ConstanteString STRING ) | CHAR -> ^( ConstanteChar CHAR ) | INT -> ^( ConstanteInt INT ) | TRUE -> ^( ConstanteBool TRUE ) | FALSE -> ^( ConstanteBool FALSE ) );
    public final lingi_tomParser.constante_return constante() throws RecognitionException {
        lingi_tomParser.constante_return retval = new lingi_tomParser.constante_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token STRING100=null;
        Token CHAR101=null;
        Token INT102=null;
        Token TRUE103=null;
        Token FALSE104=null;

        Tree STRING100_tree=null;
        Tree CHAR101_tree=null;
        Tree INT102_tree=null;
        Tree TRUE103_tree=null;
        Tree FALSE104_tree=null;
        RewriteRuleTokenStream stream_CHAR=new RewriteRuleTokenStream(adaptor,"token CHAR");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:234:2: ( STRING -> ^( ConstanteString STRING ) | CHAR -> ^( ConstanteChar CHAR ) | INT -> ^( ConstanteInt INT ) | TRUE -> ^( ConstanteBool TRUE ) | FALSE -> ^( ConstanteBool FALSE ) )
            int alt21=5;
            switch ( input.LA(1) ) {
            case STRING:
                {
                alt21=1;
                }
                break;
            case CHAR:
                {
                alt21=2;
                }
                break;
            case INT:
                {
                alt21=3;
                }
                break;
            case TRUE:
                {
                alt21=4;
                }
                break;
            case FALSE:
                {
                alt21=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:234:4: STRING
                    {
                    STRING100=(Token)match(input,STRING,FOLLOW_STRING_in_constante1718);  
                    stream_STRING.add(STRING100);


                    // AST REWRITE
                    // elements: STRING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 234:15: -> ^( ConstanteString STRING )
                    {
                        // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:234:18: ^( ConstanteString STRING )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot(
                        (Tree)adaptor.create(ConstanteString, "ConstanteString")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_STRING.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:235:4: CHAR
                    {
                    CHAR101=(Token)match(input,CHAR,FOLLOW_CHAR_in_constante1735);  
                    stream_CHAR.add(CHAR101);


                    // AST REWRITE
                    // elements: CHAR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 235:13: -> ^( ConstanteChar CHAR )
                    {
                        // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:235:16: ^( ConstanteChar CHAR )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot(
                        (Tree)adaptor.create(ConstanteChar, "ConstanteChar")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_CHAR.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:236:4: INT
                    {
                    INT102=(Token)match(input,INT,FOLLOW_INT_in_constante1752);  
                    stream_INT.add(INT102);


                    // AST REWRITE
                    // elements: INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 236:12: -> ^( ConstanteInt INT )
                    {
                        // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:236:15: ^( ConstanteInt INT )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot(
                        (Tree)adaptor.create(ConstanteInt, "ConstanteInt")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_INT.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:237:4: TRUE
                    {
                    TRUE103=(Token)match(input,TRUE,FOLLOW_TRUE_in_constante1769);  
                    stream_TRUE.add(TRUE103);


                    // AST REWRITE
                    // elements: TRUE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 237:13: -> ^( ConstanteBool TRUE )
                    {
                        // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:237:16: ^( ConstanteBool TRUE )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot(
                        (Tree)adaptor.create(ConstanteBool, "ConstanteBool")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_TRUE.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:238:4: FALSE
                    {
                    FALSE104=(Token)match(input,FALSE,FOLLOW_FALSE_in_constante1786);  
                    stream_FALSE.add(FALSE104);


                    // AST REWRITE
                    // elements: FALSE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Tree)adaptor.nil();
                    // 238:14: -> ^( ConstanteBool FALSE )
                    {
                        // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:238:17: ^( ConstanteBool FALSE )
                        {
                        Tree root_1 = (Tree)adaptor.nil();
                        root_1 = (Tree)adaptor.becomeRoot(
                        (Tree)adaptor.create(ConstanteBool, "ConstanteBool")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_FALSE.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constante"


    public static class tipo_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tipo"
    // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:241:1: tipo : ( TD_INT | TD_BOOL | TD_STRING | TD_CHAR | TD_FLOAT | TD_VOID );
    public final lingi_tomParser.tipo_return tipo() throws RecognitionException {
        lingi_tomParser.tipo_return retval = new lingi_tomParser.tipo_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token set105=null;

        Tree set105_tree=null;

        try {
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:241:6: ( TD_INT | TD_BOOL | TD_STRING | TD_CHAR | TD_FLOAT | TD_VOID )
            // C:\\Users\\Miguel\\Documents\\Uminho\\MEI\\ACS - Análise e Concepção de Software\\ATS - Análise e Transformação de Software\\Git\\ATS\\Code\\Gramatica_i_Tom\\lingi_tom.g:
            {
            root_0 = (Tree)adaptor.nil();


            set105=(Token)input.LT(1);

            if ( (input.LA(1) >= TD_BOOL && input.LA(1) <= TD_VOID) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Tree)adaptor.create(set105)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tipo"

    // Delegated rules


 

    public static final BitSet FOLLOW_funcao_in_programa278 = new BitSet(new long[]{0x0000000001F80002L});
    public static final BitSet FOLLOW_cabecalho_in_funcao306 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_funcao308 = new BitSet(new long[]{0x0000000009FA6800L});
    public static final BitSet FOLLOW_corpo_funcao_in_funcao312 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_funcao314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tipo_in_cabecalho347 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_cabecalho349 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_cabecalho351 = new BitSet(new long[]{0x0000000401F80000L});
    public static final BitSet FOLLOW_argumentos_in_cabecalho355 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_cabecalho358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracao_in_argumentos403 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_argumentos406 = new BitSet(new long[]{0x0000000001F80000L});
    public static final BitSet FOLLOW_declaracao_in_argumentos408 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_declaracoes_in_corpo_funcao435 = new BitSet(new long[]{0x0000000008026800L});
    public static final BitSet FOLLOW_statements_in_corpo_funcao438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracaoExpr_in_declaracoes486 = new BitSet(new long[]{0x0000000001F80002L});
    public static final BitSet FOLLOW_declaracao_in_declaracaoExpr511 = new BitSet(new long[]{0x0000090000000000L});
    public static final BitSet FOLLOW_43_in_declaracaoExpr514 = new BitSet(new long[]{0x000000402204A210L});
    public static final BitSet FOLLOW_expr_in_declaracaoExpr516 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_declaracaoExpr520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tipo_in_declaracao560 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_declaracao562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statements588 = new BitSet(new long[]{0x0000000008026802L});
    public static final BitSet FOLLOW_atribuicao_in_statement614 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_statement616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifs_in_statement632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whiles_in_statement649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fors_in_statement666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invocacao_in_statement683 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_statement685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_retorna_in_statement701 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_statement703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atribuicao726 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_atribuicao728 = new BitSet(new long[]{0x000000402204A210L});
    public static final BitSet FOLLOW_expr_in_atribuicao730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifs754 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ifs756 = new BitSet(new long[]{0x000000402204A210L});
    public static final BitSet FOLLOW_expr_in_ifs758 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ifs760 = new BitSet(new long[]{0x0000800008026800L});
    public static final BitSet FOLLOW_bloco_in_ifs762 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ifsElse_in_ifs764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_ifsElse808 = new BitSet(new long[]{0x0000800008026800L});
    public static final BitSet FOLLOW_bloco_in_ifsElse810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whiles831 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_whiles833 = new BitSet(new long[]{0x000000402204A210L});
    public static final BitSet FOLLOW_expr_in_whiles835 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_whiles837 = new BitSet(new long[]{0x0000800008026800L});
    public static final BitSet FOLLOW_bloco_in_whiles839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_fors861 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_fors863 = new BitSet(new long[]{0x000000402204A210L});
    public static final BitSet FOLLOW_forsexpr_in_fors867 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_fors869 = new BitSet(new long[]{0x000000402204A210L});
    public static final BitSet FOLLOW_expr_in_fors871 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_fors873 = new BitSet(new long[]{0x000000402204A210L});
    public static final BitSet FOLLOW_forsexpr_in_fors877 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_fors879 = new BitSet(new long[]{0x0000800008026800L});
    public static final BitSet FOLLOW_bloco_in_fors881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_forsexpr914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atribuicao_in_forsexpr933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_invocacao958 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_invocacao960 = new BitSet(new long[]{0x000000402204A210L});
    public static final BitSet FOLLOW_args_in_invocacao962 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_invocacao964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_retorna985 = new BitSet(new long[]{0x000000402204A210L});
    public static final BitSet FOLLOW_expr_in_retorna987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_bloco1010 = new BitSet(new long[]{0x0002000008026800L});
    public static final BitSet FOLLOW_statements_in_bloco1012 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_bloco1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_bloco1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_args1055 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_argsAux_in_args1059 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_argsAux1103 = new BitSet(new long[]{0x000000402204A210L});
    public static final BitSet FOLLOW_expr_in_argsAux1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpr_in_expr1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpr_in_orExpr1154 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_orExprAux_in_orExpr1156 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_opOr_in_orExprAux1198 = new BitSet(new long[]{0x000000402204A210L});
    public static final BitSet FOLLOW_andExpr_in_orExprAux1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalExpr_in_andExpr1222 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_andExprAux_in_andExpr1225 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_opAnd_in_andExprAux1269 = new BitSet(new long[]{0x000000402204A210L});
    public static final BitSet FOLLOW_equalExpr_in_andExprAux1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addExpr_in_equalExpr1295 = new BitSet(new long[]{0x0000760040000002L});
    public static final BitSet FOLLOW_equalExprAux_in_equalExpr1298 = new BitSet(new long[]{0x0000760040000002L});
    public static final BitSet FOLLOW_opRel_in_equalExprAux1341 = new BitSet(new long[]{0x000000402204A210L});
    public static final BitSet FOLLOW_addExpr_in_equalExprAux1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExpr_in_addExpr1366 = new BitSet(new long[]{0x0000005000000002L});
    public static final BitSet FOLLOW_addExprAux_in_addExpr1369 = new BitSet(new long[]{0x0000005000000002L});
    public static final BitSet FOLLOW_opAdd_in_addExprAux1412 = new BitSet(new long[]{0x000000402204A210L});
    public static final BitSet FOLLOW_multExpr_in_addExprAux1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notExpr_in_multExpr1436 = new BitSet(new long[]{0x0000008880000002L});
    public static final BitSet FOLLOW_multExprAux_in_multExpr1439 = new BitSet(new long[]{0x0000008880000002L});
    public static final BitSet FOLLOW_opMul_in_multExprAux1481 = new BitSet(new long[]{0x000000402204A210L});
    public static final BitSet FOLLOW_notExpr_in_multExprAux1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_opNot_in_notExpr1507 = new BitSet(new long[]{0x000000400204A210L});
    public static final BitSet FOLLOW_negationExpr_in_notExpr1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_negationExpr1536 = new BitSet(new long[]{0x000000000204A210L});
    public static final BitSet FOLLOW_fator_in_negationExpr1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_opOr1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_opAnd1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_opNot1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fator1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constante_in_fator1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invocacao_in_fator1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_constante1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_constante1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_constante1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_constante1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_constante1786 = new BitSet(new long[]{0x0000000000000002L});

}