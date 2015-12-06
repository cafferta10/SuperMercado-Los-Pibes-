/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author  Alan Asmis
 * @author Franco Cafferata
 */
package Entidades;

public abstract class Promocion {
    
    String tipoDescuento = "Ninguno";

    public Promocion(String tipoDescuento) {
        this.tipoDescuento = tipoDescuento;
    }

    public String getTipoDescuento() {
        return tipoDescuento;
    }

    public void setTipoDescuento(String tipoDescuento) {
        this.tipoDescuento = tipoDescuento;
    }
    
    
    
    public abstract Double calcularDescuento(Double precioProdcuto, int cantidad);
    
}
