package mx.com.Cetech.ClaseCasa.TemasDeExamen;

import java.util.Scanner;
public class TiposVariablesEstudiarTodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String miNombre="Mario";
		System.out.println(miNombre);
		String ano;
		Scanner sr = new Scanner(System.in);
		System.out.println("Ingresa el ano en curso: ");
		ano = sr.nextLine();
		System.out.println(ano);
		System.out.println("**********************+");
		int edad = 23;
		int numero = 3;
		int numero1 = 6;
		boolean isCondicion = true;
		char caracter = '&';
		float decimal = 2.99f;
		double decimalPreciso = 999.4578764;
		System.out.println(isCondicion);
		System.out.println(decimal);
		System.out.println(decimalPreciso);
		System.out.println(caracter);
		System.out.println(edad);
		System.out.println(numero);
		System.out.println(numero1);
		double multiplicacion = numero * decimal;
		System.out.println(multiplicacion);
		float numero3 = 7;
		System.out.println(numero3);
		
		// El casteo explicito como el de abajo (de un tipo de dato a otro)
		System.out.println("************************************");
		System.out.println("Casteo Explicito: ");
		System.out.println(edad);
		System.out.println(numero);
		System.out.println(decimal);
		System.out.println(numero * decimal + "Este es el número antes de hacer el casteo explicito.");
		edad = numero * (int)decimalPreciso;
		System.out.println("Casteo explicito edad: " + edad);
		
		//casteo implicito
		System.out.println("Casteo Implicito");
		float edadDecimal = edad;
		System.out.println(edadDecimal);
		
		edadDecimal = (float)decimalPreciso;
		System.out.println(decimal);
		
		
		
		
		
		
		
	}

}
