package mx.com.Cetech.Clase7.Temanuevo.temaStatic;

public class operacion {
	/*
	 * Si declaramos la variable resultado fuera del metodo entonces tenemos que declarar esta variable 
	 * "estatica", debido a que un metodo estatico solo puede acceder a variables estaticas, de lo contrario
	 * el compilador marcará error de esa variable o metodo que no pueda ser referencia 
	 */
	
	static int resultado;
	public static int suma(int a, int b){
		resultado = a+b;
		return resultado;
	}

}
