public class App {
    public static void main(String[] args) throws Exception {
       Nomina persona1 = new Nomina(1111, "hHola",10000);

       persona1. retiro(100);
       System.out.println(persona1);
       System.out.println();
       persona1.retiro(500);
       System.out.println(persona1);
    }
}
