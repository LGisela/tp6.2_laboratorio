package vistas;

import javax.swing.table.DefaultTableModel;
import productos.Producto;

public class listadopornombre extends javax.swing.JInternalFrame {

    DefaultTableModel tabla = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public listadopornombre() {
        initComponents();
        String[] productos = {"Codigo", "Descripcion", "Precio", "Categoria", "Stock"};
        tabla.setColumnIdentifiers(productos);
        JTNombre.setModel(tabla);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JTFDescripcion = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTNombre = new javax.swing.JTable();

        setBackground(new java.awt.Color(153, 204, 255));
        setClosable(true);
        setMaximizable(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setVisible(true);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("LISTADO POR NOMBRE ");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("INGRESE DESCRIPCION");

        JTFDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTFDescripcionKeyReleased(evt);
            }
        });

        JTNombre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "DESCRPCION", "PRECIO", "CATEGORIA", "STOCK"
            }
        ));
        jScrollPane2.setViewportView(JTNombre);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(42, 42, 42)
                .addComponent(JTFDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFDescripcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFDescripcionKeyReleased
        // TODO add your handling code here:
        tabla = (DefaultTableModel) JTNombre.getModel();
        tabla.setRowCount(0);
        
        for (Producto prod : Gestionar_Productos.listaProductos) {
            if (prod.getDescripcion().toLowerCase().startsWith(JTFDescripcion.getText().toLowerCase())) {
                tabla.addRow(new Object[]{prod.getCodigo(), prod.getDescripcion(), prod.getPrecio(), prod.getRubro(), prod.getStock()});
            }
        }
    }//GEN-LAST:event_JTFDescripcionKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTFDescripcion;
    private javax.swing.JTable JTNombre;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

   
}
