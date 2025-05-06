package BaseDatos;

import Modelo.Recarga;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BDRecarga {
    public void insertarRecarga(Connection con, Recarga r) throws SQLException {
        String sql = "INSERT INTO Recarga (valor, saldo, megas, idCel) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, r.getValor());
        ps.setInt(2, r.getSaldo());
        ps.setInt(3, r.getMegas());
        ps.setInt(4, r.getIdCel());
        ps.executeUpdate();
    }
}
