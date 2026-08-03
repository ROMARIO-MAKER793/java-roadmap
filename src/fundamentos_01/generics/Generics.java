package fundamentos_01.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    public static void main(String[] args) {

        /* List lista = new ArrayList();

        lista.add("texto");
        lista.add(42); // esto compilaba, aunque mezclar tipos así es un error de diseño

        System.out.println(lista);

        String texto = (String) lista.get(0); // casting manual obligatorio
        Integer numero = (Integer) lista.get(1);

        String otro = (String) lista.get(1); // compila, pero explota en RUNTIME: ClassCastException
        */

        List<String> lista = new ArrayList<>();

        lista.add("texto");
        lista.add("");
    }

}
