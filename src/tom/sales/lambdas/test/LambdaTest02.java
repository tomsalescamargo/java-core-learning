package tom.sales.lambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest02 {
    public static void main(String[] args) {
        // Consumer é uma interface funcional, parecida com o Predicate.
        // Porém recebe tipo T, e retorna void
        List<String> nomes = List.of("Tom", "William", "Conrado");
        forEach(nomes, (String n) -> System.out.println(n));

        // Não precisa deixar o tipo explicito:
        List<Integer> numeros = List.of(1, 2, 3, 4);
        forEach(numeros, num -> System.out.println(num));
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
