package tom.sales.collections.Alist.dominio;

import java.util.ArrayList;
import java.util.List;

public class Estudante {
    private String nome;
    private final String cpf;
    private List<String> materias = new ArrayList<>();

    public Estudante(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;

        if (this.getClass() != obj.getClass()) return false;
        Estudante estudante = (Estudante) obj;
        return this.cpf != null && this.cpf.equals(estudante.getCpf());
    }

    @Override
    public int hashCode() {
        return this.cpf == null ? 0 : this.cpf.hashCode();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public List<String> getMaterias() {
        return materias;
    }
}
