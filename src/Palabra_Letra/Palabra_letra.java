package Palabra_Letra;

import java.util.Scanner;

public class Palabra_letra {

	private String palabra;
	private char letra;

	// public static int leng=palabra.length();

	public static int indi = 0;

	public String getPalabra() {
		return palabra;
	}

	public char getLetra() {
		return letra;
	}

	public static void main(String[] args)

	{

		// mostrar();

		// letrasDePalabra();

		//primerasLetras("string", 5);
		
		//ultimasLetras("zaineb",2);
		
		//palabraArevez("mazouz");
		
	     //  nLetrasArevez("juan",2);
	      
	     NLetraEnPalabra("sousou",'s');
	}

	public static void mostrar() {

		int indi = 0;
		String palabra = mostrarPalabra();

		char letra = mostrarLetra();

		int leng = palabra.length();

		char l;

		do {
			l = palabra.charAt(indi);
			indi++;

		} while (l != letra || indi < leng);
		if (l == letra) {
			System.out.println("si la letra hay");
		} else {
			System.out.println("la letra no hay");
		}

	}

	public static String mostrarPalabra() {
		String palabra;
		System.out.println("Dame una palabra ");
		Scanner scanner = new Scanner(System.in);
		return palabra = scanner.nextLine();
	}

	public static char mostrarLetra() {
		String letra;
		System.out.println("Dame una letra");
		Scanner scanner = new Scanner(System.in);
		letra = scanner.nextLine();
		char l = letra.charAt(0);
		return l;
	}

	public static int pedirNumero() {
		int n;
		System.out.println("Dame un numero ");
		Scanner scanner = new Scanner(System.in);
		return n = scanner.nextInt();
	}

	// HACED UN MÉTODO QUE DADA UNA CADENA, MUESTRE CADA UNA DE LAS LETRAS CON
	// UN BUCLE FOR

	public static void letrasDePalabra() {

		String palabra = mostrarPalabra();
		int leng = palabra.length();

		for (int i = 0; i < leng; i++) {
			System.out.println(palabra.charAt(i));
		}
	}

	// HACED UN MÉTODO QUE DADA UNA CADENA Y UN NÚMERO N, MUESTRE LOS N PRIMEROS
	// NÚMEROS DE LA CADENA

	// public static void metodo2()
	// {
	//
	// String palabra=mostrarPalabra();
	// int n=pedirNumero();
	//
	//
	// for(int i=0;i<n ;i++)
	// {
	// System.out.println(palabra.charAt(i));
	// }
	// }
	//

	//////////////// lo mismo con otra manera /////////

	public static void primerasLetras(String palabra, int n) {

		for (int i = 0; i < n; i++) 
		{
			if (n < palabra.length())
			{
				System.out.println(palabra.charAt(i));
			}
		}
		if(n>palabra.length())
		{
			System.out.println("el numero mayor que la lengtud de las letras del palabra");
		
		}

	}

	// HACED UN MÉTODO QUE DADA UNA CADENA Y UN NÚMERO N, MUESTRE LOS N ÚLTIMOS
	// NÚMEROS DE LA CADENA

	public static void ultimasLetras(String palabra, int n) {

		for (int i =(palabra.length()-n) ; i <palabra.length() ; i++) 
		{
		
				System.out.println(palabra.charAt(i));
				
		
		}
		
			
    	if(n>palabra.length())
	  {
		System.out.println("el numero mayor que la lengtud de las letras del palabra");
		}
	}
	
	/////////////palabra areves /////////////////
	
	public static void palabraArevez(String palabra) {
  
        
		for (int i =(palabra.length()-1); i >=0; i--) 
		{
		
				System.out.println(palabra.charAt(i));	
	
		}}
		
		//////////// n letras arevez /////////////
		
		public static void nLetrasArevez(String palabra, int n)
		{
			
			int lim_sup=(palabra.length()-1);
			int lim_inf=(palabra.length()-n);
		while(lim_sup>=lim_inf)
		{System.out.println(palabra.charAt(lim_sup));
		lim_sup--;}
			
		}
		
		
		//HACED UN MÉTODO QUE DADA UNA CADENA Y UNA LETRA, DEVUELVA EL NÚMERO DE VECES QUE APARECE ESA LETRA EN ESA PALABRA
		
		public static int NLetraEnPalabra(String cadena,char letra)
		{
			int nVeces=0;
			for(int i=0;i<cadena.length();i++)
			{
				if(letra==cadena.charAt(i))
				{nVeces=nVeces+1;}
				//System.out.println(nVeces);
			}
			return nVeces; // return no fuciona no se porque
		}	
		
}
	