package concurrencia;

import java.util.concurrent.locks.ReentrantLock;

public class Contara {
    private int valor = 0;
    private final ReentrantLock lock = new ReentrantLock();

    public void incrementar(){
        lock.lock();
        try {
            valor++;
        }finally {
            lock.unlock(); // SIEMPRE EN FINALLY
        }
    }
}
