public class Vivienda extends Cuenta implements IDeposito{

    public Vivienda(int numeroCuenta, String titular){
        super(numeroCuenta,titular,0);
    }

    @Override
    public void deposito(long valor) {
        // TODO Auto-generated method stub
        if (valor > 0 ) {
            this.saldo+=valor;
        } else{
            System.out.println("No se puede depositar un valor menor a 0 pesos ");
        }
    }

    @Override
    public String toString() {
        return "Cuenta vivienda \n"+
        "Numero cuenta = " + numeroCuenta + "\n"
        + "Titular = " + titular + "\n"
        + "Saldo =  " + saldo;
    }    

    
}