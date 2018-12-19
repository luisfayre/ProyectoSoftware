/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Conexion.Conexion;
import Interfaces.Empleados;
import Interfaces.Pantalla_Principal;
import Logica.Logica_Asistencia;
import Logica.Logica_Clientes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;

/**
 *
 * @author Luis Angel
 */
public class Formulario_Asistencia extends javax.swing.JFrame {

    private Logica_Asistencia LASISTECIA;
    private ResultSet RS;

    private PreparedStatement PS;

    //Conexion SQL
    private Conexion CONEXION_SQL;

    /**
     * Creates new form Formulario_Asistencia
     */
    public Formulario_Asistencia() {
        initComponents();

        LASISTECIA = new Logica_Asistencia();
        this.setLocationRelativeTo(null);
        listado();
        // pruebadatos();
        //jComboBox1.getComponent(LASISTECIA.pruebadatos());

//        String SQL_BUSQUEDA = "SELECT * FROM clientes";
//        try {
//            //setTitulos();
//            PS = CONEXION_SQL.getConexion().prepareStatement(SQL_BUSQUEDA);
//            RS = PS.executeQuery();
//            //Recorrer los datos obtenidos
//            while (RS.next()) {
//              //  String casas = RS.getString("id_cliente");
//                jComboBox1.addItem(RS.getString(SQL_BUSQUEDA));
//            }
//        } catch (Exception e) {
//
//            System.err.println("Error al mostrar los datos: " + e.getMessage());
//
//        }
    }

//    private void pruebadatos() {
//        //JComboBox jc = new JComboBox();
//        String SQL_BUSQUEDA = "SELECT * FROM clientes";
//        try {
//            //setTitulos();
//            PS = CONEXION_SQL.getConexion().prepareStatement(SQL_BUSQUEDA);
//            RS = PS.executeQuery();
//            //Recorrer los datos obtenidos
//            while (RS.next()) {
//                String casas = RS.getString("id_cliente");
//                jComboBox1.addItem(casas);
//            }
//        } catch (Exception e) {
//
//            System.err.println("Error al mostrar los datos: " + e.getMessage());
//
//        }
//    }
    private void listado() {
        /**
         * Metodo encargado de insertar los datos obtenidos del metodo
         * obtenerDatos() de la clase Logica_Empleados.
         */
        jt_Datos.setModel(LASISTECIA.obtenerDatos());
    }
      private void listadoasistencia() {
        /**
         * Metodo encargado de insertar los datos obtenidos del metodo
         * obtenerDatos() de la clase Logica_Empleados.
         */
        jt_Datos.setModel(LASISTECIA.obtenerDatosVisualizar());
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
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtf_nombre = new javax.swing.JTextField();
        jtf_apellido = new javax.swing.JTextField();
        jtf_puesto = new javax.swing.JTextField();
        jtf_lugar_trabajo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jtf_id = new javax.swing.JTextField();
        dcb_fecha = new datechooser.beans.DateChooserCombo();
        jtf_observacion = new javax.swing.JComboBox<>();
        btn_Asistecia = new javax.swing.JLabel();
        btn_Asistecia1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_Datos = new javax.swing.JTable();
        btn_atras = new javax.swing.JLabel();
        btn_salir = new javax.swing.JLabel();
        btn_guardar = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellido");

        jLabel10.setText("Puesto");

        jLabel11.setText("Lugar de trabajo");

        jLabel12.setText("Fecha de asistencia");

        jtf_nombre.setEditable(false);
        jtf_nombre.setToolTipText("asd");

        jtf_apellido.setEditable(false);

        jtf_puesto.setEditable(false);

        jLabel14.setText("Observacion");

        jLabel15.setText("Id");

        jtf_id.setEditable(false);

        dcb_fecha.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));

    jtf_observacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Asistencia", "Falta" }));

    btn_Asistecia.setFont(new java.awt.Font("Montserrat Light", 1, 24)); // NOI18N
    btn_Asistecia.setForeground(new java.awt.Color(43, 58, 100));
    btn_Asistecia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton_Asistencia.png"))); // NOI18N
    btn_Asistecia.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            btn_AsisteciaMouseClicked(evt);
        }
    });

    btn_Asistecia1.setFont(new java.awt.Font("Montserrat Light", 1, 24)); // NOI18N
    btn_Asistecia1.setForeground(new java.awt.Color(43, 58, 100));
    btn_Asistecia1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton_Empleados.png"))); // NOI18N
    btn_Asistecia1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            btn_Asistecia1MouseClicked(evt);
        }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(28, 28, 28)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel14)
                .addComponent(jLabel15)
                .addComponent(jLabel3)
                .addComponent(jLabel4)
                .addComponent(jLabel10)
                .addComponent(jLabel11)
                .addComponent(jLabel12))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dcb_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtf_nombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_puesto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_apellido, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_lugar_trabajo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)))
                    .addGap(348, 595, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jtf_observacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Asistecia1))))
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(btn_Asistecia))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel15)
                .addComponent(jtf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3)
                .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jtf_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel4))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jtf_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel10))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel11)
                .addComponent(jtf_lugar_trabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel12)
                .addComponent(dcb_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jtf_observacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(btn_Asistecia1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btn_Asistecia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(23, Short.MAX_VALUE))
    );

    getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 880, 260));

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

    getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 371, 880, 200));

    btn_atras.setFont(new java.awt.Font("Montserrat Light", 1, 24)); // NOI18N
    btn_atras.setForeground(new java.awt.Color(43, 58, 100));
    btn_atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton_Atras.png"))); // NOI18N
    btn_atras.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            btn_atrasMouseClicked(evt);
        }
    });
    getContentPane().add(btn_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, -1, 30));

    btn_salir.setFont(new java.awt.Font("Montserrat Light", 1, 24)); // NOI18N
    btn_salir.setForeground(new java.awt.Color(43, 58, 100));
    btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton_Salir.png"))); // NOI18N
    btn_salir.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            btn_salirMouseClicked(evt);
        }
    });
    getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 590, -1, 30));

    btn_guardar.setFont(new java.awt.Font("Montserrat Light", 1, 24)); // NOI18N
    btn_guardar.setForeground(new java.awt.Color(43, 58, 100));
    btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton_Guardar.png"))); // NOI18N
    btn_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            btn_guardarMouseClicked(evt);
        }
    });
    getContentPane().add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 590, -1, 30));

    fondo.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
    fondo.setForeground(new java.awt.Color(255, 255, 255));
    fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AsistenciaEmpleados.png"))); // NOI18N
    getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, -1));

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jt_DatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_DatosMouseClicked
        // TODO add your handling code here:
        int fila = jt_Datos.getSelectedRow(); //Variable int para obtener la fila seleccionada
        jtf_id.setText(jt_Datos.getValueAt(fila, 0).toString()); //Setemaos el valor de la fila seleccionada en la columna 0
        jtf_nombre.setText(jt_Datos.getValueAt(fila, 1).toString()); //Setemaos el valor de la fila seleccionada en la columna 1
        jtf_apellido.setText(jt_Datos.getValueAt(fila, 2).toString()); //Setemaos el valor de la fila seleccionada en la columna 1
        jtf_puesto.setText(jt_Datos.getValueAt(fila, 3).toString()); //Setemaos el valor de la fila seleccionada en la columna 1
    }//GEN-LAST:event_jt_DatosMouseClicked

    private void btn_atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_atrasMouseClicked
        // TODO add your handling code here:
        Empleados EMP = new Empleados();
        this.setVisible(false);
        dispose();
        EMP.setVisible(true);
    }//GEN-LAST:event_btn_atrasMouseClicked

    private void btn_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_salirMouseClicked

    private void btn_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardarMouseClicked
        // TODO add your handling code here:

        // Obtiene los datos obtenidos del formulario.
        String id_empleado = jtf_id.getText();
        String nombre = jtf_nombre.getText();
        String apellido = jtf_apellido.getText();
        String puesto = jtf_puesto.getText();
        String lugar_trabajo = jtf_lugar_trabajo.getText();
        String fecha = dcb_fecha.getText();
        String observacion = jtf_observacion.getSelectedItem().toString();

        /**
         * Inserta los datos obtenidos del formulario en la base de datos.Res
         * regresa un valo entero al insertar un campo.
         */
        int res = LASISTECIA.insertarAsitencia(id_empleado, nombre, apellido, puesto, lugar_trabajo, fecha, observacion);

        /**
         * Cuando res regresa un valor mayor a 0 actulizamos nuestra tabla.
         */
        if (res > 0) {
            //  listado(); //Llama la funcion para mostrar los datos
            //   limpiar(); //Llama la funcion limpiar los datos
        }
    }//GEN-LAST:event_btn_guardarMouseClicked

    private void btn_AsisteciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AsisteciaMouseClicked
        // TODO add your handling code here:
        listadoasistencia();
    }//GEN-LAST:event_btn_AsisteciaMouseClicked

    private void btn_Asistecia1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Asistecia1MouseClicked
        // TODO add your handling code here:
        listado();
    }//GEN-LAST:event_btn_Asistecia1MouseClicked

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
            java.util.logging.Logger.getLogger(Formulario_Asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_Asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_Asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_Asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario_Asistencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_Asistecia;
    private javax.swing.JLabel btn_Asistecia1;
    private javax.swing.JLabel btn_atras;
    private javax.swing.JLabel btn_guardar;
    private javax.swing.JLabel btn_salir;
    private datechooser.beans.DateChooserCombo dcb_fecha;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jt_Datos;
    private javax.swing.JTextField jtf_apellido;
    private javax.swing.JTextField jtf_id;
    private javax.swing.JTextField jtf_lugar_trabajo;
    private javax.swing.JTextField jtf_nombre;
    private javax.swing.JComboBox<String> jtf_observacion;
    private javax.swing.JTextField jtf_puesto;
    // End of variables declaration//GEN-END:variables

}