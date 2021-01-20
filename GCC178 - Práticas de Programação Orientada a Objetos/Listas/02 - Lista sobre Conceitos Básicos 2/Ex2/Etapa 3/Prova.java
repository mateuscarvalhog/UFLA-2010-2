import java.util.Scanner;

public class Prova {
    private Questao[] mQuestao;

    public Prova() {
        mQuestao = new Questao[5];
        for(int i = 0; i < 5; i++) {
            mQuestao[i] = new Questao();
        }
    }

    public void aplicar() {
        for(int i = 0; i < 5; i++) {
            System.out.printf("Questao %d:\n", mQuestao[i].getId());
            System.out.println(mQuestao[i].getmEnunciado());
            Scanner entrada = new Scanner(System.in);
            int resposta = entrada.nextInt();
            int cont = 0;
            boolean acertou = false;

            if (mQuestao[i].correcao(resposta)) {
                cont++;
                System.out.println("Muito bem, você acertou!");
                acertou = true;
            } else {
                cont++;
                System.out.println("Infelizmente você errou!");
                System.out.print("Você ganhou mais uma chance! Digite outra resposta para a questão: ");
                resposta = entrada.nextInt();
                if (mQuestao[i].correcao(resposta)) {
                    cont++;
                    System.out.println("Muito bem, você acertou!");
                    acertou = true;
                } else {
                    cont++;
                    System.out.println("Infelizmente você errou!");
                }
            }
            if (acertou) {
                System.out.printf("Você tentou %d vez(es) e acertou a questão.", cont);
            } else {
                System.out.printf("Você tentou %d vez(es) e errou a questão.", cont);
            }
        }
    }
}
