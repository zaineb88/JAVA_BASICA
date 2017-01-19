package Ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MenuCuenta {

	public static void main(String[] args) throws IOException {

		System.out.println("1-Registrarse \n2-Acceder");
		int num_leido = 0;
		Scanner scanner = new Scanner(System.in);
		num_leido = scanner.nextInt();

		if (num_leido == 1)
		
		{
			String nombre = NombreRegistrar();
			String passW = contraseniaRegistrar();
			boolean res = registrarse(nombre, passW);
			if (res == true) {
				System.out.println("La registracion ha sido correcta");

				escribirEnFichero(nombre);
				escribirEnFichero2(passW);
			} else {
				System.out.println("La registracion no ha sido");
			}
		    } else {
			
			
			if (num_leido == 2) {
				acceder(NombreAcceder(), contraseniaAcceder());
			} else {
				System.out.println("Ha introducido un numero no corresponde en menu");
			}
		}

		// fin main
	}
	///////////////////////////////////////////////////// METODOS REGISTRAR Y ACCEDER 

	public static boolean registrarse(String login, String pw) {
		boolean res = false;

		String pw2 = null;
		System.out.println("Cofirmar su contaseña");
		Scanner sc = null;
		sc = new Scanner(System.in);
		pw2 = sc.next();
		if (pw.equalsIgnoreCase(pw2)) {
			res = true;
		} else {
			System.out.println("La confirmacion de la contraseña no ha sido correcta ");
		}

		return res;
	}

	public static boolean acceder(String login1, String pw1) throws IOException {

		String user = "";
		String pass = "";
		
		boolean res = false;
		
		BufferedReader br = new BufferedReader(new FileReader(new File("USERS")));
		BufferedReader br2 = new BufferedReader(new FileReader(new File("PASSWORDS")));
		user = br.readLine();
		pass = br2.readLine();
		int i=0;
		  
       while(i<2 && (!login1.equals(user) || !pw1.equals(pass))){
		if (login1.equals(user) && pw1.equals(pass))
		{
			res = true;
			System.out.println("BIENVENIDO");
	     	} else {
			System.out.println("Ha introducido un error intentalo de nuevo");
			login1=  NombreAcceder(); 
			pw1=contraseniaAcceder();

			i++;
		}   
       }
       
       if((!login1.equals(user) || !pw1.equals(pass)))
       {System.out.println("Losiento has terminado sus intentos");}
       else
       {System.out.println("BIENVENIDO");}
       
      
     //  System.exit();
	   
		return res;
	}

	////////////////////////////////////////////// METODOS DE ESCRIBIR Y LEER DE A FICHERO
	
	
	public static boolean escribirEnFichero(String login) {
		boolean res = true;
		FileWriter fw = null; // para escribir en un fichero
		BufferedWriter bw = null;

		try {
			fw = new FileWriter("USERS");
			bw = new BufferedWriter(fw);

			bw.write(login);
			bw.newLine();

		} catch (IOException e) {
			System.out.println("Fichero creado");
			e.printStackTrace();
		}

		finally {

			try

			{

				bw.close();

				fw.close();

			} catch (Exception e)

			{
				System.out.println("Error cerrando fichero salida");
				e.printStackTrace();
				res = false;
			}
		}
		return res;
	}

	public static boolean escribirEnFichero2(String pw) {
		boolean res = true;
		FileWriter fw = null; // para escribir en un fichero
		BufferedWriter bw = null;

		try {

			fw = new FileWriter("PASSWORDS");
			bw = new BufferedWriter(fw);

			bw.write(pw);
			bw.newLine();

		} catch (IOException e) {
			System.out.println("Fichero creado");
			e.printStackTrace();
		}

		finally {

			try

			{

				bw.close();

				fw.close();

			} catch (Exception e)

			{
				System.out.println("Error cerrando fichero salida");
				e.printStackTrace();
				res = false;
			}
		}
		return res;
	}

	/////////////////////////////////////////////////////// FUNCIONES

	public static String NombreRegistrar() {
		String nombre = null;
		System.out.println("Elige un nombre del usario : ");
		Scanner sc = null;
		sc = new Scanner(System.in);
		nombre = sc.nextLine();

		return nombre;
	}

	public static String contraseniaRegistrar() {
		String pw = null;
		System.out.println("Elige una contaseña : ");
		Scanner sc = null;
		sc = new Scanner(System.in);
		pw = sc.next();

		return pw;
	}

	public static String NombreAcceder() {
		String nombre = null;
		System.out.println("LOGIN : ");
		Scanner sc = null;
		sc = new Scanner(System.in);
		nombre = sc.nextLine();

		return nombre;
	}

	public static String contraseniaAcceder() {
		String pw = null;
		System.out.println("PASSWORD : ");
		Scanner sc = null;
		sc = new Scanner(System.in);
		pw = sc.next();

		return pw;
	}

}