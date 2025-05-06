package Modelo;

public class Vehiculo {

    private int idVehi;
    private String placa;
    private String marca;
    private int estado;
    private int idProp;

    public Vehiculo() {
    }

    public Vehiculo(int idVehi, String placa, String marca, int estado, int idProp) {
        this.idVehi = idVehi;
        this.placa = placa;
        this.marca = marca;
        this.estado = estado;
        this.idProp = idProp;
    }

    public int getIdVehi() {
        return idVehi;
    }

    public void setIdVehi(int idVehi) {
        this.idVehi = idVehi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getIdProp() {
        return idProp;
    }

    public void setIdProp(int idProp) {
        this.idProp = idProp;
    }

}
