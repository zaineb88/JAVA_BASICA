package Ejercicios;

public class FraseJunta {

	public static void main(String[] args) {

		String frase2 = fraseJunta("hola me llamo zaineb");
		System.out.println(frase2);

		
	}

	
	
	public static String fraseJunta(String frase) {
		String fraseSalida = "";
		int leng = frase.length();

		fraseSalida= frase.replace(" ", ""); //  replacar lo que esta en 2 lado en la primer lado
		
		///////////// con otra manera
		
//		for (int i = 0; i < leng; i++) {
//			if (frase.charAt(i) != ' ') {
//
//				fraseSalida = fraseSalida + frase.charAt(i);
//			}
//
//		}

		return fraseSalida;
	}

}


