
package Entidades;


public class Linea {
    
    private int cantidad;
    private Producto producto;
    
    
    public int getCantidad() {
		return cantidad;
	}
    
    public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
	}
    
    
    public Producto getProducto() {
	return producto;
	}
    
    
    public void setProducto(Producto producto) {
	this.producto = producto;
	}
    
    
    public Linea(int cantidad, Producto producto) {
	super();
	this.cantidad = cantidad;
	this.producto = producto;
	}
	
    
    
}
