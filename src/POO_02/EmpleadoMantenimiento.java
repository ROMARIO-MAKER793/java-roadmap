package POO_02;

public class EmpleadoMantenimiento extends Empleado{

    @Override
    public void horario() {
        System.out.println("Nosotros trabajamos hasta Sabados, SUPER F");
    }

    public static void main(String[] args) {
        EmpleadoMantenimiento explotado = new EmpleadoMantenimiento();

        explotado.horario();
    }
}
