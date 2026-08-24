package Excepciones;

public class WorkExcepcion extends  RuntimeException{
    private final int stockActual;
    private final int cantidadSolicitada;

    public WorkExcepcion(int stockActual , int cantidadSolicitada){
        super("El stock actual es : " + stockActual + " y la cantidad solicitada es : " + cantidadSolicitada);
        this.stockActual = stockActual;
        this.cantidadSolicitada = cantidadSolicitada;
    }


}
