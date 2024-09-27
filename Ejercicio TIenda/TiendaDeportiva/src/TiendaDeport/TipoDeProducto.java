package TiendaDeport;

public class TipoDeProducto {
    private int codigoProducto;
    private String descripccion;
    private Double porcentajeIva;
    
    /**
     * @param codigoProducto
     * @param descripccion
     * @param porcentajeIva
     */
    public TipoDeProducto(int codigoProducto, String descripccion, Double porcentajeIva) {      //Constructor de la clase tipo de producto
        this.codigoProducto = codigoProducto;
        this.descripccion = descripccion;
        this.porcentajeIva = porcentajeIva;
    }

    public int getCodigoProducto() {            //Get codigo producto 
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {             //Set codigo producto
        this.codigoProducto = codigoProducto;
    }

    public String getDescripccion() {              //Get descripccion del producto 
        return descripccion;
    }

    public void setDescripccion(String descripccion) {              // Set descripccion del producto
        this.descripccion = descripccion;
    }

    public Double getPorcentajeIva() {              //Get porcentaje de iva
        return porcentajeIva;
    }

    public void setPorcentajeIva(Double porcentajeIva) {                //Set porcentaje de iva
        this.porcentajeIva = porcentajeIva;
    }

    @Override
    public String toString() {      //To String de la clase tipo de producto
        return " codigo del producto = " + codigoProducto + ", descripccion = " + descripccion
                + ", porcentaje de IVA = " + porcentajeIva;
    }
    

}
