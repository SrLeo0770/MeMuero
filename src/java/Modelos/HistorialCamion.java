package Modelos;

import java.sql.Timestamp;

public class HistorialCamion {
    private int idHistorial;
    private int idCamion;
    private String cambio;
    private Timestamp fecha;
    private String usuario;

    public HistorialCamion(int idHistorial, int idCamion, String cambio, Timestamp fecha, String usuario) {
        this.idHistorial = idHistorial;
        this.idCamion = idCamion;
        this.cambio = cambio;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    // Getters
    public int getIdHistorial() { return idHistorial; }
    public int getIdCamion() { return idCamion; }
    public String getCambio() { return cambio; }
    public Timestamp getFecha() { return fecha; }
    public String getUsuario() { return usuario; }
}
