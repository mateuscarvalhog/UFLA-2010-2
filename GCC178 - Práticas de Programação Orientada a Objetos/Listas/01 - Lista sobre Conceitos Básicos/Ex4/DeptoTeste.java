import java.util.Scanner;

public class DeptoTeste {
    public static void main(String[] args) {
        Scanner scInt = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);
        String nome = scString.nextLine();
        int numDoc = scInt.nextInt();
        Depto meuDepto = new Depto(nome, numDoc);
        //sc.nextLine();
        for(int i = 0; i < numDoc; i++) {
            meuDepto.cadastrarDocente(scString.nextLine());
        }
        meuDepto.setNumeroCursos(scInt.nextInt());
        meuDepto.setNumeroAlunos(scInt.nextInt());
        meuDepto.mostrarDetalhes();

        System.out.print("\n##############################\n\n");

        nome = scString.nextLine();
        numDoc = scInt.nextInt();
        int numCursos = scInt.nextInt();
        int numAlunos = scInt.nextInt();
        Depto umDepto = new Depto(nome, numCursos, numAlunos, numDoc);
        for(int i = 0; i < numDoc; i++) {
            umDepto.cadastrarDocente(scString.nextLine());
        }
        umDepto.mostrarDetalhes();
    }
}
