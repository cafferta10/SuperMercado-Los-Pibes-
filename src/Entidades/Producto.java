
package Entidades;

/**
 * 
 * @author Alan
 * @author Caffia
 */

public class Producto {
    
    private String nombre;
    private int stock;
    private Double precio;
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
        
        
    public Double getPrecio() {
	return precio;
	}
        

    public void setPrecio(Double precio) {
	this.precio = precio;
	}
        
        
	
	

    public int getCodigo() {
	return codigo;
	}
    
    
    public void setCodigo(int codigo) {
	this.codigo = codigo;
	}
        
        
    public Producto(String nombre, int stock, Double precio,int codigo) {
	super();
	this.nombre = nombre;
	this.stock = stock;
	this.precio = precio;
        this.codigo = codigo;
    }
}
