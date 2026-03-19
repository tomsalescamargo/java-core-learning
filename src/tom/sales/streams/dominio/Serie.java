package tom.sales.streams.dominio;

import java.util.Objects;

public class Serie {
    private String titulo;
    private Integer numberOfEpisodes;
    private Categoria categoria;

    public Serie(String titulo, Integer numberOfEpisodes) {
        this.titulo = titulo;
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public Serie(String titulo, Integer numberOfEpisodes, Categoria categoria) {
        this.titulo = titulo;
        this.numberOfEpisodes = numberOfEpisodes;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(titulo, serie.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(titulo);
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numberOfEpisodes=" + numberOfEpisodes +
                ", categoria=" + categoria +
                '}';
    }
}
