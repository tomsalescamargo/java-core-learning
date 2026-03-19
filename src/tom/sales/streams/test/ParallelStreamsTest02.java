package tom.sales.streams.test;

public class ParallelStreamsTest02 {
    public static void main(String[] args) {
        // COMO DECIDIR SE VAI USAR PARALLEL STREAMS
        //
        // 1. Avaliar desempenho
        // 2. Unboxing | boxing -> Cuidado com tipos primitivos e wrapping
        // 3. Limit, e findFirst não foram feitas para trabalhar paralelamente. findAny é bom
        // 4. Custo total da computação
        // 5. Quantidade de dados -> Se for muito pequena não vale a pena
        // 6. Tipos de coleções: ArrayList(Excelente), LinkedList(Péssimo), Iterate(Ruim)
        //       - Sempre pesquisar se a coleção foi feita pra trabalhar de forma paralelizada
        // 7. Tamanho do Stream -> Streams com tamanho definido são melhores
        // 8. Processamento do merge ->
    }
}
