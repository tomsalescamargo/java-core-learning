package tom.sales.javacore.Gabstratas.dominio;

public abstract class Funcionario {
    protected String nome;
    protected TipoCargo cargo;

    public Funcionario(String nome, TipoCargo cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public abstract double calcularPagamento();

    public String toString() {
        return "DADOS --> " +
                "Nome: " + this.nome +
                " Cargo: " + this.cargo.cargoRelatorio;
    }
}
