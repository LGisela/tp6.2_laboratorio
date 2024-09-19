
package vistas;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JInternalFrame;


public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(true);       
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMENUADMI = new javax.swing.JMenu();
        gestion_prod_menuItem = new javax.swing.JMenuItem();
        JMENUCONSULTA = new javax.swing.JMenu();
        cons_nombre_menuItem = new javax.swing.JMenuItem();
        cons_precio_menuItem = new javax.swing.JMenuItem();
        cons_rubro_menuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setPreferredSize(new java.awt.Dimension(920, 730));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 615, Short.MAX_VALUE)
        );

        JMENUADMI.setText("Administración");
        JMENUADMI.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        JMENUADMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMENUADMIActionPerformed(evt);
            }
        });

        gestion_prod_menuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        gestion_prod_menuItem.setText("Gestión de Productos");
        gestion_prod_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestion_prod_menuItemActionPerformed(evt);
            }
        });
        JMENUADMI.add(gestion_prod_menuItem);

        jMenuBar1.add(JMENUADMI);

        JMENUCONSULTA.setText("Consultas");
        JMENUCONSULTA.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        JMENUCONSULTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMENUCONSULTAActionPerformed(evt);
            }
        });

        cons_nombre_menuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        cons_nombre_menuItem.setText("Por nombre");
        cons_nombre_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cons_nombre_menuItemActionPerformed(evt);
            }
        });
        JMENUCONSULTA.add(cons_nombre_menuItem);

        cons_precio_menuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        cons_precio_menuItem.setText("Por precio");
        cons_precio_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cons_precio_menuItemActionPerformed(evt);
            }
        });
        JMENUCONSULTA.add(cons_precio_menuItem);

        cons_rubro_menuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        cons_rubro_menuItem.setText("Por rubro");
        cons_rubro_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cons_rubro_menuItemActionPerformed(evt);
            }
        });
        JMENUCONSULTA.add(cons_rubro_menuItem);

        jMenuBar1.add(JMENUCONSULTA);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gestion_prod_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestion_prod_menuItemActionPerformed
     
        
  mostrarGestionarProductos();
           
         
    }//GEN-LAST:event_gestion_prod_menuItemActionPerformed

    private void cons_rubro_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cons_rubro_menuItemActionPerformed
        openInternalFrame(new listadoporrubro());
        
    
    }//GEN-LAST:event_cons_rubro_menuItemActionPerformed

    private void cons_nombre_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cons_nombre_menuItemActionPerformed
        openInternalFrame(new listadopornombre());
        
  
    }//GEN-LAST:event_cons_nombre_menuItemActionPerformed

    private void cons_precio_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cons_precio_menuItemActionPerformed
          openInternalFrame(new listadoporprecio());
    }//GEN-LAST:event_cons_precio_menuItemActionPerformed

    private void JMENUCONSULTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMENUCONSULTAActionPerformed
        
    }//GEN-LAST:event_JMENUCONSULTAActionPerformed

    private void JMENUADMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMENUADMIActionPerformed
        
    }//GEN-LAST:event_JMENUADMIActionPerformed

    private void openInternalFrame(JInternalFrame frame) {
        
        for (JInternalFrame existingFrame : escritorio.getAllFrames()) {
            if (existingFrame.getTitle().equals(frame.getTitle())) {
                try {
                    existingFrame.setSelected(true);
                } catch (java.beans.PropertyVetoException ex) {
                    ex.printStackTrace();
                }
                return;
             }
        }
        
        escritorio.add(frame);
        frame.setVisible(true);
        try {
            frame.setSelected(true);
        } catch (java.beans.PropertyVetoException ex) {
            ex.printStackTrace();
        
           }
        
        
        }
   private void mostrarGestionarProductos() {
    for (JInternalFrame frame : escritorio.getAllFrames()) {
        if (frame instanceof Gestionar_Productos) {
            frame.toFront(); // Lleva el frame al frente
            try {
                frame.setSelected(true); // Selecciona el frame
            } catch (java.beans.PropertyVetoException ex) {
                ex.printStackTrace();
            }
            return; // Sale si ya existe
        }
    }

    // Si no existe, crea uno nuevo
    Gestionar_Productos gestionarProductos = new Gestionar_Productos();
    escritorio.add(gestionarProductos);
    gestionarProductos.setVisible(true);
    try {
        gestionarProductos.setSelected(true);
    } catch (java.beans.PropertyVetoException ex) {
        ex.printStackTrace();
    }
    }
    
    
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
    private javax.swing.JMenu JMENUADMI;
    private javax.swing.JMenu JMENUCONSULTA;
    private javax.swing.JMenuItem cons_nombre_menuItem;
    private javax.swing.JMenuItem cons_precio_menuItem;
    private javax.swing.JMenuItem cons_rubro_menuItem;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem gestion_prod_menuItem;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
