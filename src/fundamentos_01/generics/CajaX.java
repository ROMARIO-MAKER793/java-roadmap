package fundamentos_01.generics;

public class CajaX<T> {

    private T[] items;

    public CajaX(){
      //  items = new T[10];
        items =(T[]) new Object[10];
    }

    /*
    En tiempo de ejecución, Java "borra" el tipo genérico y lo trata como Object por dentro
     (por compatibilidad con versiones viejas de Java). Por eso no puedes crear arrays ni instancias de
      T directamente.
     */
}
