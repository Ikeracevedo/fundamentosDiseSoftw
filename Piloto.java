public class Piloto {
    private String nombrePiloto;
    private Double horasVuelo;
    
    /**
     * @param nombrePiloto
     * @param horasVuelo
     */
    public Piloto(String nombrePiloto, Double horasVuelo) {
        this.nombrePiloto = nombrePiloto;
        this.horasVuelo = horasVuelo;
    }
    
    public String getNombrePiloto() {
        return nombrePiloto;
    }
    public void setNombrePiloto(String nombrePiloto) {
        this.nombrePiloto = nombrePiloto;
    }
    public Double getHorasVuelo() {
        return horasVuelo;
    }
    public void setHorasVuelo(Double horasVuelo) {
        this.horasVuelo = horasVuelo;
    }

    @Override
    public String toString() {
        return "Piloto Nombre =" + nombrePiloto + ", Horas de vuelo =" + horasVuelo;
    }
    
}
