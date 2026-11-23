import java.util.Map;
import java.util.TreeMap;

public class EstudoTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Double> notasAlunos = new TreeMap<>();
        notasAlunos.put("Doni", 5.5);
        notasAlunos.put("Maria", 4.5);
        notasAlunos.put("Pedro", 3.5);
        notasAlunos.put("Matheus", 7.5);

        for (String nome : notasAlunos.keySet()) {
            double nota = notasAlunos.get(nome);
            System.out.println(nome + " - " + nota);

        }
        System.out.println("----------------------------");

        for (Map.Entry<String, Double> nota : notasAlunos.entrySet()) {
            String nome = nota.getKey();
            double valorNota = nota.getValue();
            System.out.println(nome + " - " + valorNota);
        }

        System.out.println("----------------------------");

        System.out.println("Pegando a primeira chave: " + notasAlunos.firstKey());
        System.out.println("Pegando a última chave: " + notasAlunos.lastKey());

    }
}
