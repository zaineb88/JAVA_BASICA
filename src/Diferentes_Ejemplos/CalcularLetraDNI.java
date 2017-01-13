package Diferentes_Ejemplos;

import java.util.Scanner;

public class CalcularLetraDNI {
	public static void main(String[] args) {
		
		
		String letras[] = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"}; // con el uso de array
		
		String letras1="TRWAGMYFPDXBNJZSQVHLCKE"; 
		int dni;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce tu DNI");
		dni=teclado.nextInt();
		int posicion=dni%23;
		System.out.println("Tu letra es: "+letras[posicion]);
		System.out.println("NIF: "+dni+"-"+letras[posicion]);
		System.out.println("NIE : X-"+dni+"-"+letras[posicion]);
		
		System.out.println(letras1.charAt(posicion)); // con el uso de array
		}
	

}


