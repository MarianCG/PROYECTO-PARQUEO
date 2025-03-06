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
//        
//        ***BOTON CON TEXTO DE CONFIRMACION DENTROD DE LA PANTALLA***
//        //Ventana Prueba
//        JFrame frame = new JFrame("Boton"); 
//        //Seleccionar el tamano de la ventana
//        frame.setSize(400,300);
//        //Indica que se cierre la ventana con la X
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        //Organizar todos los elemento de izquierda a derecha
//        frame.setLayout(new FlowLayout());
//        
//        JLabel label = new JLabel("Preciona aqui:");
//        JButton button = new JButton("Click aqui");
//        
//        //Lo que llegara a hacer el boton
//        button.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                label.setText("¡Botón presionado!");
//            }
//        });
//        
//        frame.add(label);
//        frame.add(button);
//        //Indica que se vea la pantalla
//        frame.setVisible(true);

//      ***PANEL Y CAMPOS DE TEXTO***
        
//      Creacion de ventana y ajustes
        JFrame frame = new JFrame("Formulario de Usuario");
        frame.setSize(800,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Hace una cuadricula el GridLayout en este caso de 3x2
        frame.setLayout(new GridLayout(3,3));
        
        JLabel lblName = new JLabel("Nombre");
        JTextField txtName = new JTextField(20);   //Es un input de texto
        JButton btnSend = new JButton("Enviar");
        JLabel lblMessage = new JLabel("");
        
        //ACCION QUE HARA EL BOTON (btnSend es el boton que le accinaremos dicha accion)
        btnSend.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String name = txtName.getText();
                lblMessage.setText("Hola "+name);
            }});
                
        frame.add(lblName);
        frame.add(txtName);
        frame.add(btnSend);
        frame.add(lblMessage);
        
        frame.setVisible(true);
            
            
    }

}
