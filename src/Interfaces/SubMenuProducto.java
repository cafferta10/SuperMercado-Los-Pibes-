
package Interfaces;

import java.awt.Color;

/**
 *
 * @author Caffia
 */
public class SubMenuProducto extends javax.swing.JDialog {

    /**
     * Creates new form SubMenuProducto
     */
    public SubMenuProducto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getContentPane().setBackground(Color.DARK_GRAY);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonAgregarProducto = new javax.swing.JButton();
        botonModificarProducto = new javax.swing.JButton();
        botonQuitarProducto = new javax.swing.JButton();
        tituloPrincipal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProducto = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setPreferredSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonAgregarProducto.setBackground(new java.awt.Color(102, 102, 102));
        botonAgregarProducto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonAgregarProducto.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregarProducto.setText("AGREGAR");
        botonAgregarProducto.setMaximumSize(new java.awt.Dimension(110, 27));
        botonAgregarProducto.setMinimumSize(new java.awt.Dimension(110, 27));
        botonAgregarProducto.setPreferredSize(new java.awt.Dimension(110, 27));
        botonAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(botonAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 220, 40));

        botonModificarProducto.setBackground(new java.awt.Color(102, 102, 102));
        botonModificarProducto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonModificarProducto.setForeground(new java.awt.Color(255, 255, 255));
        botonModificarProducto.setText("MODIFICAR");
        getContentPane().add(botonModificarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 220, 40));

        botonQuitarProducto.setBackground(new java.awt.Color(102, 102, 102));
        botonQuitarProducto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonQuitarProducto.setForeground(new java.awt.Color(255, 255, 255));
        botonQuitarProducto.setText("QUITAR");
        botonQuitarProducto.setMaximumSize(new java.awt.Dimension(110, 27));
        botonQuitarProducto.setMinimumSize(new java.awt.Dimension(110, 27));
        botonQuitarProducto.setPreferredSize(new java.awt.Dimension(110, 27));
        getContentPane().add(botonQuitarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 450, 40));

        tituloPrincipal.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        tituloPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        tituloPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloPrincipal.setText("PRODUCTOS");
        getContentPane().add(tituloPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 500, -1));

        tablaProducto.setBackground(new java.awt.Color(0, 0, 0));
        tablaProducto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tablaProducto.setForeground(new java.awt.Color(255, 255, 255));
        tablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "TIPO", "MARCA", "ID", "PRECIO UNITARIO", "STOCK"
            }
        ));
        tablaProducto.setPreferredSize(new java.awt.Dimension(300, 300));
        jScrollPane1.setViewportView(tablaProducto);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 440, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarProductoActionPerformed
        NuevoProducto nuevo = new NuevoProducto (new javax.swing.JFrame(), true);
        nuevo.setVisible(true);
    }//GEN-LAST:event_botonAgregarProductoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SubMenuProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubMenuProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubMenuProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubMenuProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SubMenuProducto dialog = new SubMenuProducto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarProducto;
    private javax.swing.JButton botonModificarProducto;
    private javax.swing.JButton botonQuitarProducto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProducto;
    private javax.swing.JLabel tituloPrincipal;
    // End of variables declaration//GEN-END:variables
}
