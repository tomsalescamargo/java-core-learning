package tom.sales.javacore.Gabstratas.test;

import tom.sales.javacore.Gabstratas.dominio.FuncionarioCLT;
import tom.sales.javacore.Gabstratas.dominio.FuncionarioPJ;
import tom.sales.javacore.Gabstratas.dominio.TipoCargo;

public class FuncionarioTest {
    public static void main(String[] args) {
        FuncionarioPJ pj = new FuncionarioPJ("Tom", TipoCargo.PROGRAMADOR, 120, 100);
        FuncionarioCLT clt = new FuncionarioCLT("Rafa Dihl", TipoCargo.GERENTE, 5000);

        System.out.println(pj);
        System.out.println("Pagamento PJ: R$" + pj.calcularPagamento());

        System.out.println(clt);
        System.out.println("Pagamento CLT: R$" + clt.calcularPagamento());
    }
}
