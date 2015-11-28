
package Entidades;

import java.util.Date;


public class Venta {
    
    private int idFactura;
    private Date fecha;
    private double total;
    private Linea lineaProducto;
	
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
        
        
    public Venta(int idFactura,Linea venta, double total) {
	super();
	this.idFactura = idFactura;
	this.fecha = new Date();
        this.lineaProducto = venta;
	this.total = total;
	}
    
    
	
    
}
