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
public class Empleado {
    //Los atributos privados del empleado
    private String name;
    private String lastname;
    private int id;
    private boolean director;
    private boolean discapacitado;

    public Empleado(String nombre, String apellido, int id, boolean director, boolean discapacitado) { //Constructor con parámetro
        this.name = nombre;
        this.lastname = apellido;
        this.id = id;
        this.director = director;
        this.discapacitado = discapacitado;
    }
 //Los métodos Getter y Setter
    public String getName() {
        return name;
    }

    public void setNombre(String nombre) {
        this.name = nombre;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String apellido) {
        this.lastname = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDirector() {
        return director;
    }

    public void setDirector(boolean director) {
        this.director = director;
    }

    public boolean isdiscapacitado() {
        return discapacitado;
    }

    public void setdiscapacitado(boolean Discapacitado) {
        this.discapacitado = Discapacitado;
    }

    public String getnombrecompleto() { //Retorna el nombre completo
        return name + " " + lastname;
    }

    public void informacionempleado() { //Método que muestra toda la informacion
        String info = "Informacion del empleado:\n"
                + "Nombre: " + getnombrecompleto() + "\n"
                + "ID: " + id + "\n"
                + "Director:" + (director ? "Si" : "No") + "\n"
                + "Discapacitado:" + (discapacitado ? "Si" : "No");

        JOptionPane.showMessageDialog(null, "Datos del empleado: " + info);
    }

    private static boolean searchWorker(int ID, Empleado[] arrempleado) { // Un método privado para buscar el ID del empleado en el arreglo
        for (int i = 0; i < arrempleado.length; i++) {
            if (arrempleado[i] != null && arrempleado[i].getId() == ID) {
                return true;
            }
        }
        return false;

    }

}
    
    

    

