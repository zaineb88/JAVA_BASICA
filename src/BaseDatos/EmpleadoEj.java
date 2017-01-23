package BaseDatos;

import java.sql.ResultSet;

public class EmpleadoEj {

	private int id;
	private String nombre;
	private String email;
	private String hireDate;
	private String jobId;

	
	
	/////////////////////// crea constructor
	
	public EmpleadoEj(int id, String nombre,String email, String hireDate,String jobId) {

		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.hireDate = hireDate;
		this.jobId = jobId;
	
		
	}
	
	///////////////////// get y set para los atributos 
	


	public EmpleadoEj(ResultSet rset) {
		
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}



}



