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
public class Logica_Clientes {

    //Sentencias SQL
    private final String SQL_INSERT = "INSERT INTO clientes(nombre_empresa,calle_empresa,colonia_empresa,contacto_empresa,correo_contacto,telefono_contacto,rfc_empresa)VALUES(?,?,?,?,?,?,?)";
    private final String SQL_SELECT = "SELECT * FROM clientes";

    private DefaultTableModel TABLA;
    private ResultSet RS;

    private PreparedStatement PS;

    //Conexion SQL
    private Conexion CONEXION_SQL;

    public Logica_Clientes() {

        PS = null;
        CONEXION_SQL = new Conexion();

    }

    private DefaultTableModel setTitulos() {
        TABLA = new DefaultTableModel();
        TABLA.addColumn("ID");
        TABLA.addColumn("EMPRESA");
        TABLA.addColumn("CALLE");
        TABLA.addColumn("COLONIA");
        TABLA.addColumn("CONTACTO");
        TABLA.addColumn("CORREO");
        TABLA.addColumn("TELEFONO");
        TABLA.addColumn("RFC");

        return TABLA;
    }

    public int insertarDatos(String nombre_empresa, String calle_empresa, String colonia_empresa, String contacto_empresa, String correo_contacto, String telefono_contacto, String rfc_empresa) {
        int res = 0; //Valor entero de respuesta
        //FileInputStream archivIma;
        try {

            PS = CONEXION_SQL.getConexion().prepareStatement(SQL_INSERT);

            PS.setString(1, nombre_empresa);
            PS.setString(2, calle_empresa);
            PS.setString(3, colonia_empresa);
            PS.setString(4, contacto_empresa);
            PS.setString(5, correo_contacto);
            PS.setString(6, telefono_contacto);
            PS.setString(7, rfc_empresa);
            //PS.setString(8, curp);
            //PS.setString(9, puesto);
            // PS.setString(10, departamento);
            //PS.setString(11, ingreso);
            // archivIma = new FileInputStream(imagen);
            // PS.setBinaryStream(12, archivIma);

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

    public int actualizarDatos(String id_cliente, String nombre_empresa, String calle, String colonia, String contacto, String correo, String telefono, String rfc) {

        String SQL_UPDATE = "UPDATE clientes SET nombre_empresa = '" + nombre_empresa + "', calle_empresa ='" + calle + "',colonia_empresa='" + colonia + "',contacto_empresa='" + contacto + "',correo_contacto='" + correo + "',telefono_contacto='" + telefono + "',rfc_empresa='" + rfc + "' WHERE id_cliente=" + id_cliente;
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
            Object[] fila = new Object[9];
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
                //fila[8] = RS.getString(9);
                // fila[11] = RS.getString(12);

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
            SQL_BUSQUEDA = "SELECT * FROM clientes WHERE id_cliente = " + prm;
        } else if (crt == 1) {
            SQL_BUSQUEDA = "SELECT * FROM clientes WHERE nombre_empresa like '" + prm + "%'";
        } else if (crt == 2) {
            SQL_BUSQUEDA = "SELECT * FROM clientes WHERE calle_empresa like '" + prm + "%'";
        } else if (crt == 3) {
            SQL_BUSQUEDA = "SELECT * FROM clientes WHERE colonia_empresa like '" + prm + "%'";
        } else {
            SQL_BUSQUEDA = "SELECT * FROM clientes WHERE contacto_empresa like '" + prm + "%'";
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
