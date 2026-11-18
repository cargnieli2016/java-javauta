import java.util.Scanner;

public class VerificarTriangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro valor do triangulo: ");
        double a = input.nextDouble();

        System.out.print("Digite o segundo valor do triangulo: ");
        double b = input.nextDouble();

        System.out.print("Digite o terceiro valor do triangulo: ");
        double c = input.nextDouble();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("O valor digitado forma um triângulo!");
        } else {
            System.out.println("O valor digitado NÃO forma um triÂngulo!");
        }

        input.close();
    }
}
