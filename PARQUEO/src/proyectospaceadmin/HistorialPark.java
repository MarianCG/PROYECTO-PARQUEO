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
    private static String[][] historialReservas = new String[20][3];
    private static int count = 0;

    public static void addReserve(String name, int id, String date) {
        if (count < historialReservas.length) {
            historialReservas[count][0] = name;
            historialReservas[count][1] = String.valueOf(id);
            historialReservas[count][2] = date;
            count++;
        }
    }

    public static void showHistorial() {
        for (int i = 0; i < count; i++) {
            JOptionPane.showMessageDialog(null,"Reserva " + (i + 1) + ": "
                    + historialReservas[i][0] + " - Cédula: "
                    + historialReservas[i][1] + " - Fecha: "
                    + historialReservas[i][2]);
        }
    }

    public static String[][] getHistorial() {
        return historialReservas;
    }

    public static int getCantidadReservas() {
        return count;
    }
    
}
