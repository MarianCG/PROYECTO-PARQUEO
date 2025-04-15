/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package cubiculo;

import javax.swing.JOptionPane;

/**
 *
 * @author genni
 */
public class Page1 extends javax.swing.JPanel {

    private Empleado[] arrempleado;

    private cubiculo_reserva sistemaCubiculos;

    public Page1(Empleado[] arrempleado, cubiculo_reserva sistemaCubiculos) {
        initComponents();
        this.arrempleado = arrempleado;
        this.sistemaCubiculos = sistemaCubiculos;

        String[] opcionesHoras = {
            "09:00 AM", "10:00 AM", "11:00 AM", "12:00 PM",
            "01:00 PM", "02:00 PM", "03:00 PM", "04:00 PM", "05:00 PM"
        };

        ComboxHora.setModel(new javax.swing.DefaultComboBoxModel<>(opcionesHoras));

        nCubiculo.setEditable(true);

    }

    private static boolean searchWorker(int ID, Empleado[] arrempleado) {
        for (int i = 0; i < arrempleado.length; i++) {
            if (arrempleado[i] != null && arrempleado[i].getId() == ID) {
                return true;
            }
        }
        return false;

    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Treservas = new javax.swing.JLabel();
        Ncubiculo = new javax.swing.JLabel();
        nCubiculo = new javax.swing.JTextField();
        ID = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        Hora = new javax.swing.JLabel();
        ComboxHora = new javax.swing.JComboBox<>();
        Reservar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(610, 320));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Treservas.setFont(new java.awt.Font("Segoe UI Black", 3, 36)); // NOI18N
        Treservas.setText("RESERVAS");

        Ncubiculo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Ncubiculo.setText("Ingrese el codigo del cubículo ");

        nCubiculo.setEditable(false);
        nCubiculo.setBackground(new java.awt.Color(255, 255, 255));
        nCubiculo.setForeground(new java.awt.Color(153, 153, 153));
        nCubiculo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nCubiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nCubiculoActionPerformed(evt);
            }
        });

        ID.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ID.setText("Ingrese el ID del empleado que reserva");

        id.setForeground(new java.awt.Color(153, 153, 153));
        id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        Hora.setBackground(new java.awt.Color(255, 255, 255));
        Hora.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Hora.setText("Seleccione la hora inicio");

        ComboxHora.setBackground(new java.awt.Color(0, 0, 0));
        ComboxHora.setForeground(new java.awt.Color(255, 255, 255));
        ComboxHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboxHoraActionPerformed(evt);
            }
        });

        Reservar.setBackground(new java.awt.Color(0, 0, 0));
        Reservar.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        Reservar.setForeground(new java.awt.Color(255, 255, 255));
        Reservar.setText("RESERVAR");
        Reservar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Reservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 277, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Reservar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ncubiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboxHora, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Hora)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID)
                    .addComponent(nCubiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(257, 257, 257))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(Treservas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Treservas)
                .addGap(18, 18, 18)
                .addComponent(Ncubiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nCubiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboxHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Reservar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(251, 251, 251))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nCubiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nCubiculoActionPerformed

    }//GEN-LAST:event_nCubiculoActionPerformed

    private void ComboxHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboxHoraActionPerformed

    }//GEN-LAST:event_ComboxHoraActionPerformed

    private void ReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservarActionPerformed
        try {
            int codigoCubiculo = Integer.parseInt(nCubiculo.getText().trim()) - 1;
            int idEmpleado = Integer.parseInt(id.getText().trim());
            String horaSeleccionada = ComboxHora.getSelectedItem().toString();

            if (!searchWorker(idEmpleado, arrempleado)) {
                JOptionPane.showMessageDialog(this, "El ID no corresponde a un empleado registrado.");
                return;
            }

            if (codigoCubiculo < 0 || codigoCubiculo >= sistemaCubiculos.getCantidad_cubiculos()) {
                JOptionPane.showMessageDialog(this, "Numero fuera de rango");
                return;
            }
            habitacion cubiculo = sistemaCubiculos.getVector_cubiculos(codigoCubiculo);

            if (cubiculo.getEsta_ocupada()) {
                JOptionPane.showMessageDialog(null, "El cubiculo ya esta ocupado");
                return;

            }
            cubiculo.setEsta_ocupada(true);
            cubiculo.setHoraReservaStr(horaSeleccionada);
            cubiculo.setIdEmpleado(idEmpleado);

            String nombreEmpleado = Form.getEmpleadoNombre(idEmpleado);
            if (nombreEmpleado == null) {
                nombreEmpleado = "No se encontro el empleado";
            }

            String[] opcionesHoras = {
                "09:00 AM", "10:00 AM", "11:00 AM", "12:00 PM",
                "01:00 PM", "02:00 PM", "03:00 PM", "04:00 PM", "05:00 PM"
            };
            int pos = -1;
            for (int i = 0; i < opcionesHoras.length; i++) {
                if (opcionesHoras[i].equals(horaSeleccionada)) {
                    pos = i;
                    break;
                }
            }
            String horaFin;
            if (pos != -1 && pos + 1 < opcionesHoras.length) {
                horaFin = opcionesHoras[pos + 1];

                JOptionPane.showMessageDialog(null, "Reserva realizada de\n " + horaSeleccionada + " a " + horaFin);
                String[][] historialReservas = Historial.getHistorialReservas();

                for (int i = 0; i < historialReservas.length; i++) {
                    if (historialReservas[i][0] == null) {
                        historialReservas[i][0] = nombreEmpleado;
                        historialReservas[i][1] = String.valueOf(idEmpleado);
                        historialReservas[i][2] = horaSeleccionada;
                        historialReservas[i][3] = "Cubículo" + (codigoCubiculo + 1);
                        break;

                    }

                }
                JOptionPane.showMessageDialog(null, "Reserva lista para: " + nombreEmpleado);

                nCubiculo.setText("");
                id.setText("");
                ComboxHora.setSelectedIndex(0);

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese numero válidos");
        }
    }//GEN-LAST:event_ReservarActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboxHora;
    private javax.swing.JLabel Hora;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel Ncubiculo;
    private javax.swing.JButton Reservar;
    private javax.swing.JLabel Treservas;
    private javax.swing.JTextField id;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nCubiculo;
    // End of variables declaration//GEN-END:variables
}
