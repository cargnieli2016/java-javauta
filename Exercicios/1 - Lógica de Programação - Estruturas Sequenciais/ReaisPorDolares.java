import java.util.Scanner;

public class ReaisPorDolares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor em R$ ");
        double reais = Double.parseDouble(sc.nextLine());

        System.out.println("Digite o valor da cotação do dolar do dia ");
        double cot = Double.parseDouble(sc.nextLine());

        double dolares = reais / cot;

        System.out.printf("%.2f dolares\n", dolares);

        sc.close();


    }
}
