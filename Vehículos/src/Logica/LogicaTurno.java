package Logica;

import BaseDatos.Conexiones;
import Modelo.Turno;
import java.sql.*;

public class LogicaTurno {
    
    public boolean puedeReservarTurno(Connection con, Turno turno) throws SQLException {
        String q1 = "SELECT COUNT(*) FROM Turno WHERE idVehi = ? AND dia = ?";
        PreparedStatement ps1 = con.prepareStatement(q1);
        ps1.setInt(1, turno.getIdVehi());
        ps1.setString(2, turno.getDia());
        ResultSet rs1 = ps1.executeQuery();
        rs1.next();
        if (rs1.getInt(1) > 0) return false;

        String q2 = "SELECT COUNT(*) FROM Turno WHERE idVehi = ? AND dia = ? AND anden = ?";
        PreparedStatement ps2 = con.prepareStatement(q2);
        ps2.setInt(1, turno.getIdVehi());
        ps2.setString(2, turno.getDia());
        ps2.setInt(3, turno.getAnden());
        ResultSet rs2 = ps2.executeQuery();
        rs2.next();
        return rs2.getInt(1) == 0;
    }

    public void reservarTurno(Connection con, Turno turno) throws SQLException {
        String q = "INSERT INTO Turno (anden, dia, hora, idVehi) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(q);
        ps.setInt(1, turno.getAnden());
        ps.setString(2, turno.getDia());
        ps.setString(3, turno.getHora());
        ps.setInt(4, turno.getIdVehi());
        ps.executeUpdate();
    }
    
}
