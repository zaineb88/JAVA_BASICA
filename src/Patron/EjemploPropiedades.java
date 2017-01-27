package Patron;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class EjemploPropiedades {

	public static void main(String[] args) throws Throwable {

		
		Properties fichero_propiedaes=null;  // es una clase que facileta leer ficher que tiene valor = ...
		
		fichero_propiedaes=new Properties();
		
		FileReader fr = new FileReader("db.properties");
		
		fichero_propiedaes.load(fr);
		
	    String valor_driver=fichero_propiedaes.getProperty("driver");// dar el valor del driver que esta en fichero a variable valor_driver
	    
	    System.out.println(valor_driver);
	    
        String cadena_conexion=fichero_propiedaes.getProperty("cadena_conexion");
	    
	    System.out.println(cadena_conexion);
	    
        String user=fichero_propiedaes.getProperty("user");
	    
	    System.out.println(user);
	    
        String password=fichero_propiedaes.getProperty("password");
	    
	    System.out.println(password);
	    
       String zaineb=fichero_propiedaes.getProperty("zaineb");
	    
	    System.out.println(zaineb);
	    
	   fichero_propiedaes.setProperty(zaineb, password);
	   System.out.println(zaineb);
	    
	   

	   
	    fr.close();
	}

}
