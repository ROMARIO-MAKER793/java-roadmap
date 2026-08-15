package colecciones_03;

import java.util.ArrayList;
import java.util.List;

public class Frutas {

    public static void main(String[] args) {

        List<String> frutas = new ArrayList<>();

        frutas.add("Melon");
        frutas.add("Fresa");
        frutas.add("Melon");

        System.out.println(frutas);
        System.out.println(frutas.get(0));
        System.out.println(frutas.size());
        frutas.remove("Fresa");
        System.out.println(frutas);


        for (String fruta : frutas){
            System.out.println(fruta);
        }

        System.out.println(frutas.get(10));

    }
}
