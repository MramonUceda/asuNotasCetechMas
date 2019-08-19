package mx.com.Cetech.Clase8.TemaString;

import java.util.Scanner;

public class EjercicioCurp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 */
		Scanner tl = new Scanner(System.in);
		String nombreUno;
//		//String nombreDos;
		String aux=null;
		String apellidoPaterno;
		String apellidoMaterno;
		String genero;
		String ciudad;
		String nacimiento;
		System.out.println("Ingresa tu primer nombre:\n");
		nombreUno = tl.nextLine();
		//System.out.println("Ingresa tu segundo nombre:\n");
		//nombreDos = tl.nextLine();
		System.out.println("Ingresa tu Apellido Paterno:\n");
		apellidoPaterno = tl.nextLine(); 
		System.out.println("Ingresa tu Apellido Materno:\n");
		apellidoMaterno = tl.nextLine();
		System.out.println("Ingresa tu genero(Hombre o Mujer)\n");
		genero = tl.nextLine();
		System.out.println("Ingresa tu ciudad\n");
		ciudad = tl.nextLine();
		System.out.println("Ingresa tu fecha de nacimiento (yyyy/mm/dd)");
		nacimiento = tl.nextLine();
		String naci [] = nacimiento.split("/");
		
		
		
		
		
		
		for(int i = 1; i<apellidoPaterno.length();i++){
			 aux = apellidoPaterno.substring(i, i+1);
			if(aux.equals("a") || aux.equals("e") || aux.equals("i") || aux.equals("o") || aux.equals("u")){
				break;
			}
		}
		
		
		
		System.out.println(apellidoPaterno.substring(0,1)+aux + apellidoMaterno.substring(0, 1) +  nombreUno.substring(0, 1) + naci[0].substring(2, 4)+ naci[1]+naci[2] + genero.substring(0, 1)+ ciudad.substring(0, 2) );
		//System.out.println(nacimiento.substring(2, 4) + nacimiento.substring(5, 7) + nacimiento.substring(8, 10));
		
		

	}

}
