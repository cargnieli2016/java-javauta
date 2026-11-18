import java.util.Scanner;

public class VerificarNumeroPositivo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero = Double.parseDouble(input.nextLine());

        if (numero > 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("Não é positivo");
        }
        input.close();
    }
}
