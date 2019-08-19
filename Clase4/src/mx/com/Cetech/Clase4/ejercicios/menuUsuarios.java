package mx.com.Cetech.Clase4.ejercicios;

import java.security.spec.PSSParameterSpec;
import java.util.Scanner;

public class menuUsuarios {

	public static void main(String[] args) {
		
		Scanner ing = new Scanner(System.in);
		int usuario,i,op1,a;
		String compararU,comprarCo;
		String[] users = null;
		String[] password = null;
		int j=0;
		while(j != 4){
		System.out.println("Menu");
		System.out.println("1.-Agregar Usuario y Contrasena.");
		System.out.println("2.-Actualizar Usuario / Password");
		System.out.println("3.-Loggin");
		System.out.println("4.-Salir");
		System.out.println("¿Que haras?: ");
		op1 = ing.nextInt();
		switch(op1){
			case 1:
				System.out.println("Ingresa cuantos Usuario vas Agregar:  ");
				usuario = ing.nextInt();
				users =  new String[usuario];
				password = new String[usuario];
				for(i=0; i < usuario ; i++){
					System.out.println("Ingresa nombre de usuario " + (i+1));
					users[i]= ing.next();
					System.out.println("Ingresa la contraseña del usuario: ");
					password[i] = ing.next();
					
				}
				
				break;
				
			case 2:
				System.out.println("¿Que usuario/contraseña requiere actualizar?: ");
				for(i=0; i<users.length;i++){
					System.out.println((i+1)+".-" + users[i]);
				}
				
				
				break;
				
			case 3:
				
				System.out.println("Ingresa tu usuario: ");
				compararU = ing.next();
				System.out.println("Ingresa tu password: ");
				comprarCo = ing.next();
				for(a=0; a< users.length; a++){
					if(compararU.equals(users[a])){
						if(comprarCo.equals(password[a])){
							System.out.println("Acceso Exitoso");
							a = users.length;
						}
						else{
							System.out.println("usuario u contraseña Incorrecto");
						}
					}
					else{
						System.out.println("usuario/contraseña incorrecto");
					}
					System.out.println("Ciclo for");
					
				}

					
				
				break;
				
			case 4:
				op1=4;
				break;
				
				
				default:
					
					System.out.println("No valido");
				break;

			}
			
				
			
				
				
				
		
		
		}
		
		
	}
}

