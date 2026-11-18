import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = input.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double valor2 = input.nextDouble();

        System.out.println("Agora entre com os operadoes + - * /");
        char operador = input.next().charAt(0);

        double resultado = 0;

        if (operador == '+') {
            resultado = valor1 + valor2;
        } else if (operador == '-') {
            resultado = valor1 - valor2;
        } else if (operador == '*') {
            resultado = valor1 * valor2;
        } else if (operador == '/') {
            resultado = resultado = valor2 != 0 ? valor1 / valor2 : Double.NaN;
        }

        System.out.println("Resultado: " + resultado);

        input.close();

    }
}
