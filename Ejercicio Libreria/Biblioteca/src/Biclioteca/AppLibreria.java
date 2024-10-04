package Biclioteca;
import java.util.ArrayList;

public class AppLibreria {
    public static void main(String[] args) throws Exception {
        //Listas
        ArrayList<Libro> listaLibros = new ArrayList<>();
        ArrayList<Prestamo> listaPrestamos = new ArrayList<>();
        //Instacias
        Pais pais = new Pais("Colombia ", 0001);
        Autor autor = new Autor("Julian ", pais);
        Editorial editorial = new Editorial(4444, "Oracle", pais);
        Libro libro = new Libro("12457", "Java", "1", 150, autor, editorial);
        Estudiante estudiante = new Estudiante(1018561145, "Alonso rodriguez ");
        Prestamo prestamo = new Prestamo(libro, estudiante);
        //Libros y prestamos añadidos
        listaLibros.add(libro);
        listaPrestamos.add(prestamo);
        //Biblioteca y prestamos
        System.out.println("--------- LIBROS ---------");
        for (Libro libros : listaLibros) {
            System.out.println(libro);
        }
        System.out.println("--------- PRESTAMOS ---------");
        for (Prestamo prestamos : listaPrestamos) {
            System.out.println(prestamo);

        }
    }
}   