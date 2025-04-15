/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cubiculo;

import javax.swing.JOptionPane;

/**
 *
 * @author genni
 */
public class Historial {

    public static String[][] getHistorialReservas() {
        return historialReservas;
    }

    //Variables de Historiales
    public static void setHistorialReservas(String[][] historialReservas) {
        Historial.historialReservas = historialReservas;
    }
    private static String[][] historialReservas = new String[20][4];
    private static String auditorioHistoryAM[][] = new String[50][3];
    private static String auditorioHistoryPM[][] = new String[50][3];

    /**
     * Esta metodo agrega al arreglo la reserva de los parqueos S1,S2,S3
     *
     * @param name El nombre del empleado
     * @param id Cedula del empleado
     * @param date Fecha de la recepcion
     * @param typeReserve Ubicacion de la reserva
     */
    //Reservas Parqueos
    public static void addReserve(String name, int id, String date, String typeReserve) {
        for (int i = 0; i < historialReservas.length; i++) {
            if (historialReservas[i][0] == null) {
                historialReservas[i][0] = name;
                historialReservas[i][1] = String.valueOf(id);
                historialReservas[i][2] = date;
                historialReservas[i][3] = typeReserve;
                break;
            }
        }
    }

    /**
     * Este metodo es para poder extraer las reservas del arreglo de parqueo y
     * poder imprimirlo por un JOption
     */
    public static void showHistorial() {
        for (int i = 0; i < historialReservas.length; i++) {
            if (historialReservas[i][0] != null) {
                JOptionPane.showMessageDialog(null, "Reserva " + (i + 1) + "\n"
                        + historialReservas[i][0] + "\nCédula: "
                        + historialReservas[i][1] + "\nFecha: "
                        + historialReservas[i][2] + "\nReservo: "
                        + historialReservas[i][3]);
            }
        }
    }

    //Todo es igual menos este método que es para filtrar las reservas de los cubículos
    public static void showHistorialCubiculos() {
        boolean hayReservas = false;

        for (int i = 0; i < historialReservas.length; i++) {
            if (historialReservas[i][0] != null && historialReservas[i][3] != null) {

                String cubiculoStr = historialReservas[i][3].trim();

                if (cubiculoStr.startsWith("Cubiculo")) {
                    hayReservas = true;

                }

                String nombreEmpleado = Form.getEmpleadoNombre(Integer.parseInt(historialReservas[i][1]));
                if (nombreEmpleado == null) {
                    nombreEmpleado = "No se encontro el empleado";
                }

                JOptionPane.showMessageDialog(null, "Reserva " + (i + 1) + "\n"
                        + nombreEmpleado + "\nNombre: "
                        + historialReservas[i][0] + "\nCédula: "
                        + historialReservas[i][1] + "\nHora : "
                        + historialReservas[i][2] + "\nReservó: "
                        + historialReservas[i][3]);
            }

        }

    }

    public static void deleteHistoialCubiculo(int codigoCubiculo) {
        for (int i = 0; i < historialReservas.length; i++) {
            if (historialReservas[i] != null && historialReservas[i][3] != null) {
                //Busca  y elimina la reserva del cubículo

                String cubiculoStr = historialReservas[i][3].trim();
                if (cubiculoStr.equals("Cubiculo" + (codigoCubiculo + 1))) {
                    historialReservas[i][0] = null;
                    historialReservas[i][1] = null;
                    historialReservas[i][2] = null;
                    historialReservas[i][3] = null;
                    JOptionPane.showMessageDialog(null, "Reserva del " + cubiculoStr + " eliminada");
                    break;
                }
            }
        }

    }
}
