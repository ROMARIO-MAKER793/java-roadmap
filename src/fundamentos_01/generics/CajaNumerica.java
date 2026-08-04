package fundamentos_01.generics;

import java.util.List;

public class CajaNumerica<T extends Number> {
    /*
    Sin el extends Number, el compilador no sabría que T tiene el método
    doubleValue()  podría ser cualquier cosa. extends aquí también sirve para interfaces, no solo herencia.
     */
    private T numero;

    public double alCuadrado(){
        return numero.doubleValue() * numero.doubleValue();
        //Funciona porque Number GARANTIZA doublValue();
    }

    public static double sumar(List<? extends  Number> numeros){

        double total = 0;

        for(Number n: numeros)
            total += n.doubleValue(); // Leer todo bien
            //numeros.add(1); No compila, no puedes escribir, el compilador no sale el tipo
        return total;

    }


    public static void llenarConEnteros(List<? super Integer> lista ){
        lista.add(1);
        lista.add(5); //Escribir, ok , porque integer es compatible
    }



}
