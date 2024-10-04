package Biclioteca;
public class Editorial {
    private int codigoEditorial;
    private String nombre;
    private Pais pais;
    
    /**
     * @param codigoEditorial
     * @param nombre
     * @param pais
     */
    public Editorial(int codigoEditorial, String nombre, Pais pais) {
        this.codigoEditorial = codigoEditorial;
        this.nombre = nombre;
        this.pais = pais;
    }

    public int getCodigoEditorial() {
        return codigoEditorial;
    }

    public void setCodigoEditorial(int codigoEditorial) {
        this.codigoEditorial = codigoEditorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Codigo de la editorial =" + codigoEditorial + ", nombre =" + nombre + ", pais =" + pais;
    }
    
    
}
