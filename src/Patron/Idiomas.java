package Patron;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class Idiomas {

	public static void main(String[] args) throws Throwable {
	

		   System.out.println(args[0]);

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

			    
		   }
		   
		   else
		   {
			   if(args[0].equals("es"))
			   {
				   	FileReader fr = new FileReader("story_it");	
				   	fichero_propiedaes.load(fr);
				    
			        String start=fichero_propiedaes.getProperty("start");
				    
				    System.out.println(start);
				    
				    
			        String end=fichero_propiedaes.getProperty("end");
				    
				    System.out.println(end);
				    
				    
			        String body=fichero_propiedaes.getProperty("body");
				    
				    System.out.println(body);
			   }
		   }
		
		
		
	}

}
