package Patron;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Idiomas {

	public static void main(String[] args) throws Throwable {
	

		   System.out.println("La idioma es : "+args[0]);

			Properties fichero_propiedaes=null;  // es una clase que facileta leer ficher que tiene valor = ...
			
			fichero_propiedaes=new Properties();
			
		 
		   
		   if(args[0].equals("it"))
		   {
			   	FileReader fr = new FileReader("story_it");	
			   	fichero_propiedaes.load(fr);

		        String start=fichero_propiedaes.getProperty("start");
			    System.out.println(start); 
		        String end=fichero_propiedaes.getProperty("end");
			    System.out.println(end);
			    String body=fichero_propiedaes.getProperty("body");
			    System.out.println(body);
			    fr.close();

			    
		   }
		   
		   else
		   {
			   if(args[0].equals("es"))
			   {
				   	FileReader fr = new FileReader("story_es");	
				   	fichero_propiedaes.load(fr);
				    
			        String start=fichero_propiedaes.getProperty("start");
				    System.out.println(start);
				    String end=fichero_propiedaes.getProperty("end");
				    System.out.println(end);
				    String body=fichero_propiedaes.getProperty("body");
				     System.out.println(body);
				     fr.close();
				     
				     
			   }else
			   {
				   if(args[0].equals("en"))
				   {
					   	FileReader fr = new FileReader("story_en");	
					   	fichero_propiedaes.load(fr);
					    
				        String start=fichero_propiedaes.getProperty("start");
					    System.out.println(start);
					    String end=fichero_propiedaes.getProperty("end");
					    System.out.println(end);
					    String body=fichero_propiedaes.getProperty("body");
					    System.out.println(body);
					    fr.close();
				   }
			   }
		   }
		
		
		   ///// escribir el contenido en un fichero
		   
		   String[] frase = new String[3];
		   frase[0] = fichero_propiedaes.getProperty("start");
		   frase[1] = fichero_propiedaes.getProperty("body");
		   frase[2] = fichero_propiedaes.getProperty("end");
			
			String nombreCuento = fichero_propiedaes.getProperty("outfile");
			
			BufferedWriter bw = new	BufferedWriter(new FileWriter(new File(nombreCuento)));
			String linea = null;
			
			
			for (int i = 0; i < frase.length; i++) {
				linea = frase[i];
				
					bw.write(linea);
					if(i < frase.length-1) // para que no queda una linea nueva vacea
					bw.newLine();
			
			}
			
		
			bw.close();
		   
		
	}

	
	
}
