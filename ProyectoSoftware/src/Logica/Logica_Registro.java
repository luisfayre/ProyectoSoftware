/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Angel
 */
public class Logica_Registro {

    private Conexion CONEXION_SQL;
    private PreparedStatement PS;
    private ResultSet RS;

    public Logica_Registro() {
        PS = null;
        CONEXION_SQL = new Conexion();
    }

    public int iniciar(String usuario, String contrasena) {
        String SQL_LOGIN = "SELECT * FROM registro WHERE usuario='" + usuario + "' AND contrasena = sha1('" + contrasena + "')";

        int res = 0; //Valor entero de respuesta

        try {

            PS = CONEXION_SQL.getConexion().prepareStatement(SQL_LOGIN);

            RS = PS.executeQuery(); //Almacena el valor optenido en res

            if (RS.next()) {

                res = 1;

            }
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Encontrado");
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }

        } catch (SQLException e) {
            System.err.println("Error al guardar los datos en la base de datos: " + e.getMessage());
        } finally {
            PS = null;
            CONEXION_SQL.desconecar();
        }

        return res;

    }
}
