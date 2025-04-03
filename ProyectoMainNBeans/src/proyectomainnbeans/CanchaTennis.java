/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectomainnbeans;

import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class CanchaTennis {
    
    private String numero_cancha;
    private boolean ocupada;
    private Empleado[] jugadores;
    private boolean estado;
    private String infoJugadores = "";
    private static final int Capacidad_max = 2;

    public CanchaTennis(String numero_cancha) {
        this.numero_cancha = numero_cancha;
        this.ocupada = false;
        this.jugadores = new Empleado[Capacidad_max];
        
    }
    
    public boolean reservarcancha_Tennis (){
        if (!ocupada && jugadores.length == Capacidad_max) {
            this.ocupada = true;
            this.jugadores = jugadores;
            JOptionPane.showMessageDialog(null, "La Cancha de Tennis ha sido reservada");
            
            return true;
                
            }
        
        JOptionPane.showMessageDialog(null, "Reserva Invalida. Intente de Nuevo");
        
        return false;
    }
    
    
    public void LiberarCancha(){
        this.jugadores = new Empleado[Capacidad_max];
        this.ocupada = false;
    }
    
    public void MostrarInformacion_Tennis(){
        String estado = ocupada ? "Ocupada" : "Disponible";
        String infoJugadores = "";
        
        if(ocupada){
            for (int i = 0; i < jugadores.length; i++) {
                if(jugadores[i] != null){
                    infoJugadores += "\nJugador" + (i+ 1) + ":" + jugadores[i].getnombrecompleto();
                    
                }
                
            }
        }
        
        String mensaje =  "Mesa:" + numero_cancha + "\nCapacidad:" + Capacidad_max +
                          "personas" +
                          "min" + "\nEstado" + estado + infoJugadores;
    
    JOptionPane.showMessageDialog(null, mensaje);
    
        
        
        
        
    }

    public String getNumero_cancha() {
        return numero_cancha;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public Empleado[] getJugadores() {
        return jugadores;
    }

    public String getInfoJugadores() {
        return infoJugadores;
    }
          
    
}
