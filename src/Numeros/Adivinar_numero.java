package Numeros;

import java.util.Scanner;

public class Adivinar_numero {
	
	public static void main(String[] args) {
		Adivinar();
	}
	public static void Adivinar ()
	{
		
	int x=(int)(100*Math.random()+1);
	
	 /////////////////////////// con el uso de for ///////////////////
	
//	for(int i=0;i<5;i++)
//	{
//		int numero=pedirNumero();
//		
//		if(x==numero)
//		{
//			System.out.println("los dos numeros son iguales");
//		}
//		else if (x<numero)
//	        	{
//			      System.out.println("eliges utro numero menos que este numero");
//	        	}
//		   else
//	        	{ System.out.println("eliges utro numero mayor que este numero");}
//	}
//	    System.out.println("Losiento ha terminado sus intentos");
	
	////////////////// con uso de  do while ////////////////////////
	
	  int con=0;
	  int numero=0;
	do
	{ 
		numero=pedirNumero();
	    if(x==numero)
		{
			System.out.println("los dos numeros son iguales");
		}
		if (x<numero )
	        	{
			      System.out.println("elige otro numero menos que este numero");
			   
	        	}
		   else
	        	{ System.out.println("elige otro numero mayor que este numero");
	        	 }
		con ++;
	   }while(con<5 && x!=numero);
	
		if(x!=numero)
			System.out.println("Losiento ha terminado sus intentos");
	    

	

	}
	
	  ///////////////////////////////////////////
	
	public static int pedirNumero() {
	

		int numero = 0;
			System.out.println("Dame un numero entre 1 y 100");
			Scanner scanner = new Scanner(System.in);
			numero = scanner.nextInt(); 

		return numero;


	}
}
