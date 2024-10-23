public class Ahorro extends Cuenta implements IDeposito, IRetiro{
    private long interes;

    
    public Ahorro(int numeroCuenta, String titular) {
        super(numeroCuenta, titular, 0);
        this.interes = interes;
    }
    public void retiro(long valor){
        if(valor <= saldo){
            saldo-=valor; // Si hay saldo suficiente, se retira el valor
        }else{
            System.out.println("Saldo insuficiente ");
       }
    }
    public void deposito(long valor){
        if(valor>=0){
            saldo+=valor; //Valor del deposito agregado a la cuenta
            interes += valor*0.03; //Intereses que genera el banco por la transaccion
            saldo += interes;
        }else{
            System.out.println("No se puede depositar un saldo negativo ");
        }
    }
    @Override
    public String toString() {
        return "Cuenta ahorro = " + numeroCuenta + "\n"
         + "Titular = " + titular + "\n"
         + "Interes generados = " + interes + "\n" 
         + "Depositado = " + saldo + "\n"
         + "Saldo  = " + saldo;
    }

    
}