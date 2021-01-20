import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int genero = entrada.nextInt();
        int idade = entrada.nextInt();
        float tempo = entrada.nextInt();
        entrada.close();
        double resultado;

        if (genero == 0) {
            if (tempo < 15) {
                System.out.println(62);
            } else {
                resultado = idade + (30 - tempo) + ((30 - tempo) * 0.3);
                System.out.println(resultado);
            }
        } else if (genero == 1) {
            if (tempo < 20) {
                System.out.println(65);
            } else {
                resultado = idade + (35 - tempo) + ((35 - tempo) * 0.3);
                System.out.println(resultado);
            }
        } else {
            System.out.println("Dados inseridos incorretamente!");
        }
    }
}