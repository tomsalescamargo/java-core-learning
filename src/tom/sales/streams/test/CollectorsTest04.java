package tom.sales.streams.test;

import tom.sales.streams.dominio.Categoria;
import tom.sales.streams.dominio.Serie;
import tom.sales.streams.dominio.Tamanho;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsTest04 {
    private static List<Serie> series = new ArrayList<>(List.of(
            new Serie("Lost", 100, Categoria.SUSPENSE),
            new Serie("Stranger Things", 30, Categoria.SUSPENSE),
            new Serie("Rick and Morty", 50, Categoria.COMEDIA),
            new Serie("The 100", 80, Categoria.SUSPENSE),
            new Serie("Round Six", 20, Categoria.SUSPENSE),
            new Serie("Black Mirror", 40, Categoria.SUSPENSE),
            new Serie("Friends", 200, Categoria.ROMANCE)
    ));


    public static void main(String[] args) {
        Map<Categoria, Long> categoriesCountMap = series.stream().collect(Collectors.groupingBy(Serie::getCategoria, Collectors.counting()));
        System.out.println(categoriesCountMap);

        System.out.println("---------------");

        Map<Categoria, IntSummaryStatistics> categoriesEpisodesStatsMap =
                series.stream().collect(
                        Collectors.groupingBy(
                                Serie::getCategoria,
                                Collectors.summarizingInt(s -> s.getNumberOfEpisodes())
                        )
                );

        System.out.println(categoriesEpisodesStatsMap);

        System.out.println("---------------");
        // Sem o mapping:
        // groupingBy + outro groupingBy → Map<Categoria, Map<Tamanho, List<Serie>>>
        //
        // Com o mapping:
        // Em vez de guardar a Serie inteira, transformamos cada Serie em um Tamanho
        // Resultado final: Map<Categoria, List<Tamanho>>
        Map<Categoria, List<Tamanho>> categoriesTamanhoMap = series.stream().collect(
                Collectors.groupingBy(
                        Serie::getCategoria,
                        Collectors.mapping(CollectorsTest04::getTamanho, Collectors.toList())
                )
        );

        System.out.println(categoriesTamanhoMap);
    }

    private static Tamanho getTamanho(Serie serie) {
        return serie.getNumberOfEpisodes() <= 45 ? Tamanho.MINISERIE : Tamanho.GRANDE;
    }
}
