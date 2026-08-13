package POO_02;

public interface Notificable {

    void enviar(String mensaje);

    default void log(){
        System.out.println("Mensaje por Defecto, Dios es bueno");
    }



}
