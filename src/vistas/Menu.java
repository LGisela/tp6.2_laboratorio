
package vistas;

import com.formdev.flatlaf.FlatLightLaf;


public class Menu extends javax.swing.JFrame {


    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        gestion_prod_menuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        cons_nombre_menuItem = new javax.swing.JMenuItem();
        cons_precio_menuItem = new javax.swing.JMenuItem();
        cons_rubro_menuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 951, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 765, Short.MAX_VALUE)
        );

        jMenu1.setText("Administración");

        gestion_prod_menuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        gestion_prod_menuItem.setText("Gestión de Productos");
        gestion_prod_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestion_prod_menuItemActionPerformed(evt);
            }
        });
        jMenu1.add(gestion_prod_menuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas");

        cons_nombre_menuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        cons_nombre_menuItem.setText("Por nombre");
        jMenu2.add(cons_nombre_menuItem);

        cons_precio_menuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        cons_precio_menuItem.setText("Por precio");
        jMenu2.add(cons_precio_menuItem);

        cons_rubro_menuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        cons_rubro_menuItem.setText("Por rubro");
        cons_rubro_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cons_rubro_menuItemActionPerformed(evt);
            }
        });
        jMenu2.add(cons_rubro_menuItem);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gestion_prod_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestion_prod_menuItemActionPerformed
        for (javax.swing.JInternalFrame frame : escritorio.getAllFrames()) {
            frame.dispose();
        }
        
        Gestionar_Productos iframe = new Gestionar_Productos();
        escritorio.add(iframe);
        iframe.setVisible(true);
    }//GEN-LAST:event_gestion_prod_menuItemActionPerformed

    private void cons_rubro_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cons_rubro_menuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cons_rubro_menuItemActionPerformed

    public static void main(String args[]) {
      FlatLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cons_nombre_menuItem;
    private javax.swing.JMenuItem cons_precio_menuItem;
    private javax.swing.JMenuItem cons_rubro_menuItem;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem gestion_prod_menuItem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
