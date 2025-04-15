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
    private habitacion[] vector_cubiculos;

    public cubiculo_reserva(int cantidad_cubiculos) {
        this.cantidad_cubiculos = cantidad_cubiculos;
        this.vector_cubiculos = new habitacion[cantidad_cubiculos];
        for (int i = 0; i < cantidad_cubiculos; i++) {
            this.vector_cubiculos[i] = new habitacion(i + 1, "Cubículo" + (char) ('A' + i), false, "", null);

        }

    }

    public habitacion getVector_cubiculos(int index) {
        return vector_cubiculos[index];
    }

    public boolean reservaCubiculo(int index, int idEmpleado) {

        habitacion cubiculo = vector_cubiculos[index];
        if (cubiculo.getEsta_ocupada()) {
            JOptionPane.showMessageDialog(null, "El cubiculo ya esta ocupado");
            return false;
        }

        cubiculo.setEsta_ocupada(true);
        cubiculo.setId(idEmpleado);

        return true;
    }

    public boolean modificarReserva(int index, int idEmpleado, String horaSeleccionada) {
        if (index < 0 || index >= vector_cubiculos.length) {
            return false;
        }

        habitacion cubiculo = getVector_cubiculos(index);
        if (!cubiculo.getEsta_ocupada()) {
            JOptionPane.showMessageDialog(null, "El cubiculo no tiene reserva activa.");
            return false;
        }
        cubiculo.setIdEmpleado(idEmpleado);
        cubiculo.setHoraReservaStr(horaSeleccionada);

        cubiculo.setEsta_ocupada(true);

        return true;
    }

    public boolean existenCubiculosDisponibles() {
        for (habitacion cubiculo : vector_cubiculos) {
            if (!cubiculo.getEsta_ocupada()) {
                return true;
            }
        }
        return false;

    }

    public int getCantidad_cubiculos() {
        return cantidad_cubiculos;
    }

    public void setCantidad_cubiculos(int cantidad_cubiculos) {
        this.cantidad_cubiculos = cantidad_cubiculos;
    }

    public habitacion[] getCubiculos() {
        return vector_cubiculos;
    }

    public void setCubiculos(habitacion[] cubiculos) {
        this.vector_cubiculos = cubiculos;
    }

}

