public class Funcionario implements Comparable<Funcionario> {
    private String mNome;
    private String mCPF;

    public Funcionario(String mNome, String mCPF) {
        this.mNome = mNome;
        this.mCPF = mCPF;
    }

    public String getmNome() {
        return mNome;
    }

    public String getmCPF() {
        return mCPF;
    }


    @Override
    public int compareTo(Funcionario f){
        if(this.calcularSalario() > f.calcularSalario()){
            return 1;
        }else if(this.calcularSalario() < f.calcularSalario()){
            return -1;
        }else{
            return 0;
        }
    }

    public double calcularSalario() {
        return 0.0;
    };
}
