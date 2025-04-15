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

    public static Empleado[] arrempleado;
    private cubiculo_reserva sistemaCubiculos;

    public Form() {
        initComponents();

        arrempleado = new Empleado[5];
        
        
        sistemaCubiculos = new cubiculo_reserva(15);
        Page1 p1 = new Page1(arrempleado, sistemaCubiculos);
        Page2 p2 = new Page2(arrempleado, sistemaCubiculos);

        arrempleado[0] = new Empleado("Erick", "Portocarrero", 118180881, true, false);
        arrempleado[1] = new Empleado("Andres", "Viquez", 12345678, false, true);
        arrempleado[2] = new Empleado("Kristel", "Vargas", 208460639, false, false);
        arrempleado[3] = new Empleado("David", "Moreno", 98765432, true, true);
        arrempleado[4] = new Empleado("Jose", "Apestegui", 118180881, false, false);

        cargarPagina(p1, "Reservar");
        cargarPagina(p2, "Modificar");

        panelContenido.setLayout(new BorderLayout());
        
    }
    
    public static String getEmpleadoNombre(int id){
        for (Empleado empleado : arrempleado) {
            if (empleado != null && empleado.getId() == id) {
                return empleado.getName() + " " + empleado.getLastname(); //Devuelve el nombre completo
            }
        }
        return null; //Si no encuentra el empleado, va a retonar null
    }

    private void cargarPagina(JPanel pagina, String titulo) {
        jTabbedPane3.addTab("Reserva", pagina);

        panelContenido.removeAll();
        panelContenido.setLayout(new BorderLayout());
        panelContenido.add(pagina, BorderLayout.CENTER);

        panelContenido.revalidate();
        panelContenido.repaint();

    }

    public static void main(String args[]) {

    }


        
   
        
  
       
    
        
      

    
    
   
    
    

       
    
        
        
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        MostrarReservas = new javax.swing.JButton();
        DisponibilidadButton = new javax.swing.JButton();
        SalirButton = new javax.swing.JButton();
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

        SalirButton.setBackground(new java.awt.Color(255, 153, 153));
        SalirButton.setText("Salir");
        SalirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirButtonActionPerformed(evt);
            }
        });
        Panel1.add(SalirButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 40));

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
       Page1 p1 = new Page1(arrempleado, sistemaCubiculos);
        p1.setSize(610, 320);
        p1.setLocation(0, 0);
        
        panelContenido.removeAll();
        panelContenido.add(p1, BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
    }//GEN-LAST:event_ReservasButtonActionPerformed

    private void ModificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarButtonActionPerformed
        Page2 p2 = new Page2(arrempleado, sistemaCubiculos);
        p2.setSize(610, 320);
        p2.setLocation(0, 0);
        
        panelContenido.removeAll();
        panelContenido.add(p2, BorderLayout.CENTER);
        panelContenido.revalidate();
        panelContenido.repaint();
    }//GEN-LAST:event_ModificarButtonActionPerformed

    private void DisponibilidadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisponibilidadButtonActionPerformed
        boolean disponibles = sistemaCubiculos.existenCubiculosDisponibles();
        
        if(disponibles) {
            JOptionPane.showMessageDialog(this, "Existen cubículos disponibles");
        } else {
            JOptionPane.showMessageDialog(this, "No hay cubículos disponibles");
        }
    }//GEN-LAST:event_DisponibilidadButtonActionPerformed

    private void SalirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirButtonActionPerformed
         this.dispose(); 
    }//GEN-LAST:event_SalirButtonActionPerformed

    private void MostrarReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarReservasActionPerformed
        Historial.showHistorialCubiculos();
        
    }//GEN-LAST:event_MostrarReservasActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DisponibilidadButton;
    private javax.swing.JButton ModificarButton;
    private javax.swing.JButton MostrarReservas;
    private javax.swing.JPanel Panel1;
    private javax.swing.JButton ReservasButton;
    private javax.swing.JButton SalirButton;
    private javax.swing.JLabel TituloCubiculo;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JPanel panelContenido;
    // End of variables declaration//GEN-END:variables

    
}
