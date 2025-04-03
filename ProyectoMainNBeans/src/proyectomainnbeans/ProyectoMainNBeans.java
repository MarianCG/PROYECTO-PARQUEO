/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectomainnbeans;

import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class ProyectoMainNBeans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //hola
       Parqueo parqueo = new Parqueo();
       SalaReuniones Sala1 = new SalaReuniones("Sala 1\n", 5);
       SalaReuniones Sala2 = new SalaReuniones("Sala 2\n", 10);
       SalaReuniones Sala3 = new SalaReuniones("Sala 3\n"
               + "", 15);
       
       //Empleado default
       Empleado empleadodefault = new Empleado("ID: 1100", "Jose","Rojas", true, false); 
       
       
       while(true) { 
           String menu = "SISTEMA DE ADMINISTRACION\n\n" +
                         "1.Ver disponibilidad de Salas de Reunion\n"+
                         "2.Reservar Sala de Reunion\n" +
                         "3.Liberar Sala\n" +
                         "4.Salir\n"+ 
                         "Ingrese su opcion:";
          
           String opcion = JOptionPane.showInputDialog(null,menu);
           if(opcion == null) break; 
           
           switch (opcion) {
               case "1": //Ver disponibilidad
                   Sala1.mostrarDispoSala();
                   Sala2.mostrarDispoSala();
                   Sala3.mostrarDispoSala();
                   break;
                   
               case "2": //Reservar
                   String Numerosala = JOptionPane.showInputDialog("Ingrese el número de sala (1-3):");
                   String horaInicio = JOptionPane.showInputDialog("Hora de inicio (HH:MM):");
                   String horaFin = JOptionPane.showInputDialog("Hora de fin (HH:MM):");
                   
                   SalaReuniones SalaEscogida = null;
                   switch (Numerosala) {
                       case "1":
                           SalaEscogida = Sala1;
                           break;
                       case "2" : SalaEscogida = Sala2;
                           break;
                       case "3":
                           SalaEscogida = Sala3;
                           
                           
                           break;
                       default:
                           JOptionPane.showMessageDialog(null, "Sala Invalida");
                           
                           
                   }
                   
                   
                   if (SalaEscogida.reservarsala(empleadodefault, horaInicio, horaFin)) { 
                       JOptionPane.showMessageDialog(null, "La sala ha sido reservada exitosamente!");
                   }else{
                       JOptionPane.showMessageDialog(null, "No se pudo reservar la sala. Intente de nuevo..");
                   
                   
                   }
                   break;
                   
               case "3": //Liberar Sala
                   String SalaaLiberar = JOptionPane.showInputDialog( "Ingrese el numero de sala que desee liberar (1-3)");
                   switch (SalaaLiberar) {
                       case "1":
                           Sala1.liberarSala();
                           JOptionPane.showMessageDialog(null,"Sala 1 ha sido liberada");
                           break;
                       case "2" :
                           Sala2.liberarSala();
                           JOptionPane.showMessageDialog(null,"Sala 2 ha sido liberada");
                           break;
                       case "3":
                           Sala3.liberarSala();
                           JOptionPane.showMessageDialog(null,"Sala 3 ha sido liberada");
                           break;
                           
                           
                          
                       default:
                           JOptionPane.showMessageDialog(null, "No se pudo liberar la sala. Sala Invalida.");
                   }
                   break;
                   
               case "4" : //Salir
                   System.exit(0);
                   
                   
                   
               
           }
        
       
       
       
       }
        
        
        
        
        
        
        
        
        
    }
    
}
