import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int n1 = Integer.parseInt(sc.nextLine());

        System.out.println("Digite outro numero inteiro: ");
        int n2 = Integer.parseInt(sc.nextLine());

        int soma = n1 + n2;

        System.out.println("A soma de " + n1 + " + " + n2 + " dá " + soma + "!");

        sc.close();

    }
}
