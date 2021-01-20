public class Caminhao extends Veiculo implements Tributavel {
    private int mNumEixos;

    public Caminhao(String mMarca, String mModelo, int mAnoFabricacao, int mNumEixos) {
        super(mMarca, mModelo, mAnoFabricacao);
        this.mNumEixos = mNumEixos;
    }

    public int getmNumEixos() {
        return mNumEixos;
    }

    @Override
    public String toString() {
        return "Marca " + getmMarca() + "\nModelo: " + getmModelo() + "\nAno de Fabricação: "
                + getmAnoFabricacao() + "\nNúmero de Eixos: " + getmNumEixos() + "\nIPVA: " + calcularIPVA();
    }

    @Override
    public double calcularIPVA() {
        return 200 * getmNumEixos() / (2019 - getmAnoFabricacao());
    }
}
