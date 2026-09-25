package concurrencia;

public class HolaThread extends Thread{

    @Override
    public void run(){
        System.out.println("Hola desde: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        /*HolaThread hilo = new HolaThread();
        hilo.start();
        System.out.println("Hello at : " + Thread.currentThread().getName());*/

        Runnable tarea = () -> System.out.println("Ejecutando: " + Thread.currentThread().getName());
        Thread hilo = new Thread(tarea);
        hilo.start();
    }
}
