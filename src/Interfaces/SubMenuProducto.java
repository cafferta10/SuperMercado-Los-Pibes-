
package Interfaces;

import Entidades.Producto;
import Seguridad.Archivo;
import com.csvreader.CsvReader;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author  Alan Asmis
 * @author Franco Cafferata
 */
public class SubMenuProducto extends javax.swing.JDialog {
    
    
    public SubMenuProducto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getContentPane().setBackground(Color.DARK_GRAY);
        cargarTabla();
        cargarBoxDescuento();
    }
    
    private void cargarBoxDescuento(){
        DescuentoBox.removeAllItems();
        DescuentoBox.addItem("Ninguno");
        DescuentoBox.addItem("Combo 3x2");
        DescuentoBox.addItem("Combo 8x6");
        DescuentoBox.addItem("25%");
        DescuentoBox.addItem("15%");
        DescuentoBox.addItem("10%");
        DescuentoBox.addItem("5%");
    }
    
     private  void cargarTabla(){
        ArrayList<Producto> listaProducto = Seguridad.Archivo.listaProducto();
        DefaultTableModel modelo= (DefaultTableModel) tablaProducto.getModel(); 
        modelo.setRowCount(0);
        String arreglo [] = new String[5];
        for (Producto datoProducto: listaProducto){
            arreglo[0] = Integer.toString(datoProducto.getCodigo());
            arreglo[1] = datoProducto.getNombre();
            arreglo[2] = Integer.toString(datoProducto.getStock());
            arreglo[3] = datoProducto.getPrecio().toString();
            arreglo[4] = datoProducto.getTipoPromocion();
            modelo.addRow(arreglo);
        }
        tablaProducto.setModel(modelo);
    }
     
     
     private void agregarTabla(Producto nuevoProducto){
        DefaultTableModel modelo=(DefaultTableModel) tablaProducto.getModel();    
        String arreglo [] = new String[5];
       
        arreglo[0] = Integer.toString(nuevoProducto.getCodigo());
        arreglo[1] = nuevoProducto.getNombre();
        arreglo[2] = Integer.toString(nuevoProducto.getStock());
        arreglo[3] = nuevoProducto.getPrecio().toString();
        arreglo[4] = nuevoProducto.getTipoPromocion();
        modelo.addRow(arreglo);
        tablaProducto.setModel(modelo);
        
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
        barraDescripcion = new javax.swing.JTextField();
        barraStock = new javax.swing.JTextField();
        barraPrecio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        botonModificarProducto1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        DescuentoBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(500, 500));
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
        getContentPane().add(botonAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, 20));

        botonModificarProducto.setBackground(new java.awt.Color(102, 102, 102));
        botonModificarProducto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonModificarProducto.setForeground(new java.awt.Color(255, 255, 255));
        botonModificarProducto.setText("MODIFICAR");
        botonModificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(botonModificarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 220, 20));

        botonQuitarProducto.setBackground(new java.awt.Color(102, 102, 102));
        botonQuitarProducto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonQuitarProducto.setForeground(new java.awt.Color(255, 255, 255));
        botonQuitarProducto.setText("ELIMINAR");
        botonQuitarProducto.setMaximumSize(new java.awt.Dimension(110, 27));
        botonQuitarProducto.setMinimumSize(new java.awt.Dimension(110, 27));
        botonQuitarProducto.setPreferredSize(new java.awt.Dimension(110, 27));
        botonQuitarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQuitarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(botonQuitarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 220, 20));

        tituloPrincipal.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        tituloPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        tituloPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloPrincipal.setText("PRODUCTOS");
        getContentPane().add(tituloPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        tablaProducto.setBackground(new java.awt.Color(0, 0, 0));
        tablaProducto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tablaProducto.setForeground(new java.awt.Color(255, 255, 255));
        tablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DESCRIPCION", "STOCK", "PRECIO UNITARIO", "DESCUENTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProducto.setPreferredSize(new java.awt.Dimension(300, 300));
        jScrollPane1.setViewportView(tablaProducto);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 440, 280));

        barraDescripcion.setBackground(new java.awt.Color(0, 0, 0));
        barraDescripcion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        barraDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        barraDescripcion.setCaretColor(new java.awt.Color(255, 255, 255));
        barraDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barraDescripcionActionPerformed(evt);
            }
        });
        getContentPane().add(barraDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 180, 30));

        barraStock.setBackground(new java.awt.Color(0, 0, 0));
        barraStock.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        barraStock.setForeground(new java.awt.Color(255, 255, 255));
        barraStock.setCaretColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(barraStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 90, 30));

        barraPrecio.setBackground(new java.awt.Color(0, 0, 0));
        barraPrecio.setForeground(new java.awt.Color(255, 255, 255));
        barraPrecio.setCaretColor(new java.awt.Color(255, 255, 255));
        barraPrecio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        barraPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barraPrecioActionPerformed(evt);
            }
        });
        getContentPane().add(barraPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 120, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DESCRIPCION");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 100, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PRECIO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 60, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("STOCK");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 60, 30));

        botonModificarProducto1.setBackground(new java.awt.Color(102, 102, 102));
        botonModificarProducto1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonModificarProducto1.setForeground(new java.awt.Color(255, 255, 255));
        botonModificarProducto1.setText("HISTORIAL");
        botonModificarProducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarProducto1ActionPerformed(evt);
            }
        });
        getContentPane().add(botonModificarProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 210, 20));
        botonModificarProducto1.getAccessibleContext().setAccessibleName("historial");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DESCUENTO");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 90, 30));

        DescuentoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(DescuentoBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 120, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregar(){
        String errorCampos = "";
        int codigo = Integer.parseInt(tablaProducto.getValueAt(tablaProducto.getRowCount()-1, 0).toString()) + 1;
        int Stock = 0;
        Double precio = 0.0;
        String nombre = barraDescripcion.getText();
        if (nombre.equals("")){
            errorCampos +="error en el nombre ,";      
        }
        try {
            Stock = Integer.parseInt(barraStock.getText());
            precio = Double.parseDouble(barraPrecio.getText());
        }  
        catch(NumberFormatException ex){
            errorCampos += " solo se acepta valores numericos en los campos estock y precio ";
        }
        if (errorCampos != ""){
            Error error = new Error(new javax.swing.JFrame(),true, errorCampos);
            error.setVisible(true);
        }
        else {
            Producto nuevoProducto = new Producto (nombre,Stock,precio,codigo);
            nuevoProducto.setTipoPromocion(DescuentoBox.getItemAt(DescuentoBox.getSelectedIndex()));
            Archivo.nuevoProducto(nuevoProducto);
            agregarTabla( nuevoProducto);
            barraDescripcion.setText("");
            barraPrecio.setText("");
            barraStock.setText("");
        }
        
        
    }
    
    private void botonAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarProductoActionPerformed
        agregar();
    }//GEN-LAST:event_botonAgregarProductoActionPerformed

    private void barraPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barraPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barraPrecioActionPerformed

    private void barraDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barraDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barraDescripcionActionPerformed

    
    
    private void actualizarArchivo(){
        String outputFile = "test/archivo_producto.csv";
        File ficheroProducto = new File(outputFile);
        ficheroProducto.delete();
        Seguridad.Archivo.inicializarProducto(); 
        int vueltas =  tablaProducto.getRowCount();
        for (int  x  = 0 ; x < vueltas; x++){
            String nombre = tablaProducto.getValueAt(x, 1).toString();
            int stock = Integer.parseInt(tablaProducto.getValueAt(x, 2).toString());
            Double precio = Double.parseDouble(tablaProducto.getValueAt(x, 3).toString());
            int codigo = Integer.parseInt(tablaProducto.getValueAt(x, 0).toString());
            Producto nuevos = new Producto(nombre,stock,precio,codigo);  
            Seguridad.Archivo.nuevoProducto(nuevos);
        }
    }
        
    private void botonModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarProductoActionPerformed
        //actualizarArchivo();
        int ID = Integer.parseInt(tablaProducto.getValueAt(tablaProducto.getSelectedRow(), 0).toString());
        String nombre = tablaProducto.getValueAt(tablaProducto.getSelectedRow(), 1).toString();
        int stock = Integer.parseInt(tablaProducto.getValueAt(tablaProducto.getSelectedRow(), 2).toString());
        Double precio = Double.parseDouble(tablaProducto.getValueAt(tablaProducto.getSelectedRow(), 3).toString());
        
        ModificarProducto modProd = new ModificarProducto(new javax.swing.JFrame(), true, new Producto(nombre, stock, precio, ID) );
        modProd.setVisible(true);
        if (modProd.precioModificado()){
            cargarTabla();
        }
    }//GEN-LAST:event_botonModificarProductoActionPerformed

    private void botonQuitarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQuitarProductoActionPerformed
        //tablaProducto.remove(tablaProducto.getSelectedRow());
        int row = tablaProducto.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel)tablaProducto.getModel();
        modelo.removeRow(row);
        actualizarArchivo();
    }//GEN-LAST:event_botonQuitarProductoActionPerformed

    private void botonModificarProducto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarProducto1ActionPerformed
        String key = tablaProducto.getValueAt(tablaProducto.getSelectedRow(), 0).toString();
        Historial verHistorial = new Historial(new javax.swing.JDialog(), true , key);
        verHistorial.setVisible(true);
    }//GEN-LAST:event_botonModificarProducto1ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DescuentoBox;
    private javax.swing.JTextField barraDescripcion;
    private javax.swing.JTextField barraPrecio;
    private javax.swing.JTextField barraStock;
    private javax.swing.JButton botonAgregarProducto;
    private javax.swing.JButton botonModificarProducto;
    private javax.swing.JButton botonModificarProducto1;
    private javax.swing.JButton botonQuitarProducto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProducto;
    private javax.swing.JLabel tituloPrincipal;
    // End of variables declaration//GEN-END:variables
}
