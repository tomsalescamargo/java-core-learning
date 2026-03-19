package tom.sales.optional.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;

public class OptionalTest01 {
    public static void main(String[] args) {
        // Classe que tem o intuito de tentar evitar o NullPointerException
        // Retorno do metodo pode não ser nada -> comum em banco de dados

        List<String> nomesList = new ArrayList<>(List.of("J. Tatum", "J. Brown", "D. White"));
        BiPredicate<String, String> nomesPredicate = String::equals;

        Optional<String> nomeOptional = find(nomesList, "J. Tatum", nomesPredicate);
        System.out.println("Encontrado: " + nomeOptional.get());

        System.out.println("--------------");

        // Se tivermos um metodo que nao retorna optional, mas queremos tratá-lo com Optional:
        String tatum = findByName(nomesList, "J. Tatum");
        Optional<String> nomeOptional2 = Optional.ofNullable(tatum);
        String tatumResult = nomeOptional2.orElse("NÃO ENCONTRADO");

        System.out.println(nomeOptional2);
        System.out.println(tatumResult);

        nomeOptional2.ifPresent(s -> System.out.println(s.toUpperCase()));
        nomeOptional2.orElseThrow(IllegalArgumentException::new);
    }

    private static <E> Optional<E> find(List<E> list, E attribute, BiPredicate predicate) {
        for (E e : list) {
            if (predicate.test(e, attribute)) {
                return Optional.of(e);
            }
        }

        return Optional.empty();
    }

    private static String findByName(List<String> nomes, String nome) {
        int i = nomes.indexOf(nome);
        if (i != -1) {
            return nomes.get(i);
        }

        return null;
    }
}
