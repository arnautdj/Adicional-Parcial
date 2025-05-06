package BaseDatos;

import Modelo.Propietario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BDPropietario {

    public void insertarPropietario(Connection con, Propietario p) throws SQLException {
        String sql = "INSERT INTO Propietario (cedula, apellido, nombre) VALUES (?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, p.getCedula());
        ps.setString(2, p.getApellido());
        ps.setString(3, p.getNombre());
        ps.executeUpdate();
    }
}
