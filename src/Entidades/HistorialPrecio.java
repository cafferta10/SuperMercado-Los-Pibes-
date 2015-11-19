package Entidades;

import java.util.Date;

public class HistorialPrecio {
    
    private double precio;
    private String id;
    private Date fecha;
    private boolean estado;
    
    public HistorialPrecio(String id , double  precio , Date fecha ,boolean estado){
        super();
        this.precio = precio;
        this.id = id;
        this.fecha = fecha;
        this.estado = estado;
    }
    
    public HistorialPrecio(String id , double  precio){
        super();
        this.precio = precio;
        this.id = id;
        this.fecha = new Date();
        this.estado = true;
    }
    
    public void CambiarEstado(){
        this.estado = false;
    }
    
    public String getId(){
        return this.id;
    }
    
    public String getPrecio(){
        return Double.toString(this.precio);
    }
    
    public String getFecha(){
        return this.fecha.toString();
    }
    
    public String getEstado(){
        if(this.estado){
            return "true"; 
        }
        else{
            return "false";
        }
    }
}
