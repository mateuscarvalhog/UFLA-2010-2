import java.util.Scanner;

public class HorarioTeste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int hora = entrada.nextInt();
        int min = entrada.nextInt();
        int seg = entrada.nextInt();

        Horario meuHorario = new Horario(hora, min, seg);
        meuHorario.exibir();

        int num;
        for (int i = 0; i < 3; i++) {
            num = entrada.nextInt();
            meuHorario.formatarTempo(num);
        }
    }
}
