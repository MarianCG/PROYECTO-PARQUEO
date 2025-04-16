/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueo;

import javax.swing.JOptionPane;

/**
 *
 * @author genni
 */
public class cubiculo_reserva {

    private int cantidad_cubiculos; //Guarda el total de los cubiculos
    private habitacion[] vector_cubiculos; //Arreglo que tiene todos los cubiculos

    public cubiculo_reserva(int cantidad_cubiculos) { //Constructor con parámetro
        this.cantidad_cubiculos = cantidad_cubiculos;
        this.vector_cubiculos = new habitacion[cantidad_cubiculos]; //Se crea un arreglo de objetos habitación con el tamaño establecido
        for (int i = 0; i < cantidad_cubiculos; i++) { //El bucle para iniciar cada cubículo
            this.vector_cubiculos[i] = new habitacion(i + 1, "Cubículo" + (char) ('A' + i), false, "", null);

        }

    }

    public habitacion getVector_cubiculos(int index) { //Método para obtener un cubículo específico 
        return vector_cubiculos[index];
    }

    public boolean reservaCubiculo(int index, int idEmpleado) { // Método para reservar un cubículo si este no esta ocupado

        habitacion cubiculo = vector_cubiculos[index];
        if (cubiculo.getEsta_ocupada()) { //Este if verifica si el cubículo ya está ocupado
            JOptionPane.showMessageDialog(null, "El cubiculo ya esta ocupado");
            return false;
        }

        cubiculo.setEsta_ocupada(true); //Marca como ocupado y le asisgna el ID del empleado
        cubiculo.setId(idEmpleado);

        return true;
    }

    public boolean modificarReserva(int index, int idEmpleado, String horaSeleccionada) { //Método para modificar una reserva que ya existe
        if (index < 0 || index >= vector_cubiculos.length) { //verifica si el indice es valido
            return false;
        }

        habitacion cubiculo = getVector_cubiculos(index);

        if (!cubiculo.getEsta_ocupada()) { //Si ya el cubículo no esta ocupado, no se puede hacer la modificación 
            JOptionPane.showMessageDialog(null, "El cubiculo no tiene reserva activa.");
            return false;
        }
        //Da una nueva información
        cubiculo.setIdEmpleado(idEmpleado);
        cubiculo.setHoraReservaStr(horaSeleccionada);

        cubiculo.setEsta_ocupada(true);

        return true;
    }

    public boolean existenCubiculosDisponibles() { //Método que verifica si hay cubículos disponibles
        for (habitacion cubiculo : vector_cubiculos) {
            if (!cubiculo.getEsta_ocupada()) {
                return true; //Si encuentra, entonces retornara true
            }
        }
        return false; //Si no hay ninguno disponible, entonces va a retonar false

    }

    //Los Getter y Setter
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
