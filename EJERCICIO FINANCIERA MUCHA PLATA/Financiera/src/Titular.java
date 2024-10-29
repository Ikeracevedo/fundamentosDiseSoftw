public class Titular {
    private String nombreCompleto;
    private int id;
    private String correoElectronico;


    public Titular(String nombreCompleto, int id, String correoElectronico) {
        this.nombreCompleto = nombreCompleto;
        this.id = id;
        this.correoElectronico = correoElectronico;
    }
    
    public String getNombreCompleto() {
        return nombreCompleto;
    }


    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getCorreoElectronico() {
        return correoElectronico;
    }


    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "Titular nombre completo = " + nombreCompleto + ", identificacion = " + id + ", correo electronico = " + correoElectronico;
    }
    

    
    
}
