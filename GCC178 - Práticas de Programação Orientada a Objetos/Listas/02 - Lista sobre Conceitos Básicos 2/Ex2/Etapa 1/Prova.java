import java.util.Scanner;

public class Prova {
    private Questao mQuestao;

    public Prova() {
        mQuestao = new Questao();
    }

    public void aplicar() {
        System.out.println(mQuestao.getmEnunciado());
        Scanner entrada = new Scanner(System.in);
        int resposta = entrada.nextInt();

        if(mQuestao.correcao(resposta)) {
            System.out.println("Muito bem, você acertou!");
        } else {
            System.out.println("Infelizmente você errou!");
        }
    }
}
