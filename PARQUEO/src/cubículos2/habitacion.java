/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cubículos2;

/**
 *
 * @author genni
 */
public class habitacion {
    private int codigo;
    private String nombre_cubiculo;
    private boolean esta_ocupada;
    
    public habitacion() {
        this.codigo = 0;
        this.nombre_cubiculo = "";
        this.esta_ocupada = false;
        
    
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre_cubiculo() {
        return nombre_cubiculo;
    }

    public void setNombre_cubiculo(String nombre_cubiculo) {
        this.nombre_cubiculo = nombre_cubiculo;
    }

    public boolean isEsta_ocupada() {
        return esta_ocupada;
    }

    public void setEsta_ocupada(boolean esta_ocupada) {
        this.esta_ocupada = esta_ocupada;
    }
    public String atributos_a_string() {
        return String.valueOf(getCodigo()) + ";" + getNombre_cubiculo() +";"
                + String.valueOf(isEsta_ocupada());
        
    
    }

    void setNombre_de_cubiculo(String vector_cubiculo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    boolean getEsta_ocupada() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
