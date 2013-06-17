
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.ArrayList;
import java.io.*;

public class MyThread extends Thread {

    private CmbTGCFG _walker;
    private CmbTGCFG.programa_return _walkerRet;
    private CmbTGPDG _walkerPDG;
    private CmbTGPDG.programa_return _walkerPDGRet;
    private CmbTGSSA _walkerSSA;
    private CmbTGSSA.programa_return _walkerSSARet;
    private CmbTGSDG _walkerSDG;
    private CmbTGSDG.programa_return _walkerSDGRet;
    private CmbTGMSP _walkerMSP;
    private CmbTGMSP.programa_return _walkerMSPRet;
    private CmbTGMSP2 _walkerMSP2;
    private CmbTGMSP2.programa_return _walkerMSP2Ret;
    private CmbTGMSP2L _walkerMSP2L;
    private CmbTGMSP2L.programa_return _walkerMSP2LRet;
    private CmbTGME _walkerME;
    private CmbTGME.programa_return _walkerMERet;
    /**
     * Tipos disponiveis para usar nas threads 1 - CmbTGCFG; 2 - CmbTGPDG; 3 -
     * CmbTGSSA; 4 - CmbTGSDG; 5 - CmbTGMSP; 6 - CmbTGMSP2; 7 - CmbTGMSP2L; 8 -
     * CmbTGME
     *
     */
    private int _tipo;

    public MyThread(Object walker, int tipo) {
        _tipo = tipo;

        switch (tipo) {
            case 1:
                _walker = (CmbTGCFG) walker;
                break;
            case 2:
                _walkerPDG = (CmbTGPDG) walker;
                break;
            case 3:
                _walkerSSA = (CmbTGSSA) walker;
                break;
            case 4:
                _walkerSDG = (CmbTGSDG) walker;
                break;
            case 5:
                _walkerMSP = (CmbTGMSP) walker;
                break;
            case 6:
                _walkerMSP2 = (CmbTGMSP2) walker;
                break;
            case 7:
                _walkerMSP2L = (CmbTGMSP2L) walker;
                break;
            case 8:
                _walkerME = (CmbTGME) walker;
                break;
        }
    }

    public void run() {
        try {

            switch (_tipo) {
                case 1:
                    _walkerRet = _walker.programa();
                    //System.out.println("CFG OUTPUT:\n" + _walkerRet.grafos_out);
                    toDotCFG(_walkerRet.grafos_out);
                    break;
                case 2:
                    _walkerPDGRet = _walkerPDG.programa();
                    //System.out.println("PDG OUTPUT:\n" + _walkerPDGRet.grafos_out);
                    toDotPDG(_walkerPDGRet.grafos_out);
                    break;
                case 3:
                    _walkerSSARet = _walkerSSA.programa();
                    // System.out.println(_walkerSSARet.g_out);
                    toDotSSA(_walkerSSARet.grafos_out);
                    break;
                case 4:
                    _walkerSDGRet = _walkerSDG.programa();
                    // System.out.println("SDG OUTPUT:\n" + _walkerSDGRet.grafos_out);
                    toDotSDG(_walkerSDGRet.grafos_out);
                    break;
                case 5:
                    _walkerMSPRet = _walkerMSP.programa();
                    //System.out.println("AQUI VAI SER O CODIGO MSP");
                    toMSP(_walkerMSPRet.msp_code, _walkerMSPRet.msp_lines);
                    break;
                case 6:
                    _walkerMSP2Ret = _walkerMSP2.programa();
                    //System.out.println("AQUI VAI SER O CODIGO MSP2");
                    toMSP2(_walkerMSP2Ret.msp_declaracoes, _walkerMSP2Ret.msp_instrucoes);
                    break;
                case 7:
                    _walkerMSP2LRet = _walkerMSP2L.programa();
                    //System.out.println("AQUI VAI SER O CODIGO MSP2L");
                    toMSP2L(_walkerMSP2LRet.msp_declaracoes, _walkerMSP2LRet.msp_instrucoes);
                    break;
                case 8:
                    _walkerMERet = _walkerME.programa();
                    System.out.println("AQUI VAI SER O CODIGO ME");
                    toME(_walkerMERet.metrica);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void toDotCFG(TreeMap<String, Grafo> in) {
        String s = "digraph mainmap {\ngraph [bgcolor=transparent];\n";

        for (String nomeFunc : in.keySet()) {
            // grafo
            Grafo f = in.get(nomeFunc);

            // vai buscar os caminhos
            TreeMap<Integer, TreeSet<ParNrInstrucaoLabel>> cam = f
                    .getCaminhos();
            TreeMap<Integer, Instrucao> nodos = f.getNodos();

            for (Integer o : cam.keySet()) {

                for (ParNrInstrucaoLabel nl : cam.get(o)) {
                    String nodo_Pai = "";
                    if (nodos.get(o).getInstrucaoDot().equals("START")) {
                        nodo_Pai = "ENTER (" + nomeFunc + ")";
                    } else {
                        nodo_Pai = nodos.get(o).getInstrucaoDot();
                    }

                    String nodo_Filho = "";
                    if (nodos.get(nl.getNr_instrucao()).getInstrucaoDot().equals("EXIT")) {
                        nodo_Filho = "EXIT (" + nomeFunc + ")";
                    } else {
                        nodo_Filho = nodos.get(nl.getNr_instrucao())
                                .getInstrucaoDot();
                    }

                    s += '"' + nodo_Pai + '"';
                    s += " -> ";
                    s += '"' + nodo_Filho + '"';

                    if (!nl.getLabel().equals("")) {
                        s += "[label=" + '"' + nl.getLabel() + '"' + "]";
                    }
                    s += ";\n\t";
                }
            }
        }

        s += "}";
        try {
            FileWriter fstream = new FileWriter("cfg.gv");
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(s);
            out.close();
        } catch (Exception e) {// Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }

    }

    public void toDotPDG(TreeMap<String, GrafoPDG> in) {
        String s = "digraph mainmapPDG {\ngraph [bgcolor=transparent];\n";

        for (String nomeFunc : in.keySet()) {
            // grafo
            GrafoPDG f = in.get(nomeFunc);

            // vai buscar os caminhos
            TreeMap<Integer, TreeSet<ParNrInstrucaoLabel>> cam = f
                    .getCaminhos();
            TreeMap<Integer, Instrucao> nodos = f.getNodos();

            for (Integer n : nodos.keySet()) {
                s += '"' + n.toString() + ":";
                s += nodos.get(n).getInstrucaoDot() + '"';
                s += "[label=" + '"' + n.toString() + ": "
                        + nodos.get(n).getInstrucaoDot() + '"' + "];\n";
            }

            s += "\n\n";

            for (Integer o : cam.keySet()) {

                for (ParNrInstrucaoLabel nl : cam.get(o)) {
                    s += '"' + o.toString() + ":"
                            + nodos.get(o).getInstrucaoDot() + '"';
                    s += " -> ";
                    Integer numero_instrucao = nl.getNr_instrucao();
                    s += '"' + numero_instrucao.toString() + ":"
                            + nodos.get(nl.getNr_instrucao()).getInstrucaoDot()
                            + '"';

                    if (!nl.getLabel().equals("")) {
                        s += "[label=" + '"' + nl.getLabel() + '"' + "]";
                    }
                    s += ";\n\t";
                }
            }

            s += "\n\n";

            // adicionar as dependencias entre os dados
            TreeMap<Integer, TreeSet<Integer>> dependencia_dados = f
                    .getDependencias_dados();
            for (Integer raiz : dependencia_dados.keySet()) {
                for (Integer cauda : dependencia_dados.get(raiz)) {
                    s += '"' + raiz.toString() + ":"
                            + nodos.get(raiz).getInstrucaoDot() + '"';
                    s += " -> ";
                    s += '"' + cauda.toString() + ":"
                            + nodos.get(cauda).getInstrucaoDot() + '"';
                    s += " [style=dotted]";
                    s += ";\n\t";
                }
            }

        }

        s += "}";
        try {
            FileWriter fstream = new FileWriter("pdg.gv");
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(s);
            out.close();
        } catch (Exception e) {// Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }

    }

    public void toDotSDG(TreeMap<String, GrafoSDG> in) {
        String s = "digraph mainmapSDG {\ngraph [bgcolor=transparent];\n";

        for (String nomeFunc : in.keySet()) {
            // grafo
            GrafoSDG f = in.get(nomeFunc);

            // System.out.println("out: ENTER (" + nomeFunc + ")");

            // vai buscar os caminhos
            TreeMap<Integer, TreeSet<ParNrInstrucaoLabel>> cam = f
                    .getCaminhos();
            TreeMap<Integer, Instrucao> nodos = f.getNodos();

            for (Integer n : nodos.keySet()) {

                if (nodos.get(n).getInstrucaoDot().contains("ENTER")) {
                    CabecalhoFuncao cf = f.getFuncoes().get(nomeFunc);
                    String parms = cf.getParametrosDot();
                    String retorna = cf.getTipoRetorno();

                    s += '"' + n.toString() + ":";
                    s += nodos.get(n).getInstrucaoDot() + '"';
                    s += "[shape=record, label=" + '"' + "{{" + retorna + "|"
                            + n.toString() + ": "
                            + nodos.get(n).getInstrucaoDot() + "|" + parms
                            + "}}" + '"' + "];\n";
                } else {
                    s += '"' + n.toString() + ":";
                    s += nodos.get(n).getInstrucaoDot() + '"';
                    s += "[label=" + '"' + n.toString() + ": "
                            + nodos.get(n).getInstrucaoDot() + '"' + "];\n";
                }

            }

            s += "\n\n";

            for (Integer o : cam.keySet()) {

                for (ParNrInstrucaoLabel nl : cam.get(o)) {
                    s += '"' + o.toString() + ":"
                            + nodos.get(o).getInstrucaoDot() + '"';
                    s += " -> ";
                    Integer numero_instrucao = nl.getNr_instrucao();
                    s += '"' + numero_instrucao.toString() + ":"
                            + nodos.get(nl.getNr_instrucao()).getInstrucaoDot()
                            + '"';

                    if (!nl.getLabel().equals("")) {
                        s += "[label=" + '"' + nl.getLabel() + '"' + "]";
                    }
                    s += ";\n\t";
                }
            }

            s += "\n\n";

            TreeMap<Integer, ChamadasFuncao> cfuncoes = f.getChamadasFuncao();
            for (Integer c_int : cfuncoes.keySet()) {

                s += '"' + c_int.toString() + ":"
                        + nodos.get(c_int).getInstrucaoDot() + '"';
                s += " -> ";
                s += '"' + "0:ENTER (" + cfuncoes.get(c_int).getNomeFuncao()
                        + ")" + '"' + " [style=dotted]";

                s += ";\n\t";

            }

        }

        s += "}";
        try {
            FileWriter fstream = new FileWriter("sdg.gv");
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(s);
            out.close();
        } catch (Exception e) {// Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }

    }

    public void toDotSSA(TreeMap<String, GrafoTGSSA> in) {
        String s = "digraph mainmapSSA {\ngraph [bgcolor=transparent];\n";

        for (String nomeFunc : in.keySet()) {
            // grafo
            Grafo f = in.get(nomeFunc);


            // graph [bgcolor=transparent];
            TreeMap<Integer, TreeSet<ParNrInstrucaoLabel>> cam = f.getCaminhos();
            TreeMap<Integer, Instrucao> nodos = f.getNodos();

            for (Integer n : nodos.keySet()) {
                s += '"' + nodos.get(n).getInstrucaoDot() + '"' + "[label=" + '"'
                        + nodos.get(n).getInstrucaoVersaoDot() + '"' + "];\n";
            }

            for (Integer o : cam.keySet()) {

                for (ParNrInstrucaoLabel nl : cam.get(o)) {

                    String nodo_Pai = "";
                    if (nodos.get(o).getInstrucaoDot().equals("START")) {
                        nodo_Pai = "ENTER (" + nomeFunc + ")";
                    } else {
                        nodo_Pai = nodos.get(o).getInstrucaoDot();
                    }

                    String nodo_Filho = "";
                    if (nodos.get(nl.getNr_instrucao()).getInstrucaoDot().equals("EXIT")) {
                        nodo_Filho = "EXIT (" + nomeFunc + ")";
                    } else {
                        nodo_Filho = nodos.get(nl.getNr_instrucao())
                                .getInstrucaoDot();
                    }

                    s += '"' + nodo_Pai + '"';
                    s += " -> ";
                    s += '"' + nodo_Filho + '"';

                    if (!nl.getLabel().equals("")) {
                        s += "[label=" + '"' + nl.getLabel() + '"' + "]";
                    }
                    s += ";\n\t";
                }

                /*
                 * for(Integer d : caminhos.get(o)){
                 * 
                 * s+= '"' + nodos.get(o).getInstrucaoDot() + '"' + " -> " + '"' +
                 * nodos.get(d).getInstrucaoDot() + '"' + ";\n"; }
                 */
            }
        }
        s += "}";
        try {
            FileWriter fstream = new FileWriter("ssa.gv");
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(s);
            out.close();
        } catch (Exception e) {// Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }

    }

    public void toMSP(ArrayList<String> in1, ArrayList<String> in2) {
        //System.out.println("Code: " + in1.size());
        String outS = "";
        String outS2 = "";

        for (String s : in1) {
            outS += s + "\n";
            //System.out.println(s);
        }

        //System.out.println("Lines: " + in2.size());

        for (String s2 : in1) {
            outS2 += s2 + "\n";
            //System.out.println(s2);
        }

        try {
            FileWriter fstream = new FileWriter("msp.txt");
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(outS);
            out.close();

            FileWriter fstream2 = new FileWriter("msp_lines.txt");
            BufferedWriter out2 = new BufferedWriter(fstream2);
            out2.write(outS2);
            out2.close();
        } catch (Exception e) {// Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }

    }

    public void toMSP2(ArrayList<String> declaracoes, ArrayList<String> instrucoes) {
        //System.out.println("Declaracoes: " + declaracoes.size());
        //System.out.println("Instrucoes: " + instrucoes.size());

        String outS = "Msp ";

        outS += "[" + combine(declaracoes.toArray(new String[]{}), ",\n ") + "]";
        outS += "[" + combine(instrucoes.toArray(new String[]{}), ",\n ") + "]";

        //System.out.println(outS);	

        try {
            FileWriter fstream = new FileWriter("msp2.txt");
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(outS);
            out.close();
        } catch (Exception e) {// Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }

    }

    public void toMSP2L(ArrayList<String> declaracoes, ArrayList<String> instrucoes) {
        //System.out.println("Declaracoes: " + declaracoes.size());
        //System.out.println("Instrucoes: " + instrucoes.size());

        String outS = "Msp ";

        outS += "[" + combine(declaracoes.toArray(new String[]{}), ",\n ") + "]";
        outS += "[" + combine(instrucoes.toArray(new String[]{}), ",\n ") + "]";

        //System.out.println(outS);

        try {
            FileWriter fstream = new FileWriter("msp2L.txt");
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(outS);
            out.close();
        } catch (Exception e) {// Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void toME(Metrica me) {
        String outS = me.toString();

        System.out.println(outS);

        try {
            FileWriter fstream = new FileWriter("metricas.txt");
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(outS);
            out.close();
        } catch (Exception e) {// Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }
    }

    String combine(String[] s, String glue) {
        int k = s.length;
        if (k == 0) {
            return null;
        }
        StringBuilder out = new StringBuilder();
        out.append(s[0]);
        for (int x = 1; x < k; ++x) {
            out.append(glue).append(s[x]);
        }
        return out.toString();
    }
}
