package mx.com.Cetech.clase2.estructuraFor;

import java.util.Scanner;

public class ClaseCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while (i<=10){
			System.out.println("tabla de multiplicar " + i);
			int j=1;
			while(j<=10){
				System.out.println(i + "x" + j + "=" + i*j);
				j++;
			}
			i++;
		}

	}

}
