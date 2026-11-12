import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu peso em Kg ");
        double peso = Double.parseDouble(sc.nextLine());

        System.out.println("Digite sua altura ");
        double altura = Double.parseDouble(sc.nextLine());

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é %.2f\n", imc);

        sc.close();


    }
}
