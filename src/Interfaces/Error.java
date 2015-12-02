/**
 *
 * @author  Alan Asmis
 * @author Franco Cafferata
 */
package Interfaces;

import java.awt.Color;
import java.awt.Frame;


public class Error extends javax.swing.JDialog {


    public Error(java.awt.Frame parent,boolean modal,String camposError ) {
        super(parent, modal);
        initComponents();
        getContentPane().setBackground(Color.DARK_GRAY);
        informacionError.setText(camposError);
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        informacionError = new javax.swing.JLabel();
        tituloPrincipal = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(500, 230));
        setPreferredSize(new java.awt.Dimension(500, 230));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        informacionError.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        informacionError.setForeground(new java.awt.Color(255, 255, 255));
        informacionError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(informacionError, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 500, 30));

        tituloPrincipal.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        tituloPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        tituloPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloPrincipal.setText("ERROR");
        getContentPane().add(tituloPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 500, -1));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel informacionError;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel tituloPrincipal;
    // End of variables declaration//GEN-END:variables
}
