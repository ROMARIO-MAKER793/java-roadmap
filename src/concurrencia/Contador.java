package concurrencia;

public class Contador {
    private int valor=0;

    public void incrementar(){
        valor++;
    }

    public int getValor(){
        return valor;
    }

    public static void main(String[] args) throws InterruptedException {
        Contador contador = new Contador();

        Runnable tarea = () -> {
            for (int i = 0; i < 1000; i++){
                contador.incrementar();
            }
        };

        Thread hilo1  = new Thread(tarea);
        Thread hilo2  = new Thread(tarea);

        hilo1.start();
        hilo2.start();

        hilo1.join();
        hilo2.join();

        System.out.println(contador.getValor());
    }




}


