public abstract class Veiculo {
    private String mMarca;
    private int mAno;
    private String mCor;

    public Veiculo(String marca, int ano, String cor) {
        mMarca = marca;
        mAno = ano;
        mCor = cor;
    }

    public String getmMarca() {
        return mMarca;
    }

    public int getmAno() {
        return mAno;
    }

    public String getmCor() {
        return mCor;
    }
}
