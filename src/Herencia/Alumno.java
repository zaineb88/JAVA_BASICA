package Herencia;



public class Alumno extends Persona // extends seghifica que heredida de la clase Persona

{
	public static void main(String[] args) {
		
	
		
	}
	
   public void mostrarPersona()
   {
	   super.mostrarPersona();// ha llamado al metodo mostrarPersona desde la clase del padre por eso utilizamos super
	   
   }
   
   private int nota;
   

   public int getNota() {
	return nota;
}


public void setNota(int nota) {
	this.nota = nota;
}

  

public  String ToString()
{
	   String str_dev=null;
	   
	   str_dev=this.getNombre()+""+this.getEdad();
	   return str_dev;
	 //  return super.toString();// para ejecutar el objet del padre 
}

	
   @Override //metodo equals de defecto ===// aunque teneis los mismo datos seguen k no son iguales
public boolean equals(Object obj) 
   
   {

	   boolean var=false;
	   Alumno alumnoObject=null;
	   alumnoObject=(Alumno)obj; //cambiar el alumno de tipo alumno a tipo object
	   if(this.getNombre().equals(alumnoObject.getNombre())) 
//			   && (this.getEdad().equals(alumnoObject.getEdad()))
//                && (this.getNota().equals(alumnoObject.getNota()))
//			   )
	   {
		   var=true;
	   }
	   return var;
}






	
	
	
	
	
}
