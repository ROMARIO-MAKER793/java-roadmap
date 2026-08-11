package POO_02;

public class PrincipalPoli {

    public void pagar(MetodoPago metodo , double monto){

        metodo.procesar(monto);

    }

    public static void main(String[] args) {
        PrincipalPoli prueba = new PrincipalPoli();
        TarjetaCredito visa = new TarjetaCredito();
        Yape bcp = new Yape();

        prueba.pagar(bcp, 150.00);

    }
}
