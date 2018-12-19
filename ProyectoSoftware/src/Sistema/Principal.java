/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import Formularios.Formulario_Cientes;
import Formularios.Formulario_Empleados;
import Interfaces.Pantalla_Principal;
import Interfaces.Registro;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Luis Angel
 */
public class Principal {

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(null, "No se puede aplicar el estilo");
        }

        Formulario_Empleados FEMPLEADOS = new Formulario_Empleados();
        FEMPLEADOS.setLocationRelativeTo(null);
        //FEMPLEADOS.setVisible(true);

        Registro VENTPRINCIPAL = new Registro();
        VENTPRINCIPAL.setVisible(true);
        VENTPRINCIPAL.setLocationRelativeTo(null);

        Formulario_Cientes FCLIENTES = new Formulario_Cientes();
        FCLIENTES.setLocationRelativeTo(null);

        Pantalla_Principal PPRINCIPA = new Pantalla_Principal();
        PPRINCIPA.setLocationRelativeTo(null);

    }
}
