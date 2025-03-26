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
public class MesaBillar {
    
    private String numero_mesa;
    private boolean ocupada;
    private Empleado[] jugadores;
    private static final int Capacidad_Max = 4; //Variable Global
    private static final int Duracion = 30;
    private boolean estado;
     String infoJugadores = "";

    public MesaBillar(String numero_mesa) {
        this.numero_mesa = numero_mesa;
        this.ocupada = false;
        this.jugadores = new Empleado [Capacidad_Max];
        //Crea un nuevo arreglo de tipo Empleado. La capacidad max es 4. Crea espacio para 4 empleados
        
    }
    
    public boolean reservarmesa_billar (Empleado[] jugadores){
        
        if(!ocupada && jugadores.length <= Capacidad_Max){
            this.ocupada = false;
            this.jugadores = jugadores;
            JOptionPane.showMessageDialog(null,"La mesa de billar fue reservada por 30min.");
            
            return true;
        
        
        }
        
        JOptionPane.showMessageDialog(null, "Reserva Invalida. Intente de Nuevo");
        
        return false;
       
        
    }
    
    public void liberarMesa(){
        this.ocupada = false;
        this.jugadores = new Empleado [Capacidad_Max];
    
    }
    
    public void MostarInfrmacion_Billar(){
        String estado = ocupada ? "Ocupada" : "Disponible";
        String infoJugadores = "";
        
        if(ocupada) {
            for (int i = 0; i < jugadores.length; i++) { //Recorre el arreglo de jugadores
                if(jugadores[i] != null) //Verifica que haya jugadores
                   infoJugadores += "\nJugador" + (i+ 1) + ":" + jugadores[i].getnombrecompleto();
                
                
            }
        }
            
    
    
    String mensaje =  "Mesa:" + numero_mesa + "\nCapacidad:" + Capacidad_Max +
                          "personas" + "Duracion:" + Duracion +
                          "min" + "\nEstado" + estado + infoJugadores;
    
    JOptionPane.showMessageDialog(null, mensaje);
    
    
  
    
    
    }

    public String getNumero_mesa() {
        return numero_mesa;
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
