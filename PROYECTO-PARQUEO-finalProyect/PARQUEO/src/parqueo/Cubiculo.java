/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parqueo;

/**
 * 0
 *
 * Método principal
 */
public class Cubiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Hace visible el JFrame
        cubiculo_reserva sistemaCubiculos = new cubiculo_reserva(15); //Crea una instancia de cubiculo_reserva para inicializar los 15 cubiculos
        java.awt.EventQueue.invokeLater(() -> {
            new Form().setVisible(true); //Crea y tambien incializa el formulario

        });
    }

}
