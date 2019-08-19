package mx.com.Cetech.Clase7.Temanuevo.temaDate;

import java.io.ObjectInputStream.GetField;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date fecha;
		fecha = new Date();
		
		System.out.println(fecha);
		
		SimpleDateFormat fct = new SimpleDateFormat("dd-MM-yyyy");
		String fechaFormaro = fct.format(fecha);
		System.out.println(fechaFormaro);
		System.out.println("Ingresa los nú");
		int nuevo;
		nuevo = fecha.getYear()+1990;
		System.out.println(nuevo);
		
	}

}
