package Diferentes_Ejemplos;

public class Diferentes {
	
	public static void main(String[] args) {
		
		boolean res=adivinaQueHace("lool");
		System.out.println(res);
		
	}
	
	/**
	 * es un metodo que resive un string y prueba se en un palindoro o no si es palindromo vuelve un true si no false
	 * @param cad
	 * @return true se la cadena es palindromo
	 */
	private static boolean adivinaQueHace (String cad)
	{
		boolean bd = true;
		
		int i = 0;
		int j = cad.length()-1;
		
		while ((i<=j)&&(bd))
		{
			bd = cad.charAt(i)==cad.charAt(j);
			i++;
			j--;
		}
		
		
		return bd;
	}
	
	//////////////////////////// lo mismo 
	
	public static boolean esPalindromo (String palabra)
	{
		boolean resulta=false;
		int leng=palabra.length();
		int con=0;
		int con2=leng-1;
		char inicio=0;
		char fin=0;
		
		do{
			 inicio=palabra.charAt(con);
			 fin=palabra.charAt(con2);
			con++;
			con2--;
		}while(fin==inicio && con<leng);

		if(con==leng)
		{
			resulta=true;
		}
		 
      if(resulta==false)
    	{System.out.println("la palabra no es palindromo");}
       else
        {System.out.println("la palabra es palindromo");}
	
	return resulta;

	
	}

}
