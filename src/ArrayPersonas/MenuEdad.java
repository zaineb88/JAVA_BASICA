package ArrayPersonas;

public class MenuEdad {
	
	
	static void menu2() {
		int numero = 0;
		System.out.println("Elige usted un numero:");
		System.out.println("1: Imprimir el mayor de las personas");
		System.out.println("2: Imprimir el menor de las personas");
		System.out.println("3: Buscar por edad");
		System.out.println("4: Ordenar depende de la edad");
		System.out.println("5: SALIR");
		numero= MenuPrincipal.pedirNumero();

		switch (numero) {
		case 1:
			System.out.println("El mayor es: ");
			Funciones.mayorEdad();
			break;
		case 2:
			System.out.println("El menor es :");
			Funciones.menorEdad();
			
			break;
		case 3:
			System.out.println("Buscar persona por edad");
			System.out.println("Dame un edad:");
			int numero1=MenuPrincipal.pedirNumero();
			Funciones.buscarEdad(numero1);
			break;
		case 4:
			System.out.println("La lista de las personas ordenada por edad ");
			Funciones.ordenar();
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
