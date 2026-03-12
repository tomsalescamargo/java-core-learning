package tom.sales.generics.test;

import tom.sales.generics.dominio.Barco;
import tom.sales.generics.dominio.Carro;
import tom.sales.generics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

        // Uma classe genérica que trata Carro e Barco -> Reutilização de Código
        // Se amanhã criarmos Moto, é só trocar o tipo genérico: RentalService<Moto> e já vai funcionar
        RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);

        Carro carro = rentalService.buscarObjetoDisponivel();
        System.out.println("Usando o carro por um mês");
        rentalService.retornarObjetoAlugado(carro);
    }
}
