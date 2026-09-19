package Streams_05;

import java.util.HashMap;
import java.util.Map;

public class StreamsHashMap {

    public static void main(String[] args) {

        Map<String, Integer> inventario = new HashMap<>();

        inventario.put("Manzana", 10);
        inventario.put("Platano", 8);
        inventario.put("Pera", 4);


         inventario.entrySet().stream()
                 .filter(producto -> producto.getValue() > 5)
                 .forEach(System.out::println);

    }
}
