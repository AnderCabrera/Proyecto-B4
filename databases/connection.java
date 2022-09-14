package databases;

import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;

public class connection {
    private String url = "jdbc:mysql://localhost:3306/sistema_bancario?TimeZone=UTC&useSSL=false";
    private String user = "root";
    private String password = "mysql.com";
    private Connection conexion;
    private static connection instancia;
    
    public connection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, user, password);
        }catch(Exception error){
            error.printStackTrace();
        }
    }
    
    public synchronized static connection getInstancia(){
       if (instancia == null)
           instancia = new connection();
       return instancia;
    }
    
    public Connection getConexion(){
        return conexion;
    }
    
    public void setConexion(Connection conexion){
        this.conexion = conexion;
    }
}
