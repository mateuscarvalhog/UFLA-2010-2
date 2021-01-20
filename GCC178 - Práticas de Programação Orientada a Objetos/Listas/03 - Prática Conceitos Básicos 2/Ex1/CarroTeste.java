import java.util.Scanner;

public class CarroTeste {
    public static void main(String[] args) {
        int[] precoAcessorio = {1500, 850, 200};
        Scanner scString = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o modelo do carro (Up/Voyage/Virtus): ");
        String modelo = scString.next();
        Carro meuCarro = new Carro(modelo);
        System.out.printf("Entre com a quantidade de acessórios desejados: ");
        int qtd = sc.nextInt();
        for(int i = 0; i < qtd; i++) {
            System.out.printf("Insira o código do %dº acessório desejado (0: banco de couro, 1: som, 2: insulfilm): ", (i +1));
            meuCarro.setAcessorio(sc.nextInt());
        }

        int total = 0;
        for(int i = 0; i < meuCarro.getQtd(); i++) {
            total += precoAcessorio[meuCarro.getCodigo(i)];
        }

        System.out.println("############### NOTA FISCAL ###############");
        System.out.printf("Carro: %s\n", meuCarro.getModelo());
        System.out.printf("Preço dos Acessórios = %d,00", total);
    }
}
