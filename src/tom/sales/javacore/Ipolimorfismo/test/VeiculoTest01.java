package tom.sales.javacore.Ipolimorfismo.test;

import tom.sales.javacore.Ipolimorfismo.dominio.Bicicleta;
import tom.sales.javacore.Ipolimorfismo.dominio.Carro;
import tom.sales.javacore.Ipolimorfismo.dominio.Veiculo;
import tom.sales.javacore.Ipolimorfismo.servico.CalculadoraCustoMensal;

public class VeiculoTest01 {
    public static void main(String[] args) {

        Veiculo carro = new Carro("Mitsubishi", 300, 0.6, 50);
        Veiculo bicicleta = new Bicicleta("BMX", 20, 0.01);
        Bicicleta bicicleta2 = new Bicicleta("Caloi", 30, 0.02);

        CalculadoraCustoMensal.calcularCustoMensal(carro);
        System.out.println("-----------");
        CalculadoraCustoMensal.calcularCustoMensal(bicicleta);
        System.out.println("-----------");
        CalculadoraCustoMensal.calcularCustoMensal(bicicleta2);
    }
}
