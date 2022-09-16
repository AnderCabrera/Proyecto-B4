package controller;

import java.sql.*;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class mostrarClientes {
    private static mostrarClientes instancia;
    private Connection conexion;
    // connection con = connection.getInstancia();
    
    public mostrarClientes() {
        conexion = databases.connection.getInstancia().getConexion();
    }
    
    public synchronized static mostrarClientes getInstancia() {
        if (instancia == null)
        instancia = new mostrarClientes();
        return instancia;
    }
    
    public void mostrarUsuariosTabla(TableModel tabla) {
        try {
            String url = "jdbc:mysql://localhost:3306/sistema_bancario?TimeZone=UTC&useSSL=false";
            String user = "root";
            String password = "mysql.com";

            String sql = "SELECT * FROM clientes";
            
            // Connection
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // Loop
            while (rs.next()) {
                int id = rs.getInt("id_cliente");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String sexo = rs.getString("sexo");
                String direccion = rs.getString("direccion");
                String nacionalidad = rs.getString("nacionalidad");
                String dpi = rs.getString("dpi");
                String telefono = rs.getString("telefono");
                String compania_telefono = rs.getString("compania_telefono");
                String correo_electronico = rs.getString("correo_electronico");
                String contrasena = rs.getString("contrasena");

                Object tbData[] = {id, nombre, apellido, sexo, direccion, nacionalidad, dpi, telefono, compania_telefono, correo_electronico, contrasena};

                DefaultTableModel tblModel = (DefaultTableModel) tabla;
                tblModel.addRow(tbData);
            }

            // Insert data to the table

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}