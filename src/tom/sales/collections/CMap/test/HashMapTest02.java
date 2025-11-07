package tom.sales.collections.CMap.test;

import tom.sales.collections.CMap.dominio.Estudante;
import tom.sales.collections.CMap.dominio.Professor;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest02 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Ronaldão", 1);
        Professor professor2 = new Professor("Frank", 2);

        Estudante estudante1 = new Estudante("Tom", "123");
        Estudante estudante2 = new Estudante("Caio", "456");
        Estudante estudante3 = new Estudante("Biel", "789");
        Estudante estudante4 = new Estudante("Tom2", "123");

        Map<Professor, Estudante> professorEstudanteMap = new HashMap<>();
        professorEstudanteMap.put(professor1, estudante1);
        professorEstudanteMap.put(professor2, estudante3);

        for (Map.Entry<Professor, Estudante> entry : professorEstudanteMap.entrySet()){
            System.out.println(entry.getKey().getNome() + " : " + entry.getValue());
        }
    }
}
