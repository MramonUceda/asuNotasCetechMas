package mx.com.Cetech.Clase10.ClasesAbstractas;

public class ClaseMetodoAbstracto {

	/*
	 * Una clase Abstracta es una clase que se declara abstracta 
	 * que puede no incluir metodos abstractos
	 * Una Clase abstracta no puede ser instanciada pero puede tener "SUBCLASES".
	 * Un metodo abstracto se declara sin aplicacion(sin llaves y seguido de un punto y coma ;).
	 * Si una clase incluye un metodo abstracto, la propia clase debe de ser declarada como abstracta 
	 * 
	 * La clase programador va ser utilizada para personalizar el metodo abstracto a su manera
	 */
	
	public static void main(String[] args) {
		ClaseProgramador claseProgramador = new ClaseProgramador();
		
		claseProgramador.imprimirResultado();
		
		ClasePgramadorDos claseProgramadorDos = new ClasePgramadorDos();
		
		claseProgramadorDos.imprimirResultado();
	}
}
