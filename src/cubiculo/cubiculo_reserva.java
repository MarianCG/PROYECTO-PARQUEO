/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cubiculo;

import cubiculo.empleado;
import cubiculo.reservas;
import javax.swing.JOptionPane;
import cubiculo.habitacion;
import cubiculo.reservas;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.lang.String;
import java.text.ParseException;
import javax.swing.JOptionPane;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

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
            this.cubiculos[i] = new habitacion(i + 1, "Cubículo" + (char) ('A' + i), false, new Date(), null);

        }

    }

    public habitacion getVector_cubiculos(int index) {
        return cubiculos[index];
    }

    public void setVector_cubiculo(habitacion[] cubiculo) {
        this.cubiculos = cubiculos;

    }

    public boolean reservaCubiculo(int index, String horaInicioStr, int idEmpleado) throws ParseException {
        if (index < 0 || index >= cubiculos.length ) {
            JOptionPane.showMessageDialog(null, "índice fuera de rando", "Error", JOptionPane.ERROR_MESSAGE);
            
            return false;
        }
        if (!validaHora(horaInicioStr)) {
            JOptionPane.showMessageDialog(null, "Formato de hora incorrecto.Use hh:mm AM/PM", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        habitacion cubiculo = cubiculos[index];
        if (cubiculo.getEsta_ocupada()) {
            JOptionPane.showMessageDialog(null, "El cubiculo ya esta ocupado", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a");
        Date horaInicio = sdf.parse(horaInicioStr);
        Calendar calendar = Calendar.getInstance();

        calendar.setTime(horaInicio);
        calendar.add(Calendar.HOUR, 1);

        Date horaFin = calendar.getTime();
        String horaFinStr = sdf.format(calendar.getTime());
        reservas nuevaReserva = new reservas(horaInicioStr, horaFinStr, idEmpleado, cubiculo.getCodigo());

        cubiculo.setEsta_ocupada(true);
        cubiculo.setHoraReserva(horaInicio);
        cubiculo.setReserva(nuevaReserva);

        JOptionPane.showMessageDialog(null, "Reserva realizada de" + sdf.format(horaInicio) + "a" + horaFinStr, "Reserva Existosa", JOptionPane.INFORMATION_MESSAGE);
        return true;

    }

    private boolean validaHora(String horaInicioStr) {
        return horaInicioStr.matches("^(0[1-9]|1[0-2]):[0-5][0-9] (AM|PM|am|pm)$");

    }

    public boolean modificarReserva(int cubiculoActual, String nuevaHoraInicioStr) throws ParseException {
        if (cubiculoActual < 0 || cubiculoActual >= cubiculos.length) {
            return false;
        }

        habitacion cubiculo = cubiculos[cubiculoActual];
        if (!cubiculo.getEsta_ocupada()) {
            JOptionPane.showMessageDialog(null, "El cubiculo no tiene reserva activa.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!validaHora(nuevaHoraInicioStr)) {
            JOptionPane.showMessageDialog(null, "Formato de hora incorrecto. Use hh:mm AM/PM ", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a");
        try {
            Date nuevaHoraInicio = sdf.parse(nuevaHoraInicioStr);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(nuevaHoraInicio);
            calendar.add(Calendar.HOUR, 1);
            String nuevaHoraFin = sdf.format(calendar.getTime());

            cubiculo.getReserva().setHoraInicio(nuevaHoraInicioStr);
            cubiculo.getReserva().setHoraFin(nuevaHoraFin);

            JOptionPane.showMessageDialog(null, "Reserva modificada de" + nuevaHoraInicioStr + "a" + nuevaHoraFin, "Reserva modificada", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Error al procesar la Hora.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

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

    
    
    
    
    
