package tom.sales.streams.test;

import tom.sales.streams.dominio.Serie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest02 {
    private static List<Serie> series = new ArrayList<>(List.of(
            new Serie("Lost", 100),
            new Serie("Stranger Things", 30),
            new Serie("Rick and Morty", 50),
            new Serie("The 100", 80),
            new Serie("Round Six", 20),
            new Serie("Black Mirror", 40),
            new Serie("Black Mirror", 40),
            new Serie("Friends", 200)
    ));

    public static void main(String[] args) {
        Stream<Serie> stream = series.stream();

        series.forEach(System.out::println); // FOR EACH NÃO PRECISA DE STREAM

        System.out.println("---------------");

        long count = stream.filter(s -> s.getNumberOfEpisodes() == 40).count();
        System.out.println("Count: " + count);

        long countDistinct = series.stream().
                distinct(). // Precisa de equals e hashcode
                filter(s -> s.getNumberOfEpisodes() == 40)
                .count();

        System.out.println("Count Distinct: " + countDistinct);
    }
}
