package Diferentes_Ejemplos;

import java.io.File;

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

	}

}
