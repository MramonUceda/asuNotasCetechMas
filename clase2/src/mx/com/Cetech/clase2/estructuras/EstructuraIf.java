package mx.com.Cetech.clase2.estructuras;

public class EstructuraIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SI la condicion de la sentencia if es verdadera, se va a ejecutar todo lo que esta entre las llaves(cuerpo del if)
		//Estructura if
		/*
		 * if (condicion){
		 * 		instrucciones que se ejecutan si la condicion se cumple		 * 
		 * }
		 */
		
		int numeros = 5;
		if(numeros == 5){
			System.out.println("Se cumplió la condición");
		}
		System.out.println("Fin del programa");

		
		System.out.println("**********************************************************************");
		
		
		//SI la condicion de la sentencia if else es verdadera, se va a ejecutar todo lo que esta entre 
		//las llaves(cuerpo del if)
		//Si no se cumple se va ejecutar lo que tenga entre llaves el else{}
				//Estructura if
				/*
				 * if (condicion){
				 * 		instrucciones que se ejecutan si la condicion se cumple		 * 
				 * }else{
				 * 		si no se cumple la condición, hace estas instrucciones	
				 * }
				 * 
				 */
		
		if(numeros != 5){
			System.out.println("Se cumplió la condición");
		}else{
			System.out.println("No se cumple la condición.");
		}
		System.out.println("Fin del programa");

		if (numeros == 5 && numeros > 3){
			System.out.println("EL numero es igual a 5 y mayor que 3");
		}else{
			System.out.println("El numero no es igual a 5 ni mayor a 3");
		}
		
		if(numeros != 5){
			System.out.println("Se cumplió la condición");
		}else{
			System.out.println("No se cumple la condición.");
		}
		System.out.println("Fin del programa");

		if (numeros != 5 || numeros > 3){
			System.out.println("EL numero es diferente de 5 y mayor que 3");
		}else{
			System.out.println("El numero no es igual a 5 ni mayor a 3");
		}
		
	}

}
