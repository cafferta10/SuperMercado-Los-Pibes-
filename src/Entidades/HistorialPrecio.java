package Entidades;

import java.util.Date;
/**
 *
 * @author  Alan Asmis
 * @author Franco Cafferata
 */

public class HistorialPrecio {
    
    private double precio;
    private String id;
    private Date fecha;
    
    public HistorialPrecio(String id , double  precio , Date fecha ){
        super();
        this.precio = precio;
        this.id = id;
        this.fecha = fecha;
    }
    
    public HistorialPrecio(String id , double  precio){
        super();
        this.precio = precio;
        this.id = id;
        this.fecha = new Date();
    }
    
    public String getId(){
        return this.id;
    }
    
    public String getPrecio(){
        return Double.toString(this.precio);
    }
    
    public String getFecha(){
        return this.fecha.toGMTString();
    }
}
