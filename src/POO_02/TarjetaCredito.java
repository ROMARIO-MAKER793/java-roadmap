package POO_02;

public class TarjetaCredito extends MetodoPago {
    public void procesar(double monto){
        System.out.println("Cobrando " + monto + " a tarjeta");
    }
}
