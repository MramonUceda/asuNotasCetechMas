package mx.com.Cetech.clase2.variables;

public class operadoresAritmeticos {

	public static void main(String[] args) {
		//Operadores Aritmeticos +,*,-,++(+1);
		int numero1 = 5 , numero2 =15;
		int suma = numero1 + numero2;
		int resta = numero1 - numero2;
		int producto = numero1 * numero2;
		int division = numero1 / numero2;
		int residuo =  numero1 % numero2;
		System.out.println("La suma  de " + numero1 + " +" + numero2 + " es " + suma );
		System.out.println("La resta  de " + numero1 + " - " + numero2 + " es " + resta );
		System.out.println("La producto  de " + numero1 + " * " + numero2 + " es " + producto );
		System.out.println("La division  de " + numero1 + " / " + numero2 + " es " + division );
		System.out.println("El residuo  de " + numero1 + " % " + numero2 + " es " + residuo);
		
		System.out.println("*************************************************************");
		
		int numerito = 10;
		//numerito = numerito +1;
		//++numerito;
		
		System.out.println(numerito);
		System.out.println((++numerito)+1); //numerito++
		System.out.println(numerito);
		int numerito2 = 5;
		
		System.out.println((numerito++)+numerito2); 
		System.out.println((++numerito)+numerito2);
		System.out.println(numerito +(numerito2++));
		System.out.println(numerito+(++numerito2)); 

		
		
		
	}

}
