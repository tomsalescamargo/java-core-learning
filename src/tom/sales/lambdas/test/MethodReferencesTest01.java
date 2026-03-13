package tom.sales.lambdas.test;

import tom.sales.lambdas.dominio.Filme;
import tom.sales.lambdas.service.FilmeComparators;

import java.util.ArrayList;
import java.util.List;

// 1. Reference to a static method
public class MethodReferencesTest01 {
    public static void main(String[] args) {
        // Se a lambda usa apenas um metodo, podemos utilizar "Method Reference"
        List<Filme> filmes = new ArrayList<>(List.of(
                new Filme("Shrek", 5),
                new Filme("Carros", 10),
                new Filme("Wall-e", 20)));

        // Maneira mais simples:
        // filmes.sort((f1, f2) -> f1.getTitulo().compareTo(f2.getTitulo()));

        // Usando classe auxiliar para ficar com apenas uma chamada de metodo:
        // filmes.sort((f1, f2) -> FilmeComparators.compareByTitle(f1, f2));

        // Usando method reference:
        filmes.sort(FilmeComparators::compareByTitle);

        System.out.println(filmes);
    }
}
