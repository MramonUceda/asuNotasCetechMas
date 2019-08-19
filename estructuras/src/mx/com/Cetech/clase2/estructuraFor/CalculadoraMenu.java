package mx.com.Cetech.clase2.estructuraFor;

import java.util.Scanner;

public class CalculadoraMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,tl,nm1,nm2;
		i=0;
		while(i != 5){
			System.out.println("Menu");
			Scanner teclado = new Scanner(System.in);
			System.out.println("1.-Suma");
			System.out.println("2.-Resta");
			System.out.println("3.-Multiplicacion");
			System.out.println("4.-Division");
			System.out.println("5.-Salir");
			tl = teclado.nextInt();
			switch(tl){
				case 1:
					System.out.println("Ingresa el primer valor: ");
					nm1 = teclado.nextInt();
					System.out.println("Ingresa el segundo valor: ");
					nm2 = teclado.nextInt();
					int suma = nm1 + nm2;
					System.out.println("La suma es :" + suma);
					break;
					
				case 2:
					System.out.println("Ingresa el primer valor: ");
					nm1 = teclado.nextInt();
					System.out.println("Ingresa el segundo valor: ");
					nm2 = teclado.nextInt();
					int resta = nm1 - nm2;
					System.out.println("La resta es :" + resta);
					break;
					
				case 3:
					System.out.println("Ingresa el primer valor: ");
					nm1 = teclado.nextInt();
					System.out.println("Ingresa el segundo valor: ");
					nm2 = teclado.nextInt();
					int mul = nm1 * nm2;
					System.out.println("La multiplicacion es :" + mul);
					break;
					
				case 4:
					System.out.println("Ingresa el primer valor: ");
					nm1 = teclado.nextInt();
					System.out.println("Ingresa el segundo valor: ");
					nm2 = teclado.nextInt();
					int di = nm1 / nm2;
					System.out.println("La division es :" + di);
					break;
					
				case 5:
					i =5;
					System.out.println("Bye");
					break;
				
					
				default:
					System.out.println("Opcion no valida");
			}
	
		}

	}

}
