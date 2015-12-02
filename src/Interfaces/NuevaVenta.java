
package Interfaces;



import Entidades.Combos;
import java.awt.Color;
import java.io.File;
import java.util.List;
import javax.swing.SpinnerModel;
import javax.swing.table.DefaultTableModel;

import Entidades.Linea;
import Entidades.Porcentaje;
import Entidades.Producto;
import Entidades.Promocion;
import Entidades.Tarjeta;

/**
 *
 * @author  Alan Asmis
 * @author Franco Cafferata
 */
public class NuevaVenta extends javax.swing.JDialog {
    
    private List <Producto> listaProductos = Seguridad.Archivo.listaProducto();
    private List <Tarjeta> listaTarjetas = Seguridad.Archivo.listaTarjeta();
    private Linea lineaProductos = new Linea();
    private boolean ventaRealizada = false;
    private Promocion descuento;
    
    /**
     * Creates new form NuevaVenta
     * @param parent
     * @param modal
     * @param nuevaVenta
     */
    public NuevaVenta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getContentPane().setBackground(Color.DARK_GRAY);
        DescuentoBox.removeAllItems();
        cargarBoxProducto();
        cargarBoxCliente(); 
        cargarBoxDescuento();
    }
    
    public void cargarBoxDescuento(){
        DescuentoBox.removeAllItems();
        DescuentoBox.addItem("Ninguno");
        DescuentoBox.addItem("Combo 3x2");
        DescuentoBox.addItem("Combo 8x6");
        DescuentoBox.addItem("25%");
        DescuentoBox.addItem("15%");
        DescuentoBox.addItem("10%");
        DescuentoBox.addItem("5%");
}
    
    public void cargarBoxProducto(){
        productoBox.removeAllItems();
        for(Producto p : listaProductos ){
            productoBox.addItem(p.getNombre());
        }
        NumeroProductos.setModel(cambiarCantidad(listaProductos.get(0).getStock()));
        precio.setText("c/u $ "+listaProductos.get(0).getPrecio().toString());
        total.setText("0");
    }
    
    public void cargarBoxCliente(){
        clientebox.removeAllItems();
        clientebox.addItem("NINGUNO");
        for(Tarjeta p : listaTarjetas){
            clientebox.addItem(p.getCodigo());
        }
        Puntos.setText("XXXX");
        cambiarPuntos.setEnabled(false);
    }
    
    public Linea getLineaVenta(){
        return lineaProductos;
    }
    
    public Double getTotal(){
        return Double.parseDouble(total.getText());
    }
    
    
    public SpinnerModel cambiarCantidad(int max){
        return new javax.swing.JSpinner(new javax.swing.SpinnerNumberModel(0, 0, max , 1)).getModel();
    }
    
    public String getTarjeta(){
        int value = clientebox.getSelectedIndex() ;
        if (value > 0){
            return listaTarjetas.get(value).getCodigo();
        }
        else{
            return "NO REGISTRADO";
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        botonAgregarProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVenta = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        finalizarVenta = new javax.swing.JButton();
        NumeroProductos = new javax.swing.JSpinner();
        productoBox = new javax.swing.JComboBox<>();
        DescuentoBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        precio = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        clientebox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        Cancelar = new javax.swing.JButton();
        Puntos = new javax.swing.JLabel();
        cambiarPuntos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModalityType(java.awt.Dialog.ModalityType.TOOLKIT_MODAL);
        setPreferredSize(new java.awt.Dimension(500, 491));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DESCUENTO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, 30));

        botonAgregarProducto.setBackground(new java.awt.Color(102, 102, 102));
        botonAgregarProducto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botonAgregarProducto.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregarProducto.setText("AGREGAR");
        botonAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(botonAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 100, 20));

        tablaVenta.setBackground(new java.awt.Color(0, 0, 0));
        tablaVenta.setForeground(new java.awt.Color(255, 255, 255));
        tablaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DESCRIPCION", "CANTIDAD", "PRECIO UNITARIO", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaVenta.setPreferredSize(new java.awt.Dimension(300, 398));
        jScrollPane1.setViewportView(tablaVenta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 470, 280));

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NUEVA VENTA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 500, 30));

        finalizarVenta.setBackground(new java.awt.Color(102, 102, 102));
        finalizarVenta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        finalizarVenta.setForeground(new java.awt.Color(255, 255, 255));
        finalizarVenta.setText("GUARDAR VENTA");
        finalizarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarVentaActionPerformed(evt);
            }
        });
        getContentPane().add(finalizarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 230, -1));

        NumeroProductos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        getContentPane().add(NumeroProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 70, 20));

        productoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        productoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoBoxActionPerformed(evt);
            }
        });
        getContentPane().add(productoBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 100, 20));

        DescuentoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        DescuentoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescuentoBoxActionPerformed(evt);
            }
        });
        getContentPane().add(DescuentoBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 80, 20));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PRECIO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CANTIDAD");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, 30));

        precio.setForeground(new java.awt.Color(0, 204, 51));
        precio.setText("c/u $");
        getContentPane().add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 70, 20));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PRODUCTO");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 30));

        clientebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        clientebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteboxActionPerformed(evt);
            }
        });
        getContentPane().add(clientebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 80, -1));

        jLabel2.setForeground(new java.awt.Color(255, 0, 153));
        jLabel2.setText("PTS:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 30, 20));

        jLabel7.setForeground(new java.awt.Color(0, 255, 0));
        jLabel7.setText("TOTAL $ ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, -1, 20));

        total.setForeground(new java.awt.Color(0, 255, 0));
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 110, 20));

        Cancelar.setBackground(new java.awt.Color(102, 102, 102));
        Cancelar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        Cancelar.setText("CANCELAR VENTA");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 230, -1));

        Puntos.setForeground(new java.awt.Color(255, 0, 102));
        Puntos.setText("puntos");
        getContentPane().add(Puntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 40, 20));

        cambiarPuntos.setBackground(new java.awt.Color(51, 255, 51));
        cambiarPuntos.setText("CANGEAR");
        cambiarPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarPuntosActionPerformed(evt);
            }
        });
        getContentPane().add(cambiarPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, -1, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearDescuento(){
        String  tipo = DescuentoBox.getItemAt(DescuentoBox.getSelectedIndex());
        if ((tipo == "Combo 3x2") | (tipo == "Combo 8x6" )){
            descuento = new Combos();
    }
        else {
             if ((tipo == "25%") || (tipo == "15%" )|| (tipo == "10%" )|| (tipo == "5%" ))
                 descuento = new Porcentaje();
             else
                 descuento = null;
        }

    }
    
    
    private void botonAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarProductoActionPerformed

        int ID = productoBox.getSelectedIndex();
        int codigoBuscado = listaProductos.get(ID).getCodigo();
        int cantidadVendida = Integer.parseInt(NumeroProductos.getValue().toString());
        Double descuentoFinal = 0.0;
        crearDescuento();
        if (descuento != null){
            descuentoFinal = descuento.calcularDescuento(DescuentoBox.getItemAt(DescuentoBox.getSelectedIndex()),listaProductos.get(ID).getPrecio() , cantidadVendida); 
        }
        else{
            descuentoFinal = listaProductos.get(ID).getPrecio() * cantidadVendida;
        }
        if (cantidadVendida > 0){
            listaProductos.get(ID).setStock( listaProductos.get(ID).getStock() - cantidadVendida);
            NumeroProductos.setModel(cambiarCantidad(listaProductos.get(ID).getStock()));
            DefaultTableModel modelo=(DefaultTableModel) tablaVenta.getModel();    
            String arreglo [] = new String[4];
            arreglo[0] = Integer.toString(codigoBuscado);
            arreglo[1] = Integer.toString(cantidadVendida);
            arreglo[2] = Double.toString(listaProductos.get(ID).getPrecio());
            arreglo[3] = Double.toString(descuentoFinal);
            Producto nuevoProducto = new Producto (listaProductos.get(ID).getNombre(),listaProductos.get(ID).getStock(),listaProductos.get(ID).getPrecio(),listaProductos.get(ID).getCodigo());
            total.setText(Double.toString(Double.parseDouble(total.getText())+descuentoFinal) );
            modelo.addRow(arreglo);
            tablaVenta.setModel(modelo);
            lineaProductos.setListaProducto(new Producto (listaProductos.get(ID).getNombre(),cantidadVendida,descuentoFinal,listaProductos.get(ID).getCodigo()));

    }
        
    }//GEN-LAST:event_botonAgregarProductoActionPerformed

    private void finalizarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarVentaActionPerformed
       if (tablaVenta.getRowCount() > 0){
           //limpio el archivo de productos para actualizar el stock.-
           String outputFile = "test/archivo_producto.csv";
           File ficheroProducto = new File(outputFile);
           ficheroProducto.delete();
           Seguridad.Archivo.inicializarProducto(); 
           for( Producto key : listaProductos){
               Seguridad.Archivo.nuevoProducto(key);
           }
           int value = clientebox.getSelectedIndex();
           if (value > 0 ){
                Double porcentaje = (Double.parseDouble(total.getText()) * 5) /100.0;
                listaTarjetas.get(value -1).AcumularPuntos( porcentaje.intValue() );
                outputFile = "test/archivo_tarjeta.csv";
                File ficheroTarjeta = new File(outputFile);
                ficheroTarjeta.delete();
                Seguridad.Archivo.inicializarTarjeta(); 
                for( Tarjeta tar : listaTarjetas){
                    Seguridad.Archivo.nuevaTarjeta(tar);
                }
           }
           
           setVisible(false);
           ventaRealizada = true;
       }
    }//GEN-LAST:event_finalizarVentaActionPerformed

    private void productoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoBoxActionPerformed
        int value = productoBox.getSelectedIndex();
        if(value >= 0){
            NumeroProductos.setModel(cambiarCantidad(listaProductos.get(value).getStock()));
            precio.setText("c/u $ "+listaProductos.get(value).getPrecio().toString());
        }
    }//GEN-LAST:event_productoBoxActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_CancelarActionPerformed

    private void clienteboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteboxActionPerformed
        int value = clientebox.getSelectedIndex();
        if(value >= 1){
            Puntos.setText(Integer.toString(listaTarjetas.get(value-1).getPuntos()));
            cambiarPuntos.setEnabled(true);
        }
        else{
            Puntos.setText("XXXX");
            cambiarPuntos.setEnabled(false);
        }
    }//GEN-LAST:event_clienteboxActionPerformed

    private void cambiarPuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarPuntosActionPerformed
        if (Double.parseDouble(Puntos.getText()) > 0){
            Double t = Double.parseDouble(total.getText()) - Double.parseDouble(Puntos.getText());
            if (t < 0.0 ){
                t = 0.0;
            }
            total.setText(t.toString());
            Puntos.setText("0");
            listaTarjetas.get(clientebox.getSelectedIndex() - 1 ).CangearPuntos();
        }
    }//GEN-LAST:event_cambiarPuntosActionPerformed

    private void DescuentoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescuentoBoxActionPerformed
        //nada
    }//GEN-LAST:event_DescuentoBoxActionPerformed

    public boolean ventaRealizada(){
        return ventaRealizada;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JComboBox<String> DescuentoBox;
    private javax.swing.JSpinner NumeroProductos;
    private javax.swing.JLabel Puntos;
    private javax.swing.JButton botonAgregarProducto;
    private javax.swing.JButton cambiarPuntos;
    private javax.swing.JComboBox<String> clientebox;
    private javax.swing.JButton finalizarVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel precio;
    private javax.swing.JComboBox<String> productoBox;
    private javax.swing.JTable tablaVenta;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
