package tom.sales.lambdas.test;

import tom.sales.lambdas.dominio.Filme;
import tom.sales.lambdas.service.FilmeComparators;

import java.util.ArrayList;
import java.util.List;

// 2. Reference to an instance method of a particular object
public class MethodReferencesTest02 {
    public static void main(String[] args) {
        List<Filme> filmes = new ArrayList<>(List.of(
                new Filme("Shrek", 5),
                new Filme("Carros", 10),
                new Filme("Wall-e", 20)));

        FilmeComparators filmeComparators = new FilmeComparators();
        filmes.sort(filmeComparators::compareByQuantity);

        System.out.println(filmes);
    }
}
