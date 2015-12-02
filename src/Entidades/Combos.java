
package Entidades;

public class Combos extends Promocion {
    
    
    public Combos(){
        super();
    }
    
    
    

    @Override
    public Double calcularDescuento(String tipoDescuento, Double precioProducto, int cantidad) {
        int combos;
        double total = 0;
        if (tipoDescuento == "Combo 2x3"){
            combos =cantidad / 3;
            total = (precioProducto*2)*combos;
        }
        else{
            if (tipoDescuento == "Combo 6x8"){
                combos = cantidad/ 8;
                total =  (precioProducto*6)*combos;
            }      
        }
        return total;      
    }
    
    

    
    
    
    
}
