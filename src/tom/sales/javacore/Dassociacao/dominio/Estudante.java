package tom.sales.javacore.Dassociacao.dominio;

public class Estudante {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Estudante(String nome, int idade) {
        if (idade < 0) return;
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) return;
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return this.seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
