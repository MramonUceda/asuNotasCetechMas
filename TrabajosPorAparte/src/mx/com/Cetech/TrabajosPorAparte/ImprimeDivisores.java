package mx.com.Cetech.TrabajosPorAparte;

import java.util.Scanner;

public class ImprimeDivisores {
	/*
	 * Si obtenemos división exacta \Longrightarrow no es primo
	 * - Si el cociente es menor que el divisor .. paramos \Longrightarrow es primo
	 */

	public static void main(String[] args) {
		System.out.println("Numeros primos");
		
		//solo dos divisores uno y ellos mismos.
		Scanner tl = new Scanner(System.in);
		int nprimo1;
		System.out.println("Ingresa en número para verificar si es primos o no");
		nprimo1 = tl.nextInt();
		if(nprimo1%2 == 0){
			System.out.println("");
			
		}
		

	}

}
