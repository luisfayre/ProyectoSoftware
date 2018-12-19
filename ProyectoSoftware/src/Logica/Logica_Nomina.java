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
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis Angel
 */
public class Logica_Nomina {

    private static String SQL_EMPLEADOS = "SELECT id_empleado,nombre,apellido,puesto FROM empleados";
    private static String SQL_SELECT = "SELECT * FROM empleados";
    private static String SQL_ASISTENCIAS = "INSERT INTO asistencia(id_empleado,nombre,apellido,puesto,lugar_trabajo,fecha,observacion)VALUES(?,?,?,?,?,?,?)";
    // SELECT * FROM `asistencia` WHERE id_empleado = 1 and fecha BETWEEN '27/11/18' AND '4/12/18'

    private DefaultTableModel TABLA;
    private ResultSet RS;

    private PreparedStatement PS;

    //Conexion SQL
    private Conexion CONEXION_SQL;

    public Logica_Nomina() {

        PS = null;
        CONEXION_SQL = new Conexion();
    }

    private DefaultTableModel setTitulos() {
        TABLA = new DefaultTableModel();
        TABLA.addColumn("ID");
        TABLA.addColumn("NOMBRE");
        TABLA.addColumn("APELLIDO");
        TABLA.addColumn("CALLE");
        TABLA.addColumn("COLONIA");
        TABLA.addColumn("TELEFONO");
        TABLA.addColumn("RFC");
        TABLA.addColumn("IMSS");
        TABLA.addColumn("CURP");
        TABLA.addColumn("PUESTO");
        TABLA.addColumn("DEPARTAMENTO");
        TABLA.addColumn("INGRESO");
        //TABLA.addColumn("IMAGEN");

        return TABLA;
    }

    public DefaultTableModel obtenerDatos() {

        try {
            setTitulos();
            PS = CONEXION_SQL.getConexion().prepareStatement(SQL_SELECT);
            RS = PS.executeQuery();
            Object[] fila = new Object[12];
            //Recorrer los datos obtenidos
            while (RS.next()) {
                fila[0] = RS.getInt(1);
                fila[1] = RS.getString(2);
                fila[2] = RS.getString(3);
                fila[3] = RS.getString(4);
                fila[4] = RS.getString(5);
                fila[5] = RS.getString(6);
                fila[6] = RS.getString(7);
                fila[7] = RS.getString(8);
                fila[8] = RS.getString(9);
                fila[9] = RS.getString(10);
                fila[10] = RS.getString(11);
                fila[11] = RS.getString(12);

                //Agrega las filas obtenidas a la tabla
                TABLA.addRow(fila);
            }
        } catch (Exception e) {

            System.err.println("Error al mostrar los datos: " + e.getMessage());

        } finally {

            PS = null;
            RS = null;
            CONEXION_SQL.desconecar();
        }
        return TABLA;
    }
}
