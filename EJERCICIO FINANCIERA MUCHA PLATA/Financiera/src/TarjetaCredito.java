import java.time.LocalDate;

public class TarjetaCredito extends Objeto implements IDeposito{
    private long cupo;
    private LocalDate fechaUltimaCompra;

    public TarjetaCredito (long cupo, int numProducto, int añoApertura, Titular titular){
        super(numProducto, añoApertura, titular);
        this.cupo = cupo;
        this.fechaUltimaCompra = LocalDate.now();
        this.saldo = 0;
    }

    @Override
    public void deposito(long valor) {
        // TODO Auto-generated method stub
        if (valor>0) {
            this.saldo += valor;
        }else{
            System.out.println("No se puede depositar un valor negativo");
        }
    }

    public String toString(){
        return "Numero de prodeucto = " + numProducto + " Año de apertura = " + añoApertura + " Nombre completo = " + titular.getNombreCompleto() + " Tipo de producto = Tarjeta de credito" + " Cupo = " + cupo;
    }
}
