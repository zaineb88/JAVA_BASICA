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

		// hay lagun error

		File archivo=new File("fichero\\zaineb");
		FileReader filereader =new FileReader(archivo);
		int suma=0;
		
		while(filereader.read()!=(-1))
		{ int a=filereader.read();
			System.out.println(a);
			suma=suma+a;

			
		}
					System.out.print("la suma es "+suma);
				
					filereader.close();
	}

}
