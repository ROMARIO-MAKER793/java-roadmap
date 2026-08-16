package colecciones_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrenteExample {
    public static void main(String[] args) {

        List<String > nombres = new ArrayList<>(List.of("Ana", "Luis", "Jaime"));

        // Version Mala

        /*for (String  nombre : nombres){
            if(nombre.equals("Luis")){
                nombres.remove(nombre);
            }
        }

        System.out.println(nombres);*/

        // Version buena, se explica que se hace
      /*  Iterator<String> it = nombres.iterator();
        while (it.hasNext()){
            if  (it.next().equals("Luis")){
                it.remove(); // Seguro el iterador sabe que se esta modificando
            }
        }

        System.out.println(nombres);*/

        // Version buena V2, minimalista xd
        nombres.removeIf(nombre -> nombre.equals("Luis"));

        System.out.println(nombres);
    }


}
