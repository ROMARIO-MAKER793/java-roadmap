package colecciones_03;

import java.util.HashMap;
import java.util.Map;

public class InventarioMap {
    public static void main(String[] args) {

        Map<String, Integer> inventario = new HashMap<>();

        inventario.put("manzanas", 50);
        inventario.put("platanos", 30);
        inventario.put("manzanas", 80); // Esto sobreescribe el valor anterior

        System.out.println(inventario.get("manzanas"));  //80
        System.out.println(inventario.containsKey("uvas"));  // false
        System.out.println(inventario.getOrDefault("uvas", 0)); //0 , evita un null si no existe

        //Recorrer un Map(la forma mas comun y correcta)
        for (Map.Entry<String, Integer> entrada : inventario.entrySet()){
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }


    }
}
