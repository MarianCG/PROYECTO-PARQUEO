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
public class cubiculo_reserva {

    private int cantidad_cubiculos;
    private habitacion[] cubiculos;

    public cubiculo_reserva(int cantidad_cubiculos) {
        this.cantidad_cubiculos = cantidad_cubiculos;
        this.cubiculos = new habitacion[cantidad_cubiculos];
        for (int i = 0; i < cantidad_cubiculos; i++) {
            this.cubiculos[i] = new habitacion(i + 1, "Cubículo" + (char) ('A' + i), false, "", null);

        }

    }

    public habitacion getVector_cubiculos(int index) {
        return cubiculos[index];
    }

    public void setVector_cubiculo(habitacion[] cubiculo) {
        this.cubiculos = cubiculos;

    }

    public boolean reservaCubiculo(int index, int idEmpleado) {
        String[] opcionesHoras = {
            "09:00 AM", "10:00 AM", "11:00 AM", "12:00 PM",
            "01:00 PM", "02:00 PM", "03:00 PM", "04:00 PM", "05:00 PM"
        };
        String horaSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione la hora de inicio",
                "Horario de reserva",
                JOptionPane.QUESTION_MESSAGE,
                null, opcionesHoras, opcionesHoras[0]);
        
        
        

        habitacion cubiculo = cubiculos[index];
        if (cubiculo.getEsta_ocupada()) {
            JOptionPane.showMessageDialog(null, "El cubiculo ya esta ocupado");
            return false;
        }
        //Busca la posicion de la hora que fue seleccionada
        int pos = -1;
        for (int i = 0; i < opcionesHoras.length; i++){
            if(opcionesHoras[i].equals(horaSeleccionada)){
                pos = i;
                break;
            }
        }
        //Para determinar la hora final 
        String horaFin;
        if (pos != -1 && pos + 1 < opcionesHoras.length){
            horaFin = opcionesHoras[pos + 1];
            
        } else {
            horaFin = "6:00 PM";
        }
        
        
        
         cubiculo.setEsta_ocupada(true);
         cubiculo.setHoraReservaStr(horaSeleccionada);
         
         JOptionPane.showMessageDialog(null, "Reserva realizada de\n " + horaSeleccionada + " a " + horaFin);
        return true;
 }

    public boolean modificarReserva(int index, int idEmpleado) {
        if (index < 0 || index >= cubiculos.length) {
            return false;
        }

        habitacion cubiculo = cubiculos[index];
        if (!cubiculo.getEsta_ocupada()) {
            JOptionPane.showMessageDialog(null, "El cubiculo no tiene reserva activa.");
            return false;
        }
        String[] opcionesHoras = {
            "09:00 AM", "10:00 AM", "11:00 AM", "12:00 PM",
            "01:00 PM", "02:00 PM", "03:00 PM", "04:00 PM", "05:00 PM"
        };
        String horaSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione la nueva hora de inicio",
                "Horario de reserva",
                JOptionPane.QUESTION_MESSAGE,
                null, opcionesHoras, opcionesHoras[0]);
        if (horaSeleccionada == null) {
            JOptionPane.showMessageDialog(null, "Usuario cancelo la modificación");
            return false;
        }
        int pos = -1;
        for (int i = 0; i < opcionesHoras.length; i++){
            if(opcionesHoras[i].equals(horaSeleccionada)){
                pos = i;
                break;
            }
        }
        String horaFin;
        if (pos != -1 && pos + 1 < opcionesHoras.length){
            horaFin = opcionesHoras[pos + 1];
            
        } else {
            horaFin = "6:00 PM";
        }
        
        

        
        cubiculo.setHoraReservaStr(horaSeleccionada);

        JOptionPane.showMessageDialog(null, "Reserva modificada  de\n " + horaSeleccionada + " a " + horaFin);
        return true;
    }

    public boolean existenCubiculosDisponibles() {
        for (habitacion cubiculo : cubiculos) {
            if (!cubiculo.getEsta_ocupada()) {
                return true;
            }
        }
        return false;

    }

   
    }

