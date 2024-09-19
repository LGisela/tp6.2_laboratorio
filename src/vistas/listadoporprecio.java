
package vistas;

import javax.swing.JOptionPane;

/**
 *
 * @author HP-PAVILION
 */
public class listadoporprecio extends javax.swing.JInternalFrame {

    /**
     * Creates new form listadoporprecio
     */
    public listadoporprecio() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JTPRECIOMIN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTPRECIOMAX = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTABLEPRECIO = new javax.swing.JTable();
        JBBUSCAR = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 51, 51));
        setClosable(true);
        setMaximizable(true);
        setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("     LISTADO POR PRECIO ");

        jLabel2.setText("Entre $");

        JTPRECIOMIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTPRECIOMINActionPerformed(evt);
            }
        });
        JTPRECIOMIN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTPRECIOMINKeyReleased(evt);
            }
        });

        jLabel3.setText(" y");

        JTPRECIOMAX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTPRECIOMAXActionPerformed(evt);
            }
        });
        JTPRECIOMAX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTPRECIOMAXKeyReleased(evt);
            }
        });

        JTABLEPRECIO.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(JTABLEPRECIO);

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
                        .addComponent(JTPRECIOMIN, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(34, 34, 34)
                        .addComponent(JTPRECIOMAX, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(JTPRECIOMIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(JTPRECIOMAX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(JBBUSCAR)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTPRECIOMINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTPRECIOMINActionPerformed
        
    }//GEN-LAST:event_JTPRECIOMINActionPerformed

    private void JTPRECIOMAXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTPRECIOMAXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTPRECIOMAXActionPerformed

    private void JTPRECIOMINKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTPRECIOMINKeyReleased
        validarCamposPrecios();
    }//GEN-LAST:event_JTPRECIOMINKeyReleased

    private void JTPRECIOMAXKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTPRECIOMAXKeyReleased
        validarCamposPrecios();
    }//GEN-LAST:event_JTPRECIOMAXKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBBUSCAR;
    private javax.swing.JTable JTABLEPRECIO;
    private javax.swing.JTextField JTPRECIOMAX;
    private javax.swing.JTextField JTPRECIOMIN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

 private boolean validarCamposPrecios() {
        String precioMinimo = JTPRECIOMIN.getText().trim();
        String precioMaximo = JTPRECIOMAX.getText().trim();

        if (precioMinimo.isEmpty() || precioMaximo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Los campos de precio mínimo y máximo no pueden estar vacíos.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (!precioMinimo.matches("\\d+(\\.\\d+)?") || !precioMaximo.matches("\\d+(\\.\\d+)?")) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese solo números en los campos de precio.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }
}
