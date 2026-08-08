package fundamentos_01.Equals;

import fundamentos_01.Primitivos;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Producto {

    private String id;
    private String nombre;
    private double precio;

    public Producto(String id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(id, producto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    /*
        Con hashCode() (Búsqueda por Hash):
       1.- Java llama a p1.hashCode() y obtiene un número entero, por ejemplo 784521.
       2.-  Va directamente a la "cubeta" 784521.
       3.- Si la cubeta está vacía, sabe al instante que el objeto no existe (0 comparaciones pesadas).
       4.- Si hay algo en esa cubeta, recién ahí ejecuta equals() solo con los objetos de esa cubeta específica.

       En resumen: hashCode() sirve para filtrar rápido, y equals() sirve para confirmar la igualdad exacta.

     */

    @Override
    public String toString() {
        return "Producto{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    public static void main(String[] args) {

        Set<Producto> carrito = new HashSet<>();

        Producto p1 = new Producto("1","Galleta",12.5);
        Producto p2  = new Producto("2","Gaseosa",15.50);

        carrito.add(p1);
        carrito.add(p2);

        System.out.println("Cantidad de productos en carrito " + carrito.size());
        System.out.println("Contendio de carrito" + carrito);



    }
}
