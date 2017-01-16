package Ejercicios;

public class ArraySum {

	public static void main(String[] args) {
	

		float media = mediaSum();
		System.out.println(media);

	}

	public static float mediaSum() {
		float num = 0;
		int sum = 0;
		int[] array_notas = { 0, 10, 2, 6, 7, 5, 4 };

		/**
		 * HACED EL CUERPO DEL MAIN PARA QUE DEVUELVA LA NOTA MEDIA
		 * 
		 * Ojo con los tipos la media será real (float)
		 * 
		 * 
		 */
		int leng = array_notas.length;
		for (int i = 0; i < leng; i++) {

			sum = sum + array_notas[i];

		}
		num = (float) sum / leng;
		return num;
	}

}
