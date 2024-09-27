package TiendaDeport;

public class Detalle {
    private Producto producto;
    private int cantidadDetalle;
    private double valorProducto;
    
    /**
     * @param producto
     * @param cantidadDetalle
     */

    public Detalle(Producto producto, int cantidadDetalle) {                //Constructor de la clase Detalle donde se excluye la variable valorProducto que calcula el precio por unidad por la cantidad de productos
        this.producto = producto;
        this.cantidadDetalle = cantidadDetalle;
    }

    public Producto getProducto() {         //Get producto
        return producto;
    }

    public void setProducto(Producto producto) {            //Set producto
        this.producto = producto;
    }

    public int getCantidadDetalle() {              //Get cantidad detalle
        return cantidadDetalle;
    }

    public void setCantidadDetalle(int cantidadDetalle) {           //Set cantidad detalle
        this.cantidadDetalle = cantidadDetalle;
    }

    public double precioProducto(){         //Metodo aparte que calcula el valor unitario del producto por la cantidad
        valorProducto = cantidadDetalle * producto.getPrecioDeVenta();
        return valorProducto;
    }

    @Override
    public String toString() {      //To String que retorna cada detalle de la venta 
        return "Detalle =" + producto + ", cantidad =" + cantidadDetalle;
    }
    
    
}
