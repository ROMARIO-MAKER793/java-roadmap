package POO_02;

public class NotificacionesEmail implements Notificable{
    @Override
    public void enviar(String mensaje) {
        System.out.println(mensaje);
    }

    @Override
    public void log() {
        Notificable.super.log();
    }

    public static void main(String[] args) {
        NotificacionesEmail email = new NotificacionesEmail();

        email.enviar("Mensaje desde NotificacioneEmail");
        email.log();
    }
}
