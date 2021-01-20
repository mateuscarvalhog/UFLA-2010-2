import java.util.Scanner;

public class AlunoTeste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = entrada.nextLine();

        System.out.print("Insira a categoria do aluno (bolsista/não bolsista): ");
        String categoria = entrada.next();

        System.out.print("Entre com a quantidade de disciplinas cursadas: ");
        int qtd = entrada.nextInt();

        Aluno meuAluno = new Aluno(nome, categoria, qtd);

        for (int i = 0; i < qtd; i++) {
            System.out.print("Insira a nota na disciplina " + (i + 1) + ": ");
            int nota = entrada.nextInt();
            meuAluno.inserirNota(nota);
        }

        System.out.println("############# RELATÓRIO FINAL #############");
        System.out.printf("Coeficiente de Rendimento: %.2f\n", meuAluno.cr());
        System.out.printf("Situação final: %s\n", meuAluno.situacao());
    }
}
