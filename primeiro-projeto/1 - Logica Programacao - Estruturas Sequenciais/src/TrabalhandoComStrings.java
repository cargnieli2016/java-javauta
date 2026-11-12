import java.util.Locale;

public class TrabalhandoComStrings {
    public static void main(String[] args) {

        String nome = "Donizt";
        String nomeDois = "Matheus";

        int tamanhoDaString = nome.length();
        boolean saoIguais = nome.equals(nomeDois);


        System.out.println("Olá " + nome.toUpperCase() + " seu nome tem " + tamanhoDaString + " caracteres.");
        System.out.println("Os nomes são iguais? " + saoIguais);

    }
}
