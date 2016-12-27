package Palabra_Letra;

public class Argumentos {

	public static void main(String[] argumentos) {
		
			int numPalabras = argumentos.length;
			
		///////////////////////////////// con el uso del for /////////////

	
//
//		
//		for (int i = 0; i < numPalabras; i++) {
//			
//			for (int j = 0; j <argumentos[i].length(); j++) // mejor con while para k se parece un i no se falta k segues en bucle
//			{
//	
//				if (argumentos[i].charAt(j) == 'i')
//				{
//					System.out.println(argumentos[i]);
//				}
//
//			}
//		}
//
	
	 
	/////////////////////////////// con el uso de metodo de palabraTieneI
		

		
		for (int i = 0; i < numPalabras; i++)
		{
			if(palabraTieneI(argumentos[i])==true)
			{
				System.out.println(argumentos[i]);
			}
	
		}
		
		
	
	
	}

	//////////////////////////////////////////////////////////
	
	public static boolean palabraTieneI (String palabra)
	{ 
		boolean tieneI=false;
		int indice=0;
		int leng =palabra.length();
		
		while((indice<leng) && (!tieneI))
		{
		if(palabra.charAt(indice) == 'i')
		   {
			tieneI=true;
		   }
		indice++;
		}
		return tieneI;
		
	}
	
	
	
	
	
			
	
	
}



