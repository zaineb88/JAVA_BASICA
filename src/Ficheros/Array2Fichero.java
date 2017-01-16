package Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Array2Fichero {
	
	public static void main(String[] args) {
		
    String [] lista=fromFichero2Array("zaineb");
		
        for(int i=0;i<lista.length;i++)	
        {
        	System.out.println(lista[i]);
        }
        	
	
		
		
	}
	
	public static String [] fromFichero2Array(File file) throws FileNotFoundException
	{  
		String [] lista_cadena=null;
		
        FileReader file_reader = new FileReader(new File ("zaineb"));
        int a = 0;
        int suma = 0;
        
      
        while (a != -1)
        {
            char c = (char) a; 
            if(c != ' ' && a != 0)
            {
                System.out.println(c);
             
            }
         //   a = file_reader.read();
        }
    
     //   file_reader.close();
    

		
		
		return lista_cadena;
		
	}
	
	
	
	public static boolean fromArray2Fichero(String [] lista_cadena)
	{
		boolean res=false;
		
		
		return res;
	}

	
	//fin de clase
}
