package clases;

import java.sql.*;

public class Conexion {
    //Conexiion Local
    public static Connection conectar(){
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ss", "root", "");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en conexion local " + e);
        }
        return (null);
    }
}
