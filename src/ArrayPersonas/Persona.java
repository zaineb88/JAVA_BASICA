package ArrayPersonas;

public class Persona {

	
	
	public static void main(String[] args) {
		
		MenuPrincipal.menu();	
		
		
	}
	private int edad;
	private String nombre;
	

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
