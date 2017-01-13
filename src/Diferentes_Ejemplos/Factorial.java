package Diferentes_Ejemplos;

public class Factorial {

	public static void main(String[] args) {
		
		
		imprimirFactorial(5);

	}
		
		 	public static void imprimirFactorial(int numeroDeMultiplicaciones)
		 	{
		 		int factorial = 1;
		 		int numeroRevertido = 1;
		 		
		 		while(numeroDeMultiplicaciones!=0)
		 		{
		 			  factorial=factorial*numeroRevertido;
		 			  numeroDeMultiplicaciones--;
		 			  numeroRevertido++;
		 			  System.out.println(factorial);
		 	}
		 	
	}

}
