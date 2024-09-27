package TiendaDeport;

public class Cliente {          
    private int identificacion;
    private String nombre;
    
    /**
     * @param identificacion
     * @param nombre
     */

    public Cliente(int identificacion, String nombre) {         //Constructor de la clase cliente 
        this.identificacion = identificacion;
        this.nombre = nombre;
    }

    public int getIdentificacion() {            //Get identificacion
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {         //Set identificacion
        this.identificacion = identificacion;
    }

    public String getNombre() {             //Get nombre 
        return nombre;
    }

    public void setNombre(String nombre) {              //Set nombre
        this.nombre = nombre;
    }

    @Override
    public String toString() {      //To String que retorna identificacion y nombre
        return " identificacion = " + identificacion + ", nombre = " + nombre;
    }
    
    
    
}
