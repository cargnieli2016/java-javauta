import java.util.Scanner;

public class CelsiusParaFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Didite a temperatura em Celsius: ");
        double celsius = Double.parseDouble(sc.nextLine());

        double fahreinheit = (celsius * 1.8) + 32;

        System.out.println("Temperatura em Celsius: " + fahreinheit);

        sc.close();
    }
}
