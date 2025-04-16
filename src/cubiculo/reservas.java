/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueo;

/**
 *
 * @author genni
 */
public class reservas {

    private String horaInicio; //Hora de inicio de la reserva en formato string
    private String horaFin; //Hora de finalización de la reserva en formato string
    private int idEmpleado; //Identifica el empleado que hace la reserva

    public reservas(String horaInicio, String horaFin, int idEmpleado) { //Constructor que permite hacer una Instancia de reserva con la hora de inicio,
        //la hora que finaliza y el ID del empleado
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.idEmpleado = idEmpleado;

    }
    //Métodos Getter y Setter
    
    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

}
