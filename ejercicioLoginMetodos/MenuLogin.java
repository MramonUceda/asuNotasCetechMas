package mx.com.cetech.clase6.ejercicioLoginMetodos;

public class MenuLogin {
	
	int opcion=0;
	int numUsuarios, opc;
	String pass, actPass;
	String nomUsuario;
	String[] usuarios = null;
	String[] password = null;
	
	MetodosMenuLogin metodos = new MetodosMenuLogin();
	
	public void menu (){
		do {
			System.out.println("-------------------------------");
			System.out.println("------  MENU ------------------");
			System.out.println("1.- Agregar Usuarios / Password");
			System.out.println("2.- Actualizar usuario / Constraseña");
			System.out.println("3.- Login");
			System.out.println("4.- Salir");
			System.out.println("-------------------------------");
			System.out.println("Ingrese una opcion:");
			int opcSeleccionada = metodos.leerDatosInt();

			switch (opcSeleccionada) {
			case 1:
				metodos.addUserPass();
				break;
			case 2:
				metodos.updateUserPass();
				break;
			case 3:
				metodos.login();
				break;
			case 4:
				metodos.cerrarPrograma();
				break;
			default:
				metodos.opcionIncorrecta();
				break;
			}
		} while (opcion <= 4);
	}
}
