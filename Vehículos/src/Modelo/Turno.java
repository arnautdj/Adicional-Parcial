package Modelo;

public class Turno {

    private int idTurn;
    private int anden;
    private String dia;
    private String hora;
    private int idVehi;

    public Turno() {
    }

    public Turno(int idTurn, int anden, String dia, String hora, int idVehi) {
        this.idTurn = idTurn;
        this.anden = anden;
        this.dia = dia;
        this.hora = hora;
        this.idVehi = idVehi;
    }

    public int getIdTurn() {
        return idTurn;
    }

    public void setIdTurn(int idTurn) {
        this.idTurn = idTurn;
    }

    public int getAnden() {
        return anden;
    }

    public void setAnden(int anden) {
        this.anden = anden;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getIdVehi() {
        return idVehi;
    }

    public void setIdVehi(int idVehi) {
        this.idVehi = idVehi;
    }

}
