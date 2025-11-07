package tom.sales.javacore.Fenumeracao.test;

import tom.sales.javacore.Fenumeracao.dominio.Programador;
import tom.sales.javacore.Fenumeracao.dominio.TipoNivel;

public class ProgramadorTest01 {

    public static void main(String[] args) {
        Programador programador = new Programador("Tom", 20, TipoNivel.JUNIOR, 3600);
        programador.exibirInfo();
        TipoNivel tipoNivel = programador.getTipoNivel().buscarTipoPorRelatorio("Júnior");
        System.out.println(tipoNivel);
        System.out.println(programador.getTipoNivel().calcularValeRefeicao(programador.getSalario()));
    }
}
