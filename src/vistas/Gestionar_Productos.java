
package vistas;

import java.awt.Component;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;


public class Gestionar_Productos extends javax.swing.JInternalFrame {

 private JComboBox<String> JBRUBRO;
    public Gestionar_Productos() {
       
        initComponents();
        
        setTitle("Gestión de Productos");
        setPreferredSize(new java.awt.Dimension(400, 300));  // Ajusta el tamaño
        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        
        
        /* JBRUBRO.addItem("Perfumería");
        JBRUBRO.addItem("Comestibles");
        JBRUBRO.addItem("Limpieza")*/

       

       

       
    }
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JCCATEGORIA = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JBNUEVO = new javax.swing.JButton();
        JBGUARDAR = new javax.swing.JButton();
        JBELIMINAR = new javax.swing.JButton();
        JBACTUALIZAR = new javax.swing.JButton();
        JBCERRAR = new javax.swing.JButton();
        JPANEL2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        JCRUBRO = new javax.swing.JComboBox<>();
        JSSTOCK = new javax.swing.JSpinner();
        JTdescripcion = new javax.swing.JTextField();
        JTcodigo = new javax.swing.JTextField();
        JTPrecio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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

        JCCATEGORIA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JCCATEGORIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCCATEGORIAActionPerformed(evt);
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

        JBNUEVO.setBackground(new java.awt.Color(0, 204, 102));
        JBNUEVO.setText("NUEVO");

        JBGUARDAR.setBackground(new java.awt.Color(0, 153, 153));
        JBGUARDAR.setText("GUARDAR");

        JBELIMINAR.setBackground(new java.awt.Color(204, 0, 0));
        JBELIMINAR.setText("ELIMINAR");

        JBACTUALIZAR.setBackground(new java.awt.Color(0, 51, 0));
        JBACTUALIZAR.setText("Actualizar");

        JBCERRAR.setBackground(new java.awt.Color(0, 102, 51));
        JBCERRAR.setForeground(new java.awt.Color(204, 255, 204));
        JBCERRAR.setText("CERRAR");

        jLabel12.setText("Stock");

        jLabel8.setText("Codigo");

        jLabel9.setText("Descripcion");

        jLabel10.setText("Precio");

        jLabel11.setText("Rubro");

        JCRUBRO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JCRUBRO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JCRUBROMouseClicked(evt);
            }
        });
        JCRUBRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCRUBROActionPerformed(evt);
            }
        });

        JSSTOCK.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                JSSTOCKStateChanged(evt);
            }
        });
        JSSTOCK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JSSTOCKMouseClicked(evt);
            }
        });

        JTdescripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTdescripcionFocusLost(evt);
            }
        });
        JTdescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTdescripcionActionPerformed(evt);
            }
        });

        JTcodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTcodigoFocusLost(evt);
            }
        });
        JTcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTcodigoActionPerformed(evt);
            }
        });

        JTPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTPrecioActionPerformed(evt);
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
                        .addComponent(JTdescripcion))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPANEL2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(36, 36, 36)
                        .addComponent(JTcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPANEL2Layout.createSequentialGroup()
                        .addGroup(JPANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(39, 39, 39)
                        .addGroup(JPANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JSSTOCK, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JCRUBRO, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        JPANEL2Layout.setVerticalGroup(
            JPANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPANEL2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(JTcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(JTdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(JTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(JPANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(JCRUBRO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(JSSTOCK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Gestión de Productos");

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("FILTRAR POR CATEGORIAS:");

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
                        .addGap(60, 60, 60)
                        .addComponent(JPANEL2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JBCERRAR))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel2)
                        .addGap(46, 46, 46)
                        .addComponent(JCCATEGORIA, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JBNUEVO)
                        .addGap(18, 18, 18)
                        .addComponent(JBGUARDAR)
                        .addGap(18, 18, 18)
                        .addComponent(JBACTUALIZAR)
                        .addGap(38, 38, 38)
                        .addComponent(JBELIMINAR)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JCCATEGORIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(JPANEL2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(JBCERRAR)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBNUEVO)
                    .addComponent(JBGUARDAR)
                    .addComponent(JBACTUALIZAR)
                    .addComponent(JBELIMINAR))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void JCCATEGORIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCCATEGORIAActionPerformed
       validarCamposVacios(JPANEL2);
    }//GEN-LAST:event_JCCATEGORIAActionPerformed

    private void JTcodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTcodigoFocusLost
      
    }//GEN-LAST:event_JTcodigoFocusLost

    private void JTdescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTdescripcionActionPerformed
       
    }//GEN-LAST:event_JTdescripcionActionPerformed

    private void JTPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTPrecioActionPerformed
        
    }//GEN-LAST:event_JTPrecioActionPerformed

    private void JCRUBROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCRUBROActionPerformed
        
        
    }//GEN-LAST:event_JCRUBROActionPerformed

    private void JTdescripcionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTdescripcionFocusLost
       
    }//GEN-LAST:event_JTdescripcionFocusLost

    private void JSSTOCKStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_JSSTOCKStateChanged
        
    }//GEN-LAST:event_JSSTOCKStateChanged

    private void JCRUBROMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JCRUBROMouseClicked
        
    }//GEN-LAST:event_JCRUBROMouseClicked

    private void JSSTOCKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JSSTOCKMouseClicked
        
    }//GEN-LAST:event_JSSTOCKMouseClicked

    private void JTcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTcodigoActionPerformed
        
    }//GEN-LAST:event_JTcodigoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBACTUALIZAR;
    private javax.swing.JButton JBCERRAR;
    private javax.swing.JButton JBELIMINAR;
    private javax.swing.JButton JBGUARDAR;
    private javax.swing.JButton JBNUEVO;
    private javax.swing.JComboBox<String> JCCATEGORIA;
    private javax.swing.JComboBox<String> JCRUBRO;
    private javax.swing.JPanel JPANEL2;
    private javax.swing.JSpinner JSSTOCK;
    private javax.swing.JTextField JTPrecio;
    private javax.swing.JTextField JTcodigo;
    private javax.swing.JTextField JTdescripcion;
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

    //metodo para validar campos
    public boolean validarCamposVacios(JPanel  jpanel) {
    boolean valido = true;

    for (Component c : jpanel.getComponents()) {
        if (c instanceof JTextField) {
            JTextField caja = (JTextField) c;
            if (caja.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(jpanel, "Los campos no pueden estar vacíos.", "Error", JOptionPane.ERROR_MESSAGE);
                caja.requestFocus();
                valido = false;
            }
        } else if (c instanceof JComboBox) {
            JComboBox<?> combo = (JComboBox<?>) c;
            if (combo.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(jpanel, "Seleccione un rubro.", "Error", JOptionPane.ERROR_MESSAGE);
                combo.requestFocus();
                valido = false;
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
}  //metodo para vaciar campos//

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

