package mx.com.Cetech.clase2.variables;

public class ejercicioNombre {

	public static void main(String[] args) {
		System.out.println("Hola");
		String nombre = "Mario";
		System.out.println(nombre);
		String paterno = "Ramon";
		String materno = "Uceda";
		System.out.println(nombre + " " + paterno + " "+ materno);
		String nombreCompleto = nombre + paterno + materno;
		System.out.println(nombreCompleto);
		String nombre2 = "Manolo";
		String  paterno2 = "Gonzalez";
		String  materno2 = "Lopez";
		nombreCompleto = nombre2 + paterno2 + materno2;
		System.out.println(nombreCompleto);
		nombre = "David";
		paterno = "Lopez";
		materno = "Lopez";
		nombreCompleto = nombre + paterno + materno;
		System.out.println(nombreCompleto);

		
	}

}
