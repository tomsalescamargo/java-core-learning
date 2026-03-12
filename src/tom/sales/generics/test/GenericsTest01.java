package tom.sales.generics.test;


import java.util.List;

abstract class Animal {
    public abstract void consulta();
}

class Cachorro extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultando cachorro");
    }
}

class Gato extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultando gato");
    }
}

public class GenericsTest01 {
    public static void main(String[] args) {
        Cachorro[] cachorrosArray = {new Cachorro(), new Cachorro()};
        Gato[] gatosArray = {new Gato(), new Gato()};
        Animal[] animalsArray = {new Gato(), new Cachorro()};

        // Permitido, porque Cachorro[] pode ser tratado como Animal[]
        // Porém isso pode gerar erro em Runtime (ArrayStoreException)
        // Generics evitam esse tipo de problema detectando erros já na compilação
        printConsultaArray(cachorrosArray);
        printConsultaArray(gatosArray);
        printConsultaArray(animalsArray);

        List<Cachorro> cachorrosList = List.of(new Cachorro(), new Cachorro());

        // Type erasure -> Depois de compilado, Java não sabe que o parâmetro passado é uma Lista de Cachorros.
        // Ou seja, se no metodo houvesse a adição de um gato na lista, não daria erro de tipo, seria PERMITIDO.
        // Resultado: gato na lista de cachorros!
        // Por isso, o compilador não permite essa adição.
        // printConsultaList(cachorrosList);  // -> ERRO DE COMPILAÇÃO
        // List<Animal> != List<Cachorro>
    }

    private static void printConsultaArray(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }

    private static void printConsultaList(List<Animal> animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }
}
