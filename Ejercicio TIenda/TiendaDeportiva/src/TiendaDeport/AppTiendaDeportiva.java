package TiendaDeport;

public class AppTiendaDeportiva {
    public static void main(String[] args) throws Exception {
        Provedor provedor = new Provedor("Zapatos", 111111111, "Pachito ");
        Cliente cliente = new Cliente(222222222, "Iker ");
        TipoDeProducto tipoDeProducto = new TipoDeProducto(14565486, "Zapatos nike blancos ", 0.19);
        Producto producto= new Producto(tipoDeProducto, 150.0, 15, provedor);
        Detalle detalle = new Detalle(producto, 5);
        Detalle detalle1 = new Detalle(producto, 3);
        Venta venta = new Venta(154654645, cliente);
        System.out.println("                                    -------- VENTA --------");
        System.out.println(venta);
        venta.adicionarDetalle(detalle);
        venta.adicionarDetalle(detalle1);
        venta.mostrarListaDetalles();
    }
}
