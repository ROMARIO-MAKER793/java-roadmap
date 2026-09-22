package Streams_Avanzados_06;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedAvanzado {

    private String nombre;
    private Integer cantidad;

    public SortedAvanzado(String nombre, Integer cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "SortedAvanzado{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }

    public static void main(String[] args) {

        List<SortedAvanzado> productos = List.of(
                new SortedAvanzado("Arroz", 15),
                new SortedAvanzado("Leche", 8),
                new SortedAvanzado("Ajinome", 10)

        );

        List<SortedAvanzado> ordenarPorPrecio = productos.stream()
                .sorted(Comparator.comparing(SortedAvanzado::getCantidad))
                .collect(Collectors.toList());

        System.out.println(ordenarPorPrecio);

        List<SortedAvanzado> ordenadosPorPrecioDesc = productos.stream()
                .sorted(Comparator.comparing(SortedAvanzado::getCantidad).reversed())
                .collect(Collectors.toList());

        System.out.println(ordenadosPorPrecioDesc);

        List<SortedAvanzado> ordenMulitple = productos.stream()
                .sorted(Comparator.comparing(SortedAvanzado::getCantidad))

    }
}
