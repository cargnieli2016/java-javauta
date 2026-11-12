import java.util.Scanner;

public class ValorComDesconto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o valor ");
        double valor = Double.parseDouble(sc.nextLine());

        System.out.println("Agora entre com o percentual de desconto");
        double percentual = Double.parseDouble(sc.nextLine());

        double valorFinal = valor - (valor * percentual / 100.0);

        System.out.printf("O valor final com desconto é %.2f\n", valorFinal);

        sc.close();

    }
}
