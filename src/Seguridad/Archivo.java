
package Seguridad;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.csvreader.CsvWriter;

import Entidades.Venta;
import Entidades.Producto;
import Entidades.Tarjeta;

public  class Archivo {
    
    
    static List<Venta> venta = new ArrayList<Venta>();
    static List<Producto> producto = new ArrayList<Producto>();
    static List<Tarjeta> tarjeta = new ArrayList<Tarjeta>();
    
    public static void guardarVenta(){
        
        String outputFile = "Archivos/archivo_venta.csv";
        
        boolean alreadyExists = new File(outputFile).exists();
        
        if(alreadyExists){
        	File ficheroVenta = new File(outputFile);
        	ficheroVenta.delete();
        }        
        
        try {

            CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ',');
            
            csvOutput.write("ID de Factura");
            csvOutput.write("Fecha");
            csvOutput.write("Total");
            csvOutput.endRecord();

            for(Venta nuevaVenta : venta){
    
            	csvOutput.write(nuevaVenta.getIdFactura());
            	csvOutput.write(nuevaVenta.getFecha());
            	csvOutput.write(nuevaVenta.getTotal());
            	csvOutput.endRecord();                   
            }
            
            csvOutput.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    
    
    public static void nuevoProducto(){
        
        String outputFile = "Archivos/archivo_producto.csv";
        
        boolean alreadyExists = new File(outputFile).exists();
        
        if(alreadyExists){
        	File ficheroProducto = new File(outputFile);
        	ficheroProducto.delete();
        }        
        
        try {

            CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ',');
            
            csvOutput.write("Nombre");
            csvOutput.write("Stock");
            csvOutput.write("Precio");
            csvOutput.write("Descuento");
            csvOutput.endRecord();

            for(Producto nuevaProducto : producto){
    
            	csvOutput.write(nuevaProducto.getNombre());
            	csvOutput.write(nuevaProducto.getStock());
            	csvOutput.write(nuevaProducto.getPrecio());
                csvOutput.write(nuevaProducto.getDescuento());                
            	csvOutput.endRecord();                   
            }
            
            csvOutput.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    
    public static void nuevaTarjeta(){
        
        String outputFile = "Archivos/archivo_tarjeta.csv";
        
        boolean alreadyExists = new File(outputFile).exists();
        
        if(alreadyExists){
        	File ficheroTarjeta = new File(outputFile);
        	ficheroTarjeta.delete();
        }        
        
        try {

            CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ',');
            
            csvOutput.write("Codigo");
            csvOutput.write("Puntos");
            csvOutput.endRecord();

            for(Tarjeta nuevaTarjeta : tarjeta){
    
            	csvOutput.write(nuevaTarjeta.getCodigo());
            	csvOutput.write(nuevaTarjeta.getPuntos());
            	csvOutput.endRecord();                   
            }
            
            csvOutput.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    
}
