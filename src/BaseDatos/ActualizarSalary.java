package BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ActualizarSalary {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
	ResultSet rset = null;
	int rset2 = 0;
		ResultSet rset3 = null;
		ResultSet rset4 = null;
		Statement stmt = null;

	 
	    conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "HR", "password"); 
	    
		conn.setAutoCommit(false);  // eso  para no hace la actualizacion automaticamente y necisario añadir conn.rolback despues de execute
		
	    stmt = conn.createStatement(); 
		rset = stmt.executeQuery("SELECT SALARY FROM  EMPLOYEES  where DEPARTMENT_ID IN ( SELECT DEPARTMENT_ID FROM DEPARTMENTS WHERE DEPARTMENT_NAME='Administration')");

		
	while (rset.next()) 
			
		{   		System.out.println("El salario antes de actualizacion es : "+rset.getString("SALARY"));
		 			
		 			
			}
	

		rset2 = stmt.executeUpdate(" UPDATE EMPLOYEES SET SALARY=SALARY+(SALARY*20/100) where DEPARTMENT_ID IN ( SELECT DEPARTMENT_ID FROM DEPARTMENTS WHERE DEPARTMENT_NAME='Administration')");
		

 
		rset3 = stmt.executeQuery(" SELECT SALARY FROM  EMPLOYEES  where DEPARTMENT_ID IN ( SELECT DEPARTMENT_ID FROM DEPARTMENTS WHERE DEPARTMENT_NAME='Administration')");
		  
		//conn.rollback(); // se funciona con conn.setAutoCommit(false);
		
	while (rset3.next()) 
			
		{   		System.out.println("El salario despus de actualizacion es : "+rset3.getString("SALARY"));
		 			
		 			
			}
	
	rset4=stmt.executeQuery("SELECT SALARY_ID, EMPLOYEE_ID, SALARY_A, SALARY_N, FECHA FROM SALARY where FECHA=sysdate") ;
	
	
while (rset4.next()) 
		
	{   		System.out.println("Salary id : "+rset4.getInt(1));
            	System.out.println("Employee_id : "+rset4.getInt(2));
            	System.out.println("Salary anterior : "+rset4.getInt(3));
            	System.out.println("Salary nuevo : "+rset4.getInt(4));
            	System.out.println("Fecha : "+rset4.getDate(5));
	
	 			
	 			
		}
	  
	  conn.close();
	  stmt.close();
	  rset.close();
	  rset3.close();
	  rset4.close();
	  
	}
	
	
 
}