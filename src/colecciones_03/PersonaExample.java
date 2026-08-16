package colecciones_03;

import java.util.*;

public class PersonaExample {
    public static void main(String[] args) {
        /*List<String> nombres = new ArrayList<>();

        nombres.add("Robert");
        nombres.add("Ana");
        nombres.add("Julio");
        nombres.add("Cecilia");
        nombres.add("Cesar");

        System.out.println(nombres);
        System.out.println(nombres.get(1));

        nombres.remove("Ana");
        System.out.println(nombres);
        nombres.remove(2);
        System.out.println(nombres);*/

       /* Set<String> nombres = new HashSet<>();

        nombres.add("Ana");
        nombres.add("Ana");

        System.out.println(nombres);
        System.out.println(nombres.size());*/

        Map<String, Integer> productos = new HashMap<>();

        System.out.println("Productos Disponibles");
        productos.put("Leche", 5);
        productos.put("Arroz", 7);
        productos.put("Aceite", 2);
        productos.put("Atun", 11);

        for(Map.Entry<String, Integer> salida : productos.entrySet()){
            System.out.println(salida.getKey() + ": " + salida.getValue());
        }






    }
}
