public class Pasajero {
    private int identificacion;
    private String nombreCliente;
    private int edadCliente;
    private String genCliente;
    
    /**
     * @param identificacion
     * @param nombreCliente
     * @param edadCliente
     * @param genCliente
     */
    public Pasajero(int identificacion, String nombreCliente, int edadCliente, String genCliente) {
        this.identificacion = identificacion;
        this.nombreCliente = nombreCliente;
        this.edadCliente = edadCliente;
        this.genCliente = genCliente;
    }
    
    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getEdadCliente() {
        return edadCliente;
    }

    public void setEdadCliente(int edadCliente) {
        this.edadCliente = edadCliente;
    }

    public String getGenCliente() {
        return genCliente;
    }

    public void setGenCliente(String genCliente) {
        this.genCliente = genCliente;
    }

    @Override
    public String toString() {
        return "Identificacion =" + identificacion + ", Nombre =" + nombreCliente + ", Edad ="
                + edadCliente + ", Gernero =" + genCliente;
    }
    
    

}
