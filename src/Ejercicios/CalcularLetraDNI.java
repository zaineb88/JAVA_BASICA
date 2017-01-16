package Ejercicios;

import java.util.Scanner;

public class CalcularLetraDNI {
	public static void main(String[] args) {
		
		
	char letra=letraDNI();
		
		System.out.println("Su letra es: "+letra);
		}
	
	
	
	public static char letraDNI ()
	{
		char letra=0;
		

		//String letras[] = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"}; // con el uso de array
		
		String letras1="TRWAGMYFPDXBNJZSQVHLCKE"; 
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce tu DNI");
		int dni;
		dni=teclado.nextInt();
		int posicion=dni%23;
		
//		System.out.println("Tu letra es: "+letras[posicion]);
//		System.out.println("NIF: "+dni+"-"+letras[posicion]);
//		System.out.println("NIE : X-"+dni+"-"+letras[posicion]);
        
		letra=letras1.charAt(posicion);
	
		
		return letra;
	}
	


}


