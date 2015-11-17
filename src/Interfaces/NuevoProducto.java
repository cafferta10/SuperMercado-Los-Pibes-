/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entidades.Producto;
import Seguridad.Archivo;
import com.csvreader.CsvReader;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import Interfaces.SubMenuProducto;

/**
 *
 * @author Caffia
 */
public class NuevoProducto extends javax.swing.JDialog {

    /**
     * Creates new form NuevoProducto
     */
    public NuevoProducto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getContentPane().setBackground(Color.DARK_GRAY);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        botonAgregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        barraDescripcion = new javax.swing.JTextField();
        barraPrecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tituloPrincipal = new javax.swing.JLabel();
        barraStock = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Descripcion");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 90, -1));

        botonAgregar.setBackground(new java.awt.Color(102, 102, 102));
        botonAgregar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregar.setText("AGREGAR");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(botonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 210, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("STOCK");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 80, -1));

        barraDescripcion.setBackground(new java.awt.Color(0, 0, 0));
        barraDescripcion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        barraDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(barraDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 250, 30));

        barraPrecio.setBackground(new java.awt.Color(0, 0, 0));
        barraPrecio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        barraPrecio.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(barraPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 229, 250, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PRECIO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 80, -1));

        tituloPrincipal.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        tituloPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        tituloPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloPrincipal.setText("NUEVO PRODUCTO");
        getContentPane().add(tituloPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 500, -1));

        barraStock.setBackground(new java.awt.Color(0, 0, 0));
        barraStock.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        barraStock.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(barraStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 179, 250, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        int codigo = 0;
        String nombre = barraDescripcion.getText();
        int Stock = Integer.parseInt(barraStock.getText());
        int precio = Integer.parseInt(barraPrecio.getText());
        try {
            CsvReader producto_import = new CsvReader("test/archivo_producto.csv");     
           
            while (producto_import.readRecord()){
                codigo ++;
            }
            producto_import.close();
            
            
       
        Archivo.nuevoProducto(new Producto (nombre,Stock,precio,false,codigo));
        System.exit(0);
                
			
			
	} 
        catch (FileNotFoundException e) {
            e.printStackTrace();
            } 
        catch (IOException e) {
            e.printStackTrace();
            }
        
        
    }//GEN-LAST:event_botonAgregarActionPerformed

    

 
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
            java.util.logging.Logger.getLogger(NuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NuevoProducto dialog = new NuevoProducto(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField barraDescripcion;
    private javax.swing.JTextField barraPrecio;
    private javax.swing.JTextField barraStock;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel tituloPrincipal;
    // End of variables declaration//GEN-END:variables
}
