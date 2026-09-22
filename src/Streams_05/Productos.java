package Streams_05;


import java.util.List;
import java.util.stream.Collectors;

public class Productos {

    public static void main(String[] args) {

        List<String> productos = List.of("laptop", "mouse" , "teclado", "monitor" , "audifonos",  "webcam");

        List<String> lista = productos.stream()
                .filter(n -> n.length() > 6)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(lista);

    }
}
