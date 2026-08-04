package fundamentos_01.generics;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Par<T> {

    private T numero1;

    private T numero2;

    public void guardar (T numero1 , T numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void obtener()

    public void intercambiar (){

        T temporal =  numero1;

        numero1 = numero2;

        numero2 = temporal;

    }

    public static void  main(String[] args){
        Par<Integer> parNum = new Par<>();
        parNum.guardar(1,2);
        System.out.println(parNum);

        parNum.intercambiar();

        System.out.println(parNum);

    }






}
