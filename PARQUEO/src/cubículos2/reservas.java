/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cubículos2;

/**
 *
 * @author genni
 */
public class reservas {

    private String HoraInicio;
    private String HoraFin;
    private int ID_del_empleado, codigo_de_cubiculo;
    private int horaInicio;
    private int horaFin;

    public reservas(String HoraInicio, String HoraFin, int ID_del_empleado, int codigo_dr_cubiculo) {
        this.HoraInicio = HoraInicio;
        this.HoraFin = HoraFin;
        this.ID_del_empleado = ID_del_empleado;
        this.codigo_de_cubiculo = codigo_de_cubiculo;

    }

    reservas(int parseInt, int parseInt0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String
            reservas(String vector_reserva, int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String atributos_a_String() {
        return getHoraInicio() + ";" + getHoraFin() + ";" + String.valueOf(getID_del_empleado()) + ";"
                + String.valueOf(getCodigo_de_cubiculo());

    }

    public String getHoraInicio() {
        return HoraInicio;
    }

    public String getHoraFin() {
        return HoraFin;
    }

    public String getDetalleReserva() {
        return "Reserva de" + HoraInicio + "a" + HoraFin;
    }

    public int getID_del_empleado() {
        return ID_del_empleado;
    }

    public void setID_del_empleado(int ID_del_empleado) {
        this.ID_del_empleado = ID_del_empleado;
    }

    public int getCodigo_de_cubiculo() {
        return codigo_de_cubiculo;
    }

    public void setCodigo_de_cubiculo(int codigo_de_cubiculo) {
        this.codigo_de_cubiculo = codigo_de_cubiculo;
    }

}
