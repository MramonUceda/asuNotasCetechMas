package mx.com.Cetech.Clase9.TemaHerencia;

public class TemaHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona = new Persona();
		persona.nombre = "Mario Laberto";
		persona.domicilio = "Jose espeinoza";
		persona.edad = 789;
		persona.curp = "aoejdbfij";
		Empleado uno = new Empleado();
		uno.curp = "jhdbfkb47y58";
		uno.domicilio = "Jose espinoza";
		uno.edad = 78;
		uno.idEmpeado = 13663;
		uno.nombre = "Marco";
		uno.rango = "Op";
		uno.sueldo = 10000;
		EmpleadoAdministrativo emAdmin = new EmpleadoAdministrativo();
		emAdmin.correo = "skhbd@gmail.com";
		emAdmin.Cubiculo = 123;
		emAdmin.curp = "jdnbfvkjabv";
		emAdmin.domicilio = " Jose askfjb";
		emAdmin.edad = 34;
		emAdmin.extension = 229;
		emAdmin.idEmpeado = 13663;
		emAdmin.nombre = "Mario";
		emAdmin.rango = "Director";
		emAdmin.sueldo = 50000;
		EmpleadoOperativo empOper = new EmpleadoOperativo();
		empOper.idCasillero = 1556;
		empOper.idMaquina = 12445;
		empOper.nombre = "Juan";
		
		System.out.println(persona.nombre);
		System.out.println(uno.nombre);
		System.out.println(emAdmin.nombre);
		System.out.println(empOper.nombre);
		
	}

}
