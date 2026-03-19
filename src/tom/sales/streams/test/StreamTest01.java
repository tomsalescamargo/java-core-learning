package tom.sales.streams.test;

import tom.sales.streams.dominio.Serie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest01 {
    private static List<Serie> series = new ArrayList<>(List.of(
            new Serie("Lost", 100),
            new Serie("Stranger Things", 30),
            new Serie("Rick and Morty", 50),
            new Serie("The 100", 80),
            new Serie("Round Six", 20),
            new Serie("Black Mirror", 40),
            new Serie("Friends", 200)
    ));

    public static void main(String[] args) {
        // Maioria das coleções tem um metodo chamado Stream, que retorna um Stream
        // Significa que agora vou trabalhar com essa sequência de elementos.
        // Podemos fazer operações nessa sequência, de dois tipos:
        //    1. Intermediárias: ação que retorna o próprio Stream, podendo encadear
        //      ex: filtrar, ordenar
        //    2. Finais: ação que fecha o stream e retorna coleção


        List<String> titulos = series.stream()
                .sorted(Comparator.comparing(Serie::getTitulo))
                .filter(s -> s.getNumberOfEpisodes() <= 50)
                .limit(3)
                .map(Serie::getTitulo)
                .collect(Collectors.toList()); // Operação Final

        System.out.println(titulos);
    }
}
