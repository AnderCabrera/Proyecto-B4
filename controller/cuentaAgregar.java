/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.*;
/**
 *
 * @author Deran
 */
public class cuentaAgregar {
  public void agregarCuenta(int id_cliente, String numero_Cuenta, String tipo_cuenta, int saldo, String fecha)	{
    try {
      String url = "jdbc:mysql://localhost:3306/sistema_bancario?TimeZone=UTC&useSSL=false";
      String user = "root";
      String password = "mysql.com";

      // Connection
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection(url, user, password);
      Statement stmt = con.createStatement();

      // Insert data to the table
      String sql = "call agregar_cuenta(?, ?, ?, ?, ?)";
      PreparedStatement preparedStatement = con.prepareStatement(sql);

      preparedStatement.setInt(1, id_cliente);
      preparedStatement.setString(2, numero_Cuenta);
      preparedStatement.setString(3, tipo_cuenta);
      preparedStatement.setInt(4, saldo);
      preparedStatement.setString(5, fecha);

      preparedStatement.execute();

      con.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
