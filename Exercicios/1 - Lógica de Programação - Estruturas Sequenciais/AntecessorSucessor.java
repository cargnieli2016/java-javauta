import java.util.Scanner;

public class AntecessorSucessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        int valor = Integer.parseInt(sc.nextLine());

        System.out.println("O antecessor do " + valor + " é " + (valor - 1) + " e o sucessor do " + valor + " é " + (valor + 1));

        sc.close();
    }
}
