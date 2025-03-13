package capa_negocio; // Define el paquete al que pertenece esta clase

// Importaciones necesarias para manejar bases de datos y fechas
import java.sql.*;
import java.time.LocalDate;

/*
 * Autor Iker Acevedo
 */

import javax.swing.JOptionPane;
import capa_datos.Conexion; // Importa la clase Conexion para interactuar con la base de datos

public class FacturaReserva {

    // Atributos privados de la clase
    private int codigo = 0001; // Código de la reserva
    private LocalDate fechaReserva; // Fecha de la reserva
    private LocalDate fechaPrestamo; // Fecha del préstamo
    private int idCliente; // ID del cliente
    private String carroPlaca; // Placa del carro
    private int dias; // Número de días de la reserva
    private int idEmpleado; // ID del empleado

    // Constructor por defecto
    public FacturaReserva() {
    }
    int code = 0;
    // Constructor con parámetros
    public FacturaReserva(LocalDate fechaPrestamo, int idCliente, String carroPlaca, int codigo, int dias, int idEmpleado) {
        this.fechaReserva = LocalDate.now(); // La fecha de la reserva es la fecha actual
        this.fechaPrestamo = fechaPrestamo; // Asigna la fecha del préstamo
        this.idCliente = idCliente; // Asigna el ID del cliente
        this.carroPlaca = carroPlaca; // Asigna la placa del carro
        this.dias = dias; // Asigna el número de días de la reserva
        this.codigo = ++code; // Incrementa el código de la reserva
        this.idEmpleado = idEmpleado; // Asigna el ID del empleado
    }

    // Método para actualizar una reserva existente
    public String ActualizarReserva() {
        Conexion objmod = new Conexion(); // Crea una instancia de la conexión a la base de datos
        
        // Consulta SQL para actualizar la factura con NumeroDias
        String cad = "UPDATE FacturaReserva SET FechaReserva= '" + Date.valueOf(this.getFechaReserva())
                     + "', FechaPrestamo= '" + Date.valueOf(this.getFechaPrestamo())
                     + "', ClienteId= " + this.getIdCliente()
                     + ", CarroPlaca= '" + this.getCarroPlaca() + "'"
                     + ", NumeroDias= " + this.getDias()
                     + ", EmpleadoId= " + this.getIdEmpleado()
                     + " WHERE Codigo= " + this.getCodigo();
        
        return objmod.Ejecutar(cad); // Ejecuta la consulta y devuelve el resultado
    }

    // Método para guardar una nueva reserva en la base de datos
    public String GuardarReserva() {
        Conexion objmod = new Conexion();
        String cad = "INSERT INTO FacturaReserva (FechaReserva, FechaPrestamo, idCliente, idEmpleado, CarroPlaca, NumeroDias) VALUES ('"+
            Date.valueOf(getFechaReserva()) + "', '" + Date.valueOf(getFechaPrestamo()) + "', '"
            + getIdCliente() + "', '" + getIdEmpleado() + "', '" + getCarroPlaca() + "', '" + getDias() + "')";
            System.out.println(cad);
        try {
            return objmod.Ejecutar(cad);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar la reserva: " + e.getMessage());
            return "Error al guardar la reserva: " + e.getMessage();
        }
    }


    // Método para eliminar una reserva de la base de datos
    public String EliminarReserva() {
        Conexion objmod = new Conexion(); // Crea una instancia de la conexión a la base de datos
        String cad = "DELETE FROM FacturaReserva"
                   + " WHERE codigo = " + this.getCodigo(); // Consulta SQL para eliminar la reserva
        return objmod.Ejecutar(cad); // Ejecuta la consulta y devuelve el resultado
    }

    // Método para buscar una reserva en la base de datos
    public FacturaReserva BuscarFactura() {
        try {
            Conexion objmod = new Conexion(); // Crea una instancia de la conexión a la base de datos
            String cad = "SELECT * FROM FacturaReserva"
                       + " WHERE Codigo = ?"; // Consulta SQL para buscar la reserva
            PreparedStatement pstmt = objmod.getConnection().prepareStatement(cad);
            pstmt.setInt(1, this.getCodigo());
            ResultSet tabla = pstmt.executeQuery(); // Ejecuta la consulta y almacena el resultado en tabla

            if (tabla.next()) {
                FacturaReserva objfactura = new FacturaReserva(); // Crea una nueva instancia de FacturaReserva
                objfactura.setCodigo(tabla.getInt("Codigo")); // Asigna el código de la reserva
                objfactura.setFechaReserva(tabla.getDate("FechaReserva").toLocalDate()); // Asigna la fecha de la reserva
                objfactura.setFechaPrestamo(tabla.getDate("FechaPrestamo").toLocalDate()); // Asigna la fecha del préstamo
                objfactura.setIdCliente(tabla.getInt("idCliente")); // Asigna el ID del cliente
                objfactura.setCarroPlaca(tabla.getString("CarroPlaca")); // Asigna la placa del carro
                objfactura.setDias(tabla.getInt("NumeroDias")); // Asigna el número de días de la reserva
                objfactura.setIdEmpleado(tabla.getInt("idEmpleado")); // Asigna el ID del empleado
                return objfactura; // Devuelve la reserva encontrada
            } else {
                JOptionPane.showMessageDialog(null, "Factura no encontrada."); // Muestra un mensaje si no se encuentra la reserva
                return null; // Devuelve null si no se encuentra la reserva
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar la factura: " + e.getMessage()); // Muestra un mensaje en caso de error
            return null; // Devuelve null en caso de error
        }
    }

    // Métodos Getters y Setters para los atributos de la clase
    public int getCodigo() {
        return codigo; // Devuelve el código de la reserva
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo; // Asigna el código de la reserva
    }

    public LocalDate getFechaReserva() {
        return fechaReserva; // Devuelve la fecha de la reserva
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva; // Asigna la fecha de la reserva
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo; // Devuelve la fecha del préstamo
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo; // Asigna la fecha del préstamo
    }

    public int getIdCliente() {
        return idCliente; // Devuelve el ID del cliente
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente; // Asigna el ID del cliente
    }

    public String getCarroPlaca() {
        return carroPlaca; // Devuelve la placa del carro
    }

    public void setCarroPlaca(String carroPlaca) {
        this.carroPlaca = carroPlaca; // Asigna la placa del carro
    }

    public int getDias() {
        return dias; // Devuelve el número de días
    }

    public void setDias(int dias) {
        this.dias = dias; // Asigna el número de días
    }

    public int getIdEmpleado() {
        return idEmpleado; // Devuelve el ID del empleado
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado; // Asigna el ID del empleado
    }
}