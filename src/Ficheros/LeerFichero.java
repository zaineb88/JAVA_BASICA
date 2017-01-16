package Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import Numeros.numero_mayor;

public class LeerFichero {
	
	///////////////////////// antes he creado un fichero con el nombre zaineb 
	// button derecha   new file 

	public static void main(String[] args) throws IOException {
		
        //File archivo = new File("pepe");
        FileReader file_reader = new FileReader(new File ("zaineb"));
        int a = 0;
        int suma = 0;
        
        /*
         * Hacer un bucle para leer un fichero desde el principio hasta el final
         * e imprimir el número que suman todas las letras que hay dentro del
         * fichero.
         */
        while (a != -1)
        {
            char c = (char) a; //Casting: conversión de tipos equivalentes.
            if(c != ' ' && a != 0)
            {
                System.out.println(c +" " +a);
                suma += a;
            }
            a = file_reader.read();
        }
        
        System.out.println(suma);
        file_reader.close();
    }

		
	

//		// hay algun error
//
//		File archivo=new File("fichero\\zaineb");
//		FileReader filereader =new FileReader(archivo);
//		int suma=0;
//		int a=0;
//		
//		while(filereader.read()!=(-1))
//		{  a=filereader.read();
//			System.out.println(a);
//			suma=suma+a;
//
//			
//		}
//					System.out.print("la suma es "+suma);
//				
//					filereader.close();
//	}
//
}
