package fundamentos_01.Equals;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Persona {
    private String nombre;
    private int edad;
    // constructor, getters...

    public Persona(String nombre , int edad){
        this.nombre = nombre;
        this.edad   = edad;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;                        // misma referencia, atajo rápido
        if (obj == null || getClass() != obj.getClass()) return false; // tipo distinto, no son iguales
        Persona otra = (Persona) obj;
        return edad == otra.edad && Objects.equals(nombre, otra.nombre);
    }

    @Override
    public int hashCode(){
        return Objects.hash(nombre,edad);
    }

     /*
     Si dos objetos tienen el mismo hashCode(), no necesariamente son iguales (colisión),
     pero ayuda a estructuras como HashMap o HashSet a buscarlos rápido.
     */

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    public static void main(String[] args) {

        Persona p1 = new Persona("Carlos", 30);
        Persona p2 = new Persona("Carlos", 30);

        System.out.println(p1 == p2);       // false -> son objetos distintos en memoria
        System.out.println(p1.equals(p2));  // false !!! aunque tengan los mismos datos

        /*
        ¿Por qué .equals() da false si los datos son idénticos? Porque el .equals() que hereda Object por defecto hace exactamente
         lo mismo que ==: compara referencias de memoria, no contenido. Solo clases como String o Integer
         lo sobreescriben para comparar valor. Las tuyas, si no dices nada, se comportan igual que comparar con ==.
         */

        Set<Persona> personas = new HashSet<>();
        personas.add(new Persona("carlos", 30));

        System.out.println(personas.contains(new Persona("Carlos" , 30)));
        // true SI sobreescribiste equals+hashCode correctamente
        // false SI no lo hiciste (aunque los datos sean idénticos)
    }

}







