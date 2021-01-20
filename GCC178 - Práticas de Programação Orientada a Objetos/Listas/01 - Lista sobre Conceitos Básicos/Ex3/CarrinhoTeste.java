import java.util.Scanner;
import java.lang.String;

public class CarrinhoTeste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cliente = entrada.next();
        int dia = entrada.nextInt();
        int mes = entrada.nextInt();
        int ano = entrada.nextInt();
        Carrinho car = new Carrinho(cliente, dia, mes, ano);
        for(int i = 0; i < 5; i++) {
            car.inserirItem(entrada.next());
        }
        car.exibir();

        cliente = entrada.next();
        dia = entrada.nextInt();
        mes = entrada.nextInt();
        ano = entrada.nextInt();
        int qtd = entrada.nextInt();
        Carrinho car2 = new Carrinho(cliente, dia, mes, ano, qtd);
        for(int i = 0; i < qtd; i++) {
            car2.inserirItem(entrada.next());
        }
        car2.exibir();
    }
}
