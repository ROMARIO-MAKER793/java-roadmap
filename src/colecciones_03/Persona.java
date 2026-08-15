package colecciones_03;

import java.util.HashSet;
import java.util.Set;


public class Persona {
    public static void main(String[] args) {

        Set<String> name = new HashSet<>();

        name.add("Carlos");
        name.add("Ana");
        name.add("Carlos");

        System.out.println(name.size());
        System.out.println(name.contains("Ana"));

        /*
        No hay .get(indice) en Set — no tiene orden garantizado por índice,
         solo puedes recorrerlo con for-each o preguntar .contains().
         */


    }
}
