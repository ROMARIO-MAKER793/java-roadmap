package Excepciones_04;

public class PruebaConTry implements AutoCloseable{

    public void usar(){
        System.out.println("Ejecutnado un metodo");

        throw new RuntimeException("boom");
    }

    @Override
    public void close()  {
        System.out.println("Cerrandome automaticamente xd");
    }


    public static void main(String[] args) {
        try(PruebaConTry prueba = new PruebaConTry()) {
            prueba.usar();
        }
    }
}
