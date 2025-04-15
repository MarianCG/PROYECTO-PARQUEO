package parqueo;

import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;
import javax.swing.*;
import javax.swing.border.Border;

public class EspaciosRecreativos extends JFrame {

    private LinkedList<Empleado> listaEmpleados = new LinkedList<>();
    private static LinkedList<Reserva> listaReservas = new LinkedList<>(); // lista estática y compartida

    public EspaciosRecreativos() {
        inicializarEmpleados();

        JComboBox<String> empleadosComboBox = new JComboBox<>();
        for (Empleado emp : listaEmpleados) {
            empleadosComboBox.addItem(emp.getId() + " - " + emp.getNombre());
        }

        setTitle("Espacios Recreativos");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        getContentPane().setBackground(Color.GRAY);

        Border borde = BorderFactory.createLineBorder(Color.orange, 3);

        JLabel lblMensaje = new JLabel("Tipos de espacios recreativos");
        lblMensaje.setBounds(100, 50, 200, 30);
        lblMensaje.setBorder(borde);

        String[] tiposEspaciosRecreativos = {"Mesa de ping-pong", "Billar", "Futbol", "Baloncesto", "Tenis"};
        JComboBox<String> espacioRecreativosComboBox = new JComboBox<>(tiposEspaciosRecreativos);
        espacioRecreativosComboBox.setBounds(350, 50, 250, 30);

        JLabel lblEmpleados = new JLabel("Seleccione un empleado:");
        lblEmpleados.setBounds(100, 100, 200, 30);
        lblEmpleados.setBorder(borde);

        empleadosComboBox.setBounds(350, 100, 250, 30);

        JLabel lblCliente = new JLabel("Ingrese nombre de cliente:");
        lblCliente.setBounds(100, 150, 200, 30);
        lblCliente.setBorder(borde);

        JTextField textNombreCliente = new JTextField();
        textNombreCliente.setBounds(350, 150, 250, 30);

        JButton siguiente = new JButton("Siguiente");
        JButton cancelar = new JButton("Cancelar");
        siguiente.setBackground(Color.green);
        cancelar.setBackground(Color.red);
        siguiente.setBounds(600, 400, 150, 30);
        cancelar.setBounds(50, 400, 150, 30);

        siguiente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedTipoReserva = (String) espacioRecreativosComboBox.getSelectedItem();
                String empleadoSeleccionadoString = (String) empleadosComboBox.getSelectedItem();
                String nombreCliente = textNombreCliente.getText().trim();

                if (nombreCliente.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese el nombre del cliente.");
                    return;
                }

                int empleadoId = obtenerIdEmpleadoDesdeCadena(empleadoSeleccionadoString);
                if (empleadoId == -1) {
                    JOptionPane.showMessageDialog(null, "Empleado no encontrado.");
                    return;
                }

                Reserva nuevaReserva = new Reserva(empleadoId, nombreCliente, selectedTipoReserva);
                listaReservas.add(nuevaReserva);

                JOptionPane.showMessageDialog(null, "Reserva registrada correctamente.\nEmpleado ID: " + empleadoId);

                new reservarEspacio(nuevaReserva);
                dispose();
            }
        });

        cancelar.addActionListener(e -> {
            Menu menu = new Menu();
            menu.setVisible(true);
            this.setVisible(false);
            
        });

        add(lblMensaje);
        add(espacioRecreativosComboBox);
        add(lblEmpleados);
        add(empleadosComboBox);
        add(lblCliente);
        add(textNombreCliente);
        add(siguiente);
        add(cancelar);

        setVisible(true);
    }

    private void inicializarEmpleados() {
        listaEmpleados.add(new Empleado("Carlos", "Pérez", 1, false, false));
        listaEmpleados.add(new Empleado("Ana", "García", 2, false, false));
        listaEmpleados.add(new Empleado("Luis", "Ramírez", 3, false, false));
        listaEmpleados.add(new Empleado("María", "Torres", 4, false, false));
        listaEmpleados.add(new Empleado("José", "Díaz", 5, false, false));
        listaEmpleados.add(new Empleado("Erick", "Portocarrero", 118180881, true, false));
        listaEmpleados.add(new Empleado("Andres", "Viquez", 12345678, false, true));
        listaEmpleados.add(new Empleado("Kristel", "Vargas", 208460639, false, false));
        listaEmpleados.add(new Empleado("David", "Moreno", 98765432, true, true));
        listaEmpleados.add(new Empleado("Jose", "Apestegui", 118180800, false, false));

    }

    private int obtenerIdEmpleadoDesdeCadena(String textoComboBox) {
        try {
            return Integer.parseInt(textoComboBox.split(" - ")[0]);
        } catch (Exception e) {
            System.err.println("Error al extraer ID del empleado.");
            return -1;
        }
    }

    public static LinkedList<Reserva> getListaReservas() {
        return listaReservas;
    }
}
