package Excepciones;

public class ExampleFinally {

    public  int obtenerNumero(){
        try{
            System.out.println("Estoy dentro del try");
            return 10;
        }finally {
            System.out.println("El finally se ejecuto");

        }
    }

    public static void main(String[] args) {
        ExampleFinally example = new ExampleFinally();

        System.out.println("Resultado : " + example.obtenerNumero());
    }
}
