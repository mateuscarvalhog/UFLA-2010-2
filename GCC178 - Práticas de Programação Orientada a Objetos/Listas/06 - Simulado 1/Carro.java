public class Carro extends Veiculo {
    private int mCapacidadePortaMalas;
    private int mNumeroPortas;

    public Carro(String marca, int ano, String cor, int capacidadePortaMalas, int numeroPortas) {
        super(marca, ano, cor);
        mCapacidadePortaMalas = capacidadePortaMalas;
        mNumeroPortas = numeroPortas;
    }

    public int getmCapacidadePortaMalas() {
        return mCapacidadePortaMalas;
    }

    public int getmNumeroPortas() {
        return mNumeroPortas;
    }

    @Override
    public String toString() {
        return  "\nMarca: " + getmMarca() + "\nAno: " + getmAno() +
                "\nCor: " + getmCor() + "\nCapacidade do porta malas: " +
                mCapacidadePortaMalas + "\nNúmero de portas: " + mNumeroPortas;
    }
}
