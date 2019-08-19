package mx.com.cetech.SacandoEdad;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class EdadActual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date fecha = new Date();
		Scanner sr = new Scanner(System.in);
		String edad;
					
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy");
		String date = sdf2.format(fecha); 
		System.out.println(date);
		
		System.out.println(fecha.getYear()+1990);

		
		
		
	

	}

}
