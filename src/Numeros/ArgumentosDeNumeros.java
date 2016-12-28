package Numeros;

import java.util.Scanner;

public class ArgumentosDeNumeros {

	public static void main(String[] args) {

		int array[] = new int[10];


		/////////////////// inicializo el array con numeros aleatorios

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (100 * Math.random() + 1);
		}
//
//		////////////////////// muesto
//
		for (int i = 0; i < array.length; i++) {
			System.out.println("num pos " + i + " " + array[i]);

		}

		/////////////////////// andicar el posision del n 3 entre en array
		
//		int ae[] = new int[5];
//		ae[0] = 1;
//		ae[1] = 2;
//		ae[2] = 5;
//		ae[3] = 6;
//		ae[4] = 7;
//
//		int n_usuario = 3;
//
//		int pos = obtenerPos(ae, n_usuario);
//
//		System.out.println("El numero " + n_usuario + " debe ir en " + pos);

		//////////////////////////////////////////////// las llamada del metodos

    	ordenaBurbuja(array);
	  //ordenar2(array);
		//desplazar( array);
	

	}

	/////////////////////////////////// otra manera de ordenar (mia)
	public static void ordenar2(int array[]) {
		int aux = 0;

		for (int j = array.length-2; j >= 0; j--) {
			for (int i = 0; i <= j; i++) {
				if (array[i] > array[i + 1]) {
					aux = array[i];
					array[i] = array[i + 1];
					array[i + 1] = aux;
				}
			}
		}
		System.out.println("Los numeros ordenados: ");
		for (int i = 0; i < 10; i++) {
			System.out.println(array[i]);
		}
	}

	////////////////////////////// metodo de ordenar numero de burbuja (profe)

	public static void ordenaBurbuja(int array[]) {
		int aux = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
				}
			}
		}
		System.out.println("los numeros ordenados");
		for (int i = 0; i < array.length; i++) {
			System.out.println("Num en pos " + i + " " + array[i]);
		}

	}


	///////////////////////////// metodo obtenerPos

	public static int obtenerPos(int ae[], int n_usario) {
		int pos = 0;
		while (n_usario > ae[pos] && pos < ae.length) {
			pos++;
		}

		return pos;

	}


	
	////////////////////////////// metodo de remplazar
	public static void desplazar(int array[])
			{int aux=array[array.length-1];
		
		for (int i = array.length-1; i >0; i--) {
			
			array[i]=array[i-1];
			
		}
		array[0]=aux;
		
		System.out.println("Nueva lista de array" );
		for (int i = 0; i < array.length; i++) {
			System.out.println( i + " " + array[i]);
		}
		
		}

	 ///////////////// metodo de ordenar con el uso de otros metodos
	
	public static void desplazarDesdeHasta (int array[],int desde,int hasta)
	{ int  pos_final=hasta;
	 for(int pos=pos_final+1;pos>desde;pos++)
	 {
		 if(pos<array.length)
		 { array[pos]=array[pos-1];}
	 }	
	}
	
	////// metodo de pedir numero 
	

	
	/////////////// fin de clase
}
