package mx.com.Cetech.clase2.estructuraFor;

public class OperadorTernario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isGenero = true;
		String cadenaGenero;
		if (isGenero) {
			cadenaGenero = "masculino";
		} else {
			cadenaGenero = "femenino";
		}
		System.out.println("El genero de la persona es "+ cadenaGenero);
		
		//Operador ternario:
		
		System.out.println("El genero de la persona es " + ((isGenero)? "masculino":"femenino"));
		
		/*
		 * El signo de "?" es un if
		 * Estructura o sitaxis
		 * (condición)? "Si se cumople valor":"Si no se cumple valor";
		 */
		
		System.out.println("******************************************************************************");
		int tipoUsuario = 4; // El 1 es alumno, el 2 es maestro, el 3 director
		String tipoUsuarioCadena = (tipoUsuario == 1)?"Alumno":(tipoUsuario == 2 ? "Maestro":tipoUsuario == 3 ? "Director":"No existe este usuario");
		System.out.println(tipoUsuarioCadena);
		System.out.println("********************************************************************************************");
		
		if(tipoUsuario == 1){
			tipoUsuarioCadena = "Alumno";
		}else{
			if(tipoUsuario == 2){
				tipoUsuarioCadena = "Maestro";
			}else{
				if(tipoUsuario == 3){
					tipoUsuarioCadena = "Director";
				}else{
					System.out.println("NO existe");
				}
			}
		}
		
		
		

	}
	
}

