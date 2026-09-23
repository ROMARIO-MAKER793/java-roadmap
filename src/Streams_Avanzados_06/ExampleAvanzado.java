package Streams_Avanzados_06;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleAvanzado {

    private String nombre;
    private Integer precio;


    public ExampleAvanzado(String nombre, Integer precio) {
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
        return "ExampleAvanzado{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    public static void main(String[] args) {

        List<ExampleAvanzado> productos = List.of(
                new ExampleAvanzado("Arroz",15),
                new ExampleAvanzado("Leche", 8),
                new ExampleAvanzado("Ajinome", 10)

        );

        List<ExampleAvanzado> precioMayorAMenor = productos.stream()
                .sorted(Comparator.comparing(ExampleAvanzado::getPrecio).reversed())
                .collect(Collectors.toList());

        System.out.println(precioMayorAMenor);
    }
}
