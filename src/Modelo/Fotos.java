package Modelo;

import java.sql.Blob;

public class Fotos {
    private int idFoto;
    private String nombre;
    private Blob foto;

    public Fotos() {
    }

    public Fotos(int idFoto, String nombre, Blob foto) {
        this.idFoto = idFoto;
        this.nombre = nombre;
        this.foto = foto;
    }

    public Fotos(int idFoto, String nombre) {
        this.idFoto = idFoto;
        this.nombre = nombre;
    }

    
    public Fotos(String nombre) {
        this.nombre = nombre;
    }

    
    public int getIdFoto() {
        return idFoto;
    }

    public void setIdFoto(int idFoto) {
        this.idFoto = idFoto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Blob getFoto() {
        return foto;
    }

    public void setFoto(Blob foto) {
        this.foto = foto;
    }
}
