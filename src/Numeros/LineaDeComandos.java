package Numeros;

import java.util.Scanner;

public class LineaDeComandos {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		float numero=0;
		float numeroMayor=0;
		
		
		for (int i=1; i<=10 ;i=i+1 )
		{
			//inicio del bucle
			
			   System.out.println("numero"+i); // el + k hay antes j se llama concatenar es para juntar las dos en una frase
				
				Scanner scanner = new Scanner(System.in);
				
				numero = scanner.nextFloat(); 
				
				
				if(numero>numeroMayor)
				{
					numeroMayor= numero;
					
				}
				
/////////////////////// si tengo la foncion pedir numero /////////////////////
				
				
			/*numero=pedirNumero();    */			
			
		}
		
		System.out.println("He terminado el boucle");
		 System.out.println("El numero mayor es :"+ numeroMayor);
	}

}
