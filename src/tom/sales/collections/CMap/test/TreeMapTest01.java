package tom.sales.collections.CMap.test;


import tom.sales.collections.CMap.dominio.Estudante;
import tom.sales.collections.CMap.dominio.Professor;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapTest01 {
    public static void main(String[] args) {
        NavigableMap<Professor, Estudante> map = new TreeMap<>();

        Professor professor1 = new Professor("Ronaldão", 1);
        Professor professor2 = new Professor("Frank", 2);
        Professor professor3 = new Professor("Kolliver", 3);
        Professor professor4 = new Professor("Kolliver", 4);

        Estudante estudante1 = new Estudante("Tom", "123");
        Estudante estudante2 = new Estudante("Caio", "456");
        Estudante estudante3 = new Estudante("Biel", "789");
        Estudante estudante4 = new Estudante("Tom2", "123");

        map.put(professor1, estudante1);
        map.put(professor2, estudante2);
        map.put(professor3, estudante3);
        System.out.println(map);

        System.out.println("---- SubMapa ----");
        // headMap retorna uma visão contendo todas as entradas com chave
        //  menor que a chave fornecida.
        //  O "inclusive = true/false" define se a chave passada entra junto ou não.
        System.out.println(map.headMap(professor3, true));

        System.out.println("---- Testando Duplicidade ----");
        // Mesma ideia do HashMap, não cria nova chave, só substitui o valor.
        // Usa o compareTo e vê que o nome do professor3 == nome do professor4.
        // Portanto, o resultado será:
        // professor3 : estudante4
        map.put(professor4, estudante4);
        for (Map.Entry<Professor, Estudante> entry : map.entrySet()) {
            System.out.println(entry.getKey().getId() + " : " + entry.getValue());
        }
    }
}
