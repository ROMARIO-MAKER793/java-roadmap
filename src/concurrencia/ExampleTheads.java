package concurrencia;

public class ExampleTheads {

    public static void main(String[] args) {
        ExampleTheads threads = new ExampleTheads();

        Runnable tarea = () -> {
            for(int i = 0 ;  i < 3 ; i++){
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread hilo1 = new Thread(tarea);
        Thread hilo2 = new Thread(tarea);
        Thread hilo3 = new Thread(tarea);

        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
