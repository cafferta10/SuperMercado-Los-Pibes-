
package Interfaces;

import java.awt.Color;


/**
 *
 * @author Franco
 */
public class MenuPrincipal extends javax.swing.JFrame {

    
    /**
     * Creates new form Principal
     */
    public MenuPrincipal() {
        initComponents();
        getContentPane().setBackground(Color.DARK_GRAY);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        subMenuTarjeta = new javax.swing.JButton();
        subMenuVenta = new javax.swing.JButton();
        subMenuProducto = new javax.swing.JButton();
        tituloPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.darkGray);
        setPreferredSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subMenuTarjeta.setBackground(new java.awt.Color(102, 102, 102));
        subMenuTarjeta.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        subMenuTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        subMenuTarjeta.setText("TARJETA");
        subMenuTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuTarjetaActionPerformed(evt);
            }
        });
        getContentPane().add(subMenuTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 270, -1));

        subMenuVenta.setBackground(new java.awt.Color(102, 102, 102));
        subMenuVenta.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        subMenuVenta.setForeground(new java.awt.Color(255, 255, 255));
        subMenuVenta.setText("VENTA");
        subMenuVenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        subMenuVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuVentaActionPerformed(evt);
            }
        });
        getContentPane().add(subMenuVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 270, -1));

        subMenuProducto.setBackground(new java.awt.Color(102, 102, 102));
        subMenuProducto.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        subMenuProducto.setForeground(new java.awt.Color(255, 255, 255));
        subMenuProducto.setText("PRODUCTO");
        subMenuProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuProductoActionPerformed(evt);
            }
        });
        getContentPane().add(subMenuProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 270, -1));

        tituloPrincipal.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        tituloPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        tituloPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloPrincipal.setText("SUPERMERCADO LP");
        getContentPane().add(tituloPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 500, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subMenuProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuProductoActionPerformed
        SubMenuProducto nuevoProducto = new SubMenuProducto (new javax.swing.JFrame(), true);
        nuevoProducto.setVisible(true);
    }//GEN-LAST:event_subMenuProductoActionPerformed

    private void subMenuVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuVentaActionPerformed
        SubMenuVenta nuevaVenta = new SubMenuVenta(new javax.swing.JFrame(), true);
        nuevaVenta.setVisible(true);
        
    }//GEN-LAST:event_subMenuVentaActionPerformed

    private void subMenuTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuTarjetaActionPerformed
        SubMenuTarjeta nuevaTarjeta = new SubMenuTarjeta(new javax.swing.JFrame(), true);
        nuevaTarjeta.setVisible(true);
    }//GEN-LAST:event_subMenuTarjetaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton subMenuProducto;
    private javax.swing.JButton subMenuTarjeta;
    private javax.swing.JButton subMenuVenta;
    private javax.swing.JLabel tituloPrincipal;
    // End of variables declaration//GEN-END:variables
}
