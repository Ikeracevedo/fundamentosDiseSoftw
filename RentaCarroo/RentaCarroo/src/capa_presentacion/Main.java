package capa_presentacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import capa_negocio.FacturaReserva;
import capa_datos.Conexion;

public class Main extends JPanel {
    private JTextField jTextFieldFechaPrestamo;
    private JTextField jTextFieldIdentificacion;
    private JTextField jTextFieldCarro;
    private JTextField jTextFieldDias;
    private JTable jTable1;

    public Main() {
        initComponents();
    }

    private void initComponents() {
        JButton btnCarros = new JButton("Carros");
        btnCarros.setBounds(747, 188, 150, 40);

        JButton btnClientes = new JButton("Clientes");
        btnClientes.setBounds(525, 188, 150, 40);

        JButton btnEmpleados = new JButton("Empleados");
        btnEmpleados.setBounds(89, 188, 150, 40);

        JButton btnFacturas = new JButton("Facturas");
        btnFacturas.setBounds(303, 188, 150, 40);

        btnCarros.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    JFrame frame = new JFrame("Formulario Carros");
                    frame.setSize(1100, 500);
                    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    frame.setContentPane(new Formulario_Carro());
                    frame.setVisible(true);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error al abrir Formulario Carros: " + ex.getMessage());
                    ex.printStackTrace();
                }
            }
        });

        btnClientes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    JFrame frame = new JFrame("Formulario Clientes");
                    frame.setSize(1100, 500);
                    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    frame.setContentPane(new Formulario_Clientes());
                    frame.setVisible(true);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error al abrir Formulario Clientes: " + ex.getMessage());
                    ex.printStackTrace();
                }
            }
        });

        btnEmpleados.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    JFrame frame = new JFrame("Formulario Empleados");
                    frame.setSize(1100, 500);
                    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    frame.setContentPane(new Formulario_Empleados());
                    frame.setVisible(true);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error al abrir Formulario Empleados: " + ex.getMessage());
                    ex.printStackTrace();
                }
            }
        });

        btnFacturas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    JFrame frame = new JFrame("Formulario Facturas");
                    frame.setSize(1100, 500);
                    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    frame.setContentPane(new Formulario_FactReserva());
                    frame.setVisible(true);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error al abrir Formulario Facturas: " + ex.getMessage());
                    ex.printStackTrace();
                }
            }
        });

        setLayout(null);
        this.setSize(1100, 500);
        this.add(btnCarros);
        this.add(btnClientes);
        this.add(btnEmpleados);
        this.add(btnFacturas);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Menú Principal");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1100, 500);
            frame.setLocationRelativeTo(null);
            frame.setContentPane(new Main());
            frame.setVisible(true);
        });
    }
}