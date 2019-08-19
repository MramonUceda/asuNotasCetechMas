package mx.com.Cetech.Clase12.Encapsulacion;

import java.io.Serializable;

public class Alumno implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7989941893012640133L;
	
	private String nombre;
	private String apellido;
	private String carrera;
	private int matricula;
	private int salon;
	
	public Alumno() {
	}

	public Alumno(String nombre, String apellido, String carrera,
			int matricula, int salon) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.carrera = carrera;
		this.matricula = matricula;
		this.salon = salon;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getSalon() {
		return salon;
	}

	public void setSalon(int salon) {
		this.salon = salon;
	}
	
	
	
	

}
