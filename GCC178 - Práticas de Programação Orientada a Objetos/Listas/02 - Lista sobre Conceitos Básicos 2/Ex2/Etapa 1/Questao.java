import java.util.Random;

public class Questao {
    private String mEnunciado;
    private int mGabarito;
    private int num1;
    private int num2;

    public Questao() {
        Random gerador = new Random();
        num1 = gerador.nextInt(10);
        num2 = gerador.nextInt(10);
        mEnunciado = "Quanto é " + num1 + " * " + num2 + "?";
        mGabarito = num1 * num2;
    }

    public String getmEnunciado() {
        return mEnunciado;
    }

    public boolean correcao(int resposta) {
        return mGabarito == resposta;
    }
}
