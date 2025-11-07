package tom.sales.javacore.Bmetodos.test;

import tom.sales.javacore.Bmetodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String... argumentos) {
        Funcionario funcionarioTom = new Funcionario();
        funcionarioTom.nome = "Tom";
        funcionarioTom.idade = 24;
        funcionarioTom.salarios = new double[]{45000.99, 53000, 60000};

        funcionarioTom.imprimeDados();
    }
}
