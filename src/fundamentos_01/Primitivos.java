package fundamentos_01;

public class Primitivos {

    public static void main(String[] args) {

        /*Tipos primitivos :
        byte, short , int , long , float , double , boolean , char

    Wrapper:

    Primitivo

    int --> Integer
    double --> Double
    boolean --> Boolean
    char --> Character
    long --> Long


    ¿ Porque usar wrapers?

    Porque java es un lenguaje orientado a objetos y las estructuras
    de java, solo trabajan con objetos, nunca con primitivos directament.
    */
        //Si pruebas con 127, a == b te va a dar true porque Java optimiza y
        // guarda en caché los números del -128 al 127.
        Integer a = 127;
        Integer b = 127;


        Integer c = 128;
        Integer d = 128;

        System.out.println(a == b);
        System.out.println(c == d);

    /*
    ¿Porque?
    Java cachea los objetos Integer entre -128 y 127 por eficiencia, fuera de ese rango, cada integer
    es un objeto nuevo en memoria, por eso a == b compara la misma referencia cacheada(true), pero
    c == d, compara dos objetos distintos en memoria (false), aunque el valor sea igual
     */

    }

}
