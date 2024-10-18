public class Ahorro extends Cuenta {
    private double interes;

    public Ahorro(int numeroCuenta, String titular) {
        super(numeroCuenta, titular, 0);
        this.interes = 0.03;
    }

@Override
public void deposito(int valor) {
    // TODO Auto-generated method stub
    saldo+=valor; //Valor del deposito agregado a la cuenta
    saldo+=valor*interes; //Intereses que genera el banco por la transaccion
}

@Override
public void retiro(int valor) {
    // TODO Auto-generated method stub
    if(valor <= saldo){
        saldo-=valor; // Si hay saldo suficiente, se retira el valor
       }else{
        System.out.println("Saldo insuficiente ");
       }

    }
    
}