import java.util.Scanner;

public class Prova {
    private Questao[] mQuestao;
    private Correcao[] mCorrecao;

    public Prova() {
        mQuestao = new Questao[5];
        for(int i = 0; i < 5; i++) {
            mQuestao[i] = new Questao();
        }
        mCorrecao = new Correcao[5];
    }

    public void aplicar() {
        for(int i = 0; i < 5; i++) {
            System.out.printf("Questao %d:\n", mQuestao[i].getId());
            System.out.println(mQuestao[i].getmEnunciado());
            Scanner entrada = new Scanner(System.in);
            int resposta = entrada.nextInt();
            int cont = 0;
            String situacao = "errou";

            if (mQuestao[i].correcao(resposta)) {
                cont++;
                System.out.println("Muito bem, você acertou!");
                situacao = "acertou";
            } else {
                cont++;
                System.out.println("Infelizmente você errou!");
                System.out.print("Você ganhou mais uma chance! Digite outra resposta para a questão: ");
                resposta = entrada.nextInt();
                if (mQuestao[i].correcao(resposta)) {
                    cont++;
                    System.out.println("Muito bem, você acertou!");
                    situacao = "acertou";
                } else {
                    cont++;
                    System.out.println("Infelizmente você errou!");
                }
            }
            if (situacao == "acertou") {
                System.out.printf("Você tentou %d vez(es) e acertou a questão.\n", cont);
            } else {
                System.out.printf("Você tentou %d vez(es) e errou a questão.\n", cont);
            }
            mCorrecao[i] = new Correcao(mQuestao[i].getId(), situacao, cont);
        }
    }

    public void gerarRelatorio() {
        System.out.println("Questão\t\tSituação\tNúmero de Tentativas");
        for(Correcao a : mCorrecao) {
            System.out.println("\t" + a.getNumQuestao() + "\t\t" + a.getSituacao() + "\t\t" + a.getTentativa());
        }
    }
}