/**
 *
 * @author  Alan Asmis
 * @author Franco Cafferata
 */
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
    Promocion promocion;
	
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
    
    public Producto(){}
        
    public Producto(String nombre, int stock, Double precio,int codigo) {
	super();
	this.nombre = nombre;
	this.stock = stock;
	this.precio = precio;
        this.codigo = codigo;
    }

    public Promocion getPromocion() {
        return this.promocion;
    }
    
    public String getTipoPromocion(){
        if (this.promocion != null){
            return this.promocion.getTipoDescuento();
        }
        else{
            return "Ninguno";
        }
    }
    
    public void setTipoPromocion(String tipo){
        if(! tipo.equals("Ninguno")){
            if (tipo.contains("Combo")){
                this.promocion = new Combos(tipo);
            }
            else{
                this.promocion = new Porcentaje(tipo);
            }
        }
        else{
            this.promocion = null;
        }
    }

    public void setPromocion(Promocion promocion) {
        this.promocion = promocion;
    }
    
    public Double getPrecio(Integer cantidad){
        Double p = 0.0;
        p = (this.precio * cantidad) - this.getPromocion().calcularDescuento(precio, cantidad);
        return p;
    }

}
