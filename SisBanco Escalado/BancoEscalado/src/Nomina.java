class Nomina extends Cuenta implements IRetiro{

    public Nomina(int numeroCuenta, String titular, long saldo){
        super(numeroCuenta,titular, saldo);
    }

    public void retiro(long valor){
     if(valor > saldo){
        System.out.println("Monto de retiro superado ");
        }else {
            saldo -= valor;
        }   
    }

    @Override
    public String toString() {
        return "Cuenta Nomina \n"+
        "Numero cuenta = " + numeroCuenta + "\n"
        + "Titular = " + titular + "\n"
        + "Saldo =  " + saldo;
    }    
}