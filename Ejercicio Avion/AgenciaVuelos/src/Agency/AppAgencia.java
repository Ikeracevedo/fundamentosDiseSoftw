
public class AppAgencia {
    public static void main(String[] args) throws Exception {
        Pasajero pasajero = new Pasajero(20214, "Iker", 42, "Masculino ");
        Silla silla = new Silla('a', 102, pasajero);
        Piloto piloto = new Piloto("Alberto rodriguez", 1200.5);
        Ciudad ciudad = new Ciudad(1202, "cali");
        Ciudad ciudad2 = new Ciudad(1101, "Armenia");
        Vuelo vuelo = new Vuelo(1415, ciudad, ciudad2, 124.2, 2.6, 48, piloto, silla);

        System.out.println(vuelo);
    }
}
