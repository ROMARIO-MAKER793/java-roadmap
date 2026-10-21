package concurrencia;

import java.util.concurrent.atomic.AtomicInteger;

public class CasManual {
    public static void main(String[] args) throws InterruptedException {

        AtomicInteger valor = new AtomicInteger();

        Runnable tarea = () -> {
            for (int i = 0 ; i < 1000 ; i++){
                int actual;
                do {
                    actual = valor.get();

                } while (!valor.compareAndSet(actual,actual + 1));
            }
        };

        Thread hilo1 = new Thread(tarea);
        Thread hilo2 = new Thread(tarea);
        hilo1.start();
        hilo2.start();
        hilo1.join();
        hilo2.join();

        System.out.println(valor.get()); // 2000
    }
}
