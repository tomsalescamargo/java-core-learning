package tom.sales.javacore.Gabstratas.dominio;

public class FuncionarioCLT extends Funcionario {
    private double salario;

    public FuncionarioCLT(String nome, TipoCargo cargo, double salario) {
        super(nome, cargo);
        this.salario = salario;
        calcularPagamento();
    }

    @Override
    public double calcularPagamento() {
        return this.salario + (this.salario * 0.05);
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        if (salario > this.salario) {
            this.salario = salario;
        }
    }
}
