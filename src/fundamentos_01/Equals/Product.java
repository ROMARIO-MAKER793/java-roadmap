package fundamentos_01.Equals;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Product {

    private String id;
    private String nombre;

    public Product(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Sobrescribimos equals() usando 'id'
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product producto = (Product) o;
        return Objects.equals(id, producto.id);
    }

    // ❌ ERROR GRAVE: Olvidamos sobrescribir hashCode()
    // Hereda el hashCode() por defecto de Object (basado en la memoria RAM)

    public static void main(String[] args) {
        Set<Product> carrito = new HashSet<>();

        Product p1 = new Product("PROD-01", "Laptop");
        Product p2 = new Product("PROD-01", "Laptop");

        carrito.add(p1);

        // Intentamos buscar si p2 (que tiene la misma id 'PROD-01') está en el carrito
        boolean existe = carrito.contains(p2);

        System.out.println("¿El producto está en el carrito?: " + existe);
        // Imprime: ¿El producto está en el carrito?: false  <-- ❌ ¡ERROR GRAVE!
    }
}
