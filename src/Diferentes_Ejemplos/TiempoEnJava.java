package Diferentes_Ejemplos;

public class TiempoEnJava {
	
	public static void pierdeTiempo()
	{
		for(int j=-100000;j<200000;j++)
		{
			for(int i=-100000;i<200000;i++)
			{
				
			}
		}
	}
	
	
	
	
	

	public static void main(String[] args) {
		
       long segundosA=System.currentTimeMillis(); /// calcular tiempo que tarde el metodo pierdeTimpo
       pierdeTiempo();
       long segundosB=System.currentTimeMillis();
       
       double segundos= ((segundosB-segundosA)/1000); // porque son mili segundos
       System.out.println(segundos);
	}

}
