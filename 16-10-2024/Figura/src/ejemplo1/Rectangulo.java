public class Rectangulo extends Figura {
    protected double alto;
    protected double ancho;

    public Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public void calcularArea() {
        // TODO Auto-generated method stub
        this.area = this.alto * this.ancho;
        
    }

    @Override
    public void calcularPerimetro() {
        // TODO Auto-generated method stub
        this.perimetro = (this.alto*2) + (this.ancho*2);
    }
}
