package mx.com.Cetech.TrabajosPorAparte;


import java.util.Scanner;

public class EsPrimo {
//-1
//Es primo o no
//(no primos)imprmir Divisores
	public static void main(String[] args) {
		
		int n1=0;
		int primo;

		Scanner sr = new Scanner(System.in);
		System.out.println("Ingresa un numero");
		n1 = sr.nextInt();
		System.out.println(n1);
		if(n1 < 0 || n1 >100){
			System.out.println("número no validao");
		}else{
			if(n1%2 == 0){
				System.out.println("es par");
			}else{
				System.out.println("Es impar");
			}
				
		}
		
		

	}

}
