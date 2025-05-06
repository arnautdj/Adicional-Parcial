package BaseDatos;

import Modelo.Vehiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BDVehiculo {

    public void insertarVehiculo(Connection con, Vehiculo v) throws SQLException {
        String sql = "INSERT INTO Vehiculo (placa, marca, estado, idProp) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, v.getPlaca());
        ps.setString(2, v.getMarca());
        ps.setInt(3, v.getEstado());
        ps.setInt(4, v.getIdProp());
        ps.executeUpdate();
    }
}
