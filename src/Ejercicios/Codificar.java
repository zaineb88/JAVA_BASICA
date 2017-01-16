package Ejercicios;

import Numeros.numero_mayor;

public class Codificar {
	
	public static void main(String[] args) {
		
		
//		
//		String cadena=codificar("zaineb");
//		System.out.println(cadena);
//		
//		String cadena2=decodificar(cadena);
//		System.out.println(cadena2);
		
		//////////////////////
		
		int [] num=codificar2 ("zaineb");
		
        for(int i=0;i<num.length;i++)		// cuando tienes un metodo que revolve un array tienes que utilisar el for en la llamada del metodo
        {
        	System.out.println(num[i]);
        }
        	
		String cadena= decodifica2(num);
		System.out.println(cadena);
		
	}
	
//	/**
//	 * es un metodo de resive una palabra y te da esa palabra areves
//	 * @param cadena
//	 * @return cadena areves
//	 */
//	
//	public static String codificar (String cadena)
//	{  
//		String cadenaCodificada="";
//		int leng=cadena.length();
//		
//		for(int i=leng-1;i>=0;i--)
//		{
//			cadenaCodificada=cadenaCodificada+(char)cadena.charAt(i);
//		}
//		
//		return cadenaCodificada;
//		}
//	
//	
//	public static String decodificar (String cadena)
//	{  
//		
////		String cadenaDecodificada="";
////		int leng=cadena.length();
////		
////		for(int i=leng-1;i>=0;i--)
////		{
////			cadenaDecodificada=cadenaDecodificada+(char)cadena.charAt(i);
////		}
////		
////		return cadenaDecodificada;
//		
//		return codificar(cadena);
//		}
//	
//	
//	
	
	
	
	/////////////////////////////////////////
	
	
	public static int [] codificar2 (String cadena)
	{

		int longi = cadena.length();
		char caracter_actual = 0;
		
		
		int  numero_caracter[] = new int [longi];
		
		
		for (int pos = 0; pos < longi; pos++) {
			caracter_actual = cadena.charAt(pos);
			
				numero_caracter[pos] =(int) caracter_actual ;	
		
			}
		
	return numero_caracter;
		
	} 
			
	
	/////////////////////// 
	
	public static String decodifica2( int num [])
	
	{   int longi=num.length;
		String cadena="";
		int num_actual=0;
		char caracter=0;
		
		for (int pos = 0; pos < longi; pos++) {
			num_actual = num[pos];
		
				caracter = (char) num_actual;
			cadena=cadena+caracter;
			
			}
		
		return cadena;
	}
	
	
	
	
//	
////fin clase
}
