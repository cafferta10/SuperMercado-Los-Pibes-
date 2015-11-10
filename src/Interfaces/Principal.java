
package Interfaces;


/**
 *
 * @author Franco
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        subMenuTarjeta = new javax.swing.JButton();
        subMenuVenta = new javax.swing.JButton();
        subMenuProducto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.darkGray);
        setPreferredSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subMenuTarjeta.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        subMenuTarjeta.setText("TARJETA");
        subMenuTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuTarjetaActionPerformed(evt);
            }
        });
        getContentPane().add(subMenuTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 270, -1));

        subMenuVenta.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        subMenuVenta.setText("VENTA");
        subMenuVenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        subMenuVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuVentaActionPerformed(evt);
            }
        });
        getContentPane().add(subMenuVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 270, -1));

        subMenuProducto.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        subMenuProducto.setText("PRODUCTO");
        subMenuProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuProductoActionPerformed(evt);
            }
        });
        getContentPane().add(subMenuProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 270, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SUPERMERCADO LP");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 500, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subMenuProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuProductoActionPerformed
        System.exit(0);
    }//GEN-LAST:event_subMenuProductoActionPerformed

    private void subMenuVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuVentaActionPerformed
        SubMenuVenta nuevaVenta = new SubMenuVenta(new javax.swing.JFrame(), true);
        nuevaVenta.setVisible(true);
        
    }//GEN-LAST:event_subMenuVentaActionPerformed

    private void subMenuTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuTarjetaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_subMenuTarjetaActionPerformed


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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               Principal a = new Principal();
               a.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton subMenuProducto;
    private javax.swing.JButton subMenuTarjeta;
    private javax.swing.JButton subMenuVenta;
    // End of variables declaration//GEN-END:variables
}
