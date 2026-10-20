package concurrencia;

import java.util.concurrent.atomic.AtomicInteger;

public class ContadorAtomico {

    private final AtomicInteger valor = new AtomicInteger();

    public void incrementar(){
        valor.incrementAndGet(); // leer  +  sumar + guardar, como una sola operacion
    }

    public int getValor(){
        return valor.get();
    }

    public static void main(String[] args) throws InterruptedException {

        ContadorAtomico contador = new ContadorAtomico();

        Runnable tarea = () -> {
            for (int i = 0; i < 1000 ; i++){
                contador.incrementar();
            }
        };

        Thread hilo1 = new Thread(tarea);
        Thread hilo2 = new Thread(tarea);

        hilo1.start();
        hilo2.start();

        hilo1.join();
        hilo2.join();

        System.out.println(contador.getValor());

    }
}
