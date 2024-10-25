package Modelos;

public class Camion {
    private int idCamion;
    private String modelo;
    private String marca;
    private String placa;
    private String estado;

    public Camion(int idCamion, String modelo, String marca, String placa, String estado) {
        this.idCamion = idCamion;
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.estado = estado;
    }

    // Getters
    public int getIdCamion() { return idCamion; }
    public String getModelo() { return modelo; }
    public String getMarca() { return marca; }
    public String getPlaca() { return placa; }
    public String getEstado() { return estado; }
}
