public class Silla {
    private char letraSilla;
    private int puestoAsignado;
    private Pasajero pasajero;
    
    /**
     * @param letraSilla
     * @param puestoAsignado
     * @param pasajero
     */
    public Silla(char letraSilla, int puestoAsignado, Pasajero pasajero) {
        this.letraSilla = letraSilla;
        this.puestoAsignado = puestoAsignado;
        this.pasajero = pasajero;
    }

    public char getLetraSilla() {
        return letraSilla;
    }

    public void setLetraSilla(char letraSilla) {
        this.letraSilla = letraSilla;
    }

    public int getPuestoAsignado() {
        return puestoAsignado;
    }

    public void setPuestoAsignado(int puestoAsignado) {
        this.puestoAsignado = puestoAsignado;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    @Override
    public String toString() {
        return letraSilla +"-"+ puestoAsignado + ", pasajero = " + pasajero;
    }

    

    
}
