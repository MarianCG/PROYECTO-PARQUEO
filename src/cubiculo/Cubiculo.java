/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cubiculo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 * 0
 *
 * @author genni
 */
public class Cubiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        cubiculo_reserva sistemaCubiculos = new cubiculo_reserva(15);

        habitacion[] cubiculos = new habitacion[15];
        sistemaCubiculos.setVector_cubiculo(cubiculos);

        for (int i = 0; i < cubiculos.length; i++) {
            cubiculos[i] = new habitacion(i + 1, "Cubículo" + (char) ('A' + i), false, new Date(), null);

        }
        //Crear Empleados Temp
        empleado arrempleado[] = new empleado[5];

        arrempleado[0] = new empleado("Erick", "Portocarrero", 118180881, true, false);
        arrempleado[1] = new empleado("Andres", "Viquez", 12345678, false, true);
        arrempleado[2] = new empleado("Kristel", "Vargas", 208460639, false, false);
        arrempleado[3] = new empleado("David", "Moreno", 98765432, true, true);
        arrempleado[4] = new empleado("Jose", "Apestegui", 118180881, false, false);

        boolean continuar = true;

        while (continuar) {
            String opcion = JOptionPane.showInputDialog("Seleccione una opcion: \n"
                    + "1. Reservar cubículo\n"
                    + "2. Modificar reserva\n"
                    + "3. Verificar disponibilidad\n"
                    + "4. Salir");

            switch (opcion) {
                case "1":
                    int codigoCubiculo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del cubículo (1-15):"));
                    if (codigoCubiculo < 1 || codigoCubiculo > 15) {
                        JOptionPane.showMessageDialog(null, "Codigo de cubículo inválido.", "Error", JOptionPane.ERROR_MESSAGE);
                        break;

                    }
                    if (sistemaCubiculos.getVector_cubiculos(codigoCubiculo - 1).getEsta_ocupada()) {
                        JOptionPane.showMessageDialog(null, "El cubículo ya esta ocupado.", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {

                        try {
                            String horaInicioStr = JOptionPane.showInputDialog("Ingrese la hora de inicio (hh:mm (AM/PM)");
                            int idEmpleado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del empleado que reserva el cubículo "));
                            if (!searchWorker(idEmpleado, arrempleado)) {
                                JOptionPane.showMessageDialog(null, "El ID no corresponde a un empleado registrado.", "Error", JOptionPane.ERROR_MESSAGE);
                                break;

                            }
                            if (sistemaCubiculos.reservaCubiculo(codigoCubiculo - 1, horaInicioStr, idEmpleado)) {
                                JOptionPane.showMessageDialog(null, "Reserva realiazada correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Error al reservar el cubículo.", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (ParseException e) {
                            JOptionPane.showMessageDialog(null, "Error al reservar el cubículo", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    break;

                case "2":
                    int codigoMod = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del cubículo a modificar (1-15)"));
                    if (codigoMod < 1 || codigoMod > 15) {
                        JOptionPane.showMessageDialog(null, "Código de cubículo inválido", "Error", JOptionPane.ERROR_MESSAGE);
                        break;

                    }

                    habitacion cubiculoMod = sistemaCubiculos.getVector_cubiculos(codigoMod - 1);
                    if (cubiculoMod.getEsta_ocupada()) {
                        String nuevaHoraInicio = JOptionPane.showInputDialog("Ingrese la nueva hora de inicio (hh:mm AM/PM):");
                        try {
                            if (sistemaCubiculos.modificarReserva(codigoMod - 1, nuevaHoraInicio)) {
                                JOptionPane.showMessageDialog(null, "Reserva modificada", "Éxito", JOptionPane.INFORMATION_MESSAGE);

                            } else {
                                JOptionPane.showMessageDialog(null, "No se pudo modificar la reserva", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (ParseException e) {
                            JOptionPane.showMessageDialog(null, "Error al procesar la nueva hora", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El cubículo no tiene una reserva activa", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break; //QUEDE AQUI

                case "3":
                    boolean disponibilidad = sistemaCubiculos.existenCubiculosDisponibles();
                    if (disponibilidad) {
                        JOptionPane.showMessageDialog(null, "Existen cubículos disponibles", "Disponibilidad", JOptionPane.INFORMATION_MESSAGE);

                    } else {
                        JOptionPane.showMessageDialog(null, "Nohay cubículos disponibles.", "Disponibilidad", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;

                case "4":
                    continuar = false;
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema.", "Gracias", JOptionPane.INFORMATION_MESSAGE);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida, intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }

    }

    private static cubiculo_reserva cubiculo_reserva(int i) {
        return new cubiculo_reserva(i);
    }

    private static boolean searchWorker(int ID, empleado[] arrempleado) {
        for (int i = 0; i < arrempleado.length; i++) {
            if (arrempleado[i] != null && arrempleado[i].getId() == ID) {
                return true;
            }
        }
        return false;

    }
   
}
