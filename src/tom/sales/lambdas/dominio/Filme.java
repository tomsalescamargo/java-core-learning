package tom.sales.lambdas.dominio;

public class Filme {
    private String titulo;
    private int quantity;

    public Filme(String titulo, int quantity) {
        this.titulo = titulo;
        this.quantity = quantity;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "titulo='" + titulo + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
