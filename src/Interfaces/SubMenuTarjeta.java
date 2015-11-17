
package Interfaces;

import Entidades.Tarjeta;
import java.awt.Color;
import Seguridad.Archivo;
import com.csvreader.CsvReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class SubMenuTarjeta extends javax.swing.JDialog {

    /**
     * Creates new form SubMenuTarjeta
     */
    public SubMenuTarjeta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getContentPane().setBackground(Color.DARK_GRAY);
        ArrayList listaTarjeta = Seguridad.Archivo.listaTarjeta();
        DefaultTableModel modelo=(DefaultTableModel) tablaTarjeta.getModel();       
        Tarjeta arreglo [] = new Tarjeta[listaTarjeta.size()];
        tablaTarjeta.setModel(modelo);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nuevaTarjeta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTarjeta = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nuevaTarjeta.setBackground(new java.awt.Color(102, 102, 102));
        nuevaTarjeta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nuevaTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        nuevaTarjeta.setText("NUEVA TARJETA");
        nuevaTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaTarjetaActionPerformed(evt);
            }
        });
        getContentPane().add(nuevaTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 440, 40));

        tablaTarjeta.setBackground(new java.awt.Color(0, 0, 0));
        tablaTarjeta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tablaTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        tablaTarjeta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "CODIGO", "PUNTOS"
            }
        ));
        jScrollPane1.setViewportView(tablaTarjeta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 90, 450, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevaTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaTarjetaActionPerformed
        String codigo;
        int puntos;
        int cantidad = 0;
        try {
            

			
		
			
            CsvReader tarjeta_import = new CsvReader("test/archivo_tarjeta.csv");     
           
            while (tarjeta_import.readRecord()){
                cantidad ++;
            }
            
            
            codigo = Integer.toString(cantidad);
            puntos = 0;                
            tarjeta_import.close();
            
            Tarjeta tarjeta = new Tarjeta (codigo,puntos);
        
        Archivo.nuevaTarjeta(tarjeta);
                
			
			
	} 
        catch (FileNotFoundException e) {
            e.printStackTrace();
            } 
        catch (IOException e) {
            e.printStackTrace();
            }
        
        
        
    }//GEN-LAST:event_nuevaTarjetaActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nuevaTarjeta;
    private javax.swing.JTable tablaTarjeta;
    // End of variables declaration//GEN-END:variables
}
