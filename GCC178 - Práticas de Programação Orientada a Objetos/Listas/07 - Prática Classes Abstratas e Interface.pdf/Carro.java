public class Carro extends Veiculo implements Tributavel{
    private String mCategoria;

    public Carro(String mMarca, String mModelo, int mAnoFabricacao, String mCategoria) {
        super(mMarca, mModelo, mAnoFabricacao);
        this.mCategoria = mCategoria;
    }

    public String getmCategoria() {
        return mCategoria;
    }

    @Override
    public String toString() {
        return "Marca " + getmMarca() + "\nModelo: " + getmModelo() + "\nAno de Fabricação: "
                + getmAnoFabricacao() + "\nCategoria: " + getmCategoria() + "\nIPVA: " + calcularIPVA();
    }

    @Override
    public double calcularIPVA() {
        if(getmCategoria() == "passeio")
            return 1500 / (2019 - getmAnoFabricacao());
        else if(getmCategoria() == "passeio")
            return 1000 / (2019 - getmAnoFabricacao());
        return 0.0;
    }
}
