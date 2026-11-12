import java.util.Scanner;

public class TrocaValores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o primeiro valor ");
        int a = Integer.parseInt(sc.nextLine());

        System.out.println("Entre com o segundo valor ");
        int b = Integer.parseInt(sc.nextLine());

        int temp = a;

        a = b;
        b = temp;

        System.out.println("O valor trocado é " + a + " " + b);
        sc.close();




    }
}
