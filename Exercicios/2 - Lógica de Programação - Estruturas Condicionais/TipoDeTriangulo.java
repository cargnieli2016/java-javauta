import java.util.Scanner;

public class TipoDeTriangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro valor do triangulo: ");
        double a = input.nextDouble();

        System.out.println("Digite o segundo valor do triangulo: ");
        double b = input.nextDouble();

        System.out.println("Digite o terceiro valor do triangulo: ");
        double c = input.nextDouble();

        if ((a + b <= c || a + c <= b || b + c <= a)) {
            System.out.println("As medidas passada NÃO FORMAM um triângulo");
        } else if ((a == b) && (b == c)) {
            System.out.println("Equilátero");
        } else if ((a == b) || (a == c) || (b == c)) {
            System.out.println("Isósceles");
        } else {
            System.out.println("Escaleno");
        }
        input.close();
    }
}
