
import java.util.Map;
import java.util.TreeMap;

public class Metrica {

    // linha => funcao
    private TreeMap<Integer, FuncaoInfo> funcoes;

    public Metrica() {
        this.funcoes = new TreeMap<Integer, FuncaoInfo>();
    }

    public TreeMap<Integer, FuncaoInfo> getFuncoes() {
        return funcoes;
    }

    public void putFuncao(FuncaoInfo funcao) {
        this.funcoes.put(funcao.getLinha(), funcao);
    }

    @Override
    public String toString() {
        String s = "\n";
        int totalFuncoes = funcoes.size();
        int totalParametros = 0;
        int totalDeclaracoes = 0;
        int totalInstrucoes = 0;
        int totalInvocacoes = 0;
        
        s += "Numero de funcoes: " + totalFuncoes + "\n";
        
        for (Map.Entry<Integer, FuncaoInfo> entry : funcoes.entrySet()) {
            FuncaoInfo f = entry.getValue();
            /*
            s+= "*********************************\n";
            s += "FUNCAO: " + f.getNome() + "\n";
            s += "Linha: " + f.getLinha() + "\n";
            s += "Numero parametros: " + f.getParametros() + "\n";
            s += "Numero declaracoes: " + f.getDeclaracoes() + "\n";
            s += "Numero instrucoes: " + f.getInstrucoes() + "\n";
            s += "Numero invocacoes: " + f.getInvocacoes().size() + "\n";
            s +="\n";
            */
            
            totalParametros += f.getParametros();
            totalDeclaracoes += f.getDeclaracoes();
            totalInstrucoes += f.getInstrucoes();
            totalInvocacoes += f.getInvocacoes().size();
        }
        
        s += "*********************************\n";
        s += "Numero médio de parametros: " + (totalParametros/totalFuncoes) + "\n";
        s += "Numero médio de declaracoes: " + (totalDeclaracoes/totalFuncoes) + "\n";
        s += "Numero médio de instrucoes: " + (totalInstrucoes/totalFuncoes) + "\n";
        s += "Numero médio de invocacoes: " + (totalInvocacoes/totalFuncoes) + "\n";
        
        
        return s;
    }
}
