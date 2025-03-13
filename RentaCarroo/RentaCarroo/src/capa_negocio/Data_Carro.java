package capa_negocio; // Define el paquete al que pertenece esta clase

// Importaciones necesarias para manejar bases de datos y listas
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import capa_datos.Conexion; // Importa la clase Conexion para interactuar con la base de datos

/**
 * Clase Data_Carro que representa la capa de negocio para la gestión de vehículos.
 * Contiene métodos para insertar, actualizar, eliminar y listar vehículos desde la base de datos.
 */
public class Data_Carro {
    
    // Atributos privados del vehículo
    private String marcaCarro;
    private int kilometraje;
    private int modelo;
    private String linea;
    private String placa; 
    private boolean estado;
    
    /**
     * Método para eliminar un vehículo de la base de datos usando su placa.
     * @return Mensaje de éxito o error en la operación.
     */
    public String EliminarCarro() {
        Conexion objmod = new Conexion(); // Crea una instancia de la conexión a la base de datos
        String cad = "DELETE FROM carros WHERE placa = '" + this.getPlaca() + "'"; // Define la consulta SQL para eliminar el vehículo
        return objmod.Ejecutar(cad); // Ejecuta la consulta y devuelve el resultado
    }
    
    /**
     * Método para insertar un nuevo vehículo en la base de datos.
     * @return Mensaje indicando si la operación se realizó con éxito o hubo error.
     */
    public String GrabarCarro() {
        Conexion objmod = new Conexion(); // Crea una instancia de la conexión a la base de datos
        String cad = "INSERT INTO carros (placa, marcaCarro, modelo, linea, kilometraje, estado) VALUES ('"
                + this.placa + "', '" + this.marcaCarro + "', " + this.modelo + ", '" + this.linea + "', "
                + this.kilometraje + ", " + (this.estado ? 1 : 0) + ")";
        return objmod.Ejecutar(cad); // Ejecuta la consulta y devuelve el resultado
    }
    
    /**
     * Método para actualizar los datos de un vehículo existente en la base de datos.
     * @return Mensaje indicando si la operación se realizó con éxito o hubo error.
     */
    public String EditarCarro() {
        Conexion objmod = new Conexion(); // Crea una instancia de la conexión a la base de datos
        String cad = "UPDATE carros SET marcaCarro = '" + this.marcaCarro + "', modelo = " + this.modelo
                + ", linea = '" + this.linea + "', kilometraje = " + this.kilometraje + ", estado = "
                + (this.estado ? 1 : 0) + " WHERE placa = '" + this.placa + "'";
        return objmod.Ejecutar(cad); // Ejecuta la consulta y devuelve el resultado
    }
    
    /**
     * Método para listar todos los vehículos almacenados en la base de datos.
     * @return Lista de objetos Data_Carro con la información de los vehículos.
     */
    public ArrayList<Data_Carro> ListaCarros() {
        ArrayList<Data_Carro> lista = new ArrayList<>();
        try {
            Conexion objmod = new Conexion(); // Crea una instancia de la conexión a la base de datos
            ResultSet tabla = objmod.Listar("SELECT * FROM carros"); // Ejecuta la consulta SQL para obtener todos los vehículos
            while (tabla.next()) { // Itera sobre los resultados de la consulta
                Data_Carro objcar = new Data_Carro(); // Crea una nueva instancia de Data_Carro
                objcar.placa = tabla.getString("placa");
                objcar.marcaCarro = tabla.getString("marcaCarro");
                objcar.modelo = tabla.getInt("modelo");
                objcar.linea = tabla.getString("linea");
                objcar.kilometraje = tabla.getInt("kilometraje");
                objcar.estado = tabla.getBoolean("estado");
                lista.add(objcar); // Agrega el vehículo a la lista
            }
        } catch (SQLException e) { // Captura errores de SQL
            e.printStackTrace();
        }
        return lista; // Devuelve la lista de vehículos
    }
    
    // Métodos Getters y Setters para los atributos de la clase
    public String getMarcaCarro() {
        return marcaCarro; // Devuelve la marca del vehículo
    }

    public void setMarcaCarro(String marcaCarro) {
        this.marcaCarro = marcaCarro; // Asigna la marca del vehículo
    }

    public int getKilometraje() {
        return kilometraje; // Devuelve el kilometraje del vehículo
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje; // Asigna el kilometraje del vehículo
    }

    public int getModelo() {
        return modelo; // Devuelve el modelo del vehículo
    }

    public void setModelo(int modelo) {
        this.modelo = modelo; // Asigna el modelo del vehículo
    }

    public String getLinea() {
        return linea; // Devuelve la línea del vehículo
    }

    public void setLinea(String linea) {
        this.linea = linea; // Asigna la línea del vehículo
    }

    public String getPlaca() {
        return placa; // Devuelve la placa del vehículo
    }

    public void setPlaca(String placa) {
        this.placa = placa; // Asigna la placa del vehículo
    }

    public boolean isEstado() {
        return estado; // Devuelve el estado del vehículo
    }

    public void setEstado(boolean estado) {
        this.estado = estado; // Asigna el estado del vehículo
    }
}
