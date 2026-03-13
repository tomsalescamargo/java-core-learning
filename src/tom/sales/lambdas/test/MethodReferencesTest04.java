package tom.sales.lambdas.test;

import tom.sales.lambdas.dominio.Filme;
import tom.sales.lambdas.service.FilmeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

// Reference to a constructor
public class MethodReferencesTest04 {
    public static void main(String[] args) {
        // Supplier: interface funcional que não recebe parâmetro e RETORNA T
        // Supplier<T>
        Supplier<FilmeComparators> newFilmeComparators = FilmeComparators::new;
        FilmeComparators filmeComparators = newFilmeComparators.get(); // Objeto é criado aqui

        List<Filme> filmes = new ArrayList<>(List.of(
                new Filme("Shrek", 5),
                new Filme("Carros", 10),
                new Filme("Wall-e", 20)));

        filmes.sort(filmeComparators::compareByQuantity);

        // Mas pra instanciar um objeto que tenha parâmetros de construtor, não conseguimos usar Supplier
        BiFunction<String, Integer, Filme> filmeBiFunction = (titulo, quantidade) -> new Filme(titulo, quantidade);
        BiFunction<String, Integer, Filme> filmeBiFunction2 = Filme::new;

        filmeBiFunction2.apply("Filme Renê", 1);
    }
}
