
package Interfaces;

import java.awt.Color;

/**
 *
 * @author Caffia
 */
public class NuevaVenta extends javax.swing.JDialog {

    /**
     * Creates new form NuevaVenta
     */
    public NuevaVenta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getContentPane().setBackground(Color.DARK_GRAY);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraCodigoProducto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        botonAgregarProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVenta = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModalityType(java.awt.Dialog.ModalityType.TOOLKIT_MODAL);
        setPreferredSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraCodigoProducto.setBackground(new java.awt.Color(0, 0, 0));
        barraCodigoProducto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        barraCodigoProducto.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(barraCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 200, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CODIGO DEL PRODUCTO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 67, -1, 30));

        botonAgregarProducto.setBackground(new java.awt.Color(102, 102, 102));
        botonAgregarProducto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonAgregarProducto.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregarProducto.setText("ok");
        botonAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(botonAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, 30));

        tablaVenta.setBackground(new java.awt.Color(0, 0, 0));
        tablaVenta.setForeground(new java.awt.Color(255, 255, 255));
        tablaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DESCRIPCION", "CANTIDAD", "PRECIO UNITARIO", "TOTAL"
            }
        ));
        tablaVenta.setPreferredSize(new java.awt.Dimension(300, 398));
        jScrollPane1.setViewportView(tablaVenta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 470, 230));

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NUEVA VENTA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 500, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarProductoActionPerformed
        // TODO add your handling code here:
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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NuevaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NuevaVenta dialog = new NuevaVenta(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField barraCodigoProducto;
    private javax.swing.JButton botonAgregarProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaVenta;
    // End of variables declaration//GEN-END:variables
}
