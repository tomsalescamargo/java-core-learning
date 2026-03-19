package tom.sales.streams.test;

import tom.sales.streams.dominio.Categoria;
import tom.sales.streams.dominio.Serie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsTest02 {
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
        Map<Categoria, List<Serie>> categoriaSeriesMap1 = new HashMap<>();

        // SEM STREAMS:
        List<Serie> suspense = new ArrayList<>();
        List<Serie> comedia = new ArrayList<>();
        List<Serie> romance = new ArrayList<>();

        for (Serie serie : series) {
            switch (serie.getCategoria()) {
                case SUSPENSE: suspense.add(serie); break;
                case COMEDIA: comedia.add(serie); break;
                case ROMANCE: romance.add(serie); break;
            }
        }
        categoriaSeriesMap1.put(Categoria.SUSPENSE, suspense);
        categoriaSeriesMap1.put(Categoria.COMEDIA, comedia);
        categoriaSeriesMap1.put(Categoria.ROMANCE, romance);
        System.out.println(categoriaSeriesMap1);

        // COM STREAMS:
        Map<Categoria, List<Serie>> categoriaSeriesMap2 = series.stream().collect(Collectors.groupingBy(Serie::getCategoria));
        System.out.println(categoriaSeriesMap2);
    }
}
