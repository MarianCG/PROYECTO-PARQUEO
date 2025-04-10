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
public class Historial {
    private static String[][] historialReservas = new String[20][3];
    private static int contador = 0;

    public static void agregarReserva(String nombre, int cedula, String fecha) {
        if (contador < historialReservas.length) {
            historialReservas[contador][0] = nombre;
            historialReservas[contador][1] = String.valueOf(cedula);
            historialReservas[contador][2] = fecha;
            contador++;
        }
    }

    public static void mostrarHistorial() {
        for (int i = 0; i < contador; i++) {
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
        return contador;
    }
    
}
