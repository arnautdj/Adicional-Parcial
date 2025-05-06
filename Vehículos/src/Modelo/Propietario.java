package Modelo;

public class Propietario {

    private int idProp;
    private String cedula;
    private String apellido;
    private String nombre;

    public Propietario() {
    }

    public Propietario(int idProp, String cedula, String apellido, String nombre) {
        this.idProp = idProp;
        this.cedula = cedula;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getIdProp() {
        return idProp;
    }

    public void setIdProp(int idProp) {
        this.idProp = idProp;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
