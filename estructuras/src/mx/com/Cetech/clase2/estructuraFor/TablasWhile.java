package mx.com.Cetech.clase2.estructuraFor;

import java.util.Scanner;

public class TablasWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ml,i;
		Scanner  a = new Scanner(System.in);
		System.out.println("Que tabla de multiplicar desea?");
		ml = a.nextInt();
		i=1;
		while(i<=10){
			System.out.println(i + "x" + ml +"=" + i*ml);
			i++;
		}
		System.out.println("************************************************");
		int b=1;
		int j;
		while (b<11){
			System.out.println("tabla de multiplicar " + b);
			j=1;
			while(j<11){
				System.out.println(b + "x" + j + "=" + b*j);
				j++;
			}
			b++;
		}
	}

}
