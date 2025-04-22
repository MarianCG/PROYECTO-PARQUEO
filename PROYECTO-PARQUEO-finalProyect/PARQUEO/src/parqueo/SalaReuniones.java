/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueo;

import javax.swing.JOptionPane;
import parqueo.Empleado;

/**
 *
 * @author Hp
 */
public class SalaReuniones {

    //private static globalID = 0
    //pritvate id;
    private String numerosala;
    private int capacidad;
    private Empleado empleadoreserva;
    private String horaInicio;
    private String horaFin;
    private boolean ocupada;

    public SalaReuniones(String numerosala, int capacidad) {
        this.numerosala = numerosala;
        this.capacidad = capacidad;
        this.ocupada = false;
        this.empleadoreserva = null;

    }

    public boolean reservarsala(Empleado empleado, String horaInicio, String horaFin) {
        if (!ocupada) { //Verifica si la sala esta disponible
            this.ocupada = true; //Asigna empleado a reservar
            this.empleadoreserva = empleado;
            this.horaInicio = horaInicio;
            this.horaFin = horaFin;
            return true;
            

        }
        return false; // No se puede reservar

    }

    public void liberarSala() {
        this.ocupada = false;
        this.empleadoreserva = null;
        this.horaInicio = null;
        this.horaFin = null;
        JOptionPane.showMessageDialog(null, "Sala Liberada.");

    }

    public void mostrarDispoSala() {
        String estado = ocupada ? "Ocupada" : "Disponible";
        String infoReserva = "";
        if (ocupada && empleadoreserva != null) {
            infoReserva = "\nSala Reservada por:" + empleadoreserva.getnombrecompleto()
                    + "\nHora de Inicio:" + horaInicio
                    + "\nHora de Fin: " + horaFin;
        }

        String infosala = "Sala:" + numerosala
                + "\nCapacidad:" + capacidad
                + "\npersonas"
                + "\nEstado: " + estado + infoReserva;

        JOptionPane.showMessageDialog(null, infosala);

    }
    
    public String mostrarReserva(){
        String estado = ocupada ? "Ocupada" : "Disponible";
        String infoReserva = "";
        if (ocupada && empleadoreserva != null) {
            infoReserva = "\nSala Reservada por:" + empleadoreserva.getnombrecompleto()
                    + "\nHora de Inicio:" + horaInicio
                    + "\nHora de Fin: " + horaFin;
        }
        return infoReserva;
        
        
        
    }

    
    
    public boolean modificarReserva(String nuevaHoraInicio, String nuevaHoraFin) {
        if (ocupada) {
            // Actualizar directamente las horas
            this.horaInicio = nuevaHoraInicio;
            this.horaFin = nuevaHoraFin;
            JOptionPane.showMessageDialog(null, 
                "Reserva modificada exitosamente\n" +
                "Nueva hora inicio: " + nuevaHoraInicio + "\n" +
                "Nueva hora fin: " + nuevaHoraFin);
            return true;
        } else {
            JOptionPane.showMessageDialog(null,
                "La sala no está ocupada actualmente",
                "Error", 
                JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    public String getNumerosala() {
        return numerosala;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public Empleado getEmpleadoreserva() {
        return empleadoreserva;
    }

    public boolean isOcupada() {
        return ocupada;
    }

}
