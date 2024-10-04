import java.util.ArrayList;
import java.util.List;

public class Vuelo {

    private int numVuelo;
    private Ciudad ciudadSalida;
    private Ciudad ciudadLlegada;
    private Double horaSalida;
    private Double duracionVuelo;
    private int numSillas;
    private Piloto piloto;
    private Silla silla;
    private List<Pasajero> listaPasajeros = new ArrayList<>();

    /**
     * @param numVuelo
     * @param ciudadSalida
     * @param ciudadLlegada
     * @param horaSalida
     * @param duracionVuelo
     * @param numSillas
     * @param piloto
     */

    public Vuelo(int numVuelo, Ciudad ciudadSalida, Ciudad ciudadLlegada, Double horaSalida, Double duracionVuelo,
            int numSillas, Piloto piloto, Silla silla) {
        this.numVuelo = numVuelo;
        this.ciudadSalida = ciudadSalida;
        this.ciudadLlegada = ciudadLlegada;
        this.horaSalida = horaSalida;
        this.duracionVuelo = duracionVuelo;
        this.numSillas = numSillas;
        this.piloto = piloto;
        this.silla = silla;
    }
    
    public int getNumVuelo() {
        return numVuelo;
    }
    public void setNumVuelo(int numVuelo) {
        this.numVuelo = numVuelo;
    }
    public Ciudad getCiudadSalida() {
        return ciudadSalida;
    }
    public void setCiudadSalida(Ciudad ciudadSalida) {
        this.ciudadSalida = ciudadSalida;
    }
    public Ciudad getCiudadLlegada() {
        return ciudadLlegada;
    }
    public void setCiudadLlegada(Ciudad ciudadLlegada) {
        this.ciudadLlegada = ciudadLlegada;
    }
    public Double getHoraSalida() {
        return horaSalida;
    }
    public void setHoraSalida(Double horaSalida) {
        this.horaSalida = horaSalida;
    }
    public Double getDuracionVuelo() {
        return duracionVuelo;
    }
    public void setDuracionVuelo(Double duracionVuelo) {
        this.duracionVuelo = duracionVuelo;
    }
    public int getNumSillas() {
        return numSillas;
    }
    public void setNumSillas(int numSillas) {
        this.numSillas = numSillas;
    }
    public Piloto getPiloto() {
        return piloto;
    }
    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }
    public Silla getSilla() {
        return silla;
    }

    public void setSilla(Silla silla) {
        this.silla = silla;
    }

    @Override
    public String toString() {
        return "Vuelo = " + numVuelo + ", salida = " + ciudadSalida + ", llegada = " + ciudadLlegada
                + ", hora de salida = " + horaSalida + ", Duracion = " + duracionVuelo + ", sillas = " + numSillas
                + ", nombre del piloto = " + piloto + ", Silla = " + silla;
    }

    public void agregarPasajero(Pasajero pasajero){         //Metodo para agregar pasajero 
        listaPasajeros.add(pasajero);
    }
    public void mostrarPasajeros(){
        for (Pasajero pasajero : listaPasajeros) {          //Metodo para mostrar la lista de pasajeros
            System.out.println(pasajero);
        }
    }
    
        
}
