package tom.sales.streams.test;

import tom.sales.streams.dominio.Serie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReduceTest02 {
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
        series.stream()
                .map(Serie::getNumberOfEpisodes)
                .filter(numberOfEpisodes -> numberOfEpisodes > 30)
                .reduce(Integer::sum)
                .ifPresent(System.out::println);
    }
}
