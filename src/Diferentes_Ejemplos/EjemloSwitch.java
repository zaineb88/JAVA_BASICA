package Diferentes_Ejemplos;

public class EjemloSwitch {

	public static void main(String[] args) {
		
		
	
		// TODO Auto-generated method stub
		
	}
		private static void imprimeNotaAlfabitica(int nota)
		{ 
			
			System.out.println("Dame nota :");
			nota=Inicio.pedirEdad();
			switch (nota)
			{
			case 10:
			System.out.println("MATRICULA DE HONOR");
			break;
			case 9:
				System.out.println("MUY BIEN");
		     break;
		 	case 8:
				System.out.println("BIEN");
				break;
				case 7:
					System.out.println("  ");
			     break;
				case 6:
					System.out.println("SUFICIENTE");
					break;
					default:
						System.out.println("INSUFICIENTE");
			
				     break;
		}
		

	}

	}
