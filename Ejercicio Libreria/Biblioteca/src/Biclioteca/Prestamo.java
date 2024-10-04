package Biclioteca;
import java.time.LocalDate;

public class Prestamo {
    private LocalDate fechaPrestamo;
    private Libro libro;
    private LocalDate fechaEntrega;
    private Estudiante estudiante;
    private int diasprestamo = 5;
    private int diasMora;
    private int multa;

    /**
     * 
     * @param libro
     * @param estudiante
     * @param diasprestamo
     */
    
    public Prestamo(Libro libro, Estudiante estudiante) {
        this.libro = libro;
        this.estudiante = estudiante;
        this.fechaPrestamo = LocalDate.now();
        this.fechaEntrega = fechaPrestamo.plusDays(diasprestamo);
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }


    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }


    public Libro getLibro() {
        return libro;
    }


    public void setLibro(Libro libro) {
        this.libro = libro;
    }


    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }


    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }


    public Estudiante getEstudiante() {
        return estudiante;
    }


    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }


    public int getDiasprestamo() {
        return diasprestamo;
    }


    public void setDiasprestamo(int diasprestamo) {
        this.diasprestamo = diasprestamo;
    }


    public int getDiasMora() {
        return diasMora;
    }


    public void setDiasMora(int diasMora) {
        this.diasMora = diasMora;
    }


    public int getMulta() {
        return multa;
    }


    public void setMulta(int multa) {
        this.multa = multa;
    }

    @Override
    public String toString() {
        return "fecha de prestamo =" + fechaPrestamo + ", libro = " + libro + ", fecha de entrega = " + fechaEntrega
                + ", estudiante = " + estudiante + ", dias de prestamo = " + diasprestamo + ", dias de mora = " + diasMora
                + ", multa = " + multa;
    }


}
