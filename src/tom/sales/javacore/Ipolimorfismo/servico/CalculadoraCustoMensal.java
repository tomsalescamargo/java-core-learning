package tom.sales.javacore.Ipolimorfismo.servico;

import tom.sales.javacore.Ipolimorfismo.dominio.Carro;
import tom.sales.javacore.Ipolimorfismo.dominio.Veiculo;

public class CalculadoraCustoMensal {

    public static void calcularCustoMensal(Veiculo veiculo) {
        System.out.println("Relatório do Veículo");
        int custoMensal = (int) veiculo.calcularCustoMensal();
        System.out.println("Marca: " + veiculo.getMarca());
        System.out.println("Distância percorrida: " + veiculo.getDistanciaPercorrida() + " km");
        System.out.println("Custo por km: " + veiculo.getCustoPorDistancia());

        if (veiculo instanceof Carro) {
            Carro carro = (Carro) veiculo;
            System.out.println("Preço do seguro: " + carro.getPrecoSeguro());
        }

        // Treinando casting primitivo
        System.out.println("Custo mensal (incluso manutenção): R$" + custoMensal + ",00");
    }
}
