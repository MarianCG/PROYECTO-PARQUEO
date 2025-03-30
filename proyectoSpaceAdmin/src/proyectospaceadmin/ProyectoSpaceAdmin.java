/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Rama ERICK P
package proyectospaceadmin;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author porto
 */
public class ProyectoSpaceAdmin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        //Crear Empleados Temp
        
        Empleado arrEmpleado[] = new Empleado[5];
        
        arrEmpleado[0]= new Empleado("Erick", "Portocarrero", 118180881, true, false);
        arrEmpleado[1]= new Empleado("Andres", "Viquez", 12345678, false, true);
        arrEmpleado[2]= new Empleado("Kristel", "Vargas", 208460639, false, false);
        arrEmpleado[3]= new Empleado("David", "Moreno", 98765432, true, true);
        arrEmpleado[4]= new Empleado("Jose", "Apestegui", 118180881, false, false);
        
//      **INICIALIZACION DE PANTALLA**
        dashBoardParks parqueo = new dashBoardParks();
        
        parqueo.setVisible(true);

    }

}


