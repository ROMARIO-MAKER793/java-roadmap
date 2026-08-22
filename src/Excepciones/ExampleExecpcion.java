package Excepciones;



public class ExampleExecpcion {

    public void validarEdad(int edad) throws IllegalArgumentException{

        if(edad<0){
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }

    }

    public static void main(String[] args) {

        try{
            int a = 20;
            int b = 0;

            int resultado = a/b;

        } catch (ArithmeticException e) {

            System.out.println("Error, no se puede dividir entre 0 : " + e.getClass().getSimpleName());
        }
        //Fin de la 1Era pregunta



       try{
            int[] numeros = {1,2,3};
            System.out.println(numeros[5]);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Indice fuera de rango " + e.getClass().getSimpleName());
        }

        try {
            String nulo = null;

            nulo.length();

        }catch (NullPointerException e){
            System.out.println("Nulo " + e.getClass().getSimpleName());
        }

        ExampleExecpcion example = new ExampleExecpcion();

        try {
            example.validarEdad(-1);

        }catch (IllegalArgumentException e){
            System.out.println( e.getMessage());
            System.out.println("El tipo de execpcion es : " + e.getClass().getSimpleName());
        }


    }
}
