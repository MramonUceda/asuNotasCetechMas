package mx.com.Cetech.clase5.TemaMetodosDos;

import java.util.Scanner;

public class Becario {
	int user;
	int i;
	int op1;
	int a;
	Scanner tl = new Scanner(System.in);
	String compararU, comprarCo;
	String[] users = null;
	String[] password = null;

	public void diMenu() {

		System.out.println("Menu");
		System.out.println("1.-Agregar Usuario y Contrasena.");
		System.out.println("2.-Actualizar Usuario / Password");
		System.out.println("3.-Loggin");
		System.out.println("4.-Salir");
	}

	public int pedirOpcion() {

		System.out.println("¿Qué opción elijes?");
		Scanner tl = new Scanner(System.in);
		int op1 = tl.nextInt();

		return op1;

	}

	public void cuantosUsuarios(int op) {
		users = new String[op];
		password = new String[op];
		for (i = 0; i < user; i++) {
			System.out.println("Ingresa nombre de usuario " + (i + 1));
			users[i] = tl.next();
			System.out.println("Ingresa la contraseña del usuario: ");
			password[i] = tl.next();

		}
	}

	public void actualizarUsuario() {

		System.out.println("¿Que usuario/contraseña requiere actualizar?: ");
		for (i = 0; i < users.length; i++) {
			System.out.println((i + 1) + ".-" + users[i]);
		}

	}

	public void login() {

		/*
		 * System.out.println("Ingresa tu usuario: "); compararU = tl.next();
		 * System.out.println("Ingresa tu password: "); comprarCo = tl.next();
		 */
		for (a = 0; a < users.length; a++) {
			if (compararU.equals(users[a])) {
				if (comprarCo.equals(password[a])) {
					System.out.println("Acceso Exitoso");
					a = users.length;
				} else {
					System.out.println("usuario u contraseña Incorrecto");
				}
			} else {
				System.out.println("usuario/contraseña incorrecto");
			}
			System.out.println("Ciclo for");

		}

	}

	public void salir() {

		op1 = 4;
		System.out.println("Fin del menu");

	}

}
