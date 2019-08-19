package mx.com.Cetech.Clase8.TemaString;

public class TemaString {

	public static void main(String[] args) {
		/*
		 * String es una clase de java que tiene metodos
		 */
		
		String str = "Mario";
		//Despues de str ponemos punto y apareceran los metodos de la clase String
		// metodo length regresa el tamaño de la cadena
		System.out.println("Tamaño del String" + str.length());
		// Metodo que te muestra la posicion en que inicia lo que estas buscando
		String nombre = "Mario Alberto Ramon Uceda";
		int posicion = nombre.indexOf("Alberto");
		System.out.println("Posicion " + posicion);
		
		//Cambiar Caracteres
		
		String nuevoNombre = nombre.replace('a', 'z');
		System.out.println("Cambio de caracter:\n" + nuevoNombre );
		
		// Cambiar String "completo"
		
		//nuevoNombre = nombre.replaceAll("Mario", "Jose");
		String nombreCambiar = nombre.replaceAll("Mario", "Jose");
		System.out.println("Cambio de String:\n" + nuevoNombre);
		
		System.out.println("+++++++++++++++++++++++++++++++++++");
		//Cambia a Minusculas 
		String escuela = "CETECH";
		System.out.println("Cambia mayusculas a minusculas\n" + escuela.toLowerCase());
		//Cambia a mayusculas
		String mayuscula = "mexico";
		System.out.println("Cambia las minusculas por mayusculas \n" + mayuscula.toUpperCase());
		//comparar 
		System.out.println("*************************");
		System.out.println("Son iguales" + escuela.compareTo("mat"));
		System.out.println("++++++++++++++++++++++++++++++++++");
		// comprar
		System.out.println("Son iguales" + escuela.compareTo(nombre));
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
		//Elimina espacios en blanco que puedan venir de la base de datos o de lo que sea
		String cadena = "Mario         ";
		
		System.out.println("Cadena: " + cadena + " Fin de cadena.");
		System.out.println("Cadena: " + cadena.trim() + " Fin de cadena.");
		
		
		//Obtener rango de cadena
		String nombreCompleto = "Mario Alberto Ramon Uceda";
		System.out.println("Usando SubString " + nombreCompleto.substring(14, 19));
		
		
		System.out.println("+++++++++++++++++++++++++++");
		String fecha = "2017-07-15";
		
		String fechaCompleto [] = fecha.split("-");
		System.out.println("Fecha sin for " + fechaCompleto[2]);
		for(int i=0; i< fechaCompleto.length;i++){
			System.out.println(fechaCompleto[i]);
		}
		
		for(String aux:fechaCompleto){
			System.out.println("Imprmir fecha con un foreach " + aux);
		}
		
		
		
		

	}

}
