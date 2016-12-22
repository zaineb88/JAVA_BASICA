package Diferentes_Ejemplos;

import java.util.Scanner;

public class Inicio {



	/*Persona persona1=null; // declarar

	
	persona1 = new Persona("zaineb",28); // crear    // Persona() es un constructor de la clase Persona
	
	//System.out.println(persona1.nombre +" " +persona1.edad);
	 * 
	persona1.mostrarPersona();*/
	
	
	  
	//////////////////// pedir nombre y edad de 5 personas /////////////////
	 
/*
	for(int i=1;i<=5;i++)
	{ 
		System.out.println("Introduzca nombre de persona"+i);
		Persona.pedirNombre();
		System.out.println("Introduzca edad de persona"+i);
		Persona.pedirEdad();	
		
	}
	*/
	///////////////////////////////
	
	public static final int NUMERO_ALUMNOS = 3; // final sighifica que no va a cambiar
	
	public static String pedirNombre(){
		String nombrePedido = null;
		Scanner scanner = null;
		
			scanner = new Scanner(System.in);
			nombrePedido = scanner.next();
		
		return nombrePedido;
	}
	
	public static int pedirEdad(){
		int edad = 0;
		Scanner scanner = null;
		
			scanner = new Scanner(System.in);
			edad = scanner.nextInt();
		
		return edad;
	}
	
	
	
	public static void main(String[] args) {
		
		//////////////////////pedir nombre y edad y imprimer lo que de mayor edad////////////////
		
		
		String nombre = null; // variable auxiliares es decir su valor va a cambiar 
		int edad = 0;

		Persona p = new Persona();
		
		int edad_mayor=0;
		String nombreDeMayor=null;
		for(int i=1; i<=NUMERO_ALUMNOS; i++ ){
			
			System.out.print("Introduzca el nombre "+i+":"  );
			nombre = pedirNombre();
			System.out.print("Introduzca su edad "+i  +":");
			edad = pedirEdad();
		
			 p.setNombre(nombre);
		     p.setEdad(edad);
			
			p.mostrarPersona();
		//	System.out.println();
			
			if(edad>edad_mayor)
			{
				edad_mayor=edad;
				nombreDeMayor=nombre;
			}
		}
		System.out.println("El mayor es :"+nombreDeMayor+" de edad "+edad_mayor);
	
	

}}


