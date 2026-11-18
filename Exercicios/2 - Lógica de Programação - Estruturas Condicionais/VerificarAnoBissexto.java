import java.util.Scanner;

public class VerificarAnoBissexto {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o ano: ");

        int ano = Integer.parseInt(input.nextLine());

        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

        if (bissexto) {
            System.out.println("O ano " + ano + "  é bissexto!");
        } else {
            System.out.println("O ano " + ano + " não é bissexto!");
        }

        input.close();
    }
}
