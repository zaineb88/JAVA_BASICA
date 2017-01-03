package ArrayPersonas;

import java.util.Scanner;

public class MenuPrincipal {


	/////////////////// metodo del menu

	static void menu() {
		int numero = 0;
		System.out.println("Elige usted un numero:");
		System.out.println("1: INSERTAR PERSONA");
		System.out.println("2: LISTAR PERSONAS");
		System.out.println("3: BUSCAR PERSONA POR NOMBRE");
		System.out.println("4: BORRAR PERSONA");
		System.out.println("5: SALIR");
		numero = pedirNumero();

		switch (numero) {
		case 1:
			System.out.println("INSERTAR PERSONA");
			// metodo de insertar
			Funciones.insertar();
			break;
		case 2:
			System.out.println("La lista de personas:");
			// metodo de listar
			Funciones.mostrar();
			break;
		case 3:
			System.out.println("BUSCAR PERSONA POR NOMBRE");
			// metodo de buscar
			Funciones.buscar(pedirNombre());
			break;
		case 4:
			System.out.println("BORRAR PERSONA ");
			// metodo de borrar
			Funciones.borrar(pedirNombre());
			break;
		case 5:
			System.out.println("SALIR");
			System.exit(0);
			// metodo de salir
			break;
		default:
			System.out.println("Losiento ha elegido número incorrect");

		}
	}

	////////////////////// metodo de pedir numero

	public static int pedirNumero() {

		int num_leido = 0;

		Scanner scanner = new Scanner(System.in); // objeto scanner para leer de
													// teclado
		num_leido = scanner.nextInt(); // leido de teclado y asigno el valor
										// a num_leido

		return num_leido;

	}

	///////////////////// merodo pedir nombre

	public static String pedirNombre() {
		
		String nombre = null;
		
		System.out.println("Dame el nombre del persona");
		
		Scanner scanner = new Scanner(System.in);
		
		nombre = scanner.next();
		
		return nombre;
	}

}
