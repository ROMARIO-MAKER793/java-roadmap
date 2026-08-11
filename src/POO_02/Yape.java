package POO_02;

public class Yape extends MetodoPago {

    @Override
    public void procesar(double monto) {
        System.out.println("Cobrando " + monto + " via Yape");
    }
}
