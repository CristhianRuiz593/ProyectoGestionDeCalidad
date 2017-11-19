package com.demo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Jona
 */
public class conexion_mysql {

    private static String ACCESO_BASE = "jdbc:mysql://localhost:3306/disprovef";
    private static String USERNAME = "root";
    private static String PASSWORD = "Cmullo*079";

    public static Connection conectar() {
        Connection con = null;
        String url = "jdbc:mysql://localhost/disprovef?user=" + USERNAME
                + "&password=" + PASSWORD;
        try {
            con = DriverManager.getConnection(url);
            if (con != null) {
                System.out.println("Conectado");
            }
        } catch (SQLException e) {
            System.out.println("No se pudo conectar a la base de datos");
            e.printStackTrace();
        }
        return con;
    }
}
