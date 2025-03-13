package capa_datos;

import java.sql.*;

public class Conexion {

    private final String url = "jdbc:mysql://localhost:3306/alquilercarros"; // URL de la BD
    private final String user = "root"; 
    private final String pwd = "";

    private Connection cn = null; // Objeto para la conexión

    public Conexion() {
        try {
            cn = DriverManager.getConnection(url, user, pwd); // Establece la conexión
            cn.setAutoCommit(false); // Desactiva auto-commit para mayor control
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
    }

    public Connection getConnection() {
        return cn; // Devuelve la conexión para ser usada en otras clases
    }

    public ResultSet Listar(String consulta) {
        ResultSet rs = null;
        try {
            PreparedStatement stmt = cn.prepareStatement(consulta);
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        }
        return rs;
    }

    public String Ejecutar(String consulta) {
        PreparedStatement stmt = null;
        try {
            stmt = cn.prepareStatement(consulta);
            int filasAfectadas = stmt.executeUpdate();

            cn.commit(); // Confirma la transacción para asegurar cambios

            if (filasAfectadas > 0) {
                return "Operación exitosa, filas afectadas: " + filasAfectadas;
            } else {
                return "No se realizaron cambios en la base de datos.";
            }
        } catch (SQLException e) {
            try {
                cn.rollback(); // Deshace cambios si hay error
            } catch (SQLException ex) {
                System.out.println("Error en rollback: " + ex.getMessage());
            }
            return "Error al ejecutar la consulta: " + e.getMessage();
        }
    }

    public void cerrarConexion() {
        try {
            if (cn != null) {
                cn.close();
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar conexión: " + e.getMessage());
        }
    }
}