
public class Circulo extends Figura {
    protected double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        // TODO Auto-generated method stub
        this.area = Math.PI*Math.pow(this.radio,2);
    }
    @Override
    public void calcularPerimetro() {
        // TODO Auto-generated method stub
        this.perimetro = 2 * this.radio * Math.PI;
    }
}
