package Ejercicios;

public class Main {

	public static void main(String[] args) {


			
			frase("hola me llamo zaineb");

		}
		
	
		public static String frase(String frase)
		{
			String fraseSalida=null;
			int leng=frase.length();

			for(int i=0;i<leng;i++)
			{
				if(frase.charAt(i)!=' ')
				{
					System.out.print(frase.charAt(i));	
					fraseSalida=fraseSalida+frase.charAt(i); 
				}

			}
		
			return fraseSalida; // return no funciona (tengo que preguntar sobre esto)
		}
		

}


