package POO_02;

public class EmpleadoOficina extends  Empleado implements FIchable{

    private String entrada;

    @Override
    public void marcarAsistencia(String entrada) {
        this.entrada = entrada;

    }



}
