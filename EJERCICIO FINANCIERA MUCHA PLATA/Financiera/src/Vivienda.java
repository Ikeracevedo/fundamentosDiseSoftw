public class Vivienda extends Objeto implements IDeposito{
    private long precioVivienda;
    private String tipoVivienda;

    
    public Vivienda(int numProducto, int añoApertura, Titular titular, long precioVivienda, String tipoVivienda) {
        super(numProducto, añoApertura, titular);
        this.precioVivienda = precioVivienda;
        this.tipoVivienda = tipoVivienda;
    }

    @Override
    public void deposito(long valor) {
        if (valor > 0) {
            this.precioVivienda-=valor;
        }else{
            System.out.println("No se puede hacer un deposito menor a 0 pesos ");
        }
    }

    @Override
    public String toString(){
        return "Numero de producto = " + numProducto + " Año de apertura = " + añoApertura + " Nombre completo = " + titular.getNombreCompleto() + " Tipo de producto = Vivienda" + " Tipo de vivienda = " + tipoVivienda + " Valor restante = " + precioVivienda;
    }
    
}
