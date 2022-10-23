package Modelo;

import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class FotosDAO extends Conexion {

    private Connection cn = null;
    private ResultSet rs = null;
    private CallableStatement cs = null;
    private PreparedStatement ps = null;

    private static FotosDAO instancia;

    public static FotosDAO getInstancia() {
        if (instancia == null) {
            instancia = new FotosDAO();
        }
        return instancia;
    }

    public void insertarFoto(String nombre, FileInputStream foto, int longitudBytes) throws SQLException {
        cn = getConexion();
        String sql = "insert into fotos (nombre,foto) values (?,?)";
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setBlob(2, foto, longitudBytes);
            ps.execute();
        } catch (Exception ex) {
            System.out.println("Error al guardar foto: " + ex.getMessage());
        } finally {
            cn.close();
            ps.close();
        }
    }

    public Fotos buscarFoto(int id) throws SQLException {
        cn = getConexion();
        PreparedStatement ps = null;
        Fotos fotos = null;
        try {
            String sql = "select * from fotos where id_foto= ?";
            ps = cn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                String nombre = rs.getString("nombre");

                fotos = new Fotos(id, nombre);
            }
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        } finally {
            cn.close();
            ps.close();
        }
        return fotos;
    }

    public ImageIcon getFoto(int id) {
        cn = getConexion();
        String sql = "select foto from fotos where id_foto= " + id;
        ImageIcon ii = null;
        InputStream is = null;
        try {
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                is = rs.getBinaryStream(1);
                BufferedImage bi = ImageIO.read(is);
                ii = new ImageIcon(bi);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return ii;
    }

}
