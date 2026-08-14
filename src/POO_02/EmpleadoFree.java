package POO_02;

import java.util.List;

public class EmpleadoFree extends Empleado{

   public void procesarNomina(List<Empleado> empleados){
       for(Empleado e : empleados){
           e.marcarAsitencia("8:00");
       }
   }

    public static void main(String[] args) {
        EmpleadoFree lancer = new EmpleadoFree();

        lancer.marcarAsitencia("Soy Free brother, no marca entrada");
    }
}
