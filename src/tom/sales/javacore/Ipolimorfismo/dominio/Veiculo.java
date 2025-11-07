package tom.sales.javacore.Ipolimorfismo.dominio;

public abstract class Veiculo implements CustoMensal {

    protected String marca;
    protected double distanciaPercorrida;
    protected double custoPorDistancia;

    public Veiculo(String marca, double distanciaPercorrida, double custoPorDistancia) {
        this.marca = marca;
        this.distanciaPercorrida = distanciaPercorrida;
        this.custoPorDistancia = custoPorDistancia;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getDistanciaPercorrida() {
        return this.distanciaPercorrida;
    }

    public void setDistanciaPercorrida(double distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public double getCustoPorDistancia() {
        return custoPorDistancia;
    }

    public void setCustoPorDistancia(double custoPorDistancia) {
        this.custoPorDistancia = custoPorDistancia;
    }
}
