package POO_02;

public class Pinguino extends  Pajaro{

    @Override
    public  void volar(){
        System.out.println("Los pinguinos no vuelan");
    }

    public static void main(String[] args) {

        Pinguino pingu = new Pinguino();
        pingu.volar();
    }

}
