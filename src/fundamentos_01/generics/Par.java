package fundamentos_01.generics;

public class Par<T> {

    private T numero1;
    private T numero2;

    public void guardar (T numero1 , T numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public T getNumero1(){
        return numero1;
    }

    public T getNumero2() {
        return numero2;
    }

    public void intercambiar (){

        T temporal =  numero1;
        numero1 = numero2;
        numero2 = temporal;

    }

    @Override
    public String toString(){
        return "Par [" + numero1 + ", " + numero2 + "]";

    }

    public static void  main(String[] args){
        Par<Integer> parNum = new Par<>();

        parNum.guardar(1,2);
        System.out.println(parNum);

        parNum.intercambiar();
        System.out.println(parNum);

    }






}
