import java.time.LocalDate;

public class Corriente extends Objeto implements IDeposito, IRetiro{

    private LocalDate fechaUltimoMov;

    public Corriente(int numProducto, int añoApertura, Titular titular) {
        super(numProducto, añoApertura, titular);
        this.fechaUltimoMov = LocalDate.now();
    }

    @Override
    public void retiro(long valor) {
        // TODO Auto-generated method stub
        if (valor>saldo) {
            System.out.println("No se puede retirar un valor mayor al saldo");
        }else{
            this.saldo -= valor;
        }
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


    @Override
    public String toString() {
        return " Numero de producto = " + numProducto + " Año de apertura = " + añoApertura + " Nombre completo = " + titular.getNombreCompleto() + " Tipo de producto = Cuenta corriente ";
    }

    

    
}

