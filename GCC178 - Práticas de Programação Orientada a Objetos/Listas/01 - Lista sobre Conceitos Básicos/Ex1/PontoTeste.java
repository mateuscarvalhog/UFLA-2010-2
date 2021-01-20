import java.util.Scanner;
import java.util.Locale;

public class PontoTeste {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.ENGLISH);
        double x = entrada.nextDouble();
        double y = entrada.nextDouble();
        Ponto meuPonto = new Ponto(x, y);

        System.out.printf("%s", meuPonto.getPonto());

        x = entrada.nextDouble();
        y = entrada.nextDouble();
        Ponto outroPonto = new Ponto(x, y);

        double distancia = meuPonto.calcularDistancia(outroPonto);
        System.out.println("A distância entre os pontos é: " + distancia);
    }
}

