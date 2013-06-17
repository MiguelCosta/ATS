
import java.util.TreeMap;

public class FuncaoInfo {

    private int _linha = -1;
    private String _nome = "";
    private int _parametros = 0;
    private int _declaracoes = 0;
    private int _instrucoes = 0;
    // nome_invocacao => numero vezes que ocorre
    private TreeMap<String, Integer> _invocacoes = new TreeMap<String, Integer>();

    public FuncaoInfo() {
    }

    public int getLinha() {
        return _linha;
    }

    public void setLinha(int linha) {
        _linha = linha;
    }

    public String getNome() {
        return _nome;
    }

    public void setNome(String nome) {
        _nome = nome;
    }

    public int getParametros() {
        return _parametros;
    }

    public void setParametros(int parametros) {
        _parametros = parametros;
    }

    public void incParametros() {
        _parametros++;
    }

    public int getDeclaracoes() {
        return _declaracoes;
    }

    public void setDeclaracoes(int declaracoes) {
        _declaracoes = declaracoes;
    }

    public void incDeclaracoes() {
        _declaracoes++;
    }

    public int getInstrucoes() {
        return _instrucoes;
    }

    public void setInstrucoes(int instrucoes) {
        _instrucoes = instrucoes;
    }

    public void incInstrucoes() {
        _instrucoes++;
    }

    public TreeMap<String, Integer> getInvocacoes() {
        return _invocacoes;
    }

    public void putInvocacoes(int linha, String nome) {
        if (_invocacoes.containsKey(nome)) {
            _invocacoes.put(nome, _invocacoes.get(nome) + 1);
        } else {
            _invocacoes.put(nome, 1);
        }
    }

    @Override
    public String toString() {
        return "toString FuncaoInfo";
    }
}
