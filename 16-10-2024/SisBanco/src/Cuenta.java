public abstract class Cuenta {
 protected int numeroCuenta;
 protected String titular;
 protected int saldo;


public Cuenta(int numeroCuenta, String titular, int saldo) {
    this.numeroCuenta = numeroCuenta;
    this.titular = titular;
    this.saldo = saldo;
}

@Override
public String toString() {
    return "Cuenta = " + numeroCuenta + ", titular = " + titular + ", saldo = " + saldo;
}

public abstract void deposito(int valor);
public abstract void retiro(int valor);

 
}
