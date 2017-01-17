package Ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Array2Fichero {

	public static void main(String[] args) throws IOException {

		File file = null;
		file = new File("zaineb");
		int num = cuentaLineas(file);
		String[] lista_cadena = new String[num];

		lista_cadena = fromFichero2Array(file);

		for (String cadena : lista_cadena) // for each es como for normal pero
											// con otra manera
		{
			System.out.println(cadena);
		}

		/////////////////// lamada de 2 metodo

		boolean res = fromArray2Fichero(lista_cadena);
		System.out.println(res);
		// fin de main
	}

	public static String[] fromFichero2Array(File file) throws IOException {

		int num_lineas = cuentaLineas(file);

		String[] lista_cadena = null;
		lista_cadena = new String[num_lineas];

		String linea = "";

		BufferedReader br = new BufferedReader(new FileReader(new File(file.getName()))); // FileReade para leer char BufferedReader para leer String

		int i = 0;
		linea = br.readLine();
		while (linea != null) {
			lista_cadena[i] = linea;
			linea = br.readLine();
			i++;
		}

		br.close();
		return lista_cadena;

	}

	public static boolean fromArray2Fichero(String[] lista_cadena)  {
		boolean res = true;
		FileWriter fw = null; // para escribir en un fichero
		BufferedWriter bw = null;

		try {
			fw = new FileWriter("ficheroCreado");
			bw = new BufferedWriter(fw);

			for (String cadena : lista_cadena) {
				bw.write(cadena);
				bw.newLine();
			}
		} catch (IOException e) {
			System.out.println("Fichero creado");
			e.printStackTrace();
		}
		
		finally {
			
		     
		  try
		
		  {
		
			  bw.close();
		
			  fw.close();
		
		  }catch(Exception e)
		
		  {
			  System.out.println("Error cerrando fichero salida");
			  e.printStackTrace();
			  res=false;
		  }
	}
		return res;
	}

	//////////////////////////// metodo para contar las lineas de un fichero

	public static int cuentaLineas(File file) throws IOException {
		int num_lineas = 0;
		FileReader file_reader = new FileReader(new File("zaineb"));
		BufferedReader br = new BufferedReader(file_reader);

		while (br.readLine() != null) {
			num_lineas++;
		}
		br.close();

		return num_lineas;
	}

	// fin de clase
}
