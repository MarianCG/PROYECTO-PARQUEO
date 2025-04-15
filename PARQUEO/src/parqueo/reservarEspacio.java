package parqueo;

import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;
import javax.swing.*;
import javax.swing.border.Border;

public class reservarEspacio extends JFrame {

    private String horaSeleccionada;
    private JComboBox<String> listHorasComboBox;
    private JButton siguiente, cancelar;
    private static Reserva reservaActual;
    private static LinkedList<Reserva> listaReservasGlobal;

    public reservarEspacio(Reserva reserva) {
        reservaActual = reserva;
        listaReservasGlobal = EspaciosRecreativos.getListaReservas(); // accede a la lista global
        inicializarVentana();
        inicializarComponentes();
        configurarEventos();
        setVisible(true);
    }

    private void inicializarVentana() {
        setTitle("Reservar Espacio");
        setSize(800, 500);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setBackground(Color.GRAY);
    }

    private void inicializarComponentes() {
        Border borde = BorderFactory.createLineBorder(Color.orange, 3);
        JLabel lblMensaje = new JLabel("Seleccione la hora para su reserva:");
        lblMensaje.setBounds(100, 50, 240, 30);
        lblMensaje.setBorder(borde);

        String[] listHoras = {
            "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM",
            "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM",
            "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM"
        };

        listHorasComboBox = new JComboBox<>();
        for (String hora : listHoras) {
            if (!horaYaReservada(reservaActual.getTipoReserva(), hora)) {
                listHorasComboBox.addItem(hora);
            }
        }

        listHorasComboBox.setBounds(350, 50, 250, 30);

        siguiente = new JButton("Siguiente");
        cancelar = new JButton("Cancelar");
        siguiente.setBackground(Color.GREEN);
        cancelar.setBackground(Color.RED);
        siguiente.setBounds(600, 400, 150, 30);
        cancelar.setBounds(50, 400, 150, 30);

        add(lblMensaje);
        add(listHorasComboBox);
        add(siguiente);
        add(cancelar);
    }

    private void configurarEventos() {
        cancelar.addActionListener(e -> {
            System.out.println("Reserva cancelada.");
            new EspaciosRecreativos();
            dispose();
        });

        siguiente.addActionListener(e -> {
            horaSeleccionada = (String) listHorasComboBox.getSelectedItem();

            if (horaYaReservada(reservaActual.getTipoReserva(), horaSeleccionada)) {
                JOptionPane.showMessageDialog(null, "Esa hora ya fue reservada para este espacio recreativo.");
                return;
            }

            reservaActual.setHoraReserva(horaSeleccionada);
            reservaActual.setStatusReserva("confirmada");
            System.out.println("Hora seleccionada: " + horaSeleccionada);
            new ImprimirReserva(reservaActual);
            dispose();
        });
    }

    private boolean horaYaReservada(String tipoReserva, String hora) {
        for (Reserva r : listaReservasGlobal) {
            if (r.getTipoReserva().equals(tipoReserva) && r.getHoraReserva().equals(hora)) {
                return true;
            }
        }
        return false;
    }
}