package mx.com.Cetech.clase5.EjerciciosMetodo;

import java.util.Scanner;

public class MetodosDeEjercicios {

	public void alexis(){
		System.out.println("Hola señor");
		
	}
	public void pato(int a, int b){
		int resultado = a+b;
		System.out.println(resultado);
		
	}
	public boolean elVergaDiosOmnipotente(int a){
		boolean isMayor = true;
		if(a >= 18){
			isMayor = true;
		}else{
			isMayor = false;
		}
		
		return isMayor;
	
	}
	public String pablo(){
		return "Estoy en main";
	}
	
	public float miguel(){
		Operaciones inst = new Operaciones();
		Scanner in = new Scanner(System.in);
		float uno,dos,resultado;
		System.out.println("Ingresa el numero uno: ");
		uno=in.nextFloat();
		System.out.println("Ingresa el numero dos: ");
		dos= in.nextFloat();
		resultado = inst.suma(uno, dos);
		if ( resultado >= 7){
			System.out.println("Aprobado");
		}else{
			System.out.println("Reprobado");
		}
		return resultado;
	}
}
