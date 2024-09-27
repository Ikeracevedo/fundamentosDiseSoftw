package TiendaDeport;

public class Producto {
    private TipoDeProducto tipoDeProducto;
    private Double precioDeVenta;
    private int cantidad;
    private Provedor provedor;

    /**
     * @param tipoDeProducto
     * @param precioDeVenta
     * @param cantidad
     * @param provedor
     */
    public Producto(TipoDeProducto tipoDeProducto, Double precioDeVenta, int cantidad, Provedor provedor) {             //Constructor clase producto
        this.tipoDeProducto = tipoDeProducto;
        this.precioDeVenta = precioDeVenta;
        this.cantidad = cantidad;
        this.provedor = provedor;
    }

    public TipoDeProducto getTipoDeProducto() {         //Get clase tipo de producto
        return tipoDeProducto;
    }

    public void setTipoDeProducto(TipoDeProducto tipoDeProducto) {              //Set clase tipo de producto
        this.tipoDeProducto = tipoDeProducto;
    }

    public Double getPrecioDeVenta() {              //Get precio de venta de producto por unidad 
        return precioDeVenta;
    }

    public void setPrecioDeVenta(Double precioDeVenta) {                //Set precio de venta producto por unidad 
        this.precioDeVenta = precioDeVenta;
    }

    public int getCantidad() {              //Get de cantidad de productos que tiene la tienda para vender 
        return cantidad;
    }

    public void setCantidad(int cantidad) {                 //Set de la cantidad de productos que tiene la tienda para vender
        this.cantidad = cantidad;
    }

    public Provedor getProvedor() {                 //Get de la clase provedor 
        return provedor;
    }

    public void setProvedor(Provedor provedor) {            //Set de la clase provedor 
        this.provedor = provedor;
    }
    
    @Override
    public String toString() {          //To String 
        return " producto = " + tipoDeProducto + ", precio de venta = " + precioDeVenta + ", cantidad = "
                + cantidad + ", provedor = " + provedor;
    }
    
}
