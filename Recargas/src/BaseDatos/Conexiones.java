package BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexiones {
    
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/recargas";
        String user = "root";
        String pass = "11805847221";
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, user, pass);
    } 
}

