package tom.sales.streams.test;

import java.util.List;
import java.util.Optional;

public class ReduceTest01 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1,2,3,4,5,6);

        // Sem valor inicial, retorna optional porque lista pode estar vazia:
        Optional<Integer> somaOptional = integers.stream()
                .reduce((a, b) -> a + b);
        somaOptional.ifPresent(System.out::println);

        // Com valor inicial, retorna inteiro:
        Integer soma1 = integers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(soma1);

        // Podemos usar Method Reference:
        Integer soma2 = integers.stream()
                .reduce(0, Integer::sum);
        System.out.println(soma2);
    }
}
