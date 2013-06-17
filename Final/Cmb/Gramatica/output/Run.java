
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
//import org.antlr.stringtemplate.*;

public class Run {

    public static void main(String[] args) throws Exception {
        try {
            CharStream in = new ANTLRFileStream(args[0], "UTF8");
            CmbLexer lexer = new CmbLexer(in);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CmbParser parser = new CmbParser(tokens);
            CmbParser.programa_return ret = parser.programa();

            /**
             * Tipos disponiveis para usar nas threads 1 - CmbTGCFG 2 - CmbTGPDG
             * 3 - CmbTGSSA 4 - CmbTGSDG
             *
             */
            CmbTGCFG walker = new CmbTGCFG(new CommonTreeNodeStream(ret.getTree()));
            ////CmbTGCFG.programa_return walker_ret = walker.programa();
            ////System.out.println(walker_ret.g_out);
            Thread tCFG = new MyThread(walker, 1);
            tCFG.start();
            System.out.println("Começou CFG");

            CmbTGPDG walkerPDG = new CmbTGPDG(new CommonTreeNodeStream(ret.getTree()));
            ////CmbTGPDG.programa_return walkerPDG_ret = walkerPDG.programa();
            ////System.out.println(walkerPDG_ret.g_out);
            Thread tPDG = new MyThread(walkerPDG, 2);
            tPDG.start();
            System.out.println("Começou PDG");

            CmbTGSSA walkerSSA = new CmbTGSSA(new CommonTreeNodeStream(ret.getTree()));
            ////CmbTGPDG.programa_return walkerPDG_ret = walkerPDG.programa();
            ////System.out.println(walkerPDG_ret.g_out);
            Thread tSSA = new MyThread(walkerSSA, 3);
            tSSA.start();
            System.out.println("Começou SSA");

            CmbTGSDG walkerSDG = new CmbTGSDG(new CommonTreeNodeStream(ret.getTree()));
            //CmbTGPDG.programa_return walkerPDG_ret = walkerPDG.programa();
            //System.out.println(walkerPDG_ret.g_out);
            Thread tSDG = new MyThread(walkerSDG, 4);
            tSDG.start();
            System.out.println("Começou SDG");

            CmbTGMSP walkerMSP = new CmbTGMSP(new CommonTreeNodeStream(ret.getTree()));
            //CmbTGPDG.programa_return walkerPDG_ret = walkerPDG.programa();
            //System.out.println(walkerPDG_ret.g_out);
            Thread tMSP = new MyThread(walkerMSP, 5);
            tMSP.start();
            System.out.println("Começou MSP");

            CmbTGMSP2 walkerMSP2 = new CmbTGMSP2(new CommonTreeNodeStream(ret.getTree()));
            //CmbTGPDG.programa_return walkerPDG_ret = walkerPDG.programa();
            //System.out.println(walkerPDG_ret.g_out);
            Thread tMSP2 = new MyThread(walkerMSP2, 6);
            tMSP2.start();
            System.out.println("Começou MSP2");

            CmbTGMSP2L walkerMSP2L = new CmbTGMSP2L(new CommonTreeNodeStream(ret.getTree()));
            //CmbTGPDG.programa_return walkerPDG_ret = walkerPDG.programa();
            //System.out.println(walkerPDG_ret.g_out);
            Thread tMSP2L = new MyThread(walkerMSP2L, 7);
            tMSP2L.start();
            System.out.println("Começou MSP2L");

            CmbTGME walkerME = new CmbTGME(new CommonTreeNodeStream(ret.getTree()));
            //CmbTGPDG.programa_return walkerPDG_ret = walkerPDG.programa();
            //System.out.println(walkerPDG_ret.g_out);
            Thread tME = new MyThread(walkerME, 8);
            tME.start();
            System.out.println("Começou ME");

            //// esperar que terminem as threads
            tCFG.join();
            tPDG.join();
            tSSA.join();
            tSDG.join();
            tMSP.join();
            tMSP2.join();
            tMSP2L.join();
            tME.join();
            System.out.println("Terminou tudo!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
