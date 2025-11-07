package tom.sales.javacore.Aclasses.test;

import tom.sales.javacore.Aclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro turboGDI = new Carro();
        Carro onix = new Carro();

        turboGDI.nome = "Turbo GDI Carla";
        turboGDI.modelo = "Hyunday";
        turboGDI.ano = 2020;

        onix.nome = "Onix Tom";
        onix.modelo = "Onix";
        onix.ano = 2026;

        System.out.println("Nome: " + turboGDI.nome + " - Modelo: " + turboGDI.modelo + " - Ano: " + turboGDI.ano);
        System.out.println("Nome: " + onix.nome + " - Modelo: " + onix.modelo + " - Ano: " + onix.ano);
    }
}
