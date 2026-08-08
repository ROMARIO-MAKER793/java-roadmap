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
