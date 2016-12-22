package Palabra_Letra;

public class Cesar {

	///////////// del profe /////////

	public static void main(String[] args) {
		Cesar cesar = null;
		cesar = new Cesar();

		String resultado = cesar.cifradoCesar("PAPI CHULO", 1);
		System.out.println(resultado);

		// char resultado2 = cesar.traduceCharCesar('a', 3);
		// System.out.println(resultado2);

	}

	public String cifradoCesar(String palabra, int clave) {
		
			String palabra_cifrada = null;
		int longi = palabra.length();
		char caracter_actual = 0;
		palabra_cifrada = new String();
		/////////////////// sin llamada del metodo de cifrar caracter ////////////////////
		
//		int numero_caracter = 0;
//		char caracter_cifrado = 0;
//		for (int pos = 0; pos < longi; pos++) {
//			caracter_actual = palabra.charAt(pos);
//			if (caracter_actual != ' ') {
//				numero_caracter = (int) caracter_actual;
//				numero_caracter = numero_caracter + clave;
//				caracter_cifrado = (char) numero_caracter;
//				traduceCharCesar(caracter_actual, 3);
//				palabra_cifrada = palabra_cifrada + caracter_cifrado;
//			} else {
//				palabra_cifrada = palabra_cifrada + caracter_actual;
//			}
//		}
//		return palabra_cifrada;
		
		////////////////// con uso del metodo q cifrar caracter /////////////////
		
		for (int pos = 0; pos < longi; pos++)
		{
      		   caracter_actual = palabra.charAt(pos);
      		
            	char caracter_cifrado=traduceCharCesar(caracter_actual,clave);
         	
        	    System.out.println(caracter_cifrado);
      	
        	    palabra_cifrada = palabra_cifrada + caracter_cifrado;
	   	}
	     	return palabra_cifrada;
		
	}

	///////////////////////////////////////////

	public static char traduceCharCesar(char c, int clave) {
		char caracter = 0;
		int numero = 0;
		if (c != ' ') {
			numero = (char) c;
			caracter = (char) ((int) numero + clave);
		} else {
			System.out.println(" ");
		}
		return caracter;
	}

}

//////////////// mio y no se porque no fuciona //////////

//
// public static void main(String[] args) {
//
// Cesar cesar =null;
// cesar=new Cesar();
// //cesar.mostrarCodChars("LOLIPOP");
// cefraClave3("papi chulu",3);
//
// }
//
// public void mostrarCodChars(String cadena)
// {
//
//
//// int longi=cadena.length();
//// for(int pos=0;pos<longi;pos++)
//// {
//// cadena.charAt(pos);
//// System.out.println(cadena.charAt(pos));
//// }
//
// }
//
//
// public static String cefraClave3(String palabra, int clave)
// {
// String palabra_cifrada="";
// int longi=palabra.length();
// int caracter_n=0;
// char caracter=0;
// char caracter_cifrado=0;
//
//
// for(int pos=0;pos<longi;pos++)
// {
// caracter=palabra.charAt(pos);
// if(caracter!=' ')
// {
// //cojo caracter cambiarlo al numero somarlo el clave y cambiarlo al caracter
// // hacemos el casting
// caracter_n=(int)caracter;
// caracter_cifrado=(char)(caracter_n+clave);
// System.out.println(caracter_cifrado);
//
// palabra_cifrada=palabra_cifrada+caracter_cifrado;
//
// }
// else
// {
// palabra_cifrada=palabra_cifrada+caracter_cifrado;
// }
// }
// //System.out.println(palabra_cifrada);
//
// return palabra_cifrada;
// }

//
// }
