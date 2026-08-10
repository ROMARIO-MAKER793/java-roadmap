package fundamentos_01.Equals;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Libro {

    private String titulo;

    private String isbn;

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Libro otro = (Libro) obj;
        return Objects.equals(titulo, otro.titulo) && Objects.equals(isbn,otro.isbn);
    }


    @Override
    public int hashCode() {
        return Objects.hash(titulo,isbn);
    }

    /*
    los campos que usas en equals() deben ser los MISMOS que usas en hashCode()
     */

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro();
        Libro libro2 = new Libro();

        libro1.setIsbn("123");
        libro2.setIsbn("123");

        Set<Libro> lista  = new HashSet<>();

        lista.add(libro1);
        lista.add(libro2);

        System.out.println("Cantidad de Libros son : " + lista.size());
    }
}
