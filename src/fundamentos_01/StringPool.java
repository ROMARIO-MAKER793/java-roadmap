package fundamentos_01;

public class StringPool {

    public static void main(String[] args) {

        /*
    Es una Zona especial de heap donde java guarda los literales de String para reutilzarlos
    */

        String a  = "Hola";
        String b = "Hola";

        System.out.println( a == b); //true porque ambos apuntan al mismo literal en el PoolString

        String c = new String("Hola");
        System.out.println(a == c);
        System.out.println(a.equals(c));

    }

}
