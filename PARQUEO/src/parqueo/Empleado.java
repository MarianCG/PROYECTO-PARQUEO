/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueo;

import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class Empleado {
    
    private String name;
    private String lastname;
    private int id;
    private boolean director;
    private boolean discapacitado; 

    public Empleado(String nombre, String apellido, int id, boolean director, boolean discapacitado) {
        this.name = nombre;
        this.lastname = apellido;
        this.id = id;
        this.director = director;
        this.discapacitado = discapacitado;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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
   
    public String getnombrecompleto() {
        return name + " " + lastname;   }
    
    public void informacionempleado() {
        String info = "Informacion del empleado:\n"
                + "Nombre: " + getnombrecompleto() + "\n"
                + "ID: " + id +"\n"
                +"Director:" + (director ? "Si" : "No") + "\n"
                + "Discapacitado:" + (discapacitado ? "Si" : "No");
        
        JOptionPane.showMessageDialog(null, "Datos del empleado: " + info);
    }
    
      
   
    
}
    
    
    
    
    
    
    
    
    
 
    
  
    
    
    
    
    
    
    
    
    

    
   

    
    
