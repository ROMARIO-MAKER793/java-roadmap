package fundamentos_01.generics;

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

}
