package BaseDatos;

import java.sql.ResultSet;

public class Empleado {
	
	private int id;
	private String nombre;
	private int salario;
	private int dpto;
	private String dptoName;
	
	
	/////////////////////// crea constructor
	
	public Empleado(int id, String nombre, int salario, int dpto, String dptoName) {

		this.id = id;
		this.nombre = nombre;
		this.salario = salario;
		this.dpto = dpto;
		this.dptoName =dptoName;;
		
	}
	
	///////////////////// get y set para los atributos 
	
	public String getDptoName() {
		return dptoName;
	}

	public void setDptoName(String dptoName) {
		this.dptoName = dptoName;
	}

	public Empleado(ResultSet rset) {
		// TODO Auto-generated constructor stub
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
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public int getDpto() {
		return dpto;
	}
	public void setDpto(int dpto) {
		this.dpto = dpto;
	}


}
