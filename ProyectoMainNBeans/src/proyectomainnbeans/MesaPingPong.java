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
public class MesaPingPong {
    
    private String numero_mesa;
    private boolean ocupada;
    private Empleado[] jugadores;
    private String HoraInicio;
    private String HoraFin;
    private static final int Capacidad_Max = 4; //Variable Global
    private static final int Duracion = 30;
    
    
    //Constructor

    public MesaPingPong(String numero_mesa) {
        this.numero_mesa = numero_mesa;
        this.jugadores = new Empleado[Capacidad_Max];
        this.ocupada = false;
    }
    
    public boolean reservarmesa_PingPong (Empleado[] jugadores){
        if(!ocupada && jugadores.length <= Capacidad_Max){ //Verfica que el num de jugadores no pase de 4
            this.ocupada = true;
            this.jugadores = jugadores;
            JOptionPane.showMessageDialog(null, "Mesa Reservada por un periodo de 30min");
            return true; }
             
         JOptionPane.showMessageDialog(null, "Reserva Invalida. Intente de Nuevo");
         return false;
    }
    
    public void liberarMesa(){
      this.ocupada = false;
      this.jugadores = new Empleado [Capacidad_Max];
      //Crea un nuevo arreglo vacío de Empleados con tamaño CAPACIDAD_MAXIMA (4)
      //Borra a a los jugadores anteriores
    }
    
    public void MostrarInformacion_PingPong (){
        String estado = ocupada ? "Ocupado" : "Disponible";
        String infoJugadores = "";
        if (ocupada){
             for (int i = 0; i < jugadores.length; i++){ //Recorre arreglo jugadores
             if(jugadores[i] != null){  //Si la pocisoon i(0-3) tiene un jugador imprime lo de abao 
                infoJugadores += "\nJugador" + (i+ 1) + ":" + jugadores[i].getnombrecompleto();
               }
             
             }
          }
           
         String mensaje = "Mesa:" + numero_mesa + "\nCapacidad:" + Capacidad_Max +
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
    
    
    
    
    
}
        
        
         
        
    
         

    
    
         
      
  
    
    

