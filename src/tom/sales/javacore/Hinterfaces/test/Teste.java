package tom.sales.javacore.Hinterfaces.test;

import tom.sales.javacore.Hinterfaces.dominio.Contrato;
import tom.sales.javacore.Hinterfaces.dominio.Relatorio;

public class Teste {
    public static void main(String[] args) {
        Contrato contrato = new Contrato();
        Relatorio relatorio = new Relatorio();

        contrato.imprimir();
        relatorio.imprimir();

        contrato.mensagem_erro();
    }
}
