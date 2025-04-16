/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package parqueo;




import java.awt.BorderLayout;
import javax.swing.JOptionPane;

import javax.swing.JPanel;


/**
 *
 * @author genni
 */
public class Form extends javax.swing.JFrame {

    public static Empleado[] arrEmpleado; //Arreglo estático que contiene los empleados que se pueden usar
    private cubiculo_reserva sistemaCubiculos; //Instancia de la clase cubiculo_reserva, verifica toda su lógica

    public Form() {
        initComponents();

        arrEmpleado = new Empleado[10]; //Inicia el arreglo con sus espacios establecidos
        
        
        sistemaCubiculos = new cubiculo_reserva(15); //Para crear un sistema para la reserva utilizando un array
        
        //Paneles para reservar y modificar que reciben el arreglo de empleados  y el sistema de cubículos
        Page1 p1 = new Page1(arrEmpleado, sistemaCubiculos); 
        Page2 p2 = new Page2(arrEmpleado, sistemaCubiculos);

        

        arrEmpleado[0] = new Empleado("Erick", "Portocarrero", 118180881, true, false);
        arrEmpleado[1] = new Empleado("Andres", "Viquez", 12345678, false, true);
        arrEmpleado[2] = new Empleado("Kristel", "Vargas", 208460639, false, false);
        arrEmpleado[3] = new Empleado("David", "Moreno", 98765432, true, true);
        arrEmpleado[4] = new Empleado("Jose", "Apestegui", 118180800, false, false);
        arrEmpleado[5] = new Empleado("Carlos", "Pérez", 1, false, false);
        arrEmpleado[6] = new Empleado("Ana", "García", 2, false, false);
        arrEmpleado[7] = new Empleado("Luis", "Ramírez", 3, false, false);
        arrEmpleado[8] = new Empleado("María", "Torres", 4, false, false);
        arrEmpleado[9] = new Empleado("José", "Díaz", 5, false, false);


        cargarPagina(p1, "Reservar"); //Muestra en pantalla las páginas al inicio
        cargarPagina(p2, "Modificar");

        panelContenido.setLayout(new BorderLayout()); //Define al PanelContenido un layout tipo BorderLayout, funciona para mostrar solo un panel a la vez en el centro
        
    }
    
    public static String getEmpleadoNombre(int id){ //Este método busca el empleado  por su ID y devuelve el nombre completo 
        for (Empleado empleado : arrEmpleado) {
            if (empleado != null && empleado.getId() == id) {
                return empleado.getNombre() + " " + empleado.getApellido(); //Devuelve el nombre completo
            }
        }
        return null; //Si no encuentra el empleado, va a retonar null
    }

    private void cargarPagina(JPanel pagina, String titulo) { //Agrega una pestaña al jTabbedPane3 con el nombre reserva
        //Agrega un nuevo panel que recibe como argumento 
        jTabbedPane3.addTab("Reserva", pagina);

        panelContenido.removeAll();
        panelContenido.setLayout(new BorderLayout());
        panelContenido.add(pagina, BorderLayout.CENTER);

        panelContenido.revalidate();
        panelContenido.repaint();

    }

    public static void main(String args[]) {

    }


        
   
        
  
       
    
        
      

    
    
   
    
    

       
    
        
        
    //Los métodos  se disparan cuando la administradora haga clic en los botones de la interfaz
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        MostrarReservas = new javax.swing.JButton();
        DisponibilidadButton = new javax.swing.JButton();
        Atras = new javax.swing.JButton();
        TituloCubiculo = new javax.swing.JLabel();
        panelContenido = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        ModificarButton = new javax.swing.JButton();
        ReservasButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 800));

        Panel1.setBackground(new java.awt.Color(255, 255, 255));
        Panel1.setForeground(new java.awt.Color(255, 153, 153));
        Panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MostrarReservas.setBackground(new java.awt.Color(255, 153, 153));
        MostrarReservas.setText("Reservas");
        MostrarReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarReservasActionPerformed(evt);
            }
        });
        Panel1.add(MostrarReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 110, 40));

        DisponibilidadButton.setBackground(new java.awt.Color(255, 0, 0));
        DisponibilidadButton.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        DisponibilidadButton.setForeground(new java.awt.Color(255, 255, 255));
        DisponibilidadButton.setText("Ver Disponibilidad");
        DisponibilidadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisponibilidadButtonActionPerformed(evt);
            }
        });
        Panel1.add(DisponibilidadButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 210, 120));

        Atras.setBackground(new java.awt.Color(255, 153, 153));
        Atras.setText("Atras");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });
        Panel1.add(Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 40));

        TituloCubiculo.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        TituloCubiculo.setText("ÁREA DE CUBÍCULOS");
        Panel1.add(TituloCubiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 360, 30));

        panelContenido.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelContenidoLayout = new javax.swing.GroupLayout(panelContenido);
        panelContenido.setLayout(panelContenidoLayout);
        panelContenidoLayout.setHorizontalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
        );
        panelContenidoLayout.setVerticalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE))
        );

        Panel1.add(panelContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 810, 590));

        ModificarButton.setBackground(new java.awt.Color(255, 0, 0));
        ModificarButton.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        ModificarButton.setForeground(new java.awt.Color(255, 255, 255));
        ModificarButton.setText("Modificar cubículos");
        ModificarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarButtonActionPerformed(evt);
            }
        });
        Panel1.add(ModificarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 210, 114));

        ReservasButton.setBackground(new java.awt.Color(255, 0, 0));
        ReservasButton.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        ReservasButton.setForeground(new java.awt.Color(255, 255, 255));
        ReservasButton.setLabel("Reservar Cubículos");
        ReservasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservasButtonActionPerformed(evt);
            }
        });
        Panel1.add(ReservasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 210, 114));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ReservasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservasButtonActionPerformed
       //Crea un nueva ventana (Page1)
        Page1 p1 = new Page1(arrEmpleado, sistemaCubiculos);
        p1.setSize(610, 320);
        p1.setLocation(0, 0);
        
        panelContenido.removeAll();
        panelContenido.add(p1, BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
    }//GEN-LAST:event_ReservasButtonActionPerformed

    private void ModificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarButtonActionPerformed
        //Crea un nueva ventana (Page2)
        Page2 p2 = new Page2(arrEmpleado, sistemaCubiculos);
        p2.setSize(610, 320);
        p2.setLocation(0, 0);
        
        panelContenido.removeAll();
        panelContenido.add(p2, BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
    }//GEN-LAST:event_ModificarButtonActionPerformed

    private void DisponibilidadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisponibilidadButtonActionPerformed
       //LLama a sistemaCubiculos.existenCubiculosDisponibles()
        boolean disponibles = sistemaCubiculos.existenCubiculosDisponibles();
        
        if(disponibles) {
            JOptionPane.showMessageDialog(this, "Existen cubículos disponibles"); //Si existen, muestra el mensaje
        } else {
            JOptionPane.showMessageDialog(this, "No hay cubículos disponibles"); //si no, muestrta que no hay disponibilidad 
        }
    }//GEN-LAST:event_DisponibilidadButtonActionPerformed

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
         
        Menu anterior = new Menu();
        anterior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrasActionPerformed

    private void MostrarReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarReservasActionPerformed
        Historial.showHistorialCubiculos(); //Llama al método Historial.showHistorialCubiculos para mostrar
        //todas las reservas que hay 
        
    }//GEN-LAST:event_MostrarReservasActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JButton DisponibilidadButton;
    private javax.swing.JButton ModificarButton;
    private javax.swing.JButton MostrarReservas;
    private javax.swing.JPanel Panel1;
    private javax.swing.JButton ReservasButton;
    private javax.swing.JLabel TituloCubiculo;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JPanel panelContenido;
    // End of variables declaration//GEN-END:variables

    
}
