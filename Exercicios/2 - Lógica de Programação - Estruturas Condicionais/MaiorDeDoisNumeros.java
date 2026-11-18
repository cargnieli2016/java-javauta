import java.util.Scanner;

public class MaiorDeDoisNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int a = Integer.parseInt(sc.nextLine());

        System.out.print("Digite outro numero: ");
        int b = Integer.parseInt(sc.nextLine());

        if (a > b) {
            System.out.println("O número maior é A=> " + a);
        } else if (b > a) {
            System.out.println("O número maior é B=> " + b);
        } else {
            System.out.println("< O dois número são iguais >");

            sc.close();
        }
    }
}
