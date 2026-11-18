import java.util.Scanner;

public class MaiorDeTresNumeros {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int a = Integer.parseInt(input.nextLine());

        System.out.print("Digite outro numero: ");
        int b = Integer.parseInt(input.nextLine());

        System.out.print("Digite outro numero: ");
        int c = Integer.parseInt(input.nextLine());

        int maior = a;

        if (b > maior) {
            maior = b;
        }

        if (c > maior) {
            maior = c;
        }

        System.out.printf("Maior número: %d\n", maior);

        input.close();
    }
}
