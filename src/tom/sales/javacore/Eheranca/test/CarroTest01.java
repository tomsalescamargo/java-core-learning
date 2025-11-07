package tom.sales.javacore.Eheranca.test;

import tom.sales.javacore.Eheranca.dominio.Carro;
import tom.sales.javacore.Eheranca.dominio.Veiculo;

public class CarroTest01 {
    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo("Hyundai", "Turbo GDI");
        veiculo.exibirInfo();

        Carro carro = new Carro("Chevrolet", "Onix", 4);
        carro.exibirInfo();

        System.out.println(Carro.getTotalVeiculos());
    }
}
