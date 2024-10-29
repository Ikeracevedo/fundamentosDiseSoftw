public class AppFinanciera {
    public static void main(String[] args) throws Exception {
        Titular persona1 = new Titular("Alberto rodrigez ", 516124563, "holamundo@gmail.com");

        Ahorro ahorro = new Ahorro(15656231, 2020, persona1);
        Corriente corriente = new Corriente(6542165, 2021, persona1);
        TarjetaCredito tarjetaCredito = new TarjetaCredito(1000000, 1216532, 2032, persona1);
        Vivienda vivienda = new Vivienda(21321532, 2555, persona1, 1000000, "VIS");

        System.out.println(ahorro);
        System.out.println(corriente);
        System.out.println(tarjetaCredito);
        System.out.println(vivienda);
    }
}
