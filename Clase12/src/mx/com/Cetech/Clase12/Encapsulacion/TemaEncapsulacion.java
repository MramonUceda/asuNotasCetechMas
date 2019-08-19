package mx.com.Cetech.Clase12.Encapsulacion;

public class TemaEncapsulacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona = new Persona();
		persona.setEdad(45);
		persona.getEdad();
		persona.setNombre("Mario");
		System.out.println(persona.getNombre());
		
		Persona persona1 = new Persona("Mario", 12, 23.2f, 1.87f, "Jose espinoza");
	}

}
