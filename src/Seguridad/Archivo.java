
package Seguridad;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.lang.Integer;


import com.csvreader.CsvWriter;
import com.csvreader.CsvReader;


import Entidades.Producto;
import Entidades.Tarjeta;


public  class Archivo {
    
    
    
    private static void inicializarTarjeta(){
        
        String outputFile = "test/archivo_tarjeta.csv";
        

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
    
    
    private static void inicializarProducto(){
        
        String outputFile = "test/archivo_producto.csv";
        
          try {

            CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ',');
            
            csvOutput.write("Nombre");
            csvOutput.write("Stock");
            csvOutput.write("Precio");
            csvOutput.write("Descuento");
            csvOutput.write("Codigo");
            csvOutput.endRecord();

        
        
        csvOutput.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        
    }
    
    
    public static void inicializarTodo(){
        
        String outputFile = "test/archivo_producto.csv";
        String outputFile2 = "test/archivo_tarjeta.csv";
        boolean alreadyExists = new File(outputFile).exists();
        
        if(alreadyExists){
            File ficheroProducto = new File(outputFile);
            File ficheroTarjeta = new File(outputFile2);

        }
        else{
        inicializarTarjeta();
        inicializarProducto(); 
        }
        

    }
    
    
    
    
    public static void nuevoProducto(Producto nuevoProducto){
        
        String outputFile = "test/archivo_producto.csv";
        
        try {

            CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ',');
            
    
            csvOutput.write(nuevoProducto.getNombre());
            csvOutput.write(Integer.toString(nuevoProducto.getStock()));
            csvOutput.write(Integer.toString(nuevoProducto.getPrecio()));
            if (nuevoProducto.getDescuento())
                csvOutput.write("SI");
            else
                csvOutput.write("NO");
            csvOutput.write(Integer.toString(nuevoProducto.getCodigo()));
            csvOutput.endRecord();                   
            
            
            csvOutput.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    
    public static void nuevaTarjeta(Tarjeta nuevaTarjeta){
        
        String outputFile = "test/archivo_tarjeta.csv";
        
        try {

            CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ',');
            

            csvOutput.write(nuevaTarjeta.getCodigo());
            csvOutput.write(Integer.toString(nuevaTarjeta.getPuntos()));
            csvOutput.endRecord();                   
            
            csvOutput.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    
    public static ArrayList listaTarjeta(){
        
        ArrayList<Tarjeta> listaTarjeta = new ArrayList<Tarjeta>();
        
        try {
			
		
			
		CsvReader tarjeta_import = new CsvReader("test/archivo_tarjeta.csv");
		tarjeta_import.readHeaders();

		while (tarjeta_import.readRecord())
		{
			String codigo = tarjeta_import.get("Codigo");
			int puntos = Integer.parseInt(tarjeta_import.get("Puntos"));
				
			listaTarjeta.add(new Tarjeta(codigo, puntos));				
		}
			
		tarjeta_import.close();
			
			
	} 
        catch (FileNotFoundException e) {
		e.printStackTrace();
		} 
        catch (IOException e) {
		e.printStackTrace();
		}
        
        return  listaTarjeta;
    } 
    
    
    
    public static List listaProducto(){
        
        List<Producto> listaProducto = new ArrayList<Producto>();
        
        try {
			
		
			
		CsvReader producto_import = new CsvReader("test/archivo_producto.csv");
		producto_import.readHeaders();

		while (producto_import.readRecord())
		{
                    String descripcion = producto_import.get("Nombre");
                    int stock = Integer.parseInt(producto_import.get("Stock"));
                    int precio = Integer.parseInt(producto_import.get("Precio"));
                    boolean descuento = false;
                    if ("SI".equals(producto_import.get("Descuento"))){                  
                        descuento = true; 
                       }
                    int codigo = Integer.parseInt(producto_import.get("Codigo"));
                                        
                    listaProducto.add(new Producto(descripcion, stock, precio,descuento,codigo));				
		}
			
		producto_import.close();
			
			
	} 
        catch (FileNotFoundException e) {
		e.printStackTrace();
		} 
        catch (IOException e) {
		e.printStackTrace();
		}
        
        return  listaProducto;
        
        
    }
    
    
    
    
    public Producto busquedaProducto(int codigoBuscado){
        
        try {
            
            CsvReader producto_import = new CsvReader("test/archivo_producto.csv");
            producto_import.readHeaders();
            
            while (producto_import.readRecord()){
                
                if (codigoBuscado == Integer.parseInt(producto_import.get("Codigo"))){
                    
                    String descripcion = producto_import.get("Nombre");
                    int stock = Integer.parseInt(producto_import.get("Stock"));
                    int precio = Integer.parseInt(producto_import.get("Precio"));
                    boolean descuento = false;
                    if ("SI".equals(producto_import.get("Descuento"))){                  
                        descuento = true; 
                       }                   
                    int codigo = Integer.parseInt(producto_import.get("Codigo"));
                    
                    return new Producto(descripcion, stock, precio,descuento,codigo);
                }
                else{
                    return null;
                }
                
                
            }
                       
            
        }
        
        catch (FileNotFoundException e) {
		e.printStackTrace();
		} 
        catch (IOException e) {
		e.printStackTrace();
		}
        
        return null;
    }
    
    
}
