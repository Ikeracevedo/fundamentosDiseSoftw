public class App {
    public static void main(String[] args) throws Exception {
        Circulo circulo1 = new Circulo(10.15);

        circulo1.calcularArea();
        circulo1.calcularPerimetro();

        System.out.println("El area del circulo es " + circulo1.getArea());
        System.out.println("El perimetro del circulo es " + circulo1.getPerimetro());




    }
}
