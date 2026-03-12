package tom.sales.generics.test;

import tom.sales.generics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        Barco barco = new Barco("Carminha");
        List<Barco> barcosList = criarArrayComUmObjeto(barco);
    }

    private static <T> List<T> criarArrayComUmObjeto(T t) {
        List<T> list = new ArrayList<>();
        list.add(t);
        System.out.println(list);
        return list;
    }
}
