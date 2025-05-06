package Modelo;

public class Cliente {

    private int idClie;
    private String cedula;
    private String nombres;
    private String apellidos;

    public Cliente() {
    }

    public Cliente(int idClie, String cedula, String nombres, String apellidos) {
        this.idClie = idClie;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public int getIdClie() {
        return idClie;
    }

    public void setIdClie(int idClie) {
        this.idClie = idClie;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
