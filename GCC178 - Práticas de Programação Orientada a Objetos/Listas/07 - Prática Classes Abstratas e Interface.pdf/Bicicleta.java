public class Bicicleta extends Veiculo{
    private int mNumMarchas;

    public Bicicleta(String mMarca, String mModelo, int mAnoFabricacao, int mNumMarchas) {
        super(mMarca, mModelo, mAnoFabricacao);
        this.mNumMarchas = mNumMarchas;
    }

    public int getmNumMarchas() {
        return mNumMarchas;
    }

    @Override
    public String toString() {
        return "Marca " + getmMarca() + "\nModelo: " + getmModelo() + "\nAno de Fabricação: "
                + getmAnoFabricacao() + "\nMarchas: " + getmNumMarchas();
    }
}
