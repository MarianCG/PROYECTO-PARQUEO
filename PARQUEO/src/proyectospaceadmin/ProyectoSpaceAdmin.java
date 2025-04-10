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



//      **INICIALIZACION DE PANTALLA**
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashBoardParks(Data.matrizS1,Data.matrizS2,Data.matrizS3).setVisible(true); // Aquí pasas el arreglo de empleados
            }
        });
    }

}
