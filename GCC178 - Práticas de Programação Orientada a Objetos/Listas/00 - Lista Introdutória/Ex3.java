import java.util.Scanner;
import java.util.Locale;

public class Ex3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.ENGLISH);

        int km = entrada.nextInt();

        String piloto1 = entrada.next();
        float[] tempos1 = new float[km];
        for(int i = 0; i < km; i++) {
            tempos1[i] = entrada.nextFloat();
        }

        String piloto2 = entrada.next();
        float[] tempos2 = new float[km];
        for(int i = 0; i < km; i++) {
            tempos2[i] = entrada.nextFloat();
        }

        float soma1 = 0, soma2 = 0;
        for(int i = 0; i < km; i++) {
            soma1 += tempos1[i];
            soma2 += tempos2[i];

            if(soma1 < soma2) {
                System.out.print(piloto1 + " ");
            } else {
                System.out.print(piloto2 + " ");
            }
            if(tempos1[i] < tempos2[i]) {
                System.out.println(piloto1);
            } else {
                System.out.println(piloto2);
            }
        }
    }
}
