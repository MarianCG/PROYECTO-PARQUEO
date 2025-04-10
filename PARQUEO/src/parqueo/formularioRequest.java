/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectospaceadmin;

import javax.swing.JOptionPane;

/**
 *
 * @author porto
 */
public class formularioRequest extends javax.swing.JFrame {

    private int datoX;
    private int datoY;
    private String status;
    private String idPark;
    String fecha = java.time.LocalDate.now().toString();

    //importacion de tabla 
    public static Data data = new Data();

    /**
     * Creates new form formularioRequest
     */
    public formularioRequest() {
        initComponents();
    }

//Devolver la ubicacion del boton
    public int setDatoX(int datoX) {
        this.datoX = datoX;
        return datoX;

    }

    public int setDatoY(int datoY) {
        this.datoY = datoY;
        return datoY;

    }

    //Saber de que menu viene
    public String setidPark(String idPark) {
        this.idPark = idPark;
        return idPark;
    }

    //Devolver la ubicacion del boton
    public String setStatus(String status) {
        this.status = status;
        return status;
    }

//Verificar si el campo es valido para empleado
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        idInput = new javax.swing.JTextArea();
        cautionText = new javax.swing.JLabel();
        bottonValidator = new javax.swing.JButton();
        backBotton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 48)); // NOI18N
        jLabel1.setText("Formulario para el parqueo");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 48)); // NOI18N
        jLabel2.setText("ID:");

        idInput.setColumns(20);
        idInput.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        idInput.setRows(5);

        cautionText.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        cautionText.setForeground(new java.awt.Color(204, 0, 51));

        bottonValidator.setBackground(new java.awt.Color(0, 153, 0));
        bottonValidator.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        bottonValidator.setText("Listo");
        bottonValidator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottonValidatorActionPerformed(evt);
            }
        });

        backBotton.setBackground(new java.awt.Color(153, 0, 0));
        backBotton.setText("Atras");
        backBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBottonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(385, 385, 385)
                        .addComponent(bottonValidator, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idInput, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cautionText, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(298, 298, 298))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(backBotton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(822, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idInput, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(cautionText, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)))
                .addComponent(bottonValidator, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(backBotton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(747, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Botton Validador
    private void bottonValidatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottonValidatorActionPerformed
        int id = Integer.parseInt(idInput.getText());

        if (searchWorker(id) == false)
            cautionText.setText("Este usuario no tiene permisos para reservar aca");
    }//GEN-LAST:event_bottonValidatorActionPerformed

    private void backBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBottonActionPerformed
        // TODO add your handling code here:
         dashBoardParks parqueo = new dashBoardParks();
         parqueo.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_backBottonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formularioRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formularioRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formularioRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formularioRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }

    //Buscar EMPLEADO y Selector 
    private boolean searchWorker(int ID) {
        for (int i = 0; i < data.arrEmpleado.length; i++) {
            if (data.arrEmpleado[i] != null && data.arrEmpleado[i].getId() == ID) { // si el empleado seleccionado no es NULL y Es igual ID retorna el empleado seleccionado
                if (status == "D") {
                    boolean tipo = data.arrEmpleado[i].isDirector();
                    if (tipo == true) {
                        if (idPark == "S1") {
                            Data.matrizS1[datoX][datoY] = "P";
                        } else if (idPark == "S2") {
                            Data.matrizS2[datoX][datoY] = "P";
                        } else if (idPark == "S3") {
                            Data.matrizS3[datoX][datoY] = "P";
                        }
                        HistorialPark.addReserve(data.arrEmpleado[i].getName(),data.arrEmpleado[i].getId(),fecha,idPark+" "+(datoX+1 )+" "+(datoY+1));
                        dashBoardParks parqueo = new dashBoardParks();
                        parqueo.setVisible(true);
                        this.setVisible(false);
                    }
                    return tipo;
                } else if (status == "E") {
                    boolean tipo = data.arrEmpleado[i].isdiscapacitado();
                    if (tipo == true) {
                        if (idPark == "S1") {
                            Data.matrizS1[datoX][datoY] = "P";
                        } else if (idPark == "S2") {
                            Data.matrizS2[datoX][datoY] = "P";
                        } else if (idPark == "S3") {
                            Data.matrizS3[datoX][datoY] = "P";
                        }
                        HistorialPark.addReserve(data.arrEmpleado[i].getName(),data.arrEmpleado[i].getId(),fecha,idPark+" "+(datoX+1 )+" "+(datoY+1) );
                        dashBoardParks parqueo = new dashBoardParks();
                        parqueo.setVisible(true);
                        this.setVisible(false);
                    }
                    return tipo;
                } else if (status == "O") {
                    boolean tipo = true;
                    if (tipo == true) {
                        if (idPark == "S1") {
                            Data.matrizS1[datoX][datoY] = "P";
                        } else if (idPark == "S2") {
                            Data.matrizS2[datoX][datoY] = "P";
                        } else if (idPark == "S3") {
                            Data.matrizS3[datoX][datoY] = "P";
                        }
                        HistorialPark.addReserve(data.arrEmpleado[i].getName(),data.arrEmpleado[i].getId(),fecha,idPark+" "+(datoX+1 )+" "+(datoY+1) );
                        dashBoardParks parqueo = new dashBoardParks();
                        parqueo.setVisible(true);
                        this.setVisible(false);
                    }
                    return tipo;
                }
            }
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBotton;
    private javax.swing.JButton bottonValidator;
    private javax.swing.JLabel cautionText;
    private javax.swing.JTextArea idInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
