package tom.sales.streams.test;

import tom.sales.streams.dominio.Categoria;
import tom.sales.streams.dominio.Serie;
import tom.sales.streams.dominio.Tamanho;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsTest03 {
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
        Map<Tamanho, List<Serie>> tamanhoSeriesMap = series
                .stream()
                .collect(Collectors.groupingBy(s -> {
                        return s.getNumberOfEpisodes() <= 45 ? Tamanho.MINISERIE : Tamanho.GRANDE;
                    }
                ));

        System.out.println(tamanhoSeriesMap);



        System.out.println("--------------");
        // Queremos Map<Categoria, Map<Tamanho, List<Serie>>>
        // É possível encadear collectors: groupingBy dentro de groupingBy
        Map<Categoria, Map<Tamanho, List<Serie>>> collectMap = series.stream().collect(Collectors.groupingBy(
                Serie::getCategoria,
                Collectors.groupingBy(s -> {
                            return s.getNumberOfEpisodes() <= 45 ? Tamanho.MINISERIE : Tamanho.GRANDE;
                        }
                )
        ));

        System.out.println(collectMap);
    }

}
