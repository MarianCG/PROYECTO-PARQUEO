/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectospaceadmin;

import javax.swing.JOptionPane;

/**
 *
 * @author porto
 */
public class HistorialPark {
    private static String[][] historialReservas = new String[20][4];
    private static int count = 0;

    public static void addReserve(String name, int id, String date,String typeReserve) {
        if (count < historialReservas.length) {
            historialReservas[count][0] = name;
            historialReservas[count][1] = String.valueOf(id);
            historialReservas[count][2] = date;
            historialReservas[count][3] = typeReserve;
            count++;
        }
    }

    public static void showHistorial() {
        for (int i = 0; i < count; i++) {
            JOptionPane.showMessageDialog(null,"Reserva " + (i + 1) + "\n"
                    + historialReservas[i][0] + "\nCédula: "
                    + historialReservas[i][1] + "\nFecha: "
                    + historialReservas[i][2]+ "\nReservo: "
                    + historialReservas[i][3]);
        }
    }

    public static String[][] getHistorial() {
        return historialReservas;
    }

    public static int getCantidadReservas() {
        return count;
    }
    
}
