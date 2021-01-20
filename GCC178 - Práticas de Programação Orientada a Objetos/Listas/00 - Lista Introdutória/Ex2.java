import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.ENGLISH);
        double juros = entrada.nextDouble() / 100;
        int meses = entrada.nextInt();

        double total = 0;

        for(int i = 0; i < meses; i++) {
            double qtd = entrada.nextDouble();
            total = (total + qtd) + ((total + qtd) * juros);
        }
        entrada.close();
        System.out.println(total);
    }
}
