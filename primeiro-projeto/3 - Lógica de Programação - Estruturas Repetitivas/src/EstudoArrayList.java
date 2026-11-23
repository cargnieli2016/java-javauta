import java.util.ArrayList;
import java.util.List;

public class EstudoArrayList {
    public static void main(String[] args) {

        List<String> listaDeCompras = new ArrayList<>();
        listaDeCompras.add("Mamão");
        listaDeCompras.add("Sabão em pó");
        listaDeCompras.add("Macarrão sem glúten");

        for (String item0 : listaDeCompras) {
            System.out.println(item0);
        }

        System.out.println("---------------------------");

        listaDeCompras.add(1, "Banana");
        listaDeCompras.add(1, "Maça");
        listaDeCompras.add(1, "Melância");

        System.out.println("Foi adicionado banana, maça e melância antes do Sabão em Pó ");
        for (String item : listaDeCompras) {
            System.out.println(item);
        }

        System.out.println("-------------------------------");

        String item = listaDeCompras.get(3);
        System.out.println("Na posição 3 eu tenho: " + item);

        System.out.println("--------------------------------");

        System.out.println("Abaixo foi removido o item sabão em pó");

        listaDeCompras.remove("Sabão em pó");

        for (String item2 : listaDeCompras) {
            System.out.println(item2);
        }

        System.out.println("-------------------------------");

        boolean ehVazia = listaDeCompras.isEmpty();
        System.out.println("A lista de compras está vazia? " + ehVazia);

        System.out.println("------------------------------");

        int tamanho = listaDeCompras.size();
        System.out.println("O tamanho da lista de compras é " + tamanho);

        System.out.println("------------------------------");

        boolean contem = listaDeCompras.contains("Arroz");
        System.out.println("Arroz está na lista? " + contem);

        System.out.println("------------------------------");

        System.out.println("A lista está vazia? " + ehVazia + ", qual é o tamanho da lista? " + tamanho + ", a lista contém o item arroz? " + contem);

        System.out.println("------------------------------");

//        listaDeCompras.clear();
//        System.out.println("A lista de compras está vazia? " + listaDeCompras.isEmpty());

        System.out.println("---------------------------------------");

        System.out.println("Abaixo usando o for each ");

        listaDeCompras.forEach(produto -> System.out.println(produto));

    }
}
