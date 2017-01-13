package Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ficheros {

	public static void main(String[] args) {

		///// antes he ido a button derecha en espacio y hace new folder con
		///// nombre fichero

		/////////////// crear la carpeta

		File file = null;
		File file2 = null;
		

		file = new File("fichero");
		file2 =new File("C:\\Users\\Administrador\\proyectos_java"); // cuando copias URI tienes que añadir barra para descapas porque una barra es un caracter especial para java
 
		/////////////////////////// aber si la carpera existe

		if (file2.exists()) {
			System.out.println("El fichero existe");

			// listar los que hay en la carpeta
			
			String[] lista = null;
			lista = file2.list();
			
			for (int i = 0; i < lista.length; i++)
			{        
				if(    (lista[i].contains("a")) || (lista[i].contains("A"))) // listar solo los reposetorios que llevan en su nombre la letra a
				{
				System.out.println(lista[i]);
				}
			}

		} else {
			System.out.println("El fichero no existe");

		}
		
	
	//////////////////// llamada de los metodos
		
		System.out.println("llama del metodo");
	
     //listaDirectorio("fichero");
	
//	 boolean res=crearFichero();
//	
//	if(res)
//	{
//		System.out.println("el fichero ha creado");
//	}
	
	 boolean res2=borraFichero();
		
		if(res2)
		{
			System.out.println("el fichero ha creado");
		}
	
	}
	
	
	/////////////////////////////listar directorio y lo que esta entre los directorios de cada directio
	
	public static void listaDirectorio(String nombre)
	{
		File directorio=new File(nombre);
		String[] lista_ficheros=null;
		System.out.println(directorio.getName());
		
		if(directorio.isDirectory())
		{
			lista_ficheros=directorio.list();
			for(int i=0;i<lista_ficheros.length;i++)
			{
				listaDirectorio(nombre+"\\"+lista_ficheros[i]);
			}
		}
		
	}

	///////////////////////////// crear un fichero con nombre pedido desde el usuario
	
	public static boolean crearFichero()
	{
		boolean res=false;
		
		//////////////// pedir nombre desde el usario 
		
		String nombreFichero=null;
		Scanner sc=null;
		sc=new Scanner(System.in);
		System.out.println("Elige un nombre del fichero");
		nombreFichero=sc.nextLine();
		
		/////////////////////// crear fichero    // utilisamos el metodo file.createNewFile();
		
		File file=new File("C:\\Users\\Administrador\\"+nombreFichero);
		
		try {
			  // A partir del objeto File creamos el fichero físicamente
			  if (file.createNewFile())
			    System.out.println("El fichero se ha creado correctamente");
			  else
			    System.out.println("No ha podido ser creado el fichero");
			} catch (IOException ioe) {
			  ioe.printStackTrace();
			}
	
		return res;
	}
	
	
	////////////////////////////////////////// crear un metodo para borrar un fichero  // utilisamos el metodo file.delete();
	
	public static boolean borraFichero()
	{
		boolean res=false;
		String nombreFichero=null;
		Scanner sc=null;
		sc=new Scanner(System.in);
		
		System.out.println("Elige un nombre del fichero que quieres borrar");
		nombreFichero=sc.nextLine();
		
		File file=new File("C:\\Users\\Administrador\\"+nombreFichero);
		if (file.delete()) 
			   System.out.println("El fichero ha sido borrado satisfactoriamente");
			else
			   System.out.println("El fichero no puede ser borrado");
		
		
		
		return res;
	}
	

	
	
//fin de la clase
}
