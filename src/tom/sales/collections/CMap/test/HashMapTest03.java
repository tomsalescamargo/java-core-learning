package tom.sales.collections.CMap.test;

import tom.sales.collections.CMap.dominio.Estudante;
import tom.sales.collections.CMap.dominio.Professor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapTest03 {
    public static void main(String[] args) {
        // Agora um professor podendo ter vários estudantes
        Professor professor1 = new Professor("Ronaldão", 1);
        Professor professor2 = new Professor("Frank", 2);
        Professor professor3 = new Professor("Kolliver", 3);

        Estudante estudante1 = new Estudante("Tom", "123");
        Estudante estudante2 = new Estudante("Caio", "456");
        Estudante estudante3 = new Estudante("Biel", "789");
        Estudante estudante4 = new Estudante("Tom2", "123");

        List<Estudante> estudantesList1 = List.of(estudante1, estudante2);
        List<Estudante> estudantesList2 = List.of(estudante3, estudante4);
        Map<Professor, List<Estudante>> professorEstudanteMap = new HashMap<>();

        professorEstudanteMap.put(professor1, estudantesList1);
        professorEstudanteMap.put(professor2, estudantesList2);

        for (Map.Entry<Professor, List<Estudante>> entry : professorEstudanteMap.entrySet()) {
            System.out.println(entry.getKey().getNome() + " : " + entry.getValue());
        }


        // DUPLICIDADE
        System.out.println("---- Testando Duplicidade ----");
        List<Estudante> estudanteList3 = List.of(estudante1, estudante2, estudante3);

        // Deixando professor2 e professor3 com MESMO id
        professor3.setId(professor2.getId());

        // HashMap chama o equals e identifica que a chave já existe
        // porque id do professor3 == id do professor2.
        // Não cria uma nova chave para professor3
        // somente SUBSTITUI O VALOR da chave existente(professor2).
        // Portanto o resultado será:
        // professor2 : estudanteList3
        professorEstudanteMap.put(professor3, estudanteList3);

        for (Map.Entry<Professor, List<Estudante>> entry : professorEstudanteMap.entrySet()) {
            System.out.println(entry.getKey().getNome() + " : " + entry.getValue());
        }
    }
}
