package Excepciones;

public class Cuenta {

    private double saldoActual;

    public Cuenta(double saldoActual){
        this.saldoActual = saldoActual;
    }

    public void retirar(double monto){
        if(monto > saldoActual){
            throw new SaldoInsuficienteException(saldoActual,monto);
        }

        saldoActual -= monto;
    }

    public static void main(String[] args) {

        Cuenta cuentita = new Cuenta(500);

        try {
            cuentita.retirar(600);
        }catch (SaldoInsuficienteException e){
            System.out.println(e.getMessage());
            System.out.println("Te faltan: " + (e.getMontoSolicitado() - e.getSaldoActual()));
        }
    }
}
