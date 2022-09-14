package controller;

import java.sql.*;
//import register from src\views\register.java

public class clientes {

  // singleton pattern to class clientes
  private static clientes instancia;
  private Connection conexion;

  public clientes() {
    conexion = databases.connection.getInstancia().getConexion();
  }

  public synchronized static clientes getInstancia() {
    if (instancia == null)
      instancia = new clientes();
    return instancia;
  }

    
  public void insertarClientes(String nombre, String apellido, String sexo, String direccion, String nacionalidad,
      String dpi,
      String telefono, String compania_telefono, String correo_electronico, String contrasena) {

    try {
      String url = "jdbc:mysql://localhost:3306/sistema_bancario?TimeZone=UTC";
      String user = "root";
      String password = "mysql.com";

      // Connection
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection(url, user, password);
      Statement stmt = con.createStatement();

      // Insert data to the table
      String sql = "call agregar_cliente(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
      PreparedStatement preparedStatement = con.prepareStatement(sql);

      preparedStatement.setString(1, nombre);
      preparedStatement.setString(2, apellido);
      preparedStatement.setString(3, sexo);
      preparedStatement.setString(4, direccion);
      preparedStatement.setString(5, nacionalidad);
      preparedStatement.setString(6, dpi);
      preparedStatement.setString(7, telefono);
      preparedStatement.setString(8, compania_telefono);
      preparedStatement.setString(9, correo_electronico);
      preparedStatement.setString(10, contrasena);

      preparedStatement.execute();

      con.close();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
