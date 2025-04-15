/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cubiculo;

/**
 * 0
 *
 * @author genni
 */
public class Cubiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cubiculo_reserva sistemaCubiculos = new cubiculo_reserva(15);
        java.awt.EventQueue.invokeLater(() -> {
            new Form().setVisible(true);

        });
    }

}
