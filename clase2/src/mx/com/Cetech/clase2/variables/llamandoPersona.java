package mx.com.Cetech.clase2.variables;

public class llamandoPersona {

	public static void main(String[] args) {

		//Estrucutra de una instancia de una clase, con una instancia ocupamos el codigo de otra clase
		/*
		 * NombreClase nombreVariableInstancia = new NombreClase();
		 */
		persona personaUno = new persona();
		personaUno.nombreCompleto = "Mario";
		personaUno.direccion = "Av. Revolucion.";
		personaUno.edad = 23;
		personaUno.nacionalidad = "Mexicana.";
		personaUno.peso = 78.6f;
		personaUno.sexo = 'm';
		
		System.out.println(personaUno.nombreCompleto);
		System.out.println(personaUno.direccion);
		System.out.println(personaUno.edad);
		System.out.println(personaUno.nacionalidad);
		System.out.println(personaUno.peso);
		System.out.println(personaUno.sexo);



		
		persona personaDos = new persona();
		personaDos.nombreCompleto = "Luna, ";
		personaDos.direccion = "Quien sabe, ni uber pasa ahí.\n";
		personaDos.edad = 30 ;
		personaDos.nacionalidad = "Mexicana.";
		personaDos.peso = 78.6f;
		personaDos.sexo = 'f';
		
		System.out.println(personaDos.nombreCompleto + personaDos.direccion + personaDos.edad + personaDos.nacionalidad + personaDos.peso + personaDos.sexo);
		
	}

}
