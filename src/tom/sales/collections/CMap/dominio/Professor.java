package tom.sales.collections.CMap.dominio;

import java.util.Objects;
import java.util.StringJoiner;
import java.util.concurrent.ThreadLocalRandom;

public class Professor implements Comparable<Professor>{
    private String nome;
    private int id;

    public Professor(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Professor that = (Professor) o;
        return Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.id);
    }

    @Override
    public int compareTo(Professor that) {
        return this.nome.compareTo(that.nome);
    }

    public String getNome() {
        return this.nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
}
