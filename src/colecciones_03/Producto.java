package colecciones_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Producto  implements Comparable<Producto>{
    
    private String nombre;
    private Integer precio;

    public Producto(String nombre, Integer precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public int compareTo(Producto o) {
        return Integer.compare(this.precio , o.precio);
    }

    public static void main(String[] args) {
        List<Producto> inventario = new ArrayList<>();

       inventario.add(new Producto("Arroz",15));
        inventario.add(new Producto("Leche",5));
        inventario.add(new Producto("Ajinomen",8));

        Collections.sort(inventario);

        inventario.forEach(System.out::println);


        Comparator<Producto> porNombre = Comparator.comparing(Producto::getNombre);
        inventario.sort(porNombre);

        inventario.forEach(System.out::println);


    }


}
