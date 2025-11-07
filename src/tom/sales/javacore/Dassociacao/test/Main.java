package tom.sales.javacore.Dassociacao.test;

import tom.sales.javacore.Dassociacao.dominio.Estudante;
import tom.sales.javacore.Dassociacao.dominio.Local;
import tom.sales.javacore.Dassociacao.dominio.Professor;
import tom.sales.javacore.Dassociacao.dominio.Seminario;


public class Main {
    public static void main(String[] args) {
        Local local1 = new Local("CTC UFSC");
        Professor professor1 = new Professor("Camilo", "IA");
        Professor professor2 = new Professor("De Lucca", "Estrutura de Dados");
        Estudante tom = new Estudante("Tom", 19);
        Estudante rafa = new Estudante("Rafa", 20);
        Estudante daviTurnes = new Estudante("Davi Turnes", 22);
        Estudante uri = new Estudante("Uriel Jaloto", 20);


        Seminario seminario1 = new Seminario("Projeto WEB", professor1, local1, new Estudante[]{tom, rafa});
        professor1.setSeminarios(new Seminario[]{seminario1});
        tom.setSeminario(seminario1);
        rafa.setSeminario(seminario1);

        Seminario seminario2 = new Seminario("Trabalho ED", professor2, local1, new Estudante[]{daviTurnes, uri});
        professor2.setSeminarios(new Seminario[]{seminario2});
        daviTurnes.setSeminario(seminario2);
        uri.setSeminario(seminario2);

        seminario1.imprime();
        System.out.println();
        seminario2.imprime();

        System.out.println();
        System.out.println("Verificando Associações");
        System.out.println(tom.getSeminario().getTitulo());
        System.out.println(rafa.getSeminario().getTitulo());
        System.out.println(professor1.getSeminarios()[0].getTitulo());
        System.out.println(daviTurnes.getSeminario().getTitulo());
        System.out.println(uri.getSeminario().getTitulo());
        System.out.println(professor2.getSeminarios()[0].getTitulo());

    }
}
