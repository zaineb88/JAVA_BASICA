package ArrayPersonas;

public class Persona {
	
	////////////////// insertar y mostrar persona
	
	public static final int NUM_PERSONAS=5;
	
	public static void main(String[] args) {
		
		Persona persona_aux=null;
		Persona array_persona[]=null;
		String nombre_aux=null;
		int edad_aux=0;
		
		array_persona=new Persona[NUM_PERSONAS];
		
		Persona persona1=new Persona("ZAINEB",28);
		
		array_persona[0]=persona1;
		
		
		for(int i =0;i<NUM_PERSONAS;i++)
		{
			persona_aux=array_persona[i];
			nombre_aux=persona_aux.getNombre();
			edad_aux=persona_aux.getEdad();
			
		System.out.println("Nombre = "+nombre_aux);
		System.out.println("Edad = "+edad_aux);	
		}
		
	}
	private int edad;
	private String nombre;
	
//	public  Persona();
//	{
//		//constructor por defecto
//	}
	public Persona (String nombre,int edad)
	{
		this.edad=edad;
		this.nombre=nombre;
	}
	
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	
	
}
