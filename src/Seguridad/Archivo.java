
package Seguridad;

import Entidades.HistorialPrecio;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;


import com.csvreader.CsvWriter;
import com.csvreader.CsvReader;


import Entidades.Producto;
import Entidades.Tarjeta;
import java.util.Date;
import java.util.List;

/**
 * 
 * @author Alan
 * @author Caffia
 */

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
    
    private static void inicializarHistorialProducto(){
        String outputFile = "test/archivo_historial_producto.csv";
        try {
            CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ',');
            csvOutput.write("ID");
            csvOutput.write("PRECIO");
            csvOutput.write("FECHA");
            csvOutput.write("ESTADO");
            csvOutput.endRecord();
            csvOutput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
    
    public static void inicializarProducto(){
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
        String outputFileTarj = "test/archivo_tarjeta.csv";
        String outputFileHist = "test/archivo_historial_producto.csv";
        boolean existeArchProductos= new File(outputFile).exists();
        boolean existeArchTarjetas = new File(outputFileTarj).exists();
        boolean existeArchHistorial = new File(outputFileHist).exists();
        if(existeArchProductos){ //inicializa productos
            File ficheroProducto = new File(outputFile);
        }
        else{
            inicializarProducto(); 
        }
        if(existeArchTarjetas){ //inicializa tarjetas
            File ficheroTarjeta = new File(outputFileTarj);
        }       
        else{
            inicializarTarjeta();
        }
        if(existeArchHistorial){ //inicializa historial
            File ficheroHistorial= new File(outputFileHist);
        }       
        else{
            inicializarHistorialProducto();
        }
    }
    
    
    
    
    public static void nuevoProducto(Producto nuevoProducto){
        String outputFile = "test/archivo_producto.csv";
        try {
            CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ',');
            csvOutput.write(nuevoProducto.getNombre());
            csvOutput.write(Integer.toString(nuevoProducto.getStock()));
            csvOutput.write( nuevoProducto.getPrecio().toString() );
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
    
    public static void nuevoPrecioHistorial(HistorialPrecio nuevaPrecio){
        String outputFile = "test/archivo_historial_producto.csv";
        try {
            CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ',');
            csvOutput.write(nuevaPrecio.getId());
            csvOutput.write(nuevaPrecio.getPrecio());
            csvOutput.write(nuevaPrecio.getFecha());
            csvOutput.write(nuevaPrecio.getEstado());
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
    
    
    
    public static ArrayList listaProducto(){
        ArrayList<Producto> listaProducto = new ArrayList<Producto>();
        try {	
		CsvReader producto_import = new CsvReader("test/archivo_producto.csv");
		producto_import.readHeaders();

		while (producto_import.readRecord())
		{
                    String descripcion = producto_import.get("Nombre");
                    int stock = Integer.parseInt(producto_import.get("Stock"));
                    Double precio = Double.parseDouble(producto_import.get("Precio"));
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
        return listaProducto;
    }
    
    
    public static List listaHistorial(String clave){
        List<HistorialPrecio> listaHistorial = new ArrayList<HistorialPrecio>();
        try {
            CsvReader historial_import = new CsvReader("test/archivo_historial_producto.csv");
            historial_import.readHeaders();
            while (historial_import.readRecord())
            {
                System.out.println("cargo");
                String ID = historial_import.get("ID");
                if (clave.equals(ID)){
                    Double precio = Double.parseDouble(historial_import.get("PRECIO"));
                    Date fecha = new Date(historial_import.get("FECHA"));
                    listaHistorial.add(new HistorialPrecio(ID, precio, fecha,true));
                }
            }	
            historial_import.close();		
	} 
        catch (FileNotFoundException e) {
		e.printStackTrace();
		} 
        catch (IOException e) {
		e.printStackTrace();
		}
        return  listaHistorial;
    }

    public static ArrayList<Producto> listaHistorial() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public Producto busquedaProducto(int codigoBuscado){
        
        try {
            
            CsvReader producto_import = new CsvReader("test/archivo_producto.csv");
            producto_import.readHeaders();
            
            while (producto_import.readRecord()){
                
                if (codigoBuscado == Integer.parseInt(producto_import.get("Codigo"))){
                    
                    String descripcion = producto_import.get("Nombre");
                    int stock = Integer.parseInt(producto_import.get("Stock"));
                    Double precio = Double.parseDouble(producto_import.get("Precio"));
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
