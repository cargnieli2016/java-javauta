import java.util.Scanner;

public class AprovadoOuReprovado {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a média: ");
        double media = Double.parseDouble(input.nextLine());

        if (media > 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }

        input.close();
    }
}
