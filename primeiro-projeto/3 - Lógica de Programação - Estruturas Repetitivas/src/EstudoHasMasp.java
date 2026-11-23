import java.util.HashMap;
import java.util.Map;

public class EstudoHasMasp {
    public static void main(String[] args) {
        HashMap<String, Double> notasAlunos = new HashMap<>();
        notasAlunos.put("Doni", 5.5);
        notasAlunos.put("Maria", 4.5);
        notasAlunos.put("Pedro", 3.5);
        notasAlunos.put("Matheus", 7.5);

        for (String nome : notasAlunos.keySet()) {
            double nota = notasAlunos.get(nome);
            System.out.println(nome + " - " + nota);

        }
        System.out.println("-------------------");

        for (Map.Entry<String, Double> nota : notasAlunos.entrySet()) {
            String nome = nota.getKey();
            double valorNota = nota.getValue();
            System.out.println(nome + " - " + valorNota);
        }

        double nota = notasAlunos.get("Doni");
        System.out.println("A nota do Doni é " + nota);

        int tamanhoHash = notasAlunos.size();


        notasAlunos.remove("Doni");

    }


}




