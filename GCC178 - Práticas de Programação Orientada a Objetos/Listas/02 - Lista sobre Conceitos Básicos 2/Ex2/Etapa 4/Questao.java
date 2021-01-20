import java.util.Random;

public class Questao {
    private int mId;
    private String mEnunciado;
    private int mGabarito;
    private int num1;
    private int num2;
    private static int mUltimo = 0;

    public Questao() {
        Random gerador = new Random();
        num1 = gerador.nextInt(10);
        num2 = gerador.nextInt(10);
        mEnunciado = "Quanto é " + num1 + " * " + num2 + "?";
        mGabarito = num1 * num2;
        mUltimo++;
        mId = mUltimo;

    }

    public int getId() { return mId; }

    public String getmEnunciado() {
        return mEnunciado;
    }

    public boolean correcao(int resposta) {
        return mGabarito == resposta;
    }
}
