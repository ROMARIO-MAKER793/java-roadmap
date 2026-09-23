package Streams_Avanzados_06;

import java.util.Comparator;
import java.util.List;

public class ExampeGrouping {

    private String nombre;
    private Integer precio;
    private String categoria;

    public ExampeGrouping(String nombre, Integer precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "ExampeGrouping{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", categoria='" + categoria + '\'' +
                '}';
    }

    public static void main(String[] args) {

        List<ExampeGrouping> listaProductos = List.of(
                 new ExampeGrouping ("Arroz", 15 , "Granos"),
                 new ExampeGrouping ("Leche", 10 , "Lacteos"),
                 new ExampeGrouping ("Pollo", 25 , "Fast Food"),
                 new ExampeGrouping ("Salchipapa", 20 , "Fast Food"),
                 new ExampeGrouping ("Champoo Ego", 18 , "Higiene"),
                 new ExampeGrouping ("Desodorante", 25 , "Corporal")
        );


        List<ExampeGrouping> productosCategoria = listaProductos.stream()
                .sorted(Comparator.comparing())
    }
}
