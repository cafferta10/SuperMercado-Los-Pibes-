/**
 *
 * @author  Alan Asmis
 * @author Franco Cafferata
 */
package Entidades;

public class Combos extends Promocion {
    
    
    public Combos(){
        super();
    }
    
    
    

    @Override
    public Double calcularDescuento(String tipoDescuento, Double precioProducto, int cantidad) {
        int combos;
        double total = precioProducto * cantidad;
        if( ("Combo 3x2".equals(tipoDescuento)) &&( cantidad%3 == 0)){
            combos =cantidad / 3;
            total = (precioProducto*2)*combos;
        }
        else{
            if (("Combo 8x6".equals(tipoDescuento))&&(cantidad%8 == 0)){
                combos = cantidad/ 8;
                total =  (precioProducto*6)*combos;
            }      
        }
        return total;      
    }
    
    

    
    
    
    
}
