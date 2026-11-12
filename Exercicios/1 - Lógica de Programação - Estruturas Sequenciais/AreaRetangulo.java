import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a base do retângulo: ");
        double base = Double.parseDouble(sc.nextLine());

        System.out.println("Agora informe a altura ");
        double altura = Double.parseDouble(sc.nextLine());

        double area = base * altura;

        System.out.printf("A área do retângulo é %.2f\n", area);

        sc.close();

    }
}
