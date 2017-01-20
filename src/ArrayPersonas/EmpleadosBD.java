package ArrayPersonas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import BaseDatos.Empleado;

public class EmpleadosBD {
	
    /////////// haced un programa que recupero todos los empledaos de esquema hr los intoduzca una array list de empledos 
    //y le muestre ordenado por salario de mas a menos 

	public static void main(String[] args) throws SQLException {

		Connection conn = null;
		ResultSet rset = null;
		Statement stmt = null;
		Empleado empleado=null;
	    ArrayList<Empleado> lista_empleados=null;
	    lista_empleados=new ArrayList<Empleado>();
	
	    
		
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "HR", "password"); 
		stmt = conn.createStatement();

		
		rset = stmt.executeQuery("SELECT e.EMPLOYEE_ID, e.FIRST_NAME,e.SALARY,e.DEPARTMENT_ID,d.DEPARTMENT_NAME FROM EMPLOYEES e, DEPARTMENTS d where e.DEPARTMENT_ID = d.DEPARTMENT_ID ORDER BY e.SALARY DESC");
	
		    int id = 0;
			String nombre = null;  
			int salario = 0;
			int dpto = 0;
			String dptoName = null;
		
		while (rset.next()) 
			
		{  
		 				 id = rset.getInt("EMPLOYEE_ID");
		 				 nombre = rset.getString("FIRST_NAME");  
		 				 salario = rset.getInt("SALARY");
		 				 dpto = rset.getInt("DEPARTMENT_ID");
		 				 dptoName = rset.getString("DEPARTMENT_NAME");
		 			
		 				empleado = new Empleado(id,nombre,salario,dpto,dptoName);
		 				lista_empleados.add(empleado);
			}
		
		
	  mostrarListaBD(lista_empleados);
	  
	}
	
	


    public static void mostrarListaBD(ArrayList<Empleado> lis_empBD)
    {
    for(Empleado emp : lis_empBD)
    {
  	  System.out.println(" ID: "+emp.getId()+"Nombre: "+emp.getNombre()+ " Salario: "+emp.getSalario()+"Departamento: "+emp.getDpto()+" DepartamentoName: "+emp.getDptoName());
    }
    
    }

	
}
