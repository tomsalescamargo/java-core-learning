package tom.sales.exceptions.Btrywithresources;

import java.io.FileReader;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) {
        /*
        No Java, recursos externos (como arquivos, conexões de banco, streams)
        não são gerenciados automaticamente pelo Garbage Collector.
        Eles precisam ser fechados manualmente com o método .close().

        Sem o try-with-resources, teríamos que usar um bloco finally verboso
        para garantir que o .close() fosse chamado.

        O try-with-resources resolve isso, chamando automaticamente o .close()
        ao final do bloco try, mesmo em caso de exceção.

        Para funcionar, a classe do recurso precisa "implements" AutoCloseable
        ou Closeable (interfaces que definem o método .close() )
        */

        // FileReader implements Closeable -> Ou seja foi obrigado a sobrescrever o método .close()
        try (FileReader fileReader = new FileReader("a.txt")) {

            System.out.println("File Reader executado");

        } catch (IOException e) {
            System.out.println("Erro capturado");
        }

    }
}
