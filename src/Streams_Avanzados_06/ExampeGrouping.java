package Streams_Avanzados_06;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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


        Map<String ,Long> conteoPorCategoria = listaProductos.stream()
                .collect(Collectors.groupingBy(ExampeGrouping::getCategoria, Collectors.counting()));

        conteoPorCategoria.entrySet().stream()
                .forEach(System.out::println);

        String nombres = listaProductos.stream()
                .map(ExampeGrouping::getNombre)
                .collect(Collectors.joining(","))
                        .toUpperCase();
        System.out.println("Lista de nombres con Joining");
        System.out.println(nombres);

    }
}
