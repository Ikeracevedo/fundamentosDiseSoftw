public abstract class Corriente extends Cuenta{
    private int sobreGiro;
    

public Corriente(int numeroCuenta, String titular, int saldo, int sobreGiro) {
        super(numeroCuenta, titular, saldo);
        this.sobreGiro = sobreGiro;
    }

@Override
public void deposito(int valor) {
    // TODO Auto-generated method stub
    this.saldo+=valor;
}

@Override
public void retiro(int valor) {
    // TODO Auto-generated method stub
    if(valor <= (this.saldo+this.sobreGiro)){
        this.saldo-=valor;
    }else {
        System.out.println("Monto de retiro superado ");
    }
}
}

