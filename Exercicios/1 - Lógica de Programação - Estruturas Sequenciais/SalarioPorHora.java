import java.util.Scanner;

public class SalarioPorHora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da sua hora de trabalho: ");
        double valorHora = Double.parseDouble(sc.nextLine());

        System.out.println("Digite quantas horas você trabalhou: ");
        int horas = Integer.parseInt(sc.nextLine());

        double salario = valorHora * horas;

        System.out.printf("O seu salário é R$ %.2f\n", salario);

        sc.close();

    }
}
