package tom.sales.collections.Alist.test;

import tom.sales.collections.Alist.dominio.Estudante;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EstudanteTest01 {
    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();

        Estudante estudante1 = new Estudante("Tom", "123");
        Estudante estudante2 = new Estudante("Caio", "456");
        Estudante estudante3 = new Estudante("Biel", "789");
        Estudante estudante4 = new Estudante("Tom2", "123");

        estudantes.add(estudante1);
        estudantes.add(estudante2);
        estudantes.add(estudante3);
        estudantes.add(estudante4);

        List<Estudante> estudantesUFSC = new ArrayList<>();
        estudantesUFSC.addAll(estudantes);

        // Remove estudante1 porque tinha o mesmo CPF, e o metodo remove chama o equals
        //  de cada objeto da lista, e achou a primeira ocorrência do CPF 123
        estudantesUFSC.remove(estudante4);

        estudantesUFSC.add(0, estudante1);
        System.out.println(estudantesUFSC);

        System.out.println(estudantesUFSC.contains(estudante4));
        System.out.println(estudantesUFSC.indexOf(estudante4)); // Retorna 0 ("Errado")
        System.out.println(estudantesUFSC.get(1));

        System.out.println("----- Equals e HashCode -----");

        System.out.println(estudante4.equals(estudante1));
        System.out.println(estudante4.hashCode() == estudante1.hashCode());

        System.out.println("---- Iterator ----");
        Iterator<Estudante> it = estudantesUFSC.iterator();
        while(it.hasNext()) {
            Estudante estudante = it.next();
            if(estudante.getNome().equals("Tom2")) {
                System.out.println("Removendo 'Tom2'");
                it.remove();
            }
        }
        System.out.println(estudantesUFSC);
    }
}
