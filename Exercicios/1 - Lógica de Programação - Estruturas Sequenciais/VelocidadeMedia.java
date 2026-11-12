import java.util.Scanner;

public class VelocidadeMedia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a distância ");
        double distancia = Double.parseDouble(sc.nextLine());

        System.out.println("Entre com o tempo ");
        double tempo = Double.parseDouble(sc.nextLine());

        double velocidadeMedia = distancia / tempo;

        System.out.printf("Sua velocidade média foi de %.2f Km/h\n", velocidadeMedia);

        sc.close();


    }
}
