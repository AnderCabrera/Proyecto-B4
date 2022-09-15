/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Deran
 */
public class validateLogin {
    boolean comprobation = false;
    /**
     *
     * @param usuario
     * @param contraseña
     */
    public void validarUsuario(String usuario, String paswd) {
        try {
            String url = "jdbc:mysql://localhost:3306/sistema_bancario?TimeZone=UTC&useSSL=false";
            String user = "root";
            String password = "mysql.com";

            // Connection
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);

            // Validate login
            String query = "select nombre, contrasena from clientes";

            PreparedStatement preparedStatement = con.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String contrasena = rs.getString("contrasena");

                if (nombre.equals(usuario) && contrasena.equals(paswd)) {
                    comprobation = true;
                }
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean getComprobacion() {
        return comprobation;
    }
}
