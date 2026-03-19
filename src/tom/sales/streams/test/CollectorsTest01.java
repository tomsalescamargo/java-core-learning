package tom.sales.streams.test;

import tom.sales.streams.dominio.Serie;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsTest01 {
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
        // Assim temos que fazer isso para cada estatística (soma, média, max, ...)
        series.stream().mapToDouble(Serie::getNumberOfEpisodes).sum();

        // Forma mais prática usando Collectors:
        IntSummaryStatistics stats = series.stream().collect(Collectors.summarizingInt(Serie::getNumberOfEpisodes));
        System.out.println("Objeto stats: " + stats);


        System.out.println("-----------");
        String titulosString = series.stream().map(Serie::getTitulo).collect(Collectors.joining(", "));
        System.out.println(titulosString);
    }
}
