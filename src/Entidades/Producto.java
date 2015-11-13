
package Entidades;


public class Producto {
    
    private String nombre;
    private int stock;
    private int precio;
    private boolean descuento;
	
    public String getNombre() {
	return nombre;
	}
    
    
    public void setNombre(String nombre) {
	this.nombre = nombre;
	}
    
    
    public int getStock() {
	return stock;
	}
        
        
    public void setStock(int stock) {
	this.stock = stock;
	}
        
        
    public int getPrecio() {
	return precio;
	}
        
        
    public void setPrecio(int precio) {
	this.precio = precio;
	}
        
        
	
	
    public boolean getDescuento() {
	return descuento;
	}
    
    
    public void setDescuento(boolean descuento) {
	this.descuento = descuento;
	}
        
        
    public Producto(String nombre, int stock, int precio, boolean descuento) {
	super();
	this.nombre = nombre;
	this.stock = stock;
	this.precio = precio;
	this.descuento = descuento;
	}
	
    
}
