package Palabra_Letra;

public class Cadina {

	public static void main(String[] argumentos) {
		
		///////b dereche de clase cadina    run as   run configuracion argument y escribir la frase ///
		
		/* System.out.println("Palabra 1 = "+ argumentos[0]);
		 System.out.println("Palabra 2 = "+ argumentos[1]);
		 System.out.println("Palabra 3 = "+ argumentos[2]);*/

		 int numPalabras = argumentos.length;
		
		 
		 // recorriendo un array de palabras
		 
		 for(int i=0;i<numPalabras;i++)
		 {
			 System.out.println("Palabra  "+i+ "es "+ argumentos[i]);
		 }
		 
	}

}
