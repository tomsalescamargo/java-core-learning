package tom.sales.javacore.Fenumeracao.dominio;

public final class Programador extends Pessoa {
    private TipoNivel nivel;
    private double salario;

    public Programador(String nome, int idade, TipoNivel nivel, double salario) {
        super(nome, idade);
        this.nivel = nivel;
        this.salario = salario;
    }

    public void exibirInfo() {
        System.out.println("--------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Nível: " + this.nivel.getNivelRelatorio());
        System.out.println("Salário: " + this.salario);
        System.out.println("--------");
    }

    @Override
    public String toString() {
        return "Programador" +
                "nome: " + this.getNome() +
                "idade: " + this.getIdade() +
                "nível: " + this.nivel.getNivelRelatorio() +
                "salário: " + this.salario;
     }

    public TipoNivel getTipoNivel() {
        return this.nivel;
    }

    public void setTipoNivel(TipoNivel nivel) {
        this.nivel = nivel;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
