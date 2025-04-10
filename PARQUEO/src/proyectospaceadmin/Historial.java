/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectospaceadmin;

/**
 *
 * @author porto
 */
public class Historial {
    private int id;
    private String name;
    private String park;
    private String date;

    public Historial(int id, String name, String park, String fecha) {
        this.id = id;
        this.name = name;
        this.park = park;
        this.date = date;
    }
    
        public String toString() {
        return "Cédula: " + id + ", Nombre: " + name + ", Espacio: " + park + ", Fecha: " + date;
    }
    
}
