package tom.sales.generics.test;

import tom.sales.generics.dominio.Barco;
import tom.sales.generics.dominio.Carro;
import tom.sales.generics.service.BarcoRentavelService;
import tom.sales.generics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        // Códigos do CarroRentavelService e BarcoRentavelService praticamente iguais

        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando o carro por um mês...");
        carroRentavelService.retornarCarroAlugado(carro);

        System.out.println("------------");

        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando barco por um dia...");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}
