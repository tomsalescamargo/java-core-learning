package tom.sales.streams.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapTest {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();

        List<String> designers = List.of("Sophi", "Marcelo", "André");
        List<String> desenvolvedores = List.of("Tom", "Rafael", "Gean");
        List<String> estudantes = List.of("Gustavo", "Pedrão", "Reni R.");

        devdojo.add(designers);
        devdojo.add(desenvolvedores);
        devdojo.add(estudantes);

        // Sem FlatMap seria preciso dois "for" aninhados para percorrer essa lista.
        // Quando é preciso retirar atributos aninhados de dentro da lista, usamos FlatMap.
        // (Flattening / Achatamento)
        Stream<String> stream = devdojo.stream()
                .flatMap(l -> l.stream());

        stream.forEach(System.out::println);

        System.out.println("-----------");

        List<String> letters = designers.stream()
                .map(d -> d.split("")) // Stream<String[]>
                .flatMap(Arrays::stream) // Stream<String>
                .collect(Collectors.toList());

        System.out.println(letters);
    }
}
