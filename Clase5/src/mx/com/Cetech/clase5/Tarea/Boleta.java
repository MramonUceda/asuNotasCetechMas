package mx.com.Cetech.clase5.Tarea;

import java.util.Scanner;

public class Boleta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ing = new Scanner(System.in);
		int nmaterias;
		System.out.println("¿Cuantas materias vas a ingresar");
		nmaterias = ing.nextInt();
				
		System.out.print("Materias\t");
		System.out.print("1°Parcial\t");
		System.out.print("2°Parcial\t");
		System.out.print("3°Parcial\t");
		System.out.println("Promedio");
		
		
		String [][] calimaterias = new  String[nmaterias][4];	
		
		for(int i = 0; i< nmaterias;i++){
			for(int j=0; j<4; j++){
				calimaterias[i][j] = ing.next();
				System.out.print("\t\t");
			}
			System.out.print("\n");
		}
		for(int i = 0; i< nmaterias;i++){
			for(int j=0; j<4; j++){
				System.out.print(calimaterias[i][j]);
				System.out.print("\t\t");
			}
			System.out.print("\n");
		}
		
		
		//float calimaterias=Float.parseFloat(numString);
		
		
		
		
		
		
				
		
		
		
	}

}
