package Herencia;
import java.util.Scanner;

public class Persona {


 
	private	String nombre; 
    private int edad;
	
		
	///////////////////// metodo de acceso get y set  ///////////
		
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}
		
	    public Persona()
		{
			// metodo por defecto
		}
	    
	    
		//////////////////////////////////////////////////////////////
		
	/*	public Persona (String nombre_recibido, int edad_recibida)
		{
			this.nombre = nombre_recibido;
			this.edad = edad_recibida;
		}
		*/
	
		public  void mostrarPersona()
		{
			System.out.println("Nombre ="+this.nombre);
			System.out.println("Edad ="+ this.edad);
		}
		
		public static String pedirNombre()
		{
			String nombreP=null;
	
			Scanner sc=null;
			sc=new Scanner(System.in);
			nombreP=sc.nextLine();
		
			return nombreP;
		}
		
		public static int pedirEdad()
		{
			int edadP=0;
	
			Scanner sc=null;
			sc=new Scanner(System.in);
			edadP=sc.nextInt();
		
			return edadP;
		}
		
}


