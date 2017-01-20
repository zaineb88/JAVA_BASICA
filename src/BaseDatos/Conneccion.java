package BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Conneccion {

	
     public static void mostrarLista(ArrayList<Empleado> lis_emp)
              {
	          for(Empleado emp : lis_emp)
	          {
	        	  System.out.println(emp.getNombre());
	          }
              
              }
	
	
	
	public static void main(String[] args) throws Exception {
		
		Connection conn = null;
		ResultSet rset = null;
		Statement stmt = null;
	     ArrayList<Empleado> lista_empleados=null;
		
		
	     lista_empleados=new ArrayList<Empleado>(); //podemos hacer entre () un numero si sabemos el tamano fijo de la lista 
	     Empleado empleado=new Empleado(3, "lila", 2700, 5,"lky"); // crear un empledo
	     lista_empleados.add(empleado);  // añadir la empleado a la lista 
	     
	     
	     //////////// llamar al metodo 
	     
	     
	     mostrarLista(lista_empleados);
	     
	     
	     
	     
	     
	/*     
		try {   // try catch es obligatorio es check exception
			// registro el driver, en realidad, hago que se ejecuten unas pocas líneas de la clase OracleDriver
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());// método equivalente al anterior Sea como sea, es, <<oye, si te piden una conexión, se la pides a esa clase!>>
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "HR", "password"); // todo eso viene por defecto
			stmt = conn.createStatement();// quiero decir que con este conneccion voy hacer un consulta
			rset = stmt.executeQuery("select * from EMPLOYEES ORDER BY SALARY ASC"); // la resulta de la consulta guardarla en rset(resulSet)
			while (rset.next()) // rset va a coger uno a uno 
			{
				System.out.println(rset.getString(1)); // SELECCIONAL POR POSISION
			
				String nombre=rset.getString("FIRST_NAME");// SELECIONAL POR NOMBRE DE LA COLUMNA
				System.out.println("nombre es :"+nombre);
				
				System.out.println(rset.getString("SALARY"));
				}
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally // libero recursos, de "adentro a fuera" , ResultSet,
					// Statment, Conexion
		{
			if (rset != null) {
				try {
					rset.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e3) {
					e3.printStackTrace();
				}
			}

		}
*/
	}

}
