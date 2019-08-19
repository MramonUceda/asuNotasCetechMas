package mx.com.Cetech.clase2.variables;

public class tipoVariables {

	public static void main(String[] args) {
		// comentario 
		/*
		 * 
		 * 
		 * comentario largo
		 */
		String apellido = "Ramon"; // los valores de String van con comillas dobles
		String apellidoMaterno = ""; // Declarando e inicializando una variable
		String anio = "2017";
		System.out.println(anio);
		int edad = 23;
		int numero = 2, numero2 = 8;
		boolean isCondicion = true;
		char caracter = '@';
		float deciaml = 2.65f;
		double doble = 9.9999d;
		double multiplicacion = numero * deciaml ;
		System.out.println(multiplicacion);
		float nm = 3;
		System.out.println(nm);
		
		// El casteo explicito como el de abajo (de un tipo de dato a otro)
		System.out.println("Casteo explicito.");
		edad = numero * (int)deciaml;
		System.out.println(edad);
		
		//El casteo implícito
		
		System.out.println("Casteo implicito");
		float edadDecimal = edad;
	
		deciaml = (float)doble;
		System.out.println(deciaml);
		
		
		// Parceo es de un string a otro tipo de dato 
		System.out.println("Parceo");
		int anio2 = Integer.parseInt(anio);
		System.out.println(anio2 + 1);
		String decimalTexto = "156.7";
		float anio3 = Float.parseFloat(decimalTexto);
		System.out.println(anio3 + 1.1);
		
		int ascii = caracter;
		System.out.println(ascii);
		
		//Variables tipo objeto/Wapper
		int numeroPrimitivo = 3;
		Integer numeroObjeto = 3;
		System.out.println(numeroPrimitivo + numeroObjeto);
		System.out.println(numeroObjeto.compareTo(numeroPrimitivo));
		
		float decimalObjecto = 15.8f;
		double dobleObjeto = 777777777.89999999999D;
		
		
		
	}

}
