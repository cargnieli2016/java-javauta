import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int anos = Integer.parseInt(sc.nextLine());

        int dias = anos * 365;

        System.out.println("Você viveu aproximadamente " + dias + " dias");

        sc.close();
    }
}
