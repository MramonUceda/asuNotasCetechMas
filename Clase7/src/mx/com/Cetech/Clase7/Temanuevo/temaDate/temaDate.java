package mx.com.Cetech.Clase7.Temanuevo.temaDate;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class temaDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date fecha;
		//Queremos sacar la fecha del sistema
		fecha = new Date();
		System.out.println(fecha);
		//formato
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		String fechaFormato =  sdf.format(fecha);
		
		System.out.println(fechaFormato);
		
		//Metodos de la clase DATE
		
		System.out.println((fecha.getYear()+1900));
		System.out.println(fecha.getMonth());
		System.out.println(fecha.getDate());
		
		
		Scanner tec = new Scanner(System.in);
		
		int añoActual;
		int anio;
		añoActual= fecha.getYear()+1900;
		System.out.println("¿Fecha de naciemiento?");
		anio = tec.nextInt();
		System.out.println("Tu edad es:" + (añoActual-anio));
		
	}

}
