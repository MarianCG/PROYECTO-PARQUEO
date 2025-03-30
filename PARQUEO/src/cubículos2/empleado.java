/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cubículos2;

/**
 *
 * @author genni
 */
public class empleado {
    private int ID;
    private String nombre;
    private String apellidos;
    
    public empleado(int ID, String nombre, String apellidos) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellidos = apellidos;
    
    }

    empleado(int parseInt, String vector_empleado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public String atributos_a_string() {
        return getNombre() + ";" + getApellidos()
                + ";" + String.valueOf(getID());
    
    }
    
}
