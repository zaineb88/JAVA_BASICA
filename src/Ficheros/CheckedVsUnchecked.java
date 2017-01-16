package Ficheros;

public class CheckedVsUnchecked {

	public static void main(String[] args) {
		
		String cadena=null;
		
		
		try {
			
			cadena="HOLA";
		int tamanio=cadena.length();
		System.out.println(tamanio);
		
		
		} 
		
		catch (Exception e) {
	
			System.out.println("EXCEPCION PRODUCIDA");
		}
		
		

	}

}
