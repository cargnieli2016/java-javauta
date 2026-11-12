import java.util.Scanner;

public class EntradaSaidaDeDados {
    public static void main(String[] args) {
//        System.out.println("Sou o println, eu faço a impressão e pulo a linha");
//        System.out.print("Sou print, eu faço a impressão na mesma linha ");
//        System.out.printf("Eu sou o printf, eu faço a impressão formatada!");


        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Nome: " + nome);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Idade: " + idade);

        System.out.println("Digite se você está empregado, Sim(true) ou Não(false)");
        boolean empregado = scanner.nextBoolean();

        System.out.println("Olá, sou " + nome + "," + " tenho " + idade + " anos " + " e " + " estou empregado " + empregado + "!");


    }
}
