package tom.sales.javacore.Ipolimorfismo.dominio;

public class Carro extends Veiculo {

    private final double precoSeguro;

    public Carro(String marca, double distanciaPercorrida, double custoPorDistancia, double precoSeguro) {
        super(marca, distanciaPercorrida, custoPorDistancia);
        this.precoSeguro = precoSeguro;
    }

    @Override
    public double calcularCustoMensal() {
        System.out.println("Calculando custo do carro");
        return this.distanciaPercorrida * custoPorDistancia + this.precoSeguro + 100;
    }

    public double getPrecoSeguro() {
        return precoSeguro;
    }
}
