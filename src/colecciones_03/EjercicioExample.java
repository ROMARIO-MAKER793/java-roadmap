package colecciones_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EjercicioExample {

    public static void main(String[] args) {

        //Version mala
        List<String> nombres = new ArrayList<>(List.of("Ana","Julio" , "Jaime"));

        /*for (String nombre : nombres){
            if (nombre.equals("Ana")){
                nombres.remove(nombre);
            }
        }*/

       // System.out.println(nombres);
        //Version Buena aunque larga

        Iterator<String> it = nombres.iterator();

       while (it.hasNext()){
            if (it.next().equals("Julio")){
                it.remove();
            }
        }

        System.out.println(nombres);


        List<String> nombres2 = new ArrayList<>(List.of("Ana","Julio" , "Jaime"));
        //Version buena y corta

        nombres2.removeIf(nombre -> nombre.equals("Julio"));
        System.out.println(nombres2);
    }


}
