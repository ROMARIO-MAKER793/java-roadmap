package Introduccion_0;

public class StringInmutabilidad {

    public static void main(String[] args) {

        /*
    ¿Porque String es inmutable?

    Sobre String inmutable + StringBuilder
    Tu intuición práctica está bien, pero te faltaba el "por qué" — aquí está:

    Seguridad: los Strings se usan como contraseñas, rutas de archivos, nombres de clases a cargar. Si fueran mutables,
    algo o alguien podría cambiarlos después de haberlos validado.
    Thread-safety automático: un objeto que nunca cambia no necesita sincronización entre hilos, porque no hay riesgo
    de que dos hilos lo modifiquen a la vez.
    Habilita el String Pool de forma segura: si los Strings fueran mutables, dos variables apuntando al mismo literal
    en el pool se afectarían entre sí al modificar una — sería un caos. La inmutabilidad permite compartir el mismo
     objeto sin miedo.

    <-- Mi explicacion -->
    porque no se puede modificar debido a que la mayoria de datos son String, si fuera mutable alquien podria modificar
    en la mitad de ejecucion y alterar el sistema, es por eso que si se modifica ese String, java automaticamente
    crea un nuevo objeto en memoria, y asi evita que una variable pueda modificar otras variabeles que dependan de este.

     */

        String c = "Hola";

        String referenciaOriginal = c;

        c = c + " Mundo";

        System.out.println("Valor actual de c : " + c);
        System.out.println("Valor de la original : " + referenciaOriginal);

        if( c == referenciaOriginal){
            System.out.println("Son el mismo objeto (Mutable)");
        } else {
            System.out.println("¡Son objetos DIFERENTES en memoria! (Inmutable)");
        }

        /*
        String resultado = "";
        for (int i = 0; i < 10000; i++) {
            resultado = resultado + i; // crea 10,000 objetos String intermedios, ineficiente
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append(i); // modifica el MISMO objeto, no crea uno nuevo cada vez
        }
        String resultado = sb.toString();
         */

    }

}
