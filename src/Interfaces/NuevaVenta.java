
package Interfaces;

import java.awt.Color;

import Entidades.Producto;
import javax.swing.table.DefaultTableModel;

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
        finalizarVenta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        barraCantidad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModalityType(java.awt.Dialog.ModalityType.TOOLKIT_MODAL);
        setPreferredSize(new java.awt.Dimension(500, 491));
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
        getContentPane().add(botonAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, 30));

        tablaVenta.setBackground(new java.awt.Color(0, 0, 0));
        tablaVenta.setForeground(new java.awt.Color(255, 255, 255));
        tablaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DESCRIPCION", "CANTIDAD", "PRECIO UNITARIO", "TOTAL"
            }
        ));
        tablaVenta.setPreferredSize(new java.awt.Dimension(300, 398));
        jScrollPane1.setViewportView(tablaVenta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 470, 230));

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NUEVA VENTA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 500, 30));

        finalizarVenta.setBackground(new java.awt.Color(102, 102, 102));
        finalizarVenta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        finalizarVenta.setForeground(new java.awt.Color(255, 255, 255));
        finalizarVenta.setText("TERMINAR VENTA");
        finalizarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarVentaActionPerformed(evt);
            }
        });
        getContentPane().add(finalizarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 270, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CANTIDAD");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 160, -1));

        barraCantidad.setBackground(new java.awt.Color(0, 0, 0));
        barraCantidad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        barraCantidad.setForeground(new java.awt.Color(255, 255, 255));
        barraCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barraCantidadActionPerformed(evt);
            }
        });
        getContentPane().add(barraCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 200, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarProductoActionPerformed

        int codigoBuscado = 0;
        int cantidadVendida = 0;
        codigoBuscado = Integer.parseInt(barraCodigoProducto.getText());
        cantidadVendida = Integer.parseInt(barraCantidad.getText());
        Producto nuevoProducto = Seguridad.Archivo.ventaProducto(codigoBuscado,cantidadVendida);
        
        if (nuevoProducto != null){
            DefaultTableModel modelo=(DefaultTableModel) tablaVenta.getModel();    
            String arreglo [] = new String[4];
    
            arreglo[0] = nuevoProducto.getNombre();
            arreglo[1] = barraCantidad.getText();
            arreglo[2] = Double.toString(nuevoProducto.getPrecio());
            arreglo[3] = Double.toString(nuevoProducto.getPrecio() * Integer.parseInt(barraCantidad.getText()));
            modelo.addRow(arreglo);
            tablaVenta.setModel(modelo);
            barraCodigoProducto.setText("");
            barraCantidad.setText("");
        
        
    }
        
    }//GEN-LAST:event_botonAgregarProductoActionPerformed

    private void finalizarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finalizarVentaActionPerformed

    private void barraCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barraCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barraCantidadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField barraCantidad;
    private javax.swing.JTextField barraCodigoProducto;
    private javax.swing.JButton botonAgregarProducto;
    private javax.swing.JButton finalizarVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaVenta;
    // End of variables declaration//GEN-END:variables
}
