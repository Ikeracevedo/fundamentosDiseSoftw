package capa_negocio; // Define el paquete al que pertenece esta clase

import capa_datos.Conexion; // Importa la clase Conexion para manejar la conexión con la base de datos
import java.sql.ResultSet; // Importa la clase ResultSet para manejar resultados de consultas SQL
import java.sql.SQLException; // Importa la clase SQLException para manejar excepciones de SQL
import java.util.ArrayList; // Importa la clase ArrayList para manejar listas dinámicas

/**
 * Clase para manejar los datos de los empleados
 * @author Lenovo
 */
public class Data_Empleado {

    private int idEmpleado; // ID único del empleado
    private String NombreCompleto; // Nombre completo del empleado
    private String Rol; // Rol del empleado

    /**
     * Método para eliminar un empleado de la base de datos por el ID.
     * @return Resultado de la ejecución de la consulta SQL
     */
    public String EliminarEmpleado() {
        Conexion objmod = new Conexion(); // Crea una instancia de la conexión a la base de datos
        String cad = "DELETE FROM empleados WHERE IdEmpleado = " + this.getIdEmpleado(); // Define la consulta SQL para eliminar el empleado
        return objmod.Ejecutar(cad); // Ejecuta la consulta y devuelve el resultado
    }

    /**
     * Actualizar los datos de un empleado existente.
     * @return Resultado de la ejecución de la consulta SQL
     */
    public String EditarEmpleado() {
        Conexion objmod = new Conexion(); // Crea una instancia de la conexión a la base de datos
        String cad = "UPDATE empleados SET NombreCompleto = '" + this.getNombreCompleto()
                + "', Rol = '" + this.getRol() + "' WHERE IdEmpleado = " + this.getIdEmpleado(); // Define la consulta SQL para editar el empleado
        return objmod.Ejecutar(cad); // Ejecuta la consulta y devuelve el resultado
    }

    /**
     * Insertar un nuevo empleado en la base de datos.
     * @return Resultado de la ejecución de la consulta SQL
     */
    public String GuardarEmpleado() {
        Conexion objmod = new Conexion(); // Crea una instancia de la conexión a la base de datos
        String cad = "INSERT INTO empleados (IdEmpleado, NombreCompleto, Rol) VALUES ("
                + this.getIdEmpleado() + ", '" + this.getNombreCompleto() + "', '" + this.getRol() + "')"; // Define la consulta SQL para insertar el empleado
        return objmod.Ejecutar(cad); // Ejecuta la consulta y devuelve el resultado
    }

    /**
     * Lista todos los empleados de la base de datos.
     * @return Lista de objetos Data_Empleado
     */
    public ArrayList<Data_Empleado> ListaEmpleados() {
        ArrayList<Data_Empleado> lista = new ArrayList<>(); // Crea una lista para almacenar empleados
        try {
            Conexion objmod = new Conexion(); // Crea una instancia de la conexión a la base de datos
            ResultSet tabla = objmod.Listar("SELECT * FROM empleados"); // Ejecuta la consulta SQL para obtener todos los empleados
            Data_Empleado objEmpleado; // Variable para almacenar un objeto Data_Empleado
            while (tabla.next()) { // Itera sobre los resultados de la consulta
                objEmpleado = new Data_Empleado(); // Crea una nueva instancia de Data_Empleado
                objEmpleado.setIdEmpleado(tabla.getInt("IdEmpleado")); // Asigna el ID del empleado
                objEmpleado.setNombreCompleto(tabla.getString("NombreCompleto")); // Asigna el nombre completo del empleado
                objEmpleado.setRol(tabla.getString("Rol")); // Asigna el rol del empleado
                lista.add(objEmpleado); // Agrega el empleado a la lista
            }
        } catch (SQLException e) { // Captura errores de SQL
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage()); // Muestra un mensaje de error si hay un problema con la consulta
        }
        return lista; // Devuelve la lista de empleados
    }

    // Métodos Getter y Setter para los atributos de la clase

    public int getIdEmpleado() {
        return idEmpleado; // Devuelve el ID del empleado
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado; // Asigna el ID del empleado
    }

    public String getNombreCompleto() {
        return NombreCompleto; // Devuelve el nombre completo del empleado
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.NombreCompleto = nombreCompleto; // Asigna el nombre completo del empleado
    }

    public String getRol() {
        return Rol; // Devuelve el rol del empleado
    }

    public void setRol(String rol) {
        this.Rol = rol; // Asigna el rol del empleado
    }
}
