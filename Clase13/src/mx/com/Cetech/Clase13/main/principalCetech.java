package mx.com.Cetech.Clase13.main;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import mx.com.Cetech.Clase13.Bean.Persona;
import mx.com.Cetech.Clase13.Dao.ConsultaPersonaDao;

public class principalCetech {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsultaPersonaDao consultaPersona = new ConsultaPersonaDao();
		Scanner tl = new Scanner(System.in);
		int teclado;
		String nombreBuscar;
		System.out.println("Bienvenido a mi Directorio.");
		System.out.println("1.-ver personas");
		System.out.println("2.- buscar personas");
		System.out.println("3.-editar");
		System.out.println("4.-eliminar");
		System.out.println("5.-agregar");
		teclado = tl.nextInt();
		
		switch (teclado) {
		case 1:
			Map<String, String> mapPersona = consultaPersona.getAllPersona();
			for(Map.Entry<String, String> aux:mapPersona.entrySet()){
				System.out.println(aux.getKey() + "/" + aux.getValue());
				
			}
			break;
		case 2:
			System.out.println("Ingresa el nombre de la penas que quieres buscar: ");
			nombreBuscar = tl.next();
			ArrayList<Persona> listaPersonas = consultaPersona.getPersona(nombreBuscar);
			System.out.println(listaPersonas.isEmpty()?"Sin registros.":"");
			
			for(Persona aux:listaPersonas){
				System.out.println(aux.getNombre() + aux.getCelular());
			}
			break;
			
		case 3:
			System.out.println("Ingresa el nombre a editar");
			String nombreEditar = tl.next();
			System.out.println("Apellido paterno a editar");
			String apellidoPaternoBuscar = tl.next();
			Persona nuevaPersona = new Persona();
			System.out.println("Ingresa el nuevo nombre de la persona");
			nuevaPersona.setNombre(tl.next());
			System.out.println("Ingresa el apellido paterno de la persona");
			nuevaPersona.setPaterno(tl.next());
			System.out.println("Ingresa el apellido materno de la persona");
			nuevaPersona.setMaterno(tl.next());
			System.out.println("Ingresa el genero");
			nuevaPersona.setGenero(tl.next());
			System.out.println("Ingresa el celular");
			nuevaPersona.setCelular(tl.next());
			System.out.println("Ingresa la fecha de nacimiento");
			nuevaPersona.setFechaDeNacimiento(tl.next());
			System.out.println(consultaPersona.editPersona(nuevaPersona, nombreEditar, apellidoPaternoBuscar));
			
			break;
			
		case 4:
			
			break;
			
		case 5:
			
			break;

		default:
			break;
		}
		
	}

}
