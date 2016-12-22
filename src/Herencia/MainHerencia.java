package Herencia;

public class MainHerencia {

	public static void main(String[] args) {

		Alumno alumno = new Alumno();
		Alumno alumno2 = new Alumno();

		alumno.setNombre("Zaineb");
		alumno.setEdad(28);
		alumno.mostrarPersona();
		alumno.setNota(5);
		
        alumno2.setNombre("Aroa");
		alumno2.setEdad(38);
		alumno2.mostrarPersona();
		alumno2.setNota(4);
		
		Croqueta croqueta=new Croqueta();
		
		
		System.out.println("hashCode: "+ alumno.hashCode());
		
		System.out.println("toString: "+alumno.toString());
		
		if (alumno instanceof Persona) // if alumno es de tipo persona(istancia)
		{
			System.out.println("El alumno es Persona");
		}
		
		if (alumno instanceof Object) 
		{
			System.out.println("El alumno es Object");
		}
		
		if(alumno!=alumno2) 
		{
			System.out.println("Alumno no es igual que alumno2");
		}
		
		if(alumno.equals(alumno2))// equels uso para comparar    sighnifica alumno ==alumno2
		{
			System.out.println("alumno es igual que alumno2");
		}
	}

}
