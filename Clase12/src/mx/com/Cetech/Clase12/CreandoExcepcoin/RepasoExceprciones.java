package mx.com.Cetech.Clase12.CreandoExcepcoin;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RepasoExceprciones {
	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		System.out.println("Ingresa un numero:");
		//numero = teclado.nextInt();
		//int numero2 = teclado.nextInt();
		
		try {
			numero = teclado.nextInt();
			System.out.println("Siguiente line");
			
		}catch(InputMismatchException a){
			System.out.println("*************************");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error");
		}
	}
}
