package mx.com.Cetech.clase5.TemaMetodosDos;

import java.util.Scanner;

public class Jefecito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Becario alexis = new Becario();
		int cantUser;
		int i;
		int op1;
		int a;
		Scanner tl = new Scanner(System.in);
		String compararU, comprarCo;
		String[] users = null;
		String[] password = null;

		int j = 0;
		while (j != 4) {
			// instanciar clase becario para utilizar sus clases y atributos

			alexis.diMenu();
			int op = alexis.pedirOpcion();

			switch (op) {
			case 1:

				System.out.println("Ingresa cuantos Usuario vas Agregar:  ");
				cantUser = tl.nextInt();
				// users = new String[user]; password = new
				/**
				 * String[user]; for(i=0; i < user ; i++){
				 * System.out.println("Ingresa nombre de usuario " + (i+1));
				 * users[i]= tl.next();
				 * System.out.println("Ingresa la contraseña del usuario: ");
				 * password[i] = tl.next();
				 * 
				 * }
				 */

				alexis.cuantosUsuarios(cantUser);
				break;

			case 2:
				/*
				 * System.out.println(
				 * "¿Que usuario/contraseña requiere actualizar?: "); for(i=0;
				 * i<users.length;i++){ System.out.println((i+1)+".-" +
				 * users[i]); }
				 */

				alexis.actualizarUsuario();
				break;

			case 3:

				System.out.println("Ingresa tu usuario: ");
				compararU = tl.next();
				System.out.println("Ingresa tu password: ");
				comprarCo = tl.next();
				/*
				 * for(a=0; a< users.length; a++){
				 * if(compararU.equals(users[a])){
				 * if(comprarCo.equals(password[a])){
				 * System.out.println("Acceso Exitoso"); a = users.length; }
				 * else{ System.out.println("usuario u contraseña Incorrecto");
				 * } } else{
				 * System.out.println("usuario/contraseña incorrecto"); }
				 * System.out.println("Ciclo for");
				 * 
				 * }
				 */
				alexis.login();
				break;

			case 4:
				/*
				 * op = 4; break;
				 * 
				 * default:
				 * 
				 * System.out.println("No valido");
				 */
				alexis.salir();
				break;
			}

		}

	}
}
