package parqueo;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

public class ImprimirReserva extends JFrame {

    private JTextArea reservaTextArea;
    private Reserva reserva;

    public ImprimirReserva(Reserva reserva) {
        this.reserva = reserva;

        setTitle("Imprimir Reserva");
        setVisible(true);
        setSize(800, 500);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setBackground(Color.GRAY);

        String datosReserva = """
                RESERVA COMPLETA
                ------------------------
                Cliente: %s
                Espacio: %s
                Empleado ID: %d
                Hora: %s
                Estado: %s
                ------------------------
                Gracias por su reserva.
                """.formatted(
                reserva.getNombreCliente(),
                reserva.getTipoReserva(),
                reserva.getEmpleadoId(),
                reserva.getHoraReserva(),
                reserva.getStatusReserva()
        );

        reservaTextArea = new JTextArea(datosReserva);
        reservaTextArea.setBounds(50, 50, 700, 300);
        reservaTextArea.setEditable(false);
        add(reservaTextArea);

        JButton confirmar = new JButton("Confirmar");
        confirmar.setBackground(Color.green);
        confirmar.setBounds(600, 400, 150, 30);
        add(confirmar);

        confirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarReservaEnArchivo(reservaTextArea.getText());
            }
        });
    }

    private void guardarReservaEnArchivo(String texto) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar Reserva");

        int seleccion = fileChooser.showSaveDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileChooser.getSelectedFile() + ".txt"))) {
                writer.write(texto);
                JOptionPane.showMessageDialog(this, "Reserva guardada exitosamente.");
                this.dispose();
                Menu menu = new Menu();
                menu.setVisible(true);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error al guardar archivo: " + ex.getMessage());
            }
        }
    }
}