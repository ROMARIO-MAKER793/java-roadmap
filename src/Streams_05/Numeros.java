package Streams_05;

import java.util.List;

public class Numeros {

    public static void main(String[] args) {

        List<Integer> numeros = List.of(3,7,2,9,4,1,8);

        int numeroMayor = numeros.stream()
                        .reduce(0,(acum,actual) -> actual > acum ? actual : acum);
        System.out.println(numeroMayor);
    }
}
