/**
 *
 * @author  Alan Asmis
 * @author Franco Cafferata
 */
package Entidades;

public class Porcentaje extends Promocion {
    
    public Porcentaje (){
        super();
    }


    @Override
    public Double calcularDescuento(String tipoDescuento, Double precioProducto, int cantidad) {
        Double total = precioProducto * cantidad;
        switch (tipoDescuento){
            case "25%":
                total -=((25*total.intValue()) / 100);
                break;
            case "15%":
                total -=((15*total.intValue()) / 100);
                break;
            case "10%":
                total -=((10*total.intValue()) / 100);
                break;
            case "5%":
                total -=((5*total.intValue()) / 100);
                break;
        } 
        return total;
    }
    
}
