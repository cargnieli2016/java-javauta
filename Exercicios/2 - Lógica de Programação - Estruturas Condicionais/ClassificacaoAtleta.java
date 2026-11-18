import java.util.Scanner;

public class ClassificacaoAtleta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a idade do atleta: ");
        int idade = Integer.parseInt(input.nextLine());

        if (idade <= 13) {
            System.out.println("Infantil");
        } else if (idade <= 17) {
            System.out.println("Juvenil");
        } else if (idade <= 35) {
            System.out.println("Adulto");
        } else {
            System.out.println("MASTER");
        }
        input.close();
    }
}
