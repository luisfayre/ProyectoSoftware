/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Luis Angel
 */
public class Conexion {

    private static Connection conexion;
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String URL = "jdbc:mysql://localhost:3306/proyectosoftware";

    public Conexion() {
        conexion = null;

        try {
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            if (conexion != null) {
                System.out.println("Conexion Establecida");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar: " + e);
        }
    }

    //Retorna la conexio
    public Connection getConexion() {
        return conexion;
    }

    //Nos desconectamos de la base de datos
    public void desconecar() {

    }

}
