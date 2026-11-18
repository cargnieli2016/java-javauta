import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero para saber se é Par ou Impar: ");
        int n = Integer.parseInt(sc.nextLine());

        if (n % 2 == 0) {
            System.out.println("O número digitado é PAR");
        } else {
            System.out.println("O número digitado é IMPAR");

            sc.close();
        }
    }
}
