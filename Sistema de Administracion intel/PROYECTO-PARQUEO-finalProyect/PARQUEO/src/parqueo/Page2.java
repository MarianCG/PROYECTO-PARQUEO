/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package parqueo;


import javax.swing.JOptionPane;

/**
 *
 * @author genni
 */
public class Page2 extends javax.swing.JPanel {

    private Empleado[] arrempleado;  //arreglo de todos los empleados
    private boolean modificacionHecha; //Para verificar si hubo cambis
    private cubiculo_reserva sistemaCubiculos; //Contiene la lógica de los cubículos

    public Page2(Empleado[] arrempleado, cubiculo_reserva sistemaCubiculos) { //Recibe parámetros del arrempleados y cubiculo_reserva
        initComponents();
        this.arrempleado = arrempleado;
        this.sistemaCubiculos = sistemaCubiculos;

        String[] opcionesHoras = { //Un arreglo de horas oara mostrar en una lista
            "09:00 AM", "10:00 AM", "11:00 AM", "12:00 PM",
            "01:00 PM", "02:00 PM", "03:00 PM", "04:00 PM", "05:00 PM"
        };
        HoraM.setModel(new javax.swing.DefaultComboBoxModel<>(opcionesHoras)); //Se le notifica al Combo Box que use esas opciones

    }

    private static boolean searchWorker(int ID, Empleado[] arrempleado) { //Método para veriicar que el empleado este registrado 
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
        TModificaR = new javax.swing.JLabel();
        NMCubiculo = new javax.swing.JLabel();
        nmCubiculo = new javax.swing.JTextField();
        IDModificar = new javax.swing.JLabel();
        idModificar = new javax.swing.JTextField();
        Horam = new javax.swing.JLabel();
        HoraM = new javax.swing.JComboBox<>();
        Modificar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(610, 320));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        TModificaR.setFont(new java.awt.Font("Segoe UI Black", 3, 36)); // NOI18N
        TModificaR.setText("MODIFICAR RESERVA");

        NMCubiculo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        NMCubiculo.setText("Ingrese el código del cubículo a modificar ");

        nmCubiculo.setForeground(new java.awt.Color(153, 153, 153));
        nmCubiculo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        IDModificar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        IDModificar.setText("Ingrese el ID del empleado");

        idModificar.setForeground(new java.awt.Color(153, 153, 153));
        idModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        idModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idModificarActionPerformed(evt);
            }
        });

        Horam.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Horam.setText(" Nueva hora de inicio");

        HoraM.setBackground(new java.awt.Color(0, 0, 0));
        HoraM.setForeground(new java.awt.Color(255, 255, 255));
        HoraM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        Modificar.setBackground(new java.awt.Color(0, 0, 0));
        Modificar.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        Modificar.setForeground(new java.awt.Color(255, 255, 255));
        Modificar.setText("MODIFICAR");
        Modificar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HoraM, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDModificar)
                    .addComponent(nmCubiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NMCubiculo)
                    .addComponent(Horam, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addComponent(TModificaR)
                .addGap(180, 180, 180))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(TModificaR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NMCubiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nmCubiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(IDModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(idModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Horam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HoraM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void idModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idModificarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        try {
            //Lee el número del cubículo, el ID y la hora seleccionada desde la interfaz
            int codigoCubiculo = Integer.parseInt(nmCubiculo.getText().trim()) - 1; //Se resta el 1 al número del cubículo porque los array empiezan desde 0
            int idEmpleado = Integer.parseInt(idModificar.getText().trim());
            String horaSeleccionada = HoraM.getSelectedItem().toString();

            if (codigoCubiculo < 0 || codigoCubiculo >= sistemaCubiculos.getCantidad_cubiculos()) { //Verifica que el cubiculo exista, si es menor a 0 o mayor a 15
                //, mostrara el mensaje de error.
                JOptionPane.showMessageDialog(this, "Numero fuera de rango");
                return;
            }
            habitacion cubiculo = sistemaCubiculos.getVector_cubiculos(codigoCubiculo); //Obtiene el objeto (Cubiculo)
            if (!cubiculo.getEsta_ocupada()) { //Verifica si el cubículo se encuentra ocupado
                JOptionPane.showMessageDialog(this, "El cubiculo no tiene reserva activa."); //Si no hay reservas mostrará el JOptionPane
                return;
            }
            if (!searchWorker(idEmpleado, arrempleado)) {
                JOptionPane.showMessageDialog(this, "El ID no corresponde a un empleado registrado.");
                return;
            }
            //Modfica los datos de la reserva activa 
            cubiculo.setEsta_ocupada(true);
            cubiculo.setHoraReservaStr(horaSeleccionada);
            cubiculo.setIdEmpleado(idEmpleado);

            Historial.deleteHistoialCubiculo(codigoCubiculo); //Borra el historial anterior 

            // para actualizar el historial
            String nombreEmpleado = Form.getEmpleadoNombre(idEmpleado);

            if (nombreEmpleado == null) {
                nombreEmpleado = "No se encontro el empleado";
            }
            Historial.addReserve(nombreEmpleado, idEmpleado, horaSeleccionada, "Cubiculo" + (codigoCubiculo + 1));

            String[] opcionesHoras = { //Calcula hora fina de la modificación de la reserva
                "09:00 AM", "10:00 AM", "11:00 AM", "12:00 PM",
                "01:00 PM", "02:00 PM", "03:00 PM", "04:00 PM", "05:00 PM"
            };

            int pos = -1;
            for (int i = 0; i < opcionesHoras.length; i++) {
                if (opcionesHoras[i].equals(horaSeleccionada)) { //Lista de las Horas
                    pos = i;
                    break;
                }
            }

            String horaFin;
            if (pos != -1 && pos + 1 < opcionesHoras.length) { //Calcula la hora en la que va a finalizar la reserva modificada 
                horaFin = opcionesHoras[pos + 1];

                JOptionPane.showMessageDialog(null, "Reserva modificada de\n " + horaSeleccionada + " a " + horaFin);
                
                //  Limpia los campos después que el administrado haga la modificación
                nmCubiculo.setText("");
                idModificar.setText("");
                HoraM.setSelectedIndex(0);

            }
        } catch (NumberFormatException e) { //Para mostrar el error( ejem: si el usuario escribe un texto en vez de un numero, ya que el Integer
            //esta convirtiendo un texto a número
            JOptionPane.showMessageDialog(this, "Ingrese numero válidos");
        }
    }//GEN-LAST:event_ModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> HoraM;
    private javax.swing.JLabel Horam;
    private javax.swing.JLabel IDModificar;
    private javax.swing.JButton Modificar;
    private javax.swing.JLabel NMCubiculo;
    private javax.swing.JLabel TModificaR;
    private javax.swing.JTextField idModificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nmCubiculo;
    // End of variables declaration//GEN-END:variables
}
