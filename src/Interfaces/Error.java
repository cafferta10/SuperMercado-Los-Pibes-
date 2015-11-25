
package Interfaces;


public class Error extends javax.swing.JPanel {


    public Error(java.awt.Dialog parent,String camposError ) {
        initComponents();
        informacionError.setText(camposError);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        informacionError = new javax.swing.JLabel();
        tituloPrincipal = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        informacionError.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        informacionError.setForeground(new java.awt.Color(255, 255, 255));
        add(informacionError, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 124, 390, 30));

        tituloPrincipal.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        tituloPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        tituloPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloPrincipal.setText("ERROR");
        add(tituloPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 400, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel informacionError;
    private javax.swing.JLabel tituloPrincipal;
    // End of variables declaration//GEN-END:variables
}
