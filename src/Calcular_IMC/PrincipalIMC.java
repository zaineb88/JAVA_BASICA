package Calcular_IMC;

import java.util.Scanner;

public class PrincipalIMC {

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// pedir peso
		// pedir altura
		// calcular imc=peso/altura*altura
		// mostrar
		///////////////////////////////// con datos exactos// /////////////////////////////////////////

		/*
		 * double peso = 83.5; // peso en kg double altura = 1.83; // altura en
		 * m double imc = peso / (altura*altura); System.out.println(imc);
		 */

		////////////////////////// con el metodo Scanner
		////////////////////////// ////////////////////////////////////////////////
		/*
		 * double peso =0; System.out.println("Introduzca el peso (kg)");
		 * Scanner scanner= new Scanner(System.in); peso =scanner.nextDouble();
		 * 
		 * double altura =0; System.out.println("Introduzca el altura (m)");
		 * Scanner scanner2= new Scanner(System.in); altura
		 * =scanner2.nextDouble();
		 * 
		 * double imc= peso /(altura*altura); System.out.println("Su IMC es:");
		 * System.out.println(imc);
		 */

		/*
		 * if (imc<16); System.out.println("ES desmutrido");
		 * 
		 * if(16>imc); System.out.println("Es bajo peso");
		 */

		///////////////////////////////// con el uso del metodo pedirNumero lo
		///////////////////////////////// que hemos hecho a
		///////////////////////////////// bajo //////////////////////////////////////////////

		// lo mismo pero con utilisacion de metodo pedirNumero

		float peso = 0;
		System.out.println("Introduzca el peso (kg)");
		peso = pedirNumeroFloat();

		float altura = 0;
		
		System.out.println("Introduzca el altura (m)");
		
		altura = pedirNumeroFloat();

		//float imc = peso / (altura * altura);
		
		
		System.out.println("Su IMC es:");
		
        float imc=0;
		
		imc=calcularIMC(peso,altura);
		
		System.out.println(imc);
		
		mostrarResultadoIMC(imc);


	}


	//////////////////////// fonccion para llamar un double ///////////////////

	public static double pedirNumeroDouble(/* la entrada */) {
		/**
		 * pido un numero por teclado al usario
		 * 
		 * @return el numero introducido por el usario
		 */

		double num_leido = 0;
		Scanner scanner = new Scanner(System.in); // objeto scanner para leer de
													// teclado
		num_leido = scanner.nextDouble(); // leido de teclado y asigno el valor
											// a num_leido

		return num_leido;

	}
	
	
	
	
	///////////////////////// fonccion de mostrar datos con uso de if y else //////////////////////
	
	/**
	 * informe al usario de su imc nominal 
	 * @param imc
	 */
	      public static void mostrarResultadoIMC(float imc)
	      {

	  		
	  		if (imc < 16)
	  		{
	  		   System.out.println("ES desmutrido");
	  		}
	  		else if (16 <=imc && imc<18.5)
	  		{
	  		   System.out.println("Es bajopeso");
	  		}
	  		else  if (imc>=18 && imc <25)
	  		{	
	  	    	System.out.println("normal");
	  		}
	  		else if (imc>=25 && imc <30)
	  		{		
	  			System.out.println("sobrepeso");
	  		}
	  		else if (imc>=30)  // podemos quetar el (imc>=30)
	  		{
	  			System.out.println("obeso");
	  	    }
	  		
	      }
	      
	      
	       
	      ////////////////////////// fonccion de calculat imc ////////////
	      public static float calcularIMC(float peso,float altura)
	      {
	    	 float imc=0;
	    	   imc=peso/(altura*altura);
	    	  return imc;
	      }
	      
	      
	      

	///////////////////// fonccion para pedir un float /////////////////////

	public static float pedirNumeroFloat(/* la entrada */) {
		/**
		 * pido un numero por teclado al usario
		 * 
		 * @return el numero introducido por el usario
		 */

		float num_leidoF = 0;
			
			Scanner scanner = new Scanner(System.in); // objeto scanner para leer de
													// teclado
			num_leidoF = scanner.nextFloat(); // leido de teclado y asigno el valor
											// a num_leido

		return num_leidoF;

	}

}
