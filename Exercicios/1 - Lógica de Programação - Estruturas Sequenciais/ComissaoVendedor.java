import java.util.Scanner;

public class ComissaoVendedor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu salário fixo ");
        double salarioFixo = Double.parseDouble(sc.nextLine());

        System.out.println("Digite o valor da sua venda mensal ");
        double vendaMensal = Double.parseDouble(sc.nextLine());

        double comissao = vendaMensal * 0.10;

        double finalSal = salarioFixo + comissao;

        System.out.printf("Seu salário final é de R$ %.2f\n", finalSal);

        sc.close();

    }
}
