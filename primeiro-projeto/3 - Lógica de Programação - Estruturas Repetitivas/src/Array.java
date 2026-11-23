public class Array {
    public static void main(String[] args) {

        // Declaração de Array
        int[] numeros = {10, 30, 50, 15, 1};
        String[] frutas;

        // Inicializar
        frutas = new String[]{"Maça, Banana, Laranja, Abacaxi"};

        double[] salarios = new double[5];
        salarios[0] = 1000.20;
        salarios[1] = 2200.50;
        salarios[2] = 1200.20;
        salarios[3] = 5500.00;
        salarios[4] = 7000.00;

        // Iteração
        for (int posicao = 0; posicao < salarios.length; posicao++) {
            System.out.println(salarios[posicao]);
        }

        // for each
        for (double salario : salarios) {
            System.out.println("For Each de salários: " + salario);
        }

        salarios[2] = 255.00;
        System.out.println("Agora o novo salário na posição 2 é: " + salarios[2]);

        for (int numero : numeros) {
            System.out.println("For Each de números: " + numero);
        }

        for (String fruta : frutas) {
            System.out.println("For Each de frutas: " + fruta);
        }

    }
}
