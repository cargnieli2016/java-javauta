import java.util.Scanner;

public class MetrosParaCentimentros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor em metros ");
        double metros = Double.parseDouble(sc.nextLine());

        double cm = metros * 100.0;

        System.out.printf("O valor convertido para cm dá %.2f\n", cm);

        sc.close();
    }
}
