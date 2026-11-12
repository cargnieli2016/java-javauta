import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota1: ");
        double nota1 = Double.parseDouble(sc.nextLine());

        System.out.println("Digite a nota2: ");
        double nota2 = Double.parseDouble(sc.nextLine());

        System.out.println("Digite a nota3: ");
        double nota3 = Double.parseDouble(sc.nextLine());


        double media = (nota1 + nota2 + nota3) / 3.0;

        System.out.printf("MEDIA = %.2f%n", media);

        sc.close();
    }
}
