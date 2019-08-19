package mx.com.Cetech.Clase13.Bean;

//javaBean

import java.io.Serializable;
import java.io.SerializablePermission;

public class Persona implements Serializable  {
	
	
	private int idPersona;
	private String nombre;
	private String paterno;
	private String materno;
	private String genero;
	private String celular;
	private String fechaDeNacimiento;
	
	
	
	
	public Persona(int idPersona, String nombre, String paterno,
			String materno, String genero, String celular,
			String fechaDeNacimiento) {
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.paterno = paterno;
		this.materno = materno;
		this.genero = genero;
		this.celular = celular;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	
	public Persona() {
		
	}
	

	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPaterno() {
		return paterno;
	}
	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}
	public String getMaterno() {
		return materno;
	}
	public void setMaterno(String materno) {
		this.materno = materno;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
}
