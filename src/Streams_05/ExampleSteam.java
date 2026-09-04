package Streams_05;

import java.util.List;

public class ExampleSteam {

    public static void main(String[] args) {
        // List<String> nombres = List.of("Ana", "Carloss", "Beatriz", "David", "Elena");
        //List<String> resultado = new ArrayList<>();

        /*for (String nombre : nombres){
            if (nombre.length() > 4){

                resultado.add(nombre.toUpperCase());
            }
        }

        Collections.sort(resultado);*/

        /*List<String> resultado = nombres.stream()
                        .filter(nombre -> nombre.length() > 4)
                                .map(String::toUpperCase)
                                        .sorted()
                                                .collect(Collectors.toList());

        System.out.println(resultado);

*/
        List<Integer> numeros = List.of(1,2,3,4,5);
        int suma = numeros.stream()
                .reduce(0,(acum , actual) -> acum + actual);

        System.out.println(suma);
    }

}
