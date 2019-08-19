package mx.com.Cetech.Clase12.Encapsulacion;

public class EncapsulacionAlumno {
	public static void main(String[] args) {
		Alumno alumno = new Alumno("Mario", "Ramon", "Ing.Sistemas", 846, 205);
		System.out.println(alumno.getMatricula());
	}
	
}
