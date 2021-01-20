public class FuncionarioHorista extends Funcionario {
    private double mSalarioHora;
    private double mHorasTrabalhadas;

    public FuncionarioHorista(String mNome, String mCPF, double mSalarioHora, double mHorasTrabalhadas) {
        super(mNome, mCPF);
        this.mSalarioHora = mSalarioHora;
        this.mHorasTrabalhadas = mHorasTrabalhadas;
    }

    public double getmSalarioHora() {
        return mSalarioHora;
    }

    public double getmHorasTrabalhadas() {
        return mHorasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return getmSalarioHora() * getmHorasTrabalhadas();
    }

    @Override
    public String toString() {
        return "\nNome: " + getmNome() + "\nCPF: " + getmCPF() + "\nSalário: "
                + calcularSalario();
    }
}
