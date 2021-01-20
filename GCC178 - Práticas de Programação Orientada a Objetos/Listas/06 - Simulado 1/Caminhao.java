public class Caminhao extends Veiculo {
    private int mNumeroEixos;
    private int mCapacidadeCarga;

    public Caminhao(String marca, int ano, String cor, int numeroEixos, int capacidadeCarga) {
        super(marca, ano, cor);
        mNumeroEixos = numeroEixos;
        mCapacidadeCarga = capacidadeCarga;
    }

    public int getmNumeroEixos() {
        return mNumeroEixos;
    }

    public int getmCapacidadeCarga() {
        return mCapacidadeCarga;
    }

    @Override
    public String toString() {
        return  "\nMarca: " + getmMarca() + "\nAno: " + getmAno() +
                "\nCor: " + getmCor() + "\nNúmero de Eixos: " + mNumeroEixos +
                "\nCapacidade de carga: " + mCapacidadeCarga;
    }
}
