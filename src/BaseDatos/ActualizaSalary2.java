package BaseDatos;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class ActualizaSalary2 {
 


		public static void main(String[] args)  {
			Connection conn = null;
	    	ResultSet rset = null;
		    int rset2 = 0;
			ResultSet rset3 = null;
			ResultSet rset4 = null;
			Statement stmt = null;
			 Savepoint savepoint = null;
	
		 
		     try{
		    	 
		     DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
		    conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "HR", "password");
			conn.setAutoCommit(false); 
			
		    stmt = conn.createStatement(); 
			rset = stmt.executeQuery("SELECT SALARY FROM  EMPLOYEES  where DEPARTMENT_ID IN ( SELECT DEPARTMENT_ID FROM DEPARTMENTS WHERE DEPARTMENT_NAME='Administration')");

			
		while (rset.next()) 
				
			{   		System.out.println("El salario antes de actualizacion es : "+rset.getString("SALARY"));
			 			
			 			
				}
		

			rset2 = stmt.executeUpdate(" UPDATE EMPLOYEES SET SALARY=SALARY+(SALARY*20/100) where DEPARTMENT_ID IN ( SELECT DEPARTMENT_ID FROM DEPARTMENTS WHERE DEPARTMENT_NAME='Administration')");
              conn.commit();
			
			 savepoint= conn.setSavepoint(); // segnifica que el rollback empieza despues
			rset3 = stmt.executeQuery(" SELECT SALARY FROM  EMPLOYEES  where DEPARTMENT_ID IN ( SELECT DEPARTMENT_ID FROM DEPARTMENTS WHERE DEPARTMENT_NAME='Administration')");
		
			
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
	
		     } catch(Exception e)
		     
		        {
		          try { conn.rollback(savepoint); 	} catch (SQLException e1) { e1.printStackTrace();} 
		    	 }
		     
		  finally {
			
			         if (rset != null) { try { rset.close();} catch (Exception e2) { e2.printStackTrace();}}
					if (rset3 != null) { try {  rset3.close(); } catch (Exception e2) { e2.printStackTrace();}}
					if (rset4 != null) { try {	rset4.close(); } catch (Exception e2) { e2.printStackTrace();}}
			    	if (stmt != null) { try {	stmt.close(); } catch (Exception e2) { e2.printStackTrace();}}
			    	if (conn != null) {	try { 	conn.close(); } catch (Exception e3) {	e3.printStackTrace();}
				}
			  
		
		 
			  
		  }
		
}
}