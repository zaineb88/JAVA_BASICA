package BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class InsertarEmpleados {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Connection conn = null;
		int rset = 0;
		Statement stmt = null;
	     ArrayList<EmpleadoEj> lista_empleados=null;
			EmpleadoEj empleado=null;
		
		
	     lista_empleados=new ArrayList<EmpleadoEj>(); 
	     
	     
			try {  
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
             	conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "HR", "password"); 
				stmt = conn.createStatement();
				rset = stmt.executeUpdate("insert into EMPLOYEES(EMPLOYEE_ID,LAST_NAME,EMAIL,HIRE_DATE,DEPARTMENT_ID,JOB_ID) values (108,'jilali','kjdj@hotmail.com','12/11/2010','AD_VP')");
				
			        int id = 0;
					String nombre = null;  
					String email = null;
					String hireDate=null;
					String jobId=null;
					
				empleado = new EmpleadoEj(id,nombre,email,hireDate,jobId);
 				lista_empleados.add(empleado);
				
				/*
			
				
				while (rset.next()) 
					
				{  
				 				 id = rset.getInt("EMPLOYEE_ID");
				 				 nombre = rset.getString("LAST_NAME");  
				 				email = rset.getString("EMAIL");
				 				hireDate = rset.getString("HIRE_DATE");
				 				jobId = rset.getString("JOB_ID")
				 				
				 			
				 				empleado = new EmpleadoEj(id,nombre,email,hireDate,jobId);
				 				lista_empleados.add(empleado);
					}
				*/
				
			  mostrarListaInsertada(lista_empleados);

			} catch (Exception e) {
				e.printStackTrace();
			} finally 
			{
				if (rset != 0) {
					try {
						//rset.close();
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

			}}
			
			 public static void mostrarListaInsertada(ArrayList<EmpleadoEj> lis_empBD)
			    {
			    for(EmpleadoEj emp : lis_empBD)
			    {
			  	  System.out.println(" ID: "+emp.getId()+"Nombre: "+emp.getNombre()+ " Email: "+emp.getEmail()+"Hire date "+emp.getHireDate()+"Job id :"+emp.getJobId());
			    }
			    

		}

	}
