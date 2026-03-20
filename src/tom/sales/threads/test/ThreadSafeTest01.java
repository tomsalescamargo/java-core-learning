package tom.sales.threads.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ThreadSafeNames {
    // Retorna uma lista Thread-Safe
    private final List<String> names = Collections.synchronizedList(new ArrayList<>());

    public void add(String name) {
        names.add(name);
    }

    public void removeFirst() {
        if (names.size() > 0) {
            System.out.println(Thread.currentThread().getName());
            System.out.println(names.remove(0));
        }
    }
}

public class ThreadSafeTest01 {
    public static void main(String[] args) {
        // Classes Thread-Safe: dão segurança pra trabalhar com paralelismo
        // Porém, temos que tomar muito CUIDADO!
        // Como visto no exemplo, a coleção é thread-safe, porém os métodos que estão acima
        //  (que manipulam ela) não são thread-safe.
        // Solução: colocar synchronized nos métodos da classe.

        ThreadSafeNames threadSafeNames = new ThreadSafeNames();
        threadSafeNames.add("Frederico");

//        Runnable r = () -> {
//            threadSafeNames.removeFirst();
//        }

        Runnable r = threadSafeNames::removeFirst;
        new Thread(r).start();
        new Thread(r).start();
    }
}
