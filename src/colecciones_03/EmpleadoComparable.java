package colecciones_03;

import POO_02.Empleado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmpleadoComparable implements  Comparable<EmpleadoComparable> {

    private String nombre;
    private int edad;

    public EmpleadoComparable(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public int compareTo(EmpleadoComparable o) {
        return Integer.compare(this.edad , o.edad);
    }

    @Override
    public String toString() {
        return "EmpleadoComparable{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    public static void main(String[] args) {

        List<EmpleadoComparable> empleados  = new ArrayList<>();

        empleados.add(new EmpleadoComparable("Carlos", 15));
        empleados.add(new EmpleadoComparable("Ana", 20));
        empleados.add(new EmpleadoComparable("Julio", 18));

        /*
        System.out.println("Antes");
        empleados.forEach(System.out::println);

        Collections.sort(empleados);
        System.out.println("\n Despues: ");
        empleados.forEach(System.out::println);*/

       // EmpleadoComparable ana = new EmpleadoComparable("Ana", 20);
       // EmpleadoComparable julio = new EmpleadoComparable("Julio", 30);

        /*
        Integer.compare(this.edad, otro.edad)

        negativo  → this va antes que otro
        0         → son iguales para este criterio de orden
        positivo  → this va después que otro


        Empleado ana = new Empleado("Ana", 22);
        Empleado luis = new Empleado("Luis", 30);

        System.out.println(ana.compareTo(luis));

        Te dará un número negativo.

        No necesitas memorizar el número exacto. Lo importante es:

        negativo = Ana va antes que Luis.
         */

       // System.out.println(ana.compareTo(julio));


        // === COMPARATOR() ===== //

        Comparator<EmpleadoComparable> porNombre = Comparator.comparing(EmpleadoComparable::getNombre);
        empleados.sort(porNombre);
        empleados.forEach(System.out::println);



    }
}
