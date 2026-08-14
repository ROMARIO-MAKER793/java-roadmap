package POO_02;

import java.util.List;

public class EmpleadoFree implements FIchable{

   public void procesarNomina(List<FIchable> empleados){
       for(EmpleadoFree e : empleados){
           e.marcarAsistencia("8:00");
       }
   }

    public static void main(String[] args) {
        EmpleadoFree lancer = new EmpleadoFree();

        lancer.marcarAsistencia("Soy Free brother, no marca entrada");
    }
}
