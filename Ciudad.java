public class Ciudad {
    private int codCiudad;
    private String nomCiudad;

    /**
     * @param codCiudad
     * @param nomCiudad
     */
    
    public Ciudad(int codCiudad, String nomCiudad) {
        this.codCiudad = codCiudad;
        this.nomCiudad = nomCiudad;
    }

    public int getCodCiudad() {
        return codCiudad;
    }

    public void setCodCiudad(int codCiudad) {
        this.codCiudad = codCiudad;
    }

    public String getNomCiudad() {
        return nomCiudad;
    }

    public void setNomCiudad(String nomCiudad) {
        this.nomCiudad = nomCiudad;
    }

    @Override
    public String toString() {
        return "Ciudad codigo = " + codCiudad + ", nombre =" + nomCiudad;
    }

    
    

}
