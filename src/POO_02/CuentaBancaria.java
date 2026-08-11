package POO_02;

public class CuentaBancaria {
    /*
    public double saldo; // público, cualquiera lo cambia sin control

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.saldo = -5000; // nada lo impide, esto no debería ser posible nunca
    }*/

    private double saldo;

    public void retirar(double monto){
        if(saldo < monto){
            throw new IllegalArgumentException("Saldo insuficiente");
        }

        saldo -= monto;

    }

    public double getSaldo() {
        return saldo;
    }
}
