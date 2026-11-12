public class EstruturaIfElse {
    public static void main(String[] args) {

        int idade = 13;
        if (idade >= 18) {
            System.out.println("Maior de idade!");
        } else {
            System.out.println("Menor de idade!");
        }

        boolean estaChovendo = true;

        if (!estaChovendo) {
            System.out.println("Vamos sair para passear");
        } else {
            System.out.println("Vamos ficar em casa");
        }

        boolean temDinheiro = true;
        boolean temCartao = false;

        String mensagem = (temDinheiro) ? "Pede um Ifood" : "Come o que tem em casa";
        System.out.println(mensagem);

        if (temDinheiro && temCartao) {
            System.out.println("Pede um Ifood e um Zé delivery");
        } else if (temDinheiro || temCartao) {
            System.out.println("Pede um Ifood");
        } else {
            System.out.println("Nada pede nada!");
        }

    }
}
