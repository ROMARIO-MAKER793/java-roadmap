package Introduccion_0;

public class StackHeap {

    /*
    Stack vs Heap

    Stack --> donde viven las variables primitivas locales y referencias a objetos(No los objetos en si).
    Es rápido, se limpia automaticamenten cuando el metodo termina.

    Heap --> donde viven los objetos reales (Instanacia de clases, incluyendo Strings y Wrappers).
    Lo admiministra el garbage colecctor.

    Cuando dices String a == b , no estas copiando el texto, estas copiando la direccion (referencia),
    que apunta al mismo objeto en el heap
     */

    int x = 5;              // x vive en el Stack, valor puro
    String texto = "hola";  // la REFERENCIA "texto" vive en el Stack,
    // el objeto String "hola" vive en el Heap

    /*
    <--  ==  VS .equals() -->
    * == compara si dos referencias apuntan al mismo objeto fisico en memoria
    * .equals() compara el contenido real del texto, Siempre usa .equals() para comparar cadenas

     */
}
