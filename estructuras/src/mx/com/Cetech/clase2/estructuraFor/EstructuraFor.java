package mx.com.Cetech.clase2.estructuraFor;

import java.util.Scanner;

public class EstructuraFor {
	// para bulcle/ ciclo/ iteraciones/ repeticiones/ el ciclo for proporciona una forma compacta para repetir.
	//Repeti varias veces hasta que la condicion se cumple la estructura es 
	//la siguiente:
	/*
	 * for(inicializacion;condicion;incremento o decremento){
	 * 		Instruccion a repetir;
	 * }
	 */
	
	public static void main(String[] args) {
//		for(int pato=200; pato<206; pato++){
//		for(int i=200; i<206; i=i+1){
//		for(int i=200; i<206; i=i+2){
		for(int i=200; i>194; i--){
			System.out.println("Esto es un for " + i);
		}
		Scanner tl = new Scanner(System.in);
		System.out.println("¿Cuantas veces quieres que se repita Cetech?");
		int a = Integer.parseInt(tl.next());
		int i=1900;
		for(; i< a + 1900; i++){
			System.out.println("Cetech" + i);
		}
		
	}

}
