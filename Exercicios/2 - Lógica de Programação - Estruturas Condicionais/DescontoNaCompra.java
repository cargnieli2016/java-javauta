import java.util.Scanner;

public class DescontoNaCompra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = Double.parseDouble(input.nextLine());

        double novo;

        if (valorCompra > 100.00) {
            novo = valorCompra * 0.90;
        } else if (valorCompra >= 50.00) {
            novo = valorCompra * 0.95;
        } else {
            novo = valorCompra;
        }

        System.out.printf("Novo valor: %.2f\n", novo);

        input.close();

    }
}
