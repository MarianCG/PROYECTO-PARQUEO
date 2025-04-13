/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueo;

import javax.swing.JOptionPane;

/**
 *
 * @author porto
 */
public class Historial {

    //Variables de Historiales
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

    public static void deleteHistoialPark(String parkPosition) {
        for (int i = 0; i < historialReservas.length; i++) {
            if (parkPosition.equals(historialReservas[i][3])) {
                historialReservas[i][0] = null;
                historialReservas[i][1] = null;
                historialReservas[i][2] = null;
                historialReservas[i][3] = null;
                JOptionPane.showMessageDialog(null, "Reserva " + (i + 1) + " eliminada");
            }
            else JOptionPane.showMessageDialog(null, "No hay ninguna reserva en esa posicion");
        }

    }

    public static String[][] getHistorial() {
        return historialReservas;
    }

    public static int getCantidadReservas() {
        int spaceCount = 0;
        for (int i = 0; i < historialReservas.length; i++) {
            if (historialReservas[i][0] == null) {
                spaceCount += 1;
            }
        }
        return spaceCount;
    }

    /**
     * Este metodo agrega a al arreglo la reserva de auditorios de la reuniones
     * de AM
     *
     * @param name El nombre del empleado
     * @param id Cedula del empleado
     * @param date Fecha de la recepcion
     */
    //Reservas para auditorio AM
    public static void addReserveAudiAM(String name, int id, String date) {
        for (int i = 0; i < auditorioHistoryPM.length; i++) {
            if (auditorioHistoryPM[i][0] == null) {
                auditorioHistoryPM[i][0] = name;
                auditorioHistoryPM[i][1] = String.valueOf(id);
                auditorioHistoryPM[i][2] = date;
                break; // Termina una vez agregada
            }
        }
    }

    /**
     * Este metodo es para poder extraer las reservas del arreglo de auditorio
     * AM y poder imprimirlo por un JOption
     */
    public static void showHistorialAudiAM() {
        for (int i = 0; i < auditorioHistoryAM.length; i++) {
            //este if busca el primer conjunto vacio para guardar la reserva
            if (auditorioHistoryAM[i][0] != null) {
                JOptionPane.showMessageDialog(null, "Reserva #" + (i + 1) + "\n"
                        + auditorioHistoryAM[i][0] + "\nCédula: "
                        + auditorioHistoryAM[i][1] + "\nFecha: "
                        + auditorioHistoryAM[i][2]);
            }
        }
    }

    /**
     * Elimina la reserva seleccionada por el usuario
     *
     * @param i numero de reserva que desea eliminar
     */
    public static void deleteHistoialAudiAM(int i) {
        auditorioHistoryAM[i - 1][0] = null;
        auditorioHistoryAM[i - 1][1] = null;
        auditorioHistoryAM[i - 1][2] = null;
        JOptionPane.showMessageDialog(null, "Reserva " + i + " eliminada");
    }

    public static String[][] getHistorialAudiAM() {
        return auditorioHistoryAM;
    }

    //Regresa cuantos espacio vacios hay en el arreglo
    public static int getCantidadReservasAudiAM() {
        int spaceCount = 0;
        for (int i = 0; i < auditorioHistoryAM.length; i++) {
            if (auditorioHistoryAM[i][0] == null) {
                spaceCount += 1;
            }
        }
        return spaceCount;
    }

    /**
     * Este metodo agrega a al arreglo la reserva de auditorios de la reuniones
     * de PM
     *
     * @param name El nombre del empleado
     * @param id Cedula del empleado
     * @param date Fecha de la recepcion
     */
    //Reservas para auditorio PM
    public static void addReserveAudiPM(String name, int id, String date) {
        for (int i = 0; i < auditorioHistoryPM.length; i++) {
            //este if busca el primer conjunto vacio para guardar la reserva
            if (auditorioHistoryPM[i][0] == null) {
                auditorioHistoryPM[i][0] = name;
                auditorioHistoryPM[i][1] = String.valueOf(id);
                auditorioHistoryPM[i][2] = date;
                break;
            }
        }
    }

    /**
     * Este metodo es para poder extraer las reservas del arreglo de auditorio
     * PM y poder imprimirlo por un JOption
     */
    public static void showHistorialAudiPM() {
        for (int i = 0; i < auditorioHistoryPM.length; i++) {
            if (auditorioHistoryPM[i][0] != null) {
                JOptionPane.showMessageDialog(null, "Reserva #" + (i + 1) + "\n"
                        + auditorioHistoryPM[i][0] + "\nCédula: "
                        + auditorioHistoryPM[i][1] + "\nFecha: "
                        + auditorioHistoryPM[i][2]);
            }
        }
    }

    /**
     * Elimina la reserva seleccionada por el usuario
     *
     * @param i numero de reserva que desea eliminar
     */
    public static void deleteHistoialAudiPM(int i) {
        auditorioHistoryPM[i - 1][0] = null;
        auditorioHistoryPM[i - 1][1] = null;
        auditorioHistoryPM[i - 1][2] = null;
        JOptionPane.showMessageDialog(null, "Reserva " + i + " eliminada");
    }

    public static String[][] getHistorialAudiPM() {
        return auditorioHistoryPM;
    }

    //Regresa cuantos espacio vacios hay en el arreglo
    public static int getCantidadReservasAudiPM() {
        int spaceCount = 0;
        for (int i = 0; i < auditorioHistoryPM.length; i++) {
            if (auditorioHistoryPM[i][0] == null) {
                spaceCount += 1;
            }
        }
        return spaceCount;
    }

}
