
package Entidades;


public class Tarjeta {
    
    private String codigo;
    private int puntos;
    
    public String getCodigo() {
	return codigo;
	}
    
    
    public void setCodigo(String codigo) {
	this.codigo = codigo;
	}
    
    
    public int getPuntos() {
	return puntos;
	}
        
        
    public void setPuntos(int puntos) {
	this.puntos = puntos;
	}
        
        
   
        
        
        
    public Tarjeta(String codigo, int puntos) {
	super();
	this.codigo = codigo;
	this.puntos = puntos;
	}
	
    
    
    
    
    
    
}
