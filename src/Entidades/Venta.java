
/**
 *
 * @author  Alan Asmis
 * @author Franco Cafferata
 */
package Entidades;

import java.util.Date;


public class Venta {
    
    private int idFactura;
    private Date fecha;
    private double total;
    private Linea lineaProducto;
    private String id_tarjeta;
	
    public int getIdFactura() {
	return idFactura;
	}
        
        
    public void setIdFactura(int idFactura) {
	this.idFactura = idFactura;
	}
        
        
    public Date getFecha() {
	return fecha;
	}
        
        
    public void setFecha(Date fecha) {
	this.fecha = fecha;
	}
        
        
    public double getTotal() {
	return total;
	}
        
        
    public void setTotal(double total) {
	this.total = total;
	}
    
    
    public Linea getLineaProducto(){
        return lineaProducto;
    }
    
    public void setLineaProducto(Linea lineaProducto){
        this.lineaProducto = lineaProducto;
    }
        
    public String getTarjeta(){
        return this.id_tarjeta;
    }
        
    public Venta(int idFactura,Linea venta, double total , String tarjeta) {
	super();
        this.id_tarjeta = tarjeta;
	this.idFactura = idFactura;
	this.fecha = new Date(); //se autogenera la fecha.-
        this.lineaProducto = venta;
	this.total = total;
	}
    
    
	
    
}
