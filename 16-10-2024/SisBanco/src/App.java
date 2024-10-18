public class App {
    public static void main(String[] args) throws Exception {
        Ahorro persona1 = new Ahorro(101254646, "Jorge Ramirez");
        Ahorro persona2 = new Ahorro(215632124, "Celia Ramirez");

        persona1.deposito(10000);
        persona2.deposito(10000);

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
    }
}
