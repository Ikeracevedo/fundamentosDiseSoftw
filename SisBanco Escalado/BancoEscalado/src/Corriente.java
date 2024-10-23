public class Corriente extends Cuenta implements IDeposito, IRetiro {
    private long sobreGiro;
    private long sobregiroUsado;

    public Corriente(int numeroCuenta, String titular, long sobreGiro) {
        super(numeroCuenta, titular, 0);
        this.sobreGiro = sobreGiro;
    }

    @Override
    public void retiro(long valor) {
        if (valor > (saldo + sobreGiro)) {
            System.out.println("Monto de retiro superado");
        } else if (valor <= saldo) {
            saldo -= valor;
        } else {
            sobregiroUsado = valor - saldo;
            sobreGiro -= sobregiroUsado;
            saldo = 0;
        }
    }

    @Override
    public void deposito(long valor) {
        if (valor >= 0) {
            valor -= sobregiroUsado;
            sobreGiro += sobregiroUsado;
            saldo += valor; // Valor del depósito agregado a la cuenta
        } else {
            System.out.println("No se puede depositar un saldo negativo");
        }
    }

    @Override
    public String toString() {
        return "Cuenta corriente = " + numeroCuenta + "\n"
                + "Titular = " + titular + "\n"
                + "Sobre giro = " + sobreGiro + "\n"
                + "Saldo = " + saldo;
    }
}
