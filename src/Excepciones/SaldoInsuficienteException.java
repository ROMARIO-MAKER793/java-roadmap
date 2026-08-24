package Excepciones;

public class SaldoInsuficienteException extends RuntimeException{

    private final double saldoActual;
    private final double montoSolicitado;

    public SaldoInsuficienteException(double saldoActual, double montoSolicitado){
        super("Saldo insuficiente : tienes " + saldoActual + " pero intentas retirar " + montoSolicitado);
        this.saldoActual = saldoActual;
        this.montoSolicitado = montoSolicitado;
    }

    public double getSaldoActual(){
        return  saldoActual;
    }

    public double getMontoSolicitado(){
        return  montoSolicitado;
    }

    public static void main(String[] args) {

        SaldoInsuficienteException saldo = new SaldoInsuficienteException(100,200);

        System.out.println(saldo.getMontoSolicitado());

    }
}
