package mx.com.Cetech.Clase12.Encapsulacion;

import java.io.Serializable;

public class Persona implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4773705239279607615L;
	/*
	 * 
	 * JavaBean: es un reflejo de una tabla de la base de datos
	 * Caracteristicas de un JavaBean:
	 * 1.-Atributos privados.
	 * 2.-Deben de tener metodos getters and setters.
	 * 3.-Constructor por default y constructor usando todos los campos.
	 * 4.-Debe implementar serializable
	 * 
	 *  serializable(Sirve para identificar el dato y pueda viajar seguro)
	 *  
	 */
	
	private String nombre;
	private int edad;
	private float peso;
	private float estatura;
	private String domicilio;

	public Persona() {
	}

	public Persona(String nombre, int edad, float peso, float estatura,
			String domicilio) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.estatura = estatura;
		this.domicilio = domicilio;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getEstatura() {
		return estatura;
	}

	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

}
