package mx.com.cetech.clase7.TareaArrayListLogin;

import java.util.Scanner;

public class MetodosMenuLogin {
	String[] usuarios = null;
	String[] password = null;
	String nomUsuario;
	String pass, actPass;
	private Scanner sc;

	public int leerDatosInt() {
		sc = new Scanner(System.in);
		int leer = sc.nextInt();
		return leer;
	}

	public String leerDatosString() {
		sc = new Scanner(System.in);
		String leer = sc.next();
		return leer;
	}

	public void addUserPass() {
		System.out.println("¿Cuantos usuarios ingresaras?");
		int numUsuarios = leerDatosInt();
		usuarios = new String[numUsuarios];
		password = new String[numUsuarios];
		for (int i = 0; i < numUsuarios; i++) {
			System.out.println("Ingresa el usuario " + (i + 1));
			usuarios[i] = leerDatosString();
			System.out.println("Ingresa sus contraseñas: ");
			password[i] = leerDatosString();
		}
	}

	public void updateUserPass() {
		System.out.println("**************************");
		System.out.println("Lista de Usuarios");
		int i = 1;
		if (usuarios != null) {
			for (String usu : usuarios) {
				System.out.println((i++) + " - " + usu);
			}
			System.out.println("¿Que usuario va actualizar su contraseña?");
			actPass = leerDatosString();
			for (int w = 0; w < usuarios.length; w++) {
				if (actPass.equals(usuarios[w])) {
					System.out.println("Ingrese nuevo usuario");
					usuarios[w] = leerDatosString();
					System.out.println("Ingrese nueva contraseña");
					password[w] = leerDatosString();
					System.out.println("Nuevo usuario: " + usuarios[w]);
					System.out.println("Nuevo contraseña: " + password[w]);
					w = 5;
				} else {
					System.err.println("Error al actualizar");
				}
			}
		} else {
			System.out.println("No hay usuarios");
		}

	}

	public void login() {
		System.out.println("***************************");
		System.out.println("Ingrese su usuario");
		nomUsuario = leerDatosString();
		System.out.println("Ingrese su password");
		pass = leerDatosString();
		for (int i1 = 0; i1 < usuarios.length; i1++) {
			if (nomUsuario.equals(usuarios[i1]) && pass.equals(password[i1])) {
				System.out.println("Bienvenido!!");
				break;
			} else {
				System.err.println("Usuario y/o contraseña incorrecta");
			}
		}
	}

	public void cerrarPrograma() {
		System.out.println("Adios fin de programa");
	}

	public void opcionIncorrecta() {
		System.out.println("La opcion seleccionada es incorrecta");
	}

}
