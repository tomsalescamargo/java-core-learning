package tom.sales.javacore.Eheranca.dominio;

public class Veiculo {
    protected String marca;
    protected String modelo;
    private static int totalVeiculos = 0;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        Veiculo.totalVeiculos = Veiculo.totalVeiculos + 1;
    }

    public void exibirInfo() {
        System.out.println("--------");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public static int getTotalVeiculos() {
        return totalVeiculos;
    }
}
