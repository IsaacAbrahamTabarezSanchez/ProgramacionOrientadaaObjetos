/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogo;

import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.io.*;

/**
 *
 * @author Isaac Tabarez
 */
public class Dialogo {

 String dialogo;

    public Dialogo() {     }

    public int obtenerOpcionMenu() throws IOException {
        dialogo = "MENU DE PROGRAMA EMPLEADOS\n";
        dialogo += "1.  Introdicir empleado\n";
        dialogo += "2.  Editar datos de empleado\n";
        dialogo += "3.  Lista de empleados\n";
        dialogo += "4.  Quitar empleado\n";
        dialogo += "5.  Salir\n";
        dialogo += "Escoja Opción:\n";
        return Integer.parseInt(JOptionPane.showInputDialog(dialogo));
    }

    public String obtenerIdentificacionEmpleado() throws IOException {
        dialogo = "Introduzca el numero del Empleado\n";
        return JOptionPane.showInputDialog(dialogo);
    }

    
    public String obtenerNombreEmpleado() throws IOException {
        
        
        
        
        
        dialogo = "Nombre del Empleado\n";
        return JOptionPane.showInputDialog(dialogo);
    }

    public String obtenerApellidosEmpleado() throws IOException {
        dialogo = "Apellidos del Empleado\n";
        return JOptionPane.showInputDialog(dialogo);
    }
    public int obtenerEdadEmpleado() throws IOException {
        dialogo = " Edad del Empleado\n";
        return Integer.parseInt(JOptionPane.showInputDialog(dialogo));
    }
    public void mostrarMensaje (String mensaje) {
        JFrame frame = new JFrame("Mensaje");
        JOptionPane.showMessageDialog(frame, mensaje);
    }
    public void cerrarPrograma () {
        JFrame frame = new JFrame("Fin del programa");
        JOptionPane.showMessageDialog(frame, "Gracias por usar este programa. Fin");
        System.exit(0);
    }
}
