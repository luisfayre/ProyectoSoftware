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
public class Logica_Asistencia {

    private static String SQL_EMPLEADOS = "SELECT id_empleado,nombre,apellido,puesto FROM empleados";
    private static String SQL_ASISTENCIA_VER = "SELECT * FROM asistencia";
    private static String SQL_ASISTENCIAS = "INSERT INTO asistencia(id_empleado,nombre,apellido,puesto,lugar_trabajo,fecha,observacion)VALUES(?,?,?,?,?,?,?)";

    private DefaultTableModel TABLA;
    private ResultSet RS;

    private PreparedStatement PS;

    //Conexion SQL
    private Conexion CONEXION_SQL;

    public Logica_Asistencia() {

        PS = null;
        CONEXION_SQL = new Conexion();
    }

    public int insertarAsitencia(String id_empleado, String nombre, String apellido, String puesto, String lugar_trabajo, String fecha, String observacion) {
        int res = 0; //Valor entero de respuesta

        try {

            PS = CONEXION_SQL.getConexion().prepareStatement(SQL_ASISTENCIAS);

            PS.setString(1, id_empleado);
            PS.setString(2, nombre);
            PS.setString(3, apellido);
            PS.setString(4, puesto);
            PS.setString(5, lugar_trabajo);
            PS.setString(6, fecha);
            PS.setString(7, observacion);

            res = PS.executeUpdate(); //Almacena el valor optenido en res

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Registro guardado");
            }

        } catch (SQLException e) {
            System.err.println("Error al guardar los datos en la base de datos: " + e.getMessage());
        } finally {
            PS = null;
            CONEXION_SQL.desconecar();
        }

        return res;

    }

    private DefaultTableModel setTitulos() {
        TABLA = new DefaultTableModel();
        TABLA.addColumn("ID");
        TABLA.addColumn("NOMBRE");
        TABLA.addColumn("APELLIDO");
        TABLA.addColumn("PUESTO");

        return TABLA;
    }

    private DefaultTableModel setTitulosAsistencia() {
        TABLA = new DefaultTableModel();
        TABLA.addColumn("EMPLEADO ID");
        TABLA.addColumn("NOMBRE");
        TABLA.addColumn("APELLIDO");
        TABLA.addColumn("PUESTO");
        TABLA.addColumn("LUGAR");
        TABLA.addColumn("FECHA");
        TABLA.addColumn("OBSERVACIÓN");

        return TABLA;
    }

    public DefaultTableModel obtenerDatos() {

        try {
            setTitulos();
            PS = CONEXION_SQL.getConexion().prepareStatement(SQL_EMPLEADOS);
            RS = PS.executeQuery();
            Object[] fila = new Object[12];
            //Recorrer los datos obtenidos
            while (RS.next()) {
                fila[0] = RS.getInt(1);
                fila[1] = RS.getString(2);
                fila[2] = RS.getString(3);
                fila[3] = RS.getString(4);

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

    public DefaultTableModel obtenerDatosVisualizar() {

        try {
            setTitulosAsistencia();
            PS = CONEXION_SQL.getConexion().prepareStatement(SQL_ASISTENCIA_VER);
            RS = PS.executeQuery();
            Object[] fila = new Object[12];
            //Recorrer los datos obtenidos
            while (RS.next()) {
                fila[0] = RS.getInt(2);
                fila[1] = RS.getString(3);
                fila[2] = RS.getString(4);
                fila[3] = RS.getString(5);
                fila[4] = RS.getString(6);
                fila[5] = RS.getString(7);
                fila[6] = RS.getString(8);

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
