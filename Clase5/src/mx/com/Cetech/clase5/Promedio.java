package mx.com.Cetech.clase5;

import java.util.Scanner;

/*
 * pareceo siempre sera de un string a otro tipo de datoa ya sea float, int, etc.
 */
public class Promedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cal;
		Scanner x = new Scanner(System.in);
		System.out.println("¿Cuantas calificaciones vas a meter?");
		cal = x.nextInt();
		float[] prom = new float[cal];
		float pm=0;
		for (int i = 0; i < prom.length; i++) {
			System.out.println("Ingresa la calificación " + (i+1) + ";");
			prom[i] = x.nextFloat();
			pm = pm + prom[i];
		}
			pm = pm / prom.length;
		
		System.out.println(pm);

	}

}
