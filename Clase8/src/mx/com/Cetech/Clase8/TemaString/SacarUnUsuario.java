package mx.com.Cetech.Clase8.TemaString;

import java.util.Scanner;

public class SacarUnUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String primerNombre;
		String apellidoPaterno;
		String apellidoMaterno;
		String aux = null;
		Scanner sr = new Scanner(System.in);
		System.out.println("Ingrese su Primer Nombre:\n");
		primerNombre = sr.nextLine();
		System.out.println("Ingrese su Apelledio Paterno:\n");
		apellidoPaterno = sr.nextLine();
		System.out.println("Ingrese su Apellido Materno:\n");
		apellidoMaterno = sr.nextLine();
		
		

		for(int i = 1; i<apellidoPaterno.length();i++){
			 aux = apellidoPaterno.substring(i, i+1);
			if(aux.equals("a") || aux.equals("e") || aux.equals("i") || aux.equals("o") || aux.equals("u")){
				break;
			}
		}
		
		
		int i=0;
		System.out.println("A" + apellidoPaterno.substring(0,1)+aux + apellidoMaterno.substring(0, 1) + primerNombre.substring(0,1));
		
		
		

	}

}
