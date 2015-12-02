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
    
    public abstract Double calcularDescuento(String tipoDescuento, Double precioProdcuto, int cantidad);
    
}
