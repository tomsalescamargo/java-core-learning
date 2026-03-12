package tom.sales.generics.test;


import java.util.List;
import java.util.Objects;

public class WildcardTest01 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());

        // Agora é permitido
        printConsultaList(cachorros);
    }

    // Wildcard resolve o problema que vimos em "GenericsTest01"
    // Porém é como um contrato que diz que não podemos adicionar elementos nessa lista
    private static void printConsultaList(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }

    // Parâmetro tem que ser um Animal, ou super de Animal
    // Aqui temos que subir até o topo da "árvore geneológica"
    private static void printConsultaAnimal(List<? super Animal> animals) {
        Animal animal = new Cachorro();
        Animal animal2 = new Gato();

        // Aqui podemos adicionar qualquer subclasse, porque temos garantia do polimorfismo
        // (Sabemos que a lista não vai ser filha de Animal, que é o que gera problemas)
        animals.add(new Cachorro());
        animals.add(new Gato());
    }
}
