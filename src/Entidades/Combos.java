/**
 *
 * @author  Alan Asmis
 * @author Franco Cafferata
 */
package Entidades;

public class Combos extends Promocion {
    
    public Combos(String tipoDescuento){
        super(tipoDescuento);
    }

    @Override
    public Double calcularDescuento(Double precioProducto, int cantidad) {
        int combos;
        double total = precioProducto * cantidad;
        if( ("Combo 3x2".equals(tipoDescuento)) &&( cantidad%3 == 0)){
            combos =cantidad / 3;
            total -= (precioProducto)*combos;
        }
        else{
            if (("Combo 8x6".equals(tipoDescuento))&&(cantidad%8 == 0)){
                combos = cantidad/ 8;
                total -=  (precioProducto)*combos;
            }  
            else{
                total = 0;
            }
        }
        return total;      
    }
    
    

    
    
    
    
}
