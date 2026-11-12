import java.util.Scanner;

public class SwithCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o dia da semana: ");
        System.out.println("1 para domingo | 2 para segunda | 3 para terça | 4 para quarta | 5 para quinta | 6 para sexta | 7 para sábado");

        int diaDaSemana = Integer.parseInt(input.nextLine());

        switch (diaDaSemana) {
            case 1:
                System.out.println("Hoje é domingo!");
                break;
            case 2:
                System.out.println("Hoje é segunda-feira!");
                break;
            case 3:
                System.out.println("Hoje é terça-feira!");
                break;
            case 4:
                System.out.println("Hoje é quarta-feira!");
                break;
            case 5:
                System.out.println("Hoje é quinta-feira!");
                break;
            case 6:
                System.out.println("Hoje é sexta-feira!");
                break;
            case 7:
                System.out.println("Hoje é sábado!");
                break;

            default:
                System.out.println("Entrada inválida, tente novamente!");
        }
    }
}
