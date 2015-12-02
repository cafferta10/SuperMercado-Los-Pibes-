/**
 *
 * @author  Alan Asmis
 * @author Franco Cafferata
 */
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
        
    public void AcumularPuntos(int puntos){
        if (this.puntos + puntos <= 1000){
            this.puntos += puntos;
        }
    }
    
    public int CangearPuntos(){
        int aux = this.puntos;
        this.puntos = 0;
        return aux  ;
    }
   
        
        
        
    public Tarjeta(String codigo, int puntos) {
	super();
	this.codigo = codigo;
	this.puntos = puntos;
	}
	
    
    
    
    
    
    
}
