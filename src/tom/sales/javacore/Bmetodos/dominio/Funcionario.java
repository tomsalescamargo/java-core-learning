package tom.sales.javacore.Bmetodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimeDados() {
        System.out.println("-----DADOS FUNCIONÁRIO-----");

        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        String textoSalarios = "Salários: " + salarios[0] + " ; " + salarios[1] + " ; " + salarios[2];
        System.out.println(textoSalarios);

        System.out.println("Média Salarial: " + this.mediaSalarios());
    }

    public double mediaSalarios() {

        double somaSalarios = 0;
        for (double salario : this.salarios) {
            somaSalarios = somaSalarios + salario;
        }

        return somaSalarios / this.salarios.length;
    }
}
