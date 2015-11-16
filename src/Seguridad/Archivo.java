
package Seguridad;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import com.csvreader.CsvWriter;
import com.csvreader.CsvReader;

import Entidades.Venta;
import Entidades.Producto;
import Entidades.Tarjeta;


public  class Archivo {
    
    
    static List<Venta> venta = new ArrayList<Venta>();
    static List<Producto> producto = new ArrayList<Producto>();
    static List<Tarjeta> tarjeta = new ArrayList<Tarjeta>();
    
    private void inicializarTarjeta(){
        
        String outputFile = "Archivos/archivo_tarjeta.csv";
        

         try {

            CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ',');
            
            csvOutput.write("Codigo");
            csvOutput.write("Puntos");
            csvOutput.endRecord();
  
             csvOutput.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    
    private void inicializarProducto(){
        
        String outputFile = "Archivos/archivo_producto.csv";
        
          try {

            CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ',');
            
            csvOutput.write("Nombre");
            csvOutput.write("Stock");
            csvOutput.write("Precio");
            csvOutput.write("Descuento");
            csvOutput.endRecord();

        
        
        csvOutput.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        
    }
    
    
    public void inicializarTodo(){
        inicializarTarjeta();
        inicializarProducto();
    }
    
    
    
    
    public static void nuevoProducto(Producto nuevoProducto){
        
        String outputFile = "Archivos/archivo_producto.csv";
        
        try {

            CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ',');
            
    
            csvOutput.write(nuevoProducto.getNombre());
            csvOutput.write(nuevoProducto.getStock());
            csvOutput.write(nuevoProducto.getPrecio());
            csvOutput.write(nuevoProducto.getDescuento());                
            csvOutput.endRecord();                   
            
            
            csvOutput.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    
    public static void nuevaTarjeta(Tarjeta nuevaTarjeta){
        
        String outputFile = "Archivos/archivo_tarjeta.csv";
        
        try {

            CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ',');
            
            csvOutput.write("Codigo");
            csvOutput.write("Puntos");
            csvOutput.endRecord();

            csvOutput.write(nuevaTarjeta.getCodigo());
            csvOutput.write(nuevaTarjeta.getPuntos());
            csvOutput.endRecord();                   
            
            csvOutput.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    
    public List listaTarjeta(){
        
        List<Tarjeta> listaTarjeta = new ArrayList<Tarjeta>();
        
        try {
			
		
			
		CsvReader tarjeta_import = new CsvReader("Archivo/archivo_tarjeta.csv");
		tarjeta_import.readHeaders();

		while (tarjeta_import.readRecord())
		{
			String codigo = tarjeta_import.get(0);
			int puntos = tarjeta_import.get(1);
				
			listaTarjeta.add(new Tarjeta(codigo, puntos));				
		}
			
		tarjeta_import.close();
			
			
	} 
        catch (Exception e) {
		e.printStackTrace();
	}
        
        return  listaTarjeta;
    } 
    
    
    
    public List listaProducto(){
        
        List<Producto> listaProducto = new ArrayList<Producto>();
        
        try {
			
		
			
		CsvReader producto_import = new CsvReader("Archivo/archivo_producto.csv");
		producto_import.readHeaders();

		while (producto_import.readRecord())
		{
			String codigo = producto_import.get("Nombre");
			int puntos = producto_import.get("Stock");
                        int precio = producto_import.get("Precio");
                        boolean descuento = producto_import.get("Descuento");
				
			listaProducto.add(new Producto(codigo, puntos, precio,descuento));				
		}
			
		producto_import.close();
			
			
	} 
        catch (Exception e) {
		e.printStackTrace();
	}
        
        return  listaProducto;
        
        
    }
    
    
}
