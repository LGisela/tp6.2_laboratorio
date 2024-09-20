package vistas;

import java.awt.Component;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import java.util.TreeSet;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import productos.Categoria;
import productos.Producto;

public class Gestionar_Productos extends javax.swing.JInternalFrame {

    DefaultTableModel tabla = new DefaultTableModel();

    private static TreeSet<Producto> listaProductos = new TreeSet<>();

    public Gestionar_Productos() {
        initComponents();
        this.setResizable(false);
        llenarCombo();
        String[] productos = {"Codigo", "Descripcion", "Precio", "Categoria", "Stock"};
        tabla.setColumnIdentifiers(productos);
        jTable1.setModel(tabla);
        JTFCodigo.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                String texto = JTFCodigo.getText();
                if (texto.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "El campo no puede estar vacío.");
                    JTFCodigo.requestFocus();
                }
            }
        });
        JBGuardar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JCBCategorias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JBNuevo = new javax.swing.JButton();
        JBGuardar = new javax.swing.JButton();
        JBEliminar = new javax.swing.JButton();
        JBActualizar = new javax.swing.JButton();
        JBCerrar = new javax.swing.JButton();
        JPANEL2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        JCBRubro = new javax.swing.JComboBox<>();
        JSStock = new javax.swing.JSpinner();
        JTFDescripcion = new javax.swing.JTextField();
        JTFCodigo = new javax.swing.JTextField();
        JTFPrecio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JBBuscar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setMaximizable(true);
        setMaximumSize(new java.awt.Dimension(555, 555));
        setPreferredSize(new java.awt.Dimension(555, 555));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        JCBCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBCategoriasActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Descripción", "Precio", "Categoria", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        JBNuevo.setBackground(new java.awt.Color(0, 204, 102));
        JBNuevo.setText("NUEVO");
        JBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNuevoActionPerformed(evt);
            }
        });

        JBGuardar.setBackground(new java.awt.Color(0, 153, 153));
        JBGuardar.setText("GUARDAR");
        JBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBGuardarActionPerformed(evt);
            }
        });

        JBEliminar.setBackground(new java.awt.Color(204, 0, 0));
        JBEliminar.setText("ELIMINAR");
        JBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEliminarActionPerformed(evt);
            }
        });

        JBActualizar.setBackground(new java.awt.Color(0, 51, 0));
        JBActualizar.setText("Actualizar");
        JBActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBActualizarActionPerformed(evt);
            }
        });

        JBCerrar.setBackground(new java.awt.Color(0, 102, 51));
        JBCerrar.setForeground(new java.awt.Color(204, 255, 204));
        JBCerrar.setText("CERRAR");

        jLabel12.setText("Stock");

        jLabel8.setText("Codigo");

        jLabel9.setText("Descripcion");

        jLabel10.setText("Precio");

        jLabel11.setText("Rubro");

        JCBRubro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JCBRubroItemStateChanged(evt);
            }
        });
        JCBRubro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JCBRubroMouseClicked(evt);
            }
        });
        JCBRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBRubroActionPerformed(evt);
            }
        });

        JSStock.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        JSStock.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                JSStockStateChanged(evt);
            }
        });
        JSStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JSStockMouseClicked(evt);
            }
        });

        JTFDescripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTFDescripcionFocusLost(evt);
            }
        });
        JTFDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFDescripcionActionPerformed(evt);
            }
        });

        JTFCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTFCodigoFocusLost(evt);
            }
        });
        JTFCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFCodigoActionPerformed(evt);
            }
        });

        JTFPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFPrecioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPANEL2Layout = new javax.swing.GroupLayout(JPANEL2);
        JPANEL2.setLayout(JPANEL2Layout);
        JPANEL2Layout.setHorizontalGroup(
            JPANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPANEL2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPANEL2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFDescripcion))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPANEL2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(36, 36, 36)
                        .addComponent(JTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPANEL2Layout.createSequentialGroup()
                        .addGroup(JPANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(39, 39, 39)
                        .addGroup(JPANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JSStock, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JCBRubro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JTFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        JPANEL2Layout.setVerticalGroup(
            JPANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPANEL2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(JTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(JTFDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(JTFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(JPANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(JCBRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(JSStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Gestión de Productos");

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("FILTRAR POR CATEGORIAS:");

        JBBuscar.setText("BUSCAR");
        JBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel2)
                        .addGap(46, 46, 46)
                        .addComponent(JCBCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JBNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(JBGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(JBActualizar)
                        .addGap(38, 38, 38)
                        .addComponent(JBEliminar)))
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(JPANEL2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(JBCerrar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBBuscar)
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JCBCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBBuscar)
                        .addGap(29, 29, 29)
                        .addComponent(JBCerrar))
                    .addComponent(JPANEL2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBNuevo)
                    .addComponent(JBGuardar)
                    .addComponent(JBActualizar)
                    .addComponent(JBEliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int fila = jTable1.getSelectedRow();
        if (fila != -1) {
            JTFCodigo.setText(jTable1.getValueAt(fila, 0).toString());
            JTFDescripcion.setText(jTable1.getValueAt(fila, 1).toString());
            JTFPrecio.setText(jTable1.getValueAt(fila, 2).toString());
            JCBRubro.setSelectedItem(jTable1.getValueAt(fila, 3));
            JSStock.setValue(jTable1.getValueAt(fila, 4));
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void JCBCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBCategoriasActionPerformed
        Categoria cat = (Categoria) JCBCategorias.getSelectedItem();
        tabla.setRowCount(0);

        for (Producto producto : listaProductos) {
            if (producto.getRubro() == cat) {
                tabla.addRow(new Object[]{producto.getCodigo(), producto.getDescripcion(), producto.getPrecio(), producto.getRubro(), producto.getStock()});
            }
        }
    }//GEN-LAST:event_JCBCategoriasActionPerformed

    private void JTFCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFCodigoFocusLost

    }//GEN-LAST:event_JTFCodigoFocusLost

    private void JTFDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFDescripcionActionPerformed

    }//GEN-LAST:event_JTFDescripcionActionPerformed

    private void JTFPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFPrecioActionPerformed

    }//GEN-LAST:event_JTFPrecioActionPerformed

    private void JCBRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBRubroActionPerformed


    }//GEN-LAST:event_JCBRubroActionPerformed

    private void JTFDescripcionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFDescripcionFocusLost

    }//GEN-LAST:event_JTFDescripcionFocusLost

    private void JSStockStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_JSStockStateChanged

    }//GEN-LAST:event_JSStockStateChanged

    private void JCBRubroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JCBRubroMouseClicked

    }//GEN-LAST:event_JCBRubroMouseClicked

    private void JSStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JSStockMouseClicked

    }//GEN-LAST:event_JSStockMouseClicked

    private void JTFCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFCodigoActionPerformed

    }//GEN-LAST:event_JTFCodigoActionPerformed

    private void JCBRubroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JCBRubroItemStateChanged

    }//GEN-LAST:event_JCBRubroItemStateChanged

    private void JBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNuevoActionPerformed
        // TODO add your handling code here:
        JTFCodigo.setText("");
        JTFDescripcion.setText("");
        JTFPrecio.setText("");
        JSStock.setValue(0);
        JBGuardar.setEnabled(true);
    }//GEN-LAST:event_JBNuevoActionPerformed

    private void JBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBGuardarActionPerformed
        // TODO add your handling code here:
        validarCamposVacios(JPANEL2);
        try {
            int codigo = Integer.parseInt(JTFCodigo.getText());
            String descripcion = JTFDescripcion.getText();
            int precio = Integer.parseInt(JTFPrecio.getText());
            Categoria rubro = (Categoria) JCBRubro.getSelectedItem();
            int stock = (Integer) JSStock.getValue();
            Producto prod = new Producto(codigo, descripcion, precio, stock, rubro);
            listaProductos.add(prod);
            tabla.addRow(new Object[]{codigo, descripcion, precio, rubro, stock});
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El precio agregado es incorrecto.");
        } finally {
            JBGuardar.setEnabled(false);
        }

    }//GEN-LAST:event_JBGuardarActionPerformed

    private void JBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBActualizarActionPerformed
        // TODO add your handling code here:
        int fila = jTable1.getSelectedRow();

        if (fila != -1) {
            try {
                int codigo = Integer.parseInt(JTFCodigo.getText());
                String descripcion = JTFDescripcion.getText();
                int precio = Integer.parseInt(JTFPrecio.getText());
                Categoria rubro = (Categoria) JCBRubro.getSelectedItem();
                int stock = (Integer) JSStock.getValue();

                for (Producto prod : listaProductos) {
                    if (prod.getCodigo() == codigo) {
                        prod.setDescripcion(descripcion);
                        prod.setPrecio(precio);
                        prod.setRubro(rubro);
                        prod.setStock(stock);
                        break;
                    }
                }
                jTable1.setValueAt(codigo, fila, 0);
                jTable1.setValueAt(descripcion, fila, 1);
                jTable1.setValueAt(precio, fila, 2);
                jTable1.setValueAt(rubro, fila, 3);
                jTable1.setValueAt(stock, fila, 4);
                JOptionPane.showMessageDialog(null, "Se actualizo correctamente.");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El precio agregado es incorrecto.");
            }

        }
    }//GEN-LAST:event_JBActualizarActionPerformed

    private void JBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarActionPerformed
        // TODO add your handling code here:
        tabla.setRowCount(0);
        int cod = Integer.parseInt(JTFCodigo.getText());
        for (Producto prod : listaProductos) {
            if (prod.getCodigo() == cod) {
                tabla.addRow(new Object[]{prod.getCodigo(), prod.getDescripcion(), prod.getPrecio(), prod.getRubro(), prod.getStock()});
            }
        }

    }//GEN-LAST:event_JBBuscarActionPerformed

    private void JBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEliminarActionPerformed
        // TODO add your handling code here:
        int fila = jTable1.getSelectedRow();
        if (fila != -1) {
            int codigo = Integer.parseInt(JTFCodigo.getText());
            for (Producto prod : listaProductos) {
                if (prod.getCodigo() == codigo) {
                    listaProductos.remove(prod);
                    //tabla.setRowCount(0);
                    ((DefaultTableModel) jTable1.getModel()).removeRow(fila);
                    JOptionPane.showMessageDialog(null, "El producto se elimino correctamente.");
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "El producto no se encontro.");
                }
            }
        }
    }//GEN-LAST:event_JBEliminarActionPerformed
    public void llenarCombo() {
        for (Categoria cat : Categoria.values()) {
            JCBCategorias.addItem(cat);
        }
        for (Categoria cat : Categoria.values()) {
            JCBRubro.addItem(cat);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBActualizar;
    private javax.swing.JButton JBBuscar;
    private javax.swing.JButton JBCerrar;
    private javax.swing.JButton JBEliminar;
    private javax.swing.JButton JBGuardar;
    private javax.swing.JButton JBNuevo;
    private javax.swing.JComboBox<Categoria> JCBCategorias;
    private javax.swing.JComboBox<Categoria> JCBRubro;
    private javax.swing.JPanel JPANEL2;
    private javax.swing.JSpinner JSStock;
    private javax.swing.JTextField JTFCodigo;
    private javax.swing.JTextField JTFDescripcion;
    private javax.swing.JTextField JTFPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    //metodo para validar campos , todos los campos debebn estar llenos para buscar el producto
    public boolean validarCamposVacios(JPanel jpanel) {
        boolean valido = true;

        for (Component c : jpanel.getComponents()) {
            if (c instanceof JTextField) {
                JTextField caja = (JTextField) c;
                if (caja.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(jpanel, "Los campos no pueden estar vacíos.", "Error", JOptionPane.ERROR_MESSAGE);
                    caja.requestFocus();
                    valido = false;
                    break;
                }
            } else if (c instanceof JComboBox) {
                JComboBox<?> combo = (JComboBox<?>) c;
                if (combo.getSelectedIndex() == -1) {
                    JOptionPane.showMessageDialog(jpanel, "Seleccione un rubro.", "Error", JOptionPane.ERROR_MESSAGE);
                    combo.requestFocus();
                    valido = false;
                    break;
                }
            } else if (c instanceof JSpinner) {
                JSpinner spinner = (JSpinner) c;
                if ((Integer) spinner.getValue() <= 0) {
                    JOptionPane.showMessageDialog(jpanel, "El stock debe ser mayor a 0.", "Error", JOptionPane.ERROR_MESSAGE);
                    spinner.requestFocus();
                    valido = false;
                }
            }
        }

        return valido;
    }  //metodo para vaciar campos, puede servir para el boton guardar o actualizar,deues de guardar  
//deja los campos en blanco//

    public void vaciarCampos(JPanel jpanel) {
        for (Component c : jpanel.getComponents()) {
            if (c instanceof JTextField) {
                JTextField caja = (JTextField) c;
                caja.setText("");
            } else if (c instanceof JComboBox) {
                JComboBox<?> combo = (JComboBox<?>) c;
                combo.setSelectedIndex(-1);
            } else if (c instanceof JSpinner) {
                JSpinner spinner = (JSpinner) c;
                spinner.setValue(1);

            }
        }

    }
}
