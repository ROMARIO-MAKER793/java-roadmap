package concurrencia;

import java.time.Instant;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class ConcurrenciaAvanzado {

    record TareaResult(int id ,String threadName, double ejecucionSegundos){

    }

    public static void main(String[] args) {
        System.out.println("Inicio de concurrencia en Java");
        Instant inicio = Instant.now();

        int totalTareas = 10;
        CountDownLatch latch = new CountDownLatch(totalTareas);
        AtomicReference<Double> tiempoMaximoProcesado = new AtomicReference<>(0.0);

        try( var executor = Executors.newVirtualThreadPerTaskExecutor()) {

        }
    }

}
