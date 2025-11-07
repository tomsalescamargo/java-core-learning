package tom.sales.collections.CMap.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();
        fila.add("C");
        fila.add("A");
        fila.add("B");

        // A ideia da PriorityQueue é justamente não ser uma fila normal,
        // sua ordem(prioridade) será definida pelo Comparable da classe
        // ou Comparator definido no construtor.
        // Para String, a ordem natural(Comparable) é alfabética.
        // Ou seja: internamente, o "A" terá sempre a maior prioridade,
        // independentemente se no código inserimos "C" primeiro, o "A" será
        // o primeiro a ser removido.

        // Importante: o for-each NÃO percorre em ordem de prioridade.
        // Ele mostra a estrutura interna do heap, que pode parecer bagunçada.
        for (String elemento : fila) {
            System.out.println(elemento); // Pode sair "C", "A", "B"
        }

        System.out.println("-------------");
        // peek() mostra o próximo a ser removido (menor elemento, aqui "A")
        System.out.println(fila.peek()); // Mostra "A"

        // poll() remove o próximo elemento com maior prioridade (aqui "A")
        System.out.println(fila.poll()); // Remove "A"

        // Agora o próximo menor ("B") será o próximo a sair
        System.out.println(fila.peek()); // Mostra "B"
    }
}
