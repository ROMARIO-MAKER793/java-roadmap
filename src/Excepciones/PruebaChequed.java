package Excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class PruebaChequed {

   public static void abrirArchivo() throws FileNotFoundException{
       FileReader archivo = new FileReader("archivo.txt");
       System.out.println("Archivo encontrado");
   }

    public static void main(String[] args) {

        /*try {
            FileReader archivo = new FileReader("archivo.txt");
        }catch (FileNotFoundException e){
            System.out.println("no se encontro el archivo");
        }

        System.out.println("Archivo abierto");*/

        try {
            abrirArchivo();
        }catch (FileNotFoundException e){
            System.out.println("No se encontró el archivo");
            System.out.println(e.getMessage());
        }
    }
}
