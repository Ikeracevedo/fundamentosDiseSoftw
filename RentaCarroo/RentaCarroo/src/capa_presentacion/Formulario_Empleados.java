
package capa_presentacion;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import capa_negocio.Data_Empleado;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;


/**
 *
 * @author Lenovo
 */
public class Formulario_Empleados extends javax.swing.JPanel {
    /**
     * Creates new form FormularioEmpleados
     */
    public Formulario_Empleados() {
        initComponents();
        this.setSize(1100, 500);
        ListarEmpleados();
    }
   
    private void ListarEmpleados() {
         // Crear modelo de tabla 
        DefaultTableModel tabla = new DefaultTableModel();
        // Crear objeto DataEmpleados para conseguir la lista
        Data_Empleado objart = new Data_Empleado();
        ArrayList<Data_Empleado> lista = new ArrayList();
        // Columnas de la tabla
        lista = objart.ListaEmpleados();
        tabla.addColumn("Id Empleado");
        tabla.addColumn("Nombre Empleado");
        tabla.addColumn("Rol Empleado");
        tabla.setRowCount(lista.size());
        int i = 0;
        for (Data_Empleado x : lista ) {
            tabla.setValueAt(x.getIdEmpleado(), i, 0);
            tabla.setValueAt(x.getNombreCompleto(), i, 1);
            tabla.setValueAt(x.getRol(), i, 2);
            i++;

        }
        this.jTable1.setModel(tabla);
    }
        
    public void LimpiarCajasTexto() {
        this.JtfidEmpleado.setText("");
        this.JtfnombreEmpleado.setText("");
        this.JtfrolEmpleado.setText("");
    } 
    
    

    @SuppressWarnings("unchecked")
                              
    private void initComponents() {

        jScrollPane2 = 	new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JtfnombreEmpleado = new javax.swing.JTextField();
        JtfidEmpleado = new javax.swing.JTextField();
        JtfrolEmpleado = new javax.swing.JTextField();
        Jlbtitulo = new javax.swing.JLabel();
        JblidEmpleado = new javax.swing.JLabel();
        JblrolEmpleado = new javax.swing.JLabel();
        Jblnombre = new javax.swing.JLabel();
        JBtNuevo = new javax.swing.JButton();
        JBtGuardar = new javax.swing.JButton();
        JBtEliminar = new javax.swing.JButton();
        JBtModificar = new javax.swing.JButton();
        JBtSalir = new javax.swing.JButton();

        
        jTable1.setDefaultEditor(Object.class, null);// No deja editar las celdas
        
        jTable1.setModel(new DefaultTableModel(
        	new Object[][] {
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        		{null, null, null},
        	},
        	new String[] {
        		"New column", "New column", "New column"
        	}
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
      

        jScrollPane2.setViewportView(jTable1);

        JtfnombreEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtGuardarActionPerformed(evt);
            }
        });

        JtfidEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });

        
        JtfrolEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });

        Jlbtitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Jlbtitulo.setText("Datos Empleado");

        JblidEmpleado.setText("Id:");

        JblrolEmpleado.setText("Rol:");

        Jblnombre.setText("Nombre:");

        JBtNuevo.setText("Nuevo:");
        JBtNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtNuevoActionPerformed(evt);
            }
        });

        JBtGuardar.setText("Guardar:");
        JBtGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtGuardarActionPerformed(evt);
            }
        });

        JBtEliminar.setText("Eliminar:");
        JBtEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtEliminarActionPerformed(evt);
            }
        });

        JBtModificar.setText("Modificar:");
        JBtModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtModificarActionPerformed(evt);
            }
        });

        JBtSalir.setText("Salir:");
        JBtSalir.setToolTipText("");
        JBtSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(20)
        					.addComponent(Jlbtitulo, GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE))
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(JBtNuevo, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
        					.addGap(68)
        					.addComponent(JBtModificar, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
        					.addGap(55)
        					.addComponent(JBtEliminar, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(58)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(JblidEmpleado, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
        						.addComponent(JblrolEmpleado, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
        						.addComponent(Jblnombre, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(JtfnombreEmpleado)
        						.addComponent(JtfrolEmpleado)
        						.addComponent(JtfidEmpleado, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
        					.addGap(82)))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 475, GroupLayout.PREFERRED_SIZE)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(56)
        					.addComponent(JBtGuardar, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
        					.addGap(64)
        					.addComponent(JBtSalir, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)))
        			.addGap(45))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(24)
        					.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 352, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(15)
        					.addComponent(Jlbtitulo, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        					.addGap(47)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(JtfidEmpleado, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        						.addComponent(JblidEmpleado, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        					.addGap(50)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(JtfnombreEmpleado, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        						.addComponent(Jblnombre, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        					.addGap(68)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(JtfrolEmpleado, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        						.addComponent(JblrolEmpleado, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))))
        			.addPreferredGap(ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(JBtEliminar, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        				.addComponent(JBtSalir, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        				.addComponent(JBtNuevo, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        				.addComponent(JBtModificar, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        				.addComponent(JBtGuardar, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
        			.addGap(49))
        );
        this.setLayout(layout);
    }// </editor-fold>                        
    
    private void JBtNuevoActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	JtfidEmpleado.setEnabled(true);
        LimpiarCajasTexto();
        JBtGuardar.setEnabled(true);
        ListarEmpleados();
    }                                        

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
    	JtfidEmpleado.setEnabled(false);
        int rec = this.jTable1.getSelectedRow();
        this.JtfidEmpleado.setText(jTable1.getValueAt(rec, 0).toString());
        this.JtfnombreEmpleado.setText(jTable1.getValueAt(rec, 1).toString());
        this.JtfrolEmpleado.setText(jTable1.getValueAt(rec, 2).toString());
    }                                    
                           
    private void JBtModificarActionPerformed(java.awt.event.ActionEvent evt) {
    	
    	try {
    		JtfidEmpleado.setEnabled(true);
            Data_Empleado objart = new Data_Empleado();
            objart.setIdEmpleado(Integer.parseInt(this.JtfidEmpleado.getText()));
            objart.setNombreCompleto(this.JtfnombreEmpleado.getText());
            objart.setRol(this.JtfrolEmpleado.getText());
            
            String mensaje = objart.EditarEmpleado();
            
            JOptionPane.showMessageDialog(null, "El empleado ha sido modificado");
            ListarEmpleados();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se logro modificar");
        }
    }     
    
    private void JBtGuardarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        try {
        	JtfidEmpleado.setEnabled(true);

        	if ((JtfidEmpleado.getText().isEmpty()) || (JtfnombreEmpleado.getText().isEmpty()) || (JtfrolEmpleado.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Ingrese todos los campos para guardar");
                return; // Detener si no se dijitan todos los campos
        	}
            Data_Empleado objart = new Data_Empleado();
            objart.setIdEmpleado(Integer.parseInt(this.JtfidEmpleado.getText()));
            objart.setNombreCompleto(this.JtfnombreEmpleado.getText());
            objart.setRol(this.JtfrolEmpleado.getText());
            JOptionPane.showMessageDialog(null, objart.GuardarEmpleado());
            ListarEmpleados();
        } catch (Exception e) {
            System.out.print(e);
            JOptionPane.showMessageDialog(null, "Datos incompletos ");
        }
    }                                          

    private void JBtEliminarActionPerformed(java.awt.event.ActionEvent evt) {   
    	
    	try {
    		JtfidEmpleado.setEnabled(true);
			if (JtfidEmpleado.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el id para eliminar empleado");
            ListarEmpleados();
            return; // Detener si no se dijita el
	        }
	        int Res = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar el empleado?");
	        if (Res == 0) {
	            Data_Empleado objart = new Data_Empleado();
	            objart.setIdEmpleado(Integer.parseInt(JtfidEmpleado.getText()));
	            JOptionPane.showMessageDialog(null, objart.EliminarEmpleado());
	            ListarEmpleados();
	            JOptionPane.showMessageDialog(null, "Empleado Eliminado");
	            ListarEmpleados();
        }
		} catch (Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null, "Error");
		}
    	
    }        
    
    private void JBtSalirActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        int r = JOptionPane.showConfirmDialog(null, "Esta Seguro?");
        if (r == 0) {
            System.exit(0);
        }
    }                                        


    // Variables declaration - do not modify                     
    private javax.swing.JButton JBtEliminar;
    private javax.swing.JButton JBtGuardar;
    private javax.swing.JButton JBtModificar;
    private javax.swing.JButton JBtNuevo;
    private javax.swing.JButton JBtSalir;
    private javax.swing.JLabel JblidEmpleado;
    private javax.swing.JLabel Jblnombre;
    private javax.swing.JLabel JblrolEmpleado;
    private javax.swing.JLabel Jlbtitulo;
    private javax.swing.JTextField JtfidEmpleado;
    private javax.swing.JTextField JtfnombreEmpleado;
    private javax.swing.JTextField JtfrolEmpleado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration           
    

    public static void main(String args[]) {
    	SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Formulario Empleados");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1100, 500);
            frame.setContentPane(new Formulario_Empleados());
            frame.setVisible(true);
        });
    

   
    }
}
