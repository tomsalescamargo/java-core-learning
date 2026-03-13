package tom.sales.lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaTest01 {
    public static void main(String[] args) {
        // Predicate é uma interface funcional que define uma única função.
        // Essa interface diz que deve-se receber qualquer tipo T, e retornar um boolean.
        // Implementação dessa interface:
        Predicate<Integer> numeroParPredicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer number) {
                return number % 2 == 0; // Verifica se é par
            }
        };

        List<Integer> numerosList = new ArrayList<>(List.of(1, 20, 11, 40));

        // Da maneira tradicional, se quiséssemos filtrar números pares, criariamos um metodo
        // somente para filtrar números pares; se quisessemos números maior que 1000, criariamos
        // um metodo somente pra eles, etc.
        // Resultado: Repetição de toda a estrutura do código, loops, etc.
        // PORÉM, o que muda nesses métodos é SOMENTE A CONDIÇÃO

        // Solução: criar um metodo genérico, e passar a condição como parâmetro -> PREDICATE
        filtrarNumeros(numerosList, numeroParPredicate);

        // Agora, se quisermos filtrar por números maiores que 1000, não é
        // preciso criar um metodo novo:
        Predicate<Integer> numerosMaioresQueMilPredicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer number) {
                return number > 1000;
            }
        };
        filtrarNumeros(numerosList, numerosMaioresQueMilPredicate);


        // Ainda há um jeito muito mais fácil de fazer isso, que é usando FUNÇÕES LAMBDA
        Predicate<Integer> numerosMenoresQueDezPredicate = numero -> numero < 10;
        filtrarNumeros(numerosList, numerosMenoresQueDezPredicate);
    }

    private static List<Integer> filtrarNumeros(List<Integer> numerosList, Predicate<Integer> numerosPredicate) {
        List<Integer> numerosFiltrados = new ArrayList<>();
        for (Integer numero : numerosList) {
            if (numerosPredicate.test(numero)) {
                numerosFiltrados.add(numero);
            }
        }

        return numerosFiltrados;
    }
}
