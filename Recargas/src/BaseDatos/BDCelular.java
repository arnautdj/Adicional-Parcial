package BaseDatos;

import Modelo.Celular;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BDCelular {
    public void insertarCelular(Connection con, Celular cel) throws SQLException {
        String sql = "INSERT INTO Celular (numero, estado, saldo, megas, idClie) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, cel.getNumero());
        ps.setInt(2, cel.getEstado());
        ps.setInt(3, cel.getSaldo());
        ps.setInt(4, cel.getMegas());
        ps.setInt(5, cel.getIdClie());
        ps.executeUpdate();
    }
}
