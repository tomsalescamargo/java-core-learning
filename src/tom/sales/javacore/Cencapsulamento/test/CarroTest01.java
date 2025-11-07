package tom.sales.javacore.Cencapsulamento.test;

import tom.sales.javacore.Cencapsulamento.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        // Carro 1
        Carro carro1 = new Carro();
        carro1.setNomeDoDono("Tom");
        carro1.setMarca("Chevrolet Onix");
        carro1.setAno(2018);
        carro1.setVelocidadeMaxima(250);
        carro1.exibirInfo();

        // Carro 2
        Carro carro2 = new Carro("Carla", "Hyundai Turbo Gdi", 2022);
        carro2.exibirInfo();

        // Carro 3
        Carro carro3 = new Carro("Vô João", "Sonic", 2016, 300);
        carro3.exibirInfo(false);
    }
}
