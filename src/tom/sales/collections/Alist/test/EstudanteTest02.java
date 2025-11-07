package tom.sales.collections.Alist.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EstudanteTest02 {
    public static void main(String[] args) {
        System.out.println("Conversão List->Array");
        List<String> praias = new ArrayList<>();
        praias.add("Campeche");
        praias.add("Armação");
        praias.add("Lagonésia");

        String[] array = praias.toArray(new String[0]);
        System.out.println(array);


        System.out.println("Conversão Array->List");
        List<String> praiasList = Arrays.asList(array);
        System.out.println(praiasList);
    }
}
