package tom.sales.javacore.Ipolimorfismo.dominio;

public class Bicicleta extends  Veiculo {

    public Bicicleta(String marca, double distanciaPercorrida, double custoPorDistancia) {
        super(marca, distanciaPercorrida, custoPorDistancia);
    }

    @Override
    public double calcularCustoMensal() {
        System.out.println("Calculando custo da bicicleta");
        return this.distanciaPercorrida * custoPorDistancia + 10;
    }
}
