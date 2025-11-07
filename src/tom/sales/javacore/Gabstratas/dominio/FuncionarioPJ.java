package tom.sales.javacore.Gabstratas.dominio;

public class FuncionarioPJ extends Funcionario{
    private double valorHora;
    private int horasTrabalhadas;
    private double pagamento;

    public FuncionarioPJ(String nome, TipoCargo cargo, double valorHora, int horas_trabalhadas) {
        super(nome, cargo);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horas_trabalhadas;
        this.pagamento = this.calcularPagamento();
    }

    @Override
    public double calcularPagamento() {
        return valorHora * horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
        this.pagamento = this.calcularPagamento();
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horas_trabalhadas) {
        this.horasTrabalhadas = horas_trabalhadas;
        this.pagamento = this.calcularPagamento();
    }

    public double getPagamento() {
        return pagamento;
    }
}
