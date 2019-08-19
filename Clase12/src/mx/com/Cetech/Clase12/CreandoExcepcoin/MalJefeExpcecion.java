package mx.com.Cetech.Clase12.CreandoExcepcoin;

public class MalJefeExpcecion extends Exception{
	
	String miMalJefe;

	public MalJefeExpcecion(String miMalJefe) {
		this.miMalJefe = miMalJefe;
	}
	
	public String impresion(){
		return " Excepcion Atrapada porqué la palabra es: " + miMalJefe;
	}
	
	

}
