/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Conexion.Conexion;
import Interfaces.Pantalla_Principal;
import Logica.Logica_Asistencia;
import Logica.Logica_Empelados;
import Logica.Logica_Nomina;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.management.remote.JMXConnectorFactory.connect;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis Angel
 */
public class Formulario_Nomina extends javax.swing.JFrame {

    Logica_Nomina LOGNOM;

    private DefaultTableModel TABLA;
    private ResultSet RS;

    private PreparedStatement PS;
    //Conexion SQL
    private Conexion CONEXION_SQL;

    /**
     * Creates new form Formulario_Asistencia
     */
    public Formulario_Nomina() {
        initComponents();

        LOGNOM = new Logica_Nomina();
        this.setLocationRelativeTo(null);
        listado();
        //jl_DiasTrabajados.setText("7 dias");

    }

    private void listado() {
        /**
         * Metodo encargado de insertar los datos obtenidos del metodo
         * obtenerDatos() de la clase Logica_Empleados.
         */
        jt_Datos.setModel(LOGNOM.obtenerDatos());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtf_nombre = new javax.swing.JTextField();
        jtf_apellido = new javax.swing.JTextField();
        jtf_rfc = new javax.swing.JTextField();
        jtf_imss = new javax.swing.JTextField();
        jtf_curp = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jtf_id = new javax.swing.JTextField();
        dcb_fecha1 = new datechooser.beans.DateChooserCombo();
        dcb_fecha2 = new datechooser.beans.DateChooserCombo();
        jLabel1 = new javax.swing.JLabel();
        jl_DiasTrabajados = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btn_nomina = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_Datos = new javax.swing.JTable();
        btn_atras = new javax.swing.JLabel();
        btn_imp = new javax.swing.JLabel();
        btn_salir = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellido");

        jLabel7.setText("RFC");

        jLabel8.setText("IMSS");

        jLabel9.setText("Curp");

        jLabel10.setText("Puesto");

        jLabel11.setText("Departamento");

        jLabel12.setText("Periodo");

        jtf_nombre.setToolTipText("asd");

        jLabel15.setText("Id");

        jtf_id.setEditable(false);

        jLabel1.setText("Dias trabajados");

        jl_DiasTrabajados.setText("5");

        jLabel14.setText("Bonos");

        jLabel16.setText("Na");

        jLabel17.setText("Faltas");

        jLabel18.setText("2");

        jLabel19.setText("Guardia");

        jLabel5.setText("Operación");

        jLabel6.setText("Salario");

        jLabel13.setText("1250.85");

        btn_nomina.setFont(new java.awt.Font("Montserrat Light", 1, 24)); // NOI18N
        btn_nomina.setForeground(new java.awt.Color(43, 58, 100));
        btn_nomina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton_Nomina.png"))); // NOI18N
        btn_nomina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_nominaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_imss)
                            .addComponent(jtf_curp)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtf_apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(jtf_nombre)
                            .addComponent(jtf_rfc))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(39, 39, 39)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dcb_fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dcb_fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel1)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_DiasTrabajados, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel6)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel13)))
                .addGap(169, 169, 169)
                .addComponent(btn_nomina)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(dcb_fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(dcb_fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jl_DiasTrabajados, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17)))
                            .addComponent(jLabel14)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jtf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jtf_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_rfc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jtf_imss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jtf_curp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel13))
                    .addComponent(btn_nomina, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 890, 290));

        jt_Datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jt_Datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_DatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_Datos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 890, 170));

        btn_atras.setFont(new java.awt.Font("Montserrat Light", 1, 24)); // NOI18N
        btn_atras.setForeground(new java.awt.Color(43, 58, 100));
        btn_atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton_Atras.png"))); // NOI18N
        btn_atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_atrasMouseClicked(evt);
            }
        });
        getContentPane().add(btn_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, -1, 30));

        btn_imp.setFont(new java.awt.Font("Montserrat Light", 1, 24)); // NOI18N
        btn_imp.setForeground(new java.awt.Color(43, 58, 100));
        btn_imp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton_Imprimir.png"))); // NOI18N
        btn_imp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_impMouseClicked(evt);
            }
        });
        getContentPane().add(btn_imp, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 590, -1, 30));

        btn_salir.setFont(new java.awt.Font("Montserrat Light", 1, 24)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(43, 58, 100));
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton_Salir.png"))); // NOI18N
        btn_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_salirMouseClicked(evt);
            }
        });
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 590, -1, 30));

        fondo.setFont(new java.awt.Font("Montserrat Light", 1, 48)); // NOI18N
        fondo.setForeground(new java.awt.Color(255, 255, 255));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NominaV.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jt_DatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_DatosMouseClicked
        // TODO add your handling code here:
        int fila = jt_Datos.getSelectedRow(); //Variable int para obtener la fila seleccionada
        jtf_id.setText(jt_Datos.getValueAt(fila, 0).toString()); //Setemaos el valor de la fila seleccionada en la columna 0
        jtf_nombre.setText(jt_Datos.getValueAt(fila, 1).toString()); //Setemaos el valor de la fila seleccionada en la columna 0
        jtf_apellido.setText(jt_Datos.getValueAt(fila, 2).toString()); //Setemaos el valor de la fila seleccionada en la columna 0
        jtf_rfc.setText(jt_Datos.getValueAt(fila, 3).toString()); //Setemaos el valor de la fila seleccionada en la columna 0
        jtf_imss.setText(jt_Datos.getValueAt(fila, 4).toString()); //Setemaos el valor de la fila seleccionada en la columna 0
        jtf_curp.setText(jt_Datos.getValueAt(fila, 5).toString()); //Setemaos el valor de la fila seleccionada en la columna 0
    }//GEN-LAST:event_jt_DatosMouseClicked

    private void btn_atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_atrasMouseClicked
        // TODO add your handling code here:
        Pantalla_Principal PAN_PRIN = new Pantalla_Principal();
        this.setVisible(false);
        dispose();
        PAN_PRIN.setVisible(true);
    }//GEN-LAST:event_btn_atrasMouseClicked

    private void btn_impMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_impMouseClicked
        // TODO add your handling code here:
//
//        // Obtiene los datos obtenidos del formulario.
//        String nombre = jtf_nombre.getText();
//        String apellido = jtf_apellido.getText();
//        String calle = jtf_calle.getText();
//        String colonia = jtf_calle.getText();
//        String telefono = jtf_telefono.getText();
//        String rfc = jtf_rfc.getText();
//        String imss = jtf_imss.getText();
//        String curp = jtf_curp.getText();
//        String puesto = jcb_puesto.getSelectedItem().toString();
//        String departamento = jtf_departamento.getText();
//        String ingreso = dcb_ingreso.getText();
//
//        String datos = jlb_Foto.getText();
//        //        InputStream imagen = jlb_Foto.getText();
//
//        /**
//        * Inserta los datos obtenidos del formulario en la base de datos.Res
//        * regresa un valo entero al insertar un campo.
//        */
//        int res = LEMPLEADOS.insertarDatos(nombre, apellido, calle, colonia, telefono, rfc, imss, curp, puesto, departamento, ingreso);
//
//        /**
//        * Cuando res regresa un valor mayor a 0 actulizamos nuestra tabla.
//        */
//        if (res > 0) {
//            listado(); //Llama la funcion para mostrar los datos
//            limpiar(); //Llama la funcion limpiar los datos
//        }

        Toolkit tkp = jPanel2.getToolkit();
        PrintJob pjp = tkp.getPrintJob(this, null, null);
        Graphics g = pjp.getGraphics();
        jPanel2.print(g);
        g.dispose();
        pjp.end();
    }//GEN-LAST:event_btn_impMouseClicked

    private void btn_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_salirMouseClicked

    private void btn_nominaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nominaMouseClicked
        // TODO add your handling code here:
//        int fila = jt_Datos.getSelectedRow(); //Variable int para obtener la fila seleccionada
//        String id_empleado = jt_Datos.getValueAt(fila, 0).toString();
//        String fecha1 = dcb_fecha1.getText();
//        String fecha2 = dcb_fecha2.getText();

        /*        int numberRow = 0;
        // String SQL_NOMINA = "SELECT COUNT(*) FROM asistencia WHERE id_empleado =" + id_empleado + "and fecha BETWEEN '" + fecha1 + "' AND '" + fecha2 + "'";
        String query = "select count(nombre) from empleados";
        try {
        // setTitulos();
        PS = CONEXION_SQL.getConexion().prepareStatement(query);
        RS = PS.executeQuery();
        if (RS.next()) {
        String sum = RS.getString("count(nombre)");
        }
        
        //  String dias = RS.getString(1);
        //jl_DiasTrabajados.setText(dias);
        // RS.next();
        //numberRow = RS.getInt(1);
        } catch (Exception e) {
        
        System.err.println("Error al mostrar los datos: " + e.getMessage());
        
        } finally {
        
        //  PS = null;
        //  RS = null;
        //            CONEXION_SQL.desconecar();
        }*/

    }//GEN-LAST:event_btn_nominaMouseClicked
    /*    public void printComponenet(Component component) {
    PrinterJob pj = PrinterJob.getPrinterJob();
    pj.setJobName(" Print Component ");
    
    pj.setPrintable(new Printable() {
    public int print(Graphics pg, PageFormat pf, int pageNum) {
    if (pageNum > 0) {
    return Printable.NO_SUCH_PAGE;
    }
    
    Graphics2D g2 = (Graphics2D) pg;
    g2.translate(pf.getImageableX(), pf.getImageableY());
    component.paint(g2);
    return Printable.PAGE_EXISTS;
    }
    });
    if (pj.printDialog() == false) {
    return;
    }
    
    try {
    pj.print();
    } catch (PrinterException ex) {
    // handle exception
    }
    }*/

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulario_Nomina.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_Nomina.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_Nomina.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_Nomina.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Formulario_Nomina().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_atras;
    private javax.swing.JLabel btn_imp;
    private javax.swing.JLabel btn_nomina;
    private javax.swing.JLabel btn_salir;
    private datechooser.beans.DateChooserCombo dcb_fecha1;
    private datechooser.beans.DateChooserCombo dcb_fecha2;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jl_DiasTrabajados;
    private javax.swing.JTable jt_Datos;
    private javax.swing.JTextField jtf_apellido;
    private javax.swing.JTextField jtf_curp;
    private javax.swing.JTextField jtf_id;
    private javax.swing.JTextField jtf_imss;
    private javax.swing.JTextField jtf_nombre;
    private javax.swing.JTextField jtf_rfc;
    // End of variables declaration//GEN-END:variables

}