
package Interfaces;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import Entidades.Producto;
import Entidades.Venta;

/**
 *
 * @author  Alan Asmis
 * @author Franco Cafferata
 */
public class HistorialVenta extends javax.swing.JDialog {

    
    /**
     * Creates new form NuevaVenta
     * @param parent
     * @param modal
     * @param venta
     */
    public HistorialVenta(java.awt.Frame parent, boolean modal,Venta venta) {
        super(parent, modal);
        initComponents();
        getContentPane().setBackground(Color.DARK_GRAY);
        inicializarTabla(venta);
    }
    
    private void  inicializarTabla(Venta venta){
        DefaultTableModel modelo=(DefaultTableModel) tablaVenta.getModel();    
        String arreglo [] = new String[4];
        for (Producto prod :venta.getLineaProducto().getListaProducto() ){
            arreglo[0] = (prod.getNombre());
            arreglo[1] = Integer.toString(prod.getStock());
            arreglo[2] = Double.toString(prod.getPrecio() / prod.getStock());
            arreglo[3] = Double.toString(prod.getPrecio());
            modelo.addRow(arreglo);
        }
        tablaVenta.setModel(modelo);
        total.setText("TOTAL: $"+Double.toString(venta.getTotal()));   
        fecha.setText("FECHA: "+venta.getFecha().toString());
        tarjeta.setText("TARJETA: "+venta.getTarjeta());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVenta = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        tarjeta = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModalityType(java.awt.Dialog.ModalityType.TOOLKIT_MODAL);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaVenta.setBackground(new java.awt.Color(0, 0, 0));
        tablaVenta.setForeground(new java.awt.Color(255, 255, 255));
        tablaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DESCRIPCION", "CANTIDAD", "PRECIO U/DES", "TOTAL"
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 470, 250));

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("HISTORIAL VENTA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 500, 30));

        tarjeta.setForeground(new java.awt.Color(255, 255, 255));
        tarjeta.setText("TARJETA");
        getContentPane().add(tarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 180, 20));

        total.setForeground(new java.awt.Color(0, 255, 0));
        total.setText("TOTAL $ ");
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 240, 20));

        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setText("FECHA");
        getContentPane().add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 270, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaVenta;
    private javax.swing.JLabel tarjeta;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
