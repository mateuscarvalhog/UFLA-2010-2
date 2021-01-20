public class FuncionarioComissionado extends Funcionario {
    private int mTotalVendas;
    private double mTaxaComissao;

    public FuncionarioComissionado(String mNome, String mCPF, int mTotalVendas, double mTaxaComissao) {
        super(mNome, mCPF);
        this.mTotalVendas = mTotalVendas;
        this.mTaxaComissao = mTaxaComissao;
    }

    public int getmTotalVendas() {
        return mTotalVendas;
    }

    public double getmTaxaComissao() {
        return mTaxaComissao;
    }

    @Override
    public double calcularSalario() {
        return getmTotalVendas() * getmTaxaComissao();
    }

    @Override
    public String toString() {
        return "\nNome: " + getmNome() + "\nCPF: " + getmCPF() + "\nSalário: "
                + calcularSalario();
    }
}
