import java.util.Scanner;

public class NotaConceito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma nota de 0 a 10");
        double nota = Double.parseDouble(input.nextLine());

        if (nota >= 9) {
            System.out.println("Nota A");
        } else if (nota >= 7) {
            System.out.println("Nota B");
        } else if (nota >= 5) {
            System.out.println("Nota C");
        } else {
            System.out.println("Nota D");
        }

        input.close();

    }
}
