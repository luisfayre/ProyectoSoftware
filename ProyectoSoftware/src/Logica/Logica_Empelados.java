/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Conexion.Conexion;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.BinaryRefAddr;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis Angel
 */
public class Logica_Empelados {

    //Sentencias SQL
    private final String SQL_INSERT = "INSERT INTO empleados(nombre,apellido,calle,colonia,telefono,rfc,imss,curp,puesto,departamento,ingreso,imagen)VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
    private final String SQL_SELECT = "SELECT * FROM empleados";

    private DefaultTableModel TABLA;
    private ResultSet RS;

    private PreparedStatement PS;

    //Conexion SQL
    private Conexion CONEXION_SQL;

    public Logica_Empelados() {

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
        TABLA.addColumn("IMAGEN");

        return TABLA;
    }

    public int insertarDatos(String nombre, String apellido, String calle, String colonia, String telefono, String rfc, String imss, String curp, String puesto, String departamento, String ingreso, String imagen) throws FileNotFoundException {
        int res = 0; //Valor entero de respuesta
        FileInputStream archivIma;
        try {

            PS = CONEXION_SQL.getConexion().prepareStatement(SQL_INSERT);

            PS.setString(1, nombre);
            PS.setString(2, apellido);
            PS.setString(3, calle);
            PS.setString(4, colonia);
            PS.setString(5, telefono);
            PS.setString(6, rfc);
            PS.setString(7, imss);
            PS.setString(8, curp);
            PS.setString(9, puesto);
            PS.setString(10, departamento);
            PS.setString(11, ingreso);
            archivIma = new FileInputStream(imagen);
            PS.setBinaryStream(12, archivIma);

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

    public int actualizarDatos(String id_empleado, String nombre, String apellido, String calle, String colonia, String telefono, String rfc, String imss, String curp, String puesto, String departamento, String ingreso) {

        String SQL_UPDATE = "UPDATE empleados SET nombre = '" + nombre + "', apellido ='" + apellido + "',calle='" + calle + "',apellido ='" + apellido + "',calle='" + calle + "',colonia='" + colonia + "',telefono = '" + telefono + "', rfc ='" + rfc + "',imss='" + imss + "',curp ='" + curp + "',puesto='" + puesto + "',departamento='" + departamento + "',ingreso='" + ingreso + "' WHERE id_empleado=" + id_empleado;
        int res = 0; //Valor entero de respuesta

        try {

            PS = CONEXION_SQL.getConexion().prepareStatement(SQL_UPDATE);

            res = PS.executeUpdate(); //Almacena el valor optenido en res

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Registro actualizado");
            }

        } catch (SQLException e) {
            System.err.println("Error al modificar los datos en la base de datos: " + e.getMessage());
        } finally {
            PS = null;
            CONEXION_SQL.desconecar();
        }

        return res;

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

    public DefaultTableModel buscarDatos(int crt, String prm) {

        String SQL_BUSQUEDA;
        if (crt == 0) {
            SQL_BUSQUEDA = "SELECT * FROM empleados WHERE id_empleado = " + prm;
        } else if (crt == 1) {
            SQL_BUSQUEDA = "SELECT * FROM empleados WHERE nombre like '" + prm + "%'";
        } else if (crt == 2) {
            SQL_BUSQUEDA = "SELECT * FROM empleados WHERE apellido like '" + prm + "%'";
        } else if (crt == 3) {
            SQL_BUSQUEDA = "SELECT * FROM empleados WHERE calle like '" + prm + "%'";
        } else if (crt == 4) {
            SQL_BUSQUEDA = "SELECT * FROM empleados WHERE colonia like '" + prm + "%'";
        } else {
            SQL_BUSQUEDA = "SELECT * FROM empleados WHERE puesto like '" + prm + "%'";
        }
        try {
            setTitulos();
            PS = CONEXION_SQL.getConexion().prepareStatement(SQL_BUSQUEDA);
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
