import java.util.Scanner;

public class KmPorLitro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a distância em km ");
        double km = Double.parseDouble(sc.nextLine());

        System.out.println("Agora entre com a quantidade de litros de combustivel ");
        double litros = Double.parseDouble(sc.nextLine());

        double consumo = km / litros;

        System.out.printf("%.2f km/l\n", consumo);

        sc.close();
    }
}
