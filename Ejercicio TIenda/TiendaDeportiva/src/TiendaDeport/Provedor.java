package TiendaDeport;

public class Provedor {
    private String productoOfrecido;
    private int identificacion;
    private String nombre;

    /**
     * @param productoOfrecido
     * @param identificacion
     * @param nombre
     */

    public Provedor(String productoOfrecido, int identificacion, String nombre) {           //Constructor clase provedor
        this.productoOfrecido = productoOfrecido;
        this.identificacion = identificacion;
        this.nombre = nombre;
    }

    public String getProductoOfrecido() {           //Get del producto ofrecido por el provedor
        return productoOfrecido;
    }

    public void setProductoOfrecido(String productoOfrecido) {              //Set del producto ofrecido por el provedor 
        this.productoOfrecido = productoOfrecido;
    }

    public int getIdentificacion() {            //Get identificacion del provedor
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {                 //Set identificacion del provedor
        this.identificacion = identificacion;
    }

    public String getNombre() {             //Get nombre provedor 
        return nombre;
    }

    public void setNombre(String nombre) {          //Set nombre provedor 
        this.nombre = nombre;
    }

    @Override
    public String toString() {          //To String que retorna los datos del provedor 
        return " provedor producto ofrecido = " + productoOfrecido + ", identificacion = " + identificacion + ", nombre = "
                + nombre;
    }
    
    

    
    
    
}
