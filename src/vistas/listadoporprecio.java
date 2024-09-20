package vistas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import productos.Producto;

/**
 *
 * @author HP-PAVILION
 */
public class listadoporprecio extends javax.swing.JInternalFrame {

    DefaultTableModel tabla = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public listadoporprecio() {
        initComponents();
        String[] productos = {"Codigo", "Descripcion", "Precio", "Categoria", "Stock"};
        tabla.setColumnIdentifiers(productos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JTPrecioMin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTPrecioMax = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTablaPrecio = new javax.swing.JTable();
        JBBUSCAR = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 51, 51));
        setClosable(true);
        setMaximizable(true);
        setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("     LISTADO POR PRECIO ");

        jLabel2.setText("Entre $");

        JTPrecioMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTPrecioMinActionPerformed(evt);
            }
        });
        JTPrecioMin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTPrecioMinKeyReleased(evt);
            }
        });

        jLabel3.setText(" y");

        JTPrecioMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTPrecioMaxActionPerformed(evt);
            }
        });
        JTPrecioMax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTPrecioMaxKeyReleased(evt);
            }
        });

        JTablaPrecio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "DESCRIPCION", "PRECIO", "CATEGORIA", "STOCK"
            }
        ));
        jScrollPane1.setViewportView(JTablaPrecio);

        JBBUSCAR.setText("BUSCAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTPrecioMin, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(34, 34, 34)
                        .addComponent(JTPrecioMax, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 86, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBBUSCAR)
                .addGap(8, 8, 8))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTPrecioMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(JTPrecioMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(JBBUSCAR)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTPrecioMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTPrecioMinActionPerformed

    }//GEN-LAST:event_JTPrecioMinActionPerformed

    private void JTPrecioMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTPrecioMaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTPrecioMaxActionPerformed

    private void JTPrecioMinKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTPrecioMinKeyReleased
        //validarCamposPrecios();
        filtrarPorPrecios();
    }//GEN-LAST:event_JTPrecioMinKeyReleased

    private void JTPrecioMaxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTPrecioMaxKeyReleased
        //validarCamposPrecios();
        filtrarPorPrecios();

    }//GEN-LAST:event_JTPrecioMaxKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBBUSCAR;
    private javax.swing.JTextField JTPrecioMax;
    private javax.swing.JTextField JTPrecioMin;
    private javax.swing.JTable JTablaPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

// private boolean validarCamposPrecios() {
//        String precioMinimo = JTPrecioMin.getText().trim();
//        String precioMaximo = JTPrecioMax.getText().trim();
//
//        if (precioMinimo.isEmpty() && precioMaximo.isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Los campos de precio mínimo y máximo no pueden estar vacíos.", "Error", JOptionPane.ERROR_MESSAGE);
//            return false;
//        }
//
//        if (!precioMinimo.matches("\\d+(\\.\\d+)?") || !precioMaximo.matches("\\d+(\\.\\d+)?")) {
//            JOptionPane.showMessageDialog(this, "Por favor, ingrese solo números en los campos de precio.", "Error", JOptionPane.ERROR_MESSAGE);
//            return false;
//        }
//
//        return true;
//    }
    private void filtrarPorPrecios() {
        tabla = (DefaultTableModel) JTablaPrecio.getModel();
        tabla.setRowCount(0);

        try {
            int precioMin = Integer.parseInt(JTPrecioMin.getText());
            int precioMax = Integer.parseInt(JTPrecioMax.getText());

            for (Producto prod : Gestionar_Productos.listaProductos) {
                if (prod.getPrecio() >= precioMin && prod.getPrecio() <= precioMax) {
                    tabla.addRow(new Object[]{prod.getCodigo(), prod.getDescripcion(), prod.getPrecio(), prod.getRubro(), prod.getStock()});
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese solo números en los campos de precio.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
