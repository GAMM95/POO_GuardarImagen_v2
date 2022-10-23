package Modelo;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {

    private static Conexion instancia;

    public static Conexion getInstancia() {
        if (instancia == null) {
            instancia = new Conexion();

        }
        return instancia;
    }

    public Conexion() {

    }

    public static final String url = "jdbc:mysql://localhost:3306/bd_imagen";
    public static final String user = "root";
    public static final String pass = "abc123";

    public Connection getConexion() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }

    public static void main(String[] argumentos) {
        try {
            JOptionPane.showMessageDialog(null, Conexion.getInstancia().getConexion(), "Conexion establecida", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion\nRevisar Driver" + ex.getMessage(), "Error de conexión", JOptionPane.ERROR_MESSAGE);

        }
    }
}
