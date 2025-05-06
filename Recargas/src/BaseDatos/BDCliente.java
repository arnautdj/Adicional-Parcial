package BaseDatos;

import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BDCliente {
    public void insertarCliente(Connection con, Cliente c) throws SQLException {
        String sql = "INSERT INTO Cliente (cedula, nombres, apellidos) VALUES (?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, c.getCedula());
        ps.setString(2, c.getNombres());
        ps.setString(3, c.getApellidos());
        ps.executeUpdate();
    }
}
