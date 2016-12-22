package Numeros;
//package edu_femxa_val;

import java.util.Scanner;

public class numero_mayor {
	
public static void main(String[] args) {
	

	float numero1 = 0;
	
	System.out.println("1 numero");
	
	numero1= pedirNumeroFloat();

	float numero2 = 0;
	
	System.out.println("2 numero");
	
	numero2 = pedirNumeroFloat();
	
     float numero3 = 0;
	
	System.out.println("3 numero");
	
	numero3 = pedirNumeroFloat();
	
	
	   mayor(numero1,numero2,numero3);
	
}


////////////////////////////////// foncion pedir numero ////////////////////////////////////


public static float pedirNumeroFloat() {
	/**
	 * pido un numero por teclado al usario
	 * 
	 * @return el numero introducido por el usario
	 */

	float num_leido = 0;
		
		Scanner scanner = new Scanner(System.in); // objeto scanner para leer de
												// teclado
		num_leido = scanner.nextFloat(); // leido de teclado y asigno el valor
										// a num_leido

	return num_leido;


}

///////////////////////// foncion de comparer los numeros //////////////////////////////

       public static void mayor(float num1,float num2,float num3) 
       {
	


    		if (num1 >num2 && num1>num3)
	  		{
    			System.out.println("El  mayor numero es el primero :" +num1);


	  		}
	  		else if (num2>num1 && num2>num3)
	  		{
	  			System.out.println("El mayor numero es el segundo :" +num2);
	  		   
	  		}
	  		else  if (num3>num1 && num3>num2)
	  
	  		{
	  			System.out.println("El mayor numero es el tercero :" +num3);
	  			
	  	    }
	  		else
	  		{
	  			System.out.println("dos numero o las tres son iguales");
	  		}
    		
    		
	  		



}


}