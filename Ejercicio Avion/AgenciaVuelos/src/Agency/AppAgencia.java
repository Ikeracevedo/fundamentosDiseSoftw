
public class AppAgencia {
    public static void main(String[] args) throws Exception {
        Pasajero pasajero = new Pasajero(654546545, "Julian Alvarez", 42, "Masculino ");
        Silla silla = new Silla('A', 1, pasajero);
        Piloto piloto = new Piloto("Andres ", 1200.5);
        Ciudad ciudad = new Ciudad(1202, "Cali");
        Ciudad ciudad2 = new Ciudad(1101, "Armenia");
        Vuelo vuelo = new Vuelo(1415, ciudad, ciudad2, 12.0, 2.6, 30, piloto, silla);
        System.out.println("----- DATOS VUELO ----- ");
        System.out.println(vuelo);
        //Metodo para agregar el pasajeros para el arrayList
        vuelo.agregarPasajero(pasajero);
        System.out.println("----- DATOS PASAJERO ----- ");
        vuelo.mostrarPasajeros();
    }
}
