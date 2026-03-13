package tom.sales.lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest03 {
    public static void main(String[] args) {
        // Function é uma interface funcional, porém ela tem uma pequena diferença das outras.
        // Ela recebe os tipos <T, R>
        // T é o parâmetro, R é o retorno
        List<String> jogadores = List.of("Neymar", "Gabigol", "Brazão");
        List<Integer> tamanhos = map(jogadores, (String j) -> j.length()); // Function<String, Integer>
        System.out.println(tamanhos);

        List<String> maiusculas = map(jogadores, (String j) -> j.toUpperCase()); // Function<String, String>
        System.out.println(maiusculas);
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> resultList = new ArrayList<>();
        for (T t : list) {
            R r = function.apply(t);
            resultList.add(r);
        }

        return resultList;
    }
}
