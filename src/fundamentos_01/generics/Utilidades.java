package fundamentos_01.generics;

public class Utilidades {
    public static <T> void imprimirDosVeces(T elemento){
        System.out.println(elemento);
        System.out.println(elemento);
    }

    /*
    El <T> antes del tipo de retorno declara que ese método específico maneja su
     propio genérico, sin que la clase entera lo sea.
     */
}
