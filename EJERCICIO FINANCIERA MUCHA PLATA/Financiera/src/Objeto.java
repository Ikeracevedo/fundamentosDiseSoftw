public class Objeto {
    protected int numProducto;
    protected int añoApertura;
    protected long saldo;
    protected Titular titular;


    public Objeto(int numProducto, int añoApertura, Titular titular) {
        this.numProducto = numProducto;
        this.añoApertura = añoApertura;
        this.saldo = 0;
        this.titular = titular;
    }

    public int getNumProducto() {
        return numProducto;
    }

    public void setNumProducto(int numProducto) {
        this.numProducto = numProducto;
    }

    public int getAñoApertura() {
        return añoApertura;
    }

    public void setAñoApertura(int añoApertura) {
        this.añoApertura = añoApertura;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    @Override

    public String toString(){
        return "Numero de producto = " + numProducto + "Año de apertura = " + añoApertura + "Nombre = " + titular.getNombreCompleto();
    }
    
}
