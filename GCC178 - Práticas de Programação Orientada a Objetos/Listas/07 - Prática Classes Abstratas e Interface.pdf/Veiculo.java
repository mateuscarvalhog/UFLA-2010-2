public class Veiculo {
    private String mMarca;
    private String mModelo;
    private int mAnoFabricacao;

    public Veiculo(String mMarca, String mModelo, int mAnoFabricacao) {
        this.mMarca = mMarca;
        this.mModelo = mModelo;
        this.mAnoFabricacao = mAnoFabricacao;
    }

    public String getmMarca() {
        return mMarca;
    }

    public String getmModelo() {
        return mModelo;
    }

    public int getmAnoFabricacao() {
        return mAnoFabricacao;
    }
}
