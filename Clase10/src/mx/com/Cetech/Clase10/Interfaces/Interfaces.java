package mx.com.Cetech.Clase10.Interfaces;

public class Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Una Inferface es un tipo de referenci; similar a una clase que puede contener 
		 * constantes, fimas de metodos(Sin cuerpo).
		 * Las clases que implementan las interfaces proporcionan un cuerpo al metodo para que cada uno
		 * de los metodos de la interface tengan su implementacion. 
		 */
		
		PrimerGrado primerGrado = new PrimerGrado();
		
		primerGrado.suma();
		primerGrado.fraccionesBasics();
		primerGrado.area();
		
		SextoGrado sextoGrado = new SextoGrado ();
		
		sextoGrado.sumaNumero();
		sextoGrado.suma();
		sextoGrado.fraccionesComplejas();

	}

}
