package POO_02;

public class EmpleadoOficina extends Empleado implements Fichable{

    private String entrada;

    @Override
    public void marcarAsistencia(String entrada) {
        System.out.println(entrada);
    }

    public static void main(String[] args) {
        EmpleadoOficina ofi = new EmpleadoOficina();

        ofi.marcarAsistencia("8:00 am");
    }
}
