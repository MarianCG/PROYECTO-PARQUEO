/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Rama ERICK P
package proyectospaceadmin;


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
        //Datos init
        String matrizS1[][] = {
            {"D", "P", "O", "O"},
            {"O", "O", "O", "O"},
            {"O", "P", "O", "O"},
            {"E", "E", "E", "O"},
            {"P", "O", "O", "D"}
        };
        String matrizS2[][] = {
            {"P", "P", "O", "O", "P"},
            {"O", "D", "O", "O", "O"},
            {"O", "P", "O", "O", "O"},
            {"O", "O", "O", "O", "P"},
            {"E", "E", "E", "P", "P"}
        };
        String matrizS3[][] = {
            {"P", "P", "O", "O", "P"},
            {"O", "O", "O", "O", "O"},
            {"O", "P", "O", "O", "O"},
            {"O", "O", "O", "O", "P"},
            {"P", "P", "D", "P", "P"},
            {"E", "E", "E", "O", "D"}
        };
//      **INICIALIZACION DE PANTALLA**
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashBoardParks(matrizS1,matrizS2,matrizS3).setVisible(true); // Aquí pasas el arreglo de empleados
            }
        });
    }

}
