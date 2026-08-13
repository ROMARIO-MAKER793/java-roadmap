package POO_02;

public class NotificacionSms implements Notificable {
    @Override
    public void enviar(String mensaje) {
        System.out.println(mensaje);
    }

    @Override
    public void log() {
        Notificable.super.log();
    }

    public static void main(String[] args) {
        NotificacionSms sms = new NotificacionSms();

        sms.enviar("Mensaje desde NotificacionSms");
        sms.log();
    }
}
