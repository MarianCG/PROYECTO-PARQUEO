/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cubiculo;

/**
 *
 * @author genni
 */
public class reservas {    
    private String horaInicio;
    private String horaFin;
    private int idEmpleado;
    
    

    public reservas(String horaInicio, String horaFin, int idEmpleado) {
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.idEmpleado = idEmpleado;
        

    }

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
