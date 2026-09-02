package Excepciones_04;

public class JustCladue {

    private final double saldoActual;
    private final double montoSolicitado;


    public JustCladue(double saldoActual, double montoSolicitado) {

        this.saldoActual = saldoActual;
        this.montoSolicitado = montoSolicitado;
    }

    public double getSaldoActual() { return saldoActual; }
    public double getMontoSolicitado() { return montoSolicitado; }
}
