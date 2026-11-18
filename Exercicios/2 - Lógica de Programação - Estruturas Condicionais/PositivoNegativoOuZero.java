import java.util.Scanner;

public class PositivoNegativoOuZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int n = Integer.parseInt(input.nextLine());

        if (n > 0) {
            System.out.println("O número digitado é Positivo");
        } else if (n < 0) {
            System.out.println("O número digitado é negativo");
        } else {
            System.out.println("O número digitado é zero");
        }

        input.close();
    }
}
