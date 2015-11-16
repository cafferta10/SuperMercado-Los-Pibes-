
package Entidades;


public class Producto {
    
    private String nombre;
    private int stock;
    private int precio;
    private boolean descuento;
    private int codigo;
	
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
    
    
    public int getCodigo() {
	return codigo;
	}
    
    
    public void setCodigo(int codigo) {
	this.codigo = codigo;
	}
        
        
    public Producto(String nombre, int stock, int precio, boolean descuento,int codigo) {
	super();
	this.nombre = nombre;
	this.stock = stock;
	this.precio = precio;
	this.descuento = descuento;
        this.codigo = codigo;
	}
	
    
}
