package concurrencia;

import java.util.concurrent.atomic.AtomicInteger;

public class CuentasMalas {

    private final AtomicInteger cuentaA = new AtomicInteger(1000);
    private final AtomicInteger cuentaB = new AtomicInteger(1000);

    public void transferir(){
        cuentaA.decrementAndGet();
        cuentaB.incrementAndGet();
    }

    public int total(){
        return cuentaA.get() + cuentaB.get(); //Debe darme 200
    }

    public static void main(String[] args) throws InterruptedException {

        CuentasMalas cuentas = new CuentasMalas();

        Runnable transferencias = () -> {
            for (int i = 0; i < 100_000 ; i++){
                cuentas.transferir();
                }
            };

        //Un hilo audita el total mientras se transfiere
        Thread auditor = new Thread(() -> {
            int inconsistencias = 0;
            for (int i = 0; i<100_000 ; i++){
                if (cuentas.total() != 2000){
                    inconsistencias++;
                }
            }
            System.out.println("Veces que el total No fue 2000: " + inconsistencias);
        });

        Thread t1 = new Thread(transferencias);
        Thread t2 = new Thread(transferencias);

        t1.start();
        t2.start();
        auditor.start();
        t1.join();
        t2.join();
        auditor.join();

        System.out.println("Total final: " + cuentas.total()); // al final sí da 2000


    }



}
