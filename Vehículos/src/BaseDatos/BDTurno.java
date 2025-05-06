package BaseDatos;

import Modelo.Turno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BDTurno {

    public void insertarTurno(Connection con, Turno t) throws SQLException {
        String sql = "INSERT INTO Turno (anden, dia, hora, idVehi) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, t.getAnden());
        ps.setString(2, t.getDia());
        ps.setString(3, t.getHora());
        ps.setInt(4, t.getIdVehi());
        ps.executeUpdate();
    }
}
