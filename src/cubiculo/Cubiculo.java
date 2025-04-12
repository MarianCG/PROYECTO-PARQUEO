/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cubiculo;

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
    public static void main(String[] args) {
        cubiculo_reserva sistemaCubiculos = new cubiculo_reserva(15);

        
        //Crear Empleados Temp
        Empleado arrempleado[] = new Empleado[5];

        arrempleado[0] = new Empleado("Erick", "Portocarrero", 118180881, true, false);
        arrempleado[1] = new Empleado("Andres", "Viquez", 12345678, false, true);
        arrempleado[2] = new Empleado("Kristel", "Vargas", 208460639, false, false);
        arrempleado[3] = new Empleado("David", "Moreno", 98765432, true, true);
        arrempleado[4] = new Empleado("Jose", "Apestegui", 118180881, false, false);

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
                        JOptionPane.showMessageDialog(null, "Numero de cubículo incorrecto.");
                        break;

                    }
                    if (sistemaCubiculos.getVector_cubiculos(codigoCubiculo - 1).getEsta_ocupada()) {
                        JOptionPane.showMessageDialog(null, "El cubículo ya se encuentra ocupado.");
                        break;
                    }  
                        int idEmpleado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del empleado que reserva el cubículo "));
                        if (!searchWorker(idEmpleado, arrempleado)) {
                            JOptionPane.showMessageDialog(null, "El ID no corresponde a un empleado registrado.");
                            break;

                        }
                       boolean reservado = sistemaCubiculos.reservaCubiculo(codigoCubiculo - 1, idEmpleado);
                       if (reservado){
                           JOptionPane.showMessageDialog(null, "Reserva realizada");
                       } else {
                           JOptionPane.showMessageDialog(null, "No se pudo realizar la reserva");
                       }
                       break;
                            
                case "2":
                    int codigoMod = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del cubículo a modificar (1-15)"));
                    if (codigoMod < 1 || codigoMod > 15) {
                        JOptionPane.showMessageDialog(null, "Numero de cubículo incorrecto.");
                        break;

                    }
                    if (!sistemaCubiculos.getVector_cubiculos(codigoMod - 1).getEsta_ocupada()){
                        JOptionPane.showMessageDialog(null, "El cubículo no tiene reserva");
                        break;
                    }

                   
                        int idEmpleadoMod = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del empleado"));
                        if (!searchWorker(idEmpleadoMod, arrempleado)) {
                            JOptionPane.showMessageDialog(null, "El ID no corresponde a un empleado registrado.");
                            break;

                        }
                        boolean modificado = sistemaCubiculos.modificarReserva(codigoMod - 1, idEmpleadoMod);
                        if (modificado){
                            JOptionPane.showMessageDialog(null, "Reserva modificada");
                        }
                        

                     else {
                        JOptionPane.showMessageDialog(null, "El cubículo no tiene una reserva activa");
                    }
                    break; //QUEDE AQUI

                case "3":
                    if (sistemaCubiculos.existenCubiculosDisponibles()){
                        JOptionPane.showMessageDialog(null, "Existen cubículos disponibles");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "No hay cubículos disponibles.");
                    }
                    break;

                case "4":
                    continuar = false;
                    JOptionPane.showMessageDialog(null, "¡GRACIAS!");
                    break;

            }

        }

    }

    private static boolean searchWorker(int ID, Empleado[] arrempleado) {
        for (int i = 0; i < arrempleado.length; i++) {
            if (arrempleado[i] != null && arrempleado[i].getId() == ID) {
                return true;
            }
        }
        return false;

    }

}
//aaaaaaa