public class Cuenta {
    protected int numeroCuenta;
    protected String titular;
    protected long saldo;

    public Cuenta(int numeroCuenta, String titular, long saldo){
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String toString(){
        return "Cuenta: " + numeroCuenta + " titular: " + titular + " saldo: " + saldo;
    }
}
