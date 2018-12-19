/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Interfaces.Pantalla_Principal;
import Logica.Logica_Clientes;
import java.awt.event.KeyEvent;

/**
 *
 * @author Luis Angel
 */
public class Formulario_Cientes extends javax.swing.JFrame {

    private Logica_Clientes LOG_CLIE;

    /**
     * Creates new form Formulario_Cientes
     */
    public Formulario_Cientes() {
        initComponents();
        LOG_CLIE = new Logica_Clientes();
        this.setLocationRelativeTo(null);
        listado();
    }

    private void listado() {
        /**
         * Metodo encargado de insertar los datos obtenidos del metodo
         * obtenerDatos() de la clase Logica_Empleados.
         */
        jt_Datos.setModel(LOG_CLIE.obtenerDatos());
    }

    private void limpiar() {
        /**
         * Metodo encargado de setear todos los campos con texto a sin texto.
         */
        jtf_nombre.setText("");
        jtf_calle.setText("");
        jtf_colonia.setText("");
        jtf_contacto.setText("");
        jtf_correo.setText("");
        jtf_telefono.setText("");
        jtf_rfc.setText("");

        jtf_nombre.requestFocus();
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
        jLabel2 = new javax.swing.JLabel();
        jtf_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtf_nombre = new javax.swing.JTextField();
        jtf_calle = new javax.swing.JTextField();
        jtf_telefono = new javax.swing.JTextField();
        jtf_rfc = new javax.swing.JTextField();
        jtf_contrato = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jtf_colonia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtf_contacto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtf_correo = new javax.swing.JTextField();
        jcb_Opciones = new javax.swing.JComboBox<>();
        jt_Busqueda = new javax.swing.JTextField();
        btn_actualizar = new javax.swing.JLabel();
        btn_atras = new javax.swing.JLabel();
        btn_salir4 = new javax.swing.JLabel();
        btn_guardar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_Datos = new javax.swing.JTable();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("id");

        jtf_id.setEditable(false);

        jLabel3.setText("Empresa");

        jLabel5.setText("Calle");

        jLabel6.setText("Telefono ");

        jLabel7.setText("RFC");

        jLabel11.setText("Contrato");

        jtf_rfc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_rfcActionPerformed(evt);
            }
        });

        jLabel13.setText("Colonia");

        jLabel4.setText("Contacto");

        jLabel8.setText("Correo");

        jtf_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_correoActionPerformed(evt);
            }
        });

        jcb_Opciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "EMPRESA", "CALLE", "COLONIA", "CONTACTO" }));
        jcb_Opciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_OpcionesActionPerformed(evt);
            }
        });

        jt_Busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jt_BusquedaKeyReleased(evt);
            }
        });

        btn_actualizar.setFont(new java.awt.Font("Montserrat Light", 1, 24)); // NOI18N
        btn_actualizar.setForeground(new java.awt.Color(43, 58, 100));
        btn_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton_Actualizar.png"))); // NOI18N
        btn_actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_actualizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_actualizarMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtf_calle, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_rfc, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_colonia, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_contacto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jtf_contrato, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(146, 146, 146))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcb_Opciones, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jt_Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_actualizar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_actualizar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jtf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jtf_calle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13)
                                        .addComponent(jtf_colonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jtf_rfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jtf_contacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtf_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_contrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcb_Opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 890, 320));

        btn_atras.setFont(new java.awt.Font("Montserrat Light", 1, 24)); // NOI18N
        btn_atras.setForeground(new java.awt.Color(43, 58, 100));
        btn_atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton_Atras.png"))); // NOI18N
        btn_atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_atrasMouseClicked(evt);
            }
        });
        getContentPane().add(btn_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, -1, 30));

        btn_salir4.setFont(new java.awt.Font("Montserrat Light", 1, 24)); // NOI18N
        btn_salir4.setForeground(new java.awt.Color(43, 58, 100));
        btn_salir4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton_Salir.png"))); // NOI18N
        btn_salir4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_salir4MouseClicked(evt);
            }
        });
        getContentPane().add(btn_salir4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 590, -1, 30));

        btn_guardar.setFont(new java.awt.Font("Montserrat Light", 1, 24)); // NOI18N
        btn_guardar.setForeground(new java.awt.Color(43, 58, 100));
        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton_Guardar.png"))); // NOI18N
        btn_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_guardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_guardarMouseEntered(evt);
            }
        });
        getContentPane().add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 590, -1, 30));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 890, 160));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RegistroClientes.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_atrasMouseClicked
        // TODO add your handling code here:
        Pantalla_Principal PAN_PRIN = new Pantalla_Principal();
        this.setVisible(false);
        dispose();
        PAN_PRIN.setVisible(true);
    }//GEN-LAST:event_btn_atrasMouseClicked

    private void btn_salir4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salir4MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_salir4MouseClicked

    private void btn_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardarMouseClicked
        // TODO add your handling code here:

        // Obtiene los datos obtenidos del formulario.
        String nombre_empresa = jtf_nombre.getText();
        String calle_empresa = jtf_calle.getText();
        String colonia_empresa = jtf_colonia.getText();
        String contacto_empresa = jtf_contacto.getText();
        String correo_contacto = jtf_correo.getText();
        String telefono_contacto = jtf_telefono.getText();
        String rfc_empresa = jtf_rfc.getText();

        /**
         * Inserta los datos obtenidos del formulario en la base de datos.Res
         * regresa un valo entero al insertar un campo.
         */
        int res = LOG_CLIE.insertarDatos(nombre_empresa, calle_empresa, colonia_empresa, contacto_empresa, correo_contacto, telefono_contacto, rfc_empresa);
        /**
         * Cuando res regresa un valor mayor a 0 actulizamos nuestra tabla.
         */
        if (res > 0) {
            listado(); //Llama la funcion para mostrar los datos
            limpiar(); //Llama la funcion limpiar los datos
        }
    }//GEN-LAST:event_btn_guardarMouseClicked

    private void btn_guardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_guardarMouseEntered

    private void jt_DatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_DatosMouseClicked
        // TODO add your handling code here:
        int fila = jt_Datos.getSelectedRow(); //Variable int para obtener la fila seleccionada
        jtf_id.setText(jt_Datos.getValueAt(fila, 0).toString()); //Setemaos el valor de la fila seleccionada en la columna 0
        jtf_nombre.setText(jt_Datos.getValueAt(fila, 1).toString()); //Setemaos el valor de la fila seleccionada en la columna 0
        jtf_calle.setText(jt_Datos.getValueAt(fila, 2).toString()); //Setemaos el valor de la fila seleccionada en la columna 0
        jtf_colonia.setText(jt_Datos.getValueAt(fila, 3).toString()); //Setemaos el valor de la fila seleccionada en la columna 0
        jtf_contacto.setText(jt_Datos.getValueAt(fila, 4).toString()); //Setemaos el valor de la fila seleccionada en la columna 0
        jtf_correo.setText(jt_Datos.getValueAt(fila, 5).toString()); //Setemaos el valor de la fila seleccionada en la columna 0
        jtf_telefono.setText(jt_Datos.getValueAt(fila, 6).toString()); //Setemaos el valor de la fila seleccionada en la columna 0
        jtf_rfc.setText(jt_Datos.getValueAt(fila, 7).toString()); //Setemaos el valor de la fila seleccionada en la columna 0
        
    }//GEN-LAST:event_jt_DatosMouseClicked

    private void jt_BusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_BusquedaKeyReleased
        // TODO add your handling code here:
        char tecla = evt.getKeyChar();
        if (tecla == KeyEvent.VK_ENTER) {
            jt_Datos.setModel(LOG_CLIE.buscarDatos(jcb_Opciones.getSelectedIndex(), jt_Busqueda.getText()));
        }
    }//GEN-LAST:event_jt_BusquedaKeyReleased

    private void jtf_rfcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_rfcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_rfcActionPerformed

    private void jtf_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_correoActionPerformed

    private void jcb_OpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_OpcionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_OpcionesActionPerformed

    private void btn_actualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_actualizarMouseClicked
        // TODO add your handling code here:
        int res;
        String id = jtf_id.getText();
        String nombre_empresa = jtf_nombre.getText();
        String calle_empresa = jtf_calle.getText();
        String colonia_empresa = jtf_colonia.getText();
        String contacto_empresa = jtf_contacto.getText();
        String correo_contacto = jtf_correo.getText();
        String telefono_contacto = jtf_telefono.getText();
        String rfc_empresa = jtf_rfc.getText();

        res = LOG_CLIE.actualizarDatos(id, nombre_empresa, calle_empresa, colonia_empresa, contacto_empresa, correo_contacto, telefono_contacto, rfc_empresa);
        if (res > 0) {
            listado(); //Llama la funcion para mostrar los datos
            limpiar(); //Llama la funcion limpiar los datos
        }
    }//GEN-LAST:event_btn_actualizarMouseClicked

    private void btn_actualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_actualizarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_actualizarMouseEntered

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
            java.util.logging.Logger.getLogger(Formulario_Cientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_Cientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_Cientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_Cientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario_Cientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel btn_actualizar;
    private javax.swing.JLabel btn_atras;
    private javax.swing.JLabel btn_guardar;
    private javax.swing.JLabel btn_salir4;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcb_Opciones;
    private javax.swing.JTextField jt_Busqueda;
    private javax.swing.JTable jt_Datos;
    private javax.swing.JTextField jtf_calle;
    private javax.swing.JTextField jtf_colonia;
    private javax.swing.JTextField jtf_contacto;
    private javax.swing.JTextField jtf_contrato;
    private javax.swing.JTextField jtf_correo;
    private javax.swing.JTextField jtf_id;
    private javax.swing.JTextField jtf_nombre;
    private javax.swing.JTextField jtf_rfc;
    private javax.swing.JTextField jtf_telefono;
    // End of variables declaration//GEN-END:variables
}
