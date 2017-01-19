package BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conneccion {

	public static void main(String[] args) throws Exception {
		
		Connection conn = null;
		ResultSet rset = null;
		Statement stmt = null;
		
		try {   // try catch es obligatoio es check exception
			// registro el driver, en realidad, hago que se ejecuten unas pocas líneas de la clase OracleDriver
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());// método equivalente al anterior Sea como sea, es, <<oye, si te piden una conexión, se la pides a esa clase!>>
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "HR", "password"); // todo eso viene por defecto
			stmt = conn.createStatement();// quiero decir que con este conneccion voy hacer un consulta
			rset = stmt.executeQuery("select BANNER from SYS.V_$VERSION"); // la resulta de la consulta guardarla en rset(resulSet)
			while (rset.next()) // rset va a coger uno a uno 
				System.out.println(rset.getString(1));

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

	}

}
