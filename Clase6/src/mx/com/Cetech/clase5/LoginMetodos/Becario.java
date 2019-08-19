package mx.com.Cetech.clase5.LoginMetodos;

import java.util.Scanner;

public class Becario {
	Scanner ing = new Scanner(System.in);
	int i,op1,a;
	int usuario;
	String compararU,comprarCo;
	String[] users = null;
	String[] password = null;
	int j=0;

	public void diMenu(){
		System.out.println("Menu");
		System.out.println("1.-Agregar Usuario y Contrasena.");
		System.out.println("2.-Actualizar Usuario / Password");
		System.out.println("3.-Loggin");
		System.out.println("4.-Salir");
	}
	
	public int pedirOpcion(){
		System.out.println("Que opción: ");
		op1 = ing.nextInt();
		return op1;
	}
	
	public void  cuantosUsuario (){
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
	}
	
	public void actualizar(){
		System.out.println("¿Que usuario/contraseña requiere actualizar?: ");
		for(i=0; i<users.length;i++){
			System.out.println((i+1)+".-" + users[i]);
		}
	}
	
	public void hacerLogg(){
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
	}
	
	
		
}
	
		
