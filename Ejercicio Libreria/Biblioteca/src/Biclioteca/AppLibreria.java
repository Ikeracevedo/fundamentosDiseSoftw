import java.util.ArrayList;

public class AppLibreria {
    public static void main(String[] args) throws Exception {
        //Listas
        ArrayList<Libro> listaLibros = new ArrayList<>();
        ArrayList<Prestamo> listaPrestamos = new ArrayList<>();
        //Objetos
        Pais pais = new Pais("Colombia ", 0001);
        Autor autor = new Autor("Jualian ", pais);
        Editorial editorial = new Editorial(4444, "Geogeogeo", pais);
        Libro libro = new Libro("12457", "Hola mundo", "1", 100, autor, editorial);
        Estudiante estudiante = new Estudiante(1018561145, "Alonso rodriguez ");
        Prestamo prestamo = new Prestamo(libro, estudiante);
        //Biblioteca y prestamos
        Biblioteca biblioteca = new Biblioteca(listaLibros, listaPrestamos);
        
        System.out.println("--------- LIBROS ---------");
        //Agregar libro
        biblioteca.adicionarLibro(libro);
        //Mostrar libro
        biblioteca.mostrarLibros();
        
        System.out.println("--------- PRESTAMOS ---------");
        //Agregar prestamo
        biblioteca.adicionarPrestamo(prestamo);
        //Mostrar
        biblioteca.mostrarPrestamos();
    }
    
}
    
    