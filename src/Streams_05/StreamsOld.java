package Streams_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamsOld {

    public static void main(String[] args) {

        List<String> nombres = List.of("Ana", "Carloss", "Beatriz", "David", "Elena");
        List<String> resultado = new ArrayList<>();

        for (String nombre : nombres){
            if (nombre.length() > 3){
                resultado.add(nombre.toUpperCase());
            }
        }

        Collections.sort(resultado);
        System.out.println(resultado);

    }
}
