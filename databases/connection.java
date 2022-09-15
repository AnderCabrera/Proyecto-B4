package databases;

import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;

public class connection {
    private String url = "jdbc:mysql://localhost:3306/sistema_bancario?TimeZone=UTC&useSSL=false";
    private String user = "root";
    private String password = "mysql.com";

    // singleton method to gen Connection
    private static connection instancia;
    
    private Connection conexion;

    private connection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized static connection getInstancia() {
        if (instancia == null)
            instancia = new connection();
        return instancia;
    }

    public Connection getConexion() {
        return conexion;
    }

    public void close() {
        try {
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
