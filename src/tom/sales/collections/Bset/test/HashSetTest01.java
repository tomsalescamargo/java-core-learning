package tom.sales.collections.Bset.test;

import tom.sales.collections.Bset.dominio.Estudante;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest01 {
    public static void main(String[] args) {
        // TABELA HASH
        // Função Hash de espalhamento usa o HashCode do objeto para achar o bucket correto
        // Se no bucket encontrado não houver ninguém -> Insere automaticamente
        // Se no bucket encontrado já houver algum elemento -> Colisão ->
        //   utiliza-se o metodo equals para verificar se o objeto é duplicado
        Set<Estudante> estudantes = new HashSet<>();

        Estudante estudante1 = new Estudante("Tom", "123");
        Estudante estudante2 = new Estudante("Caio", "456");
        Estudante estudante3 = new Estudante("Biel", "789");
        Estudante estudante4 = new Estudante("Tom2", "123");

        estudantes.add(estudante1);
        estudantes.add(estudante2);
        estudantes.add(estudante3);
        estudantes.add(estudante4); // CPF repetido: hashcode igual ao estudante1
        System.out.println("Tamanho do set: " + estudantes.size());

        for (Estudante estudante : estudantes) {
            System.out.println(estudante);
        }
    }
}
