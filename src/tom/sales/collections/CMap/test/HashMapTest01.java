package tom.sales.collections.CMap.test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest01 {
    public static void main(String[] args) {
        // Dicionário chave:valor
        // Exemplo: Corretor Automático
        Map<String, String> map = new HashMap<>();
        map.put("vc", "você");
        map.put("tbm", "também");
        map.put("mouze", "mouse");
        map.put("tbm", "também2"); // *Sobrescreve
        map.putIfAbsent("tbm", "também3"); // *Não insere, duplicado
        System.out.println(map);

        System.out.println("-------------");
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        System.out.println("-------------");
        for (String value: map.values()) {
            System.out.println(value);
        }

        System.out.println("-------------");
        for (Map.Entry<String,String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
