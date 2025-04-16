/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueo;

/**
 *
 * @author genni
 */
public class habitacion {
    //Los atributos privados 
    private int codigo; //El codigo del cubículo
    private String nombre; //El nombre del cubículo (Ejem: Cubículo1, Cubículo2, Cubículo3 etc.)
    private boolean esta_ocupada; //El estado en el que se encuentra el cubiculo
    private String horaReservaStr; //La hora de la reserva en formato String
    private reservas reserva; //Objeto de tipo reservas
    private int idEmpleado; //El ID del empleado que reserva 

    
//Constructor con todos los parámetros 
    public habitacion(int codigo, String nombre, boolean esta_ocupada, String horaReserva, reservas reserva) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.esta_ocupada = esta_ocupada;
        this.horaReservaStr = horaReserva;
        this.reserva = reserva;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getEsta_ocupada() {
        return esta_ocupada;
    }

    public void setEsta_ocupada(boolean esta_ocupada) {
        this.esta_ocupada = esta_ocupada;
    }

    public reservas getReserva() {
        return reserva;
    }

    public void setReserva(reservas reserva) {
        this.reserva = reserva;
    }

    public String getHoraReservaStr() {
        return horaReservaStr;
    }
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setId(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setHoraReservaStr(String horaReservaStr) {
        this.horaReservaStr = horaReservaStr;
    }
    


}
