
package Entidades;

import java.util.Date;


public class Venta {
    
    private int idFactura;
    private Date fecha;
    private double total;
	
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
        
        
    public Venta(int idFactura, Date fecha, double total) {
	super();
	this.idFactura = idFactura;
	this.fecha = fecha;
	this.total = total;
	}
	
    
}
