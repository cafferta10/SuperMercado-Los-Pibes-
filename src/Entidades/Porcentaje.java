/**
 *
 * @author  Alan Asmis
 * @author Franco Cafferata
 */
package Entidades;

public class Porcentaje extends Promocion {
    
    public Porcentaje (String tipoDescuento){
        super(tipoDescuento);
    }


    @Override
    public Double calcularDescuento(Double precioProducto, int cantidad) {
        Double total = precioProducto * cantidad;
        switch (tipoDescuento){
            case "25%":
                total -=((25*total) / 100);
                break;
            case "15%":
                total -=((15*total) / 100);
                break;
            case "10%":
                total -=((10*total) / 100);
                break;
            case "5%":
                total -=((5*total) / 100);
                break;
            default:
                total = 0.0 ;
                break;
        } 
        return total;
    }
    
}
