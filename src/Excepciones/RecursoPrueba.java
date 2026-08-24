package Excepciones;

public class RecursoPrueba implements AutoCloseable {

    public void usar(){
        System.out.println("Usando recurso...");
    }


    @Override
    public void close()  {
        System.out.println("Cerrando recurso automaticamente");
    }

    public static void main(String[] args) {

        try(RecursoPrueba recurso = new RecursoPrueba()){
            recurso.usar();
        }
    }
}
