package tom.sales.streams.test;

import tom.sales.streams.dominio.Serie;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindingAndMatchingTest {
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
        // anyMatch: Verifica se pelo menos um satisfaz a condição
        boolean anyMatch = series.stream()
                .anyMatch(s -> s.getNumberOfEpisodes() >= 100);
        System.out.println(anyMatch);

        // allMatch: Verifica se todos satisfazem a condição
        boolean allMatch = series.stream().allMatch(s -> s.getNumberOfEpisodes() > 0);
        System.out.println(allMatch);

        // noneMatch: Verifica se nenhum satisfazaz a condição
        boolean noneMatch = series.stream().noneMatch(s -> s.getNumberOfEpisodes() < 0);
        System.out.println(noneMatch);

        // findAny
        Optional<Serie> serieOptional1 =  series.stream()
                .filter(s -> s.getNumberOfEpisodes() < 50)
                .findAny(); // Pega qualquer um da lista e retorna

        serieOptional1.ifPresent(System.out::println);

        // findFirst
        Optional<Serie> serieOptional2 = series.stream()
                .filter(s -> s.getNumberOfEpisodes() < 50)
                .findFirst(); // Pega o primeiro da lista e retorna

        serieOptional2.ifPresent(System.out::println);
    }
}
