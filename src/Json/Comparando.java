package Json;

public class Comparando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String t1="912037895";
		String t2="806222354";
		String t3="806222354";
		
		int res= t1.compareTo(t2);
		int res2 = t2.compareTo(t1);
		int res3 = t2.compareTo(t3);
		
		System.out.println(res);
		System.out.println(res2);
		System.out.println(res3);
	}

}
