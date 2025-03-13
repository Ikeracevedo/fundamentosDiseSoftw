package capa_presentacion;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import capa_negocio.Data_Carro;

public class Formulario_Carro extends JFrame {
    private JButton JBtEliminar, JBtGuardar, JBtModificar, JBtNuevo, JBtSalir;
    private JLabel JblidEmpleado, Jblnombre, JblrolEmpleado, Jlbtitulo, Jbllinea, Jblkilo, Jblestado;
    private JTextField Jtfplaca, JtfmarcaCarro, Jtfmodelo, Jtflinea, Jtfkilometraje;
    private JComboBox<String> Jcbestado;
    private JScrollPane jScrollPane2;
    private JTable jTable1;

    public Formulario_Carro() {
        initComponents();
        this.setSize(900, 400);
        ListarCarros();
        JBtGuardar.setEnabled(false);
    }

    private void ListarCarros() {
        DefaultTableModel tabla = new DefaultTableModel();
        Data_Carro objcar = new Data_Carro();
        ArrayList<Data_Carro> lista = objcar.ListaCarros();
        
        tabla.addColumn("Placa");
        tabla.addColumn("Marca");
        tabla.addColumn("Modelo");
        tabla.addColumn("Línea");
        tabla.addColumn("Kilometraje");
        tabla.addColumn("Estado");

        if (lista != null) {
            for (Data_Carro x : lista) {
                tabla.addRow(new Object[]{
                    x.getPlaca(), 
                    x.getMarcaCarro(), 
                    x.getModelo(), 
                    x.getLinea(), 
                    x.getKilometraje(), 
                    x.isEstado() ? "Disponible" : "No Disponible"
                });
            }
        }
        jTable1.setModel(tabla);
    }

    private void LimpiarCajasTexto() {
        Jtfplaca.setText("");
        JtfmarcaCarro.setText("");
        Jtfmodelo.setText("");
        Jtflinea.setText("");
        Jtfkilometraje.setText("");
        Jcbestado.setSelectedIndex(0);
    }

    private void initComponents() {
        // Configuración principal del formulario
        setTitle("Formulario Carro");
        setLayout(new BorderLayout(10, 10));
        
        // Panel principal que contendrá todo
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        // Panel para el título
        JPanel titlePanel = new JPanel();
        Jlbtitulo = new JLabel("Datos Carros");
        Jlbtitulo.setFont(new Font("Dialog", Font.BOLD, 18));
        titlePanel.add(Jlbtitulo);
        
        // Panel para los campos de formulario (lado izquierdo)
        JPanel formPanel = new JPanel(new GridLayout(6, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        // Creación de componentes
        JblidEmpleado = new JLabel("Placa:");
        Jtfplaca = new JTextField(15);
        
        JblrolEmpleado = new JLabel("Marca:");
        JtfmarcaCarro = new JTextField(15);
        
        Jblnombre = new JLabel("Modelo:");
        Jtfmodelo = new JTextField(15);
        
        Jbllinea = new JLabel("Línea:");
        Jtflinea = new JTextField(15);
        
        Jblkilo = new JLabel("Kilometraje:");
        Jtfkilometraje = new JTextField(15);
        
        Jblestado = new JLabel("Estado:");
        Jcbestado = new JComboBox<>(new String[]{"Disponible", "No Disponible"});
        
        // Agregar componentes al panel de formulario
        formPanel.add(JblidEmpleado);
        formPanel.add(Jtfplaca);
        formPanel.add(JblrolEmpleado);
        formPanel.add(JtfmarcaCarro);
        formPanel.add(Jblnombre);
        formPanel.add(Jtfmodelo);
        formPanel.add(Jbllinea);
        formPanel.add(Jtflinea);
        formPanel.add(Jblkilo);
        formPanel.add(Jtfkilometraje);
        formPanel.add(Jblestado);
        formPanel.add(Jcbestado);
        
        // Panel para la tabla (lado derecho)
        jTable1 = new JTable();
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2 = new JScrollPane(jTable1);
        jScrollPane2.setPreferredSize(new Dimension(500, 300));
        
        // Panel para los botones (abajo)
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        
        JBtNuevo = new JButton("Nuevo");
        JBtModificar = new JButton("Modificar");
        JBtEliminar = new JButton("Eliminar");
        JBtGuardar = new JButton("Guardar");
        JBtSalir = new JButton("Salir");
        
        // Estilo consistente para los botones
        Dimension buttonSize = new Dimension(100, 30);
        JBtNuevo.setPreferredSize(buttonSize);
        JBtModificar.setPreferredSize(buttonSize);
        JBtEliminar.setPreferredSize(buttonSize);
        JBtGuardar.setPreferredSize(buttonSize);
        JBtSalir.setPreferredSize(buttonSize);
        
        buttonPanel.add(JBtNuevo);
        buttonPanel.add(JBtModificar);
        buttonPanel.add(JBtEliminar);
        buttonPanel.add(JBtGuardar);
        buttonPanel.add(JBtSalir);
        
        // Panel para contener el formulario y la tabla
        JPanel contentPanel = new JPanel(new BorderLayout(10, 0));
        contentPanel.add(formPanel, BorderLayout.WEST);
        contentPanel.add(jScrollPane2, BorderLayout.CENTER);
        
        // Agregar todos los paneles al panel principal
        mainPanel.add(titlePanel, BorderLayout.NORTH);
        mainPanel.add(contentPanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        
        // Añadir el panel principal al frame
        add(mainPanel);
        
        // Agregar action listeners a los botones
        JBtNuevo.addActionListener(this::JBtNuevoActionPerformed);
        JBtGuardar.addActionListener(this::JBtGuardarActionPerformed);
        JBtModificar.addActionListener(this::JBtModificarActionPerformed);
        JBtEliminar.addActionListener(this::JBtEliminarActionPerformed);
        JBtSalir.addActionListener(this::JBtSalirActionPerformed);
        
        // Agregar listener para selección en la tabla
        jTable1.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting() && jTable1.getSelectedRow() != -1) {
                int row = jTable1.getSelectedRow();
                Jtfplaca.setText(jTable1.getValueAt(row, 0).toString());
                JtfmarcaCarro.setText(jTable1.getValueAt(row, 1).toString());
                Jtfmodelo.setText(jTable1.getValueAt(row, 2).toString());
                Jtflinea.setText(jTable1.getValueAt(row, 3).toString());
                Jtfkilometraje.setText(jTable1.getValueAt(row, 4).toString());
                Jcbestado.setSelectedIndex("Disponible".equals(jTable1.getValueAt(row, 5)) ? 0 : 1);
                
                // Deshabilitar el campo de placa durante la edición
                Jtfplaca.setEnabled(false);
                JBtGuardar.setEnabled(false);
            }
        });
    }
    
    /**
     * Método que se ejecuta cuando se presiona el botón "Nuevo".
     * Habilita el campo de placa y limpia los campos de texto para ingresar un nuevo carro.
     */
    private void JBtNuevoActionPerformed(ActionEvent evt) {
        try {
            Jtfplaca.setEnabled(true); // Habilita la edición del campo de placa
            LimpiarCajasTexto(); // Borra todos los campos de entrada
            JBtGuardar.setEnabled(true); // Habilita el botón de guardar
            jTable1.clearSelection(); // Limpia la selección de la tabla
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al intentar crear un nuevo registro: " + e.getMessage());
        }
    }

    /**
     * Método que se ejecuta cuando se presiona el botón "Guardar".
     * Valida los campos de entrada, convierte los valores numéricos y guarda un nuevo carro en la base de datos.
     */
    private void JBtGuardarActionPerformed(ActionEvent evt) {
        try {
            // Verifica que todos los campos estén llenos antes de continuar
            if (Jtfplaca.getText().isEmpty() || JtfmarcaCarro.getText().isEmpty() || 
                Jtfmodelo.getText().isEmpty() || Jtflinea.getText().isEmpty() || 
                Jtfkilometraje.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese todos los campos para guardar");
                return;
            }

            int modelo, kilometraje; // Variables para almacenar los valores numéricos
            try {
                modelo = Integer.parseInt(Jtfmodelo.getText()); // Convierte el modelo a entero
                kilometraje = Integer.parseInt(Jtfkilometraje.getText()); // Convierte el kilometraje a entero
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Modelo y Kilometraje deben ser valores numéricos válidos.");
                return;
            }

            // Crea un nuevo objeto Data_Carro y asigna los valores ingresados
            Data_Carro objcar = new Data_Carro();
            objcar.setPlaca(Jtfplaca.getText());
            objcar.setMarcaCarro(JtfmarcaCarro.getText());
            objcar.setModelo(modelo);
            objcar.setLinea(Jtflinea.getText());
            objcar.setKilometraje(kilometraje);
            objcar.setEstado(Jcbestado.getSelectedIndex() == 0); // 0 = Disponible, 1 = No disponible

            JOptionPane.showMessageDialog(null, objcar.GrabarCarro()); // Guarda el carro y muestra mensaje de éxito
            ListarCarros(); // Refresca la tabla de carros
            LimpiarCajasTexto(); // Limpia los campos después de guardar
            JBtGuardar.setEnabled(false); // Deshabilita el botón de guardar
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el carro: " + e.getMessage());
        }
    }

    /**
     * Método que se ejecuta cuando se presiona el botón "Modificar".
     * Valida los datos ingresados y actualiza la información de un carro existente.
     */
    private void JBtModificarActionPerformed(ActionEvent evt) {
        try {
            // Verifica que se haya ingresado una placa para modificar
            if (Jtfplaca.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese la placa del carro a modificar");
                return;
            }

            int modelo, kilometraje;
            try {
                modelo = Integer.parseInt(Jtfmodelo.getText()); // Convierte el modelo a entero
                kilometraje = Integer.parseInt(Jtfkilometraje.getText()); // Convierte el kilometraje a entero
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Modelo y Kilometraje deben ser valores numéricos válidos.");
                return;
            }

            // Crea un objeto Data_Carro con los nuevos valores
            Data_Carro objcar = new Data_Carro();
            objcar.setPlaca(Jtfplaca.getText());
            objcar.setMarcaCarro(JtfmarcaCarro.getText());
            objcar.setModelo(modelo);
            objcar.setLinea(Jtflinea.getText());
            objcar.setKilometraje(kilometraje);
            objcar.setEstado(Jcbestado.getSelectedIndex() == 0);

            JOptionPane.showMessageDialog(null, objcar.EditarCarro()); // Actualiza el carro y muestra mensaje de éxito
            ListarCarros(); // Refresca la lista de carros
            LimpiarCajasTexto(); // Limpia los campos después de modificar
            Jtfplaca.setEnabled(true); // Habilita el campo de placa para futuras operaciones
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se logró modificar el carro: " + e.getMessage());
        }
    }

    /**
     * Método que se ejecuta cuando se presiona el botón "Eliminar".
     * Pide confirmación antes de eliminar un carro basado en su placa.
     */
    private void JBtEliminarActionPerformed(ActionEvent evt) {
        try {
            // Verifica que el usuario haya ingresado una placa para eliminar
            if (Jtfplaca.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese la placa del carro a eliminar");
                return;
            }

            // Muestra una confirmación antes de eliminar
            int Res = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar este carro?");
            if (Res == 0) { // Si el usuario confirma la eliminación
                Data_Carro objcar = new Data_Carro();
                objcar.setPlaca(Jtfplaca.getText());
                JOptionPane.showMessageDialog(null, objcar.EliminarCarro()); // Elimina el carro y muestra mensaje
                ListarCarros(); // Refresca la tabla de carros
                LimpiarCajasTexto(); // Limpia los campos después de eliminar
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el carro: " + e.getMessage());
        }
    }

    /**
     * Método que se ejecuta cuando se presiona el botón "Salir".
     * Pide confirmación antes de cerrar la aplicación.
     */
    private void JBtSalirActionPerformed(ActionEvent evt) {
        try {
            int r = JOptionPane.showConfirmDialog(null, "¿Está seguro?");
            if (r == 0) {
                dispose(); // Cierra el formulario actual
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al intentar salir: " + e.getMessage());
        }
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> {
            Formulario_Carro frame = new Formulario_Carro();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
