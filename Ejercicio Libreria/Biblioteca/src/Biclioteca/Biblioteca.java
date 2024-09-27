package Biclioteca;
import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> listaLibros;
    private ArrayList<Prestamo> listaPrestamos;
    private Libro libro;
    
    /**
     * @param listaLibros
     * @param listaPrestamos
     */
    public Biblioteca(ArrayList<Libro> listaLibros, ArrayList<Prestamo> listaPrestamos) {
        this.listaLibros = listaLibros;
        this.listaPrestamos = listaPrestamos;
    }

    public void adicionarLibro(Libro libro){
        listaLibros.add(libro);
     }

     public void mostrarLibros(){
        for (Libro libro : listaLibros) {
            System.out.println(libro);
        }
     }
     public void adicionarPrestamo(Prestamo prestamo){
        listaPrestamos.add(prestamo);
     }
     public void mostrarPrestamos(){
        for ( Prestamo prestamo : listaPrestamos) {
            System.out.println(prestamo);

        }
     }
    
    

    
}
