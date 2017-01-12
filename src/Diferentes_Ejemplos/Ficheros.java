package Diferentes_Ejemplos;

import java.io.File;
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
	
	 boolean res=createNewFile();
	
	if(res)
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

	///////////////////////////// crear un fichero con nombre pedido desde el usario
	
	public static boolean createNewFile()
	{
		boolean res=true;
		
		String nombreFichero=null;
		Scanner sc=null;
		sc=new Scanner(System.in);
		nombreFichero=sc.nextLine();
		
		 File file=new File("C:\\Users\\Administrador\\nombreFichero");
		 createNewFile();
		return res;
	}
	
	
}
