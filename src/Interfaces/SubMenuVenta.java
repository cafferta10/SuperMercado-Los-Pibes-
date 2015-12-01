
package Interfaces;

import Entidades.Linea;
import Entidades.Producto;
import Entidades.Venta;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Caffia
 */
public class SubMenuVenta extends javax.swing.JDialog {
    
    private List <Venta> listaVenta ;

    private Venta ventas;

    /**
     * Creates new form SubMenuVenta
     * @param parent
     * @param modal
     * @param lV
     */
    public SubMenuVenta(java.awt.Frame parent, boolean modal ,List <Venta> lV) {
        super(parent, modal);
        initComponents();
        getContentPane().setBackground(Color.DARK_GRAY);
        listaVenta = lV;
        inicializarTabla();
    }
    
    private void inicializarTabla(){
        DefaultTableModel modelo=(DefaultTableModel) tablaVenta.getModel();    
        String arreglo [] = new String[4];
        for(Venta n: listaVenta){
            arreglo[0] = Integer.toString(n.getIdFactura());
            arreglo[1] = "none";
            arreglo[2] = n.getFecha().toString();
            arreglo[3] = Double.toString(n.getTotal());
            modelo.addRow(arreglo);   
        }
        tablaVenta.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nuevaVenta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVenta = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setPreferredSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nuevaVenta.setBackground(new java.awt.Color(102, 102, 102));
        nuevaVenta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nuevaVenta.setForeground(new java.awt.Color(255, 255, 255));
        nuevaVenta.setText("Nueva Venta");
        nuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaVentaActionPerformed(evt);
            }
        });
        getContentPane().add(nuevaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 470, -1));

        tablaVenta.setBackground(new java.awt.Color(0, 0, 0));
        tablaVenta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tablaVenta.setForeground(new java.awt.Color(255, 255, 255));
        tablaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tarjeta", "Fecha", "Total"
            }
        ));
        tablaVenta.setPreferredSize(new java.awt.Dimension(375, 398));
        jScrollPane1.setViewportView(tablaVenta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 470, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaVentaActionPerformed
        NuevaVenta nueva = new NuevaVenta(new javax.swing.JFrame(), true);
        nueva.setVisible(true);
        if ( nueva.ventaRealizada() ){
            Venta n = new Venta(listaVenta.size() , nueva.getLineaVenta() , nueva.getTotal() , nueva.getTarjeta());
            listaVenta.add(n);
            DefaultTableModel modelo=(DefaultTableModel) tablaVenta.getModel();    
            String arreglo [] = new String[4];
            arreglo[0] = Integer.toString(n.getIdFactura());
            arreglo[1] = nueva.getTarjeta();
            arreglo[2] = n.getFecha().toString();
            arreglo[3] = Double.toString(n.getTotal());
            modelo.addRow(arreglo);
            tablaVenta.setModel(modelo);
        }
    }//GEN-LAST:event_nuevaVentaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nuevaVenta;
    private javax.swing.JTable tablaVenta;
    // End of variables declaration//GEN-END:variables
}
