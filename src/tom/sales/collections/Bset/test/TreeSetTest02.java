package tom.sales.collections.Bset.test;

import tom.sales.collections.Bset.dominio.Estudante;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetTest02 {
    public static void main(String[] args) {
        // Usado quando precisamos definir uma ordem natural dos elementos
        //  (alfabética, numérica, etc.)
        NavigableSet<Estudante> estudantes = new TreeSet<>();

        Estudante estudante1 = new Estudante("Tom", "123");
        Estudante estudante2 = new Estudante("Caio", "456");
        Estudante estudante3 = new Estudante("Biel", "789");
        Estudante estudante4 = new Estudante("Tom2", "123");
        Estudante estudante5 = new Estudante("Tom", "000");


        estudantes.add(estudante1);
        estudantes.add(estudante2);
        estudantes.add(estudante3);

        // **DESSA VEZ É ADICIONADO** nosso metodo comparable é pelo nome
        // hashCode e equals não são utilizados em TreeSet para decisão de duplicidade
        estudantes.add(estudante4);

        // Não é adicionado, já existe um elemento com mesmo nome "Tom"
        estudantes.add(estudante5);

        // Ordenado em ordem alfabético devido ao Comparable + compareTo da classe Estudante
        System.out.println(estudantes);
    }
}
