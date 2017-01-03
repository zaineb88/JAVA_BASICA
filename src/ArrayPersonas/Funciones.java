package ArrayPersonas;

public class Funciones {

	public static final int NUM_PERSONAS = 5;

	//////////////// mostrar lista de personas

	public static void mostrar() {
		Persona persona_aux = null;
		Persona array_persona[] = null;
		String nombre_aux = null;
		int edad_aux = 0;

		array_persona = new Persona[NUM_PERSONAS];

		Persona persona1 = new Persona("ZAINEB", 28);
		Persona persona2 = new Persona("SARA", 29);
		Persona persona3 = new Persona("INES", 20);
		Persona persona4 = new Persona("FATIMA", 30);
		Persona persona5 = new Persona("IMAN", 18);
		array_persona[0] = persona1;
		array_persona[1] = persona2;
		array_persona[2] = persona3;
		array_persona[3] = persona4;
		array_persona[4] = persona5;

		for (int i = 0; i < NUM_PERSONAS; i++) {
			persona_aux = array_persona[i];
			nombre_aux = persona_aux.getNombre();
			edad_aux = persona_aux.getEdad();

			System.out.println("Nombre del persona " + (i + 1) + "= " + nombre_aux);
			System.out.println("Su edad= " + edad_aux);
		}

	}

	////////////// buscar persona

	public static int buscar(String persona) {

		 
		Persona persona_aux = null;
		Persona array_persona[] = null;
		String nombre_aux = "";
		int edad_aux = 0;

		array_persona = new Persona[NUM_PERSONAS];
		Persona persona1 = new Persona("ZAINEB", 28);
		Persona persona2 = new Persona("SARA", 29);
		Persona persona3 = new Persona("INES", 20);
		Persona persona4 = new Persona("FATIMA", 30);
		Persona persona5 = new Persona("IMAN", 18);
		array_persona[0] = persona1;
		array_persona[1] = persona2;
		array_persona[2] = persona3;
		array_persona[3] = persona4;
		array_persona[4] = persona5;
		
        int pos=10;// le he dado el valor 10 porque tiene que ser un valor mayor de  5 (NUM PERSONAS)
		int con = 0;
		int hay=0;
		
		while ((con < 5) && (nombre_aux != persona)) {
			persona_aux = array_persona[con];
			nombre_aux = persona_aux.getNombre();
			edad_aux = persona_aux.getEdad();

			if (persona.equalsIgnoreCase(nombre_aux)) {

				System.out.println("Nombre del persona " + (con + 1) + "= " + nombre_aux);
				System.out.println("Su edad= " + edad_aux);
				pos=con;
				 hay=1;
			}

			con++;
		}
		
		
		if(hay==0)
				
		System.out.println("La persona que ha elegido no existe");
		return pos;

	}

	///////////////// insertar persona

	public static void insertar() {

		String nombre = MenuPrincipal.pedirNombre();
		System.out.println("Dame su edad:");
		int edad = MenuPrincipal.pedirNumero();
		mostrar();
		Persona array_persona[] = null;
		array_persona = new Persona[NUM_PERSONAS + 1];
		Persona personaNueva = new Persona(nombre, edad);

		System.out.println("Nombre del persona 6= " + nombre);
		System.out.println("Su edad= " + edad);

	}

	
	////////////////// borrar persona
	
	public static void borrar(String persona)
	{
		Persona persona_aux = null;
		Persona array_persona[] = null;
		String nombre_aux = "";
		int edad_aux = 0;

		array_persona = new Persona[NUM_PERSONAS];
		Persona persona1 = new Persona("ZAINEB", 28);
		Persona persona2 = new Persona("SARA", 29);
		Persona persona3 = new Persona("INES", 20);
		Persona persona4 = new Persona("FATIMA", 30);
		Persona persona5 = new Persona("IMAN", 18);
		array_persona[0] = persona1;
		array_persona[1] = persona2;
		array_persona[2] = persona3;
		array_persona[3] = persona4;
		array_persona[4] = persona5;
		

		int pos= buscar(persona);
		if(pos!=10){ 
		for(int i=pos;i<NUM_PERSONAS-1;i++)
			{
			array_persona[i]=array_persona[i+1];
			
			
			}
		
			 System.out.println("");
            System.out.println("LA NUEVA LISTA ES:");
		for (int i = 0; i < NUM_PERSONAS-1; i++) {
			persona_aux = array_persona[i];
			nombre_aux = persona_aux.getNombre();
			edad_aux = persona_aux.getEdad();
			

			System.out.println("Nombre del persona " + (i + 1) + "= " + nombre_aux);
			System.out.println("Su edad= " + edad_aux);
		
		}
	}
	}

	
	///////////////////////////////////////////////////
	
	////////////// las funciones para menu edad ///////
	
	
	////////// metodo del mayor edad
	
	public static void mayorEdad()
	{
		Persona persona_aux = null;
		Persona array_persona[] = null;
		String nombre_aux = null;
		int edad_aux = 0;
		int edad_mayor=0;
		String nombre_mayor=null;

		array_persona = new Persona[NUM_PERSONAS];

		Persona persona1 = new Persona("ZAINEB", 28);
		Persona persona2 = new Persona("SARA", 29);
		Persona persona3 = new Persona("INES", 20);
		Persona persona4 = new Persona("FATIMA", 30);
		Persona persona5 = new Persona("IMAN", 18);
		array_persona[0] = persona1;
		array_persona[1] = persona2;
		array_persona[2] = persona3;
		array_persona[3] = persona4;
		array_persona[4] = persona5;

		for (int i = 0; i < NUM_PERSONAS; i++) {
			persona_aux = array_persona[i];
			nombre_aux = persona_aux.getNombre();
			edad_aux = persona_aux.getEdad();
			if(edad_aux>edad_mayor)
			{
				edad_mayor=edad_aux;
				nombre_mayor=nombre_aux;
			}

			}
            System.out.println( nombre_mayor+" de "+edad_mayor+" años.");
			
		
	}
	
	
///////////////// metodo del menor edad
	
	
	public static void menorEdad()
	{
		Persona persona_aux = null;
		Persona array_persona[] = null;
		String nombre_aux = null;
		int edad_aux = 0;
		int edad_menor=100;// le he dado valor 100 porque voy le voy a utilisando en if y tiene aue ser de un malor grande
		String nombre_menor=null;

		array_persona = new Persona[NUM_PERSONAS];

		Persona persona1 = new Persona("ZAINEB", 28);
		Persona persona2 = new Persona("SARA", 29);
		Persona persona3 = new Persona("INES", 20);
		Persona persona4 = new Persona("FATIMA", 30);
		Persona persona5 = new Persona("IMAN", 18);
		array_persona[0] = persona1;
		array_persona[1] = persona2;
		array_persona[2] = persona3;
		array_persona[3] = persona4;
		array_persona[4] = persona5;

		for (int i = 0; i < NUM_PERSONAS; i++) {
			persona_aux = array_persona[i];
			nombre_aux = persona_aux.getNombre();
			edad_aux = persona_aux.getEdad();
			
			if(edad_aux<edad_menor)
			{
				edad_menor=edad_aux;
				nombre_menor=nombre_aux;
			}

			}
            System.out.println( nombre_menor+" de "+edad_menor+" años.");
			
		
	}

	/////////// metodo de ordenar la personas por edad
	
	public static void ordenar()
	{

		Persona persona_aux = null;
		Persona array_persona[] = null;
		String nombre_aux = null;
		int edad_aux = 0;


		array_persona = new Persona[NUM_PERSONAS];

		Persona persona1 = new Persona("ZAINEB", 28);
		Persona persona2 = new Persona("SARA", 29);
		Persona persona3 = new Persona("INES", 20);
		Persona persona4 = new Persona("FATIMA", 30);
		Persona persona5 = new Persona("IMAN", 18);
		array_persona[0] = persona1;
		array_persona[1] = persona2;
		array_persona[2] = persona3;
		array_persona[3] = persona4;
		array_persona[4] = persona5;

		///////////// ordenar 
		
		for (int i = 0; i < NUM_PERSONAS; i++) {
			
			
			if(array_persona[i].getEdad()>array_persona[i+1].getEdad())
			{
				persona_aux=array_persona[i+1];
				
				array_persona[i+1]=array_persona[i];
				
				array_persona[i+1]=persona_aux;
				
			}

			}
		
		////////// mostrar
		
		for (int i = 0; i < NUM_PERSONAS; i++) {
			persona_aux = array_persona[i];
			nombre_aux = persona_aux.getNombre();
			edad_aux = persona_aux.getEdad();

			System.out.println("Nombre del persona " + (i + 1) + "= " + nombre_aux);
			System.out.println("Su edad= " + edad_aux);
		}
         
			
		
	}
	
	
	///////////////// metodo de buscar por edad
	

	public static void buscarEdad(int edad) {

		 
		Persona persona_aux = null;
		Persona array_persona[] = null;
		String nombre_aux = "";
		int edad_aux = 0;

		array_persona = new Persona[NUM_PERSONAS];
		Persona persona1 = new Persona("ZAINEB", 28);
		Persona persona2 = new Persona("SARA", 29);
		Persona persona3 = new Persona("INES", 20);
		Persona persona4 = new Persona("FATIMA", 30);
		Persona persona5 = new Persona("IMAN", 18);
		array_persona[0] = persona1;
		array_persona[1] = persona2;
		array_persona[2] = persona3;
		array_persona[3] = persona4;
		array_persona[4] = persona5;
		
        
		int con = 0;
		int hay=0;
		
		while ((con < 5) && (edad_aux != edad)) {
			persona_aux = array_persona[con];
			nombre_aux = persona_aux.getNombre();
			edad_aux = persona_aux.getEdad();

			if (edad==edad_aux) {

				System.out.println("Nombre del persona del edad " + edad_aux + " es " + nombre_aux);
			
				 hay=1;
			}

			con++;
		}
		
		
		if(hay==0)
				
		System.out.println("La edad que ha elegido no existe");
		

	}

	
	
}

