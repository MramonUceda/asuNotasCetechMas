package mx.com.uacm.SrgundoExamenUACM;

import java.util.Scanner;

public class Ejercicio {
	public static void main(String[] args) {
		int[] numero =  {0,1,2,3,4};
		String[] nombres = new String[2];
		int i;
		for(i=0; i< numero.length; i++){
			System.out.println(numero[i]);
		}
		
		
		Scanner sr = new Scanner(System.in);
		for(i = 0; i< nombres.length; i++){
			System.out.println("Ingresa el nombre del " + i);
			nombres[i] = sr.next();
		}
		for(i=0; i < nombres.length; i++){
			System.out.println(nombres[i]);
		}
		
	}

}
