package mx.com.Cetech.clase2.estructuraFor;

import java.util.Scanner;

public class EstructuraSwitch {

	public static void main(String[] args) {

		/*
		 * Es mas facil entender la esctura switch con su equivalente else-if
		 * El break despues de un bucle case hace que sentencia switch concluya.
		 * Omitiendo el brak permite la caida de codigo
		 * Estructura switch
		 * switch(opcion/valor){
		 * 		case 1:
		 * 			Instrucciones;
		 * 			break;
		 * 		case 2:
		 * 			Instrucciones;
		 * 			break;
		 * 		default:
		 * 		Intracciones;
		 * 		break;
		 * }
		 *  
		 */
		int tl;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa la opcion");
		tl = teclado.nextInt();
		switch(tl){
		case 1:
			System.out.println("Dentro de la opcion 1");
			break;
		case 2:
			System.out.println("Dentro de la opcion 2");
			break;
		case 3:
			System.out.println("Dentro de la opcion 3");
			break;
		case 4:
			System.out.println("Dentro de la opcion 4");
			break;
		case 5:
			System.out.println("Dentro de la opcion 5");
			break;
			
		default:
			System.out.println("NO se encuentra la opcion");
			break;
			
		}

	}

}
