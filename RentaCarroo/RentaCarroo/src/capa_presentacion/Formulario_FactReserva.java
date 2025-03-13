package capa_presentacion;

// Importación de librerías necesarias para la interfaz gráfica y base de datos
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import capa_negocio.FacturaReserva;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;
import capa_datos.Conexion;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Clase que representa el formulario de facturación de reservas.
 * Permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre las reservas.
 */
public class Formulario_FactReserva extends JPanel {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor de la clase. Inicializa los componentes y ajusta el tamaño del formulario.
     */
    public Formulario_FactReserva() {
        initComponents();
    }

    /**
     * Limpia los campos de texto del formulario.
     */
    public void LimpiarCajasTexto() {
        this.jTextFieldFechaPrestamo.setText("");
        this.jTextFieldIdentificacion.setText("");
        this.jTextFieldCarro.setText("");
        this.jTextFieldDias.setText("");
    }

    /**
     * Inicializa los componentes del formulario.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldFechaPrestamo = new javax.swing.JTextField();
        jTextFieldIdentificacion = new javax.swing.JTextField();
        jTextFieldCarro = new javax.swing.JTextField();
        jButtonReservar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jTextFieldDias = new javax.swing.JTextField();
        lblNumeroDeDias = new javax.swing.JLabel();

        // Definir el modelo de la tabla con las columnas correspondientes
        jTable1.setModel(new DefaultTableModel(
            new Object[][] {},
            new String[] {
                "Código", "Fecha Reserva", "Fecha Préstamo", "Cliente ID", "Carro Placa", "Días Alquilados", "Total"
            }
        ));

        jScrollPane1.setViewportView(jTable1); // Asegurar que la tabla está en un JScrollPane

        // Agregar el ListSelectionListener a la tabla
        jTable1.getSelectionModel().addListSelectionListener(event -> {
            if (!event.getValueIsAdjusting() && jTable1.getSelectedRow() != -1) {
                int selectedRow = jTable1.getSelectedRow();
                jTextFieldIdentificacion.setText(jTable1.getValueAt(selectedRow, 3).toString());
                jTextFieldFechaPrestamo.setText(jTable1.getValueAt(selectedRow, 2).toString());
                jTextFieldCarro.setText(jTable1.getValueAt(selectedRow, 4).toString());
                jTextFieldDias.setText(jTable1.getValueAt(selectedRow, 5).toString()); // Mostrar los días alquilados
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 25));
        jLabel1.setText("DETALLE DE LA RESERVA");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 25));
        jLabel2.setText("RESERVA");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jLabel3.setText("FECHA PRESTAMO");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jLabel4.setText("IDENTIFICACION");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jLabel5.setText("CARRO");

        jButtonReservar.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jButtonReservar.setText("Reservar");
        jButtonReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReservarActionPerformed(evt);
            }
        });

        jButtonBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonBorrar.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jButtonBorrar.setText("Borrar");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jButtonModificar.setFont(new java.awt.Font("Segoe UI", 0, 18));
        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        lblNumeroDeDias.setText("NUMERO DE DIAS");
        lblNumeroDeDias.setFont(new Font("Segoe UI", Font.PLAIN, 18));

        // Configuración del layout del formulario
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
            layout.createParallelGroup(Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(50)
                    .addGroup(layout.createParallelGroup(Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(lblNumeroDeDias, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
                            .addGap(18)
                            .addGroup(layout.createParallelGroup(Alignment.LEADING, false)
                                .addComponent(jTextFieldFechaPrestamo)
                                .addComponent(jTextFieldIdentificacion)
                                .addComponent(jTextFieldCarro, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldDias, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonReservar)
                            .addGap(18)
                            .addComponent(jButtonBuscar)
                            .addGap(18)
                            .addComponent(jButtonBorrar)
                            .addGap(18)
                            .addComponent(jButtonModificar)))
                    .addGap(50)
                    .addGroup(layout.createParallelGroup(Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 450, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(30)
                    .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1))
                    .addGap(20)
                    .addGroup(layout.createParallelGroup(Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jTextFieldIdentificacion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(20)
                            .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jTextFieldFechaPrestamo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(20)
                            .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jTextFieldCarro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(18)
                            .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                                .addComponent(jTextFieldDias, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNumeroDeDias, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                            .addGap(31)
                            .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                                .addComponent(jButtonReservar)
                                .addComponent(jButtonBuscar)
                                .addComponent(jButtonBorrar)
                                .addComponent(jButtonModificar)))
                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(30, Short.MAX_VALUE))
        );
        this.setLayout(layout);
    }

    /**
     * Limpia la tabla de reservas.
     */
    private void LimpiarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0); // Elimina todas las filas
    }

    /**
     * Carga las reservas de un cliente en la tabla.
     * @param idCliente El ID del cliente cuyas reservas se desean cargar.
     */
    private void CargarReservasEnTabla(int idCliente) {
        try {
            Conexion objmod = new Conexion();
            ResultSet tbl = objmod.Listar("SELECT * FROM facturareserva WHERE ClienteId = " + idCliente);

            // Crear modelo de la tabla con nombres de columnas
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Código");
            modelo.addColumn("Fecha Reserva");
            modelo.addColumn("Fecha Préstamo");
            modelo.addColumn("Cliente ID");
            modelo.addColumn("Carro Placa");
            modelo.addColumn("Días Alquilados");
            modelo.addColumn("Total");

            // Llenar el modelo con los datos obtenidos de la base de datos
            boolean hayDatos = false;
            while (tbl.next()) {
                int dias = tbl.getInt("NumeroDias");
                int total = dias * 178000; // Calcular el total basado en el número de días

                Object[] fila = {
                    tbl.getInt("Codigo"),
                    tbl.getDate("FechaReserva"),
                    tbl.getDate("FechaPrestamo"),
                    tbl.getInt("ClienteId"),
                    tbl.getString("CarroPlaca"),
                    dias, // Agregar los días alquilados
                    total // Agregar el total calculado
                };
                modelo.addRow(fila);
                hayDatos = true;

                // Verificar que los datos se imprimen correctamente en la consola
                System.out.println("Código: " + tbl.getInt("Codigo") +
                        ", FechaReserva: " + tbl.getDate("FechaReserva") +
                        ", FechaPrestamo: " + tbl.getDate("FechaPrestamo") +
                        ", ClienteId: " + tbl.getInt("ClienteId") +
                        ", CarroPlaca: " + tbl.getString("CarroPlaca") +
                        ", Días Alquilados: " + dias +
                        ", Total: " + total);
            }

            tbl.close(); // Cerrar ResultSet

            // Si no hay datos, mostrar mensaje y salir
            if (!hayDatos) {
                JOptionPane.showMessageDialog(null, "El cliente no tiene reservas registradas.");
                return;
            }

            // Asignar el modelo a la tabla
            jTable1.setModel(modelo);
            modelo.fireTableDataChanged(); // Forzar actualización de la tabla

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar las reservas: " + e.getMessage());
        }
    }

    /**
     * Maneja el evento de clic en el botón "Buscar".
     * @param evt El evento de acción.
     */
    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            // Verificar que el usuario ingresó un ID de cliente
            if (jTextFieldIdentificacion.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese el ID del cliente para buscar sus reservas.");
                return;
            }

            int idCliente = Integer.parseInt(jTextFieldIdentificacion.getText()); // Obtener ID del cliente

            // Obtener las reservas del cliente y mostrarlas en la tabla
            CargarReservasEnTabla(Integer.parseInt(this.jTextFieldIdentificacion.getText()));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar las reservas del cliente: " + e.getMessage());
        }
    }

    /**
     * Maneja el evento de clic en el botón "Reservar".
     * @param evt El evento de acción.
     */
    private void jButtonReservarActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            // Verificar que todos los campos están llenos
            if (jTextFieldFechaPrestamo.getText().isEmpty() || 
                jTextFieldIdentificacion.getText().isEmpty() || 
                jTextFieldCarro.getText().isEmpty() || 
                jTextFieldDias.getText().isEmpty()) {
                

            // Crear un objeto FacturaReserva con los datos ingresados
            FacturaReserva nuevaReserva = new FacturaReserva();
            nuevaReserva.setFechaReserva(LocalDate.now()); 
            nuevaReserva.setFechaPrestamo(LocalDate.parse(jTextFieldFechaPrestamo.getText())); 
            nuevaReserva.setIdCliente(Integer.parseInt(jTextFieldIdentificacion.getText())); 
            nuevaReserva.setCarroPlaca(jTextFieldCarro.getText()); 
            nuevaReserva.setDias(Integer.parseInt(jTextFieldDias.getText())); // Guardar días

            int total = nuevaReserva.getDias() * 178000; // Calcular total
            nuevaReserva.GuardarReserva(); // Guardar en la BD

            // Agregar la reserva a la tabla con el total
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            modelo.addRow(new Object[]{
                nuevaReserva.getCodigo(), 
                nuevaReserva.getFechaReserva(), 
                nuevaReserva.getFechaPrestamo(), 
                nuevaReserva.getIdCliente(), 
                nuevaReserva.getCarroPlaca(),
                total // Agregar el total en la columna correcta
            });

            JOptionPane.showMessageDialog(null, "Reserva guardada correctamente.");
            LimpiarCajasTexto();}
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al realizar la reserva: " + e.getMessage());
        }
        }

    /**
     * Calcula el precio total de la reserva basado en el número de días.
     */
    private void calcularPrecio() {
        try {
            int dias = Integer.parseInt(jTextFieldDias.getText()); // Convertir con validación
            int total = dias * 178000; // Multiplicar días por tarifa fija

            // Verificar si hay una reserva seleccionada en la tabla
            int filaSeleccionada = jTable1.getSelectedRow();
            if (filaSeleccionada != -1) {
                // Actualizar el valor en la tabla
                jTable1.setValueAt(total, filaSeleccionada, 5); // Columna 5 es la del "Total"
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione una reserva en la tabla para calcular el total.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un número válido en 'Número de días'.");
        }
    }

    /**
     * Maneja el evento de clic en el botón "Borrar".
     * @param evt El evento de acción.
     */
    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            int filaSeleccionada = jTable1.getSelectedRow(); // Obtener la fila seleccionada
            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(null, "Seleccione una reserva para eliminar.");
                return; // Detener si no se selecciona nada
            }

            int codigoReserva = (int) jTable1.getValueAt(filaSeleccionada, 0); // Obtener el código de la reserva

            int Res = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar la reserva con código " + codigoReserva + "?");
            if (Res == JOptionPane.YES_OPTION) {
                FacturaReserva objfactura = new FacturaReserva();
                objfactura.setCodigo(codigoReserva);
                JOptionPane.showMessageDialog(null, objfactura.EliminarReserva());

                // Recargar la tabla después de eliminar
                CargarReservasEnTabla(Integer.parseInt(this.jTextFieldIdentificacion.getText()));
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al eliminar la reserva.");
        }
    }

    /**
     * Maneja el evento de clic en el botón "Modificar".
     * @param evt El evento de acción.
     */
    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {
        try {
    		int filaSeleccionada = jTable1.getSelectedRow(); // Obtener la fila seleccionada
            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(null, "Seleccione una reserva para modificar.");
                return; // No hacer nada si no se selecciona ninguna fila
            }

            int codigoReserva = (int) jTable1.getValueAt(filaSeleccionada, 0); // Obtener el código de la reserva
            FacturaReserva objReserva = new FacturaReserva();
            objReserva.setCodigo(codigoReserva); // Código de la reserva seleccionada
            objReserva.setFechaPrestamo(LocalDate.parse(this.jTextFieldFechaPrestamo.getText())); // Convertir String a LocalDate
            objReserva.setIdCliente(Integer.parseInt(this.jTextFieldIdentificacion.getText())); // Cliente ID como número
            objReserva.setCarroPlaca(this.jTextFieldCarro.getText()); // Placa del carro
            String mensaje = objReserva.ActualizarReserva();
            
            JOptionPane.showMessageDialog(null, "La reserva ha sido modificada");
            CargarReservasEnTabla(Integer.parseInt(this.jTextFieldIdentificacion.getText()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se logro modificar");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new Formulario_FactReserva());
            frame.setSize(1100, 500);
            frame.setVisible(true);
        });
    }


    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonReservar;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldFechaPrestamo;
    private javax.swing.JTextField jTextFieldIdentificacion;
    private javax.swing.JTextField jTextFieldCarro;
    private JTable table;
    private JTable jTable_1;
    private JTextField jTextFieldDias;
    private JLabel lblNumeroDeDias;
    // End of variables declaration                   
}
