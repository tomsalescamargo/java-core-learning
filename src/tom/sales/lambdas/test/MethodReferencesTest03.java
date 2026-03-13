package tom.sales.lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

// Reference to an instance method of an arbitrary object of a particular type
public class MethodReferencesTest03 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(List.of("Rafael", "Tom", "Gean"));

        // compareTo não é estático, mas chamamos ele pela sua classe
        nomes.sort(String::compareTo); // (nome1, nome2) -> nome1.compareTo(nome2)

        Function<String, Integer> numStringToInteger = Integer::parseInt;
        System.out.println(numStringToInteger.apply("20"));

        // Recebe uma lista e um nome e verifica se a lista contém esse nome
        // Usado quando precisa de dois parâmetros para comparação
        BiPredicate<List<String>, String> checarNome = List::contains; // (lista, nome) -> lista.contains(nome)
        System.out.println(checarNome.test(nomes, "Tom"));
    }
}
