package tom.sales.generics.service;

import tom.sales.generics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));

    public Carro buscarCarroDisponivel() {
        System.out.println("Buscando carro disponível...");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro: " + carro);
        System.out.println("Carros disponíveis para alugar:");
        System.out.println(this.carrosDisponiveis);
        return carro;
    }

    public void retornarCarroAlugado(Carro carro) {
        System.out.println("Devolvendo carro " + carro);
        this.carrosDisponiveis.add(carro);
        System.out.println("Carros disponíveis para alugar:");
        System.out.println(this.carrosDisponiveis);
    }
}
