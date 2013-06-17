// $ANTLR 3.4 /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g 2013-06-16 17:27:11

	import java.util.ArrayList;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class CmbTGMSP2L extends TreeParser {
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
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public CmbTGMSP2L(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public CmbTGMSP2L(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return CmbTGMSP2L.tokenNames; }
    public String getGrammarFileName() { return "/opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g"; }


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
    	
    	void regLine(Integer line){
    		instrucoes.add("Pushi 108,IOutC,Pushi 58,IOutC,Pushi "+line+",IOut");
    	}
    		


    public static class programa_return extends TreeRuleReturnScope {
        public ArrayList<String> msp_declaracoes;
        public ArrayList<String> msp_instrucoes;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "programa"
    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:35:1: programa returns [ArrayList<String> msp_declaracoes, ArrayList<String> msp_instrucoes] : ^( PROGRAMA ( funcao )+ ) ;
    public final CmbTGMSP2L.programa_return programa() throws RecognitionException {
        CmbTGMSP2L.programa_return retval = new CmbTGMSP2L.programa_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PROGRAMA1=null;
        CmbTGMSP2L.funcao_return funcao2 =null;


        CommonTree PROGRAMA1_tree=null;

        try {
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:36:2: ( ^( PROGRAMA ( funcao )+ ) )
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:36:5: ^( PROGRAMA ( funcao )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            PROGRAMA1=(CommonTree)match(input,PROGRAMA,FOLLOW_PROGRAMA_in_programa64); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PROGRAMA1_tree = (CommonTree)adaptor.dupNode(PROGRAMA1);


            root_1 = (CommonTree)adaptor.becomeRoot(PROGRAMA1_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:36:16: ( funcao )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==FUNCAO) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:36:17: funcao
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_funcao_in_programa67);
            	    funcao2=funcao();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_1, funcao2.getTree());


            	    if ( state.backtracking==0 ) {
            	    }
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


            if ( state.backtracking==0 ) {
            		retval.msp_declaracoes = declaracoes;
            		retval.msp_instrucoes = instrucoes;	
            	}

            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "programa"


    public static class funcao_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcao"
    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:44:1: funcao : ^( FUNCAO cabecalho corpo_funcao ) ;
    public final CmbTGMSP2L.funcao_return funcao() throws RecognitionException {
        CmbTGMSP2L.funcao_return retval = new CmbTGMSP2L.funcao_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FUNCAO3=null;
        CmbTGMSP2L.cabecalho_return cabecalho4 =null;

        CmbTGMSP2L.corpo_funcao_return corpo_funcao5 =null;


        CommonTree FUNCAO3_tree=null;

        try {
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:45:2: ( ^( FUNCAO cabecalho corpo_funcao ) )
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:45:5: ^( FUNCAO cabecalho corpo_funcao )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            FUNCAO3=(CommonTree)match(input,FUNCAO,FOLLOW_FUNCAO_in_funcao88); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FUNCAO3_tree = (CommonTree)adaptor.dupNode(FUNCAO3);


            root_1 = (CommonTree)adaptor.becomeRoot(FUNCAO3_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_cabecalho_in_funcao90);
            cabecalho4=cabecalho();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, cabecalho4.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_corpo_funcao_in_funcao92);
            corpo_funcao5=corpo_funcao();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, corpo_funcao5.getTree());


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "funcao"


    public static class cabecalho_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cabecalho"
    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:48:1: cabecalho : ^( CAEBECALHO tipo ID ( argumentos )? ) ;
    public final CmbTGMSP2L.cabecalho_return cabecalho() throws RecognitionException {
        CmbTGMSP2L.cabecalho_return retval = new CmbTGMSP2L.cabecalho_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CAEBECALHO6=null;
        CommonTree ID8=null;
        CmbTGMSP2L.tipo_return tipo7 =null;

        CmbTGMSP2L.argumentos_return argumentos9 =null;


        CommonTree CAEBECALHO6_tree=null;
        CommonTree ID8_tree=null;

        try {
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:49:2: ( ^( CAEBECALHO tipo ID ( argumentos )? ) )
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:49:5: ^( CAEBECALHO tipo ID ( argumentos )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CAEBECALHO6=(CommonTree)match(input,CAEBECALHO,FOLLOW_CAEBECALHO_in_cabecalho107); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CAEBECALHO6_tree = (CommonTree)adaptor.dupNode(CAEBECALHO6);


            root_1 = (CommonTree)adaptor.becomeRoot(CAEBECALHO6_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_tipo_in_cabecalho109);
            tipo7=tipo();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, tipo7.getTree());


            _last = (CommonTree)input.LT(1);
            ID8=(CommonTree)match(input,ID,FOLLOW_ID_in_cabecalho111); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID8_tree = (CommonTree)adaptor.dupNode(ID8);


            adaptor.addChild(root_1, ID8_tree);
            }


            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:49:26: ( argumentos )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ARGUMENTOS) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:49:26: argumentos
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_argumentos_in_cabecalho113);
                    argumentos9=argumentos();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, argumentos9.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "cabecalho"


    public static class argumentos_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "argumentos"
    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:51:1: argumentos : ^( ARGUMENTOS ( declaracao )+ ) ;
    public final CmbTGMSP2L.argumentos_return argumentos() throws RecognitionException {
        CmbTGMSP2L.argumentos_return retval = new CmbTGMSP2L.argumentos_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ARGUMENTOS10=null;
        CmbTGMSP2L.declaracao_return declaracao11 =null;


        CommonTree ARGUMENTOS10_tree=null;

        try {
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:52:2: ( ^( ARGUMENTOS ( declaracao )+ ) )
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:52:5: ^( ARGUMENTOS ( declaracao )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ARGUMENTOS10=(CommonTree)match(input,ARGUMENTOS,FOLLOW_ARGUMENTOS_in_argumentos126); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ARGUMENTOS10_tree = (CommonTree)adaptor.dupNode(ARGUMENTOS10);


            root_1 = (CommonTree)adaptor.becomeRoot(ARGUMENTOS10_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:52:18: ( declaracao )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==DECLARACAO) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:52:18: declaracao
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_declaracao_in_argumentos128);
            	    declaracao11=declaracao();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_1, declaracao11.getTree());


            	    if ( state.backtracking==0 ) {
            	    }
            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "argumentos"


    public static class corpo_funcao_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "corpo_funcao"
    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:55:1: corpo_funcao : ^( CORPO declaracoes statements ) ;
    public final CmbTGMSP2L.corpo_funcao_return corpo_funcao() throws RecognitionException {
        CmbTGMSP2L.corpo_funcao_return retval = new CmbTGMSP2L.corpo_funcao_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CORPO12=null;
        CmbTGMSP2L.declaracoes_return declaracoes13 =null;

        CmbTGMSP2L.statements_return statements14 =null;


        CommonTree CORPO12_tree=null;

        try {
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:56:2: ( ^( CORPO declaracoes statements ) )
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:56:4: ^( CORPO declaracoes statements )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CORPO12=(CommonTree)match(input,CORPO,FOLLOW_CORPO_in_corpo_funcao142); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CORPO12_tree = (CommonTree)adaptor.dupNode(CORPO12);


            root_1 = (CommonTree)adaptor.becomeRoot(CORPO12_tree, root_1);
            }


            if ( state.backtracking==0 ) {corpoFuncao = true;}

            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_declaracoes_in_corpo_funcao146);
            declaracoes13=declaracoes();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, declaracoes13.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_statements_in_corpo_funcao148);
            statements14=statements();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, statements14.getTree());


            if ( state.backtracking==0 ) {corpoFuncao = false;}

            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "corpo_funcao"


    public static class declaracoes_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaracoes"
    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:58:1: declaracoes : ^( DECLARACOES ( declaracao )+ ) ;
    public final CmbTGMSP2L.declaracoes_return declaracoes() throws RecognitionException {
        CmbTGMSP2L.declaracoes_return retval = new CmbTGMSP2L.declaracoes_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DECLARACOES15=null;
        CmbTGMSP2L.declaracao_return declaracao16 =null;


        CommonTree DECLARACOES15_tree=null;

        try {
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:59:2: ( ^( DECLARACOES ( declaracao )+ ) )
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:59:4: ^( DECLARACOES ( declaracao )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            DECLARACOES15=(CommonTree)match(input,DECLARACOES,FOLLOW_DECLARACOES_in_declaracoes162); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DECLARACOES15_tree = (CommonTree)adaptor.dupNode(DECLARACOES15);


            root_1 = (CommonTree)adaptor.becomeRoot(DECLARACOES15_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:59:18: ( declaracao )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==DECLARACAO) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:59:18: declaracao
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_declaracao_in_declaracoes164);
            	    declaracao16=declaracao();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_1, declaracao16.getTree());


            	    if ( state.backtracking==0 ) {
            	    }
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


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declaracoes"


    public static class declaracao_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaracao"
    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:62:1: declaracao : ^( DECLARACAO tipo ID ) ;
    public final CmbTGMSP2L.declaracao_return declaracao() throws RecognitionException {
        CmbTGMSP2L.declaracao_return retval = new CmbTGMSP2L.declaracao_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DECLARACAO17=null;
        CommonTree ID19=null;
        CmbTGMSP2L.tipo_return tipo18 =null;


        CommonTree DECLARACAO17_tree=null;
        CommonTree ID19_tree=null;

        try {
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:63:2: ( ^( DECLARACAO tipo ID ) )
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:63:4: ^( DECLARACAO tipo ID )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            DECLARACAO17=(CommonTree)match(input,DECLARACAO,FOLLOW_DECLARACAO_in_declaracao179); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DECLARACAO17_tree = (CommonTree)adaptor.dupNode(DECLARACAO17);


            root_1 = (CommonTree)adaptor.becomeRoot(DECLARACAO17_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_tipo_in_declaracao181);
            tipo18=tipo();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, tipo18.getTree());


            _last = (CommonTree)input.LT(1);
            ID19=(CommonTree)match(input,ID,FOLLOW_ID_in_declaracao183); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID19_tree = (CommonTree)adaptor.dupNode(ID19);


            adaptor.addChild(root_1, ID19_tree);
            }


            if ( state.backtracking==0 ) {if(corpoFuncao) regDecl("Decl \"" + (ID19!=null?ID19.getText():null) + "\" " + i++ + " 1");}

            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declaracao"


    public static class tipo_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tipo"
    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:66:1: tipo : ( TD_INT | TD_BOOL | TD_STRING | TD_VAZIO );
    public final CmbTGMSP2L.tipo_return tipo() throws RecognitionException {
        CmbTGMSP2L.tipo_return retval = new CmbTGMSP2L.tipo_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set20=null;

        CommonTree set20_tree=null;

        try {
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:67:2: ( TD_INT | TD_BOOL | TD_STRING | TD_VAZIO )
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set20=(CommonTree)input.LT(1);

            if ( (input.LA(1) >= TD_BOOL && input.LA(1) <= TD_VAZIO) ) {
                input.consume();
                if ( state.backtracking==0 ) {
                set20_tree = (CommonTree)adaptor.dupNode(set20);


                adaptor.addChild(root_0, set20_tree);
                }

                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            if ( state.backtracking==0 ) {
            } 

            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tipo"


    public static class statements_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statements"
    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:73:1: statements : ^( STATEMENTS ( statement )+ ) ;
    public final CmbTGMSP2L.statements_return statements() throws RecognitionException {
        CmbTGMSP2L.statements_return retval = new CmbTGMSP2L.statements_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree STATEMENTS21=null;
        CmbTGMSP2L.statement_return statement22 =null;


        CommonTree STATEMENTS21_tree=null;

        try {
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:74:2: ( ^( STATEMENTS ( statement )+ ) )
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:74:5: ^( STATEMENTS ( statement )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            STATEMENTS21=(CommonTree)match(input,STATEMENTS,FOLLOW_STATEMENTS_in_statements231); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STATEMENTS21_tree = (CommonTree)adaptor.dupNode(STATEMENTS21);


            root_1 = (CommonTree)adaptor.becomeRoot(STATEMENTS21_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:74:18: ( statement )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==IF||LA5_0==INVOCACAO||(LA5_0 >= READ && LA5_0 <= RETURN)||(LA5_0 >= WHILE && LA5_0 <= WRITE)||LA5_0==52) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:74:19: statement
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_statement_in_statements234);
            	    statement22=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_1, statement22.getTree());


            	    if ( state.backtracking==0 ) {
            	    }
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


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statements"


    public static class statement_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:78:1: statement : ( atribuicao | read | write | ifs | whiles | invocacao | retorna );
    public final CmbTGMSP2L.statement_return statement() throws RecognitionException {
        CmbTGMSP2L.statement_return retval = new CmbTGMSP2L.statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CmbTGMSP2L.atribuicao_return atribuicao23 =null;

        CmbTGMSP2L.read_return read24 =null;

        CmbTGMSP2L.write_return write25 =null;

        CmbTGMSP2L.ifs_return ifs26 =null;

        CmbTGMSP2L.whiles_return whiles27 =null;

        CmbTGMSP2L.invocacao_return invocacao28 =null;

        CmbTGMSP2L.retorna_return retorna29 =null;



        try {
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:79:2: ( atribuicao | read | write | ifs | whiles | invocacao | retorna )
            int alt6=7;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt6=1;
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
            case INVOCACAO:
                {
                alt6=6;
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
                    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:79:4: atribuicao
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_atribuicao_in_statement251);
                    atribuicao23=atribuicao();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, atribuicao23.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:80:4: read
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_read_in_statement256);
                    read24=read();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, read24.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:81:4: write
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_write_in_statement261);
                    write25=write();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, write25.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:82:4: ifs
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_ifs_in_statement266);
                    ifs26=ifs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, ifs26.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:83:4: whiles
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_whiles_in_statement271);
                    whiles27=whiles();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, whiles27.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 6 :
                    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:84:4: invocacao
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_invocacao_in_statement276);
                    invocacao28=invocacao();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, invocacao28.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 7 :
                    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:85:4: retorna
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_retorna_in_statement281);
                    retorna29=retorna();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, retorna29.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class retorna_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "retorna"
    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:88:1: retorna : ^( RETURN expr ) ;
    public final CmbTGMSP2L.retorna_return retorna() throws RecognitionException {
        CmbTGMSP2L.retorna_return retval = new CmbTGMSP2L.retorna_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree RETURN30=null;
        CmbTGMSP2L.expr_return expr31 =null;


        CommonTree RETURN30_tree=null;

        try {
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:89:2: ( ^( RETURN expr ) )
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:89:4: ^( RETURN expr )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            RETURN30=(CommonTree)match(input,RETURN,FOLLOW_RETURN_in_retorna295); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RETURN30_tree = (CommonTree)adaptor.dupNode(RETURN30);


            root_1 = (CommonTree)adaptor.becomeRoot(RETURN30_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expr_in_retorna297);
            expr31=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, expr31.getTree());


            if ( state.backtracking==0 ) {regLine((RETURN30!=null?RETURN30.getLine():0));}

            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "retorna"


    public static class invocacao_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "invocacao"
    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:92:1: invocacao : ^( INVOCACAO ID ( args )? ) ;
    public final CmbTGMSP2L.invocacao_return invocacao() throws RecognitionException {
        CmbTGMSP2L.invocacao_return retval = new CmbTGMSP2L.invocacao_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INVOCACAO32=null;
        CommonTree ID33=null;
        CmbTGMSP2L.args_return args34 =null;


        CommonTree INVOCACAO32_tree=null;
        CommonTree ID33_tree=null;

        try {
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:93:2: ( ^( INVOCACAO ID ( args )? ) )
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:93:4: ^( INVOCACAO ID ( args )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            INVOCACAO32=(CommonTree)match(input,INVOCACAO,FOLLOW_INVOCACAO_in_invocacao313); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INVOCACAO32_tree = (CommonTree)adaptor.dupNode(INVOCACAO32);


            root_1 = (CommonTree)adaptor.becomeRoot(INVOCACAO32_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            ID33=(CommonTree)match(input,ID,FOLLOW_ID_in_invocacao315); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID33_tree = (CommonTree)adaptor.dupNode(ID33);


            adaptor.addChild(root_1, ID33_tree);
            }


            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:93:19: ( args )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ARGS) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:93:19: args
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_args_in_invocacao317);
                    args34=args();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, args34.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }


            if ( state.backtracking==0 ) {regLine((ID33!=null?ID33.getLine():0));}

            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "invocacao"


    public static class args_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "args"
    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:96:1: args : ^( ARGS ( expr )+ ) ;
    public final CmbTGMSP2L.args_return args() throws RecognitionException {
        CmbTGMSP2L.args_return retval = new CmbTGMSP2L.args_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ARGS35=null;
        CmbTGMSP2L.expr_return expr36 =null;


        CommonTree ARGS35_tree=null;

        try {
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:97:2: ( ^( ARGS ( expr )+ ) )
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:97:4: ^( ARGS ( expr )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ARGS35=(CommonTree)match(input,ARGS,FOLLOW_ARGS_in_args333); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ARGS35_tree = (CommonTree)adaptor.dupNode(ARGS35);


            root_1 = (CommonTree)adaptor.becomeRoot(ARGS35_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:97:11: ( expr )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==FALSE||LA8_0==ID||(LA8_0 >= INT && LA8_0 <= INVOCACAO)||LA8_0==STRING||LA8_0==TRUE||(LA8_0 >= 38 && LA8_0 <= 41)||(LA8_0 >= 44 && LA8_0 <= 45)||(LA8_0 >= 47 && LA8_0 <= 48)||(LA8_0 >= 50 && LA8_0 <= 51)||(LA8_0 >= 53 && LA8_0 <= 55)||LA8_0==57) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:97:12: expr
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_expr_in_args336);
            	    expr36=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_1, expr36.getTree());


            	    if ( state.backtracking==0 ) {
            	    }
            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "args"


    public static class atribuicao_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atribuicao"
    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:100:1: atribuicao : ^( '=' ID expr ) ;
    public final CmbTGMSP2L.atribuicao_return atribuicao() throws RecognitionException {
        CmbTGMSP2L.atribuicao_return retval = new CmbTGMSP2L.atribuicao_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree char_literal37=null;
        CommonTree ID38=null;
        CmbTGMSP2L.expr_return expr39 =null;


        CommonTree char_literal37_tree=null;
        CommonTree ID38_tree=null;

        try {
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:101:2: ( ^( '=' ID expr ) )
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:101:4: ^( '=' ID expr )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            char_literal37=(CommonTree)match(input,52,FOLLOW_52_in_atribuicao352); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal37_tree = (CommonTree)adaptor.dupNode(char_literal37);


            root_1 = (CommonTree)adaptor.becomeRoot(char_literal37_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            ID38=(CommonTree)match(input,ID,FOLLOW_ID_in_atribuicao354); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID38_tree = (CommonTree)adaptor.dupNode(ID38);


            adaptor.addChild(root_1, ID38_tree);
            }


            if ( state.backtracking==0 ) {regCode("Pusha \"" + (ID38!=null?ID38.getText():null) +"\"") ;}

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expr_in_atribuicao358);
            expr39=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, expr39.getTree());


            if ( state.backtracking==0 ) {regCode("Store"); regLine((ID38!=null?ID38.getLine():0));}

            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atribuicao"


    public static class write_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "write"
    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:104:1: write : ^( WRITE expr ) ;
    public final CmbTGMSP2L.write_return write() throws RecognitionException {
        CmbTGMSP2L.write_return retval = new CmbTGMSP2L.write_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree WRITE40=null;
        CmbTGMSP2L.expr_return expr41 =null;


        CommonTree WRITE40_tree=null;

        try {
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:104:8: ( ^( WRITE expr ) )
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:104:10: ^( WRITE expr )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            WRITE40=(CommonTree)match(input,WRITE,FOLLOW_WRITE_in_write373); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WRITE40_tree = (CommonTree)adaptor.dupNode(WRITE40);


            root_1 = (CommonTree)adaptor.becomeRoot(WRITE40_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expr_in_write375);
            expr41=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, expr41.getTree());


            if ( state.backtracking==0 ) {/*regCode("IOut");*/regLine((WRITE40!=null?WRITE40.getLine():0));}

            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "write"


    public static class read_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "read"
    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:107:1: read : ^( READ ID ) ;
    public final CmbTGMSP2L.read_return read() throws RecognitionException {
        CmbTGMSP2L.read_return retval = new CmbTGMSP2L.read_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree READ42=null;
        CommonTree ID43=null;

        CommonTree READ42_tree=null;
        CommonTree ID43_tree=null;

        try {
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:107:7: ( ^( READ ID ) )
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:107:9: ^( READ ID )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            READ42=(CommonTree)match(input,READ,FOLLOW_READ_in_read391); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            READ42_tree = (CommonTree)adaptor.dupNode(READ42);


            root_1 = (CommonTree)adaptor.becomeRoot(READ42_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            ID43=(CommonTree)match(input,ID,FOLLOW_ID_in_read393); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID43_tree = (CommonTree)adaptor.dupNode(ID43);


            adaptor.addChild(root_1, ID43_tree);
            }


            if ( state.backtracking==0 ) {regCode("Pusha \"" + (ID43!=null?ID43.getText():null) + "\",IIn,Store"); regLine((READ42!=null?READ42.getLine():0));}

            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "read"


    public static class ifs_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifs"
    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:111:1: ifs : ^( IF expr a= bloco (b= bloco )? ) ;
    public final CmbTGMSP2L.ifs_return ifs() throws RecognitionException {
        CmbTGMSP2L.ifs_return retval = new CmbTGMSP2L.ifs_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IF44=null;
        CmbTGMSP2L.bloco_return a =null;

        CmbTGMSP2L.bloco_return b =null;

        CmbTGMSP2L.expr_return expr45 =null;


        CommonTree IF44_tree=null;

        try {
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:111:6: ( ^( IF expr a= bloco (b= bloco )? ) )
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:111:8: ^( IF expr a= bloco (b= bloco )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IF44=(CommonTree)match(input,IF,FOLLOW_IF_in_ifs411); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IF44_tree = (CommonTree)adaptor.dupNode(IF44);


            root_1 = (CommonTree)adaptor.becomeRoot(IF44_tree, root_1);
            }


            if ( state.backtracking==0 ) {regLine((IF44!=null?IF44.getLine():0));}

            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expr_in_ifs420);
            expr45=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, expr45.getTree());


            if ( state.backtracking==0 ) {regCode("Jumpf \"senao"+ (IF44!=null?IF44.getLine():0) +"\"");}

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_bloco_in_ifs429);
            a=bloco();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, a.getTree());


            if ( state.backtracking==0 ) {regCode("Jump \"fse"+ (IF44!=null?IF44.getLine():0) +"\""); regCode("ALabel \"senao"+(IF44!=null?IF44.getLine():0)+"\" ");}

            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:114:3: (b= bloco )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==STATEMENTS) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:114:4: b= bloco
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_bloco_in_ifs438);
                    b=bloco();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, b.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }


            if ( state.backtracking==0 ) {regCode("ALabel \"fse"+(IF44!=null?IF44.getLine():0)+"\""); }

            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ifs"


    public static class whiles_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whiles"
    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:117:1: whiles : ^( WHILE expr bloco ) ;
    public final CmbTGMSP2L.whiles_return whiles() throws RecognitionException {
        CmbTGMSP2L.whiles_return retval = new CmbTGMSP2L.whiles_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree WHILE46=null;
        CmbTGMSP2L.expr_return expr47 =null;

        CmbTGMSP2L.bloco_return bloco48 =null;


        CommonTree WHILE46_tree=null;

        try {
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:117:9: ( ^( WHILE expr bloco ) )
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:117:11: ^( WHILE expr bloco )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            WHILE46=(CommonTree)match(input,WHILE,FOLLOW_WHILE_in_whiles458); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WHILE46_tree = (CommonTree)adaptor.dupNode(WHILE46);


            root_1 = (CommonTree)adaptor.becomeRoot(WHILE46_tree, root_1);
            }


            if ( state.backtracking==0 ) {regCode("enq"+ (WHILE46!=null?WHILE46.getLine():0)+ ": "); regLine((WHILE46!=null?WHILE46.getLine():0));}

            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expr_in_whiles464);
            expr47=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, expr47.getTree());


            if ( state.backtracking==0 ) {regCode("JMPF fenq"+ (WHILE46!=null?WHILE46.getLine():0));}

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_bloco_in_whiles470);
            bloco48=bloco();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, bloco48.getTree());


            if ( state.backtracking==0 ) {regCode("fenq"+(WHILE46!=null?WHILE46.getLine():0)+": ");}

            match(input, Token.UP, null); if (state.failed) return retval;
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "whiles"


    public static class bloco_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bloco"
    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:122:1: bloco : statements ;
    public final CmbTGMSP2L.bloco_return bloco() throws RecognitionException {
        CmbTGMSP2L.bloco_return retval = new CmbTGMSP2L.bloco_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CmbTGMSP2L.statements_return statements49 =null;



        try {
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:122:8: ( statements )
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:122:10: statements
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_statements_in_bloco484);
            statements49=statements();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_0, statements49.getTree());


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bloco"


    public static class expr_return extends TreeRuleReturnScope {
        public String instrucao;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:125:1: expr returns [String instrucao] : ( ^( '||' a= expr b= expr ) | ^( '&&' a= expr b= expr ) | ^( '+' a= expr b= expr ) | ^( '-' a= expr b= expr ) | ^( '*' a= expr b= expr ) | ^( '/' a= expr b= expr ) | ^( '%' a= expr b= expr ) | ^( '>' a= expr b= expr ) | ^( '<' a= expr b= expr ) | ^( '>=' a= expr b= expr ) | ^( '<=' a= expr b= expr ) | ^( '==' a= expr b= expr ) | ^( '!=' a= expr b= expr ) | ^( '!' a= expr ) | factor );
    public final CmbTGMSP2L.expr_return expr() throws RecognitionException {
        CmbTGMSP2L.expr_return retval = new CmbTGMSP2L.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree string_literal50=null;
        CommonTree string_literal51=null;
        CommonTree char_literal52=null;
        CommonTree char_literal53=null;
        CommonTree char_literal54=null;
        CommonTree char_literal55=null;
        CommonTree char_literal56=null;
        CommonTree char_literal57=null;
        CommonTree char_literal58=null;
        CommonTree string_literal59=null;
        CommonTree string_literal60=null;
        CommonTree string_literal61=null;
        CommonTree string_literal62=null;
        CommonTree char_literal63=null;
        CmbTGMSP2L.expr_return a =null;

        CmbTGMSP2L.expr_return b =null;

        CmbTGMSP2L.factor_return factor64 =null;


        CommonTree string_literal50_tree=null;
        CommonTree string_literal51_tree=null;
        CommonTree char_literal52_tree=null;
        CommonTree char_literal53_tree=null;
        CommonTree char_literal54_tree=null;
        CommonTree char_literal55_tree=null;
        CommonTree char_literal56_tree=null;
        CommonTree char_literal57_tree=null;
        CommonTree char_literal58_tree=null;
        CommonTree string_literal59_tree=null;
        CommonTree string_literal60_tree=null;
        CommonTree string_literal61_tree=null;
        CommonTree string_literal62_tree=null;
        CommonTree char_literal63_tree=null;

        try {
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:126:2: ( ^( '||' a= expr b= expr ) | ^( '&&' a= expr b= expr ) | ^( '+' a= expr b= expr ) | ^( '-' a= expr b= expr ) | ^( '*' a= expr b= expr ) | ^( '/' a= expr b= expr ) | ^( '%' a= expr b= expr ) | ^( '>' a= expr b= expr ) | ^( '<' a= expr b= expr ) | ^( '>=' a= expr b= expr ) | ^( '<=' a= expr b= expr ) | ^( '==' a= expr b= expr ) | ^( '!=' a= expr b= expr ) | ^( '!' a= expr ) | factor )
            int alt10=15;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt10=1;
                }
                break;
            case 41:
                {
                alt10=2;
                }
                break;
            case 45:
                {
                alt10=3;
                }
                break;
            case 47:
                {
                alt10=4;
                }
                break;
            case 44:
                {
                alt10=5;
                }
                break;
            case 48:
                {
                alt10=6;
                }
                break;
            case 40:
                {
                alt10=7;
                }
                break;
            case 54:
                {
                alt10=8;
                }
                break;
            case 50:
                {
                alt10=9;
                }
                break;
            case 55:
                {
                alt10=10;
                }
                break;
            case 51:
                {
                alt10=11;
                }
                break;
            case 53:
                {
                alt10=12;
                }
                break;
            case 39:
                {
                alt10=13;
                }
                break;
            case 38:
                {
                alt10=14;
                }
                break;
            case FALSE:
            case ID:
            case INT:
            case INVOCACAO:
            case STRING:
            case TRUE:
                {
                alt10=15;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:126:4: ^( '||' a= expr b= expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    string_literal50=(CommonTree)match(input,57,FOLLOW_57_in_expr501); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal50_tree = (CommonTree)adaptor.dupNode(string_literal50);


                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal50_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr505);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, a.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr509);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, b.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {regCode("Or"); retval.instrucao = (a!=null?a.instrucao:null) + "||" 	+ (b!=null?b.instrucao:null);}

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:127:4: ^( '&&' a= expr b= expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    string_literal51=(CommonTree)match(input,41,FOLLOW_41_in_expr519); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal51_tree = (CommonTree)adaptor.dupNode(string_literal51);


                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal51_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr523);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, a.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr527);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, b.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {regCode("And"); retval.instrucao = (a!=null?a.instrucao:null) + "&&" 	+ (b!=null?b.instrucao:null);}

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:128:4: ^( '+' a= expr b= expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    char_literal52=(CommonTree)match(input,45,FOLLOW_45_in_expr537); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal52_tree = (CommonTree)adaptor.dupNode(char_literal52);


                    root_1 = (CommonTree)adaptor.becomeRoot(char_literal52_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr541);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, a.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr545);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, b.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {retval.instrucao = (a!=null?a.instrucao:null) + "+" 	+ (b!=null?b.instrucao:null);}

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:129:4: ^( '-' a= expr b= expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    char_literal53=(CommonTree)match(input,47,FOLLOW_47_in_expr555); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal53_tree = (CommonTree)adaptor.dupNode(char_literal53);


                    root_1 = (CommonTree)adaptor.becomeRoot(char_literal53_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr559);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, a.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr563);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, b.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {retval.instrucao = (a!=null?a.instrucao:null) + "-" 	+ (b!=null?b.instrucao:null);}

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:130:4: ^( '*' a= expr b= expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    char_literal54=(CommonTree)match(input,44,FOLLOW_44_in_expr573); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal54_tree = (CommonTree)adaptor.dupNode(char_literal54);


                    root_1 = (CommonTree)adaptor.becomeRoot(char_literal54_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr577);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, a.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr581);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, b.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {regCode("Mul"); retval.instrucao = (a!=null?a.instrucao:null) + "*" 	+ (b!=null?b.instrucao:null);}

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 6 :
                    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:131:4: ^( '/' a= expr b= expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    char_literal55=(CommonTree)match(input,48,FOLLOW_48_in_expr591); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal55_tree = (CommonTree)adaptor.dupNode(char_literal55);


                    root_1 = (CommonTree)adaptor.becomeRoot(char_literal55_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr595);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, a.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr599);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, b.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {regCode("Div");retval.instrucao = (a!=null?a.instrucao:null) + "/" 	+ (b!=null?b.instrucao:null);}

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 7 :
                    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:132:4: ^( '%' a= expr b= expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    char_literal56=(CommonTree)match(input,40,FOLLOW_40_in_expr609); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal56_tree = (CommonTree)adaptor.dupNode(char_literal56);


                    root_1 = (CommonTree)adaptor.becomeRoot(char_literal56_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr613);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, a.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr617);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, b.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {regCode("Mod"); retval.instrucao = (a!=null?a.instrucao:null) + "%" 	+ (b!=null?b.instrucao:null);}

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 8 :
                    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:133:4: ^( '>' a= expr b= expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    char_literal57=(CommonTree)match(input,54,FOLLOW_54_in_expr627); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal57_tree = (CommonTree)adaptor.dupNode(char_literal57);


                    root_1 = (CommonTree)adaptor.becomeRoot(char_literal57_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr631);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, a.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr635);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, b.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {regCode("Gt"); retval.instrucao = (a!=null?a.instrucao:null) + ">" 	+ (b!=null?b.instrucao:null);}

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 9 :
                    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:134:4: ^( '<' a= expr b= expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    char_literal58=(CommonTree)match(input,50,FOLLOW_50_in_expr645); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal58_tree = (CommonTree)adaptor.dupNode(char_literal58);


                    root_1 = (CommonTree)adaptor.becomeRoot(char_literal58_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr649);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, a.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr653);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, b.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {regCode("Lt"); retval.instrucao = (a!=null?a.instrucao:null) + "<" 	+ (b!=null?b.instrucao:null);}

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 10 :
                    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:135:4: ^( '>=' a= expr b= expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    string_literal59=(CommonTree)match(input,55,FOLLOW_55_in_expr663); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal59_tree = (CommonTree)adaptor.dupNode(string_literal59);


                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal59_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr667);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, a.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr671);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, b.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {regCode("Ge"); retval.instrucao = (a!=null?a.instrucao:null) + ">=" 	+ (b!=null?b.instrucao:null);}

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 11 :
                    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:136:5: ^( '<=' a= expr b= expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    string_literal60=(CommonTree)match(input,51,FOLLOW_51_in_expr682); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal60_tree = (CommonTree)adaptor.dupNode(string_literal60);


                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal60_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr686);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, a.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr690);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, b.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {regCode("Le"); retval.instrucao = (a!=null?a.instrucao:null) + "<=" 	+ (b!=null?b.instrucao:null);}

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 12 :
                    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:137:4: ^( '==' a= expr b= expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    string_literal61=(CommonTree)match(input,53,FOLLOW_53_in_expr700); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal61_tree = (CommonTree)adaptor.dupNode(string_literal61);


                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal61_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr704);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, a.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr708);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, b.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {regCode("Eq"); retval.instrucao = (a!=null?a.instrucao:null) + "==" 	+ (b!=null?b.instrucao:null);}

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 13 :
                    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:138:4: ^( '!=' a= expr b= expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    string_literal62=(CommonTree)match(input,39,FOLLOW_39_in_expr718); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal62_tree = (CommonTree)adaptor.dupNode(string_literal62);


                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal62_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr722);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, a.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr726);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, b.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {regCode("Ne"); retval.instrucao = (a!=null?a.instrucao:null) + "!=" 	+ (b!=null?b.instrucao:null);}

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 14 :
                    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:139:4: ^( '!' a= expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    char_literal63=(CommonTree)match(input,38,FOLLOW_38_in_expr736); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal63_tree = (CommonTree)adaptor.dupNode(char_literal63);


                    root_1 = (CommonTree)adaptor.becomeRoot(char_literal63_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr740);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, a.getTree());


                    match(input, Token.UP, null); if (state.failed) return retval;
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {retval.instrucao = "!" + (a!=null?a.instrucao:null);}

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 15 :
                    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:140:4: factor
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_factor_in_expr751);
                    factor64=factor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, factor64.getTree());


                    if ( state.backtracking==0 ) {retval.instrucao = (factor64!=null?factor64.instrucao:null);}

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class factor_return extends TreeRuleReturnScope {
        public String instrucao;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:143:1: factor returns [String instrucao] : ( ID | constante | invocacao );
    public final CmbTGMSP2L.factor_return factor() throws RecognitionException {
        CmbTGMSP2L.factor_return retval = new CmbTGMSP2L.factor_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ID65=null;
        CmbTGMSP2L.constante_return constante66 =null;

        CmbTGMSP2L.invocacao_return invocacao67 =null;


        CommonTree ID65_tree=null;

        try {
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:144:2: ( ID | constante | invocacao )
            int alt11=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt11=1;
                }
                break;
            case FALSE:
            case INT:
            case STRING:
            case TRUE:
                {
                alt11=2;
                }
                break;
            case INVOCACAO:
                {
                alt11=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:144:4: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    ID65=(CommonTree)match(input,ID,FOLLOW_ID_in_factor774); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID65_tree = (CommonTree)adaptor.dupNode(ID65);


                    adaptor.addChild(root_0, ID65_tree);
                    }


                    if ( state.backtracking==0 ) {regCode("Pusha \"" + (ID65!=null?ID65.getText():null) + "\",Load"); retval.instrucao = (ID65!=null?ID65.getText():null);}

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:145:4: constante
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_constante_in_factor783);
                    constante66=constante();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, constante66.getTree());


                    if ( state.backtracking==0 ) {System.out.println("PUSH " + (constante66!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(constante66.start),input.getTreeAdaptor().getTokenStopIndex(constante66.start))):null)); retval.instrucao = (constante66!=null?constante66.valor:null);}

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:146:4: invocacao
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_invocacao_in_factor790);
                    invocacao67=invocacao();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, invocacao67.getTree());


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"


    public static class constante_return extends TreeRuleReturnScope {
        public String valor;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constante"
    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:149:1: constante returns [String valor] : ( STRING | INT | TRUE | FALSE );
    public final CmbTGMSP2L.constante_return constante() throws RecognitionException {
        CmbTGMSP2L.constante_return retval = new CmbTGMSP2L.constante_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree STRING68=null;
        CommonTree INT69=null;
        CommonTree TRUE70=null;
        CommonTree FALSE71=null;

        CommonTree STRING68_tree=null;
        CommonTree INT69_tree=null;
        CommonTree TRUE70_tree=null;
        CommonTree FALSE71_tree=null;

        try {
            // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:150:2: ( STRING | INT | TRUE | FALSE )
            int alt12=4;
            switch ( input.LA(1) ) {
            case STRING:
                {
                alt12=1;
                }
                break;
            case INT:
                {
                alt12=2;
                }
                break;
            case TRUE:
                {
                alt12=3;
                }
                break;
            case FALSE:
                {
                alt12=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:150:4: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    STRING68=(CommonTree)match(input,STRING,FOLLOW_STRING_in_constante806); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING68_tree = (CommonTree)adaptor.dupNode(STRING68);


                    adaptor.addChild(root_0, STRING68_tree);
                    }


                    if ( state.backtracking==0 ) {retval.valor = (STRING68!=null?STRING68.getText():null);}

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:151:4: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    INT69=(CommonTree)match(input,INT,FOLLOW_INT_in_constante813); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT69_tree = (CommonTree)adaptor.dupNode(INT69);


                    adaptor.addChild(root_0, INT69_tree);
                    }


                    if ( state.backtracking==0 ) {retval.valor = (INT69!=null?INT69.getText():null);}

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:152:4: TRUE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    TRUE70=(CommonTree)match(input,TRUE,FOLLOW_TRUE_in_constante820); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRUE70_tree = (CommonTree)adaptor.dupNode(TRUE70);


                    adaptor.addChild(root_0, TRUE70_tree);
                    }


                    if ( state.backtracking==0 ) {retval.valor = (TRUE70!=null?TRUE70.getText():null);}

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // /opt/lampp/htdocs/ACS/ATS/Final/Cmb/Gramatica/CmbTGMSP2L.g:153:4: FALSE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    FALSE71=(CommonTree)match(input,FALSE,FOLLOW_FALSE_in_constante827); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FALSE71_tree = (CommonTree)adaptor.dupNode(FALSE71);


                    adaptor.addChild(root_0, FALSE71_tree);
                    }


                    if ( state.backtracking==0 ) {retval.valor = (FALSE71!=null?FALSE71.getText():null);}

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constante"

    // Delegated rules


 

    public static final BitSet FOLLOW_PROGRAMA_in_programa64 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_funcao_in_programa67 = new BitSet(new long[]{0x0000000000010008L});
    public static final BitSet FOLLOW_FUNCAO_in_funcao88 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_cabecalho_in_funcao90 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_corpo_funcao_in_funcao92 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAEBECALHO_in_cabecalho107 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipo_in_cabecalho109 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_cabecalho111 = new BitSet(new long[]{0x0000000000000028L});
    public static final BitSet FOLLOW_argumentos_in_cabecalho113 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARGUMENTOS_in_argumentos126 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declaracao_in_argumentos128 = new BitSet(new long[]{0x0000000000000808L});
    public static final BitSet FOLLOW_CORPO_in_corpo_funcao142 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declaracoes_in_corpo_funcao146 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_statements_in_corpo_funcao148 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECLARACOES_in_declaracoes162 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declaracao_in_declaracoes164 = new BitSet(new long[]{0x0000000000000808L});
    public static final BitSet FOLLOW_DECLARACAO_in_declaracao179 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipo_in_declaracao181 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_declaracao183 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STATEMENTS_in_statements231 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_statements234 = new BitSet(new long[]{0x0010001803280008L});
    public static final BitSet FOLLOW_atribuicao_in_statement251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_statement256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_statement261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifs_in_statement266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whiles_in_statement271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invocacao_in_statement276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_retorna_in_statement281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_retorna295 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_retorna297 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INVOCACAO_in_invocacao313 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_invocacao315 = new BitSet(new long[]{0x0000000000000018L});
    public static final BitSet FOLLOW_args_in_invocacao317 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARGS_in_args333 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_args336 = new BitSet(new long[]{0x02EDB3C208348008L});
    public static final BitSet FOLLOW_52_in_atribuicao352 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_atribuicao354 = new BitSet(new long[]{0x02EDB3C208348000L});
    public static final BitSet FOLLOW_expr_in_atribuicao358 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WRITE_in_write373 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_write375 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_READ_in_read391 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_read393 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_ifs411 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_ifs420 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_bloco_in_ifs429 = new BitSet(new long[]{0x0000000004000008L});
    public static final BitSet FOLLOW_bloco_in_ifs438 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHILE_in_whiles458 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_whiles464 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_bloco_in_whiles470 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_statements_in_bloco484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_expr501 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr505 = new BitSet(new long[]{0x02EDB3C208348000L});
    public static final BitSet FOLLOW_expr_in_expr509 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_41_in_expr519 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr523 = new BitSet(new long[]{0x02EDB3C208348000L});
    public static final BitSet FOLLOW_expr_in_expr527 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_45_in_expr537 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr541 = new BitSet(new long[]{0x02EDB3C208348000L});
    public static final BitSet FOLLOW_expr_in_expr545 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_47_in_expr555 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr559 = new BitSet(new long[]{0x02EDB3C208348000L});
    public static final BitSet FOLLOW_expr_in_expr563 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_44_in_expr573 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr577 = new BitSet(new long[]{0x02EDB3C208348000L});
    public static final BitSet FOLLOW_expr_in_expr581 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_48_in_expr591 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr595 = new BitSet(new long[]{0x02EDB3C208348000L});
    public static final BitSet FOLLOW_expr_in_expr599 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_40_in_expr609 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr613 = new BitSet(new long[]{0x02EDB3C208348000L});
    public static final BitSet FOLLOW_expr_in_expr617 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_54_in_expr627 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr631 = new BitSet(new long[]{0x02EDB3C208348000L});
    public static final BitSet FOLLOW_expr_in_expr635 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_50_in_expr645 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr649 = new BitSet(new long[]{0x02EDB3C208348000L});
    public static final BitSet FOLLOW_expr_in_expr653 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_55_in_expr663 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr667 = new BitSet(new long[]{0x02EDB3C208348000L});
    public static final BitSet FOLLOW_expr_in_expr671 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_51_in_expr682 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr686 = new BitSet(new long[]{0x02EDB3C208348000L});
    public static final BitSet FOLLOW_expr_in_expr690 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_53_in_expr700 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr704 = new BitSet(new long[]{0x02EDB3C208348000L});
    public static final BitSet FOLLOW_expr_in_expr708 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_39_in_expr718 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr722 = new BitSet(new long[]{0x02EDB3C208348000L});
    public static final BitSet FOLLOW_expr_in_expr726 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_38_in_expr736 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr740 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_factor_in_expr751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constante_in_factor783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invocacao_in_factor790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_constante806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_constante813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_constante820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_constante827 = new BitSet(new long[]{0x0000000000000002L});

}