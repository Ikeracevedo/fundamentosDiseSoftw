package capa_negocio; // Define el paquete al que pertenece esta clase

import capa_datos.Conexion; // Importa la clase para manejar la conexión con la base de datos
import java.sql.ResultSet; // Importa la clase para manejar resultados de consultas SQL
import java.sql.SQLException; // Importa la clase para manejar excepciones de SQL
import java.util.ArrayList; // Importa la clase para manejar listas dinámicas

/**
 * Clase para manejar los datos de los clientes
 */
public class Data_Clientes {
    private int idCliente; // ID único del cliente
    private String nombreCompleto; // Nombre completo del cliente
    private String correo; // Correo electrónico del cliente
    private String telefono; // Teléfono del cliente
    
    /**
     * Método para eliminar un cliente de la base de datos
     * @return Resultado de la ejecución de la consulta SQL
     */
    public String EliminarCliente(){
        Conexion objmod = new Conexion(); // Crea una instancia de la conexión a la base de datos
        String cad = "DELETE FROM clientes WHERE idCliente = " + this.idCliente; // Define la consulta SQL para eliminar el cliente
        return objmod.Ejecutar(cad); // Ejecuta la consulta y devuelve el resultado
    }
    
    /**
     * Método para editar un cliente en la base de datos
     * @return Resultado de la ejecución de la consulta SQL
     */
    public String EditarCliente() {
        Conexion objmod = new Conexion(); // Crea una instancia de la conexión a la base de datos
        String cad = "UPDATE clientes SET nombreCompleto = '" + this.nombreCompleto
                + "', correo = '" + this.correo + "', telefono = '" + this.telefono
                + "' WHERE idCliente = " + this.idCliente; // Define la consulta SQL para editar el cliente
        return objmod.Ejecutar(cad); // Ejecuta la consulta y devuelve el resultado
    }

    /**
     * Método para guardar un cliente en la base de datos
     * @return Resultado de la ejecución de la consulta SQL
     */
    public String GuardarCliente() {
        Conexion objmod = new Conexion(); // Crea una instancia de la conexión a la base de datos
        String cad = "INSERT INTO clientes (idCliente, nombreCompleto, correo, telefono) VALUES ('"
                + this.idCliente + "', '" + this.nombreCompleto + "', '" + this.correo + "', '"
                + this.telefono + "')"; // Define la consulta SQL para insertar el cliente
        return objmod.Ejecutar(cad); // Ejecuta la consulta y devuelve el resultado
    }
    
    /**
     * Método para obtener una lista de todos los clientes en la base de datos
     * @return Lista de objetos Data_Clientes
     */
    public ArrayList<Data_Clientes> ListaClientes() {
        ArrayList<Data_Clientes> lista = new ArrayList<>(); // Crea una lista para almacenar clientes
        try {
            Conexion objmod = new Conexion(); // Crea una instancia de la conexión a la base de datos
            ResultSet tabla = objmod.Listar("SELECT * FROM clientes"); // Ejecuta la consulta para obtener todos los clientes
            while (tabla.next()) { // Itera sobre los resultados de la consulta
                Data_Clientes objart = new Data_Clientes(); // Crea una nueva instancia de Data_Clientes
                objart.idCliente = tabla.getInt("idCliente"); // Asigna el ID del cliente
                objart.nombreCompleto = tabla.getString("nombreCompleto"); // Asigna el nombre completo del cliente
                objart.correo = tabla.getString("correo"); // Asigna el correo del cliente
                objart.telefono = tabla.getString("telefono"); // Asigna el teléfono del cliente
                lista.add(objart); // Agrega el cliente a la lista
            }
        } catch (SQLException e) { // Captura errores de SQL
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage()); // Muestra un mensaje de error si hay un problema con la consulta
        }
        return lista; // Devuelve la lista de clientes
    }

    // Métodos getter y setter para los atributos de la clase
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
