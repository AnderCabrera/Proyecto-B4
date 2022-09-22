package controller;

import java.sql.*;

public class EliminarUsuario {
  public void EliminarUsuario(int idUsuario) {
    try {
      String url = "jdbc:mysql://localhost:3306/sistema_bancario?TimeZone=UTC&useSSL=false";
      String user = "root";
      String password = "mysql.com";

      // Connection
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection(url, user, password);
      Statement stmt = con.createStatement();

      // Insert data to the table
      String sql = "call delete_cliente(?)";
      PreparedStatement preparedStatement = con.prepareStatement(sql);

      preparedStatement.setInt(1, idUsuario);

      preparedStatement.execute();

      con.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
