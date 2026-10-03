package concurrencia;

import java.util.concurrent.locks.ReentrantLock;

public class ContadorWeek {

    private int valor = 0;

    public synchronized void incrementar() {
        valor++;
    }

    public synchronized int getValor() {
        return valor;
    }

    private final ReentrantLock lock = new ReentrantLock();

    public void incrementarcito() {
        lock.lock();
        try {
            valor++;
        } finally {
            lock.unlock(); // SIEMPRE en finally
        }
    }

}
