package mx.com.Cetech.clase2.estructuraFor;

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ml,i;
		Scanner  a = new Scanner(System.in);
		System.out.println("Que tabla de multiplicar desea?");
		ml = a.nextInt();
		for(i=1; i<=10; i++){
			System.out.println(i + "x" + ml +"=" + i*ml);
		}

	}

}
