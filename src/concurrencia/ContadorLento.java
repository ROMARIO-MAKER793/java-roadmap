package concurrencia;

import java.util.Objects;

public class ContadorLento {

    private int valor = 0;
    private final Object candado = new Object();

    public synchronized void incrementarLento(){

        try {
            Thread.sleep(10);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }

        valor++;
    }

    public void incrementarRapido(){
        try {
            Thread.sleep(10);
        } catch (InterruptedException e ){
            Thread.currentThread().interrupt();
        }

        synchronized (candado){
            valor++;
        }
    }


    public static void main(String[] args) throws InterruptedException {
        ContadorLento contador = new ContadorLento();

        long inicio = System.currentTimeMillis();

        Runnable tarea = () -> {
            for (int i = 0; i < 50 ; i++){
                contador.incrementarRapido();
            }
        };


        Thread hilo1 = new Thread(tarea);
        Thread hilo2 = new Thread(tarea);

        hilo1.start();
        hilo2.start();
        hilo1.join();
        hilo2.join();

        long fin = System.currentTimeMillis();
        System.out.println("Tiempo real: " + (fin - inicio) + "ms");
    }
}
