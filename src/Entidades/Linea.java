
package Entidades;

import java.util.ArrayList;


public class Linea {
    
    private ArrayList <Producto> listaProducto ;
    
    
    public ArrayList<Producto> getListaProducto() {
	return listaProducto;
	}
    
    
    public void setListaProducto(Producto producto) {
	this.listaProducto.add(producto);
	}
    
    
    public Linea() {
	super();
	this.listaProducto = new ArrayList() ;
	}   
}
