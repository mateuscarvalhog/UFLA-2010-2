import java.util.*;
public class Empresa {
    private String mNome;
    private String mCNPJ;
    private ArrayList<Funcionario> funcionarios;

    public Empresa(String mNome, String mCNPJ) {
        this.mNome = mNome;
        this.mCNPJ = mCNPJ;
        funcionarios = new ArrayList<Funcionario>();
    }

    public void admitirFuncionario(Funcionario f) {
        funcionarios.add(f);
        Collections.sort(funcionarios);
    }

    public void gerarRelatorioDePrioridade() {
        for(Funcionario f: funcionarios) {
            System.out.println(f);
        }
    }
}