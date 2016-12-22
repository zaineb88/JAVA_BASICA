package Numeros;

import java.util.Scanner;


public class NumeroPares {
	
	
	//////////////////////////// funcion nota suspensa ////////////////////////
	
	public static boolean notaSuspensa(int nota)
	{
		boolean suspenso=false;
		
		if(nota<5)
			
		{    suspenso =true;}
		
		else
		{suspenso=false;}
		
		return suspenso;
	}
	
	

	////////////////////////// foncion de pedir numero ////////////////////////// 
	
	public static int pedirNumero() {

		int num_leido = 0;

		Scanner scanner = null;

		scanner = new Scanner(System.in); // objeto scanner para leer de teclado

		num_leido = scanner.nextInt(); // leido de teclado y asigno el valor a
										// num_leido

		return num_leido;

	}

	
	////////////////////////////////////// funcion para comprobar numero si es pares o no//////////////

	public static boolean esPar(int numero) {
		boolean bul = false;
		if (numero % 2 == 0) {
			bul = true;
		} else {
			bul = false;
		}
		return bul;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// System.out.println("Los 50 primeros numeros pares son :");

		/*
		 * for(int i=0;i<=100;i=i+2) {
		 * 
		 * /*if(i%2==0) { System.out.println(i); // con otra manera }
		 * 
		 * 
		 * System.out.println(i); }
		 */

		//////////////////////////////// con manera de division//////////////////////////////// //////////////////

		/*
		 * int resto = 0; int num_veces_imprimo = 0; for( int i = 0; i <=100;
		 * i++) { resto = i%2; if ((resto == 0)&&(num_veces_imprimo<50))
		 * 
		 * { System.out.println("Numero par " +i); num_veces_imprimo =
		 * num_veces_imprimo + 1; } }
		 */
		////////////////////////// con un numero pedido desde el usario	////////////////////////// //////////

	/*	System.out.println("por favor entroduzca un numero");

		int numero_pedido = pedirNumero();
		int n_pares_parecido = 0;
		int cont = 0;
*/
		/////////////////////////////////// lo mismo con uso de dos for	/////////////////////////////////// //////////////////////
		

	/*	for (int i = 0; i < numero_pedido; i++) 
		{
			for (int j = i; j <= n_pares_parecido; j++) 
				{
					if (cont % 2 == 0) 
						{
							System.out.println(cont);
							n_pares_parecido++;
						}
				cont++;
			}
		}
		System.out.println("han parecido " + n_pares_parecido);*/
		

		//////////////////////////////////// con uso de while///////////////////////////////// //////////////////////////////////

		/*
		 * while(n_pares_parecido < numero_pedido) // hemos quitado el igual pork sino va a salir una mas del numeropedido {
		 * 
		 * if(cont%2==0) { System.out.println(cont); n_pares_parecido++; }
		 * cont++; } System.out.println("han parecido "+ n_pares_parecido);
		 */

		///////////////////////////////// con uso del modulo es pares//////////////////////////// ///////////////////////////////

		/*
		 * while(n_pares_parecido < numero_pedido) {
		 * 
		 * if(cont%2==0) { System.out.println(cont); n_pares_parecido++; }
		 * cont++; } System.out.println("han parecido "+ n_pares_parecido);
		 * 
		 */
		
		

        /////////////////////////////////////////// aprobar nota //////////////////////////////
     	
     	/* int nota_introducida=0;
		
		do
		{
			System.out.println("Dame nota ");
			nota_introducida=pedirNumero();
		}
		   while (nota_introducida<5);
		
	     	System.out.println("Aprobaste");*/
		
		
   /////////////////////////////////////////// aprobar nota con fucnion de notasuspens //////////////////////////////////////////////////
	
		int nota_introducida=0;
		
		do
		{
			System.out.println("Dame nota ");
			nota_introducida=pedirNumero();
		}
		   while (notaSuspensa(nota_introducida));
		
	     	System.out.println("Aprobaste");
	     	
	     	
	}
}
