package fundamentos_01.generics;

public class Caja<T> {

    private T contenido;

    public void guardar (T contenido){
        this.contenido = contenido;
    }

    public T obtener () {
        return contenido;
    }

    public static void main(String[] args) {

        Caja<String> cajaTexto = new Caja<>();
        cajaTexto.guardar("hola");
        String valor = cajaTexto.obtener();

        System.out.println(valor);

        Caja<Integer> cajaNumero = new Caja<>();
        cajaNumero.guardar(42);
        Integer valorNumero = cajaNumero.obtener();

        System.out.println(valorNumero);


    }
}
